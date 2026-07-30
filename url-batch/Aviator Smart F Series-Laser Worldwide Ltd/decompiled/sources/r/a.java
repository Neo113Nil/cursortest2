package r;

import cn.hutool.core.io.file.c;
import cn.hutool.core.text.l;
import cn.hutool.core.util.d0;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Stack;

/* loaded from: classes.dex */
public class a {
    private final Stack<String> postfixStack = new Stack<>();
    private final int[] operatPriority = {0, 3, 2, 1, -1, 1, 0, 2};

    private boolean compare(char c8, char c9) {
        if (c8 == '%') {
            c8 = c.UNIX_SEPARATOR;
        }
        if (c9 == '%') {
            c9 = c.UNIX_SEPARATOR;
        }
        int[] iArr = this.operatPriority;
        return iArr[c9 + 65496] >= iArr[c8 + 65496];
    }

    public static double conversion(String str) {
        return new a().calculate(str);
    }

    private boolean isOperator(char c8) {
        return c8 == '+' || c8 == '-' || c8 == '*' || c8 == '/' || c8 == '(' || c8 == ')' || c8 == '%';
    }

    private void prepare(String str) {
        Stack stack = new Stack();
        stack.push(',');
        char[] charArray = str.toCharArray();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < charArray.length; i10++) {
            char c8 = charArray[i10];
            if (isOperator(c8)) {
                if (i8 > 0) {
                    this.postfixStack.push(new String(charArray, i9, i8));
                }
                if (c8 == ')') {
                    while (((Character) stack.peek()).charValue() != '(') {
                        this.postfixStack.push(String.valueOf(stack.pop()));
                    }
                    stack.pop();
                } else {
                    for (char charValue = ((Character) stack.peek()).charValue(); c8 != '(' && charValue != ',' && compare(c8, charValue); charValue = ((Character) stack.peek()).charValue()) {
                        this.postfixStack.push(String.valueOf(stack.pop()));
                    }
                    stack.push(Character.valueOf(c8));
                }
                i9 = i10 + 1;
                i8 = 0;
            } else {
                i8++;
            }
        }
        if (i8 > 1 || (i8 == 1 && !isOperator(charArray[i9]))) {
            this.postfixStack.push(new String(charArray, i9, i8));
        }
        while (((Character) stack.peek()).charValue() != ',') {
            this.postfixStack.push(String.valueOf(stack.pop()));
        }
    }

    private static String transform(String str) {
        char[] charArray = l.removeSuffix(l.cleanBlank(str), "=").toCharArray();
        for (int i8 = 0; i8 < charArray.length; i8++) {
            if (charArray[i8] == '-') {
                if (i8 == 0) {
                    charArray[i8] = '~';
                } else {
                    char c8 = charArray[i8 - 1];
                    if (c8 == '+' || c8 == '-' || c8 == '*' || c8 == '/' || c8 == '(' || c8 == 'E' || c8 == 'e') {
                        charArray[i8] = '~';
                    }
                }
            }
        }
        if (charArray[0] != '~' || charArray.length <= 1 || charArray[1] != '(') {
            return new String(charArray);
        }
        charArray[0] = '-';
        return "0" + new String(charArray);
    }

    public double calculate(String str) {
        prepare(transform(str));
        Stack stack = new Stack();
        Collections.reverse(this.postfixStack);
        while (!this.postfixStack.isEmpty()) {
            String pop = this.postfixStack.pop();
            if (isOperator(pop.charAt(0))) {
                stack.push(calculate(((String) stack.pop()).replace("~", "-"), ((String) stack.pop()).replace("~", "-"), pop.charAt(0)).toString());
            } else {
                stack.push(pop.replace("~", "-"));
            }
        }
        return d0.mul((String[]) stack.toArray(new String[0])).doubleValue();
    }

    private BigDecimal calculate(String str, String str2, char c8) {
        if (c8 == '%') {
            return d0.toBigDecimal(str).remainder(d0.toBigDecimal(str2));
        }
        if (c8 == '-') {
            return d0.sub(str, str2);
        }
        if (c8 == '/') {
            return d0.div(str, str2);
        }
        if (c8 == '*') {
            return d0.mul(str, str2);
        }
        if (c8 == '+') {
            return d0.add(str, str2);
        }
        throw new IllegalStateException("Unexpected value: " + c8);
    }
}
