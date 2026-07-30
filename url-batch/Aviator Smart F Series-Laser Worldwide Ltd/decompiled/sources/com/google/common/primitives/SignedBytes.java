package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public final class SignedBytes {
    public static final byte MAX_POWER_OF_TWO = 64;

    private enum LexicographicalComparator implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int min = Math.min(bArr.length, bArr2.length);
            for (int i8 = 0; i8 < min; i8++) {
                int compare = SignedBytes.compare(bArr[i8], bArr2[i8]);
                if (compare != 0) {
                    return compare;
                }
            }
            return bArr.length - bArr2.length;
        }
    }

    private SignedBytes() {
    }

    public static byte checkedCast(long j8) {
        byte b8 = (byte) j8;
        Preconditions.checkArgument(((long) b8) == j8, "Out of range: %s", j8);
        return b8;
    }

    public static int compare(byte b8, byte b9) {
        return b8 - b9;
    }

    public static String join(String str, byte... bArr) {
        Preconditions.checkNotNull(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 5);
        sb.append((int) bArr[0]);
        for (int i8 = 1; i8 < bArr.length; i8++) {
            sb.append(str);
            sb.append((int) bArr[i8]);
        }
        return sb.toString();
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static byte max(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        byte b8 = bArr[0];
        for (int i8 = 1; i8 < bArr.length; i8++) {
            byte b9 = bArr[i8];
            if (b9 > b8) {
                b8 = b9;
            }
        }
        return b8;
    }

    public static byte min(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        byte b8 = bArr[0];
        for (int i8 = 1; i8 < bArr.length; i8++) {
            byte b9 = bArr[i8];
            if (b9 < b8) {
                b8 = b9;
            }
        }
        return b8;
    }

    public static byte saturatedCast(long j8) {
        if (j8 > 127) {
            return Byte.MAX_VALUE;
        }
        return j8 < -128 ? UnsignedBytes.MAX_POWER_OF_TWO : (byte) j8;
    }

    public static void sortDescending(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sortDescending(bArr, 0, bArr.length);
    }

    public static void sortDescending(byte[] bArr, int i8, int i9) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i8, i9, bArr.length);
        Arrays.sort(bArr, i8, i9);
        Bytes.reverse(bArr, i8, i9);
    }
}
