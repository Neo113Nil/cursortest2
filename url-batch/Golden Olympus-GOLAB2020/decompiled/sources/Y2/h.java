package Y2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class h {
    public static long[] a() {
        return new long[5];
    }

    public static long[] b() {
        return new long[10];
    }

    public static boolean c(long[] jArr, long[] jArr2) {
        for (int i4 = 4; i4 >= 0; i4--) {
            if (jArr[i4] != jArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    public static long[] d(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 320) {
            throw new IllegalArgumentException();
        }
        long[] a4 = a();
        int i4 = 0;
        while (bigInteger.signum() != 0) {
            a4[i4] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i4++;
        }
        return a4;
    }

    public static boolean e(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i4 = 1; i4 < 5; i4++) {
            if (jArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(long[] jArr) {
        for (int i4 = 0; i4 < 5; i4++) {
            if (jArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger g(long[] jArr) {
        byte[] bArr = new byte[40];
        for (int i4 = 0; i4 < 5; i4++) {
            long j4 = jArr[i4];
            if (j4 != 0) {
                Z2.d.b(j4, bArr, (4 - i4) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }
}
