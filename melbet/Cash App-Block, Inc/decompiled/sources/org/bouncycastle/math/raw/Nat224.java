package org.bouncycastle.math.raw;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.math.BigInteger;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.util.Pack;

/* loaded from: classes8.dex */
public abstract class Nat224 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (iArr[i] & 4294967295L) + (iArr2[i2] & 4294967295L);
        iArr3[i3] = (int) j;
        long j2 = (iArr[i + 1] & 4294967295L) + (iArr2[i2 + 1] & 4294967295L) + (j >>> 32);
        iArr3[i3 + 1] = (int) j2;
        long j3 = (iArr[i + 2] & 4294967295L) + (iArr2[i2 + 2] & 4294967295L) + (j2 >>> 32);
        iArr3[i3 + 2] = (int) j3;
        long j4 = (iArr[i + 3] & 4294967295L) + (iArr2[i2 + 3] & 4294967295L) + (j3 >>> 32);
        iArr3[i3 + 3] = (int) j4;
        long j5 = (iArr[i + 4] & 4294967295L) + (iArr2[i2 + 4] & 4294967295L) + (j4 >>> 32);
        iArr3[i3 + 4] = (int) j5;
        long j6 = (iArr[i + 5] & 4294967295L) + (iArr2[i2 + 5] & 4294967295L) + (j5 >>> 32);
        iArr3[i3 + 5] = (int) j6;
        long j7 = (iArr[i + 6] & 4294967295L) + (iArr2[i2 + 6] & 4294967295L) + (j6 >>> 32);
        iArr3[i3 + 6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (iArr[i] & 4294967295L) + (iArr2[i2] & 4294967295L) + (iArr3[i3] & 4294967295L);
        iArr3[i3] = (int) j;
        long j2 = (iArr[i + 1] & 4294967295L) + (iArr2[i2 + 1] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j >>> 32);
        iArr3[i3 + 1] = (int) j2;
        long j3 = (iArr[i + 2] & 4294967295L) + (iArr2[i2 + 2] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j2 >>> 32);
        iArr3[i3 + 2] = (int) j3;
        long j4 = (iArr[i + 3] & 4294967295L) + (iArr2[i2 + 3] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j3 >>> 32);
        iArr3[i3 + 3] = (int) j4;
        long j5 = (iArr[i + 4] & 4294967295L) + (iArr2[i2 + 4] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j4 >>> 32);
        iArr3[i3 + 4] = (int) j5;
        long j6 = (iArr[i + 5] & 4294967295L) + (iArr2[i2 + 5] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j5 >>> 32);
        iArr3[i3 + 5] = (int) j6;
        long j7 = (iArr[i + 6] & 4294967295L) + (iArr2[i2 + 6] & 4294967295L) + (iArr3[r15] & 4294967295L) + (j6 >>> 32);
        iArr3[i3 + 6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (iArr[i] & 4294967295L) + (iArr2[i2] & 4294967295L) + (i3 & 4294967295L);
        iArr2[i2] = (int) j;
        long j2 = (iArr[i + 1] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j >>> 32);
        iArr2[i2 + 1] = (int) j2;
        long j3 = (iArr[i + 2] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j2 >>> 32);
        iArr2[i2 + 2] = (int) j3;
        long j4 = (iArr[i + 3] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j3 >>> 32);
        iArr2[i2 + 3] = (int) j4;
        long j5 = (iArr[i + 4] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j4 >>> 32);
        iArr2[i2 + 4] = (int) j5;
        long j6 = (iArr[i + 5] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j5 >>> 32);
        iArr2[i2 + 5] = (int) j6;
        long j7 = (iArr[i + 6] & 4294967295L) + (4294967295L & iArr2[r12]) + (j6 >>> 32);
        iArr2[i2 + 6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (iArr[i] & 4294967295L) + (iArr2[i2] & 4294967295L);
        int i3 = (int) j;
        iArr[i] = i3;
        iArr2[i2] = i3;
        long j2 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j >>> 32);
        int i4 = (int) j2;
        iArr[i + 1] = i4;
        iArr2[i2 + 1] = i4;
        long j3 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j2 >>> 32);
        int i5 = (int) j3;
        iArr[i + 2] = i5;
        iArr2[i2 + 2] = i5;
        long j4 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j3 >>> 32);
        int i6 = (int) j4;
        iArr[i + 3] = i6;
        iArr2[i2 + 3] = i6;
        long j5 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j4 >>> 32);
        int i7 = (int) j5;
        iArr[i + 4] = i7;
        iArr2[i2 + 4] = i7;
        long j6 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j5 >>> 32);
        int i8 = (int) j6;
        iArr[i + 5] = i8;
        iArr2[i2 + 5] = i8;
        long j7 = (iArr[r12] & 4294967295L) + (4294967295L & iArr2[r14]) + (j6 >>> 32);
        int i9 = (int) j7;
        iArr[i + 6] = i9;
        iArr2[i2 + 6] = i9;
        return (int) (j7 >>> 32);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2] = iArr[i];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
        iArr2[i2 + 4] = iArr[i + 4];
        iArr2[i2 + 5] = iArr[i + 5];
        iArr2[i2 + 6] = iArr[i + 6];
    }

    public static int[] create() {
        return new int[7];
    }

    public static int[] createExt() {
        return new int[14];
    }

    public static boolean diff(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean gte = gte(iArr, i, iArr2, i2);
        if (gte) {
            sub(iArr, i, iArr2, i2, iArr3, i3);
            return gte;
        }
        sub(iArr2, i2, iArr, i, iArr3, i3);
        return gte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            return null;
        }
        int[] create = create();
        for (int i = 0; i < 7; i++) {
            create[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static int getBit(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 7) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 6; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ PKIFailureInfo.systemUnavail;
            int i5 = Integer.MIN_VALUE ^ iArr2[i2 + i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = iArr2[i2] & 4294967295L;
        long j2 = iArr2[i2 + 1] & 4294967295L;
        long j3 = iArr2[i2 + 2] & 4294967295L;
        long j4 = iArr2[i2 + 3] & 4294967295L;
        long j5 = iArr2[i2 + 4] & 4294967295L;
        long j6 = iArr2[i2 + 5] & 4294967295L;
        long j7 = iArr2[i2 + 6] & 4294967295L;
        long j8 = iArr[i] & 4294967295L;
        long j9 = j8 * j;
        iArr3[i3] = (int) j9;
        long j10 = (j8 * j2) + (j9 >>> 32);
        iArr3[i3 + 1] = (int) j10;
        long j11 = (j8 * j3) + (j10 >>> 32);
        iArr3[i3 + 2] = (int) j11;
        long j12 = (j8 * j4) + (j11 >>> 32);
        iArr3[i3 + 3] = (int) j12;
        long j13 = (j8 * j5) + (j12 >>> 32);
        iArr3[i3 + 4] = (int) j13;
        long j14 = (j8 * j6) + (j13 >>> 32);
        iArr3[i3 + 5] = (int) j14;
        long j15 = (j8 * j7) + (j14 >>> 32);
        iArr3[i3 + 6] = (int) j15;
        iArr3[i3 + 7] = (int) (j15 >>> 32);
        int i4 = 1;
        int i5 = i3;
        while (i4 < 7) {
            int i6 = i5 + 1;
            int i7 = i5;
            long j16 = iArr[i + i4] & 4294967295L;
            long j17 = (j16 * j) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j17;
            long j18 = (j16 * j2) + (iArr3[r3] & 4294967295L) + (j17 >>> 32);
            iArr3[i7 + 2] = (int) j18;
            long j19 = (j16 * j3) + (iArr3[r22] & 4294967295L) + (j18 >>> 32);
            iArr3[i7 + 3] = (int) j19;
            long j20 = (j16 * j4) + (iArr3[r22] & 4294967295L) + (j19 >>> 32);
            iArr3[i7 + 4] = (int) j20;
            long j21 = (j16 * j5) + (iArr3[r22] & 4294967295L) + (j20 >>> 32);
            iArr3[i7 + 5] = (int) j21;
            long j22 = (j16 * j6) + (iArr3[r22] & 4294967295L) + (j21 >>> 32);
            iArr3[i7 + 6] = (int) j22;
            long j23 = (j16 * j7) + (iArr3[r22] & 4294967295L) + (j22 >>> 32);
            iArr3[i7 + 7] = (int) j23;
            iArr3[i7 + 8] = (int) (j23 >>> 32);
            i4++;
            i5 = i6;
        }
    }

    public static long mul33Add(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = i & 4294967295L;
        long j2 = iArr[i2] & 4294967295L;
        long j3 = (j * j2) + (iArr2[i3] & 4294967295L);
        iArr3[i4] = (int) j3;
        long j4 = iArr[i2 + 1] & 4294967295L;
        long j5 = (j * j4) + j2 + (iArr2[i3 + 1] & 4294967295L) + (j3 >>> 32);
        iArr3[i4 + 1] = (int) j5;
        long j6 = iArr[i2 + 2] & 4294967295L;
        long j7 = (j * j6) + j4 + (iArr2[i3 + 2] & 4294967295L) + (j5 >>> 32);
        iArr3[i4 + 2] = (int) j7;
        long j8 = iArr[i2 + 3] & 4294967295L;
        long j9 = (j * j8) + j6 + (iArr2[i3 + 3] & 4294967295L) + (j7 >>> 32);
        iArr3[i4 + 3] = (int) j9;
        long j10 = iArr[i2 + 4] & 4294967295L;
        long j11 = (j * j10) + j8 + (iArr2[i3 + 4] & 4294967295L) + (j9 >>> 32);
        iArr3[i4 + 4] = (int) j11;
        long j12 = iArr[i2 + 5] & 4294967295L;
        long j13 = (j * j12) + j10 + (iArr2[i3 + 5] & 4294967295L) + (j11 >>> 32);
        iArr3[i4 + 5] = (int) j13;
        long j14 = iArr[i2 + 6] & 4294967295L;
        long j15 = (j * j14) + j12 + (4294967295L & iArr2[i3 + 6]) + (j13 >>> 32);
        iArr3[i4 + 6] = (int) j15;
        return (j15 >>> 32) + j14;
    }

    public static int mul33DWordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = i & 4294967295L;
        long j3 = j & 4294967295L;
        long j4 = (j2 * j3) + (iArr[i2] & 4294967295L);
        iArr[i2] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j2 * j5) + j3;
        long j7 = j6 + (iArr[r4] & 4294967295L) + (j4 >>> 32);
        iArr[i2 + 1] = (int) j7;
        long j8 = j5 + (iArr[r4] & 4294967295L) + (j7 >>> 32);
        iArr[i2 + 2] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[r0] & 4294967295L);
        iArr[i2 + 3] = (int) j9;
        if ((j9 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i2, 4);
    }

    public static int mul33WordAdd(int i, int i2, int[] iArr, int i3) {
        long j = i & 4294967295L;
        long j2 = i2 & 4294967295L;
        long j3 = (j * j2) + (iArr[i3] & 4294967295L);
        iArr[i3] = (int) j3;
        long j4 = j2 + (iArr[r5] & 4294967295L) + (j3 >>> 32);
        iArr[i3 + 1] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[r0] & 4294967295L);
        iArr[i3 + 2] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = iArr2[i2] & 4294967295L;
        long j2 = iArr2[i2 + 1] & 4294967295L;
        long j3 = iArr2[i2 + 2] & 4294967295L;
        long j4 = iArr2[i2 + 3] & 4294967295L;
        long j5 = iArr2[i2 + 4] & 4294967295L;
        long j6 = iArr2[i2 + 5] & 4294967295L;
        long j7 = iArr2[i2 + 6] & 4294967295L;
        int i4 = 0;
        int i5 = i3;
        long j8 = 0;
        while (i4 < 7) {
            int i6 = i4;
            long j9 = iArr[i + i4] & 4294967295L;
            long j10 = (j9 * j) + (iArr3[i5] & 4294967295L);
            long j11 = j2;
            iArr3[i5] = (int) j10;
            int i7 = i5 + 1;
            long j12 = (j9 * j11) + (iArr3[i7] & 4294967295L) + (j10 >>> 32);
            iArr3[i7] = (int) j12;
            long j13 = (j9 * j3) + (iArr3[r4] & 4294967295L) + (j12 >>> 32);
            iArr3[i5 + 2] = (int) j13;
            long j14 = (j9 * j4) + (iArr3[r4] & 4294967295L) + (j13 >>> 32);
            iArr3[i5 + 3] = (int) j14;
            long j15 = (j9 * j5) + (iArr3[r4] & 4294967295L) + (j14 >>> 32);
            iArr3[i5 + 4] = (int) j15;
            long j16 = (j9 * j6) + (iArr3[r4] & 4294967295L) + (j15 >>> 32);
            iArr3[i5 + 5] = (int) j16;
            long j17 = (j9 * j7) + (iArr3[r4] & 4294967295L) + (j16 >>> 32);
            iArr3[i5 + 6] = (int) j17;
            long j18 = (j17 >>> 32) + (iArr3[r16] & 4294967295L) + j8;
            iArr3[i5 + 7] = (int) j18;
            j8 = j18 >>> 32;
            i4 = i6 + 1;
            i5 = i7;
            j2 = j11;
        }
        return (int) j8;
    }

    public static int mulByWord(int i, int[] iArr) {
        long j = i & 4294967295L;
        long j2 = (iArr[0] & 4294967295L) * j;
        iArr[0] = (int) j2;
        long j3 = ((iArr[1] & 4294967295L) * j) + (j2 >>> 32);
        iArr[1] = (int) j3;
        long j4 = ((iArr[2] & 4294967295L) * j) + (j3 >>> 32);
        iArr[2] = (int) j4;
        long j5 = ((iArr[3] & 4294967295L) * j) + (j4 >>> 32);
        iArr[3] = (int) j5;
        long j6 = ((iArr[4] & 4294967295L) * j) + (j5 >>> 32);
        iArr[4] = (int) j6;
        long j7 = ((iArr[5] & 4294967295L) * j) + (j6 >>> 32);
        iArr[5] = (int) j7;
        long j8 = (j * (4294967295L & iArr[6])) + (j7 >>> 32);
        iArr[6] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int mulByWordAddTo(int i, int[] iArr, int[] iArr2) {
        long j = i & 4294967295L;
        long j2 = ((iArr2[0] & 4294967295L) * j) + (iArr[0] & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = ((iArr2[1] & 4294967295L) * j) + (iArr[1] & 4294967295L) + (j2 >>> 32);
        iArr2[1] = (int) j3;
        long j4 = ((iArr2[2] & 4294967295L) * j) + (iArr[2] & 4294967295L) + (j3 >>> 32);
        iArr2[2] = (int) j4;
        long j5 = ((iArr2[3] & 4294967295L) * j) + (iArr[3] & 4294967295L) + (j4 >>> 32);
        iArr2[3] = (int) j5;
        long j6 = ((iArr2[4] & 4294967295L) * j) + (iArr[4] & 4294967295L) + (j5 >>> 32);
        iArr2[4] = (int) j6;
        long j7 = ((iArr2[5] & 4294967295L) * j) + (iArr[5] & 4294967295L) + (j6 >>> 32);
        iArr2[5] = (int) j7;
        long j8 = (j * (iArr2[6] & 4294967295L)) + (4294967295L & iArr[6]) + (j7 >>> 32);
        iArr2[6] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int mulWord(int i, int[] iArr, int[] iArr2, int i2) {
        long j = i & 4294967295L;
        long j2 = 0;
        int i3 = 0;
        do {
            long j3 = ((iArr[i3] & 4294967295L) * j) + j2;
            iArr2[i2 + i3] = (int) j3;
            j2 = j3 >>> 32;
            i3++;
        } while (i3 < 7);
        return (int) j2;
    }

    public static int mulWordAddTo(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = i & 4294967295L;
        long j2 = ((iArr[i2] & 4294967295L) * j) + (iArr2[i3] & 4294967295L);
        iArr2[i3] = (int) j2;
        long j3 = ((iArr[i2 + 1] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j2 >>> 32);
        iArr2[i3 + 1] = (int) j3;
        long j4 = ((iArr[i2 + 2] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j3 >>> 32);
        iArr2[i3 + 2] = (int) j4;
        long j5 = ((iArr[i2 + 3] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j4 >>> 32);
        iArr2[i3 + 3] = (int) j5;
        long j6 = ((iArr[i2 + 4] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j5 >>> 32);
        iArr2[i3 + 4] = (int) j6;
        long j7 = ((iArr[i2 + 5] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j6 >>> 32);
        iArr2[i3 + 5] = (int) j7;
        long j8 = (j * (iArr[i2 + 6] & 4294967295L)) + (iArr2[r15] & 4294967295L) + (j7 >>> 32);
        iArr2[i3 + 6] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int mulWordDwordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = i & 4294967295L;
        long j3 = ((j & 4294967295L) * j2) + (iArr[i2] & 4294967295L);
        iArr[i2] = (int) j3;
        long j4 = j2 * (j >>> 32);
        long j5 = j4 + (iArr[r9] & 4294967295L) + (j3 >>> 32);
        iArr[i2 + 1] = (int) j5;
        long j6 = j5 >>> 32;
        long j7 = j6 + (iArr[r0] & 4294967295L);
        iArr[i2 + 2] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i2, 3);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j = iArr[i] & 4294967295L;
        int i3 = 0;
        int i4 = 14;
        int i5 = 6;
        while (true) {
            int i6 = i5 - 1;
            long j2 = iArr[i + i5] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[(i4 - 1) + i2] = (i3 << 31) | ((int) (j3 >>> 33));
            i4 -= 2;
            iArr2[i2 + i4] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | ((i3 << 31) & 4294967295L);
                iArr2[i2] = (int) j4;
                int i7 = ((int) (j4 >>> 32)) & 1;
                long j6 = iArr[i + 1] & 4294967295L;
                long j7 = (j6 * j) + j5;
                int i8 = (int) j7;
                iArr2[i2 + 1] = (i8 << 1) | i7;
                long j8 = (iArr2[r8] & 4294967295L) + (j7 >>> 32);
                long j9 = iArr[i + 2] & 4294967295L;
                long j10 = (j9 * j) + j8;
                int i9 = (int) j10;
                iArr2[i2 + 2] = (i9 << 1) | (i8 >>> 31);
                long m = SVG$Unit$EnumUnboxingLocalUtility.m(j9, j6, j10 >>> 32, iArr2[r9] & 4294967295L);
                long j11 = (iArr2[r24] & 4294967295L) + (m >>> 32);
                long j12 = iArr[i + 3] & 4294967295L;
                long j13 = (iArr2[r6] & 4294967295L) + (j11 >>> 32);
                long j14 = j11 & 4294967295L;
                long j15 = (iArr2[r2] & 4294967295L) + (j13 >>> 32);
                long j16 = j13 & 4294967295L;
                long j17 = (j12 * j) + (m & 4294967295L);
                int i10 = (int) j17;
                iArr2[i2 + 3] = (i9 >>> 31) | (i10 << 1);
                long m2 = SVG$Unit$EnumUnboxingLocalUtility.m(j12, j6, j17 >>> 32, j14);
                long m3 = SVG$Unit$EnumUnboxingLocalUtility.m(j12, j9, m2 >>> 32, j16);
                long j18 = j15 + (m3 >>> 32);
                long j19 = m3 & 4294967295L;
                long j20 = iArr[i + 4] & 4294967295L;
                long j21 = (iArr2[r4] & 4294967295L) + (j18 >>> 32);
                long j22 = j18 & 4294967295L;
                long j23 = (iArr2[r5] & 4294967295L) + (j21 >>> 32);
                long j24 = j21 & 4294967295L;
                long j25 = (j20 * j) + (m2 & 4294967295L);
                int i11 = (int) j25;
                iArr2[i2 + 4] = (i10 >>> 31) | (i11 << 1);
                int i12 = i11 >>> 31;
                long m4 = SVG$Unit$EnumUnboxingLocalUtility.m(j20, j6, j25 >>> 32, j19);
                long m5 = SVG$Unit$EnumUnboxingLocalUtility.m(j20, j9, m4 >>> 32, j22);
                long m6 = SVG$Unit$EnumUnboxingLocalUtility.m(j20, j12, m5 >>> 32, j24);
                long j26 = m5 & 4294967295L;
                long j27 = j23 + (m6 >>> 32);
                long j28 = m6 & 4294967295L;
                long j29 = iArr[i + 5] & 4294967295L;
                long j30 = (iArr2[r10] & 4294967295L) + (j27 >>> 32);
                long j31 = j27 & 4294967295L;
                long j32 = (j29 * j) + (m4 & 4294967295L);
                int i13 = (int) j32;
                iArr2[i2 + 5] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                long m7 = SVG$Unit$EnumUnboxingLocalUtility.m(j29, j6, j32 >>> 32, j26);
                long m8 = SVG$Unit$EnumUnboxingLocalUtility.m(j29, j9, m7 >>> 32, j28);
                long m9 = SVG$Unit$EnumUnboxingLocalUtility.m(j29, j12, m8 >>> 32, j31);
                long j33 = m8 & 4294967295L;
                long m10 = SVG$Unit$EnumUnboxingLocalUtility.m(j29, j20, m9 >>> 32, j30 & 4294967295L);
                long j34 = (iArr2[r6] & 4294967295L) + (j30 >>> 32) + (m10 >>> 32);
                long j35 = m10 & 4294967295L;
                long j36 = iArr[i + 6] & 4294967295L;
                long j37 = (iArr2[r9] & 4294967295L) + (j34 >>> 32);
                long j38 = j34 & 4294967295L;
                long j39 = (iArr2[r11] & 4294967295L) + (j37 >>> 32);
                long j40 = j37 & 4294967295L;
                long j41 = (j36 * j) + (m7 & 4294967295L);
                int i15 = (int) j41;
                iArr2[i2 + 6] = (i15 << 1) | i14;
                long m11 = SVG$Unit$EnumUnboxingLocalUtility.m(j36, j6, j41 >>> 32, j33);
                long m12 = SVG$Unit$EnumUnboxingLocalUtility.m(j36, j9, m11 >>> 32, m9 & 4294967295L);
                long m13 = SVG$Unit$EnumUnboxingLocalUtility.m(j36, j12, m12 >>> 32, j35);
                long m14 = SVG$Unit$EnumUnboxingLocalUtility.m(j36, j20, m13 >>> 32, j38);
                long m15 = SVG$Unit$EnumUnboxingLocalUtility.m(j36, j29, m14 >>> 32, j40);
                long j42 = j39 + (m15 >>> 32);
                int i16 = (int) m11;
                iArr2[i2 + 7] = (i15 >>> 31) | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) m12;
                iArr2[i2 + 8] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) m13;
                iArr2[i2 + 9] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) m14;
                iArr2[i2 + 10] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) m15;
                iArr2[i2 + 11] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j42;
                iArr2[i2 + 12] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = i2 + 13;
                iArr2[i28] = i27 | ((iArr2[i28] + ((int) (j42 >>> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (iArr[i] & 4294967295L) - (iArr2[i2] & 4294967295L);
        iArr3[i3] = (int) j;
        long j2 = ((iArr[i + 1] & 4294967295L) - (iArr2[i2 + 1] & 4294967295L)) + (j >> 32);
        iArr3[i3 + 1] = (int) j2;
        long j3 = ((iArr[i + 2] & 4294967295L) - (iArr2[i2 + 2] & 4294967295L)) + (j2 >> 32);
        iArr3[i3 + 2] = (int) j3;
        long j4 = ((iArr[i + 3] & 4294967295L) - (iArr2[i2 + 3] & 4294967295L)) + (j3 >> 32);
        iArr3[i3 + 3] = (int) j4;
        long j5 = ((iArr[i + 4] & 4294967295L) - (iArr2[i2 + 4] & 4294967295L)) + (j4 >> 32);
        iArr3[i3 + 4] = (int) j5;
        long j6 = ((iArr[i + 5] & 4294967295L) - (iArr2[i2 + 5] & 4294967295L)) + (j5 >> 32);
        iArr3[i3 + 5] = (int) j6;
        long j7 = ((iArr[i + 6] & 4294967295L) - (iArr2[i2 + 6] & 4294967295L)) + (j6 >> 32);
        iArr3[i3 + 6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((iArr3[0] & 4294967295L) - (iArr[0] & 4294967295L)) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((iArr3[1] & 4294967295L) - (iArr[1] & 4294967295L)) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = (((iArr3[2] & 4294967295L) - (iArr[2] & 4294967295L)) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = (((iArr3[3] & 4294967295L) - (iArr[3] & 4294967295L)) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = (((iArr3[4] & 4294967295L) - (iArr[4] & 4294967295L)) - (iArr2[4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = (((iArr3[5] & 4294967295L) - (iArr[5] & 4294967295L)) - (iArr2[5] & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = (((iArr3[6] & 4294967295L) - (iArr[6] & 4294967295L)) - (iArr2[6] & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (iArr2[i2] & 4294967295L) - (iArr[i] & 4294967295L);
        iArr2[i2] = (int) j;
        long j2 = ((iArr2[r5] & 4294967295L) - (iArr[i + 1] & 4294967295L)) + (j >> 32);
        iArr2[i2 + 1] = (int) j2;
        long j3 = ((iArr2[r5] & 4294967295L) - (iArr[i + 2] & 4294967295L)) + (j2 >> 32);
        iArr2[i2 + 2] = (int) j3;
        long j4 = ((iArr2[r5] & 4294967295L) - (iArr[i + 3] & 4294967295L)) + (j3 >> 32);
        iArr2[i2 + 3] = (int) j4;
        long j5 = ((iArr2[r5] & 4294967295L) - (iArr[i + 4] & 4294967295L)) + (j4 >> 32);
        iArr2[i2 + 4] = (int) j5;
        long j6 = ((iArr2[r5] & 4294967295L) - (iArr[i + 5] & 4294967295L)) + (j5 >> 32);
        iArr2[i2 + 5] = (int) j6;
        long j7 = ((iArr2[r13] & 4294967295L) - (iArr[i + 6] & 4294967295L)) + (j6 >> 32);
        iArr2[i2 + 6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (6 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            int i2 = iArr[i] ^ PKIFailureInfo.systemUnavail;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        long j5 = ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j4 >> 32);
        iArr2[4] = (int) j5;
        long j6 = ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L)) + (j5 >> 32);
        iArr2[5] = (int) j6;
        long j7 = ((iArr2[6] & 4294967295L) - (4294967295L & iArr[6])) + (j6 >> 32);
        iArr2[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr2[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr2[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        iArr2[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j4 >>> 32);
        iArr2[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j5 >>> 32);
        iArr2[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (4294967295L & iArr2[6]) + (j6 >>> 32);
        iArr2[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2, int i) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (i & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr2[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr2[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        iArr2[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j4 >>> 32);
        iArr2[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j5 >>> 32);
        iArr2[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (4294967295L & iArr2[6]) + (j6 >>> 32);
        iArr2[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = 0;
        int i = 0;
        while (i < 7) {
            long j9 = j7;
            long j10 = iArr[i] & 4294967295L;
            long j11 = (iArr3[i] & 4294967295L) + (j10 * j);
            iArr3[i] = (int) j11;
            int i2 = i + 1;
            long j12 = (j10 * j2) + (iArr3[i2] & 4294967295L) + (j11 >>> 32);
            iArr3[i2] = (int) j12;
            long j13 = (j10 * j3) + (iArr3[r15] & 4294967295L) + (j12 >>> 32);
            int i3 = i;
            iArr3[i + 2] = (int) j13;
            long j14 = (j10 * j4) + (iArr3[r2] & 4294967295L) + (j13 >>> 32);
            iArr3[i3 + 3] = (int) j14;
            long j15 = (j10 * j5) + (iArr3[r2] & 4294967295L) + (j14 >>> 32);
            iArr3[i3 + 4] = (int) j15;
            long j16 = (j10 * j6) + (iArr3[r2] & 4294967295L) + (j15 >>> 32);
            iArr3[i3 + 5] = (int) j16;
            long j17 = (j10 * j9) + (iArr3[r2] & 4294967295L) + (j16 >>> 32);
            iArr3[i3 + 6] = (int) j17;
            long j18 = (j17 >>> 32) + (iArr3[r2] & 4294967295L) + j8;
            iArr3[i3 + 7] = (int) j18;
            j8 = j18 >>> 32;
            i = i2;
            j7 = j9;
        }
        return (int) j8;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = iArr[0] & 4294967295L;
        long j9 = j8 * j;
        iArr3[0] = (int) j9;
        long j10 = (j8 * j2) + (j9 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (j8 * j3) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (j8 * j4) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (j8 * j5) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (j8 * j6) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = (j8 * j7) + (j14 >>> 32);
        iArr3[6] = (int) j15;
        iArr3[7] = (int) (j15 >>> 32);
        int i = 1;
        for (int i2 = 7; i < i2; i2 = 7) {
            long j16 = iArr[i] & 4294967295L;
            long j17 = (j16 * j) + (iArr3[i] & 4294967295L);
            iArr3[i] = (int) j17;
            int i3 = i + 1;
            long j18 = j5;
            long j19 = (j16 * j2) + (iArr3[i3] & 4294967295L) + (j17 >>> 32);
            iArr3[i3] = (int) j19;
            long j20 = (j16 * j3) + (iArr3[r7] & 4294967295L) + (j19 >>> 32);
            iArr3[i + 2] = (int) j20;
            long j21 = (j16 * j4) + (iArr3[r7] & 4294967295L) + (j20 >>> 32);
            iArr3[i + 3] = (int) j21;
            long j22 = (j16 * j18) + (iArr3[r7] & 4294967295L) + (j21 >>> 32);
            iArr3[i + 4] = (int) j22;
            long j23 = (j16 * j6) + (iArr3[r7] & 4294967295L) + (j22 >>> 32);
            iArr3[i + 5] = (int) j23;
            long j24 = (j16 * j7) + (iArr3[r7] & 4294967295L) + (j23 >>> 32);
            iArr3[i + 6] = (int) j24;
            iArr3[i + 7] = (int) (j24 >>> 32);
            i = i3;
            j5 = j18;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 14;
        int i2 = 0;
        int i3 = 6;
        while (true) {
            int i4 = i3 - 1;
            long j2 = iArr[i3] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | ((i2 << 31) & 4294967295L);
                iArr2[0] = (int) j4;
                int i5 = ((int) (j4 >>> 32)) & 1;
                long j6 = iArr[1] & 4294967295L;
                long j7 = (j6 * j) + j5;
                int i6 = (int) j7;
                iArr2[1] = i5 | (i6 << 1);
                long j8 = iArr[2] & 4294967295L;
                long j9 = (j8 * j) + (iArr2[2] & 4294967295L) + (j7 >>> 32);
                int i7 = (int) j9;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long m = SVG$Unit$EnumUnboxingLocalUtility.m(j8, j6, j9 >>> 32, iArr2[3] & 4294967295L);
                long j10 = (iArr2[4] & 4294967295L) + (m >>> 32);
                long j11 = iArr[3] & 4294967295L;
                long j12 = (iArr2[5] & 4294967295L) + (j10 >>> 32);
                long j13 = j10 & 4294967295L;
                long j14 = (iArr2[6] & 4294967295L) + (j12 >>> 32);
                long j15 = j12 & 4294967295L;
                long j16 = (j11 * j) + (m & 4294967295L);
                int i8 = (int) j16;
                iArr2[3] = (i7 >>> 31) | (i8 << 1);
                int i9 = i8 >>> 31;
                long m2 = SVG$Unit$EnumUnboxingLocalUtility.m(j11, j6, j16 >>> 32, j13);
                long m3 = SVG$Unit$EnumUnboxingLocalUtility.m(j11, j8, m2 >>> 32, j15);
                long j17 = j14 + (m3 >>> 32);
                long j18 = iArr[4] & 4294967295L;
                long j19 = (iArr2[7] & 4294967295L) + (j17 >>> 32);
                long j20 = j17 & 4294967295L;
                long j21 = (iArr2[8] & 4294967295L) + (j19 >>> 32);
                long j22 = j19 & 4294967295L;
                long j23 = (j18 * j) + (m2 & 4294967295L);
                int i10 = (int) j23;
                iArr2[4] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long m4 = SVG$Unit$EnumUnboxingLocalUtility.m(j18, j6, j23 >>> 32, m3 & 4294967295L);
                long m5 = SVG$Unit$EnumUnboxingLocalUtility.m(j18, j8, m4 >>> 32, j20);
                long m6 = SVG$Unit$EnumUnboxingLocalUtility.m(j18, j11, m5 >>> 32, j22);
                long j24 = j21 + (m6 >>> 32);
                long j25 = iArr[5] & 4294967295L;
                long j26 = (iArr2[9] & 4294967295L) + (j24 >>> 32);
                long j27 = j24 & 4294967295L;
                long j28 = (iArr2[10] & 4294967295L) + (j26 >>> 32);
                long j29 = j26 & 4294967295L;
                long j30 = (j25 * j) + (m4 & 4294967295L);
                int i12 = (int) j30;
                iArr2[5] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                long m7 = SVG$Unit$EnumUnboxingLocalUtility.m(j25, j6, j30 >>> 32, m5 & 4294967295L);
                long m8 = SVG$Unit$EnumUnboxingLocalUtility.m(j25, j8, m7 >>> 32, m6 & 4294967295L);
                long m9 = SVG$Unit$EnumUnboxingLocalUtility.m(j25, j11, m8 >>> 32, j27);
                long j31 = m8 & 4294967295L;
                long m10 = SVG$Unit$EnumUnboxingLocalUtility.m(j25, j18, m9 >>> 32, j29);
                long j32 = j28 + (m10 >>> 32);
                long j33 = m10 & 4294967295L;
                long j34 = iArr[6] & 4294967295L;
                long j35 = (iArr2[11] & 4294967295L) + (j32 >>> 32);
                long j36 = j32 & 4294967295L;
                long j37 = (iArr2[12] & 4294967295L) + (j35 >>> 32);
                long j38 = j35 & 4294967295L;
                long j39 = (j34 * j) + (m7 & 4294967295L);
                int i14 = (int) j39;
                iArr2[6] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                long m11 = SVG$Unit$EnumUnboxingLocalUtility.m(j34, j6, j39 >>> 32, j31);
                long m12 = SVG$Unit$EnumUnboxingLocalUtility.m(j34, j8, m11 >>> 32, m9 & 4294967295L);
                long m13 = SVG$Unit$EnumUnboxingLocalUtility.m(j34, j11, m12 >>> 32, j33);
                long m14 = SVG$Unit$EnumUnboxingLocalUtility.m(j34, j18, m13 >>> 32, j36);
                long m15 = SVG$Unit$EnumUnboxingLocalUtility.m(j34, j25, m14 >>> 32, j38);
                long j40 = j37 + (m15 >>> 32);
                int i16 = (int) m11;
                iArr2[7] = (i16 << 1) | i15;
                int i17 = (int) m12;
                iArr2[8] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) m13;
                iArr2[9] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) m14;
                iArr2[10] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) m15;
                iArr2[11] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j40;
                iArr2[12] = i24 | (i25 << 1);
                iArr2[13] = ((iArr2[13] + ((int) (j40 >>> 32))) << 1) | (i25 >>> 31);
                return;
            }
            i3 = i4;
        }
    }
}
