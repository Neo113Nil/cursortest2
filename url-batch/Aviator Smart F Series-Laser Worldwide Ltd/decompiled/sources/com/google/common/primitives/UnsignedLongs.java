package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
@Beta
@GwtCompatible
/* loaded from: classes4.dex */
public final class UnsignedLongs {
    public static final long MAX_VALUE = -1;

    enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i8 = 0; i8 < min; i8++) {
                long j8 = jArr[i8];
                long j9 = jArr2[i8];
                if (j8 != j9) {
                    return UnsignedLongs.compare(j8, j9);
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    private static final class ParseOverflowDetection {
        static final long[] maxValueDivs = new long[37];
        static final int[] maxValueMods = new int[37];
        static final int[] maxSafeDigits = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i8 = 2; i8 <= 36; i8++) {
                long j8 = i8;
                maxValueDivs[i8] = UnsignedLongs.divide(-1L, j8);
                maxValueMods[i8] = (int) UnsignedLongs.remainder(-1L, j8);
                maxSafeDigits[i8] = bigInteger.toString(i8).length() - 1;
            }
        }

        private ParseOverflowDetection() {
        }

        static boolean overflowInParse(long j8, int i8, int i9) {
            if (j8 < 0) {
                return true;
            }
            long j9 = maxValueDivs[i9];
            if (j8 < j9) {
                return false;
            }
            return j8 > j9 || i8 > maxValueMods[i9];
        }
    }

    private UnsignedLongs() {
    }

    public static int compare(long j8, long j9) {
        return Longs.compare(flip(j8), flip(j9));
    }

    @CanIgnoreReturnValue
    public static long decode(String str) {
        ParseRequest fromString = ParseRequest.fromString(str);
        try {
            return parseUnsignedLong(fromString.rawValue, fromString.radix);
        } catch (NumberFormatException e8) {
            String valueOf = String.valueOf(str);
            NumberFormatException numberFormatException = new NumberFormatException(valueOf.length() != 0 ? "Error parsing value: ".concat(valueOf) : new String("Error parsing value: "));
            numberFormatException.initCause(e8);
            throw numberFormatException;
        }
    }

    public static long divide(long j8, long j9) {
        if (j9 < 0) {
            return compare(j8, j9) < 0 ? 0L : 1L;
        }
        if (j8 >= 0) {
            return j8 / j9;
        }
        long j10 = ((j8 >>> 1) / j9) << 1;
        return j10 + (compare(j8 - (j10 * j9), j9) < 0 ? 0 : 1);
    }

    private static long flip(long j8) {
        return j8 ^ Long.MIN_VALUE;
    }

    public static String join(String str, long... jArr) {
        Preconditions.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(jArr.length * 5);
        sb.append(toString(jArr[0]));
        for (int i8 = 1; i8 < jArr.length; i8++) {
            sb.append(str);
            sb.append(toString(jArr[i8]));
        }
        return sb.toString();
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static long max(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long flip = flip(jArr[0]);
        for (int i8 = 1; i8 < jArr.length; i8++) {
            long flip2 = flip(jArr[i8]);
            if (flip2 > flip) {
                flip = flip2;
            }
        }
        return flip(flip);
    }

    public static long min(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long flip = flip(jArr[0]);
        for (int i8 = 1; i8 < jArr.length; i8++) {
            long flip2 = flip(jArr[i8]);
            if (flip2 < flip) {
                flip = flip2;
            }
        }
        return flip(flip);
    }

    @CanIgnoreReturnValue
    public static long parseUnsignedLong(String str) {
        return parseUnsignedLong(str, 10);
    }

    public static long remainder(long j8, long j9) {
        if (j9 < 0) {
            return compare(j8, j9) < 0 ? j8 : j8 - j9;
        }
        if (j8 >= 0) {
            return j8 % j9;
        }
        long j10 = j8 - ((((j8 >>> 1) / j9) << 1) * j9);
        if (compare(j10, j9) < 0) {
            j9 = 0;
        }
        return j10 - j9;
    }

    public static void sort(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        sort(jArr, 0, jArr.length);
    }

    public static void sortDescending(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    public static String toString(long j8) {
        return toString(j8, 10);
    }

    @CanIgnoreReturnValue
    public static long parseUnsignedLong(String str, int i8) {
        Preconditions.checkNotNull(str);
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (i8 < 2 || i8 > 36) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("illegal radix: ");
            sb.append(i8);
            throw new NumberFormatException(sb.toString());
        }
        int i9 = ParseOverflowDetection.maxSafeDigits[i8] - 1;
        long j8 = 0;
        for (int i10 = 0; i10 < str.length(); i10++) {
            int digit = Character.digit(str.charAt(i10), i8);
            if (digit == -1) {
                throw new NumberFormatException(str);
            }
            if (i10 > i9 && ParseOverflowDetection.overflowInParse(j8, digit, i8)) {
                throw new NumberFormatException(str.length() != 0 ? "Too large for unsigned long: ".concat(str) : new String("Too large for unsigned long: "));
            }
            j8 = (j8 * i8) + digit;
        }
        return j8;
    }

    public static String toString(long j8, int i8) {
        Preconditions.checkArgument(i8 >= 2 && i8 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i8);
        if (j8 == 0) {
            return "0";
        }
        if (j8 > 0) {
            return Long.toString(j8, i8);
        }
        int i9 = 64;
        char[] cArr = new char[64];
        int i10 = i8 - 1;
        if ((i8 & i10) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i8);
            do {
                i9--;
                cArr[i9] = Character.forDigit(((int) j8) & i10, i8);
                j8 >>>= numberOfTrailingZeros;
            } while (j8 != 0);
        } else {
            long divide = (i8 & 1) == 0 ? (j8 >>> 1) / (i8 >>> 1) : divide(j8, i8);
            long j9 = i8;
            int i11 = 63;
            cArr[63] = Character.forDigit((int) (j8 - (divide * j9)), i8);
            while (divide > 0) {
                i11--;
                cArr[i11] = Character.forDigit((int) (divide % j9), i8);
                divide /= j9;
            }
            i9 = i11;
        }
        return new String(cArr, i9, 64 - i9);
    }

    public static void sort(long[] jArr, int i8, int i9) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i8, i9, jArr.length);
        for (int i10 = i8; i10 < i9; i10++) {
            jArr[i10] = flip(jArr[i10]);
        }
        Arrays.sort(jArr, i8, i9);
        while (i8 < i9) {
            jArr[i8] = flip(jArr[i8]);
            i8++;
        }
    }

    public static void sortDescending(long[] jArr, int i8, int i9) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i8, i9, jArr.length);
        for (int i10 = i8; i10 < i9; i10++) {
            jArr[i10] = Long.MAX_VALUE ^ jArr[i10];
        }
        Arrays.sort(jArr, i8, i9);
        while (i8 < i9) {
            jArr[i8] = jArr[i8] ^ Long.MAX_VALUE;
            i8++;
        }
    }
}
