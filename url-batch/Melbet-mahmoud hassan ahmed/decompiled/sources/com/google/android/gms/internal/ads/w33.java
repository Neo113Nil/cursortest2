package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class w33 {
    public static String a(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            if (e(str.charAt(i7))) {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c7 = charArray[i7];
                    if (e(c7)) {
                        charArray[i7] = (char) (c7 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static String b(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            if (d(str.charAt(i7))) {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c7 = charArray[i7];
                    if (d(c7)) {
                        charArray[i7] = (char) (c7 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static boolean c(CharSequence charSequence, CharSequence charSequence2) {
        int f7;
        int length = "content-length".length();
        if (charSequence2 == "content-length") {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = "content-length".charAt(i7);
            char charAt2 = charSequence2.charAt(i7);
            if (charAt != charAt2 && ((f7 = f(charAt)) >= 26 || f7 != f(charAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(char c7) {
        return c7 >= 'a' && c7 <= 'z';
    }

    public static boolean e(char c7) {
        return c7 >= 'A' && c7 <= 'Z';
    }

    private static int f(char c7) {
        return (char) ((c7 | ' ') - 97);
    }
}
