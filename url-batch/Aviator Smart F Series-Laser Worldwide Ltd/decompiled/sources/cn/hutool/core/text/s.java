package cn.hutool.core.text;

import cn.hutool.core.util.z;

/* loaded from: classes.dex */
public class s {
    public static String toString(String str) {
        if (l.isBlank(str)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i8 = 0;
        while (true) {
            int indexOfIgnoreCase = l.indexOfIgnoreCase(str, "\\u", i8);
            if (indexOfIgnoreCase == -1) {
                break;
            }
            sb.append((CharSequence) str, i8, indexOfIgnoreCase);
            if (indexOfIgnoreCase + 5 >= length) {
                i8 = indexOfIgnoreCase;
                break;
            }
            i8 = indexOfIgnoreCase + 2;
            int i9 = indexOfIgnoreCase + 6;
            try {
                sb.append((char) Integer.parseInt(str.substring(i8, i9), 16));
                i8 = i9;
            } catch (NumberFormatException unused) {
                sb.append((CharSequence) str, indexOfIgnoreCase, i8);
            }
        }
        if (i8 < length) {
            sb.append((CharSequence) str, i8, length);
        }
        return sb.toString();
    }

    public static String toUnicode(char c8) {
        return z.toUnicodeHex(c8);
    }

    public static String toUnicode(int i8) {
        return z.toUnicodeHex(i8);
    }

    public static String toUnicode(String str) {
        return toUnicode(str, true);
    }

    public static String toUnicode(String str, boolean z7) {
        if (l.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(str.length() * 6);
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if (z7 && cn.hutool.core.util.k.isAsciiPrintable(charAt)) {
                sb.append(charAt);
            } else {
                sb.append(z.toUnicodeHex(charAt));
            }
        }
        return sb.toString();
    }
}
