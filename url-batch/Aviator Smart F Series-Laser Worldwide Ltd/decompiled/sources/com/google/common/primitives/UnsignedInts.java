package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
@Beta
@GwtCompatible
/* loaded from: classes4.dex */
public final class UnsignedInts {
    static final long INT_MASK = 4294967295L;

    enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i8 = 0; i8 < min; i8++) {
                int i9 = iArr[i8];
                int i10 = iArr2[i8];
                if (i9 != i10) {
                    return UnsignedInts.compare(i9, i10);
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    private UnsignedInts() {
    }

    public static int checkedCast(long j8) {
        Preconditions.checkArgument((j8 >> 32) == 0, "out of range: %s", j8);
        return (int) j8;
    }

    public static int compare(int i8, int i9) {
        return Ints.compare(flip(i8), flip(i9));
    }

    @CanIgnoreReturnValue
    public static int decode(String str) {
        ParseRequest fromString = ParseRequest.fromString(str);
        try {
            return parseUnsignedInt(fromString.rawValue, fromString.radix);
        } catch (NumberFormatException e8) {
            String valueOf = String.valueOf(str);
            NumberFormatException numberFormatException = new NumberFormatException(valueOf.length() != 0 ? "Error parsing value: ".concat(valueOf) : new String("Error parsing value: "));
            numberFormatException.initCause(e8);
            throw numberFormatException;
        }
    }

    public static int divide(int i8, int i9) {
        return (int) (toLong(i8) / toLong(i9));
    }

    static int flip(int i8) {
        return i8 ^ Integer.MIN_VALUE;
    }

    public static String join(String str, int... iArr) {
        Preconditions.checkNotNull(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iArr.length * 5);
        sb.append(toString(iArr[0]));
        for (int i8 = 1; i8 < iArr.length; i8++) {
            sb.append(str);
            sb.append(toString(iArr[i8]));
        }
        return sb.toString();
    }

    public static Comparator<int[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static int max(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        int flip = flip(iArr[0]);
        for (int i8 = 1; i8 < iArr.length; i8++) {
            int flip2 = flip(iArr[i8]);
            if (flip2 > flip) {
                flip = flip2;
            }
        }
        return flip(flip);
    }

    public static int min(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        int flip = flip(iArr[0]);
        for (int i8 = 1; i8 < iArr.length; i8++) {
            int flip2 = flip(iArr[i8]);
            if (flip2 < flip) {
                flip = flip2;
            }
        }
        return flip(flip);
    }

    @CanIgnoreReturnValue
    public static int parseUnsignedInt(String str) {
        return parseUnsignedInt(str, 10);
    }

    public static int remainder(int i8, int i9) {
        return (int) (toLong(i8) % toLong(i9));
    }

    public static int saturatedCast(long j8) {
        if (j8 <= 0) {
            return 0;
        }
        if (j8 >= 4294967296L) {
            return -1;
        }
        return (int) j8;
    }

    public static void sort(int[] iArr) {
        Preconditions.checkNotNull(iArr);
        sort(iArr, 0, iArr.length);
    }

    public static void sortDescending(int[] iArr) {
        Preconditions.checkNotNull(iArr);
        sortDescending(iArr, 0, iArr.length);
    }

    public static long toLong(int i8) {
        return i8 & 4294967295L;
    }

    public static String toString(int i8) {
        return toString(i8, 10);
    }

    @CanIgnoreReturnValue
    public static int parseUnsignedInt(String str, int i8) {
        Preconditions.checkNotNull(str);
        long parseLong = Long.parseLong(str, i8);
        if ((4294967295L & parseLong) == parseLong) {
            return (int) parseLong;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 69);
        sb.append("Input ");
        sb.append(str);
        sb.append(" in base ");
        sb.append(i8);
        sb.append(" is not in the range of an unsigned integer");
        throw new NumberFormatException(sb.toString());
    }

    public static String toString(int i8, int i9) {
        return Long.toString(i8 & 4294967295L, i9);
    }

    public static void sort(int[] iArr, int i8, int i9) {
        Preconditions.checkNotNull(iArr);
        Preconditions.checkPositionIndexes(i8, i9, iArr.length);
        for (int i10 = i8; i10 < i9; i10++) {
            iArr[i10] = flip(iArr[i10]);
        }
        Arrays.sort(iArr, i8, i9);
        while (i8 < i9) {
            iArr[i8] = flip(iArr[i8]);
            i8++;
        }
    }

    public static void sortDescending(int[] iArr, int i8, int i9) {
        Preconditions.checkNotNull(iArr);
        Preconditions.checkPositionIndexes(i8, i9, iArr.length);
        for (int i10 = i8; i10 < i9; i10++) {
            iArr[i10] = Integer.MAX_VALUE ^ iArr[i10];
        }
        Arrays.sort(iArr, i8, i9);
        while (i8 < i9) {
            iArr[i8] = iArr[i8] ^ Integer.MAX_VALUE;
            i8++;
        }
    }
}
