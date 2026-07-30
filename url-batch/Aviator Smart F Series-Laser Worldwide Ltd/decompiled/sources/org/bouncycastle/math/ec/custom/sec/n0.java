package org.bouncycastle.math.ec.custom.sec;

import com.google.android.exoplayer2.RendererCapabilities;
import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class n0 {
    private static final long M = 4294967295L;
    private static final int P11 = -1;
    private static final int PExt23 = -1;
    static final int[] P = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExt = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExtInv = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.n.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && b7.n.gte(12, iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.n.add(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && b7.n.gte(24, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (b7.n.addTo(iArr4.length, iArr4, iArr3) != 0) {
                b7.n.incAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (b7.n.inc(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && b7.n.gte(12, iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j8 = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j8;
        long j9 = (j8 >> 32) + ((iArr[1] & 4294967295L) - 1);
        iArr[1] = (int) j9;
        long j10 = j9 >> 32;
        if (j10 != 0) {
            long j11 = j10 + (iArr[2] & 4294967295L);
            iArr[2] = (int) j11;
            j10 = j11 >> 32;
        }
        long j12 = j10 + (iArr[3] & 4294967295L) + 1;
        iArr[3] = (int) j12;
        long j13 = (j12 >> 32) + (4294967295L & iArr[4]) + 1;
        iArr[4] = (int) j13;
        if ((j13 >> 32) != 0) {
            b7.n.incAt(12, iArr, 5);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = b7.n.fromBigInteger(RendererCapabilities.MODE_SUPPORT_MASK, bigInteger);
        if (fromBigInteger[11] == -1) {
            int[] iArr = P;
            if (b7.n.gte(12, fromBigInteger, iArr)) {
                b7.n.subFrom(12, iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            b7.n.shiftDownBit(12, iArr, 0, iArr2);
        } else {
            b7.n.shiftDownBit(12, iArr2, b7.n.add(12, iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        b7.c.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < 12; i9++) {
            i8 |= iArr[i9];
        }
        return (((i8 >>> 1) | (i8 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = b7.n.create(24);
        b7.j.mul(iArr, iArr2, create);
        reduce(create, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            b7.n.sub(12, P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            b7.n.sub(12, iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[48];
        do {
            secureRandom.nextBytes(bArr);
            org.bouncycastle.util.i.littleEndianToInt(bArr, 0, iArr, 0, 12);
        } while (b7.n.lessThan(12, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j8 = iArr[16] & 4294967295L;
        long j9 = iArr[17] & 4294967295L;
        long j10 = iArr[18] & 4294967295L;
        long j11 = iArr[19] & 4294967295L;
        long j12 = iArr[20] & 4294967295L;
        long j13 = iArr[21] & 4294967295L;
        long j14 = iArr[22] & 4294967295L;
        long j15 = iArr[23] & 4294967295L;
        long j16 = ((iArr[12] & 4294967295L) + j12) - 1;
        long j17 = (iArr[13] & 4294967295L) + j14;
        long j18 = (iArr[14] & 4294967295L) + j14 + j15;
        long j19 = (iArr[15] & 4294967295L) + j15;
        long j20 = j9 + j13;
        long j21 = j13 - j15;
        long j22 = j14 - j15;
        long j23 = j16 + j21;
        long j24 = (iArr[0] & 4294967295L) + j23;
        iArr2[0] = (int) j24;
        long j25 = (j24 >> 32) + (((iArr[1] & 4294967295L) + j15) - j16) + j17;
        iArr2[1] = (int) j25;
        long j26 = (j25 >> 32) + (((iArr[2] & 4294967295L) - j13) - j17) + j18;
        iArr2[2] = (int) j26;
        long j27 = (j26 >> 32) + ((iArr[3] & 4294967295L) - j18) + j19 + j23;
        iArr2[3] = (int) j27;
        long j28 = (j27 >> 32) + (((((iArr[4] & 4294967295L) + j8) + j13) + j17) - j19) + j23;
        iArr2[4] = (int) j28;
        long j29 = (j28 >> 32) + ((iArr[5] & 4294967295L) - j8) + j17 + j18 + j20;
        iArr2[5] = (int) j29;
        long j30 = (j29 >> 32) + (((iArr[6] & 4294967295L) + j10) - j9) + j18 + j19;
        iArr2[6] = (int) j30;
        long j31 = (j30 >> 32) + ((((iArr[7] & 4294967295L) + j8) + j11) - j10) + j19;
        iArr2[7] = (int) j31;
        long j32 = (j31 >> 32) + (((((iArr[8] & 4294967295L) + j8) + j9) + j12) - j11);
        iArr2[8] = (int) j32;
        long j33 = (j32 >> 32) + (((iArr[9] & 4294967295L) + j10) - j12) + j20;
        iArr2[9] = (int) j33;
        long j34 = (j33 >> 32) + ((((iArr[10] & 4294967295L) + j10) + j11) - j21) + j22;
        iArr2[10] = (int) j34;
        long j35 = (j34 >> 32) + ((((iArr[11] & 4294967295L) + j11) + j12) - j22);
        iArr2[11] = (int) j35;
        reduce32((int) ((j35 >> 32) + 1), iArr2);
    }

    public static void reduce32(int i8, int[] iArr) {
        long j8;
        if (i8 != 0) {
            long j9 = i8 & 4294967295L;
            long j10 = (iArr[0] & 4294967295L) + j9;
            iArr[0] = (int) j10;
            long j11 = (j10 >> 32) + ((iArr[1] & 4294967295L) - j9);
            iArr[1] = (int) j11;
            long j12 = j11 >> 32;
            if (j12 != 0) {
                long j13 = j12 + (iArr[2] & 4294967295L);
                iArr[2] = (int) j13;
                j12 = j13 >> 32;
            }
            long j14 = j12 + (iArr[3] & 4294967295L) + j9;
            iArr[3] = (int) j14;
            long j15 = (j14 >> 32) + (4294967295L & iArr[4]) + j9;
            iArr[4] = (int) j15;
            j8 = j15 >> 32;
        } else {
            j8 = 0;
        }
        if ((j8 == 0 || b7.n.incAt(12, iArr, 5) == 0) && !(iArr[11] == -1 && b7.n.gte(12, iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] create = b7.n.create(24);
        b7.j.square(iArr, create);
        reduce(create, iArr2);
    }

    public static void squareN(int[] iArr, int i8, int[] iArr2) {
        int[] create = b7.n.create(24);
        b7.j.square(iArr, create);
        while (true) {
            reduce(create, iArr2);
            i8--;
            if (i8 <= 0) {
                return;
            } else {
                b7.j.square(iArr2, create);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j8 = (iArr[0] & 4294967295L) - 1;
        iArr[0] = (int) j8;
        long j9 = (j8 >> 32) + (iArr[1] & 4294967295L) + 1;
        iArr[1] = (int) j9;
        long j10 = j9 >> 32;
        if (j10 != 0) {
            long j11 = j10 + (iArr[2] & 4294967295L);
            iArr[2] = (int) j11;
            j10 = j11 >> 32;
        }
        long j12 = j10 + ((iArr[3] & 4294967295L) - 1);
        iArr[3] = (int) j12;
        long j13 = (j12 >> 32) + ((4294967295L & iArr[4]) - 1);
        iArr[4] = (int) j13;
        if ((j13 >> 32) != 0) {
            b7.n.decAt(12, iArr, 5);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.n.sub(12, iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.n.sub(24, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (b7.n.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                b7.n.decAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (b7.n.shiftUpBit(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && b7.n.gte(12, iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}
