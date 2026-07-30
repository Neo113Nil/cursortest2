package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class u0 {
    private static final long M49 = 562949953421311L;
    private static final long M57 = 144115188075855871L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return b7.n.fromBigInteger64(113, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] createExt64 = b7.d.createExt64();
        b7.d.copy64(jArr, jArr2);
        for (int i8 = 1; i8 < 113; i8 += 2) {
            implSquare(jArr2, createExt64);
            reduce(createExt64, jArr2);
            implSquare(jArr2, createExt64);
            reduce(createExt64, jArr2);
            addTo(jArr, jArr2);
        }
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j8 = jArr[0];
        long j9 = ((jArr[1] << 7) ^ (j8 >>> 57)) & M57;
        long j10 = j8 & M57;
        long j11 = jArr2[0];
        long j12 = ((jArr2[1] << 7) ^ (j11 >>> 57)) & M57;
        long j13 = j11 & M57;
        long[] jArr4 = new long[6];
        implMulw(jArr3, j10, j13, jArr4, 0);
        implMulw(jArr3, j9, j12, jArr4, 2);
        implMulw(jArr3, j10 ^ j9, j13 ^ j12, jArr4, 4);
        long j14 = jArr4[1] ^ jArr4[2];
        long j15 = jArr4[0];
        long j16 = jArr4[3];
        long j17 = (jArr4[4] ^ j15) ^ j14;
        long j18 = j14 ^ (jArr4[5] ^ j16);
        jArr3[0] = j15 ^ (j17 << 57);
        jArr3[1] = (j17 >>> 7) ^ (j18 << 50);
        jArr3[2] = (j18 >>> 14) ^ (j16 << 43);
        jArr3[3] = j16 >>> 21;
    }

    protected static void implMulw(long[] jArr, long j8, long j9, long[] jArr2, int i8) {
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
        long j14 = jArr[((int) j8) & 7];
        long j15 = 0;
        int i9 = 48;
        do {
            int i10 = (int) (j8 >>> i9);
            long j16 = (jArr[(i10 >>> 6) & 7] << 6) ^ (jArr[i10 & 7] ^ (jArr[(i10 >>> 3) & 7] << 3));
            j14 ^= j16 << i9;
            j15 ^= j16 >>> (-i9);
            i9 -= 9;
        } while (i9 > 0);
        jArr2[i8] = M57 & j14;
        jArr2[i8 + 1] = (((((j8 & 72198606942111744L) & ((j9 << 7) >> 63)) >>> 8) ^ j15) << 7) ^ (j14 >>> 57);
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        b7.b.expand64To128(jArr, 0, 2, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (b7.d.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] create64 = b7.d.create64();
        long[] create642 = b7.d.create64();
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
        squareN(create642, 28, create64);
        multiply(create64, create642, create64);
        squareN(create64, 56, create642);
        multiply(create642, create64, create642);
        square(create642, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        implMultiply(jArr, jArr2, jArr4);
        reduce(jArr4, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        implMultiply(jArr, jArr2, jArr4);
        addExt(jArr3, jArr4, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = j10 ^ ((j11 >>> 40) ^ (j11 >>> 49));
        long j13 = j8 ^ ((j12 << 15) ^ (j12 << 24));
        long j14 = (j9 ^ ((j11 << 15) ^ (j11 << 24))) ^ ((j12 >>> 40) ^ (j12 >>> 49));
        long j15 = j14 >>> 49;
        jArr2[0] = (j13 ^ j15) ^ (j15 << 9);
        jArr2[1] = M49 & j14;
    }

    public static void reduce15(long[] jArr, int i8) {
        int i9 = i8 + 1;
        long j8 = jArr[i9];
        long j9 = j8 >>> 49;
        jArr[i8] = (j9 ^ (j9 << 9)) ^ jArr[i8];
        jArr[i9] = j8 & M49;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long unshuffle = b7.b.unshuffle(jArr[0]);
        long unshuffle2 = b7.b.unshuffle(jArr[1]);
        long j8 = (com.realsil.sdk.dfu.i.a.INVALID_VERSION_32 & unshuffle) | (unshuffle2 << 32);
        long j9 = (unshuffle >>> 32) | (unshuffle2 & (-4294967296L));
        jArr2[0] = ((j9 << 57) ^ j8) ^ (j9 << 5);
        jArr2[1] = (j9 >>> 59) ^ (j9 >>> 7);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] createExt64 = b7.d.createExt64();
        implSquare(jArr, createExt64);
        reduce(createExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] createExt64 = b7.d.createExt64();
        implSquare(jArr, createExt64);
        addExt(jArr2, createExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i8, long[] jArr2) {
        long[] createExt64 = b7.d.createExt64();
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
