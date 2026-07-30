package cn.hutool.core.util;

/* loaded from: classes.dex */
public class k {
    public static int digit16(int i8) {
        return Character.digit(i8, 16);
    }

    public static boolean equals(char c8, char c9, boolean z7) {
        return z7 ? Character.toLowerCase(c8) == Character.toLowerCase(c9) : c8 == c9;
    }

    public static int getType(int i8) {
        return Character.getType(i8);
    }

    public static boolean isAscii(char c8) {
        return c8 < 128;
    }

    public static boolean isAsciiControl(char c8) {
        return c8 < ' ' || c8 == 127;
    }

    public static boolean isAsciiPrintable(char c8) {
        return c8 >= ' ' && c8 < 127;
    }

    public static boolean isBlankChar(char c8) {
        return isBlankChar((int) c8);
    }

    public static boolean isChar(Object obj) {
        return (obj instanceof Character) || obj.getClass() == Character.TYPE;
    }

    public static boolean isCharClass(Class<?> cls) {
        return cls == Character.class || cls == Character.TYPE;
    }

    public static boolean isEmoji(char c8) {
        return !(c8 == 0 || c8 == '\t' || c8 == '\n' || c8 == '\r' || (c8 >= ' ' && c8 <= 55295) || ((c8 >= 57344 && c8 <= 65533) || (c8 >= 0 && c8 <= 65535)));
    }

    public static boolean isFileSeparator(char c8) {
        return '/' == c8 || '\\' == c8;
    }

    public static boolean isHexChar(char c8) {
        return isNumber(c8) || (c8 >= 'a' && c8 <= 'f') || (c8 >= 'A' && c8 <= 'F');
    }

    public static boolean isLetter(char c8) {
        return isLetterUpper(c8) || isLetterLower(c8);
    }

    public static boolean isLetterLower(char c8) {
        return c8 >= 'a' && c8 <= 'z';
    }

    public static boolean isLetterOrNumber(char c8) {
        return isLetter(c8) || isNumber(c8);
    }

    public static boolean isLetterUpper(char c8) {
        return c8 >= 'A' && c8 <= 'Z';
    }

    public static boolean isNumber(char c8) {
        return c8 >= '0' && c8 <= '9';
    }

    public static char toCloseByNumber(int i8) {
        if (i8 <= 20) {
            return (char) (i8 + 9311);
        }
        throw new IllegalArgumentException("Number must be [1-20]");
    }

    public static char toCloseChar(char c8) {
        int i8;
        if (c8 >= '1' && c8 <= '9') {
            i8 = c8 + 9263;
        } else if (c8 < 'A' || c8 > 'Z') {
            i8 = c8;
            if (c8 >= 'a') {
                i8 = c8;
                if (c8 <= 'z') {
                    i8 = c8 + 9327;
                }
            }
        } else {
            i8 = c8 + 9333;
        }
        return (char) i8;
    }

    public static String toString(char c8) {
        return cn.hutool.core.text.a.toString(c8);
    }

    public static boolean isBlankChar(int i8) {
        return Character.isWhitespace(i8) || Character.isSpaceChar(i8) || i8 == 65279 || i8 == 8234 || i8 == 0 || i8 == 12644 || i8 == 10240 || i8 == 6158;
    }
}
