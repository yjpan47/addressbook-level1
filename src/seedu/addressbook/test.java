package seedu.addressbook;

import java.util.Scanner;

public class test {

    public static boolean isValid(String name) {
        for (int i =-1; i < name.length() - 1; i++) {
            if (i == -1 || name.charAt(i) == ' ') {
                if (Character.isLowerCase(name.charAt(i+1))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isPersonPhoneValid(String phone) {
        // phone nonempty sequence of digits or +, (, )
        phone.replace("(", "");
        phone.replace("}", "");
        phone.replace("+", "");
        return phone.matches("\\d+");
        //TODO: implement a more permissive validation
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(isPersonPhoneValid(s));
        }
    }

}
