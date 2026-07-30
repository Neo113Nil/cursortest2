package org.bouncycastle.math.ec.custom.sec;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public class k2 {
    private static final long M25 = 33554431;
    private static final long M59 = 576460752303423487L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i8 = 0; i8 < 13; i8++) {
            jArr3[i8] = jArr[i8] ^ jArr2[i8];
        }
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
        jArr2[5] = jArr2[5] ^ jArr[5];
        jArr2[6] = jArr2[6] ^ jArr[6];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return b7.n.fromBigInteger64(409, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] create64 = b7.n.create64(13);
        b7.k.copy64(jArr, jArr2);
        for (int i8 = 1; i8 < 409; i8 += 2) {
            implSquare(jArr2, create64);
            reduce(create64, jArr2);
            implSquare(jArr2, create64);
            reduce(create64, jArr2);
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
        long j16 = jArr[8];
        long j17 = jArr[9];
        long j18 = jArr[10];
        long j19 = jArr[11];
        long j20 = jArr[12];
        long j21 = jArr[13];
        jArr[0] = j8 ^ (j9 << 59);
        jArr[1] = (j9 >>> 5) ^ (j10 << 54);
        jArr[2] = (j10 >>> 10) ^ (j11 << 49);
        jArr[3] = (j11 >>> 15) ^ (j12 << 44);
        jArr[4] = (j12 >>> 20) ^ (j13 << 39);
        jArr[5] = (j13 >>> 25) ^ (j14 << 34);
        jArr[6] = (j14 >>> 30) ^ (j15 << 29);
        jArr[7] = (j15 >>> 35) ^ (j16 << 24);
        jArr[8] = (j16 >>> 40) ^ (j17 << 19);
        jArr[9] = (j17 >>> 45) ^ (j18 << 14);
        jArr[10] = (j18 >>> 50) ^ (j19 << 9);
        jArr[11] = ((j19 >>> 55) ^ (j20 << 4)) ^ (j21 << 63);
        jArr[12] = j21 >>> 1;
    }

    protected static void implExpand(long[] jArr, long[] jArr2) {
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        long j13 = jArr[5];
        long j14 = jArr[6];
        jArr2[0] = j8 & M59;
        jArr2[1] = ((j8 >>> 59) ^ (j9 << 5)) & M59;
        jArr2[2] = ((j9 >>> 54) ^ (j10 << 10)) & M59;
        jArr2[3] = ((j10 >>> 49) ^ (j11 << 15)) & M59;
        jArr2[4] = ((j11 >>> 44) ^ (j12 << 20)) & M59;
        jArr2[5] = ((j12 >>> 39) ^ (j13 << 25)) & M59;
        jArr2[6] = (j13 >>> 34) ^ (j14 << 30);
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[8];
        for (int i8 = 0; i8 < 7; i8++) {
            implMulwAcc(jArr6, jArr4[i8], jArr5[i8], jArr3, i8 << 1);
        }
        long j8 = jArr3[0];
        long j9 = jArr3[1];
        long j10 = jArr3[2] ^ j8;
        long j11 = j10 ^ j9;
        jArr3[1] = j11;
        long j12 = j9 ^ jArr3[3];
        long j13 = j10 ^ jArr3[4];
        long j14 = j13 ^ j12;
        jArr3[2] = j14;
        long j15 = j12 ^ jArr3[5];
        long j16 = j13 ^ jArr3[6];
        long j17 = j16 ^ j15;
        jArr3[3] = j17;
        long j18 = j15 ^ jArr3[7];
        long j19 = j16 ^ jArr3[8];
        long j20 = j19 ^ j18;
        jArr3[4] = j20;
        long j21 = j18 ^ jArr3[9];
        long j22 = j19 ^ jArr3[10];
        long j23 = j22 ^ j21;
        jArr3[5] = j23;
        long j24 = j21 ^ jArr3[11];
        long j25 = j22 ^ jArr3[12];
        long j26 = j25 ^ j24;
        jArr3[6] = j26;
        long j27 = (j24 ^ jArr3[13]) ^ j25;
        jArr3[7] = j8 ^ j27;
        jArr3[8] = j11 ^ j27;
        jArr3[9] = j14 ^ j27;
        jArr3[10] = j17 ^ j27;
        jArr3[11] = j20 ^ j27;
        jArr3[12] = j23 ^ j27;
        jArr3[13] = j26 ^ j27;
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[2], jArr5[0] ^ jArr5[2], jArr3, 2);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[3], jArr5[0] ^ jArr5[3], jArr3, 3);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[2], jArr5[1] ^ jArr5[2], jArr3, 3);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[4], jArr5[0] ^ jArr5[4], jArr3, 4);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[3], jArr5[1] ^ jArr5[3], jArr3, 4);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[5], jArr5[0] ^ jArr5[5], jArr3, 5);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[4], jArr5[1] ^ jArr5[4], jArr3, 5);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 5);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[6], jArr5[0] ^ jArr5[6], jArr3, 6);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[5], jArr5[1] ^ jArr5[5], jArr3, 6);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[4], jArr5[2] ^ jArr5[4], jArr3, 6);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[6], jArr5[1] ^ jArr5[6], jArr3, 7);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[5], jArr5[2] ^ jArr5[5], jArr3, 7);
        implMulwAcc(jArr6, jArr4[3] ^ jArr4[4], jArr5[3] ^ jArr5[4], jArr3, 7);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[6], jArr5[2] ^ jArr5[6], jArr3, 8);
        implMulwAcc(jArr6, jArr4[3] ^ jArr4[5], jArr5[3] ^ jArr5[5], jArr3, 8);
        implMulwAcc(jArr6, jArr4[3] ^ jArr4[6], jArr5[3] ^ jArr5[6], jArr3, 9);
        implMulwAcc(jArr6, jArr4[4] ^ jArr4[5], jArr5[4] ^ jArr5[5], jArr3, 9);
        implMulwAcc(jArr6, jArr4[4] ^ jArr4[6], jArr5[4] ^ jArr5[6], jArr3, 10);
        implMulwAcc(jArr6, jArr4[5] ^ jArr4[6], jArr5[5] ^ jArr5[6], jArr3, 11);
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
        jArr2[i8] = jArr2[i8] ^ (M59 & j14);
        int i12 = i8 + 1;
        jArr2[i12] = jArr2[i12] ^ ((j14 >>> 59) ^ (j15 << 5));
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        b7.b.expand64To128(jArr, 0, 6, jArr2, 0);
        jArr2[12] = b7.b.expand32to64((int) jArr[6]);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (b7.k.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] create64 = b7.k.create64();
        long[] create642 = b7.k.create64();
        long[] create643 = b7.k.create64();
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
        multiply(create64, create642, create643);
        squareN(create643, 24, create64);
        squareN(create64, 24, create642);
        multiply(create64, create642, create64);
        squareN(create64, 48, create642);
        multiply(create64, create642, create64);
        squareN(create64, 96, create642);
        multiply(create64, create642, create64);
        squareN(create64, PsExtractor.AUDIO_STREAM, create642);
        multiply(create64, create642, create64);
        multiply(create64, create643, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = b7.k.createExt64();
        implMultiply(jArr, jArr2, createExt64);
        reduce(createExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = b7.k.createExt64();
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
        long j16 = jArr[12];
        long j17 = j13 ^ (j16 << 39);
        long j18 = j14 ^ ((j16 >>> 25) ^ (j16 << 62));
        long j19 = j15 ^ (j16 >>> 2);
        long j20 = jArr[11];
        long j21 = j12 ^ (j20 << 39);
        long j22 = j17 ^ ((j20 >>> 25) ^ (j20 << 62));
        long j23 = j18 ^ (j20 >>> 2);
        long j24 = jArr[10];
        long j25 = j11 ^ (j24 << 39);
        long j26 = j21 ^ ((j24 >>> 25) ^ (j24 << 62));
        long j27 = j22 ^ (j24 >>> 2);
        long j28 = jArr[9];
        long j29 = j10 ^ (j28 << 39);
        long j30 = j25 ^ ((j28 >>> 25) ^ (j28 << 62));
        long j31 = j26 ^ (j28 >>> 2);
        long j32 = jArr[8];
        long j33 = j8 ^ (j19 << 39);
        long j34 = (j9 ^ (j32 << 39)) ^ ((j19 >>> 25) ^ (j19 << 62));
        long j35 = (j29 ^ ((j32 >>> 25) ^ (j32 << 62))) ^ (j19 >>> 2);
        long j36 = j23 >>> 25;
        jArr2[0] = j33 ^ j36;
        jArr2[1] = (j36 << 23) ^ j34;
        jArr2[2] = j35;
        jArr2[3] = j30 ^ (j32 >>> 2);
        jArr2[4] = j31;
        jArr2[5] = j27;
        jArr2[6] = j23 & M25;
    }

    public static void reduce39(long[] jArr, int i8) {
        int i9 = i8 + 6;
        long j8 = jArr[i9];
        long j9 = j8 >>> 25;
        jArr[i8] = jArr[i8] ^ j9;
        int i10 = i8 + 1;
        jArr[i10] = (j9 << 23) ^ jArr[i10];
        jArr[i9] = j8 & M25;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long unshuffle = b7.b.unshuffle(jArr[0]);
        long unshuffle2 = b7.b.unshuffle(jArr[1]);
        long j8 = (unshuffle & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) | (unshuffle2 << 32);
        long j9 = (unshuffle >>> 32) | (unshuffle2 & (-4294967296L));
        long unshuffle3 = b7.b.unshuffle(jArr[2]);
        long unshuffle4 = b7.b.unshuffle(jArr[3]);
        long j10 = (unshuffle3 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) | (unshuffle4 << 32);
        long j11 = (unshuffle3 >>> 32) | (unshuffle4 & (-4294967296L));
        long unshuffle5 = b7.b.unshuffle(jArr[4]);
        long unshuffle6 = b7.b.unshuffle(jArr[5]);
        long j12 = (unshuffle5 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) | (unshuffle6 << 32);
        long j13 = (unshuffle5 >>> 32) | (unshuffle6 & (-4294967296L));
        long unshuffle7 = b7.b.unshuffle(jArr[6]);
        long j14 = unshuffle7 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32;
        long j15 = unshuffle7 >>> 32;
        jArr2[0] = j8 ^ (j9 << 44);
        jArr2[1] = (j10 ^ (j11 << 44)) ^ (j9 >>> 20);
        jArr2[2] = (j12 ^ (j13 << 44)) ^ (j11 >>> 20);
        jArr2[3] = (((j15 << 44) ^ j14) ^ (j13 >>> 20)) ^ (j9 << 13);
        jArr2[4] = (j9 >>> 51) ^ ((unshuffle7 >>> 52) ^ (j11 << 13));
        jArr2[5] = (j13 << 13) ^ (j11 >>> 51);
        jArr2[6] = (j15 << 13) ^ (j13 >>> 51);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] create64 = b7.n.create64(13);
        implSquare(jArr, create64);
        reduce(create64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] create64 = b7.n.create64(13);
        implSquare(jArr, create64);
        addExt(jArr2, create64, jArr2);
    }

    public static void squareN(long[] jArr, int i8, long[] jArr2) {
        long[] create64 = b7.n.create64(13);
        implSquare(jArr, create64);
        while (true) {
            reduce(create64, jArr2);
            i8--;
            if (i8 <= 0) {
                return;
            } else {
                implSquare(jArr2, create64);
            }
        }
    }

    public static int trace(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }
}
