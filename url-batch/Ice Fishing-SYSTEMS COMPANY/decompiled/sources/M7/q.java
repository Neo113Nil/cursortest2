package M7;

import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public abstract class q extends p {
    public static boolean B(String str, String suffix) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(suffix, "suffix");
        return str.endsWith(suffix);
    }

    public static boolean C(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final void D(String str) {
        throw new NumberFormatException(AbstractC5051n.b('\'', "Invalid number format: '", str));
    }

    public static boolean E(int i, int i4, int i9, String str, String other, boolean z8) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(other, "other");
        return !z8 ? str.regionMatches(i, other, i4, i9) : str.regionMatches(z8, i, other, i4, i9);
    }

    public static String F(String str, char c4, char c9) {
        kotlin.jvm.internal.h.e(str, "<this>");
        String replace = str.replace(c4, c9);
        kotlin.jvm.internal.h.d(replace, "replace(...)");
        return replace;
    }

    public static String G(String str, String str2, String newValue) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(newValue, "newValue");
        int P8 = j.P(str, str2, 0, false);
        if (P8 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i4 = 0;
        do {
            sb.append((CharSequence) str, i4, P8);
            sb.append(newValue);
            i4 = P8 + length;
            if (P8 >= str.length()) {
                break;
            }
            P8 = j.P(str, str2, P8 + i, false);
        } while (P8 > 0);
        sb.append((CharSequence) str, i4, str.length());
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean H(String str, int i, String str2, boolean z8) {
        kotlin.jvm.internal.h.e(str, "<this>");
        return !z8 ? str.startsWith(str2, i) : E(i, 0, str2.length(), str, str2, z8);
    }

    public static boolean I(String str, String prefix) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(prefix, "prefix");
        return str.startsWith(prefix);
    }

    public static Integer J(String str) {
        boolean z8;
        int i;
        int i4;
        kotlin.jvm.internal.h.e(str, "<this>");
        p8.g.e(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char charAt = str.charAt(0);
        int i10 = -2147483647;
        if (kotlin.jvm.internal.h.f(charAt, 48) < 0) {
            i = 1;
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
            i = 0;
        }
        int i11 = -59652323;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i9 < i11 && (i11 != -59652323 || i9 < (i11 = i10 / 10))) || (i4 = i9 * 10) < i10 + digit) {
                return null;
            }
            i9 = i4 - digit;
            i++;
        }
        return z8 ? Integer.valueOf(i9) : Integer.valueOf(-i9);
    }

    public static Long K(String str) {
        boolean z8;
        kotlin.jvm.internal.h.e(str, "<this>");
        p8.g.e(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        int f6 = kotlin.jvm.internal.h.f(charAt, 48);
        long j9 = com.anythink.basead.exoplayer.b.f6539b;
        if (f6 < 0) {
            z8 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z8 = false;
                i = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j9 = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z8 = false;
        }
        long j10 = 0;
        long j11 = -256204778801521550L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (j10 < j11) {
                if (j11 != -256204778801521550L) {
                    return null;
                }
                j11 = j9 / 10;
                if (j10 < j11) {
                    return null;
                }
            }
            long j12 = j10 * 10;
            long j13 = digit;
            if (j12 < j9 + j13) {
                return null;
            }
            j10 = j12 - j13;
            i++;
        }
        return z8 ? Long.valueOf(j10) : Long.valueOf(-j10);
    }
}
