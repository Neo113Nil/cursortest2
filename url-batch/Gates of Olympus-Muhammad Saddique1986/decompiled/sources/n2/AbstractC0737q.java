package n2;

/* renamed from: n2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0737q extends AbstractC0736p {
    public static Integer A(String str) {
        boolean z3;
        int i3;
        int i4;
        f2.j.f(str, "<this>");
        n.r.i(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char charAt = str.charAt(0);
        int i6 = -2147483647;
        if (f2.j.g(charAt, 48) < 0) {
            i3 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z3 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i6 = Integer.MIN_VALUE;
                z3 = true;
            }
        } else {
            z3 = false;
            i3 = 0;
        }
        int i7 = -59652323;
        while (i3 < length) {
            int digit = Character.digit((int) str.charAt(i3), 10);
            if (digit < 0) {
                return null;
            }
            if ((i5 < i7 && (i7 != -59652323 || i5 < (i7 = i6 / 10))) || (i4 = i5 * 10) < i6 + digit) {
                return null;
            }
            i5 = i4 - digit;
            i3++;
        }
        return z3 ? Integer.valueOf(i5) : Integer.valueOf(-i5);
    }

    public static boolean r(String str, String str2, boolean z3) {
        f2.j.f(str, "<this>");
        f2.j.f(str2, "suffix");
        return !z3 ? str.endsWith(str2) : u(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static boolean s(String str, String str2, boolean z3) {
        return str == null ? str2 == null : !z3 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final void t(String str) {
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static boolean u(String str, int i3, String str2, int i4, int i5, boolean z3) {
        f2.j.f(str, "<this>");
        f2.j.f(str2, "other");
        return !z3 ? str.regionMatches(i3, str2, i4, i5) : str.regionMatches(z3, i3, str2, i4, i5);
    }

    public static String v(String str, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i3 + '.').toString());
        }
        if (i3 == 0) {
            return "";
        }
        int i4 = 1;
        if (i3 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = str.charAt(0);
            char[] cArr = new char[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                cArr[i5] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i3);
        if (1 <= i3) {
            while (true) {
                sb.append((CharSequence) str);
                if (i4 == i3) {
                    break;
                }
                i4++;
            }
        }
        String sb2 = sb.toString();
        f2.j.c(sb2);
        return sb2;
    }

    public static String w(String str, char c2, char c3) {
        f2.j.f(str, "<this>");
        String replace = str.replace(c2, c3);
        f2.j.e(replace, "replace(...)");
        return replace;
    }

    public static String x(String str, String str2, String str3) {
        f2.j.f(str, "<this>");
        int G3 = AbstractC0730j.G(str, str2, 0, false);
        if (G3 < 0) {
            return str;
        }
        int length = str2.length();
        int i3 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i4 = 0;
        do {
            sb.append((CharSequence) str, i4, G3);
            sb.append(str3);
            i4 = G3 + length;
            if (G3 >= str.length()) {
                break;
            }
            G3 = AbstractC0730j.G(str, str2, G3 + i3, false);
        } while (G3 > 0);
        sb.append((CharSequence) str, i4, str.length());
        String sb2 = sb.toString();
        f2.j.e(sb2, "toString(...)");
        return sb2;
    }

    public static boolean y(String str, String str2, int i3, boolean z3) {
        f2.j.f(str, "<this>");
        return !z3 ? str.startsWith(str2, i3) : u(str, i3, str2, 0, str2.length(), z3);
    }

    public static boolean z(String str, String str2) {
        f2.j.f(str, "<this>");
        f2.j.f(str2, "prefix");
        return str.startsWith(str2);
    }
}
