package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class h {
    private static final long M = 4294967295L;
    private static final int P4 = -1;
    private static final int PExt9 = -1;
    private static final int PInv = -2147483647;
    static final int[] P = {Integer.MAX_VALUE, -1, -1, -1, -1};
    private static final int[] PExt = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.e.add(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && b7.e.gte(iArr3, P))) {
            b7.n.addWordTo(5, -2147483647, iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.n.add(10, iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && b7.n.gte(10, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (b7.n.addTo(iArr4.length, iArr4, iArr3) != 0) {
                b7.n.incAt(10, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (b7.n.inc(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && b7.e.gte(iArr2, P))) {
            b7.n.addWordTo(5, -2147483647, iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = b7.e.fromBigInteger(bigInteger);
        if (fromBigInteger[4] == -1) {
            int[] iArr = P;
            if (b7.e.gte(fromBigInteger, iArr)) {
                b7.e.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            b7.n.shiftDownBit(5, iArr, 0, iArr2);
        } else {
            b7.n.shiftDownBit(5, iArr2, b7.e.add(iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        b7.c.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < 5; i9++) {
            i8 |= iArr[i9];
        }
        return (((i8 >>> 1) | (i8 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = b7.e.createExt();
        b7.e.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.e.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && b7.n.gte(10, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (b7.n.addTo(iArr4.length, iArr4, iArr3) != 0) {
                b7.n.incAt(10, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            b7.e.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            b7.e.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[20];
        do {
            secureRandom.nextBytes(bArr);
            org.bouncycastle.util.i.littleEndianToInt(bArr, 0, iArr, 0, 5);
        } while (b7.n.lessThan(5, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j8 = iArr[5] & 4294967295L;
        long j9 = iArr[6] & 4294967295L;
        long j10 = iArr[7] & 4294967295L;
        long j11 = iArr[8] & 4294967295L;
        long j12 = iArr[9] & 4294967295L;
        long j13 = (iArr[0] & 4294967295L) + j8 + (j8 << 31);
        iArr2[0] = (int) j13;
        long j14 = (j13 >>> 32) + (iArr[1] & 4294967295L) + j9 + (j9 << 31);
        iArr2[1] = (int) j14;
        long j15 = (j14 >>> 32) + (iArr[2] & 4294967295L) + j10 + (j10 << 31);
        iArr2[2] = (int) j15;
        long j16 = (j15 >>> 32) + (iArr[3] & 4294967295L) + j11 + (j11 << 31);
        iArr2[3] = (int) j16;
        long j17 = (j16 >>> 32) + (4294967295L & iArr[4]) + j12 + (j12 << 31);
        iArr2[4] = (int) j17;
        reduce32((int) (j17 >>> 32), iArr2);
    }

    public static void reduce32(int i8, int[] iArr) {
        if ((i8 == 0 || b7.e.mulWordsAdd(-2147483647, i8, iArr, 0) == 0) && !(iArr[4] == -1 && b7.e.gte(iArr, P))) {
            return;
        }
        b7.n.addWordTo(5, -2147483647, iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = b7.e.createExt();
        b7.e.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i8, int[] iArr2) {
        int[] createExt = b7.e.createExt();
        b7.e.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i8--;
            if (i8 <= 0) {
                return;
            } else {
                b7.e.square(iArr2, createExt);
            }
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.e.sub(iArr, iArr2, iArr3) != 0) {
            b7.n.subWordFrom(5, -2147483647, iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.n.sub(10, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (b7.n.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                b7.n.decAt(10, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (b7.n.shiftUpBit(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && b7.e.gte(iArr2, P))) {
            b7.n.addWordTo(5, -2147483647, iArr2);
        }
    }
}
