package y6;

import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class j extends i {
    public static boolean a0(String str, String str2) {
        return c0(str, str2, 0, false) >= 0;
    }

    public static final int b0(CharSequence charSequence) {
        q6.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int c0(String str, String str2, int i, boolean z3) {
        String str3;
        String str4;
        boolean z7;
        boolean regionMatches;
        q6.i.e(str, "<this>");
        q6.i.e(str2, "string");
        if (!z3) {
            return str.indexOf(str2, i);
        }
        int length = str.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        int i8 = new v6.d(i, length, 1).f7493e;
        if (i > i8) {
            return -1;
        }
        int i9 = i;
        while (true) {
            int length3 = str2.length();
            if (z3) {
                str3 = str;
                str4 = str2;
                z7 = z3;
                regionMatches = str4.regionMatches(z7, 0, str3, i9, length3);
            } else {
                regionMatches = str2.regionMatches(0, str, i9, length3);
                str3 = str;
                str4 = str2;
                z7 = z3;
            }
            if (regionMatches) {
                return i9;
            }
            if (i9 == i8) {
                return -1;
            }
            i9++;
            str2 = str4;
            z3 = z7;
            str = str3;
        }
    }

    public static int d0(CharSequence charSequence, char c8, int i, int i8) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        q6.i.e(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c8, i);
        }
        char[] cArr = {c8};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int b02 = b0(charSequence);
        if (i > b02) {
            return -1;
        }
        while (cArr[0] != charSequence.charAt(i)) {
            if (i == b02) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public static boolean e0(CharSequence charSequence) {
        q6.i.e(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!o.X(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String f0(String str, String str2, String str3) {
        q6.i.e(str, "<this>");
        int c02 = c0(str, str2, 0, false);
        if (c02 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i8 = 0;
        do {
            sb.append((CharSequence) str, i8, c02);
            sb.append(str3);
            i8 = c02 + length;
            if (c02 >= str.length()) {
                break;
            }
            c02 = c0(str, str2, c02 + i, false);
        } while (c02 > 0);
        sb.append((CharSequence) str, i8, str.length());
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }

    public static String g0(String str, String str2) {
        q6.i.e(str2, "delimiter");
        int c02 = c0(str, str2, 0, false);
        if (c02 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + c02, str.length());
        q6.i.d(substring, "substring(...)");
        return substring;
    }
}
