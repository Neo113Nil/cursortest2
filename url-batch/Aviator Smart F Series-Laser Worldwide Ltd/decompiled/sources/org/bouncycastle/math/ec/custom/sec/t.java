package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class t {
    private static final long M = 4294967295L;
    private static final int P5 = -1;
    private static final int PExt11 = -1;
    static final int[] P = {-1, -1, -2, -1, -1, -1};
    private static final int[] PExt = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.f.add(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && b7.f.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.n.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && b7.n.gte(12, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (b7.n.addTo(iArr4.length, iArr4, iArr3) != 0) {
                b7.n.incAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (b7.n.inc(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && b7.f.gte(iArr2, P))) {
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
            j9 = j10 >> 32;
        }
        long j11 = j9 + (4294967295L & iArr[2]) + 1;
        iArr[2] = (int) j11;
        if ((j11 >> 32) != 0) {
            b7.n.incAt(6, iArr, 3);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = b7.f.fromBigInteger(bigInteger);
        if (fromBigInteger[5] == -1) {
            int[] iArr = P;
            if (b7.f.gte(fromBigInteger, iArr)) {
                b7.f.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            b7.n.shiftDownBit(6, iArr, 0, iArr2);
        } else {
            b7.n.shiftDownBit(6, iArr2, b7.f.add(iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        b7.c.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < 6; i9++) {
            i8 |= iArr[i9];
        }
        return (((i8 >>> 1) | (i8 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] createExt = b7.f.createExt();
        b7.f.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.f.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && b7.n.gte(12, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (b7.n.addTo(iArr4.length, iArr4, iArr3) != 0) {
                b7.n.incAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            b7.f.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            b7.f.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[24];
        do {
            secureRandom.nextBytes(bArr);
            org.bouncycastle.util.i.littleEndianToInt(bArr, 0, iArr, 0, 6);
        } while (b7.n.lessThan(6, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j8 = iArr[6] & 4294967295L;
        long j9 = iArr[7] & 4294967295L;
        long j10 = (iArr[10] & 4294967295L) + j8;
        long j11 = (iArr[11] & 4294967295L) + j9;
        long j12 = (iArr[0] & 4294967295L) + j10;
        int i8 = (int) j12;
        long j13 = (j12 >> 32) + (iArr[1] & 4294967295L) + j11;
        int i9 = (int) j13;
        iArr2[1] = i9;
        long j14 = j10 + (iArr[8] & 4294967295L);
        long j15 = j11 + (iArr[9] & 4294967295L);
        long j16 = (j13 >> 32) + (iArr[2] & 4294967295L) + j14;
        long j17 = j16 & 4294967295L;
        long j18 = (j16 >> 32) + (iArr[3] & 4294967295L) + j15;
        iArr2[3] = (int) j18;
        long j19 = (j18 >> 32) + (iArr[4] & 4294967295L) + (j14 - j8);
        iArr2[4] = (int) j19;
        long j20 = (j19 >> 32) + (iArr[5] & 4294967295L) + (j15 - j9);
        iArr2[5] = (int) j20;
        long j21 = j20 >> 32;
        long j22 = j17 + j21;
        long j23 = j21 + (i8 & 4294967295L);
        iArr2[0] = (int) j23;
        long j24 = j23 >> 32;
        if (j24 != 0) {
            long j25 = j24 + (4294967295L & i9);
            iArr2[1] = (int) j25;
            j22 += j25 >> 32;
        }
        iArr2[2] = (int) j22;
        if (((j22 >> 32) == 0 || b7.n.incAt(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && b7.f.gte(iArr2, P))) {
            return;
        }
        addPInvTo(iArr2);
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
                j11 = j12 >> 32;
            }
            long j13 = j11 + (4294967295L & iArr[2]) + j9;
            iArr[2] = (int) j13;
            j8 = j13 >> 32;
        } else {
            j8 = 0;
        }
        if ((j8 == 0 || b7.n.incAt(6, iArr, 3) == 0) && !(iArr[5] == -1 && b7.f.gte(iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = b7.f.createExt();
        b7.f.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i8, int[] iArr2) {
        int[] createExt = b7.f.createExt();
        b7.f.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i8--;
            if (i8 <= 0) {
                return;
            } else {
                b7.f.square(iArr2, createExt);
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
            j9 = j10 >> 32;
        }
        long j11 = j9 + ((4294967295L & iArr[2]) - 1);
        iArr[2] = (int) j11;
        if ((j11 >> 32) != 0) {
            b7.n.decAt(6, iArr, 3);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.f.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.n.sub(12, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (b7.n.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                b7.n.decAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (b7.n.shiftUpBit(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && b7.f.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}
