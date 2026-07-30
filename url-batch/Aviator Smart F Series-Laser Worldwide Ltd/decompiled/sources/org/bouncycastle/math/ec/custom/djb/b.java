package org.bouncycastle.math.ec.custom.djb;

import b7.h;
import b7.n;
import java.math.BigInteger;
import java.security.SecureRandom;
import kotlinx.coroutines.internal.u;
import org.bouncycastle.util.i;

/* loaded from: classes5.dex */
public class b {
    private static final long M = 4294967295L;
    private static final int P7 = Integer.MAX_VALUE;
    private static final int PInv = 19;
    static final int[] P = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] PExt = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, u.MAX_CAPACITY_MASK};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        h.add(iArr, iArr2, iArr3);
        if (h.gte(iArr3, P)) {
            subPFrom(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        n.add(16, iArr, iArr2, iArr3);
        if (n.gte(16, iArr3, PExt)) {
            subPExtFrom(iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        n.inc(8, iArr, iArr2);
        if (h.gte(iArr2, P)) {
            subPFrom(iArr2);
        }
    }

    private static int addPExtTo(int[] iArr) {
        int[] iArr2 = PExt;
        long j8 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr[0] = (int) j8;
        long j9 = j8 >> 32;
        if (j9 != 0) {
            j9 = n.incAt(8, iArr, 1);
        }
        long j10 = j9 + ((iArr[8] & 4294967295L) - 19);
        iArr[8] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            j11 = n.decAt(15, iArr, 9);
        }
        long j12 = j11 + (iArr[15] & 4294967295L) + (4294967295L & (iArr2[15] + 1));
        iArr[15] = (int) j12;
        return (int) (j12 >> 32);
    }

    private static int addPTo(int[] iArr) {
        long j8 = (iArr[0] & 4294967295L) - 19;
        iArr[0] = (int) j8;
        long j9 = j8 >> 32;
        if (j9 != 0) {
            j9 = n.decAt(7, iArr, 1);
        }
        long j10 = j9 + (4294967295L & iArr[7]) + 2147483648L;
        iArr[7] = (int) j10;
        return (int) (j10 >> 32);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = h.fromBigInteger(bigInteger);
        while (true) {
            int[] iArr = P;
            if (!h.gte(fromBigInteger, iArr)) {
                return fromBigInteger;
            }
            h.subFrom(iArr, fromBigInteger);
        }
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            n.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            h.add(iArr, P, iArr2);
            n.shiftDownBit(8, iArr2, 0);
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
        h.mulAddTo(iArr, iArr2, iArr3);
        if (n.gte(16, iArr3, PExt)) {
            subPExtFrom(iArr3);
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
            iArr[7] = iArr[7] & Integer.MAX_VALUE;
        } while (n.lessThan(8, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int i8 = iArr[7];
        n.shiftUpBit(8, iArr, 8, i8, iArr2, 0);
        int mulByWordAddTo = h.mulByWordAddTo(19, iArr, iArr2) << 1;
        int i9 = iArr2[7];
        iArr2[7] = (i9 & Integer.MAX_VALUE) + n.addWordTo(7, (mulByWordAddTo + ((i9 >>> 31) - (i8 >>> 31))) * 19, iArr2);
        if (h.gte(iArr2, P)) {
            subPFrom(iArr2);
        }
    }

    public static void reduce27(int i8, int[] iArr) {
        int i9 = iArr[7];
        iArr[7] = (i9 & Integer.MAX_VALUE) + n.addWordTo(7, ((i8 << 1) | (i9 >>> 31)) * 19, iArr);
        if (h.gte(iArr, P)) {
            subPFrom(iArr);
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

    private static int subPExtFrom(int[] iArr) {
        int[] iArr2 = PExt;
        long j8 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr[0] = (int) j8;
        long j9 = j8 >> 32;
        if (j9 != 0) {
            j9 = n.decAt(8, iArr, 1);
        }
        long j10 = j9 + (iArr[8] & 4294967295L) + 19;
        iArr[8] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            j11 = n.incAt(15, iArr, 9);
        }
        long j12 = j11 + ((iArr[15] & 4294967295L) - (4294967295L & (iArr2[15] + 1)));
        iArr[15] = (int) j12;
        return (int) (j12 >> 32);
    }

    private static int subPFrom(int[] iArr) {
        long j8 = (iArr[0] & 4294967295L) + 19;
        iArr[0] = (int) j8;
        long j9 = j8 >> 32;
        if (j9 != 0) {
            j9 = n.incAt(7, iArr, 1);
        }
        long j10 = j9 + ((4294967295L & iArr[7]) - 2147483648L);
        iArr[7] = (int) j10;
        return (int) (j10 >> 32);
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (h.sub(iArr, iArr2, iArr3) != 0) {
            addPTo(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (n.sub(16, iArr, iArr2, iArr3) != 0) {
            addPExtTo(iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        n.shiftUpBit(8, iArr, 0, iArr2);
        if (h.gte(iArr2, P)) {
            subPFrom(iArr2);
        }
    }
}
