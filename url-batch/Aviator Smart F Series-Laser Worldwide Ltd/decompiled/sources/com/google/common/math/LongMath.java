package com.google.common.math;

import com.baidu.ar.k;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaPeriodQueue;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedLongs;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.i.a;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import java.math.RoundingMode;
import okhttp3.internal.connection.RealConnection;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class LongMath {

    @VisibleForTesting
    static final long FLOOR_SQRT_MAX_LONG = 3037000499L;

    @VisibleForTesting
    static final long MAX_POWER_OF_SQRT2_UNSIGNED = -5402926248376769404L;

    @VisibleForTesting
    static final long MAX_SIGNED_POWER_OF_TWO = 4611686018427387904L;
    private static final int SIEVE_30 = -545925251;

    @VisibleForTesting
    static final byte[] maxLog10ForLeadingZeros = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    @VisibleForTesting
    @GwtIncompatible
    static final long[] powersOf10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, C.NANOS_PER_SECOND, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    @VisibleForTesting
    @GwtIncompatible
    static final long[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    static final long[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};
    static final int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, DfuAdapter.STATE_PREPARE_PAIRING_REQUEST, 361, DfuException.ERROR_CANNOT_FIND_DEVICE, 206, 169, GattError.GATT_CONGESTED, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    @VisibleForTesting
    static final int[] biggestSimpleBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, DfuException.ERROR_DFU_ALREADY_BE_LATEST_VERSION, 214, 169, GattError.GATT_INVALID_CFG, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    private static final long[][] millerRabinBaseSets = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* renamed from: com.google.common.math.LongMath$1, reason: invalid class name */
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

    private enum MillerRabinTester {
        SMALL { // from class: com.google.common.math.LongMath.MillerRabinTester.1
            @Override // com.google.common.math.LongMath.MillerRabinTester
            long mulMod(long j8, long j9, long j10) {
                return (j8 * j9) % j10;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long squareMod(long j8, long j9) {
                return (j8 * j8) % j9;
            }
        },
        LARGE { // from class: com.google.common.math.LongMath.MillerRabinTester.2
            private long plusMod(long j8, long j9, long j10) {
                long j11 = j8 + j9;
                return j8 >= j10 - j9 ? j11 - j10 : j11;
            }

            private long times2ToThe32Mod(long j8, long j9) {
                int i8 = 32;
                do {
                    int min = Math.min(i8, Long.numberOfLeadingZeros(j8));
                    j8 = UnsignedLongs.remainder(j8 << min, j9);
                    i8 -= min;
                } while (i8 > 0);
                return j8;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long mulMod(long j8, long j9, long j10) {
                long j11 = j8 >>> 32;
                long j12 = j9 >>> 32;
                long j13 = j8 & a.INVALID_VERSION_32;
                long j14 = j9 & a.INVALID_VERSION_32;
                long times2ToThe32Mod = times2ToThe32Mod(j11 * j12, j10) + (j11 * j14);
                if (times2ToThe32Mod < 0) {
                    times2ToThe32Mod = UnsignedLongs.remainder(times2ToThe32Mod, j10);
                }
                Long.signum(j13);
                return plusMod(times2ToThe32Mod(times2ToThe32Mod + (j12 * j13), j10), UnsignedLongs.remainder(j13 * j14, j10), j10);
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            long squareMod(long j8, long j9) {
                long j10 = j8 >>> 32;
                long j11 = j8 & a.INVALID_VERSION_32;
                long times2ToThe32Mod = times2ToThe32Mod(j10 * j10, j9);
                long j12 = j10 * j11 * 2;
                if (j12 < 0) {
                    j12 = UnsignedLongs.remainder(j12, j9);
                }
                return plusMod(times2ToThe32Mod(times2ToThe32Mod + j12, j9), UnsignedLongs.remainder(j11 * j11, j9), j9);
            }
        };

        private long powMod(long j8, long j9, long j10) {
            long j11 = 1;
            while (j9 != 0) {
                if ((j9 & 1) != 0) {
                    j11 = mulMod(j11, j8, j10);
                }
                j8 = squareMod(j8, j10);
                j9 >>= 1;
            }
            return j11;
        }

        static boolean test(long j8, long j9) {
            return (j9 <= LongMath.FLOOR_SQRT_MAX_LONG ? SMALL : LARGE).testWitness(j8, j9);
        }

        private boolean testWitness(long j8, long j9) {
            long j10 = j9 - 1;
            int numberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
            long j11 = j10 >> numberOfTrailingZeros;
            long j12 = j8 % j9;
            if (j12 == 0) {
                return true;
            }
            long powMod = powMod(j12, j11, j9);
            if (powMod == 1) {
                return true;
            }
            int i8 = 0;
            while (powMod != j10) {
                i8++;
                if (i8 == numberOfTrailingZeros) {
                    return false;
                }
                powMod = squareMod(powMod, j9);
            }
            return true;
        }

        abstract long mulMod(long j8, long j9, long j10);

        abstract long squareMod(long j8, long j9);

        /* synthetic */ MillerRabinTester(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private LongMath() {
    }

    public static long binomial(int i8, int i9) {
        MathPreconditions.checkNonNegative("n", i8);
        MathPreconditions.checkNonNegative(k.f2621r, i9);
        Preconditions.checkArgument(i9 <= i8, "k (%s) > n (%s)", i9, i8);
        if (i9 > (i8 >> 1)) {
            i9 = i8 - i9;
        }
        long j8 = 1;
        if (i9 == 0) {
            return 1L;
        }
        if (i9 == 1) {
            return i8;
        }
        long[] jArr = factorials;
        if (i8 < jArr.length) {
            return jArr[i8] / (jArr[i9] * jArr[i8 - i9]);
        }
        int[] iArr = biggestBinomials;
        if (i9 >= iArr.length || i8 > iArr[i9]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = biggestSimpleBinomials;
        if (i9 < iArr2.length && i8 <= iArr2[i9]) {
            int i10 = i8 - 1;
            long j9 = i8;
            for (int i11 = 2; i11 <= i9; i11++) {
                j9 = (j9 * i10) / i11;
                i10--;
            }
            return j9;
        }
        long j10 = i8;
        int log2 = log2(j10, RoundingMode.CEILING);
        int i12 = i8 - 1;
        int i13 = log2;
        long j11 = j10;
        int i14 = 2;
        long j12 = 1;
        while (i14 <= i9) {
            i13 += log2;
            if (i13 < 63) {
                j11 *= i12;
                j12 *= i14;
            } else {
                j8 = multiplyFraction(j8, j11, j12);
                j11 = i12;
                j12 = i14;
                i13 = log2;
            }
            i14++;
            i12--;
        }
        return multiplyFraction(j8, j11, j12);
    }

    @Beta
    public static long ceilingPowerOfTwo(long j8) {
        MathPreconditions.checkPositive("x", j8);
        if (j8 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(j8 - 1));
        }
        StringBuilder sb = new StringBuilder(70);
        sb.append("ceilingPowerOfTwo(");
        sb.append(j8);
        sb.append(") is not representable as a long");
        throw new ArithmeticException(sb.toString());
    }

    @GwtIncompatible
    public static long checkedAdd(long j8, long j9) {
        long j10 = j8 + j9;
        MathPreconditions.checkNoOverflow(((j8 ^ j9) < 0) | ((j8 ^ j10) >= 0), "checkedAdd", j8, j9);
        return j10;
    }

    public static long checkedMultiply(long j8, long j9) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j9) + Long.numberOfLeadingZeros(~j9);
        if (numberOfLeadingZeros > 65) {
            return j8 * j9;
        }
        MathPreconditions.checkNoOverflow(numberOfLeadingZeros >= 64, "checkedMultiply", j8, j9);
        MathPreconditions.checkNoOverflow((j8 >= 0) | (j9 != Long.MIN_VALUE), "checkedMultiply", j8, j9);
        long j10 = j8 * j9;
        MathPreconditions.checkNoOverflow(j8 == 0 || j10 / j8 == j9, "checkedMultiply", j8, j9);
        return j10;
    }

    @GwtIncompatible
    public static long checkedPow(long j8, int i8) {
        MathPreconditions.checkNonNegative("exponent", i8);
        long j9 = 1;
        if (!(j8 >= -2) || !(j8 <= 2)) {
            long j10 = j8;
            int i9 = i8;
            while (i9 != 0) {
                if (i9 == 1) {
                    return checkedMultiply(j9, j10);
                }
                long checkedMultiply = (i9 & 1) != 0 ? checkedMultiply(j9, j10) : j9;
                int i10 = i9 >> 1;
                if (i10 > 0) {
                    MathPreconditions.checkNoOverflow(-3037000499L <= j10 && j10 <= FLOOR_SQRT_MAX_LONG, "checkedPow", j10, i10);
                    j10 *= j10;
                }
                j9 = checkedMultiply;
                i9 = i10;
            }
            return j9;
        }
        int i11 = (int) j8;
        if (i11 == -2) {
            MathPreconditions.checkNoOverflow(i8 < 64, "checkedPow", j8, i8);
            return (i8 & 1) == 0 ? 1 << i8 : (-1) << i8;
        }
        if (i11 == -1) {
            return (i8 & 1) == 0 ? 1L : -1L;
        }
        if (i11 == 0) {
            return i8 == 0 ? 1L : 0L;
        }
        if (i11 == 1) {
            return 1L;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        MathPreconditions.checkNoOverflow(i8 < 63, "checkedPow", j8, i8);
        return 1 << i8;
    }

    @GwtIncompatible
    public static long checkedSubtract(long j8, long j9) {
        long j10 = j8 - j9;
        MathPreconditions.checkNoOverflow(((j8 ^ j9) >= 0) | ((j8 ^ j10) >= 0), "checkedSubtract", j8, j9);
        return j10;
    }

    @GwtIncompatible
    public static long divide(long j8, long j9, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        long j10 = j8 / j9;
        long j11 = j8 - (j9 * j10);
        if (j11 == 0) {
            return j10;
        }
        int i8 = ((int) ((j8 ^ j9) >> 63)) | 1;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j11 == 0);
                return j10;
            case 2:
                return j10;
            case 3:
                if (i8 >= 0) {
                    return j10;
                }
                break;
            case 4:
                break;
            case 5:
                if (i8 <= 0) {
                    return j10;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j11);
                long abs2 = abs - (Math.abs(j9) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j10) == 0)) {
                        return j10;
                    }
                } else if (abs2 <= 0) {
                    return j10;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j10 + i8;
    }

    @GwtIncompatible
    public static long factorial(int i8) {
        MathPreconditions.checkNonNegative("n", i8);
        long[] jArr = factorials;
        if (i8 < jArr.length) {
            return jArr[i8];
        }
        return Long.MAX_VALUE;
    }

    static boolean fitsInInt(long j8) {
        return ((long) ((int) j8)) == j8;
    }

    @Beta
    public static long floorPowerOfTwo(long j8) {
        MathPreconditions.checkPositive("x", j8);
        return 1 << (63 - Long.numberOfLeadingZeros(j8));
    }

    public static long gcd(long j8, long j9) {
        MathPreconditions.checkNonNegative("a", j8);
        MathPreconditions.checkNonNegative("b", j9);
        if (j8 == 0) {
            return j9;
        }
        if (j9 == 0) {
            return j8;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j8);
        long j10 = j8 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j9);
        long j11 = j9 >> numberOfTrailingZeros2;
        while (j10 != j11) {
            long j12 = j10 - j11;
            long j13 = (j12 >> 63) & j12;
            long j14 = (j12 - j13) - j13;
            j11 += j13;
            j10 = j14 >> Long.numberOfTrailingZeros(j14);
        }
        return j10 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(long j8) {
        return (j8 > 0) & ((j8 & (j8 - 1)) == 0);
    }

    @Beta
    @GwtIncompatible
    public static boolean isPrime(long j8) {
        if (j8 < 2) {
            MathPreconditions.checkNonNegative("n", j8);
            return false;
        }
        if (j8 < 66) {
            return ((722865708377213483 >> (((int) j8) + (-2))) & 1) != 0;
        }
        if (((1 << ((int) (j8 % 30))) & SIEVE_30) != 0 || j8 % 7 == 0 || j8 % 11 == 0 || j8 % 13 == 0) {
            return false;
        }
        if (j8 < 289) {
            return true;
        }
        for (long[] jArr : millerRabinBaseSets) {
            if (j8 <= jArr[0]) {
                for (int i8 = 1; i8 < jArr.length; i8++) {
                    if (!MillerRabinTester.test(jArr[i8], j8)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new AssertionError();
    }

    @VisibleForTesting
    static int lessThanBranchFree(long j8, long j9) {
        return (int) ((~(~(j8 - j9))) >>> 63);
    }

    @GwtIncompatible
    public static int log10(long j8, RoundingMode roundingMode) {
        int lessThanBranchFree;
        MathPreconditions.checkPositive("x", j8);
        int log10Floor = log10Floor(j8);
        long j9 = powersOf10[log10Floor];
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j8 == j9);
            case 2:
            case 3:
                return log10Floor;
            case 4:
            case 5:
                lessThanBranchFree = lessThanBranchFree(j9, j8);
                return log10Floor + lessThanBranchFree;
            case 6:
            case 7:
            case 8:
                lessThanBranchFree = lessThanBranchFree(halfPowersOf10[log10Floor], j8);
                return log10Floor + lessThanBranchFree;
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    static int log10Floor(long j8) {
        byte b8 = maxLog10ForLeadingZeros[Long.numberOfLeadingZeros(j8)];
        return b8 - lessThanBranchFree(j8, powersOf10[b8]);
    }

    public static int log2(long j8, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", j8);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(j8));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(j8 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Long.numberOfLeadingZeros(j8);
                return (63 - numberOfLeadingZeros) + lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> numberOfLeadingZeros, j8);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(j8);
    }

    public static long mean(long j8, long j9) {
        return (j8 & j9) + ((j8 ^ j9) >> 1);
    }

    @GwtIncompatible
    public static int mod(long j8, int i8) {
        return (int) mod(j8, i8);
    }

    static long multiplyFraction(long j8, long j9, long j10) {
        if (j8 == 1) {
            return j9 / j10;
        }
        long gcd = gcd(j8, j10);
        return (j8 / gcd) * (j9 / (j10 / gcd));
    }

    @GwtIncompatible
    public static long pow(long j8, int i8) {
        MathPreconditions.checkNonNegative("exponent", i8);
        if (-2 > j8 || j8 > 2) {
            long j9 = 1;
            while (i8 != 0) {
                if (i8 == 1) {
                    return j9 * j8;
                }
                j9 *= (i8 & 1) == 0 ? 1L : j8;
                j8 *= j8;
                i8 >>= 1;
            }
            return j9;
        }
        int i9 = (int) j8;
        if (i9 == -2) {
            if (i8 < 64) {
                return (i8 & 1) == 0 ? 1 << i8 : -(1 << i8);
            }
            return 0L;
        }
        if (i9 == -1) {
            return (i8 & 1) == 0 ? 1L : -1L;
        }
        if (i9 == 0) {
            return i8 == 0 ? 1L : 0L;
        }
        if (i9 == 1) {
            return 1L;
        }
        if (i9 != 2) {
            throw new AssertionError();
        }
        if (i8 < 64) {
            return 1 << i8;
        }
        return 0L;
    }

    @GwtIncompatible
    public static double roundToDouble(long j8, RoundingMode roundingMode) {
        double d8;
        long j9;
        double d9 = j8;
        long j10 = (long) d9;
        int compare = j10 == Long.MAX_VALUE ? -1 : Longs.compare(j8, j10);
        int[] iArr = AnonymousClass1.$SwitchMap$java$math$RoundingMode;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(compare == 0);
                return d9;
            case 2:
                return j8 >= 0 ? compare >= 0 ? d9 : DoubleUtils.nextDown(d9) : compare <= 0 ? d9 : Math.nextUp(d9);
            case 3:
                return compare >= 0 ? d9 : DoubleUtils.nextDown(d9);
            case 4:
                return j8 >= 0 ? compare <= 0 ? d9 : Math.nextUp(d9) : compare >= 0 ? d9 : DoubleUtils.nextDown(d9);
            case 5:
                return compare <= 0 ? d9 : Math.nextUp(d9);
            case 6:
            case 7:
            case 8:
                if (compare >= 0) {
                    d8 = Math.nextUp(d9);
                    j9 = (long) Math.ceil(d8);
                } else {
                    double nextDown = DoubleUtils.nextDown(d9);
                    j10 = (long) Math.floor(nextDown);
                    d8 = d9;
                    d9 = nextDown;
                    j9 = j10;
                }
                long j11 = j8 - j10;
                long j12 = j9 - j8;
                if (j9 == Long.MAX_VALUE) {
                    j12++;
                }
                int compare2 = Longs.compare(j11, j12);
                if (compare2 < 0) {
                    return d9;
                }
                if (compare2 > 0) {
                    return d8;
                }
                int i8 = iArr[roundingMode.ordinal()];
                if (i8 == 6) {
                    return j8 >= 0 ? d9 : d8;
                }
                if (i8 == 7) {
                    return j8 >= 0 ? d8 : d9;
                }
                if (i8 == 8) {
                    return (DoubleUtils.getSignificand(d9) & 1) == 0 ? d9 : d8;
                }
                throw new AssertionError("impossible");
            default:
                throw new AssertionError("impossible");
        }
    }

    @Beta
    public static long saturatedAdd(long j8, long j9) {
        long j10 = j8 + j9;
        return (((j9 ^ j8) > 0L ? 1 : ((j9 ^ j8) == 0L ? 0 : -1)) < 0) | ((j8 ^ j10) >= 0) ? j10 : ((j10 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @Beta
    public static long saturatedMultiply(long j8, long j9) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j9) + Long.numberOfLeadingZeros(~j9);
        if (numberOfLeadingZeros > 65) {
            return j8 * j9;
        }
        long j10 = ((j8 ^ j9) >>> 63) + Long.MAX_VALUE;
        if ((numberOfLeadingZeros < 64) || ((j9 == Long.MIN_VALUE) & (j8 < 0))) {
            return j10;
        }
        long j11 = j8 * j9;
        return (j8 == 0 || j11 / j8 == j9) ? j11 : j10;
    }

    @Beta
    public static long saturatedPow(long j8, int i8) {
        MathPreconditions.checkNonNegative("exponent", i8);
        long j9 = 1;
        if (!(j8 >= -2) || !(j8 <= 2)) {
            long j10 = ((j8 >>> 63) & i8 & 1) + Long.MAX_VALUE;
            while (i8 != 0) {
                if (i8 == 1) {
                    return saturatedMultiply(j9, j8);
                }
                if ((i8 & 1) != 0) {
                    j9 = saturatedMultiply(j9, j8);
                }
                i8 >>= 1;
                if (i8 > 0) {
                    if ((-3037000499L > j8) || (j8 > FLOOR_SQRT_MAX_LONG)) {
                        return j10;
                    }
                    j8 *= j8;
                }
            }
            return j9;
        }
        int i9 = (int) j8;
        if (i9 == -2) {
            return i8 >= 64 ? (i8 & 1) + Long.MAX_VALUE : (i8 & 1) == 0 ? 1 << i8 : (-1) << i8;
        }
        if (i9 == -1) {
            return (i8 & 1) == 0 ? 1L : -1L;
        }
        if (i9 == 0) {
            return i8 == 0 ? 1L : 0L;
        }
        if (i9 == 1) {
            return 1L;
        }
        if (i9 != 2) {
            throw new AssertionError();
        }
        if (i8 >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << i8;
    }

    @Beta
    public static long saturatedSubtract(long j8, long j9) {
        long j10 = j8 - j9;
        return (((j9 ^ j8) > 0L ? 1 : ((j9 ^ j8) == 0L ? 0 : -1)) >= 0) | ((j8 ^ j10) >= 0) ? j10 : ((j10 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @GwtIncompatible
    public static long sqrt(long j8, RoundingMode roundingMode) {
        MathPreconditions.checkNonNegative("x", j8);
        if (fitsInInt(j8)) {
            return IntMath.sqrt((int) j8, roundingMode);
        }
        long sqrt = (long) Math.sqrt(j8);
        long j9 = sqrt * sqrt;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j9 == j8);
                return sqrt;
            case 2:
            case 3:
                return j8 < j9 ? sqrt - 1 : sqrt;
            case 4:
            case 5:
                return j8 > j9 ? sqrt + 1 : sqrt;
            case 6:
            case 7:
            case 8:
                return (sqrt - (j8 < j9 ? 1 : 0)) + lessThanBranchFree((r0 * r0) + r0, j8);
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static long mod(long j8, long j9) {
        if (j9 <= 0) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long j10 = j8 % j9;
        return j10 >= 0 ? j10 : j10 + j9;
    }
}
