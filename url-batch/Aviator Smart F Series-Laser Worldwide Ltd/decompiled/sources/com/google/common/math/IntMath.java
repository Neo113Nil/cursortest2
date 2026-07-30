package com.google.common.math;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ar.k;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class IntMath {

    @VisibleForTesting
    static final int FLOOR_SQRT_MAX_INT = 46340;

    @VisibleForTesting
    static final int MAX_POWER_OF_SQRT2_UNSIGNED = -1257966797;

    @VisibleForTesting
    static final int MAX_SIGNED_POWER_OF_TWO = 1073741824;

    @VisibleForTesting
    static final byte[] maxLog10ForLeadingZeros = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    @VisibleForTesting
    static final int[] powersOf10 = {1, 10, 100, 1000, 10000, AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND, 1000000, 10000000, 100000000, 1000000000};

    @VisibleForTesting
    static final int[] halfPowersOf10 = {3, 31, TypedValues.AttributesType.TYPE_PATH_ROTATE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    private static final int[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    @VisibleForTesting
    static int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* renamed from: com.google.common.math.IntMath$1, reason: invalid class name */
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
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private IntMath() {
    }

    public static int binomial(int i8, int i9) {
        MathPreconditions.checkNonNegative("n", i8);
        MathPreconditions.checkNonNegative(k.f2621r, i9);
        int i10 = 0;
        Preconditions.checkArgument(i9 <= i8, "k (%s) > n (%s)", i9, i8);
        if (i9 > (i8 >> 1)) {
            i9 = i8 - i9;
        }
        int[] iArr = biggestBinomials;
        if (i9 >= iArr.length || i8 > iArr[i9]) {
            return Integer.MAX_VALUE;
        }
        if (i9 == 0) {
            return 1;
        }
        if (i9 == 1) {
            return i8;
        }
        long j8 = 1;
        while (i10 < i9) {
            long j9 = j8 * (i8 - i10);
            i10++;
            j8 = j9 / i10;
        }
        return (int) j8;
    }

    @Beta
    public static int ceilingPowerOfTwo(int i8) {
        MathPreconditions.checkPositive("x", i8);
        if (i8 <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(i8 - 1));
        }
        StringBuilder sb = new StringBuilder(58);
        sb.append("ceilingPowerOfTwo(");
        sb.append(i8);
        sb.append(") not representable as an int");
        throw new ArithmeticException(sb.toString());
    }

    public static int checkedAdd(int i8, int i9) {
        long j8 = i8 + i9;
        int i10 = (int) j8;
        MathPreconditions.checkNoOverflow(j8 == ((long) i10), "checkedAdd", i8, i9);
        return i10;
    }

    public static int checkedMultiply(int i8, int i9) {
        long j8 = i8 * i9;
        int i10 = (int) j8;
        MathPreconditions.checkNoOverflow(j8 == ((long) i10), "checkedMultiply", i8, i9);
        return i10;
    }

    public static int checkedPow(int i8, int i9) {
        MathPreconditions.checkNonNegative("exponent", i9);
        if (i8 == -2) {
            MathPreconditions.checkNoOverflow(i9 < 32, "checkedPow", i8, i9);
            return (i9 & 1) == 0 ? 1 << i9 : (-1) << i9;
        }
        if (i8 == -1) {
            return (i9 & 1) == 0 ? 1 : -1;
        }
        if (i8 == 0) {
            return i9 == 0 ? 1 : 0;
        }
        if (i8 == 1) {
            return 1;
        }
        if (i8 == 2) {
            MathPreconditions.checkNoOverflow(i9 < 31, "checkedPow", i8, i9);
            return 1 << i9;
        }
        int i10 = 1;
        while (i9 != 0) {
            if (i9 == 1) {
                return checkedMultiply(i10, i8);
            }
            if ((i9 & 1) != 0) {
                i10 = checkedMultiply(i10, i8);
            }
            i9 >>= 1;
            if (i9 > 0) {
                MathPreconditions.checkNoOverflow((-46340 <= i8) & (i8 <= FLOOR_SQRT_MAX_INT), "checkedPow", i8, i9);
                i8 *= i8;
            }
        }
        return i10;
    }

    public static int checkedSubtract(int i8, int i9) {
        long j8 = i8 - i9;
        int i10 = (int) j8;
        MathPreconditions.checkNoOverflow(j8 == ((long) i10), "checkedSubtract", i8, i9);
        return i10;
    }

    public static int divide(int i8, int i9, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        if (i9 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i10 = i8 / i9;
        int i11 = i8 - (i9 * i10);
        if (i11 == 0) {
            return i10;
        }
        int i12 = ((i8 ^ i9) >> 31) | 1;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(i11 == 0);
                return i10;
            case 2:
                return i10;
            case 3:
                if (i12 >= 0) {
                    return i10;
                }
                break;
            case 4:
                break;
            case 5:
                if (i12 <= 0) {
                    return i10;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i11);
                int abs2 = abs - (Math.abs(i9) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i10 & 1) != 0))) {
                            return i10;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i10;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i10 + i12;
    }

    public static int factorial(int i8) {
        MathPreconditions.checkNonNegative("n", i8);
        int[] iArr = factorials;
        if (i8 < iArr.length) {
            return iArr[i8];
        }
        return Integer.MAX_VALUE;
    }

    @Beta
    public static int floorPowerOfTwo(int i8) {
        MathPreconditions.checkPositive("x", i8);
        return Integer.highestOneBit(i8);
    }

    public static int gcd(int i8, int i9) {
        MathPreconditions.checkNonNegative("a", i8);
        MathPreconditions.checkNonNegative("b", i9);
        if (i8 == 0) {
            return i9;
        }
        if (i9 == 0) {
            return i8;
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i8);
        int i10 = i8 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(i9);
        int i11 = i9 >> numberOfTrailingZeros2;
        while (i10 != i11) {
            int i12 = i10 - i11;
            int i13 = (i12 >> 31) & i12;
            int i14 = (i12 - i13) - i13;
            i11 += i13;
            i10 = i14 >> Integer.numberOfTrailingZeros(i14);
        }
        return i10 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(int i8) {
        return (i8 > 0) & ((i8 & (i8 + (-1))) == 0);
    }

    @Beta
    @GwtIncompatible
    public static boolean isPrime(int i8) {
        return LongMath.isPrime(i8);
    }

    @VisibleForTesting
    static int lessThanBranchFree(int i8, int i9) {
        return (~(~(i8 - i9))) >>> 31;
    }

    @GwtIncompatible
    public static int log10(int i8, RoundingMode roundingMode) {
        int lessThanBranchFree;
        MathPreconditions.checkPositive("x", i8);
        int log10Floor = log10Floor(i8);
        int i9 = powersOf10[log10Floor];
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(i8 == i9);
            case 2:
            case 3:
                return log10Floor;
            case 4:
            case 5:
                lessThanBranchFree = lessThanBranchFree(i9, i8);
                return log10Floor + lessThanBranchFree;
            case 6:
            case 7:
            case 8:
                lessThanBranchFree = lessThanBranchFree(halfPowersOf10[log10Floor], i8);
                return log10Floor + lessThanBranchFree;
            default:
                throw new AssertionError();
        }
    }

    private static int log10Floor(int i8) {
        byte b8 = maxLog10ForLeadingZeros[Integer.numberOfLeadingZeros(i8)];
        return b8 - lessThanBranchFree(i8, powersOf10[b8]);
    }

    public static int log2(int i8, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", i8);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(i8));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i8 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i8);
                return (31 - numberOfLeadingZeros) + lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> numberOfLeadingZeros, i8);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i8);
    }

    public static int mean(int i8, int i9) {
        return (i8 & i9) + ((i8 ^ i9) >> 1);
    }

    public static int mod(int i8, int i9) {
        if (i9 > 0) {
            int i10 = i8 % i9;
            return i10 >= 0 ? i10 : i10 + i9;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Modulus ");
        sb.append(i9);
        sb.append(" must be > 0");
        throw new ArithmeticException(sb.toString());
    }

    @GwtIncompatible
    public static int pow(int i8, int i9) {
        MathPreconditions.checkNonNegative("exponent", i9);
        if (i8 == -2) {
            if (i9 < 32) {
                return (i9 & 1) == 0 ? 1 << i9 : -(1 << i9);
            }
            return 0;
        }
        if (i8 == -1) {
            return (i9 & 1) == 0 ? 1 : -1;
        }
        if (i8 == 0) {
            return i9 == 0 ? 1 : 0;
        }
        if (i8 == 1) {
            return 1;
        }
        if (i8 == 2) {
            if (i9 < 32) {
                return 1 << i9;
            }
            return 0;
        }
        int i10 = 1;
        while (i9 != 0) {
            if (i9 == 1) {
                return i8 * i10;
            }
            i10 *= (i9 & 1) == 0 ? 1 : i8;
            i8 *= i8;
            i9 >>= 1;
        }
        return i10;
    }

    @Beta
    public static int saturatedAdd(int i8, int i9) {
        return Ints.saturatedCast(i8 + i9);
    }

    @Beta
    public static int saturatedMultiply(int i8, int i9) {
        return Ints.saturatedCast(i8 * i9);
    }

    @Beta
    public static int saturatedPow(int i8, int i9) {
        MathPreconditions.checkNonNegative("exponent", i9);
        if (i8 == -2) {
            return i9 >= 32 ? (i9 & 1) + Integer.MAX_VALUE : (i9 & 1) == 0 ? 1 << i9 : (-1) << i9;
        }
        if (i8 == -1) {
            return (i9 & 1) == 0 ? 1 : -1;
        }
        if (i8 == 0) {
            return i9 == 0 ? 1 : 0;
        }
        if (i8 == 1) {
            return 1;
        }
        if (i8 == 2) {
            if (i9 >= 31) {
                return Integer.MAX_VALUE;
            }
            return 1 << i9;
        }
        int i10 = ((i8 >>> 31) & i9 & 1) + Integer.MAX_VALUE;
        int i11 = 1;
        while (i9 != 0) {
            if (i9 == 1) {
                return saturatedMultiply(i11, i8);
            }
            if ((i9 & 1) != 0) {
                i11 = saturatedMultiply(i11, i8);
            }
            i9 >>= 1;
            if (i9 > 0) {
                if ((-46340 > i8) || (i8 > FLOOR_SQRT_MAX_INT)) {
                    return i10;
                }
                i8 *= i8;
            }
        }
        return i11;
    }

    @Beta
    public static int saturatedSubtract(int i8, int i9) {
        return Ints.saturatedCast(i8 - i9);
    }

    @GwtIncompatible
    public static int sqrt(int i8, RoundingMode roundingMode) {
        int lessThanBranchFree;
        MathPreconditions.checkNonNegative("x", i8);
        int sqrtFloor = sqrtFloor(i8);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(sqrtFloor * sqrtFloor == i8);
            case 2:
            case 3:
                return sqrtFloor;
            case 4:
            case 5:
                lessThanBranchFree = lessThanBranchFree(sqrtFloor * sqrtFloor, i8);
                return sqrtFloor + lessThanBranchFree;
            case 6:
            case 7:
            case 8:
                lessThanBranchFree = lessThanBranchFree((sqrtFloor * sqrtFloor) + sqrtFloor, i8);
                return sqrtFloor + lessThanBranchFree;
            default:
                throw new AssertionError();
        }
    }

    private static int sqrtFloor(int i8) {
        return (int) Math.sqrt(i8);
    }
}
