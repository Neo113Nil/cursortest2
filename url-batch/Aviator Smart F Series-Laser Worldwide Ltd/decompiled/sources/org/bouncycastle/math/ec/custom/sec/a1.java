package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class a1 {
    private static final long M03 = 7;
    private static final long M44 = 17592186044415L;
    private static final long[] ROOT_Z = {2791191049453778211L, 2791191049453778402L, 6};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return b7.n.fromBigInteger64(131, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] create64 = b7.n.create64(5);
        b7.f.copy64(jArr, jArr2);
        for (int i8 = 1; i8 < 131; i8 += 2) {
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
        jArr[0] = j8 ^ (j9 << 44);
        jArr[1] = (j9 >>> 20) ^ (j10 << 24);
        jArr[2] = ((j10 >>> 40) ^ (j11 << 4)) ^ (j12 << 48);
        jArr[3] = ((j11 >>> 60) ^ (j13 << 28)) ^ (j12 >>> 16);
        jArr[4] = j13 >>> 36;
        jArr[5] = 0;
    }

    protected static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j8 = jArr[0];
        long j9 = jArr[1];
        long j10 = ((jArr[2] << 40) ^ (j9 >>> 24)) & M44;
        long j11 = ((j9 << 20) ^ (j8 >>> 44)) & M44;
        long j12 = j8 & M44;
        long j13 = jArr2[0];
        long j14 = jArr2[1];
        long j15 = ((j14 >>> 24) ^ (jArr2[2] << 40)) & M44;
        long j16 = ((j14 << 20) ^ (j13 >>> 44)) & M44;
        long j17 = j13 & M44;
        long[] jArr4 = new long[10];
        implMulw(jArr3, j12, j17, jArr4, 0);
        implMulw(jArr3, j10, j15, jArr4, 2);
        long j18 = (j12 ^ j11) ^ j10;
        long j19 = (j17 ^ j16) ^ j15;
        implMulw(jArr3, j18, j19, jArr4, 4);
        long j20 = (j11 << 1) ^ (j10 << 2);
        long j21 = (j16 << 1) ^ (j15 << 2);
        implMulw(jArr3, j12 ^ j20, j17 ^ j21, jArr4, 6);
        implMulw(jArr3, j18 ^ j20, j19 ^ j21, jArr4, 8);
        long j22 = jArr4[6];
        long j23 = jArr4[8] ^ j22;
        long j24 = jArr4[7];
        long j25 = jArr4[9] ^ j24;
        long j26 = (j23 << 1) ^ j22;
        long j27 = (j23 ^ (j25 << 1)) ^ j24;
        long j28 = jArr4[0];
        long j29 = jArr4[1];
        long j30 = (j29 ^ j28) ^ jArr4[4];
        long j31 = j29 ^ jArr4[5];
        long j32 = jArr4[2];
        long j33 = ((j26 ^ j28) ^ (j32 << 4)) ^ (j32 << 1);
        long j34 = jArr4[3];
        long j35 = (((j30 ^ j27) ^ (j34 << 4)) ^ (j34 << 1)) ^ (j33 >>> 44);
        long j36 = j33 & M44;
        long j37 = (j31 ^ j25) ^ (j35 >>> 44);
        long j38 = (j36 >>> 1) ^ ((j35 & 1) << 43);
        long j39 = ((j35 & M44) >>> 1) ^ ((j37 & 1) << 43);
        long j40 = j38 ^ (j38 << 1);
        long j41 = j40 ^ (j40 << 2);
        long j42 = j41 ^ (j41 << 4);
        long j43 = j42 ^ (j42 << 8);
        long j44 = j43 ^ (j43 << 16);
        long j45 = (j44 ^ (j44 << 32)) & M44;
        long j46 = j39 ^ (j45 >>> 43);
        long j47 = j46 ^ (j46 << 1);
        long j48 = j47 ^ (j47 << 2);
        long j49 = j48 ^ (j48 << 4);
        long j50 = j49 ^ (j49 << 8);
        long j51 = j50 ^ (j50 << 16);
        long j52 = (j51 ^ (j51 << 32)) & M44;
        long j53 = (j52 >>> 43) ^ (j37 >>> 1);
        long j54 = j53 ^ (j53 << 1);
        long j55 = j54 ^ (j54 << 2);
        long j56 = j55 ^ (j55 << 4);
        long j57 = j56 ^ (j56 << 8);
        long j58 = j57 ^ (j57 << 16);
        long j59 = j58 ^ (j58 << 32);
        jArr3[0] = j28;
        jArr3[1] = (j30 ^ j45) ^ j32;
        jArr3[2] = (j45 ^ (j31 ^ j52)) ^ j34;
        jArr3[3] = j59 ^ j52;
        jArr3[4] = jArr4[2] ^ j59;
        jArr3[5] = jArr4[3];
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
        int i9 = (int) j8;
        long j14 = (((jArr[i9 & 7] ^ (jArr[(i9 >>> 3) & 7] << 3)) ^ (jArr[(i9 >>> 6) & 7] << 6)) ^ (jArr[(i9 >>> 9) & 7] << 9)) ^ (jArr[(i9 >>> 12) & 7] << 12);
        long j15 = 0;
        int i10 = 30;
        do {
            int i11 = (int) (j8 >>> i10);
            long j16 = (jArr[(i11 >>> 12) & 7] << 12) ^ (((jArr[i11 & 7] ^ (jArr[(i11 >>> 3) & 7] << 3)) ^ (jArr[(i11 >>> 6) & 7] << 6)) ^ (jArr[(i11 >>> 9) & 7] << 9));
            j14 ^= j16 << i10;
            j15 ^= j16 >>> (-i10);
            i10 -= 15;
        } while (i10 > 0);
        jArr2[i8] = M44 & j14;
        jArr2[i8 + 1] = (j14 >>> 44) ^ (j15 << 20);
    }

    protected static void implSquare(long[] jArr, long[] jArr2) {
        b7.b.expand64To128(jArr, 0, 2, jArr2, 0);
        jArr2[4] = b7.b.expand8to16((int) jArr[2]) & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (b7.f.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] create64 = b7.f.create64();
        long[] create642 = b7.f.create64();
        square(jArr, create64);
        multiply(create64, jArr, create64);
        squareN(create64, 2, create642);
        multiply(create642, create64, create642);
        squareN(create642, 4, create64);
        multiply(create64, create642, create64);
        squareN(create64, 8, create642);
        multiply(create642, create64, create642);
        squareN(create642, 16, create64);
        multiply(create64, create642, create64);
        squareN(create64, 32, create642);
        multiply(create642, create64, create642);
        square(create642, create642);
        multiply(create642, jArr, create642);
        squareN(create642, 65, create64);
        multiply(create64, create642, create64);
        square(create64, jArr2);
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
        long j12 = jArr[4];
        long j13 = j11 ^ (j12 >>> 59);
        long j14 = j8 ^ ((j13 << 61) ^ (j13 << 63));
        long j15 = (j9 ^ ((j12 << 61) ^ (j12 << 63))) ^ ((((j13 >>> 3) ^ (j13 >>> 1)) ^ j13) ^ (j13 << 5));
        long j16 = (j10 ^ ((((j12 >>> 3) ^ (j12 >>> 1)) ^ j12) ^ (j12 << 5))) ^ (j13 >>> 59);
        long j17 = j16 >>> 3;
        jArr2[0] = (((j14 ^ j17) ^ (j17 << 2)) ^ (j17 << 3)) ^ (j17 << 8);
        jArr2[1] = (j16 >>> 59) ^ j15;
        jArr2[2] = M03 & j16;
    }

    public static void reduce61(long[] jArr, int i8) {
        int i9 = i8 + 2;
        long j8 = jArr[i9];
        long j9 = j8 >>> 3;
        jArr[i8] = ((j9 << 8) ^ (((j9 << 2) ^ j9) ^ (j9 << 3))) ^ jArr[i8];
        int i10 = i8 + 1;
        jArr[i10] = jArr[i10] ^ (j8 >>> 59);
        jArr[i9] = j8 & M03;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] create64 = b7.f.create64();
        long unshuffle = b7.b.unshuffle(jArr[0]);
        long unshuffle2 = b7.b.unshuffle(jArr[1]);
        long j8 = (unshuffle & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) | (unshuffle2 << 32);
        create64[0] = (unshuffle >>> 32) | (unshuffle2 & (-4294967296L));
        long unshuffle3 = b7.b.unshuffle(jArr[2]);
        long j9 = unshuffle3 & com.realsil.sdk.dfu.i.a.INVALID_VERSION_32;
        create64[1] = unshuffle3 >>> 32;
        multiply(create64, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ j8;
        jArr2[1] = jArr2[1] ^ j9;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] create64 = b7.n.create64(5);
        implSquare(jArr, create64);
        reduce(create64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] create64 = b7.n.create64(5);
        implSquare(jArr, create64);
        addExt(jArr2, create64, jArr2);
    }

    public static void squareN(long[] jArr, int i8, long[] jArr2) {
        long[] create64 = b7.n.create64(5);
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
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
    }
}
