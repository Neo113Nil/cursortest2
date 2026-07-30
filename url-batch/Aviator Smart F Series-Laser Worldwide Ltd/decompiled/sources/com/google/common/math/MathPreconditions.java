package com.google.common.math;

import com.github.mikephil.charting.utils.i;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@CanIgnoreReturnValue
@GwtCompatible
/* loaded from: classes4.dex */
final class MathPreconditions {
    private MathPreconditions() {
    }

    static void checkInRangeForRoundingInputs(boolean z7, double d8, RoundingMode roundingMode) {
        if (z7) {
            return;
        }
        String valueOf = String.valueOf(roundingMode);
        StringBuilder sb = new StringBuilder(valueOf.length() + 83);
        sb.append("rounded value is out of range for input ");
        sb.append(d8);
        sb.append(" and rounding mode ");
        sb.append(valueOf);
        throw new ArithmeticException(sb.toString());
    }

    static void checkNoOverflow(boolean z7, String str, int i8, int i9) {
        if (z7) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(i8);
        sb.append(", ");
        sb.append(i9);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }

    static int checkNonNegative(String str, int i8) {
        if (i8 >= 0) {
            return i8;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27);
        sb.append(str);
        sb.append(" (");
        sb.append(i8);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    static int checkPositive(String str, int i8) {
        if (i8 > 0) {
            return i8;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append(str);
        sb.append(" (");
        sb.append(i8);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    static void checkRoundingUnnecessary(boolean z7) {
        if (!z7) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    static void checkNoOverflow(boolean z7, String str, long j8, long j9) {
        if (z7) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
        sb.append("overflow: ");
        sb.append(str);
        sb.append("(");
        sb.append(j8);
        sb.append(", ");
        sb.append(j9);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }

    static long checkNonNegative(String str, long j8) {
        if (j8 >= 0) {
            return j8;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
        sb.append(str);
        sb.append(" (");
        sb.append(j8);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    static long checkPositive(String str, long j8) {
        if (j8 > 0) {
            return j8;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
        sb.append(str);
        sb.append(" (");
        sb.append(j8);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    static BigInteger checkNonNegative(String str, BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            return bigInteger;
        }
        String valueOf = String.valueOf(bigInteger);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16 + valueOf.length());
        sb.append(str);
        sb.append(" (");
        sb.append(valueOf);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    static BigInteger checkPositive(String str, BigInteger bigInteger) {
        if (bigInteger.signum() > 0) {
            return bigInteger;
        }
        String valueOf = String.valueOf(bigInteger);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 15 + valueOf.length());
        sb.append(str);
        sb.append(" (");
        sb.append(valueOf);
        sb.append(") must be > 0");
        throw new IllegalArgumentException(sb.toString());
    }

    static double checkNonNegative(String str, double d8) {
        if (d8 >= i.DOUBLE_EPSILON) {
            return d8;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append(str);
        sb.append(" (");
        sb.append(d8);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }
}
