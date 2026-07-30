package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class a2 {
    private static final long M47 = 140737488355327L;
    private static final long M60 = 1152921504606846975L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return b7.n.fromBigInteger64(239, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] createExt64 = b7.h.createExt64();
        b7.h.copy64(jArr, jArr2);
        for (int i8 = 1; i8 < 239; i8 += 2) {
            implSquare(jArr2, createExt64);
            reduce(createExt64, jArr2);
            implSquare(jArr2, createExt64);
            reduce(createExt64, jArr2);
            addTo(jArr, jArr2);
        }
    }

    protected static void implCompactExt(long[] jArr) {
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        long j13 = jArr[5];
        long j14 = jArr[6];
        long j15 = jArr[7];
        jArr[0] = j8 ^ (j9 << 60);
        jArr[1] = (j9 >>> 4) ^ (j10 << 56);
        jArr[2] = (j10 >>> 8) ^ (j11 << 52);
        jArr[3] = (j11 >>> 12) ^ (j12 << 48);
        jArr[4] = (j12 >>> 16) ^ (j13 << 44);
        jArr[5] = (j13 >>> 20) ^ (j14 << 40);
        jArr[6] = (j14 >>> 24) ^ (j15 << 36);
        jArr[7] = j15 >>> 28;
    }

    protected static void implExpand(long[] jArr, long[] jArr2) {
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        jArr2[0] = j8 & M60;
        jArr2[1] = ((j8 >>> 60) ^ (j9 << 4)) & M60;
        jArr2[2] = ((j9 >>> 56) ^ (j10 << 8)) & M60;
        jArr2[3] = (j10 >>> 52) ^ (j11 << 12);
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[8];
        implMulwAcc(jArr6, jArr4[0], jArr5[0], jArr3, 0);
        implMulwAcc(jArr6, jArr4[1], jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[2], jArr5[2], jArr3, 2);
        implMulwAcc(jArr6, jArr4[3], jArr5[3], jArr3, 3);
        for (int i8 = 5; i8 > 0; i8--) {
            jArr3[i8] = jArr3[i8] ^ jArr3[i8 - 1];
        }
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i9 = 7; i9 > 1; i9--) {
            jArr3[i9] = jArr3[i9] ^ jArr3[i9 - 2];
        }
        long j8 = jArr4[0] ^ jArr4[2];
        long j9 = jArr4[1] ^ jArr4[3];
        long j10 = jArr5[0] ^ jArr5[2];
        long j11 = jArr5[1] ^ jArr5[3];
        implMulwAcc(jArr6, j8 ^ j9, j10 ^ j11, jArr3, 3);
        long[] jArr7 = new long[3];
        implMulwAcc(jArr6, j8, j10, jArr7, 0);
        implMulwAcc(jArr6, j9, j11, jArr7, 1);
        long j12 = jArr7[0];
        long j13 = jArr7[1];
        long j14 = jArr7[2];
        jArr3[2] = jArr3[2] ^ j12;
        jArr3[3] = jArr3[3] ^ (j12 ^ j13);
        jArr3[4] = jArr3[4] ^ (j14 ^ j13);
        jArr3[5] = jArr3[5] ^ j14;
        implCompactExt(jArr3);
    }

    protected static void implMulwAcc(long[] jArr, long j8, long j9, long[] jArr2, int i8) {
        jArr[1] = j9;
        long j10 = j9 << 1;
        jArr[2] = j10;
        long j11 = j10 ^ j9;
        jArr[3] = j11;
        long j12 = j9 << 2;
        jArr[4] = j12;
        jArr[5] = j12 ^ j9;
        long j13 = j11 << 1;
        jArr[6] = j13;
        jArr[7] = j13 ^ j9;
        int i9 = (int) j8;
        long j14 = (jArr[(i9 >>> 3) & 7] << 3) ^ jArr[i9 & 7];
        long j15 = 0;
        int i10 = 54;
        do {
            int i11 = (int) (j8 >>> i10);
            long j16 = (jArr[(i11 >>> 3) & 7] << 3) ^ jArr[i11 & 7];
            j14 ^= j16 << i10;
            j15 ^= j16 >>> (-i10);
            i10 -= 6;
        } while (i10 > 0);
        jArr2[i8] = jArr2[i8] ^ (M60 & j14);
        int i12 = i8 + 1;
        jArr2[i12] = ((((((j8 & 585610922974906400L) & ((j9 << 4) >> 63)) >>> 5) ^ j15) << 4) ^ (j14 >>> 60)) ^ jArr2[i12];
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        b7.b.expand64To128(jArr, 0, 4, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (b7.h.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] create64 = b7.h.create64();
        long[] create642 = b7.h.create64();
        square(jArr, create64);
        multiply(create64, jArr, create64);
        square(create64, create64);
        multiply(create64, jArr, create64);
        squareN(create64, 3, create642);
        multiply(create642, create64, create642);
        square(create642, create642);
        multiply(create642, jArr, create642);
        squareN(create642, 7, create64);
        multiply(create64, create642, create64);
        squareN(create64, 14, create642);
        multiply(create642, create64, create642);
        square(create642, create642);
        multiply(create642, jArr, create642);
        squareN(create642, 29, create64);
        multiply(create64, create642, create64);
        square(create64, create64);
        multiply(create64, jArr, create64);
        squareN(create64, 59, create642);
        multiply(create642, create64, create642);
        square(create642, create642);
        multiply(create642, jArr, create642);
        squareN(create642, 119, create64);
        multiply(create64, create642, create64);
        square(create64, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = b7.h.createExt64();
        implMultiply(jArr, jArr2, createExt64);
        reduce(createExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = b7.h.createExt64();
        implMultiply(jArr, jArr2, createExt64);
        addExt(jArr3, createExt64, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        long j13 = jArr[5];
        long j14 = jArr[6];
        long j15 = jArr[7];
        long j16 = j14 ^ (j15 >>> 17);
        long j17 = (j13 ^ (j15 << 47)) ^ (j16 >>> 17);
        long j18 = ((j12 ^ (j15 >>> 47)) ^ (j16 << 47)) ^ (j17 >>> 17);
        long j19 = j8 ^ (j18 << 17);
        long j20 = (j9 ^ (j17 << 17)) ^ (j18 >>> 47);
        long j21 = ((j10 ^ (j16 << 17)) ^ (j17 >>> 47)) ^ (j18 << 47);
        long j22 = (((j11 ^ (j15 << 17)) ^ (j16 >>> 47)) ^ (j17 << 47)) ^ (j18 >>> 17);
        long j23 = j22 >>> 47;
        jArr2[0] = j19 ^ j23;
        jArr2[1] = j20;
        jArr2[2] = (j23 << 30) ^ j21;
        jArr2[3] = M47 & j22;
    }

    public static void reduce17(long[] jArr, int i8) {
        int i9 = i8 + 3;
        long j8 = jArr[i9];
        long j9 = j8 >>> 47;
        jArr[i8] = jArr[i8] ^ j9;
        int i10 = i8 + 2;
        jArr[i10] = (j9 << 30) ^ jArr[i10];
        jArr[i9] = j8 & M47;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long unshuffle = b7.b.unshuffle(jArr[0]);
        long unshuffle2 = b7.b.unshuffle(jArr[1]);
        long j8 = (unshuffle & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) | (unshuffle2 << 32);
        long j9 = (unshuffle >>> 32) | (unshuffle2 & (-4294967296L));
        int i8 = 2;
        long unshuffle3 = b7.b.unshuffle(jArr[2]);
        long unshuffle4 = b7.b.unshuffle(jArr[3]);
        long j10 = (unshuffle3 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) | (unshuffle4 << 32);
        long j11 = (unshuffle4 & (-4294967296L)) | (unshuffle3 >>> 32);
        long j12 = j11 >>> 49;
        long j13 = (j9 >>> 49) | (j11 << 15);
        long j14 = j11 ^ (j9 << 15);
        long[] createExt64 = b7.h.createExt64();
        int[] iArr = {39, 120};
        int i9 = 0;
        while (i9 < i8) {
            int i10 = iArr[i9];
            int i11 = i10 >>> 6;
            int i12 = i10 & 63;
            createExt64[i11] = createExt64[i11] ^ (j9 << i12);
            int i13 = i11 + 1;
            int[] iArr2 = iArr;
            int i14 = -i12;
            createExt64[i13] = createExt64[i13] ^ ((j14 << i12) | (j9 >>> i14));
            int i15 = i11 + 2;
            createExt64[i15] = createExt64[i15] ^ ((j13 << i12) | (j14 >>> i14));
            int i16 = i11 + 3;
            createExt64[i16] = createExt64[i16] ^ ((j12 << i12) | (j13 >>> i14));
            int i17 = i11 + 4;
            createExt64[i17] = createExt64[i17] ^ (j12 >>> i14);
            i9++;
            i8 = 2;
            iArr = iArr2;
        }
        reduce(createExt64, jArr2);
        jArr2[0] = jArr2[0] ^ j8;
        jArr2[1] = jArr2[1] ^ j10;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] createExt64 = b7.h.createExt64();
        implSquare(jArr, createExt64);
        reduce(createExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] createExt64 = b7.h.createExt64();
        implSquare(jArr, createExt64);
        addExt(jArr2, createExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i8, long[] jArr2) {
        long[] createExt64 = b7.h.createExt64();
        implSquare(jArr, createExt64);
        while (true) {
            reduce(createExt64, jArr2);
            i8--;
            if (i8 <= 0) {
                return;
            } else {
                implSquare(jArr2, createExt64);
            }
        }
    }

    public static int trace(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[1] >>> 17)) ^ (jArr[2] >>> 34))) & 1;
    }
}
