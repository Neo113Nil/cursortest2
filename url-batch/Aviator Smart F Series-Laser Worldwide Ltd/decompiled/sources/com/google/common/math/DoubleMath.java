package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Booleans;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class DoubleMath {

    @VisibleForTesting
    static final int MAX_FACTORIAL = 170;
    private static final double MAX_INT_AS_DOUBLE = 2.147483647E9d;
    private static final double MAX_LONG_AS_DOUBLE_PLUS_ONE = 9.223372036854776E18d;
    private static final double MIN_INT_AS_DOUBLE = -2.147483648E9d;
    private static final double MIN_LONG_AS_DOUBLE = -9.223372036854776E18d;
    private static final double LN_2 = Math.log(2.0d);

    @VisibleForTesting
    static final double[] everySixteenthFactorial = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* renamed from: com.google.common.math.DoubleMath$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private DoubleMath() {
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    private static double checkFinite(double d8) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d8));
        return d8;
    }

    public static double factorial(int i8) {
        MathPreconditions.checkNonNegative("n", i8);
        if (i8 > MAX_FACTORIAL) {
            return Double.POSITIVE_INFINITY;
        }
        double d8 = 1.0d;
        for (int i9 = (i8 & (-16)) + 1; i9 <= i8; i9++) {
            d8 *= i9;
        }
        return d8 * everySixteenthFactorial[i8 >> 4];
    }

    public static int fuzzyCompare(double d8, double d9, double d10) {
        if (fuzzyEquals(d8, d9, d10)) {
            return 0;
        }
        if (d8 < d9) {
            return -1;
        }
        if (d8 > d9) {
            return 1;
        }
        return Booleans.compare(Double.isNaN(d8), Double.isNaN(d9));
    }

    public static boolean fuzzyEquals(double d8, double d9, double d10) {
        MathPreconditions.checkNonNegative("tolerance", d10);
        return Math.copySign(d8 - d9, 1.0d) <= d10 || d8 == d9 || (Double.isNaN(d8) && Double.isNaN(d9));
    }

    @GwtIncompatible
    public static boolean isMathematicalInteger(double d8) {
        return DoubleUtils.isFinite(d8) && (d8 == 0.0d || 52 - Long.numberOfTrailingZeros(DoubleUtils.getSignificand(d8)) <= Math.getExponent(d8));
    }

    @GwtIncompatible
    public static boolean isPowerOfTwo(double d8) {
        if (d8 <= 0.0d || !DoubleUtils.isFinite(d8)) {
            return false;
        }
        long significand = DoubleUtils.getSignificand(d8);
        return (significand & (significand - 1)) == 0;
    }

    public static double log2(double d8) {
        return Math.log(d8) / LN_2;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0, "Cannot take mean of 0 values");
        double checkFinite = checkFinite(dArr[0]);
        long j8 = 1;
        for (int i8 = 1; i8 < dArr.length; i8++) {
            checkFinite(dArr[i8]);
            j8++;
            checkFinite += (dArr[i8] - checkFinite) / j8;
        }
        return checkFinite;
    }

    @GwtIncompatible
    static double roundIntermediate(double d8, RoundingMode roundingMode) {
        if (!DoubleUtils.isFinite(d8)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isMathematicalInteger(d8));
                return d8;
            case 2:
                return (d8 >= 0.0d || isMathematicalInteger(d8)) ? d8 : ((long) d8) - 1;
            case 3:
                return (d8 <= 0.0d || isMathematicalInteger(d8)) ? d8 : ((long) d8) + 1;
            case 4:
                return d8;
            case 5:
                if (isMathematicalInteger(d8)) {
                    return d8;
                }
                return ((long) d8) + (d8 > 0.0d ? 1 : -1);
            case 6:
                return Math.rint(d8);
            case 7:
                double rint = Math.rint(d8);
                return Math.abs(d8 - rint) == 0.5d ? d8 + Math.copySign(0.5d, d8) : rint;
            case 8:
                double rint2 = Math.rint(d8);
                return Math.abs(d8 - rint2) == 0.5d ? d8 : rint2;
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static BigInteger roundToBigInteger(double d8, RoundingMode roundingMode) {
        double roundIntermediate = roundIntermediate(d8, roundingMode);
        if ((roundIntermediate < MAX_LONG_AS_DOUBLE_PLUS_ONE) && (MIN_LONG_AS_DOUBLE - roundIntermediate < 1.0d)) {
            return BigInteger.valueOf((long) roundIntermediate);
        }
        BigInteger shiftLeft = BigInteger.valueOf(DoubleUtils.getSignificand(roundIntermediate)).shiftLeft(Math.getExponent(roundIntermediate) - 52);
        return roundIntermediate < 0.0d ? shiftLeft.negate() : shiftLeft;
    }

    @GwtIncompatible
    public static int roundToInt(double d8, RoundingMode roundingMode) {
        double roundIntermediate = roundIntermediate(d8, roundingMode);
        MathPreconditions.checkInRangeForRoundingInputs((roundIntermediate > -2.147483649E9d) & (roundIntermediate < 2.147483648E9d), d8, roundingMode);
        return (int) roundIntermediate;
    }

    @GwtIncompatible
    public static long roundToLong(double d8, RoundingMode roundingMode) {
        double roundIntermediate = roundIntermediate(d8, roundingMode);
        MathPreconditions.checkInRangeForRoundingInputs((MIN_LONG_AS_DOUBLE - roundIntermediate < 1.0d) & (roundIntermediate < MAX_LONG_AS_DOUBLE_PLUS_ONE), d8, roundingMode);
        return (long) roundIntermediate;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @GwtIncompatible
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int log2(double d8, RoundingMode roundingMode) {
        boolean z7;
        boolean z8;
        boolean isPowerOfTwo;
        Preconditions.checkArgument(d8 > 0.0d && DoubleUtils.isFinite(d8), "x must be positive and finite");
        int exponent = Math.getExponent(d8);
        if (!DoubleUtils.isNormal(d8)) {
            return log2(d8 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(d8));
                return exponent;
            case 2:
                return exponent;
            case 3:
                z7 = !isPowerOfTwo(d8);
                if (!z7) {
                    return exponent;
                }
                return exponent + 1;
            case 4:
                z8 = exponent < 0;
                isPowerOfTwo = isPowerOfTwo(d8);
                z7 = (!isPowerOfTwo) & z8;
                if (!z7) {
                }
                return exponent + 1;
            case 5:
                z8 = exponent >= 0;
                isPowerOfTwo = isPowerOfTwo(d8);
                z7 = (!isPowerOfTwo) & z8;
                if (!z7) {
                }
                return exponent + 1;
            case 6:
            case 7:
            case 8:
                double scaleNormalize = DoubleUtils.scaleNormalize(d8);
                if (scaleNormalize * scaleNormalize <= 2.0d) {
                    return exponent;
                }
                return exponent + 1;
            default:
                throw new AssertionError();
        }
    }

    @Deprecated
    public static double mean(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0, "Cannot take mean of 0 values");
        long j8 = 0;
        for (int i8 : iArr) {
            j8 += i8;
        }
        return j8 / iArr.length;
    }

    @Deprecated
    public static double mean(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0, "Cannot take mean of 0 values");
        double d8 = jArr[0];
        long j8 = 1;
        for (int i8 = 1; i8 < jArr.length; i8++) {
            j8++;
            d8 += (jArr[i8] - d8) / j8;
        }
        return d8;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterable<? extends Number> iterable) {
        return mean(iterable.iterator());
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterator<? extends Number> it) {
        Preconditions.checkArgument(it.hasNext(), "Cannot take mean of 0 values");
        double checkFinite = checkFinite(it.next().doubleValue());
        long j8 = 1;
        while (it.hasNext()) {
            j8++;
            checkFinite += (checkFinite(it.next().doubleValue()) - checkFinite) / j8;
        }
        return checkFinite;
    }
}
