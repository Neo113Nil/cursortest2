package org.bouncycastle.math.ec.custom.sec;

import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public class e2 {
    private static final long M27 = 134217727;
    private static final long M57 = 144115188075855871L;
    private static final long[] ROOT_Z = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return b7.n.fromBigInteger64(283, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] create64 = b7.n.create64(9);
        b7.i.copy64(jArr, jArr2);
        for (int i8 = 1; i8 < 283; i8 += 2) {
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
        jArr[0] = j8 ^ (j9 << 57);
        jArr[1] = (j9 >>> 7) ^ (j10 << 50);
        jArr[2] = (j10 >>> 14) ^ (j11 << 43);
        jArr[3] = (j11 >>> 21) ^ (j12 << 36);
        jArr[4] = (j12 >>> 28) ^ (j13 << 29);
        jArr[5] = (j13 >>> 35) ^ (j14 << 22);
        jArr[6] = (j14 >>> 42) ^ (j15 << 15);
        jArr[7] = (j15 >>> 49) ^ (j16 << 8);
        jArr[8] = (j16 >>> 56) ^ (j17 << 1);
        jArr[9] = j17 >>> 63;
    }

    protected static void implExpand(long[] jArr, long[] jArr2) {
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        jArr2[0] = j8 & M57;
        jArr2[1] = ((j8 >>> 57) ^ (j9 << 7)) & M57;
        jArr2[2] = ((j9 >>> 50) ^ (j10 << 14)) & M57;
        jArr2[3] = ((j10 >>> 43) ^ (j11 << 21)) & M57;
        jArr2[4] = (j11 >>> 36) ^ (j12 << 28);
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[26];
        implMulw(jArr3, jArr4[0], jArr5[0], jArr6, 0);
        implMulw(jArr3, jArr4[1], jArr5[1], jArr6, 2);
        implMulw(jArr3, jArr4[2], jArr5[2], jArr6, 4);
        implMulw(jArr3, jArr4[3], jArr5[3], jArr6, 6);
        implMulw(jArr3, jArr4[4], jArr5[4], jArr6, 8);
        long j8 = jArr4[0];
        long j9 = j8 ^ jArr4[1];
        long j10 = jArr5[0];
        long j11 = j10 ^ jArr5[1];
        long j12 = jArr4[2];
        long j13 = j8 ^ j12;
        long j14 = jArr5[2];
        long j15 = j10 ^ j14;
        long j16 = jArr4[4];
        long j17 = j12 ^ j16;
        long j18 = jArr5[4];
        long j19 = j14 ^ j18;
        long j20 = jArr4[3];
        long j21 = j20 ^ j16;
        long j22 = jArr5[3];
        long j23 = j22 ^ j18;
        implMulw(jArr3, j13 ^ j20, j15 ^ j22, jArr6, 18);
        implMulw(jArr3, j17 ^ jArr4[1], j19 ^ jArr5[1], jArr6, 20);
        long j24 = j9 ^ j21;
        long j25 = j11 ^ j23;
        long j26 = j24 ^ jArr4[2];
        long j27 = j25 ^ jArr5[2];
        implMulw(jArr3, j24, j25, jArr6, 22);
        implMulw(jArr3, j26, j27, jArr6, 24);
        implMulw(jArr3, j9, j11, jArr6, 10);
        implMulw(jArr3, j13, j15, jArr6, 12);
        implMulw(jArr3, j17, j19, jArr6, 14);
        implMulw(jArr3, j21, j23, jArr6, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j28 = jArr6[0];
        long j29 = jArr6[1] ^ j28;
        long j30 = jArr6[2] ^ j29;
        long j31 = jArr6[10] ^ j30;
        jArr3[1] = j31;
        long j32 = jArr6[3] ^ jArr6[4];
        long j33 = j30 ^ (j32 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j33;
        long j34 = j29 ^ j32;
        long j35 = jArr6[5] ^ jArr6[6];
        long j36 = jArr6[8];
        long j37 = (j34 ^ j35) ^ j36;
        long j38 = jArr6[13] ^ jArr6[14];
        long j39 = jArr6[18];
        long j40 = jArr6[22];
        long j41 = jArr6[24];
        jArr3[3] = (j37 ^ j38) ^ ((j39 ^ j40) ^ j41);
        long j42 = jArr6[7] ^ j36;
        long j43 = jArr6[9];
        long j44 = j42 ^ j43;
        long j45 = j44 ^ jArr6[17];
        jArr3[8] = j45;
        long j46 = (j44 ^ j35) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j46;
        long j47 = j31 ^ j46;
        long j48 = jArr6[19] ^ jArr6[20];
        long j49 = jArr6[25];
        long j50 = jArr6[23];
        long j51 = j48 ^ (j49 ^ j41);
        jArr3[4] = (j51 ^ (j39 ^ j50)) ^ j47;
        long j52 = jArr6[21];
        jArr3[5] = ((j33 ^ j45) ^ j51) ^ (j52 ^ j40);
        jArr3[6] = (((((j37 ^ j28) ^ j43) ^ j38) ^ j52) ^ j50) ^ j49;
        implCompactExt(jArr3);
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
        b7.b.expand64To128(jArr, 0, 4, jArr2, 0);
        jArr2[8] = b7.b.expand32to64((int) jArr[4]);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (b7.i.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] create64 = b7.i.create64();
        long[] create642 = b7.i.create64();
        square(jArr, create64);
        multiply(create64, jArr, create64);
        squareN(create64, 2, create642);
        multiply(create642, create64, create642);
        squareN(create642, 4, create64);
        multiply(create64, create642, create64);
        squareN(create64, 8, create642);
        multiply(create642, create64, create642);
        square(create642, create642);
        multiply(create642, jArr, create642);
        squareN(create642, 17, create64);
        multiply(create64, create642, create64);
        square(create64, create64);
        multiply(create64, jArr, create64);
        squareN(create64, 35, create642);
        multiply(create642, create64, create642);
        squareN(create642, 70, create64);
        multiply(create64, create642, create64);
        square(create64, create64);
        multiply(create64, jArr, create64);
        squareN(create64, GattError.GATT_ENCRYPED_NO_MITM, create642);
        multiply(create642, create64, create642);
        square(create642, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = b7.i.createExt64();
        implMultiply(jArr, jArr2, createExt64);
        reduce(createExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = b7.i.createExt64();
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
        long j16 = jArr[8];
        long j17 = j12 ^ ((((j16 >>> 27) ^ (j16 >>> 22)) ^ (j16 >>> 20)) ^ (j16 >>> 15));
        long j18 = j8 ^ ((((j13 << 37) ^ (j13 << 42)) ^ (j13 << 44)) ^ (j13 << 49));
        long j19 = (j9 ^ ((((j14 << 37) ^ (j14 << 42)) ^ (j14 << 44)) ^ (j14 << 49))) ^ ((((j13 >>> 27) ^ (j13 >>> 22)) ^ (j13 >>> 20)) ^ (j13 >>> 15));
        long j20 = j17 >>> 27;
        jArr2[0] = (((j18 ^ j20) ^ (j20 << 5)) ^ (j20 << 7)) ^ (j20 << 12);
        jArr2[1] = j19;
        jArr2[2] = (j10 ^ ((((j15 << 37) ^ (j15 << 42)) ^ (j15 << 44)) ^ (j15 << 49))) ^ ((((j14 >>> 27) ^ (j14 >>> 22)) ^ (j14 >>> 20)) ^ (j14 >>> 15));
        jArr2[3] = (j11 ^ ((((j16 << 37) ^ (j16 << 42)) ^ (j16 << 44)) ^ (j16 << 49))) ^ ((((j15 >>> 27) ^ (j15 >>> 22)) ^ (j15 >>> 20)) ^ (j15 >>> 15));
        jArr2[4] = M27 & j17;
    }

    public static void reduce37(long[] jArr, int i8) {
        int i9 = i8 + 4;
        long j8 = jArr[i9];
        long j9 = j8 >>> 27;
        jArr[i8] = ((j9 << 12) ^ (((j9 << 5) ^ j9) ^ (j9 << 7))) ^ jArr[i8];
        jArr[i9] = j8 & M27;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] create64 = b7.i.create64();
        long unshuffle = b7.b.unshuffle(jArr[0]);
        long unshuffle2 = b7.b.unshuffle(jArr[1]);
        long j8 = (unshuffle & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) | (unshuffle2 << 32);
        create64[0] = (unshuffle >>> 32) | (unshuffle2 & (-4294967296L));
        long unshuffle3 = b7.b.unshuffle(jArr[2]);
        long unshuffle4 = b7.b.unshuffle(jArr[3]);
        long j9 = (unshuffle3 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) | (unshuffle4 << 32);
        create64[1] = (unshuffle3 >>> 32) | ((-4294967296L) & unshuffle4);
        long unshuffle5 = b7.b.unshuffle(jArr[4]);
        long j10 = com.realsil.sdk.dfu.i.a.INVALID_VERSION_32 & unshuffle5;
        create64[2] = unshuffle5 >>> 32;
        multiply(create64, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ j8;
        jArr2[1] = jArr2[1] ^ j9;
        jArr2[2] = jArr2[2] ^ j10;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] create64 = b7.n.create64(9);
        implSquare(jArr, create64);
        reduce(create64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] create64 = b7.n.create64(9);
        implSquare(jArr, create64);
        addExt(jArr2, create64, jArr2);
    }

    public static void squareN(long[] jArr, int i8, long[] jArr2) {
        long[] create64 = b7.n.create64(9);
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
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }
}
