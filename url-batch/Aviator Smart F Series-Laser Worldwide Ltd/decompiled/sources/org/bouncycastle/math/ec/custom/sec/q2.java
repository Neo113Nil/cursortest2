package org.bouncycastle.math.ec.custom.sec;

import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import com.realsil.sdk.dfu.DfuException;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public class q2 {
    private static final long M59 = 576460752303423487L;
    private static final long[] ROOT_Z = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    private static void add(long[] jArr, int i8, long[] jArr2, int i9, long[] jArr3, int i10) {
        for (int i11 = 0; i11 < 9; i11++) {
            jArr3[i10 + i11] = jArr[i8 + i11] ^ jArr2[i9 + i11];
        }
    }

    private static void addBothTo(long[] jArr, int i8, long[] jArr2, int i9, long[] jArr3, int i10) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = i10 + i11;
            jArr3[i12] = jArr3[i12] ^ (jArr[i8 + i11] ^ jArr2[i9 + i11]);
        }
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i8 = 0; i8 < 18; i8++) {
            jArr3[i8] = jArr[i8] ^ jArr2[i8];
        }
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i8 = 1; i8 < 9; i8++) {
            jArr2[i8] = jArr[i8];
        }
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        for (int i8 = 0; i8 < 9; i8++) {
            jArr2[i8] = jArr2[i8] ^ jArr[i8];
        }
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return b7.n.fromBigInteger64(571, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] createExt64 = b7.m.createExt64();
        b7.m.copy64(jArr, jArr2);
        for (int i8 = 1; i8 < 571; i8 += 2) {
            implSquare(jArr2, createExt64);
            reduce(createExt64, jArr2);
            implSquare(jArr2, createExt64);
            reduce(createExt64, jArr2);
            addTo(jArr, jArr2);
        }
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[16];
        for (int i8 = 0; i8 < 9; i8++) {
            implMulwAcc(jArr4, jArr[i8], jArr2[i8], jArr3, i8 << 1);
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
        long j27 = j24 ^ jArr3[13];
        long j28 = j25 ^ jArr3[14];
        long j29 = j28 ^ j27;
        jArr3[7] = j29;
        long j30 = j27 ^ jArr3[15];
        long j31 = j28 ^ jArr3[16];
        long j32 = j31 ^ j30;
        jArr3[8] = j32;
        long j33 = (j30 ^ jArr3[17]) ^ j31;
        jArr3[9] = j8 ^ j33;
        jArr3[10] = j11 ^ j33;
        jArr3[11] = j14 ^ j33;
        jArr3[12] = j17 ^ j33;
        jArr3[13] = j20 ^ j33;
        jArr3[14] = j23 ^ j33;
        jArr3[15] = j26 ^ j33;
        jArr3[16] = j29 ^ j33;
        jArr3[17] = j32 ^ j33;
        implMulwAcc(jArr4, jArr[0] ^ jArr[1], jArr2[0] ^ jArr2[1], jArr3, 1);
        implMulwAcc(jArr4, jArr[0] ^ jArr[2], jArr2[0] ^ jArr2[2], jArr3, 2);
        implMulwAcc(jArr4, jArr[0] ^ jArr[3], jArr2[0] ^ jArr2[3], jArr3, 3);
        implMulwAcc(jArr4, jArr[1] ^ jArr[2], jArr2[1] ^ jArr2[2], jArr3, 3);
        implMulwAcc(jArr4, jArr[0] ^ jArr[4], jArr2[0] ^ jArr2[4], jArr3, 4);
        implMulwAcc(jArr4, jArr[1] ^ jArr[3], jArr2[1] ^ jArr2[3], jArr3, 4);
        implMulwAcc(jArr4, jArr[0] ^ jArr[5], jArr2[0] ^ jArr2[5], jArr3, 5);
        implMulwAcc(jArr4, jArr[1] ^ jArr[4], jArr2[1] ^ jArr2[4], jArr3, 5);
        implMulwAcc(jArr4, jArr[2] ^ jArr[3], jArr2[2] ^ jArr2[3], jArr3, 5);
        implMulwAcc(jArr4, jArr[0] ^ jArr[6], jArr2[0] ^ jArr2[6], jArr3, 6);
        implMulwAcc(jArr4, jArr[1] ^ jArr[5], jArr2[1] ^ jArr2[5], jArr3, 6);
        implMulwAcc(jArr4, jArr[2] ^ jArr[4], jArr2[2] ^ jArr2[4], jArr3, 6);
        implMulwAcc(jArr4, jArr[0] ^ jArr[7], jArr2[0] ^ jArr2[7], jArr3, 7);
        implMulwAcc(jArr4, jArr[1] ^ jArr[6], jArr2[1] ^ jArr2[6], jArr3, 7);
        implMulwAcc(jArr4, jArr[2] ^ jArr[5], jArr2[2] ^ jArr2[5], jArr3, 7);
        implMulwAcc(jArr4, jArr[3] ^ jArr[4], jArr2[3] ^ jArr2[4], jArr3, 7);
        implMulwAcc(jArr4, jArr[0] ^ jArr[8], jArr2[0] ^ jArr2[8], jArr3, 8);
        implMulwAcc(jArr4, jArr[1] ^ jArr[7], jArr2[1] ^ jArr2[7], jArr3, 8);
        implMulwAcc(jArr4, jArr[2] ^ jArr[6], jArr2[2] ^ jArr2[6], jArr3, 8);
        implMulwAcc(jArr4, jArr[3] ^ jArr[5], jArr2[3] ^ jArr2[5], jArr3, 8);
        implMulwAcc(jArr4, jArr[1] ^ jArr[8], jArr2[1] ^ jArr2[8], jArr3, 9);
        implMulwAcc(jArr4, jArr[2] ^ jArr[7], jArr2[2] ^ jArr2[7], jArr3, 9);
        implMulwAcc(jArr4, jArr[3] ^ jArr[6], jArr2[3] ^ jArr2[6], jArr3, 9);
        implMulwAcc(jArr4, jArr[4] ^ jArr[5], jArr2[4] ^ jArr2[5], jArr3, 9);
        implMulwAcc(jArr4, jArr[2] ^ jArr[8], jArr2[2] ^ jArr2[8], jArr3, 10);
        implMulwAcc(jArr4, jArr[3] ^ jArr[7], jArr2[3] ^ jArr2[7], jArr3, 10);
        implMulwAcc(jArr4, jArr[4] ^ jArr[6], jArr2[4] ^ jArr2[6], jArr3, 10);
        implMulwAcc(jArr4, jArr[3] ^ jArr[8], jArr2[3] ^ jArr2[8], jArr3, 11);
        implMulwAcc(jArr4, jArr[4] ^ jArr[7], jArr2[4] ^ jArr2[7], jArr3, 11);
        implMulwAcc(jArr4, jArr[5] ^ jArr[6], jArr2[5] ^ jArr2[6], jArr3, 11);
        implMulwAcc(jArr4, jArr[4] ^ jArr[8], jArr2[4] ^ jArr2[8], jArr3, 12);
        implMulwAcc(jArr4, jArr[5] ^ jArr[7], jArr2[5] ^ jArr2[7], jArr3, 12);
        implMulwAcc(jArr4, jArr[5] ^ jArr[8], jArr2[5] ^ jArr2[8], jArr3, 13);
        implMulwAcc(jArr4, jArr[6] ^ jArr[7], jArr2[6] ^ jArr2[7], jArr3, 13);
        implMulwAcc(jArr4, jArr[6] ^ jArr[8], jArr2[6] ^ jArr2[8], jArr3, 14);
        implMulwAcc(jArr4, jArr[7] ^ jArr[8], jArr2[7] ^ jArr2[8], jArr3, 15);
    }

    protected static void implMultiplyPrecomp(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i8 = 56; i8 >= 0; i8 -= 8) {
            for (int i9 = 1; i9 < 9; i9 += 2) {
                int i10 = (int) (jArr[i9] >>> i8);
                addBothTo(jArr2, (i10 & 15) * 9, jArr2, (((i10 >>> 4) & 15) + 16) * 9, jArr3, i9 - 1);
            }
            b7.n.shiftUpBits64(16, jArr3, 0, 8, 0L);
        }
        for (int i11 = 56; i11 >= 0; i11 -= 8) {
            for (int i12 = 0; i12 < 9; i12 += 2) {
                int i13 = (int) (jArr[i12] >>> i11);
                addBothTo(jArr2, (i13 & 15) * 9, jArr2, (((i13 >>> 4) & 15) + 16) * 9, jArr3, i12);
            }
            if (i11 > 0) {
                b7.n.shiftUpBits64(18, jArr3, 0, 8, 0L);
            }
        }
    }

    protected static void implMulwAcc(long[] jArr, long j8, long j9, long[] jArr2, int i8) {
        long j10 = j8;
        jArr[1] = j9;
        for (int i9 = 2; i9 < 16; i9 += 2) {
            long j11 = jArr[i9 >>> 1] << 1;
            jArr[i9] = j11;
            jArr[i9 + 1] = j11 ^ j9;
        }
        int i10 = (int) j10;
        long j12 = jArr[i10 & 15] ^ (jArr[(i10 >>> 4) & 15] << 4);
        long j13 = 0;
        int i11 = 56;
        do {
            int i12 = (int) (j10 >>> i11);
            long j14 = (jArr[(i12 >>> 4) & 15] << 4) ^ jArr[i12 & 15];
            j12 ^= j14 << i11;
            j13 ^= j14 >>> (-i11);
            i11 -= 8;
        } while (i11 > 0);
        for (int i13 = 0; i13 < 7; i13++) {
            j10 = (j10 & (-72340172838076674L)) >>> 1;
            j13 ^= ((j9 << i13) >> 63) & j10;
        }
        jArr2[i8] = jArr2[i8] ^ j12;
        int i14 = i8 + 1;
        jArr2[i14] = jArr2[i14] ^ j13;
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        b7.b.expand64To128(jArr, 0, 9, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (b7.m.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] create64 = b7.m.create64();
        long[] create642 = b7.m.create64();
        long[] create643 = b7.m.create64();
        square(jArr, create643);
        square(create643, create64);
        square(create64, create642);
        multiply(create64, create642, create64);
        squareN(create64, 2, create642);
        multiply(create64, create642, create64);
        multiply(create64, create643, create64);
        squareN(create64, 5, create642);
        multiply(create64, create642, create64);
        squareN(create642, 5, create642);
        multiply(create64, create642, create64);
        squareN(create64, 15, create642);
        multiply(create64, create642, create643);
        squareN(create643, 30, create64);
        squareN(create64, 30, create642);
        multiply(create64, create642, create64);
        squareN(create64, 60, create642);
        multiply(create64, create642, create64);
        squareN(create642, 60, create642);
        multiply(create64, create642, create64);
        squareN(create64, com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME, create642);
        multiply(create64, create642, create64);
        squareN(create642, com.crrepa.band.my.device.customkey.util.c.MAX_GOAL_TIME, create642);
        multiply(create64, create642, create64);
        multiply(create64, create643, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = b7.m.createExt64();
        implMultiply(jArr, jArr2, createExt64);
        reduce(createExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = b7.m.createExt64();
        implMultiply(jArr, jArr2, createExt64);
        addExt(jArr3, createExt64, jArr3);
    }

    public static void multiplyPrecomp(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = b7.m.createExt64();
        implMultiplyPrecomp(jArr, jArr2, createExt64);
        reduce(createExt64, jArr3);
    }

    public static void multiplyPrecompAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] createExt64 = b7.m.createExt64();
        implMultiplyPrecomp(jArr, jArr2, createExt64);
        addExt(jArr3, createExt64, jArr3);
    }

    public static long[] precompMultiplicand(long[] jArr) {
        long[] jArr2 = new long[DfuException.ERROR_DFU_COPY_IMAGE_FAILED];
        int i8 = 0;
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i9 = 7;
        while (i9 > 0) {
            int i10 = i8 + 18;
            b7.n.shiftUpBit64(9, jArr2, i10 >>> 1, 0L, jArr2, i10);
            reduce5(jArr2, i10);
            add(jArr2, 9, jArr2, i10, jArr2, i8 + 27);
            i9--;
            i8 = i10;
        }
        b7.n.shiftUpBits64(GattError.GATT_DUP_REG, jArr2, 0, 4, 0L, jArr2, GattError.GATT_DUP_REG);
        return jArr2;
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j8 = jArr[9];
        long j9 = jArr[17];
        long j10 = (((j8 ^ (j9 >>> 59)) ^ (j9 >>> 57)) ^ (j9 >>> 54)) ^ (j9 >>> 49);
        long j11 = (j9 << 15) ^ (((jArr[8] ^ (j9 << 5)) ^ (j9 << 7)) ^ (j9 << 10));
        for (int i8 = 16; i8 >= 10; i8--) {
            long j12 = jArr[i8];
            jArr2[i8 - 8] = (((j11 ^ (j12 >>> 59)) ^ (j12 >>> 57)) ^ (j12 >>> 54)) ^ (j12 >>> 49);
            j11 = (((jArr[i8 - 9] ^ (j12 << 5)) ^ (j12 << 7)) ^ (j12 << 10)) ^ (j12 << 15);
        }
        jArr2[1] = (((j11 ^ (j10 >>> 59)) ^ (j10 >>> 57)) ^ (j10 >>> 54)) ^ (j10 >>> 49);
        long j13 = (j10 << 15) ^ (((jArr[0] ^ (j10 << 5)) ^ (j10 << 7)) ^ (j10 << 10));
        long j14 = jArr2[8];
        long j15 = j14 >>> 59;
        jArr2[0] = (((j13 ^ j15) ^ (j15 << 2)) ^ (j15 << 5)) ^ (j15 << 10);
        jArr2[8] = M59 & j14;
    }

    public static void reduce5(long[] jArr, int i8) {
        int i9 = i8 + 8;
        long j8 = jArr[i9];
        long j9 = j8 >>> 59;
        jArr[i8] = ((j9 << 10) ^ (((j9 << 2) ^ j9) ^ (j9 << 5))) ^ jArr[i8];
        jArr[i9] = j8 & M59;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] create64 = b7.m.create64();
        long[] create642 = b7.m.create64();
        int i8 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = i8 + 1;
            long unshuffle = b7.b.unshuffle(jArr[i8]);
            i8 += 2;
            long unshuffle2 = b7.b.unshuffle(jArr[i10]);
            create64[i9] = (com.realsil.sdk.dfu.i.a.INVALID_VERSION_32 & unshuffle) | (unshuffle2 << 32);
            create642[i9] = (unshuffle >>> 32) | ((-4294967296L) & unshuffle2);
        }
        long unshuffle3 = b7.b.unshuffle(jArr[i8]);
        create64[4] = com.realsil.sdk.dfu.i.a.INVALID_VERSION_32 & unshuffle3;
        create642[4] = unshuffle3 >>> 32;
        multiply(create642, ROOT_Z, jArr2);
        add(jArr2, create64, jArr2);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] createExt64 = b7.m.createExt64();
        implSquare(jArr, createExt64);
        reduce(createExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] createExt64 = b7.m.createExt64();
        implSquare(jArr, createExt64);
        addExt(jArr2, createExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i8, long[] jArr2) {
        long[] createExt64 = b7.m.createExt64();
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
        long j8 = jArr[0];
        long j9 = jArr[8];
        return ((int) ((j8 ^ (j9 >>> 49)) ^ (j9 >>> 57))) & 1;
    }

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i8 = 0; i8 < 9; i8++) {
            jArr3[i8] = jArr[i8] ^ jArr2[i8];
        }
    }

    public static void addBothTo(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i8 = 0; i8 < 9; i8++) {
            jArr3[i8] = jArr3[i8] ^ (jArr[i8] ^ jArr2[i8]);
        }
    }
}
