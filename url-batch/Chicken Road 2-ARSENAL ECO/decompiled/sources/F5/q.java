package F5;

import m1.AbstractC0521b;

/* loaded from: classes.dex */
public abstract class q extends p {
    public static boolean B(String str, String suffix) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(suffix, "suffix");
        return str.endsWith(suffix);
    }

    public static boolean C(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final void D(String str) {
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static boolean E(int i7, int i8, int i9, String str, String other, boolean z5) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        return !z5 ? str.regionMatches(i7, other, i8, i9) : str.regionMatches(z5, i7, other, i8, i9);
    }

    public static String F(String str, char c7, char c8) {
        kotlin.jvm.internal.i.e(str, "<this>");
        String replace = str.replace(c7, c8);
        kotlin.jvm.internal.i.d(replace, "replace(...)");
        return replace;
    }

    public static String G(String str, String str2, String newValue) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(newValue, "newValue");
        int P6 = j.P(str, str2, 0, false);
        if (P6 < 0) {
            return str;
        }
        int length = str2.length();
        int i7 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i8 = 0;
        do {
            sb.append((CharSequence) str, i8, P6);
            sb.append(newValue);
            i8 = P6 + length;
            if (P6 >= str.length()) {
                break;
            }
            P6 = j.P(str, str2, P6 + i7, false);
        } while (P6 > 0);
        sb.append((CharSequence) str, i8, str.length());
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean H(String str, int i7, String str2, boolean z5) {
        kotlin.jvm.internal.i.e(str, "<this>");
        return !z5 ? str.startsWith(str2, i7) : E(i7, 0, str2.length(), str, str2, z5);
    }

    public static boolean I(String str, String prefix) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        return str.startsWith(prefix);
    }

    public static Integer J(String str) {
        boolean z5;
        int i7;
        int i8;
        kotlin.jvm.internal.i.e(str, "<this>");
        AbstractC0521b.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char charAt = str.charAt(0);
        int i10 = -2147483647;
        if (kotlin.jvm.internal.i.g(charAt, 48) < 0) {
            i7 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z5 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i10 = Integer.MIN_VALUE;
                z5 = true;
            }
        } else {
            z5 = false;
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
        return z5 ? Integer.valueOf(i9) : Integer.valueOf(-i9);
    }

    public static Long K(String str) {
        boolean z5;
        kotlin.jvm.internal.i.e(str, "<this>");
        AbstractC0521b.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char charAt = str.charAt(0);
        long j4 = -9223372036854775807L;
        if (kotlin.jvm.internal.i.g(charAt, 48) < 0) {
            z5 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z5 = false;
                i7 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j4 = Long.MIN_VALUE;
                i7 = 1;
            }
        } else {
            z5 = false;
        }
        long j7 = 0;
        long j8 = -256204778801521550L;
        while (i7 < length) {
            int digit = Character.digit((int) str.charAt(i7), 10);
            if (digit < 0) {
                return null;
            }
            if (j7 < j8) {
                if (j8 != -256204778801521550L) {
                    return null;
                }
                j8 = j4 / 10;
                if (j7 < j8) {
                    return null;
                }
            }
            long j9 = j7 * 10;
            long j10 = digit;
            if (j9 < j4 + j10) {
                return null;
            }
            j7 = j9 - j10;
            i7++;
        }
        return z5 ? Long.valueOf(j7) : Long.valueOf(-j7);
    }
}
