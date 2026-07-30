package com.google.common.math;

import com.github.mikephil.charting.utils.i;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.math.BigInteger;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
final class DoubleUtils {
    static final int EXPONENT_BIAS = 1023;
    static final long EXPONENT_MASK = 9218868437227405312L;
    static final long IMPLICIT_BIT = 4503599627370496L;

    @VisibleForTesting
    static final long ONE_BITS = 4607182418800017408L;
    static final int SIGNIFICAND_BITS = 52;
    static final long SIGNIFICAND_MASK = 4503599627370495L;
    static final long SIGN_MASK = Long.MIN_VALUE;

    private DoubleUtils() {
    }

    static double bigToDouble(BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        int bitLength = abs.bitLength();
        int i8 = bitLength - 1;
        if (i8 < 63) {
            return bigInteger.longValue();
        }
        if (i8 > 1023) {
            return bigInteger.signum() * Double.POSITIVE_INFINITY;
        }
        int i9 = bitLength - 54;
        long longValue = abs.shiftRight(i9).longValue();
        long j8 = longValue >> 1;
        long j9 = SIGNIFICAND_MASK & j8;
        if ((longValue & 1) != 0 && ((j8 & 1) != 0 || abs.getLowestSetBit() < i9)) {
            j9++;
        }
        return Double.longBitsToDouble((((bitLength + 1022) << 52) + j9) | (bigInteger.signum() & Long.MIN_VALUE));
    }

    static double ensureNonNegative(double d8) {
        Preconditions.checkArgument(!Double.isNaN(d8));
        return Math.max(d8, i.DOUBLE_EPSILON);
    }

    static long getSignificand(double d8) {
        Preconditions.checkArgument(isFinite(d8), "not a normal value");
        int exponent = Math.getExponent(d8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d8) & SIGNIFICAND_MASK;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | IMPLICIT_BIT;
    }

    static boolean isFinite(double d8) {
        return Math.getExponent(d8) <= 1023;
    }

    static boolean isNormal(double d8) {
        return Math.getExponent(d8) >= -1022;
    }

    static double nextDown(double d8) {
        return -Math.nextUp(-d8);
    }

    static double scaleNormalize(double d8) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d8) & SIGNIFICAND_MASK) | ONE_BITS);
    }
}
