package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class b0 {
    private static final long M = 4294967295L;
    private static final int P6 = -1;
    private static final int PExt13 = -1;
    static final int[] P = {1, 0, 0, -1, -1, -1, -1};
    private static final int[] PExt = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.g.add(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && b7.g.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.n.add(14, iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && b7.n.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (b7.n.addTo(iArr4.length, iArr4, iArr3) != 0) {
                b7.n.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (b7.n.inc(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && b7.g.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
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
        long j12 = j9 + (4294967295L & iArr[3]) + 1;
        iArr[3] = (int) j12;
        if ((j12 >> 32) != 0) {
            b7.n.incAt(7, iArr, 4);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = b7.g.fromBigInteger(bigInteger);
        if (fromBigInteger[6] == -1) {
            int[] iArr = P;
            if (b7.g.gte(fromBigInteger, iArr)) {
                b7.g.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            b7.n.shiftDownBit(7, iArr, 0, iArr2);
        } else {
            b7.n.shiftDownBit(7, iArr2, b7.g.add(iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        b7.c.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < 7; i9++) {
            i8 |= iArr[i9];
        }
        return (((i8 >>> 1) | (i8 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = b7.g.createExt();
        b7.g.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.g.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && b7.n.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (b7.n.addTo(iArr4.length, iArr4, iArr3) != 0) {
                b7.n.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            b7.g.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            b7.g.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[28];
        do {
            secureRandom.nextBytes(bArr);
            org.bouncycastle.util.i.littleEndianToInt(bArr, 0, iArr, 0, 7);
        } while (b7.n.lessThan(7, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j8 = iArr[10] & 4294967295L;
        long j9 = iArr[11] & 4294967295L;
        long j10 = iArr[12] & 4294967295L;
        long j11 = iArr[13] & 4294967295L;
        long j12 = ((iArr[7] & 4294967295L) + j9) - 1;
        long j13 = (iArr[8] & 4294967295L) + j10;
        long j14 = (iArr[9] & 4294967295L) + j11;
        long j15 = (iArr[0] & 4294967295L) - j12;
        long j16 = j15 & 4294967295L;
        long j17 = (j15 >> 32) + ((iArr[1] & 4294967295L) - j13);
        int i8 = (int) j17;
        iArr2[1] = i8;
        long j18 = (j17 >> 32) + ((iArr[2] & 4294967295L) - j14);
        int i9 = (int) j18;
        iArr2[2] = i9;
        long j19 = (j18 >> 32) + (((iArr[3] & 4294967295L) + j12) - j8);
        long j20 = j19 & 4294967295L;
        long j21 = (j19 >> 32) + (((iArr[4] & 4294967295L) + j13) - j9);
        iArr2[4] = (int) j21;
        long j22 = (j21 >> 32) + (((iArr[5] & 4294967295L) + j14) - j10);
        iArr2[5] = (int) j22;
        long j23 = (j22 >> 32) + (((iArr[6] & 4294967295L) + j8) - j11);
        iArr2[6] = (int) j23;
        long j24 = (j23 >> 32) + 1;
        long j25 = j20 + j24;
        long j26 = j16 - j24;
        iArr2[0] = (int) j26;
        long j27 = j26 >> 32;
        if (j27 != 0) {
            long j28 = j27 + (i8 & 4294967295L);
            iArr2[1] = (int) j28;
            long j29 = (j28 >> 32) + (4294967295L & i9);
            iArr2[2] = (int) j29;
            j25 += j29 >> 32;
        }
        iArr2[3] = (int) j25;
        if (((j25 >> 32) == 0 || b7.n.incAt(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && b7.g.gte(iArr2, P))) {
            return;
        }
        addPInvTo(iArr2);
    }

    public static void reduce32(int i8, int[] iArr) {
        long j8;
        if (i8 != 0) {
            long j9 = i8 & 4294967295L;
            long j10 = (iArr[0] & 4294967295L) - j9;
            iArr[0] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                long j12 = j11 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j12;
                long j13 = (j12 >> 32) + (iArr[2] & 4294967295L);
                iArr[2] = (int) j13;
                j11 = j13 >> 32;
            }
            long j14 = j11 + (4294967295L & iArr[3]) + j9;
            iArr[3] = (int) j14;
            j8 = j14 >> 32;
        } else {
            j8 = 0;
        }
        if ((j8 == 0 || b7.n.incAt(7, iArr, 4) == 0) && !(iArr[6] == -1 && b7.g.gte(iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = b7.g.createExt();
        b7.g.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i8, int[] iArr2) {
        int[] createExt = b7.g.createExt();
        b7.g.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i8--;
            if (i8 <= 0) {
                return;
            } else {
                b7.g.square(iArr2, createExt);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
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
        long j12 = j9 + ((4294967295L & iArr[3]) - 1);
        iArr[3] = (int) j12;
        if ((j12 >> 32) != 0) {
            b7.n.decAt(7, iArr, 4);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.g.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.n.sub(14, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (b7.n.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                b7.n.decAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (b7.n.shiftUpBit(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && b7.g.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}
