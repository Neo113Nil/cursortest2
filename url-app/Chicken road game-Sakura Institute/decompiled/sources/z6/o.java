package z6;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class o extends n {
    public static boolean o(boolean z8, String str, String str2) {
        r6.k.f(str, "<this>");
        r6.k.f(str2, "suffix");
        return !z8 ? str.endsWith(str2) : r(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static boolean p(boolean z8, String str, String str2) {
        return str == null ? str2 == null : !z8 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final void q(String str) {
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static boolean r(String str, int i7, String str2, int i8, int i9, boolean z8) {
        r6.k.f(str, "<this>");
        r6.k.f(str2, "other");
        return !z8 ? str.regionMatches(i7, str2, i8, i9) : str.regionMatches(z8, i7, str2, i8, i9);
    }

    public static String s(String str, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i7 + '.').toString());
        }
        if (i7 == 0) {
            return "";
        }
        int i8 = 1;
        if (i7 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = str.charAt(0);
            char[] cArr = new char[i7];
            for (int i9 = 0; i9 < i7; i9++) {
                cArr[i9] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i7);
        if (1 <= i7) {
            while (true) {
                sb.append((CharSequence) str);
                if (i8 == i7) {
                    break;
                }
                i8++;
            }
        }
        String sb2 = sb.toString();
        r6.k.c(sb2);
        return sb2;
    }

    public static String t(String str, String str2, String str3) {
        r6.k.f(str, "<this>");
        int C = h.C(str, str2, 0, false);
        if (C < 0) {
            return str;
        }
        int length = str2.length();
        int i7 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i8 = 0;
        do {
            sb.append((CharSequence) str, i8, C);
            sb.append(str3);
            i8 = C + length;
            if (C >= str.length()) {
                break;
            }
            C = h.C(str, str2, C + i7, false);
        } while (C > 0);
        sb.append((CharSequence) str, i8, str.length());
        String sb2 = sb.toString();
        r6.k.e(sb2, "toString(...)");
        return sb2;
    }

    public static boolean u(String str, String str2, int i7, boolean z8) {
        r6.k.f(str, "<this>");
        return !z8 ? str.startsWith(str2, i7) : r(str, i7, str2, 0, str2.length(), z8);
    }

    public static boolean v(String str, String str2) {
        r6.k.f(str, "<this>");
        r6.k.f(str2, "prefix");
        return str.startsWith(str2);
    }

    public static Integer w(String str) {
        boolean z8;
        int i7;
        int i8;
        r6.k.f(str, "<this>");
        v1.g.b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char charAt = str.charAt(0);
        int i10 = -2147483647;
        if (r6.k.g(charAt, 48) < 0) {
            i7 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z8 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i10 = Integer.MIN_VALUE;
                z8 = true;
            }
        } else {
            z8 = false;
            i7 = 0;
        }
        int i11 = -59652323;
        while (i7 < length) {
            int digit = Character.digit((int) str.charAt(i7), 10);
            if (digit < 0) {
                return null;
            }
            if ((i9 < i11 && (i11 != -59652323 || i9 < (i11 = i10 / 10))) || (i8 = i9 * 10) < i10 + digit) {
                return null;
            }
            i9 = i8 - digit;
            i7++;
        }
        return z8 ? Integer.valueOf(i9) : Integer.valueOf(-i9);
    }
}
