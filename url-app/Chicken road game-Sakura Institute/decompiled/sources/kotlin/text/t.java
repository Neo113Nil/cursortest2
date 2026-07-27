package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class t extends s {
    public static final void e(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    public static Integer f(String str) {
        boolean z4;
        int i2;
        int i4;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char charAt = str.charAt(0);
        int i6 = -2147483647;
        if (Intrinsics.e(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z4 = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i6 = Integer.MIN_VALUE;
                z4 = true;
            }
        } else {
            z4 = false;
            i2 = 0;
        }
        int i7 = -59652323;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), 10);
            if (digit < 0) {
                return null;
            }
            if ((i5 < i7 && (i7 != -59652323 || i5 < (i7 = i6 / 10))) || (i4 = i5 * 10) < i6 + digit) {
                return null;
            }
            i5 = i4 - digit;
            i2++;
        }
        return z4 ? Integer.valueOf(i5) : Integer.valueOf(-i5);
    }

    public static Long g(String str) {
        boolean z4;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        long j4 = -9223372036854775807L;
        if (Intrinsics.e(charAt, 48) < 0) {
            z4 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z4 = false;
                i2 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j4 = Long.MIN_VALUE;
                i2 = 1;
            }
        } else {
            z4 = false;
        }
        long j5 = -256204778801521550L;
        long j6 = 0;
        long j7 = -256204778801521550L;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), 10);
            if (digit < 0) {
                return null;
            }
            if (j6 < j7) {
                if (j7 != j5) {
                    return null;
                }
                j7 = j4 / 10;
                if (j6 < j7) {
                    return null;
                }
            }
            long j8 = j6 * 10;
            long j9 = digit;
            if (j8 < j4 + j9) {
                return null;
            }
            j6 = j8 - j9;
            i2++;
            j5 = -256204778801521550L;
        }
        return z4 ? Long.valueOf(j6) : Long.valueOf(-j6);
    }
}
