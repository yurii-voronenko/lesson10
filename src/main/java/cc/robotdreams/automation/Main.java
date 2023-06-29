package cc.robotdreams.automation; // small letters only

import cc.robotdreams.automation.sub.Floor;

public class Main // CamelCase
{
    int intVariable = 0; // field / parameter name - camelCase from small letter

    public static void main(String[] args) { // method name - camelCase from small letter
        //System.out.println(ClassExample.changableVariable);
        //ClassExample.changableVariable = "New value";
        //System.out.println(ClassExample.changableVariable);
        //System.out.println(ClassExample.MY_CONSTANT);

        //ClassExample.finalPublicString;
        //System.out.println("Enter");
        ClassExample object = new ClassExample("Some name");
        //System.out.println(object.getModifiedName());

        ClassExample object2 = new ClassExample("Some name 2");
        //System.out.println(object2.getModifiedName());

        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);

        floor1.books.add("Java Tutorial");
        floor2.books.add("Python Tutorial");

        System.out.println(floor1.books);
        System.out.println(floor2.books);

    }
}