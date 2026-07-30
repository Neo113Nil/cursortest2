package b7;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class i {
    public static void copy64(long[] jArr, int i8, long[] jArr2, int i9) {
        jArr2[i9] = jArr[i8];
        jArr2[i9 + 1] = jArr[i8 + 1];
        jArr2[i9 + 2] = jArr[i8 + 2];
        jArr2[i9 + 3] = jArr[i8 + 3];
        jArr2[i9 + 4] = jArr[i8 + 4];
    }

    public static long[] create64() {
        return new long[5];
    }

    public static long[] createExt64() {
        return new long[10];
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i8 = 4; i8 >= 0; i8--) {
            if (jArr[i8] != jArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 320) {
            throw new IllegalArgumentException();
        }
        long[] create64 = create64();
        for (int i8 = 0; i8 < 5; i8++) {
            create64[i8] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return create64;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i8 = 1; i8 < 5; i8++) {
            if (jArr[i8] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i8 = 0; i8 < 5; i8++) {
            if (jArr[i8] != 0) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[40];
        for (int i8 = 0; i8 < 5; i8++) {
            long j8 = jArr[i8];
            if (j8 != 0) {
                org.bouncycastle.util.i.longToBigEndian(j8, bArr, (4 - i8) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }
}
