package b7;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class n {
    private static final long M = 4294967295L;

    public static int add(int i8, int[] iArr, int[] iArr2, int[] iArr3) {
        long j8 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            long j9 = j8 + (iArr[i9] & 4294967295L) + (4294967295L & iArr2[i9]);
            iArr3[i9] = (int) j9;
            j8 = j9 >>> 32;
        }
        return (int) j8;
    }

    public static int add33At(int i8, int i9, int[] iArr, int i10) {
        long j8 = (iArr[i10] & 4294967295L) + (i9 & 4294967295L);
        iArr[i10] = (int) j8;
        long j9 = (j8 >>> 32) + (4294967295L & iArr[r4]) + 1;
        iArr[i10 + 1] = (int) j9;
        if ((j9 >>> 32) == 0) {
            return 0;
        }
        return incAt(i8, iArr, i10 + 2);
    }

    public static int add33To(int i8, int i9, int[] iArr) {
        long j8 = (iArr[0] & 4294967295L) + (i9 & 4294967295L);
        iArr[0] = (int) j8;
        long j9 = (j8 >>> 32) + (4294967295L & iArr[1]) + 1;
        iArr[1] = (int) j9;
        if ((j9 >>> 32) == 0) {
            return 0;
        }
        return incAt(i8, iArr, 2);
    }

    public static int addBothTo(int i8, int[] iArr, int i9, int[] iArr2, int i10, int[] iArr3, int i11) {
        long j8 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            long j9 = j8 + (iArr[i9 + i12] & 4294967295L) + (iArr2[i10 + i12] & 4294967295L) + (4294967295L & iArr3[r8]);
            iArr3[i11 + i12] = (int) j9;
            j8 = j9 >>> 32;
        }
        return (int) j8;
    }

    public static int addDWordAt(int i8, long j8, int[] iArr, int i9) {
        long j9 = (iArr[i9] & 4294967295L) + (j8 & 4294967295L);
        iArr[i9] = (int) j9;
        long j10 = (j9 >>> 32) + (4294967295L & iArr[r5]) + (j8 >>> 32);
        iArr[i9 + 1] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return incAt(i8, iArr, i9 + 2);
    }

    public static int addDWordTo(int i8, long j8, int[] iArr) {
        long j9 = (iArr[0] & 4294967295L) + (j8 & 4294967295L);
        iArr[0] = (int) j9;
        long j10 = (j9 >>> 32) + (4294967295L & iArr[1]) + (j8 >>> 32);
        iArr[1] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return incAt(i8, iArr, 2);
    }

    public static int addTo(int i8, int[] iArr, int i9, int[] iArr2, int i10) {
        long j8 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            long j9 = j8 + (iArr[i9 + i11] & 4294967295L) + (4294967295L & iArr2[r7]);
            iArr2[i10 + i11] = (int) j9;
            j8 = j9 >>> 32;
        }
        return (int) j8;
    }

    public static int addToEachOther(int i8, int[] iArr, int i9, int[] iArr2, int i10) {
        long j8 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            long j9 = j8 + (iArr[r3] & 4294967295L) + (4294967295L & iArr2[r8]);
            int i12 = (int) j9;
            iArr[i9 + i11] = i12;
            iArr2[i10 + i11] = i12;
            j8 = j9 >>> 32;
        }
        return (int) j8;
    }

    public static int addWordAt(int i8, int i9, int[] iArr, int i10) {
        long j8 = (i9 & 4294967295L) + (4294967295L & iArr[i10]);
        iArr[i10] = (int) j8;
        if ((j8 >>> 32) == 0) {
            return 0;
        }
        return incAt(i8, iArr, i10 + 1);
    }

    public static int addWordTo(int i8, int i9, int[] iArr) {
        long j8 = (i9 & 4294967295L) + (4294967295L & iArr[0]);
        iArr[0] = (int) j8;
        if ((j8 >>> 32) == 0) {
            return 0;
        }
        return incAt(i8, iArr, 1);
    }

    public static int cadd(int i8, int i9, int[] iArr, int[] iArr2, int[] iArr3) {
        long j8 = (-(i9 & 1)) & 4294967295L;
        long j9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            long j10 = j9 + (iArr[i10] & 4294967295L) + (iArr2[i10] & j8);
            iArr3[i10] = (int) j10;
            j9 = j10 >>> 32;
        }
        return (int) j9;
    }

    public static void cmov(int i8, int i9, int[] iArr, int i10, int[] iArr2, int i11) {
        int i12 = -(i9 & 1);
        for (int i13 = 0; i13 < i8; i13++) {
            int i14 = i11 + i13;
            int i15 = iArr2[i14];
            iArr2[i14] = i15 ^ ((iArr[i10 + i13] ^ i15) & i12);
        }
    }

    public static int compare(int i8, int[] iArr, int i9, int[] iArr2, int i10) {
        for (int i11 = i8 - 1; i11 >= 0; i11--) {
            int i12 = iArr[i9 + i11] ^ Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE ^ iArr2[i10 + i11];
            if (i12 < i13) {
                return -1;
            }
            if (i12 > i13) {
                return 1;
            }
        }
        return 0;
    }

    public static void copy(int i8, int[] iArr, int i9, int[] iArr2, int i10) {
        System.arraycopy(iArr, i9, iArr2, i10, i8);
    }

    public static void copy64(int i8, long[] jArr, int i9, long[] jArr2, int i10) {
        System.arraycopy(jArr, i9, jArr2, i10, i8);
    }

    public static int[] create(int i8) {
        return new int[i8];
    }

    public static long[] create64(int i8) {
        return new long[i8];
    }

    public static int csub(int i8, int i9, int[] iArr, int i10, int[] iArr2, int i11, int[] iArr3, int i12) {
        long j8 = (-(i9 & 1)) & 4294967295L;
        long j9 = 0;
        for (int i13 = 0; i13 < i8; i13++) {
            long j10 = j9 + ((iArr[i10 + i13] & 4294967295L) - (iArr2[i11 + i13] & j8));
            iArr3[i12 + i13] = (int) j10;
            j9 = j10 >> 32;
        }
        return (int) j9;
    }

    public static int dec(int i8, int[] iArr) {
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = iArr[i9] - 1;
            iArr[i9] = i10;
            if (i10 != -1) {
                return 0;
            }
        }
        return -1;
    }

    public static int decAt(int i8, int[] iArr, int i9) {
        while (i9 < i8) {
            int i10 = iArr[i9] - 1;
            iArr[i9] = i10;
            if (i10 != -1) {
                return 0;
            }
            i9++;
        }
        return -1;
    }

    public static boolean diff(int i8, int[] iArr, int i9, int[] iArr2, int i10, int[] iArr3, int i11) {
        boolean gte = gte(i8, iArr, i9, iArr2, i10);
        if (gte) {
            sub(i8, iArr, i9, iArr2, i10, iArr3, i11);
        } else {
            sub(i8, iArr2, i10, iArr, i9, iArr3, i11);
        }
        return gte;
    }

    public static boolean eq(int i8, int[] iArr, int[] iArr2) {
        for (int i9 = i8 - 1; i9 >= 0; i9--) {
            if (iArr[i9] != iArr2[i9]) {
                return false;
            }
        }
        return true;
    }

    public static int equalTo(int i8, int[] iArr, int i9) {
        int i10 = i9 ^ iArr[0];
        for (int i11 = 1; i11 < i8; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static int equalToZero(int i8, int[] iArr) {
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 |= iArr[i10];
        }
        return (((i9 >>> 1) | (i9 & 1)) - 1) >> 31;
    }

    public static int[] fromBigInteger(int i8, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i8) {
            throw new IllegalArgumentException();
        }
        int i9 = (i8 + 31) >> 5;
        int[] create = create(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            create[i10] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static long[] fromBigInteger64(int i8, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i8) {
            throw new IllegalArgumentException();
        }
        int i9 = (i8 + 63) >> 6;
        long[] create64 = create64(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            create64[i10] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return create64;
    }

    public static int getBit(int[] iArr, int i8) {
        int i9;
        if (i8 == 0) {
            i9 = iArr[0];
        } else {
            int i10 = i8 >> 5;
            if (i10 < 0 || i10 >= iArr.length) {
                return 0;
            }
            i9 = iArr[i10] >>> (i8 & 31);
        }
        return i9 & 1;
    }

    public static boolean gte(int i8, int[] iArr, int i9, int[] iArr2, int i10) {
        for (int i11 = i8 - 1; i11 >= 0; i11--) {
            int i12 = iArr[i9 + i11] ^ Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE ^ iArr2[i10 + i11];
            if (i12 < i13) {
                return false;
            }
            if (i12 > i13) {
                return true;
            }
        }
        return true;
    }

    public static int inc(int i8, int[] iArr) {
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = iArr[i9] + 1;
            iArr[i9] = i10;
            if (i10 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int incAt(int i8, int[] iArr, int i9) {
        while (i9 < i8) {
            int i10 = iArr[i9] + 1;
            iArr[i9] = i10;
            if (i10 != 0) {
                return 0;
            }
            i9++;
        }
        return 1;
    }

    public static boolean isOne(int i8, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i9 = 1; i9 < i8; i9++) {
            if (iArr[i9] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int i8, int[] iArr) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (iArr[i9] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int lessThan(int i8, int[] iArr, int i9, int[] iArr2, int i10) {
        long j8 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            j8 = (j8 + ((iArr[i9 + i11] & 4294967295L) - (4294967295L & iArr2[i10 + i11]))) >> 32;
        }
        return (int) j8;
    }

    public static void mul(int i8, int[] iArr, int i9, int[] iArr2, int i10, int[] iArr3, int i11) {
        iArr3[i11 + i8] = mulWord(i8, iArr[i9], iArr2, i10, iArr3, i11);
        for (int i12 = 1; i12 < i8; i12++) {
            int i13 = i11 + i12;
            iArr3[i13 + i8] = mulWordAddTo(i8, iArr[i9 + i12], iArr2, i10, iArr3, i13);
        }
    }

    public static int mul31BothAdd(int i8, int i9, int[] iArr, int i10, int[] iArr2, int[] iArr3, int i11) {
        long j8 = i9 & 4294967295L;
        long j9 = i10 & 4294967295L;
        long j10 = 0;
        int i12 = 0;
        do {
            long j11 = j10 + ((iArr[i12] & 4294967295L) * j8) + ((iArr2[i12] & 4294967295L) * j9) + (iArr3[r11] & 4294967295L);
            iArr3[i11 + i12] = (int) j11;
            j10 = j11 >>> 32;
            i12++;
        } while (i12 < i8);
        return (int) j10;
    }

    public static int mulAddTo(int i8, int[] iArr, int i9, int[] iArr2, int i10, int[] iArr3, int i11) {
        long j8 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            long mulWordAddTo = j8 + (mulWordAddTo(i8, iArr[i9 + i12], iArr2, i10, iArr3, i11) & 4294967295L) + (iArr3[r3] & 4294967295L);
            iArr3[i11 + i8] = (int) mulWordAddTo;
            j8 = mulWordAddTo >>> 32;
            i11++;
        }
        return (int) j8;
    }

    public static int mulWord(int i8, int i9, int[] iArr, int i10, int[] iArr2, int i11) {
        long j8 = i9 & 4294967295L;
        long j9 = 0;
        int i12 = 0;
        do {
            long j10 = j9 + ((iArr[i10 + i12] & 4294967295L) * j8);
            iArr2[i11 + i12] = (int) j10;
            j9 = j10 >>> 32;
            i12++;
        } while (i12 < i8);
        return (int) j9;
    }

    public static int mulWordAddTo(int i8, int i9, int[] iArr, int i10, int[] iArr2, int i11) {
        long j8 = i9 & 4294967295L;
        long j9 = 0;
        int i12 = 0;
        do {
            long j10 = j9 + ((iArr[i10 + i12] & 4294967295L) * j8) + (iArr2[r9] & 4294967295L);
            iArr2[i11 + i12] = (int) j10;
            j9 = j10 >>> 32;
            i12++;
        } while (i12 < i8);
        return (int) j9;
    }

    public static int mulWordDwordAddAt(int i8, int i9, long j8, int[] iArr, int i10) {
        long j9 = i9 & 4294967295L;
        long j10 = ((j8 & 4294967295L) * j9) + (iArr[i10] & 4294967295L);
        iArr[i10] = (int) j10;
        long j11 = j9 * (j8 >>> 32);
        long j12 = (j10 >>> 32) + j11 + (iArr[r10] & 4294967295L);
        iArr[i10 + 1] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[r0] & 4294967295L);
        iArr[i10 + 2] = (int) j13;
        if ((j13 >>> 32) == 0) {
            return 0;
        }
        return incAt(i8, iArr, i10 + 3);
    }

    public static int shiftDownBit(int i8, int[] iArr, int i9) {
        while (true) {
            i8--;
            if (i8 < 0) {
                return i9 << 31;
            }
            int i10 = iArr[i8];
            iArr[i8] = (i9 << 31) | (i10 >>> 1);
            i9 = i10;
        }
    }

    public static int shiftDownBits(int i8, int[] iArr, int i9, int i10) {
        while (true) {
            i8--;
            if (i8 < 0) {
                return i10 << (-i9);
            }
            int i11 = iArr[i8];
            iArr[i8] = (i10 << (-i9)) | (i11 >>> i9);
            i10 = i11;
        }
    }

    public static int shiftDownWord(int i8, int[] iArr, int i9) {
        while (true) {
            i8--;
            if (i8 < 0) {
                return i9;
            }
            int i10 = iArr[i8];
            iArr[i8] = i9;
            i9 = i10;
        }
    }

    public static int shiftUpBit(int i8, int[] iArr, int i9) {
        int i10 = 0;
        while (i10 < i8) {
            int i11 = iArr[i10];
            iArr[i10] = (i9 >>> 31) | (i11 << 1);
            i10++;
            i9 = i11;
        }
        return i9 >>> 31;
    }

    public static long shiftUpBit64(int i8, long[] jArr, int i9, long j8, long[] jArr2, int i10) {
        int i11 = 0;
        while (i11 < i8) {
            long j9 = jArr[i9 + i11];
            jArr2[i10 + i11] = (j8 >>> 63) | (j9 << 1);
            i11++;
            j8 = j9;
        }
        return j8 >>> 63;
    }

    public static int shiftUpBits(int i8, int[] iArr, int i9, int i10) {
        int i11 = 0;
        while (i11 < i8) {
            int i12 = iArr[i11];
            iArr[i11] = (i10 >>> (-i9)) | (i12 << i9);
            i11++;
            i10 = i12;
        }
        return i10 >>> (-i9);
    }

    public static long shiftUpBits64(int i8, long[] jArr, int i9, int i10, long j8) {
        int i11 = 0;
        while (i11 < i8) {
            int i12 = i9 + i11;
            long j9 = jArr[i12];
            jArr[i12] = (j8 >>> (-i10)) | (j9 << i10);
            i11++;
            j8 = j9;
        }
        return j8 >>> (-i10);
    }

    public static void square(int i8, int[] iArr, int i9, int[] iArr2, int i10) {
        int i11;
        int i12 = i8 << 1;
        int i13 = 0;
        int i14 = i8;
        int i15 = i12;
        do {
            i14--;
            long j8 = iArr[i9 + i14] & 4294967295L;
            long j9 = j8 * j8;
            iArr2[(i15 - 1) + i10] = (i13 << 31) | ((int) (j9 >>> 33));
            i15 -= 2;
            iArr2[i10 + i15] = (int) (j9 >>> 1);
            i13 = (int) j9;
        } while (i14 > 0);
        int i16 = i10 + 2;
        long j10 = 0;
        for (i11 = 1; i11 < i8; i11++) {
            long squareWordAddTo = j10 + (squareWordAddTo(iArr, i9, i11, iArr2, i10) & 4294967295L) + (iArr2[i16] & 4294967295L);
            int i17 = i16 + 1;
            iArr2[i16] = (int) squareWordAddTo;
            long j11 = (squareWordAddTo >>> 32) + (iArr2[i17] & 4294967295L);
            i16 += 2;
            iArr2[i17] = (int) j11;
            j10 = j11 >>> 32;
        }
        shiftUpBit(i12, iArr2, i10, iArr[i9] << 31);
    }

    public static int squareWordAdd(int[] iArr, int i8, int i9, int[] iArr2, int i10) {
        long j8 = iArr[i8 + i9] & 4294967295L;
        long j9 = 0;
        int i11 = 0;
        int i12 = i10;
        do {
            long j10 = j9 + ((iArr[i8 + i11] & 4294967295L) * j8) + (iArr2[r11] & 4294967295L);
            iArr2[i9 + i12] = (int) j10;
            j9 = j10 >>> 32;
            i12++;
            i11++;
        } while (i11 < i9);
        return (int) j9;
    }

    public static int squareWordAddTo(int[] iArr, int i8, int i9, int[] iArr2, int i10) {
        long j8 = iArr[i8 + i9] & 4294967295L;
        long j9 = 0;
        int i11 = 0;
        int i12 = i10;
        do {
            long j10 = j9 + ((iArr[i8 + i11] & 4294967295L) * j8) + (iArr2[r11] & 4294967295L);
            iArr2[i9 + i12] = (int) j10;
            j9 = j10 >>> 32;
            i12++;
            i11++;
        } while (i11 < i9);
        return (int) j9;
    }

    public static int sub(int i8, int[] iArr, int i9, int[] iArr2, int i10, int[] iArr3, int i11) {
        long j8 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            long j9 = j8 + ((iArr[i9 + i12] & 4294967295L) - (4294967295L & iArr2[i10 + i12]));
            iArr3[i11 + i12] = (int) j9;
            j8 = j9 >> 32;
        }
        return (int) j8;
    }

    public static int sub33At(int i8, int i9, int[] iArr, int i10) {
        long j8 = (iArr[i10] & 4294967295L) - (i9 & 4294967295L);
        iArr[i10] = (int) j8;
        long j9 = (j8 >> 32) + ((4294967295L & iArr[r4]) - 1);
        iArr[i10 + 1] = (int) j9;
        if ((j9 >> 32) == 0) {
            return 0;
        }
        return decAt(i8, iArr, i10 + 2);
    }

    public static int sub33From(int i8, int i9, int[] iArr) {
        long j8 = (iArr[0] & 4294967295L) - (i9 & 4294967295L);
        iArr[0] = (int) j8;
        long j9 = (j8 >> 32) + ((4294967295L & iArr[1]) - 1);
        iArr[1] = (int) j9;
        if ((j9 >> 32) == 0) {
            return 0;
        }
        return decAt(i8, iArr, 2);
    }

    public static int subBothFrom(int i8, int[] iArr, int i9, int[] iArr2, int i10, int[] iArr3, int i11) {
        long j8 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            long j9 = j8 + (((iArr3[r4] & 4294967295L) - (iArr[i9 + i12] & 4294967295L)) - (4294967295L & iArr2[i10 + i12]));
            iArr3[i11 + i12] = (int) j9;
            j8 = j9 >> 32;
        }
        return (int) j8;
    }

    public static int subDWordAt(int i8, long j8, int[] iArr, int i9) {
        long j9 = (iArr[i9] & 4294967295L) - (j8 & 4294967295L);
        iArr[i9] = (int) j9;
        long j10 = (j9 >> 32) + ((4294967295L & iArr[r5]) - (j8 >>> 32));
        iArr[i9 + 1] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return decAt(i8, iArr, i9 + 2);
    }

    public static int subDWordFrom(int i8, long j8, int[] iArr) {
        long j9 = (iArr[0] & 4294967295L) - (j8 & 4294967295L);
        iArr[0] = (int) j9;
        long j10 = (j9 >> 32) + ((4294967295L & iArr[1]) - (j8 >>> 32));
        iArr[1] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return decAt(i8, iArr, 2);
    }

    public static int subFrom(int i8, int[] iArr, int i9, int[] iArr2, int i10) {
        long j8 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            long j9 = j8 + ((iArr2[r3] & 4294967295L) - (4294967295L & iArr[i9 + i11]));
            iArr2[i10 + i11] = (int) j9;
            j8 = j9 >> 32;
        }
        return (int) j8;
    }

    public static int subWordAt(int i8, int i9, int[] iArr, int i10) {
        long j8 = (iArr[i10] & 4294967295L) - (4294967295L & i9);
        iArr[i10] = (int) j8;
        if ((j8 >> 32) == 0) {
            return 0;
        }
        return decAt(i8, iArr, i10 + 1);
    }

    public static int subWordFrom(int i8, int i9, int[] iArr) {
        long j8 = (iArr[0] & 4294967295L) - (4294967295L & i9);
        iArr[0] = (int) j8;
        if ((j8 >> 32) == 0) {
            return 0;
        }
        return decAt(i8, iArr, 1);
    }

    public static BigInteger toBigInteger(int i8, int[] iArr) {
        byte[] bArr = new byte[i8 << 2];
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = iArr[i9];
            if (i10 != 0) {
                org.bouncycastle.util.i.intToBigEndian(i10, bArr, ((i8 - 1) - i9) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int i8, int[] iArr) {
        for (int i9 = 0; i9 < i8; i9++) {
            iArr[i9] = 0;
        }
    }

    public static void zero64(int i8, long[] jArr) {
        for (int i9 = 0; i9 < i8; i9++) {
            jArr[i9] = 0;
        }
    }

    public static int add33At(int i8, int i9, int[] iArr, int i10, int i11) {
        int i12 = i10 + i11;
        long j8 = (iArr[i12] & 4294967295L) + (i9 & 4294967295L);
        iArr[i12] = (int) j8;
        long j9 = (j8 >>> 32) + (4294967295L & iArr[r0]) + 1;
        iArr[i12 + 1] = (int) j9;
        if ((j9 >>> 32) == 0) {
            return 0;
        }
        return incAt(i8, iArr, i10, i11 + 2);
    }

    public static int add33To(int i8, int i9, int[] iArr, int i10) {
        long j8 = (iArr[i10] & 4294967295L) + (i9 & 4294967295L);
        iArr[i10] = (int) j8;
        long j9 = (j8 >>> 32) + (4294967295L & iArr[r4]) + 1;
        iArr[i10 + 1] = (int) j9;
        if ((j9 >>> 32) == 0) {
            return 0;
        }
        return incAt(i8, iArr, i10, 2);
    }

    public static int addBothTo(int i8, int[] iArr, int[] iArr2, int[] iArr3) {
        long j8 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            long j9 = j8 + (iArr[i9] & 4294967295L) + (iArr2[i9] & 4294967295L) + (4294967295L & iArr3[i9]);
            iArr3[i9] = (int) j9;
            j8 = j9 >>> 32;
        }
        return (int) j8;
    }

    public static int addDWordAt(int i8, long j8, int[] iArr, int i9, int i10) {
        int i11 = i9 + i10;
        long j9 = (iArr[i11] & 4294967295L) + (j8 & 4294967295L);
        iArr[i11] = (int) j9;
        long j10 = (j9 >>> 32) + (4294967295L & iArr[r0]) + (j8 >>> 32);
        iArr[i11 + 1] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return incAt(i8, iArr, i9, i10 + 2);
    }

    public static int addDWordTo(int i8, long j8, int[] iArr, int i9) {
        long j9 = (iArr[i9] & 4294967295L) + (j8 & 4294967295L);
        iArr[i9] = (int) j9;
        long j10 = (j9 >>> 32) + (4294967295L & iArr[r5]) + (j8 >>> 32);
        iArr[i9 + 1] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return incAt(i8, iArr, i9, 2);
    }

    public static int addTo(int i8, int[] iArr, int i9, int[] iArr2, int i10, int i11) {
        long j8 = i11 & 4294967295L;
        for (int i12 = 0; i12 < i8; i12++) {
            long j9 = j8 + (iArr[i9 + i12] & 4294967295L) + (iArr2[r6] & 4294967295L);
            iArr2[i10 + i12] = (int) j9;
            j8 = j9 >>> 32;
        }
        return (int) j8;
    }

    public static int addWordAt(int i8, int i9, int[] iArr, int i10, int i11) {
        long j8 = i9 & 4294967295L;
        long j9 = j8 + (4294967295L & iArr[r7]);
        iArr[i10 + i11] = (int) j9;
        if ((j9 >>> 32) == 0) {
            return 0;
        }
        return incAt(i8, iArr, i10, i11 + 1);
    }

    public static int addWordTo(int i8, int i9, int[] iArr, int i10) {
        long j8 = (i9 & 4294967295L) + (4294967295L & iArr[i10]);
        iArr[i10] = (int) j8;
        if ((j8 >>> 32) == 0) {
            return 0;
        }
        return incAt(i8, iArr, i10, 1);
    }

    public static int compare(int i8, int[] iArr, int[] iArr2) {
        for (int i9 = i8 - 1; i9 >= 0; i9--) {
            int i10 = iArr[i9] ^ Integer.MIN_VALUE;
            int i11 = Integer.MIN_VALUE ^ iArr2[i9];
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
        }
        return 0;
    }

    public static void copy(int i8, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, 0, iArr2, 0, i8);
    }

    public static void copy64(int i8, long[] jArr, long[] jArr2) {
        System.arraycopy(jArr, 0, jArr2, 0, i8);
    }

    public static int csub(int i8, int i9, int[] iArr, int[] iArr2, int[] iArr3) {
        long j8 = (-(i9 & 1)) & 4294967295L;
        long j9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            long j10 = j9 + ((iArr[i10] & 4294967295L) - (iArr2[i10] & j8));
            iArr3[i10] = (int) j10;
            j9 = j10 >> 32;
        }
        return (int) j9;
    }

    public static int dec(int i8, int[] iArr, int[] iArr2) {
        int i9 = 0;
        while (i9 < i8) {
            int i10 = iArr[i9] - 1;
            iArr2[i9] = i10;
            i9++;
            if (i10 != -1) {
                while (i9 < i8) {
                    iArr2[i9] = iArr[i9];
                    i9++;
                }
                return 0;
            }
        }
        return -1;
    }

    public static int decAt(int i8, int[] iArr, int i9, int i10) {
        while (i10 < i8) {
            int i11 = i9 + i10;
            int i12 = iArr[i11] - 1;
            iArr[i11] = i12;
            if (i12 != -1) {
                return 0;
            }
            i10++;
        }
        return -1;
    }

    public static int equalTo(int i8, int[] iArr, int i9, int i10) {
        int i11 = i10 ^ iArr[i9];
        for (int i12 = 1; i12 < i8; i12++) {
            i11 |= iArr[i9 + i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static int equalToZero(int i8, int[] iArr, int i9) {
        int i10 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            i10 |= iArr[i9 + i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static boolean gte(int i8, int[] iArr, int[] iArr2) {
        for (int i9 = i8 - 1; i9 >= 0; i9--) {
            int i10 = iArr[i9] ^ Integer.MIN_VALUE;
            int i11 = Integer.MIN_VALUE ^ iArr2[i9];
            if (i10 < i11) {
                return false;
            }
            if (i10 > i11) {
                return true;
            }
        }
        return true;
    }

    public static int inc(int i8, int[] iArr, int[] iArr2) {
        int i9 = 0;
        while (i9 < i8) {
            int i10 = iArr[i9] + 1;
            iArr2[i9] = i10;
            i9++;
            if (i10 != 0) {
                while (i9 < i8) {
                    iArr2[i9] = iArr[i9];
                    i9++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static int incAt(int i8, int[] iArr, int i9, int i10) {
        while (i10 < i8) {
            int i11 = i9 + i10;
            int i12 = iArr[i11] + 1;
            iArr[i11] = i12;
            if (i12 != 0) {
                return 0;
            }
            i10++;
        }
        return 1;
    }

    public static int lessThan(int i8, int[] iArr, int[] iArr2) {
        long j8 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            j8 = (j8 + ((iArr[i9] & 4294967295L) - (4294967295L & iArr2[i9]))) >> 32;
        }
        return (int) j8;
    }

    public static void mul(int i8, int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[i8] = mulWord(i8, iArr[0], iArr2, iArr3);
        for (int i9 = 1; i9 < i8; i9++) {
            iArr3[i9 + i8] = mulWordAddTo(i8, iArr[i9], iArr2, 0, iArr3, i9);
        }
    }

    public static int mulAddTo(int i8, int[] iArr, int[] iArr2, int[] iArr3) {
        long j8 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            long mulWordAddTo = j8 + (mulWordAddTo(i8, iArr[i9], iArr2, 0, iArr3, i9) & 4294967295L) + (iArr3[r2] & 4294967295L);
            iArr3[i9 + i8] = (int) mulWordAddTo;
            j8 = mulWordAddTo >>> 32;
        }
        return (int) j8;
    }

    public static int mulWord(int i8, int i9, int[] iArr, int[] iArr2) {
        long j8 = i9 & 4294967295L;
        long j9 = 0;
        int i10 = 0;
        do {
            long j10 = j9 + ((iArr[i10] & 4294967295L) * j8);
            iArr2[i10] = (int) j10;
            j9 = j10 >>> 32;
            i10++;
        } while (i10 < i8);
        return (int) j9;
    }

    public static int shiftDownBit(int i8, int[] iArr, int i9, int i10) {
        while (true) {
            i8--;
            if (i8 < 0) {
                return i10 << 31;
            }
            int i11 = i9 + i8;
            int i12 = iArr[i11];
            iArr[i11] = (i10 << 31) | (i12 >>> 1);
            i10 = i12;
        }
    }

    public static int shiftDownBits(int i8, int[] iArr, int i9, int i10, int i11) {
        while (true) {
            i8--;
            if (i8 < 0) {
                return i11 << (-i10);
            }
            int i12 = i9 + i8;
            int i13 = iArr[i12];
            iArr[i12] = (i11 << (-i10)) | (i13 >>> i10);
            i11 = i13;
        }
    }

    public static int shiftUpBit(int i8, int[] iArr, int i9, int i10) {
        int i11 = 0;
        while (i11 < i8) {
            int i12 = i9 + i11;
            int i13 = iArr[i12];
            iArr[i12] = (i10 >>> 31) | (i13 << 1);
            i11++;
            i10 = i13;
        }
        return i10 >>> 31;
    }

    public static int shiftUpBits(int i8, int[] iArr, int i9, int i10, int i11) {
        int i12 = 0;
        while (i12 < i8) {
            int i13 = i9 + i12;
            int i14 = iArr[i13];
            iArr[i13] = (i11 >>> (-i10)) | (i14 << i10);
            i12++;
            i11 = i14;
        }
        return i11 >>> (-i10);
    }

    public static long shiftUpBits64(int i8, long[] jArr, int i9, int i10, long j8, long[] jArr2, int i11) {
        int i12 = 0;
        while (i12 < i8) {
            long j9 = jArr[i9 + i12];
            jArr2[i11 + i12] = (j8 >>> (-i10)) | (j9 << i10);
            i12++;
            j8 = j9;
        }
        return j8 >>> (-i10);
    }

    public static void square(int i8, int[] iArr, int[] iArr2) {
        int i9;
        int i10 = i8 << 1;
        int i11 = 0;
        int i12 = i8;
        int i13 = i10;
        while (true) {
            i12--;
            long j8 = iArr[i12] & 4294967295L;
            long j9 = j8 * j8;
            iArr2[i13 - 1] = (i11 << 31) | ((int) (j9 >>> 33));
            i13 -= 2;
            iArr2[i13] = (int) (j9 >>> 1);
            int i14 = (int) j9;
            if (i12 <= 0) {
                break;
            } else {
                i11 = i14;
            }
        }
        long j10 = 0;
        int i15 = 2;
        for (i9 = 1; i9 < i8; i9++) {
            long squareWordAddTo = j10 + (squareWordAddTo(iArr, i9, iArr2) & 4294967295L) + (iArr2[i15] & 4294967295L);
            int i16 = i15 + 1;
            iArr2[i15] = (int) squareWordAddTo;
            long j11 = (squareWordAddTo >>> 32) + (iArr2[i16] & 4294967295L);
            i15 += 2;
            iArr2[i16] = (int) j11;
            j10 = j11 >>> 32;
        }
        shiftUpBit(i10, iArr2, iArr[0] << 31);
    }

    public static int squareWordAdd(int[] iArr, int i8, int[] iArr2) {
        long j8 = iArr[i8] & 4294967295L;
        long j9 = 0;
        int i9 = 0;
        do {
            long j10 = j9 + ((iArr[i9] & 4294967295L) * j8) + (iArr2[r9] & 4294967295L);
            iArr2[i8 + i9] = (int) j10;
            j9 = j10 >>> 32;
            i9++;
        } while (i9 < i8);
        return (int) j9;
    }

    public static int squareWordAddTo(int[] iArr, int i8, int[] iArr2) {
        long j8 = iArr[i8] & 4294967295L;
        long j9 = 0;
        int i9 = 0;
        do {
            long j10 = j9 + ((iArr[i9] & 4294967295L) * j8) + (iArr2[r9] & 4294967295L);
            iArr2[i8 + i9] = (int) j10;
            j9 = j10 >>> 32;
            i9++;
        } while (i9 < i8);
        return (int) j9;
    }

    public static int sub(int i8, int[] iArr, int[] iArr2, int[] iArr3) {
        long j8 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            long j9 = j8 + ((iArr[i9] & 4294967295L) - (4294967295L & iArr2[i9]));
            iArr3[i9] = (int) j9;
            j8 = j9 >> 32;
        }
        return (int) j8;
    }

    public static int sub33At(int i8, int i9, int[] iArr, int i10, int i11) {
        int i12 = i10 + i11;
        long j8 = (iArr[i12] & 4294967295L) - (i9 & 4294967295L);
        iArr[i12] = (int) j8;
        long j9 = (j8 >> 32) + ((4294967295L & iArr[r0]) - 1);
        iArr[i12 + 1] = (int) j9;
        if ((j9 >> 32) == 0) {
            return 0;
        }
        return decAt(i8, iArr, i10, i11 + 2);
    }

    public static int sub33From(int i8, int i9, int[] iArr, int i10) {
        long j8 = (iArr[i10] & 4294967295L) - (i9 & 4294967295L);
        iArr[i10] = (int) j8;
        long j9 = (j8 >> 32) + ((4294967295L & iArr[r4]) - 1);
        iArr[i10 + 1] = (int) j9;
        if ((j9 >> 32) == 0) {
            return 0;
        }
        return decAt(i8, iArr, i10, 2);
    }

    public static int subBothFrom(int i8, int[] iArr, int[] iArr2, int[] iArr3) {
        long j8 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            long j9 = j8 + (((iArr3[i9] & 4294967295L) - (iArr[i9] & 4294967295L)) - (4294967295L & iArr2[i9]));
            iArr3[i9] = (int) j9;
            j8 = j9 >> 32;
        }
        return (int) j8;
    }

    public static int subDWordAt(int i8, long j8, int[] iArr, int i9, int i10) {
        int i11 = i9 + i10;
        long j9 = (iArr[i11] & 4294967295L) - (j8 & 4294967295L);
        iArr[i11] = (int) j9;
        long j10 = (j9 >> 32) + ((4294967295L & iArr[r0]) - (j8 >>> 32));
        iArr[i11 + 1] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return decAt(i8, iArr, i9, i10 + 2);
    }

    public static int subDWordFrom(int i8, long j8, int[] iArr, int i9) {
        long j9 = (iArr[i9] & 4294967295L) - (j8 & 4294967295L);
        iArr[i9] = (int) j9;
        long j10 = (j9 >> 32) + ((4294967295L & iArr[r5]) - (j8 >>> 32));
        iArr[i9 + 1] = (int) j10;
        if ((j10 >> 32) == 0) {
            return 0;
        }
        return decAt(i8, iArr, i9, 2);
    }

    public static int subFrom(int i8, int[] iArr, int[] iArr2) {
        long j8 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            long j9 = j8 + ((iArr2[i9] & 4294967295L) - (4294967295L & iArr[i9]));
            iArr2[i9] = (int) j9;
            j8 = j9 >> 32;
        }
        return (int) j8;
    }

    public static int subWordAt(int i8, int i9, int[] iArr, int i10, int i11) {
        long j8 = (iArr[r0] & 4294967295L) - (4294967295L & i9);
        iArr[i10 + i11] = (int) j8;
        if ((j8 >> 32) == 0) {
            return 0;
        }
        return decAt(i8, iArr, i10, i11 + 1);
    }

    public static int subWordFrom(int i8, int i9, int[] iArr, int i10) {
        long j8 = (iArr[i10] & 4294967295L) - (4294967295L & i9);
        iArr[i10] = (int) j8;
        if ((j8 >> 32) == 0) {
            return 0;
        }
        return decAt(i8, iArr, i10, 1);
    }

    public static void zero(int i8, int[] iArr, int i9) {
        for (int i10 = 0; i10 < i8; i10++) {
            iArr[i9 + i10] = 0;
        }
    }

    public static int addTo(int i8, int[] iArr, int[] iArr2) {
        long j8 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            long j9 = j8 + (iArr[i9] & 4294967295L) + (4294967295L & iArr2[i9]);
            iArr2[i9] = (int) j9;
            j8 = j9 >>> 32;
        }
        return (int) j8;
    }

    public static int[] copy(int i8, int[] iArr) {
        int[] iArr2 = new int[i8];
        System.arraycopy(iArr, 0, iArr2, 0, i8);
        return iArr2;
    }

    public static long[] copy64(int i8, long[] jArr) {
        long[] jArr2 = new long[i8];
        System.arraycopy(jArr, 0, jArr2, 0, i8);
        return jArr2;
    }

    public static int equalTo(int i8, int[] iArr, int i9, int[] iArr2, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            i11 |= iArr[i9 + i12] ^ iArr2[i10 + i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void mul(int[] iArr, int i8, int i9, int[] iArr2, int i10, int i11, int[] iArr3, int i12) {
        iArr3[i12 + i11] = mulWord(i11, iArr[i8], iArr2, i10, iArr3, i12);
        for (int i13 = 1; i13 < i9; i13++) {
            int i14 = i12 + i13;
            iArr3[i14 + i11] = mulWordAddTo(i11, iArr[i8 + i13], iArr2, i10, iArr3, i14);
        }
    }

    public static int shiftDownBit(int i8, int[] iArr, int i9, int i10, int[] iArr2, int i11) {
        while (true) {
            i8--;
            if (i8 < 0) {
                return i10 << 31;
            }
            int i12 = iArr[i9 + i8];
            iArr2[i11 + i8] = (i10 << 31) | (i12 >>> 1);
            i10 = i12;
        }
    }

    public static int shiftDownBits(int i8, int[] iArr, int i9, int i10, int i11, int[] iArr2, int i12) {
        while (true) {
            i8--;
            if (i8 < 0) {
                return i11 << (-i10);
            }
            int i13 = iArr[i9 + i8];
            iArr2[i12 + i8] = (i11 << (-i10)) | (i13 >>> i10);
            i11 = i13;
        }
    }

    public static int shiftUpBit(int i8, int[] iArr, int i9, int i10, int[] iArr2, int i11) {
        int i12 = 0;
        while (i12 < i8) {
            int i13 = iArr[i9 + i12];
            iArr2[i11 + i12] = (i10 >>> 31) | (i13 << 1);
            i12++;
            i10 = i13;
        }
        return i10 >>> 31;
    }

    public static int shiftUpBits(int i8, int[] iArr, int i9, int i10, int i11, int[] iArr2, int i12) {
        int i13 = 0;
        while (i13 < i8) {
            int i14 = iArr[i9 + i13];
            iArr2[i12 + i13] = (i11 >>> (-i10)) | (i14 << i10);
            i13++;
            i11 = i14;
        }
        return i11 >>> (-i10);
    }

    public static int equalTo(int i8, int[] iArr, int[] iArr2) {
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 |= iArr[i10] ^ iArr2[i10];
        }
        return (((i9 >>> 1) | (i9 & 1)) - 1) >> 31;
    }

    public static int shiftDownBit(int i8, int[] iArr, int i9, int[] iArr2) {
        while (true) {
            i8--;
            if (i8 < 0) {
                return i9 << 31;
            }
            int i10 = iArr[i8];
            iArr2[i8] = (i9 << 31) | (i10 >>> 1);
            i9 = i10;
        }
    }

    public static int shiftDownBits(int i8, int[] iArr, int i9, int i10, int[] iArr2) {
        while (true) {
            i8--;
            if (i8 < 0) {
                return i10 << (-i9);
            }
            int i11 = iArr[i8];
            iArr2[i8] = (i10 << (-i9)) | (i11 >>> i9);
            i10 = i11;
        }
    }

    public static int shiftUpBit(int i8, int[] iArr, int i9, int[] iArr2) {
        int i10 = 0;
        while (i10 < i8) {
            int i11 = iArr[i10];
            iArr2[i10] = (i9 >>> 31) | (i11 << 1);
            i10++;
            i9 = i11;
        }
        return i9 >>> 31;
    }

    public static int shiftUpBits(int i8, int[] iArr, int i9, int i10, int[] iArr2) {
        int i11 = 0;
        while (i11 < i8) {
            int i12 = iArr[i11];
            iArr2[i11] = (i10 >>> (-i9)) | (i12 << i9);
            i11++;
            i10 = i12;
        }
        return i10 >>> (-i9);
    }
}
