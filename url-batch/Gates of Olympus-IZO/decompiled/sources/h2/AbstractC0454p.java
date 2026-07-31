package h2;

import e2.AbstractC0381e;

/* renamed from: h2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0454p extends AbstractC0453o {
    public static boolean c0(String str, String str2, boolean z3) {
        Z1.i.f(str, "<this>");
        Z1.i.f(str2, "suffix");
        return !z3 ? str.endsWith(str2) : f0(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static boolean d0(String str, String str2, boolean z3) {
        return str == null ? str2 == null : !z3 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final void e0(String str) {
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static boolean f0(String str, int i3, String str2, int i4, int i5, boolean z3) {
        Z1.i.f(str, "<this>");
        Z1.i.f(str2, "other");
        return !z3 ? str.regionMatches(i3, str2, i4, i5) : str.regionMatches(z3, i3, str2, i4, i5);
    }

    public static String g0(String str, String str2, String str3) {
        Z1.i.f(str, "<this>");
        int p02 = AbstractC0447i.p0(str, str2, 0, false);
        if (p02 < 0) {
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
            sb.append((CharSequence) str, i4, p02);
            sb.append(str3);
            i4 = p02 + length;
            if (p02 >= str.length()) {
                break;
            }
            p02 = AbstractC0447i.p0(str, str2, p02 + i3, false);
        } while (p02 > 0);
        sb.append((CharSequence) str, i4, str.length());
        String sb2 = sb.toString();
        Z1.i.e(sb2, "toString(...)");
        return sb2;
    }

    public static boolean h0(String str, String str2, int i3, boolean z3) {
        Z1.i.f(str, "<this>");
        return !z3 ? str.startsWith(str2, i3) : f0(str, i3, str2, 0, str2.length(), z3);
    }

    public static boolean i0(String str, String str2) {
        Z1.i.f(str, "<this>");
        Z1.i.f(str2, "prefix");
        return str.startsWith(str2);
    }

    public static Integer j0(String str) {
        boolean z3;
        int i3;
        int i4;
        Z1.i.f(str, "<this>");
        AbstractC0381e.m(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char charAt = str.charAt(0);
        int i6 = -2147483647;
        if (Z1.i.g(charAt, 48) < 0) {
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
}
