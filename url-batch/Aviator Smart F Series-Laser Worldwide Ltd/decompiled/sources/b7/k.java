package b7;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class k {
    public static void copy64(long[] jArr, int i8, long[] jArr2, int i9) {
        jArr2[i9] = jArr[i8];
        jArr2[i9 + 1] = jArr[i8 + 1];
        jArr2[i9 + 2] = jArr[i8 + 2];
        jArr2[i9 + 3] = jArr[i8 + 3];
        jArr2[i9 + 4] = jArr[i8 + 4];
        jArr2[i9 + 5] = jArr[i8 + 5];
        jArr2[i9 + 6] = jArr[i8 + 6];
    }

    public static long[] create64() {
        return new long[7];
    }

    public static long[] createExt64() {
        return new long[14];
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i8 = 6; i8 >= 0; i8--) {
            if (jArr[i8] != jArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 448) {
            throw new IllegalArgumentException();
        }
        long[] create64 = create64();
        for (int i8 = 0; i8 < 7; i8++) {
            create64[i8] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return create64;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i8 = 1; i8 < 7; i8++) {
            if (jArr[i8] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i8 = 0; i8 < 7; i8++) {
            if (jArr[i8] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        g.mul(iArr, iArr2, iArr3);
        g.mul(iArr, 7, iArr2, 7, iArr3, 14);
        int addToEachOther = g.addToEachOther(iArr3, 7, iArr3, 14);
        int addTo = addToEachOther + g.addTo(iArr3, 21, iArr3, 14, g.addTo(iArr3, 0, iArr3, 7, 0) + addToEachOther);
        int[] create = g.create();
        int[] create2 = g.create();
        boolean z7 = g.diff(iArr, 7, iArr, 0, create, 0) != g.diff(iArr2, 7, iArr2, 0, create2, 0);
        int[] createExt = g.createExt();
        g.mul(create, create2, createExt);
        n.addWordAt(28, addTo + (z7 ? n.addTo(14, createExt, 0, iArr3, 7) : n.subFrom(14, createExt, 0, iArr3, 7)), iArr3, 21);
    }

    public static void square(int[] iArr, int[] iArr2) {
        g.square(iArr, iArr2);
        g.square(iArr, 7, iArr2, 14);
        int addToEachOther = g.addToEachOther(iArr2, 7, iArr2, 14);
        int addTo = addToEachOther + g.addTo(iArr2, 21, iArr2, 14, g.addTo(iArr2, 0, iArr2, 7, 0) + addToEachOther);
        int[] create = g.create();
        g.diff(iArr, 7, iArr, 0, create, 0);
        int[] createExt = g.createExt();
        g.square(create, createExt);
        n.addWordAt(28, addTo + n.subFrom(14, createExt, 0, iArr2, 7), iArr2, 21);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[56];
        for (int i8 = 0; i8 < 7; i8++) {
            long j8 = jArr[i8];
            if (j8 != 0) {
                org.bouncycastle.util.i.longToBigEndian(j8, bArr, (6 - i8) << 3);
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
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }
}
