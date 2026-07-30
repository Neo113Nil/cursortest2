package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class r0 {
    static final int[] P = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};
    private static final int P16 = 511;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        int add = b7.n.add(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (add > 511 || (add == 511 && b7.n.eq(16, iArr3, P))) {
            add = (add + b7.n.inc(16, iArr3)) & 511;
        }
        iArr3[16] = add;
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        int inc = b7.n.inc(16, iArr, iArr2) + iArr[16];
        if (inc > 511 || (inc == 511 && b7.n.eq(16, iArr2, P))) {
            inc = (inc + b7.n.inc(16, iArr2)) & 511;
        }
        iArr2[16] = inc;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = b7.n.fromBigInteger(521, bigInteger);
        if (b7.n.eq(17, fromBigInteger, P)) {
            b7.n.zero(17, fromBigInteger);
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        int i8 = iArr[16];
        iArr2[16] = (b7.n.shiftDownBit(16, iArr, i8, iArr2) >>> 23) | (i8 >>> 1);
    }

    protected static void implMultiply(int[] iArr, int[] iArr2, int[] iArr3) {
        b7.l.mul(iArr, iArr2, iArr3);
        int i8 = iArr[16];
        int i9 = iArr2[16];
        iArr3[32] = b7.n.mul31BothAdd(16, i8, iArr2, i9, iArr, iArr3, 16) + (i8 * i9);
    }

    protected static void implSquare(int[] iArr, int[] iArr2) {
        b7.l.square(iArr, iArr2);
        int i8 = iArr[16];
        iArr2[32] = b7.n.mulWordAddTo(16, i8 << 1, iArr, 0, iArr2, 16) + (i8 * i8);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        b7.c.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < 17; i9++) {
            i8 |= iArr[i9];
        }
        return (((i8 >>> 1) | (i8 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = b7.n.create(33);
        implMultiply(iArr, iArr2, create);
        reduce(create, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            b7.n.sub(17, P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            b7.n.sub(17, iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[68];
        do {
            secureRandom.nextBytes(bArr);
            org.bouncycastle.util.i.littleEndianToInt(bArr, 0, iArr, 0, 17);
            iArr[16] = iArr[16] & 511;
        } while (b7.n.lessThan(17, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int i8 = iArr[32];
        int shiftDownBits = (b7.n.shiftDownBits(16, iArr, 16, 9, i8, iArr2, 0) >>> 23) + (i8 >>> 9) + b7.n.addTo(16, iArr, iArr2);
        if (shiftDownBits > 511 || (shiftDownBits == 511 && b7.n.eq(16, iArr2, P))) {
            shiftDownBits = (shiftDownBits + b7.n.inc(16, iArr2)) & 511;
        }
        iArr2[16] = shiftDownBits;
    }

    public static void reduce23(int[] iArr) {
        int i8 = iArr[16];
        int addWordTo = b7.n.addWordTo(16, i8 >>> 9, iArr) + (i8 & 511);
        if (addWordTo > 511 || (addWordTo == 511 && b7.n.eq(16, iArr, P))) {
            addWordTo = (addWordTo + b7.n.inc(16, iArr)) & 511;
        }
        iArr[16] = addWordTo;
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] create = b7.n.create(33);
        implSquare(iArr, create);
        reduce(create, iArr2);
    }

    public static void squareN(int[] iArr, int i8, int[] iArr2) {
        int[] create = b7.n.create(33);
        implSquare(iArr, create);
        while (true) {
            reduce(create, iArr2);
            i8--;
            if (i8 <= 0) {
                return;
            } else {
                implSquare(iArr2, create);
            }
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        int sub = (b7.n.sub(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (sub < 0) {
            sub = (sub + b7.n.dec(16, iArr3)) & 511;
        }
        iArr3[16] = sub;
    }

    public static void twice(int[] iArr, int[] iArr2) {
        int i8 = iArr[16];
        iArr2[16] = (b7.n.shiftUpBit(16, iArr, i8 << 23, iArr2) | (i8 << 1)) & 511;
    }
}
