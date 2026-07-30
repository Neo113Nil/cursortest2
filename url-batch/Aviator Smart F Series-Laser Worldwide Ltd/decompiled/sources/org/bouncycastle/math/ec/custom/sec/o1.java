package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class o1 {
    private static final long M01 = 1;
    private static final long M49 = 562949953421311L;

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
        jArr3[6] = jArr2[6] ^ jArr[6];
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
        return b7.n.fromBigInteger64(193, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] createExt64 = b7.h.createExt64();
        b7.h.copy64(jArr, jArr2);
        for (int i8 = 1; i8 < 193; i8 += 2) {
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
        jArr[0] = j8 ^ (j9 << 49);
        jArr[1] = (j9 >>> 15) ^ (j10 << 34);
        jArr[2] = (j10 >>> 30) ^ (j11 << 19);
        jArr[3] = ((j11 >>> 45) ^ (j12 << 4)) ^ (j13 << 53);
        jArr[4] = ((j12 >>> 60) ^ (j14 << 38)) ^ (j13 >>> 11);
        jArr[5] = (j14 >>> 26) ^ (j15 << 23);
        jArr[6] = j15 >>> 41;
        jArr[7] = 0;
    }

    protected static void implExpand(long[] jArr, long[] jArr2) {
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        jArr2[0] = j8 & M49;
        jArr2[1] = ((j8 >>> 49) ^ (j9 << 15)) & M49;
        jArr2[2] = ((j9 >>> 34) ^ (j10 << 30)) & M49;
        jArr2[3] = (j10 >>> 19) ^ (j11 << 45);
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
        int i10 = 36;
        do {
            int i11 = (int) (j8 >>> i10);
            long j16 = (jArr[(i11 >>> 12) & 7] << 12) ^ (((jArr[i11 & 7] ^ (jArr[(i11 >>> 3) & 7] << 3)) ^ (jArr[(i11 >>> 6) & 7] << 6)) ^ (jArr[(i11 >>> 9) & 7] << 9));
            j14 ^= j16 << i10;
            j15 ^= j16 >>> (-i10);
            i10 -= 15;
        } while (i10 > 0);
        jArr2[i8] = jArr2[i8] ^ (M49 & j14);
        int i12 = i8 + 1;
        jArr2[i12] = jArr2[i12] ^ ((j14 >>> 49) ^ (j15 << 15));
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        b7.b.expand64To128(jArr, 0, 3, jArr2, 0);
        jArr2[6] = jArr[3] & 1;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (b7.h.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] create64 = b7.h.create64();
        long[] create642 = b7.h.create64();
        square(jArr, create64);
        squareN(create64, 1, create642);
        multiply(create64, create642, create64);
        squareN(create642, 1, create642);
        multiply(create64, create642, create64);
        squareN(create64, 3, create642);
        multiply(create64, create642, create64);
        squareN(create64, 6, create642);
        multiply(create64, create642, create64);
        squareN(create64, 12, create642);
        multiply(create64, create642, create64);
        squareN(create64, 24, create642);
        multiply(create64, create642, create64);
        squareN(create64, 48, create642);
        multiply(create64, create642, create64);
        squareN(create64, 96, create642);
        multiply(create64, create642, jArr2);
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
        long j15 = j12 ^ (j14 >>> 50);
        long j16 = (j11 ^ ((j14 >>> 1) ^ (j14 << 14))) ^ (j13 >>> 50);
        long j17 = j8 ^ (j15 << 63);
        long j18 = (j9 ^ (j13 << 63)) ^ ((j15 >>> 1) ^ (j15 << 14));
        long j19 = ((j10 ^ (j14 << 63)) ^ ((j13 >>> 1) ^ (j13 << 14))) ^ (j15 >>> 50);
        long j20 = j16 >>> 1;
        jArr2[0] = (j17 ^ j20) ^ (j20 << 15);
        jArr2[1] = (j16 >>> 50) ^ j18;
        jArr2[2] = j19;
        jArr2[3] = 1 & j16;
    }

    public static void reduce63(long[] jArr, int i8) {
        int i9 = i8 + 3;
        long j8 = jArr[i9];
        long j9 = j8 >>> 1;
        jArr[i8] = (j9 ^ (j9 << 15)) ^ jArr[i8];
        int i10 = i8 + 1;
        jArr[i10] = jArr[i10] ^ (j8 >>> 50);
        jArr[i9] = j8 & 1;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long unshuffle = b7.b.unshuffle(jArr[0]);
        long unshuffle2 = b7.b.unshuffle(jArr[1]);
        long j8 = (unshuffle & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) | (unshuffle2 << 32);
        long j9 = (unshuffle >>> 32) | (unshuffle2 & (-4294967296L));
        long unshuffle3 = b7.b.unshuffle(jArr[2]);
        long j10 = (unshuffle3 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) ^ (jArr[3] << 32);
        long j11 = unshuffle3 >>> 32;
        jArr2[0] = j8 ^ (j9 << 8);
        jArr2[1] = ((j10 ^ (j11 << 8)) ^ (j9 >>> 56)) ^ (j9 << 33);
        jArr2[2] = (j9 >>> 31) ^ ((unshuffle3 >>> 88) ^ (j11 << 33));
        jArr2[3] = unshuffle3 >>> 63;
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
        return ((int) jArr[0]) & 1;
    }
}
