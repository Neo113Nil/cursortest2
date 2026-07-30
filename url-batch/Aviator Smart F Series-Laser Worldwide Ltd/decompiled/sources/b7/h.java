package b7;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class h {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int i8, int[] iArr2, int i9, int[] iArr3, int i10) {
        long j8 = (iArr[i8] & 4294967295L) + (iArr2[i9] & 4294967295L);
        iArr3[i10] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[i8 + 1] & 4294967295L) + (iArr2[i9 + 1] & 4294967295L);
        iArr3[i10 + 1] = (int) j9;
        long j10 = (j9 >>> 32) + (iArr[i8 + 2] & 4294967295L) + (iArr2[i9 + 2] & 4294967295L);
        iArr3[i10 + 2] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[i8 + 3] & 4294967295L) + (iArr2[i9 + 3] & 4294967295L);
        iArr3[i10 + 3] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[i8 + 4] & 4294967295L) + (iArr2[i9 + 4] & 4294967295L);
        iArr3[i10 + 4] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[i8 + 5] & 4294967295L) + (iArr2[i9 + 5] & 4294967295L);
        iArr3[i10 + 5] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[i8 + 6] & 4294967295L) + (iArr2[i9 + 6] & 4294967295L);
        iArr3[i10 + 6] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[i8 + 7] & 4294967295L) + (iArr2[i9 + 7] & 4294967295L);
        iArr3[i10 + 7] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i8, int[] iArr2, int i9, int[] iArr3, int i10) {
        long j8 = (iArr[i8] & 4294967295L) + (iArr2[i9] & 4294967295L) + (iArr3[i10] & 4294967295L);
        iArr3[i10] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[i8 + 1] & 4294967295L) + (iArr2[i9 + 1] & 4294967295L) + (iArr3[r7] & 4294967295L);
        iArr3[i10 + 1] = (int) j9;
        long j10 = (j9 >>> 32) + (iArr[i8 + 2] & 4294967295L) + (iArr2[i9 + 2] & 4294967295L) + (iArr3[r7] & 4294967295L);
        iArr3[i10 + 2] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[i8 + 3] & 4294967295L) + (iArr2[i9 + 3] & 4294967295L) + (iArr3[r7] & 4294967295L);
        iArr3[i10 + 3] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[i8 + 4] & 4294967295L) + (iArr2[i9 + 4] & 4294967295L) + (iArr3[r7] & 4294967295L);
        iArr3[i10 + 4] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[i8 + 5] & 4294967295L) + (iArr2[i9 + 5] & 4294967295L) + (iArr3[r7] & 4294967295L);
        iArr3[i10 + 5] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[i8 + 6] & 4294967295L) + (iArr2[i9 + 6] & 4294967295L) + (iArr3[r7] & 4294967295L);
        iArr3[i10 + 6] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[i8 + 7] & 4294967295L) + (iArr2[i9 + 7] & 4294967295L) + (iArr3[r15] & 4294967295L);
        iArr3[i10 + 7] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int addTo(int[] iArr, int i8, int[] iArr2, int i9, int i10) {
        long j8 = (i10 & 4294967295L) + (iArr[i8] & 4294967295L) + (iArr2[i9] & 4294967295L);
        iArr2[i9] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[i8 + 1] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i9 + 1] = (int) j9;
        long j10 = (j9 >>> 32) + (iArr[i8 + 2] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i9 + 2] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[i8 + 3] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i9 + 3] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[i8 + 4] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i9 + 4] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[i8 + 5] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i9 + 5] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[i8 + 6] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i9 + 6] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[i8 + 7] & 4294967295L) + (4294967295L & iArr2[r12]);
        iArr2[i9 + 7] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i8, int[] iArr2, int i9) {
        long j8 = (iArr[i8] & 4294967295L) + (iArr2[i9] & 4294967295L);
        int i10 = (int) j8;
        iArr[i8] = i10;
        iArr2[i9] = i10;
        long j9 = (j8 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i11 = (int) j9;
        iArr[i8 + 1] = i11;
        iArr2[i9 + 1] = i11;
        long j10 = (j9 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i12 = (int) j10;
        iArr[i8 + 2] = i12;
        iArr2[i9 + 2] = i12;
        long j11 = (j10 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i13 = (int) j11;
        iArr[i8 + 3] = i13;
        iArr2[i9 + 3] = i13;
        long j12 = (j11 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i14 = (int) j12;
        iArr[i8 + 4] = i14;
        iArr2[i9 + 4] = i14;
        long j13 = (j12 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i15 = (int) j13;
        iArr[i8 + 5] = i15;
        iArr2[i9 + 5] = i15;
        long j14 = (j13 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i16 = (int) j14;
        iArr[i8 + 6] = i16;
        iArr2[i9 + 6] = i16;
        long j15 = (j14 >>> 32) + (iArr[r12] & 4294967295L) + (4294967295L & iArr2[r14]);
        int i17 = (int) j15;
        iArr[i8 + 7] = i17;
        iArr2[i9 + 7] = i17;
        return (int) (j15 >>> 32);
    }

    public static void copy(int[] iArr, int i8, int[] iArr2, int i9) {
        iArr2[i9] = iArr[i8];
        iArr2[i9 + 1] = iArr[i8 + 1];
        iArr2[i9 + 2] = iArr[i8 + 2];
        iArr2[i9 + 3] = iArr[i8 + 3];
        iArr2[i9 + 4] = iArr[i8 + 4];
        iArr2[i9 + 5] = iArr[i8 + 5];
        iArr2[i9 + 6] = iArr[i8 + 6];
        iArr2[i9 + 7] = iArr[i8 + 7];
    }

    public static void copy64(long[] jArr, int i8, long[] jArr2, int i9) {
        jArr2[i9] = jArr[i8];
        jArr2[i9 + 1] = jArr[i8 + 1];
        jArr2[i9 + 2] = jArr[i8 + 2];
        jArr2[i9 + 3] = jArr[i8 + 3];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static long[] createExt64() {
        return new long[8];
    }

    public static boolean diff(int[] iArr, int i8, int[] iArr2, int i9, int[] iArr3, int i10) {
        boolean gte = gte(iArr, i8, iArr2, i9);
        if (gte) {
            sub(iArr, i8, iArr2, i9, iArr3, i10);
        } else {
            sub(iArr2, i9, iArr, i8, iArr3, i10);
        }
        return gte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i8 = 7; i8 >= 0; i8--) {
            if (iArr[i8] != iArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i8 = 3; i8 >= 0; i8--) {
            if (jArr[i8] != jArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        for (int i8 = 0; i8 < 8; i8++) {
            create[i8] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] create64 = create64();
        for (int i8 = 0; i8 < 4; i8++) {
            create64[i8] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return create64;
    }

    public static int getBit(int[] iArr, int i8) {
        int i9;
        if (i8 == 0) {
            i9 = iArr[0];
        } else {
            if ((i8 & 255) != i8) {
                return 0;
            }
            i9 = iArr[i8 >>> 5] >>> (i8 & 31);
        }
        return i9 & 1;
    }

    public static boolean gte(int[] iArr, int i8, int[] iArr2, int i9) {
        for (int i10 = 7; i10 >= 0; i10--) {
            int i11 = iArr[i8 + i10] ^ Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE ^ iArr2[i9 + i10];
            if (i11 < i12) {
                return false;
            }
            if (i11 > i12) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i8 = 1; i8 < 8; i8++) {
            if (iArr[i8] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i8 = 1; i8 < 4; i8++) {
            if (jArr[i8] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i8 = 0; i8 < 8; i8++) {
            if (iArr[i8] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i8 = 0; i8 < 4; i8++) {
            if (jArr[i8] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i8, int[] iArr2, int i9, int[] iArr3, int i10) {
        long j8 = iArr2[i9] & 4294967295L;
        long j9 = iArr2[i9 + 1] & 4294967295L;
        long j10 = iArr2[i9 + 2] & 4294967295L;
        long j11 = iArr2[i9 + 3] & 4294967295L;
        long j12 = iArr2[i9 + 4] & 4294967295L;
        long j13 = iArr2[i9 + 5] & 4294967295L;
        long j14 = iArr2[i9 + 6] & 4294967295L;
        long j15 = iArr[i8] & 4294967295L;
        long j16 = j15 * j8;
        iArr3[i10] = (int) j16;
        long j17 = (j16 >>> 32) + (j15 * j9);
        iArr3[i10 + 1] = (int) j17;
        long j18 = (j17 >>> 32) + (j15 * j10);
        iArr3[i10 + 2] = (int) j18;
        long j19 = (j18 >>> 32) + (j15 * j11);
        iArr3[i10 + 3] = (int) j19;
        long j20 = (j19 >>> 32) + (j15 * j12);
        iArr3[i10 + 4] = (int) j20;
        long j21 = (j20 >>> 32) + (j15 * j13);
        iArr3[i10 + 5] = (int) j21;
        long j22 = (j21 >>> 32) + (j15 * j14);
        iArr3[i10 + 6] = (int) j22;
        long j23 = iArr2[i9 + 7] & 4294967295L;
        long j24 = (j22 >>> 32) + (j15 * j23);
        iArr3[i10 + 7] = (int) j24;
        iArr3[i10 + 8] = (int) (j24 >>> 32);
        int i11 = i10;
        int i12 = 1;
        while (i12 < 8) {
            int i13 = i11 + 1;
            long j25 = iArr[i8 + i12] & 4294967295L;
            long j26 = j23;
            int i14 = i12;
            long j27 = (j25 * j8) + (iArr3[i13] & 4294967295L);
            iArr3[i13] = (int) j27;
            long j28 = (j27 >>> 32) + (j25 * j9) + (iArr3[r16] & 4294967295L);
            iArr3[i11 + 2] = (int) j28;
            long j29 = j10;
            long j30 = (j28 >>> 32) + (j25 * j10) + (iArr3[r16] & 4294967295L);
            iArr3[i11 + 3] = (int) j30;
            int i15 = i11;
            long j31 = (j30 >>> 32) + (j25 * j11) + (iArr3[r6] & 4294967295L);
            iArr3[i11 + 4] = (int) j31;
            long j32 = (j31 >>> 32) + (j25 * j12) + (iArr3[r5] & 4294967295L);
            iArr3[i15 + 5] = (int) j32;
            long j33 = (j32 >>> 32) + (j25 * j13) + (iArr3[r5] & 4294967295L);
            iArr3[i15 + 6] = (int) j33;
            long j34 = (j33 >>> 32) + (j25 * j14) + (iArr3[r5] & 4294967295L);
            iArr3[i15 + 7] = (int) j34;
            long j35 = (j34 >>> 32) + (j25 * j26) + (iArr3[r3] & 4294967295L);
            iArr3[i15 + 8] = (int) j35;
            iArr3[i15 + 9] = (int) (j35 >>> 32);
            i12 = i14 + 1;
            i11 = i13;
            j10 = j29;
            j23 = j26;
        }
    }

    public static long mul33Add(int i8, int[] iArr, int i9, int[] iArr2, int i10, int[] iArr3, int i11) {
        long j8 = i8 & 4294967295L;
        long j9 = iArr[i9] & 4294967295L;
        long j10 = (j8 * j9) + (iArr2[i10] & 4294967295L);
        iArr3[i11] = (int) j10;
        long j11 = iArr[i9 + 1] & 4294967295L;
        long j12 = (j10 >>> 32) + (j8 * j11) + j9 + (iArr2[i10 + 1] & 4294967295L);
        iArr3[i11 + 1] = (int) j12;
        long j13 = j12 >>> 32;
        long j14 = iArr[i9 + 2] & 4294967295L;
        long j15 = j13 + (j8 * j14) + j11 + (iArr2[i10 + 2] & 4294967295L);
        iArr3[i11 + 2] = (int) j15;
        long j16 = iArr[i9 + 3] & 4294967295L;
        long j17 = (j15 >>> 32) + (j8 * j16) + j14 + (iArr2[i10 + 3] & 4294967295L);
        iArr3[i11 + 3] = (int) j17;
        long j18 = iArr[i9 + 4] & 4294967295L;
        long j19 = (j17 >>> 32) + (j8 * j18) + j16 + (iArr2[i10 + 4] & 4294967295L);
        iArr3[i11 + 4] = (int) j19;
        long j20 = iArr[i9 + 5] & 4294967295L;
        long j21 = (j19 >>> 32) + (j8 * j20) + j18 + (iArr2[i10 + 5] & 4294967295L);
        iArr3[i11 + 5] = (int) j21;
        long j22 = iArr[i9 + 6] & 4294967295L;
        long j23 = (j21 >>> 32) + (j8 * j22) + j20 + (iArr2[i10 + 6] & 4294967295L);
        iArr3[i11 + 6] = (int) j23;
        long j24 = iArr[i9 + 7] & 4294967295L;
        long j25 = (j23 >>> 32) + (j8 * j24) + j22 + (4294967295L & iArr2[i10 + 7]);
        iArr3[i11 + 7] = (int) j25;
        return (j25 >>> 32) + j24;
    }

    public static int mul33DWordAdd(int i8, long j8, int[] iArr, int i9) {
        long j9 = i8 & 4294967295L;
        long j10 = j8 & 4294967295L;
        long j11 = (j9 * j10) + (iArr[i9] & 4294967295L);
        iArr[i9] = (int) j11;
        long j12 = j8 >>> 32;
        long j13 = (j9 * j12) + j10;
        long j14 = (j11 >>> 32) + j13 + (iArr[r4] & 4294967295L);
        iArr[i9 + 1] = (int) j14;
        long j15 = (j14 >>> 32) + j12 + (iArr[r4] & 4294967295L);
        iArr[i9 + 2] = (int) j15;
        long j16 = j15 >>> 32;
        long j17 = j16 + (iArr[r0] & 4294967295L);
        iArr[i9 + 3] = (int) j17;
        if ((j17 >>> 32) == 0) {
            return 0;
        }
        return n.incAt(8, iArr, i9, 4);
    }

    public static int mul33WordAdd(int i8, int i9, int[] iArr, int i10) {
        long j8 = i8 & 4294967295L;
        long j9 = i9 & 4294967295L;
        long j10 = (j8 * j9) + (iArr[i10] & 4294967295L);
        iArr[i10] = (int) j10;
        long j11 = (j10 >>> 32) + j9 + (iArr[r5] & 4294967295L);
        iArr[i10 + 1] = (int) j11;
        long j12 = j11 >>> 32;
        long j13 = j12 + (iArr[r0] & 4294967295L);
        iArr[i10 + 2] = (int) j13;
        if ((j13 >>> 32) == 0) {
            return 0;
        }
        return n.incAt(8, iArr, i10, 3);
    }

    public static int mulAddTo(int[] iArr, int i8, int[] iArr2, int i9, int[] iArr3, int i10) {
        long j8 = iArr2[i9] & 4294967295L;
        long j9 = iArr2[i9 + 1] & 4294967295L;
        long j10 = iArr2[i9 + 2] & 4294967295L;
        long j11 = iArr2[i9 + 3] & 4294967295L;
        long j12 = iArr2[i9 + 4] & 4294967295L;
        long j13 = iArr2[i9 + 5] & 4294967295L;
        long j14 = iArr2[i9 + 6] & 4294967295L;
        long j15 = iArr2[i9 + 7] & 4294967295L;
        int i11 = i10;
        long j16 = 0;
        int i12 = 0;
        while (i12 < 8) {
            int i13 = i12;
            long j17 = iArr[i8 + i12] & 4294967295L;
            long j18 = j8;
            long j19 = (j17 * j8) + (iArr3[i11] & 4294967295L);
            long j20 = j15;
            iArr3[i11] = (int) j19;
            int i14 = i11 + 1;
            long j21 = (j19 >>> 32) + (j17 * j9) + (iArr3[i14] & 4294967295L);
            iArr3[i14] = (int) j21;
            long j22 = (j21 >>> 32) + (j17 * j10) + (iArr3[r5] & 4294967295L);
            iArr3[i11 + 2] = (int) j22;
            long j23 = (j22 >>> 32) + (j17 * j11) + (iArr3[r5] & 4294967295L);
            iArr3[i11 + 3] = (int) j23;
            long j24 = (j23 >>> 32) + (j17 * j12) + (iArr3[r5] & 4294967295L);
            iArr3[i11 + 4] = (int) j24;
            long j25 = (j24 >>> 32) + (j17 * j13) + (iArr3[r5] & 4294967295L);
            iArr3[i11 + 5] = (int) j25;
            long j26 = (j25 >>> 32) + (j17 * j14) + (iArr3[r5] & 4294967295L);
            iArr3[i11 + 6] = (int) j26;
            long j27 = (j26 >>> 32) + (j17 * j20) + (iArr3[r5] & 4294967295L);
            iArr3[i11 + 7] = (int) j27;
            long j28 = (j27 >>> 32) + (iArr3[r16] & 4294967295L) + j16;
            iArr3[i11 + 8] = (int) j28;
            j16 = j28 >>> 32;
            i12 = i13 + 1;
            i11 = i14;
            j15 = j20;
            j8 = j18;
            j9 = j9;
        }
        return (int) j16;
    }

    public static int mulByWord(int i8, int[] iArr) {
        long j8 = i8 & 4294967295L;
        long j9 = (iArr[0] & 4294967295L) * j8;
        iArr[0] = (int) j9;
        long j10 = (j9 >>> 32) + ((iArr[1] & 4294967295L) * j8);
        iArr[1] = (int) j10;
        long j11 = (j10 >>> 32) + ((iArr[2] & 4294967295L) * j8);
        iArr[2] = (int) j11;
        long j12 = (j11 >>> 32) + ((iArr[3] & 4294967295L) * j8);
        iArr[3] = (int) j12;
        long j13 = (j12 >>> 32) + ((iArr[4] & 4294967295L) * j8);
        iArr[4] = (int) j13;
        long j14 = (j13 >>> 32) + ((iArr[5] & 4294967295L) * j8);
        iArr[5] = (int) j14;
        long j15 = (j14 >>> 32) + ((iArr[6] & 4294967295L) * j8);
        iArr[6] = (int) j15;
        long j16 = (j15 >>> 32) + (j8 * (4294967295L & iArr[7]));
        iArr[7] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int mulByWordAddTo(int i8, int[] iArr, int[] iArr2) {
        long j8 = i8 & 4294967295L;
        long j9 = ((iArr2[0] & 4294967295L) * j8) + (iArr[0] & 4294967295L);
        iArr2[0] = (int) j9;
        long j10 = (j9 >>> 32) + ((iArr2[1] & 4294967295L) * j8) + (iArr[1] & 4294967295L);
        iArr2[1] = (int) j10;
        long j11 = (j10 >>> 32) + ((iArr2[2] & 4294967295L) * j8) + (iArr[2] & 4294967295L);
        iArr2[2] = (int) j11;
        long j12 = (j11 >>> 32) + ((iArr2[3] & 4294967295L) * j8) + (iArr[3] & 4294967295L);
        iArr2[3] = (int) j12;
        long j13 = (j12 >>> 32) + ((iArr2[4] & 4294967295L) * j8) + (iArr[4] & 4294967295L);
        iArr2[4] = (int) j13;
        long j14 = (j13 >>> 32) + ((iArr2[5] & 4294967295L) * j8) + (iArr[5] & 4294967295L);
        iArr2[5] = (int) j14;
        long j15 = (j14 >>> 32) + ((iArr2[6] & 4294967295L) * j8) + (iArr[6] & 4294967295L);
        iArr2[6] = (int) j15;
        long j16 = (j15 >>> 32) + (j8 * (iArr2[7] & 4294967295L)) + (4294967295L & iArr[7]);
        iArr2[7] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int mulWord(int i8, int[] iArr, int[] iArr2, int i9) {
        long j8 = i8 & 4294967295L;
        long j9 = 0;
        int i10 = 0;
        do {
            long j10 = j9 + ((iArr[i10] & 4294967295L) * j8);
            iArr2[i9 + i10] = (int) j10;
            j9 = j10 >>> 32;
            i10++;
        } while (i10 < 8);
        return (int) j9;
    }

    public static int mulWordAddTo(int i8, int[] iArr, int i9, int[] iArr2, int i10) {
        long j8 = i8 & 4294967295L;
        long j9 = ((iArr[i9] & 4294967295L) * j8) + (iArr2[i10] & 4294967295L);
        iArr2[i10] = (int) j9;
        long j10 = (j9 >>> 32) + ((iArr[i9 + 1] & 4294967295L) * j8) + (iArr2[r8] & 4294967295L);
        iArr2[i10 + 1] = (int) j10;
        long j11 = (j10 >>> 32) + ((iArr[i9 + 2] & 4294967295L) * j8) + (iArr2[r8] & 4294967295L);
        iArr2[i10 + 2] = (int) j11;
        long j12 = (j11 >>> 32) + ((iArr[i9 + 3] & 4294967295L) * j8) + (iArr2[r8] & 4294967295L);
        iArr2[i10 + 3] = (int) j12;
        long j13 = (j12 >>> 32) + ((iArr[i9 + 4] & 4294967295L) * j8) + (iArr2[r8] & 4294967295L);
        iArr2[i10 + 4] = (int) j13;
        long j14 = (j13 >>> 32) + ((iArr[i9 + 5] & 4294967295L) * j8) + (iArr2[r8] & 4294967295L);
        iArr2[i10 + 5] = (int) j14;
        long j15 = (j14 >>> 32) + ((iArr[i9 + 6] & 4294967295L) * j8) + (iArr2[r8] & 4294967295L);
        iArr2[i10 + 6] = (int) j15;
        long j16 = (j15 >>> 32) + (j8 * (iArr[i9 + 7] & 4294967295L)) + (iArr2[r15] & 4294967295L);
        iArr2[i10 + 7] = (int) j16;
        return (int) (j16 >>> 32);
    }

    public static int mulWordDwordAdd(int i8, long j8, int[] iArr, int i9) {
        long j9 = i8 & 4294967295L;
        long j10 = ((j8 & 4294967295L) * j9) + (iArr[i9] & 4294967295L);
        iArr[i9] = (int) j10;
        long j11 = j9 * (j8 >>> 32);
        long j12 = (j10 >>> 32) + j11 + (iArr[r9] & 4294967295L);
        iArr[i9 + 1] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[r0] & 4294967295L);
        iArr[i9 + 2] = (int) j13;
        if ((j13 >>> 32) == 0) {
            return 0;
        }
        return n.incAt(8, iArr, i9, 3);
    }

    public static void square(int[] iArr, int i8, int[] iArr2, int i9) {
        long j8 = iArr[i8] & 4294967295L;
        int i10 = 0;
        int i11 = 16;
        int i12 = 7;
        while (true) {
            int i13 = i12 - 1;
            long j9 = iArr[i8 + i12] & 4294967295L;
            long j10 = j9 * j9;
            iArr2[i9 + (i11 - 1)] = (i10 << 31) | ((int) (j10 >>> 33));
            i11 -= 2;
            iArr2[i9 + i11] = (int) (j10 >>> 1);
            i10 = (int) j10;
            if (i13 <= 0) {
                long j11 = j8 * j8;
                long j12 = (j11 >>> 33) | ((i10 << 31) & 4294967295L);
                iArr2[i9] = (int) j11;
                int i14 = ((int) (j11 >>> 32)) & 1;
                long j13 = iArr[i8 + 1] & 4294967295L;
                long j14 = j12 + (j13 * j8);
                int i15 = (int) j14;
                iArr2[i9 + 1] = (i15 << 1) | i14;
                int i16 = i15 >>> 31;
                long j15 = (iArr2[r12] & 4294967295L) + (j14 >>> 32);
                long j16 = iArr[i8 + 2] & 4294967295L;
                long j17 = iArr2[r15] & 4294967295L;
                long j18 = j15 + (j16 * j8);
                int i17 = (int) j18;
                iArr2[i9 + 2] = (i17 << 1) | i16;
                long j19 = j17 + (j18 >>> 32) + (j16 * j13);
                long j20 = (iArr2[r7] & 4294967295L) + (j19 >>> 32);
                long j21 = iArr[i8 + 3] & 4294967295L;
                long j22 = (iArr2[r20] & 4294967295L) + (j20 >>> 32);
                long j23 = j20 & 4294967295L;
                long j24 = (iArr2[r24] & 4294967295L) + (j22 >>> 32);
                long j25 = (j19 & 4294967295L) + (j21 * j8);
                int i18 = (int) j25;
                iArr2[i9 + 3] = (i18 << 1) | (i17 >>> 31);
                long j26 = j23 + (j25 >>> 32) + (j21 * j13);
                long j27 = (j22 & 4294967295L) + (j26 >>> 32) + (j21 * j16);
                long j28 = j24 + (j27 >>> 32);
                long j29 = j27 & 4294967295L;
                long j30 = iArr[i8 + 4] & 4294967295L;
                long j31 = (iArr2[r3] & 4294967295L) + (j28 >>> 32);
                long j32 = (iArr2[r19] & 4294967295L) + (j31 >>> 32);
                long j33 = (j26 & 4294967295L) + (j30 * j8);
                int i19 = (int) j33;
                iArr2[i9 + 4] = (i19 << 1) | (i18 >>> 31);
                int i20 = i19 >>> 31;
                long j34 = j29 + (j33 >>> 32) + (j30 * j13);
                long j35 = (j28 & 4294967295L) + (j34 >>> 32) + (j30 * j16);
                long j36 = (j31 & 4294967295L) + (j35 >>> 32) + (j30 * j21);
                long j37 = j32 + (j36 >>> 32);
                long j38 = j36 & 4294967295L;
                long j39 = iArr[i8 + 5] & 4294967295L;
                long j40 = (iArr2[r7] & 4294967295L) + (j37 >>> 32);
                long j41 = j37 & 4294967295L;
                long j42 = (iArr2[r21] & 4294967295L) + (j40 >>> 32);
                long j43 = (j34 & 4294967295L) + (j39 * j8);
                int i21 = (int) j43;
                iArr2[i9 + 5] = (i21 << 1) | i20;
                int i22 = i21 >>> 31;
                long j44 = (j35 & 4294967295L) + (j43 >>> 32) + (j39 * j13);
                long j45 = j38 + (j44 >>> 32) + (j39 * j16);
                long j46 = j41 + (j45 >>> 32) + (j39 * j21);
                long j47 = (j40 & 4294967295L) + (j46 >>> 32) + (j39 * j30);
                long j48 = j42 + (j47 >>> 32);
                long j49 = j47 & 4294967295L;
                long j50 = iArr[i8 + 6] & 4294967295L;
                long j51 = (iArr2[r7] & 4294967295L) + (j48 >>> 32);
                long j52 = j48 & 4294967295L;
                long j53 = (iArr2[r20] & 4294967295L) + (j51 >>> 32);
                long j54 = (j44 & 4294967295L) + (j50 * j8);
                int i23 = (int) j54;
                iArr2[i9 + 6] = (i23 << 1) | i22;
                int i24 = i23 >>> 31;
                long j55 = (j45 & 4294967295L) + (j54 >>> 32) + (j50 * j13);
                long j56 = (j46 & 4294967295L) + (j55 >>> 32) + (j50 * j16);
                long j57 = j49 + (j56 >>> 32) + (j50 * j21);
                long j58 = j56 & 4294967295L;
                long j59 = j52 + (j57 >>> 32) + (j50 * j30);
                long j60 = (j51 & 4294967295L) + (j59 >>> 32) + (j50 * j39);
                long j61 = j53 + (j60 >>> 32);
                long j62 = j60 & 4294967295L;
                long j63 = iArr[i8 + 7] & 4294967295L;
                long j64 = (iArr2[r7] & 4294967295L) + (j61 >>> 32);
                long j65 = j61 & 4294967295L;
                long j66 = (iArr2[r28] & 4294967295L) + (j64 >>> 32);
                long j67 = 4294967295L & j64;
                long j68 = (j55 & 4294967295L) + (j8 * j63);
                int i25 = (int) j68;
                iArr2[i9 + 7] = (i25 << 1) | i24;
                long j69 = j58 + (j68 >>> 32) + (j13 * j63);
                long j70 = (j57 & 4294967295L) + (j69 >>> 32) + (j63 * j16);
                long j71 = (j59 & 4294967295L) + (j70 >>> 32) + (j63 * j21);
                long j72 = j62 + (j71 >>> 32) + (j63 * j30);
                long j73 = j65 + (j72 >>> 32) + (j63 * j39);
                long j74 = j67 + (j73 >>> 32) + (j63 * j50);
                long j75 = j66 + (j74 >>> 32);
                int i26 = (int) j69;
                iArr2[i9 + 8] = (i25 >>> 31) | (i26 << 1);
                int i27 = (int) j70;
                iArr2[i9 + 9] = (i26 >>> 31) | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j71;
                iArr2[i9 + 10] = i28 | (i29 << 1);
                int i30 = (int) j72;
                iArr2[i9 + 11] = (i29 >>> 31) | (i30 << 1);
                int i31 = (int) j73;
                iArr2[i9 + 12] = (i30 >>> 31) | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) j74;
                iArr2[i9 + 13] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) j75;
                iArr2[i9 + 14] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = i9 + 15;
                iArr2[i37] = i36 | ((iArr2[i37] + ((int) (j75 >>> 32))) << 1);
                return;
            }
            i12 = i13;
        }
    }

    public static int sub(int[] iArr, int i8, int[] iArr2, int i9, int[] iArr3, int i10) {
        long j8 = (iArr[i8] & 4294967295L) - (iArr2[i9] & 4294967295L);
        iArr3[i10] = (int) j8;
        long j9 = (j8 >> 32) + ((iArr[i8 + 1] & 4294967295L) - (iArr2[i9 + 1] & 4294967295L));
        iArr3[i10 + 1] = (int) j9;
        long j10 = (j9 >> 32) + ((iArr[i8 + 2] & 4294967295L) - (iArr2[i9 + 2] & 4294967295L));
        iArr3[i10 + 2] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr[i8 + 3] & 4294967295L) - (iArr2[i9 + 3] & 4294967295L));
        iArr3[i10 + 3] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[i8 + 4] & 4294967295L) - (iArr2[i9 + 4] & 4294967295L));
        iArr3[i10 + 4] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr[i8 + 5] & 4294967295L) - (iArr2[i9 + 5] & 4294967295L));
        iArr3[i10 + 5] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr[i8 + 6] & 4294967295L) - (iArr2[i9 + 6] & 4294967295L));
        iArr3[i10 + 6] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr[i8 + 7] & 4294967295L) - (iArr2[i9 + 7] & 4294967295L));
        iArr3[i10 + 7] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j8 = ((iArr3[0] & 4294967295L) - (iArr[0] & 4294967295L)) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j8;
        long j9 = (j8 >> 32) + (((iArr3[1] & 4294967295L) - (iArr[1] & 4294967295L)) - (iArr2[1] & 4294967295L));
        iArr3[1] = (int) j9;
        long j10 = (j9 >> 32) + (((iArr3[2] & 4294967295L) - (iArr[2] & 4294967295L)) - (iArr2[2] & 4294967295L));
        iArr3[2] = (int) j10;
        long j11 = (j10 >> 32) + (((iArr3[3] & 4294967295L) - (iArr[3] & 4294967295L)) - (iArr2[3] & 4294967295L));
        iArr3[3] = (int) j11;
        long j12 = (j11 >> 32) + (((iArr3[4] & 4294967295L) - (iArr[4] & 4294967295L)) - (iArr2[4] & 4294967295L));
        iArr3[4] = (int) j12;
        long j13 = (j12 >> 32) + (((iArr3[5] & 4294967295L) - (iArr[5] & 4294967295L)) - (iArr2[5] & 4294967295L));
        iArr3[5] = (int) j13;
        long j14 = (j13 >> 32) + (((iArr3[6] & 4294967295L) - (iArr[6] & 4294967295L)) - (iArr2[6] & 4294967295L));
        iArr3[6] = (int) j14;
        long j15 = (j14 >> 32) + (((iArr3[7] & 4294967295L) - (iArr[7] & 4294967295L)) - (iArr2[7] & 4294967295L));
        iArr3[7] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int subFrom(int[] iArr, int i8, int[] iArr2, int i9) {
        long j8 = (iArr2[i9] & 4294967295L) - (iArr[i8] & 4294967295L);
        iArr2[i9] = (int) j8;
        long j9 = (j8 >> 32) + ((iArr2[r5] & 4294967295L) - (iArr[i8 + 1] & 4294967295L));
        iArr2[i9 + 1] = (int) j9;
        long j10 = (j9 >> 32) + ((iArr2[r5] & 4294967295L) - (iArr[i8 + 2] & 4294967295L));
        iArr2[i9 + 2] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr2[r5] & 4294967295L) - (iArr[i8 + 3] & 4294967295L));
        iArr2[i9 + 3] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr2[r5] & 4294967295L) - (iArr[i8 + 4] & 4294967295L));
        iArr2[i9 + 4] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr2[r5] & 4294967295L) - (iArr[i8 + 5] & 4294967295L));
        iArr2[i9 + 5] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr2[r5] & 4294967295L) - (iArr[i8 + 6] & 4294967295L));
        iArr2[i9 + 6] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr2[r13] & 4294967295L) - (iArr[i8 + 7] & 4294967295L));
        iArr2[i9 + 7] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i8 = 0; i8 < 8; i8++) {
            int i9 = iArr[i8];
            if (i9 != 0) {
                org.bouncycastle.util.i.intToBigEndian(i9, bArr, (7 - i8) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i8 = 0; i8 < 4; i8++) {
            long j8 = jArr[i8];
            if (j8 != 0) {
                org.bouncycastle.util.i.longToBigEndian(j8, bArr, (3 - i8) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j8 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr3[1] = (int) j9;
        long j10 = (j9 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr3[2] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr3[3] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L);
        iArr3[4] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L);
        iArr3[5] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L);
        iArr3[6] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L);
        iArr3[7] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j8 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L);
        iArr3[1] = (int) j9;
        long j10 = (j9 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L);
        iArr3[2] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L);
        iArr3[3] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L);
        iArr3[4] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L);
        iArr3[5] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L);
        iArr3[6] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (iArr3[7] & 4294967295L);
        iArr3[7] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j8 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr2[0] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr2[1] = (int) j9;
        long j10 = (j9 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr2[2] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr2[3] = (int) j11;
        long j12 = (j11 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L);
        iArr2[4] = (int) j12;
        long j13 = (j12 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L);
        iArr2[5] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L);
        iArr2[6] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[7] & 4294967295L) + (4294967295L & iArr2[7]);
        iArr2[7] = (int) j15;
        return (int) (j15 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i8 = 7; i8 >= 0; i8--) {
            int i9 = iArr[i8] ^ Integer.MIN_VALUE;
            int i10 = Integer.MIN_VALUE ^ iArr2[i8];
            if (i9 < i10) {
                return false;
            }
            if (i9 > i10) {
                return true;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j8 = iArr2[0] & 4294967295L;
        long j9 = iArr2[1] & 4294967295L;
        long j10 = iArr2[2] & 4294967295L;
        long j11 = iArr2[3] & 4294967295L;
        long j12 = iArr2[4] & 4294967295L;
        long j13 = iArr2[5] & 4294967295L;
        long j14 = iArr2[6] & 4294967295L;
        long j15 = iArr2[7] & 4294967295L;
        long j16 = iArr[0] & 4294967295L;
        long j17 = j16 * j8;
        iArr3[0] = (int) j17;
        char c8 = ' ';
        long j18 = (j17 >>> 32) + (j16 * j9);
        iArr3[1] = (int) j18;
        long j19 = (j18 >>> 32) + (j16 * j10);
        iArr3[2] = (int) j19;
        long j20 = (j19 >>> 32) + (j16 * j11);
        iArr3[3] = (int) j20;
        long j21 = (j20 >>> 32) + (j16 * j12);
        iArr3[4] = (int) j21;
        long j22 = (j21 >>> 32) + (j16 * j13);
        iArr3[5] = (int) j22;
        long j23 = (j22 >>> 32) + (j16 * j14);
        iArr3[6] = (int) j23;
        long j24 = (j23 >>> 32) + (j16 * j15);
        iArr3[7] = (int) j24;
        int i8 = (int) (j24 >>> 32);
        iArr3[8] = i8;
        int i9 = 1;
        for (int i10 = 8; i9 < i10; i10 = 8) {
            long j25 = iArr[i9] & 4294967295L;
            long j26 = (j25 * j8) + (iArr3[i9] & 4294967295L);
            long j27 = j8;
            iArr3[i9] = (int) j26;
            int i11 = i9 + 1;
            long j28 = j9;
            long j29 = (j26 >>> c8) + (j25 * j9) + (iArr3[i11] & 4294967295L);
            iArr3[i11] = (int) j29;
            long j30 = (j29 >>> 32) + (j25 * j10) + (iArr3[r6] & 4294967295L);
            iArr3[i9 + 2] = (int) j30;
            long j31 = (j30 >>> 32) + (j25 * j11) + (iArr3[r6] & 4294967295L);
            iArr3[i9 + 3] = (int) j31;
            long j32 = (j31 >>> 32) + (j25 * j12) + (iArr3[r6] & 4294967295L);
            iArr3[i9 + 4] = (int) j32;
            long j33 = (j32 >>> 32) + (j25 * j13) + (iArr3[r6] & 4294967295L);
            iArr3[i9 + 5] = (int) j33;
            long j34 = (j33 >>> 32) + (j25 * j14) + (iArr3[r6] & 4294967295L);
            iArr3[i9 + 6] = (int) j34;
            c8 = ' ';
            long j35 = (j34 >>> 32) + (j25 * j15) + (iArr3[r3] & 4294967295L);
            iArr3[i9 + 7] = (int) j35;
            iArr3[i9 + 8] = (int) (j35 >>> 32);
            j8 = j27;
            i9 = i11;
            j9 = j28;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j8 = iArr2[0] & 4294967295L;
        long j9 = iArr2[1] & 4294967295L;
        long j10 = iArr2[2] & 4294967295L;
        long j11 = iArr2[3] & 4294967295L;
        long j12 = iArr2[4] & 4294967295L;
        long j13 = iArr2[5] & 4294967295L;
        long j14 = iArr2[6] & 4294967295L;
        long j15 = iArr2[7] & 4294967295L;
        long j16 = 0;
        int i8 = 0;
        while (i8 < 8) {
            long j17 = j15;
            long j18 = iArr[i8] & 4294967295L;
            long j19 = j13;
            long j20 = (iArr3[i8] & 4294967295L) + (j18 * j8);
            iArr3[i8] = (int) j20;
            int i9 = i8 + 1;
            long j21 = j9;
            long j22 = (j20 >>> 32) + (j18 * j9) + (iArr3[i9] & 4294967295L);
            iArr3[i9] = (int) j22;
            long j23 = (j22 >>> 32) + (j18 * j10) + (iArr3[r6] & 4294967295L);
            iArr3[i8 + 2] = (int) j23;
            long j24 = (j23 >>> 32) + (j18 * j11) + (iArr3[r6] & 4294967295L);
            iArr3[i8 + 3] = (int) j24;
            long j25 = (j24 >>> 32) + (j18 * j12) + (iArr3[r6] & 4294967295L);
            iArr3[i8 + 4] = (int) j25;
            long j26 = (j25 >>> 32) + (j18 * j19) + (iArr3[r6] & 4294967295L);
            iArr3[i8 + 5] = (int) j26;
            long j27 = (j26 >>> 32) + (j18 * j14) + (iArr3[r6] & 4294967295L);
            iArr3[i8 + 6] = (int) j27;
            long j28 = (j27 >>> 32) + (j18 * j17) + (iArr3[r6] & 4294967295L);
            iArr3[i8 + 7] = (int) j28;
            long j29 = (j28 >>> 32) + (iArr3[r2] & 4294967295L) + j16;
            iArr3[i8 + 8] = (int) j29;
            j16 = j29 >>> 32;
            i8 = i9;
            j15 = j17;
            j13 = j19;
            j9 = j21;
        }
        return (int) j16;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j8 = iArr[0] & 4294967295L;
        int i8 = 16;
        int i9 = 7;
        int i10 = 0;
        while (true) {
            int i11 = i9 - 1;
            long j9 = iArr[i9] & 4294967295L;
            long j10 = j9 * j9;
            iArr2[i8 - 1] = (i10 << 31) | ((int) (j10 >>> 33));
            i8 -= 2;
            iArr2[i8] = (int) (j10 >>> 1);
            i10 = (int) j10;
            if (i11 <= 0) {
                long j11 = j8 * j8;
                long j12 = (j11 >>> 33) | ((i10 << 31) & 4294967295L);
                iArr2[0] = (int) j11;
                long j13 = iArr[1] & 4294967295L;
                long j14 = j12 + (j13 * j8);
                int i12 = (int) j14;
                iArr2[1] = (i12 << 1) | (((int) (j11 >>> 32)) & 1);
                int i13 = i12 >>> 31;
                long j15 = (iArr2[2] & 4294967295L) + (j14 >>> 32);
                long j16 = iArr[2] & 4294967295L;
                long j17 = j15 + (j16 * j8);
                int i14 = (int) j17;
                iArr2[2] = (i14 << 1) | i13;
                long j18 = (iArr2[3] & 4294967295L) + (j17 >>> 32) + (j16 * j13);
                long j19 = (iArr2[4] & 4294967295L) + (j18 >>> 32);
                long j20 = iArr[3] & 4294967295L;
                long j21 = (iArr2[5] & 4294967295L) + (j19 >>> 32);
                long j22 = j19 & 4294967295L;
                long j23 = (iArr2[6] & 4294967295L) + (j21 >>> 32);
                long j24 = (j18 & 4294967295L) + (j20 * j8);
                int i15 = (int) j24;
                iArr2[3] = (i15 << 1) | (i14 >>> 31);
                int i16 = i15 >>> 31;
                long j25 = j22 + (j24 >>> 32) + (j20 * j13);
                long j26 = (j21 & 4294967295L) + (j25 >>> 32) + (j20 * j16);
                long j27 = j23 + (j26 >>> 32);
                long j28 = iArr[4] & 4294967295L;
                long j29 = (iArr2[7] & 4294967295L) + (j27 >>> 32);
                long j30 = j27 & 4294967295L;
                long j31 = (iArr2[8] & 4294967295L) + (j29 >>> 32);
                long j32 = (j25 & 4294967295L) + (j28 * j8);
                int i17 = (int) j32;
                iArr2[4] = (i17 << 1) | i16;
                long j33 = (j26 & 4294967295L) + (j32 >>> 32) + (j28 * j13);
                long j34 = j30 + (j33 >>> 32) + (j28 * j16);
                long j35 = (j29 & 4294967295L) + (j34 >>> 32) + (j28 * j20);
                long j36 = j31 + (j35 >>> 32);
                long j37 = j35 & 4294967295L;
                long j38 = iArr[5] & 4294967295L;
                long j39 = (iArr2[9] & 4294967295L) + (j36 >>> 32);
                long j40 = j36 & 4294967295L;
                long j41 = (iArr2[10] & 4294967295L) + (j39 >>> 32);
                long j42 = (j33 & 4294967295L) + (j38 * j8);
                int i18 = (int) j42;
                iArr2[5] = (i18 << 1) | (i17 >>> 31);
                long j43 = (j34 & 4294967295L) + (j42 >>> 32) + (j38 * j13);
                long j44 = j37 + (j43 >>> 32) + (j38 * j16);
                long j45 = j40 + (j44 >>> 32) + (j38 * j20);
                long j46 = (j39 & 4294967295L) + (j45 >>> 32) + (j38 * j28);
                long j47 = j41 + (j46 >>> 32);
                long j48 = j46 & 4294967295L;
                long j49 = iArr[6] & 4294967295L;
                long j50 = (iArr2[11] & 4294967295L) + (j47 >>> 32);
                long j51 = j47 & 4294967295L;
                long j52 = (iArr2[12] & 4294967295L) + (j50 >>> 32);
                long j53 = (j43 & 4294967295L) + (j49 * j8);
                int i19 = (int) j53;
                iArr2[6] = (i19 << 1) | (i18 >>> 31);
                long j54 = (j44 & 4294967295L) + (j53 >>> 32) + (j49 * j13);
                long j55 = (j45 & 4294967295L) + (j54 >>> 32) + (j49 * j16);
                long j56 = j54 & 4294967295L;
                long j57 = j48 + (j55 >>> 32) + (j49 * j20);
                long j58 = j51 + (j57 >>> 32) + (j49 * j28);
                long j59 = (j50 & 4294967295L) + (j58 >>> 32) + (j49 * j38);
                long j60 = j52 + (j59 >>> 32);
                long j61 = j59 & 4294967295L;
                long j62 = iArr[7] & 4294967295L;
                long j63 = (iArr2[13] & 4294967295L) + (j60 >>> 32);
                long j64 = j60 & 4294967295L;
                long j65 = (iArr2[14] & 4294967295L) + (j63 >>> 32);
                long j66 = 4294967295L & j63;
                long j67 = j56 + (j8 * j62);
                int i20 = (int) j67;
                iArr2[7] = (i19 >>> 31) | (i20 << 1);
                int i21 = i20 >>> 31;
                long j68 = (j55 & 4294967295L) + (j67 >>> 32) + (j62 * j13);
                long j69 = (j57 & 4294967295L) + (j68 >>> 32) + (j62 * j16);
                long j70 = (j58 & 4294967295L) + (j69 >>> 32) + (j62 * j20);
                long j71 = j61 + (j70 >>> 32) + (j62 * j28);
                long j72 = j64 + (j71 >>> 32) + (j62 * j38);
                long j73 = j66 + (j72 >>> 32) + (j62 * j49);
                long j74 = j65 + (j73 >>> 32);
                int i22 = (int) j68;
                iArr2[8] = i21 | (i22 << 1);
                int i23 = (int) j69;
                iArr2[9] = (i22 >>> 31) | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j70;
                iArr2[10] = i24 | (i25 << 1);
                int i26 = (int) j71;
                iArr2[11] = (i25 >>> 31) | (i26 << 1);
                int i27 = (int) j72;
                iArr2[12] = (i26 >>> 31) | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j73;
                iArr2[13] = i28 | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j74;
                iArr2[14] = i30 | (i31 << 1);
                iArr2[15] = (i31 >>> 31) | ((iArr2[15] + ((int) (j74 >>> 32))) << 1);
                return;
            }
            i9 = i11;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j8 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j8;
        long j9 = (j8 >> 32) + ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L));
        iArr3[1] = (int) j9;
        long j10 = (j9 >> 32) + ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L));
        iArr3[2] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L));
        iArr3[3] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L));
        iArr3[4] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L));
        iArr3[5] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L));
        iArr3[6] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr[7] & 4294967295L) - (iArr2[7] & 4294967295L));
        iArr3[7] = (int) j15;
        return (int) (j15 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j8 = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j8;
        long j9 = (j8 >> 32) + ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L));
        iArr2[1] = (int) j9;
        long j10 = (j9 >> 32) + ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L));
        iArr2[2] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L));
        iArr2[3] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L));
        iArr2[4] = (int) j12;
        long j13 = (j12 >> 32) + ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L));
        iArr2[5] = (int) j13;
        long j14 = (j13 >> 32) + ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L));
        iArr2[6] = (int) j14;
        long j15 = (j14 >> 32) + ((iArr2[7] & 4294967295L) - (4294967295L & iArr[7]));
        iArr2[7] = (int) j15;
        return (int) (j15 >> 32);
    }
}
