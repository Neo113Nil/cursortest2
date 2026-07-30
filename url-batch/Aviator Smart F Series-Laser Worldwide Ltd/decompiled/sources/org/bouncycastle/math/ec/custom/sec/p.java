package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class p {
    private static final int P5 = -1;
    private static final int PExt11 = -1;
    private static final int PInv33 = 4553;
    static final int[] P = {-4553, -2, -1, -1, -1, -1};
    private static final int[] PExt = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};
    private static final int[] PExtInv = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.f.add(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && b7.f.gte(iArr3, P))) {
            b7.n.add33To(6, PInv33, iArr3);
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
            b7.n.add33To(6, PInv33, iArr2);
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
        if (b7.f.mul33DWordAdd(PInv33, b7.f.mul33Add(PInv33, iArr, 6, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[5] == -1 && b7.f.gte(iArr2, P))) {
            b7.n.add33To(6, PInv33, iArr2);
        }
    }

    public static void reduce32(int i8, int[] iArr) {
        if ((i8 == 0 || b7.f.mul33WordAdd(PInv33, i8, iArr, 0) == 0) && !(iArr[5] == -1 && b7.f.gte(iArr, P))) {
            return;
        }
        b7.n.add33To(6, PInv33, iArr);
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

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (b7.f.sub(iArr, iArr2, iArr3) != 0) {
            b7.n.sub33From(6, PInv33, iArr3);
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
            b7.n.add33To(6, PInv33, iArr2);
        }
    }
}
