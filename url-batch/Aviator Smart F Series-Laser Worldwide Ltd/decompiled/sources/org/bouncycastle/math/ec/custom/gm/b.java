package org.bouncycastle.math.ec.custom.gm;

import b7.h;
import b7.n;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.i;

/* loaded from: classes5.dex */
public class b {
    private static final long M = 4294967295L;
    private static final int P7s1 = Integer.MAX_VALUE;
    private static final int PExt15s1 = Integer.MAX_VALUE;
    static final int[] P = {-1, -1, 0, -1, -1, -1, -1, -2};
    private static final int[] PExt = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h.add(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && h.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (n.add(16, iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && n.gte(16, iArr3, PExt))) {
            n.subFrom(16, PExt, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (n.inc(8, iArr, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && h.gte(iArr2, P))) {
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
        long j11 = j9 + ((iArr[2] & 4294967295L) - 1);
        iArr[2] = (int) j11;
        long j12 = (j11 >> 32) + (iArr[3] & 4294967295L) + 1;
        iArr[3] = (int) j12;
        long j13 = j12 >> 32;
        if (j13 != 0) {
            long j14 = j13 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j14;
            long j15 = (j14 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j15;
            long j16 = (j15 >> 32) + (iArr[6] & 4294967295L);
            iArr[6] = (int) j16;
            j13 = j16 >> 32;
        }
        iArr[7] = (int) (j13 + (4294967295L & iArr[7]) + 1);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = h.fromBigInteger(bigInteger);
        if ((fromBigInteger[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = P;
            if (h.gte(fromBigInteger, iArr)) {
                h.subFrom(iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            n.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            n.shiftDownBit(8, iArr2, h.add(iArr, P, iArr2));
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
        int[] createExt = h.createExt();
        h.mul(iArr, iArr2, createExt);
        reduce(createExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h.mulAddTo(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && n.gte(16, iArr3, PExt))) {
            n.subFrom(16, PExt, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            h.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            h.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            i.littleEndianToInt(bArr, 0, iArr, 0, 8);
        } while (n.lessThan(8, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j8 = iArr[8] & 4294967295L;
        long j9 = iArr[9] & 4294967295L;
        long j10 = iArr[10] & 4294967295L;
        long j11 = iArr[11] & 4294967295L;
        long j12 = iArr[12] & 4294967295L;
        long j13 = iArr[13] & 4294967295L;
        long j14 = iArr[14] & 4294967295L;
        long j15 = iArr[15] & 4294967295L;
        long j16 = j10 + j11;
        long j17 = j13 + j14;
        long j18 = j17 + (j15 << 1);
        long j19 = j8 + j9 + j17;
        long j20 = j16 + j12 + j15 + j19;
        long j21 = (iArr[0] & 4294967295L) + j20 + j13 + j14 + j15;
        iArr2[0] = (int) j21;
        long j22 = (j21 >> 32) + (((iArr[1] & 4294967295L) + j20) - j8) + j14 + j15;
        iArr2[1] = (int) j22;
        long j23 = (j22 >> 32) + ((iArr[2] & 4294967295L) - j19);
        iArr2[2] = (int) j23;
        long j24 = (j23 >> 32) + ((((iArr[3] & 4294967295L) + j20) - j9) - j10) + j13;
        iArr2[3] = (int) j24;
        long j25 = (j24 >> 32) + ((((iArr[4] & 4294967295L) + j20) - j16) - j8) + j14;
        iArr2[4] = (int) j25;
        long j26 = (j25 >> 32) + (iArr[5] & 4294967295L) + j18 + j10;
        iArr2[5] = (int) j26;
        long j27 = (j26 >> 32) + (iArr[6] & 4294967295L) + j11 + j14 + j15;
        iArr2[6] = (int) j27;
        long j28 = (j27 >> 32) + (4294967295L & iArr[7]) + j20 + j18 + j12;
        iArr2[7] = (int) j28;
        reduce32((int) (j28 >> 32), iArr2);
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
            long j13 = j11 + ((iArr[2] & 4294967295L) - j9);
            iArr[2] = (int) j13;
            long j14 = (j13 >> 32) + (iArr[3] & 4294967295L) + j9;
            iArr[3] = (int) j14;
            long j15 = j14 >> 32;
            if (j15 != 0) {
                long j16 = j15 + (iArr[4] & 4294967295L);
                iArr[4] = (int) j16;
                long j17 = (j16 >> 32) + (iArr[5] & 4294967295L);
                iArr[5] = (int) j17;
                long j18 = (j17 >> 32) + (iArr[6] & 4294967295L);
                iArr[6] = (int) j18;
                j15 = j18 >> 32;
            }
            long j19 = j15 + (4294967295L & iArr[7]) + j9;
            iArr[7] = (int) j19;
            j8 = j19 >> 32;
        } else {
            j8 = 0;
        }
        if (j8 != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && h.gte(iArr, P))) {
            addPInvTo(iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] createExt = h.createExt();
        h.square(iArr, createExt);
        reduce(createExt, iArr2);
    }

    public static void squareN(int[] iArr, int i8, int[] iArr2) {
        int[] createExt = h.createExt();
        h.square(iArr, createExt);
        while (true) {
            reduce(createExt, iArr2);
            i8--;
            if (i8 <= 0) {
                return;
            } else {
                h.square(iArr2, createExt);
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
        long j11 = j9 + (iArr[2] & 4294967295L) + 1;
        iArr[2] = (int) j11;
        long j12 = (j11 >> 32) + ((iArr[3] & 4294967295L) - 1);
        iArr[3] = (int) j12;
        long j13 = j12 >> 32;
        if (j13 != 0) {
            long j14 = j13 + (iArr[4] & 4294967295L);
            iArr[4] = (int) j14;
            long j15 = (j14 >> 32) + (iArr[5] & 4294967295L);
            iArr[5] = (int) j15;
            long j16 = (j15 >> 32) + (iArr[6] & 4294967295L);
            iArr[6] = (int) j16;
            j13 = j16 >> 32;
        }
        iArr[7] = (int) (j13 + ((4294967295L & iArr[7]) - 1));
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (n.sub(16, iArr, iArr2, iArr3) != 0) {
            n.addTo(16, PExt, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (n.shiftUpBit(8, iArr, 0, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && h.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}
