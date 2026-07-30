package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class b {
    private static final long M = 4294967295L;
    private static final int P3s1 = 2147483646;
    private static final int PExt7s1 = 2147483646;
    static final int[] P = {-1, -1, -1, -3};
    private static final int[] PExt = {1, 0, 0, 4, -2, -1, 3, -4};
    private static final int[] PExtInv = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.d.add(iArr, iArr2, iArr3) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && b7.d.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.h.add(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && b7.h.gte(iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            b7.n.addTo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (b7.n.inc(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && b7.d.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j8 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j8;
        long j9 = j8 >> 32;
        if (j9 != 0) {
            long j10 = j9 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j10;
            long j11 = (j10 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j11;
            j9 = j11 >> 32;
        }
        iArr[3] = (int) (j9 + (4294967295L & iArr[3]) + 2);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = b7.d.fromBigInteger(bigInteger);
        if ((fromBigInteger[3] >>> 1) >= 2147483646) {
            int[] iArr = P;
            if (b7.d.gte(fromBigInteger, iArr)) {
                b7.d.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            b7.n.shiftDownBit(4, iArr, 0, iArr2);
        } else {
            b7.n.shiftDownBit(4, iArr2, b7.d.add(iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        b7.c.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            i8 |= iArr[i9];
        }
        return (((i8 >>> 1) | (i8 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = b7.d.createExt();
        b7.d.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.d.mulAddTo(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && b7.h.gte(iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            b7.n.addTo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            b7.d.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            b7.d.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[16];
        do {
            secureRandom.nextBytes(bArr);
            org.bouncycastle.util.i.littleEndianToInt(bArr, 0, iArr, 0, 4);
        } while (b7.n.lessThan(4, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j8 = iArr[7] & 4294967295L;
        long j9 = (iArr[3] & 4294967295L) + j8;
        long j10 = (iArr[6] & 4294967295L) + (j8 << 1);
        long j11 = (iArr[2] & 4294967295L) + j10;
        long j12 = (iArr[5] & 4294967295L) + (j10 << 1);
        long j13 = (iArr[1] & 4294967295L) + j12;
        long j14 = (iArr[4] & 4294967295L) + (j12 << 1);
        long j15 = (iArr[0] & 4294967295L) + j14;
        iArr2[0] = (int) j15;
        long j16 = j13 + (j15 >>> 32);
        iArr2[1] = (int) j16;
        long j17 = j11 + (j16 >>> 32);
        iArr2[2] = (int) j17;
        long j18 = j9 + (j14 << 1) + (j17 >>> 32);
        iArr2[3] = (int) j18;
        reduce32((int) (j18 >>> 32), iArr2);
    }

    public static void reduce32(int i8, int[] iArr) {
        while (i8 != 0) {
            long j8 = i8 & 4294967295L;
            long j9 = (iArr[0] & 4294967295L) + j8;
            iArr[0] = (int) j9;
            long j10 = j9 >> 32;
            if (j10 != 0) {
                long j11 = j10 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j11;
                long j12 = (j11 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j12;
                j10 = j12 >> 32;
            }
            long j13 = j10 + (4294967295L & iArr[3]) + (j8 << 1);
            iArr[3] = (int) j13;
            i8 = (int) (j13 >> 32);
        }
        if ((iArr[3] >>> 1) < 2147483646 || !b7.d.gte(iArr, P)) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = b7.d.createExt();
        b7.d.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i8, int[] iArr2) {
        int[] createExt = b7.d.createExt();
        b7.d.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i8--;
            if (i8 <= 0) {
                return;
            } else {
                b7.d.square(iArr2, createExt);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j8 = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j8;
        long j9 = j8 >> 32;
        if (j9 != 0) {
            long j10 = j9 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j10;
            long j11 = (j10 >> 32) + (iArr[2] & 4294967295L);
            iArr[2] = (int) j11;
            j9 = j11 >> 32;
        }
        iArr[3] = (int) (j9 + ((4294967295L & iArr[3]) - 2));
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.d.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.n.sub(10, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            b7.n.subFrom(iArr4.length, iArr4, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (b7.n.shiftUpBit(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && b7.d.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}
