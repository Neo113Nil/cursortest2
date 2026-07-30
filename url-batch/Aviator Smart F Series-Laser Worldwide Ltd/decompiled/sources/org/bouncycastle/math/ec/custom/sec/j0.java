package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class j0 {
    private static final long M = 4294967295L;
    private static final int P7 = -1;
    private static final int PExt15s1 = Integer.MAX_VALUE;
    static final int[] P = {-1, -1, -1, 0, 0, 0, 1, -1};
    private static final int[] PExt = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.h.add(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && b7.h.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.n.add(16, iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && b7.n.gte(16, iArr3, PExt))) {
            b7.n.subFrom(16, PExt, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (b7.n.inc(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && b7.h.gte(iArr2, P))) {
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
        long j12 = j9 + ((iArr[3] & 4294967295L) - 1);
        iArr[3] = (int) j12;
        long j13 = j12 >> 32;
        if (j13 != 0) {
            long j14 = j13 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j14;
            long j15 = (j14 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j15;
            j13 = j15 >> 32;
        }
        long j16 = j13 + ((iArr[6] & 4294967295L) - 1);
        iArr[6] = (int) j16;
        iArr[7] = (int) ((j16 >> 32) + (4294967295L & iArr[7]) + 1);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = b7.h.fromBigInteger(bigInteger);
        if (fromBigInteger[7] == -1) {
            int[] iArr = P;
            if (b7.h.gte(fromBigInteger, iArr)) {
                b7.h.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            b7.n.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            b7.n.shiftDownBit(8, iArr2, b7.h.add(iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        b7.c.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < 8; i9++) {
            i8 |= iArr[i9];
        }
        return (((i8 >>> 1) | (i8 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = b7.h.createExt();
        b7.h.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.h.mulAddTo(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && b7.n.gte(16, iArr3, PExt))) {
            b7.n.subFrom(16, PExt, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            b7.h.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            b7.h.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            org.bouncycastle.util.i.littleEndianToInt(bArr, 0, iArr, 0, 8);
        } while (b7.n.lessThan(8, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j8 = iArr[9] & 4294967295L;
        long j9 = iArr[10] & 4294967295L;
        long j10 = iArr[11] & 4294967295L;
        long j11 = iArr[12] & 4294967295L;
        long j12 = iArr[13] & 4294967295L;
        long j13 = iArr[14] & 4294967295L;
        long j14 = iArr[15] & 4294967295L;
        long j15 = (iArr[8] & 4294967295L) - 6;
        long j16 = j15 + j8;
        long j17 = j8 + j9;
        long j18 = (j9 + j10) - j14;
        long j19 = j10 + j11;
        long j20 = j11 + j12;
        long j21 = j12 + j13;
        long j22 = j13 + j14;
        long j23 = j21 - j16;
        long j24 = ((iArr[0] & 4294967295L) - j19) - j23;
        iArr2[0] = (int) j24;
        long j25 = (j24 >> 32) + ((((iArr[1] & 4294967295L) + j17) - j20) - j22);
        iArr2[1] = (int) j25;
        long j26 = (j25 >> 32) + (((iArr[2] & 4294967295L) + j18) - j21);
        iArr2[2] = (int) j26;
        long j27 = (j26 >> 32) + ((((iArr[3] & 4294967295L) + (j19 << 1)) + j23) - j22);
        iArr2[3] = (int) j27;
        long j28 = (j27 >> 32) + ((((iArr[4] & 4294967295L) + (j20 << 1)) + j13) - j17);
        iArr2[4] = (int) j28;
        long j29 = (j28 >> 32) + (((iArr[5] & 4294967295L) + (j21 << 1)) - j18);
        iArr2[5] = (int) j29;
        long j30 = (j29 >> 32) + (iArr[6] & 4294967295L) + (j22 << 1) + j23;
        iArr2[6] = (int) j30;
        long j31 = (j30 >> 32) + (((((iArr[7] & 4294967295L) + (j14 << 1)) + j15) - j18) - j20);
        iArr2[7] = (int) j31;
        reduce32((int) ((j31 >> 32) + 6), iArr2);
    }

    public static void reduce32(int i8, int[] iArr) {
        long j8;
        if (i8 != 0) {
            long j9 = i8 & 4294967295L;
            long j10 = (iArr[0] & 4294967295L) + j9;
            iArr[0] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                long j12 = j11 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j12;
                long j13 = (j12 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j13;
                j11 = j13 >> 32;
            }
            long j14 = j11 + ((iArr[3] & 4294967295L) - j9);
            iArr[3] = (int) j14;
            long j15 = j14 >> 32;
            if (j15 != 0) {
                long j16 = j15 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j16;
                long j17 = (j16 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j17;
                j15 = j17 >> 32;
            }
            long j18 = j15 + ((iArr[6] & 4294967295L) - j9);
            iArr[6] = (int) j18;
            long j19 = (j18 >> 32) + (4294967295L & iArr[7]) + j9;
            iArr[7] = (int) j19;
            j8 = j19 >> 32;
        } else {
            j8 = 0;
        }
        if (j8 != 0 || (iArr[7] == -1 && b7.h.gte(iArr, P))) {
            addPInvTo(iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = b7.h.createExt();
        b7.h.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i8, int[] iArr2) {
        int[] createExt = b7.h.createExt();
        b7.h.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i8--;
            if (i8 <= 0) {
                return;
            } else {
                b7.h.square(iArr2, createExt);
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
        long j12 = j9 + (iArr[3] & 4294967295L) + 1;
        iArr[3] = (int) j12;
        long j13 = j12 >> 32;
        if (j13 != 0) {
            long j14 = j13 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j14;
            long j15 = (j14 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j15;
            j13 = j15 >> 32;
        }
        long j16 = j13 + (iArr[6] & 4294967295L) + 1;
        iArr[6] = (int) j16;
        iArr[7] = (int) ((j16 >> 32) + ((4294967295L & iArr[7]) - 1));
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.h.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.n.sub(16, iArr, iArr2, iArr3) != 0) {
            b7.n.addTo(16, PExt, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (b7.n.shiftUpBit(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && b7.h.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}
