package b7;

import java.util.Random;

/* loaded from: classes5.dex */
public abstract class c {
    private static final int M30 = 1073741823;
    private static final long M32L = 4294967295L;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int length = iArr.length;
        if (n.add(length, iArr2, iArr3, iArr4) != 0) {
            n.subFrom(length, iArr, iArr4);
        }
    }

    private static int add30(int i8, int[] iArr, int[] iArr2) {
        int i9 = i8 - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = i10 + iArr[i11] + iArr2[i11];
            iArr[i11] = 1073741823 & i12;
            i10 = i12 >> 30;
        }
        int i13 = i10 + iArr[i9] + iArr2[i9];
        iArr[i9] = i13;
        return i13 >> 30;
    }

    public static void checkedModOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        if (modOddInverse(iArr, iArr2, iArr3) == 0) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    public static void checkedModOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        if (!modOddInverseVar(iArr, iArr2, iArr3)) {
            throw new ArithmeticException("Inverse does not exist.");
        }
    }

    private static void cnegate30(int i8, int i9, int[] iArr) {
        int i10 = i8 - 1;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i11 + ((iArr[i12] ^ i9) - i9);
            iArr[i12] = 1073741823 & i13;
            i11 = i13 >> 30;
        }
        iArr[i10] = i11 + ((iArr[i10] ^ i9) - i9);
    }

    private static void cnormalize30(int i8, int i9, int[] iArr, int[] iArr2) {
        int i10 = i8 - 1;
        int i11 = iArr[i10] >> 31;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = i12 + (((iArr[i13] + (iArr2[i13] & i11)) ^ i9) - i9);
            iArr[i13] = 1073741823 & i14;
            i12 = i14 >> 30;
        }
        int i15 = i12 + (((iArr[i10] + (i11 & iArr2[i10])) ^ i9) - i9);
        iArr[i10] = i15;
        int i16 = i15 >> 31;
        int i17 = 0;
        for (int i18 = 0; i18 < i10; i18++) {
            int i19 = i17 + iArr[i18] + (iArr2[i18] & i16);
            iArr[i18] = i19 & 1073741823;
            i17 = i19 >> 30;
        }
        iArr[i10] = i17 + iArr[i10] + (i16 & iArr2[i10]);
    }

    private static void decode30(int i8, int[] iArr, int i9, int[] iArr2, int i10) {
        int i11 = 0;
        long j8 = 0;
        while (i8 > 0) {
            while (i11 < Math.min(32, i8)) {
                j8 |= iArr[i9] << i11;
                i11 += 30;
                i9++;
            }
            iArr2[i10] = (int) j8;
            j8 >>>= 32;
            i11 -= 32;
            i8 -= 32;
            i10++;
        }
    }

    private static int divsteps30(int i8, int i9, int i10, int[] iArr) {
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        for (int i15 = 0; i15 < 30; i15++) {
            int i16 = i8 >> 31;
            int i17 = -(i10 & 1);
            int i18 = i10 + (((i9 ^ i16) - i16) & i17);
            i13 += ((i11 ^ i16) - i16) & i17;
            i14 += ((i12 ^ i16) - i16) & i17;
            int i19 = i16 & i17;
            i8 = (i8 ^ i19) - (i19 + 1);
            i9 += i18 & i19;
            i10 = i18 >> 1;
            i11 = (i11 + (i13 & i19)) << 1;
            i12 = (i12 + (i19 & i14)) << 1;
        }
        iArr[0] = i11;
        iArr[1] = i12;
        iArr[2] = i13;
        iArr[3] = i14;
        return i8;
    }

    private static int divsteps30Var(int i8, int i9, int i10, int[] iArr) {
        int i11;
        int i12 = i8;
        int i13 = i9;
        int i14 = i10;
        int i15 = 30;
        int i16 = 1;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1;
        while (true) {
            int numberOfTrailingZeros = org.bouncycastle.util.e.numberOfTrailingZeros(((-1) << i15) | i14);
            int i20 = i14 >> numberOfTrailingZeros;
            i16 <<= numberOfTrailingZeros;
            i17 <<= numberOfTrailingZeros;
            i12 -= numberOfTrailingZeros;
            i15 -= numberOfTrailingZeros;
            if (i15 <= 0) {
                iArr[0] = i16;
                iArr[1] = i17;
                iArr[2] = i18;
                iArr[3] = i19;
                return i12;
            }
            if (i12 < 0) {
                i12 = -i12;
                int i21 = -i13;
                int i22 = -i16;
                int i23 = -i17;
                int i24 = i12 + 1;
                if (i24 > i15) {
                    i24 = i15;
                }
                i11 = ((-1) >>> (32 - i24)) & 63 & (i20 * i21 * ((i20 * i20) - 2));
                i20 = i21;
                i13 = i20;
                int i25 = i18;
                i18 = i22;
                i16 = i25;
                int i26 = i19;
                i19 = i23;
                i17 = i26;
            } else {
                int i27 = i12 + 1;
                if (i27 > i15) {
                    i27 = i15;
                }
                i11 = ((-1) >>> (32 - i27)) & 15 & ((-((((i13 + 1) & 4) << 1) + i13)) * i20);
            }
            i14 = i20 + (i13 * i11);
            i18 += i16 * i11;
            i19 += i11 * i17;
        }
    }

    private static void encode30(int i8, int[] iArr, int i9, int[] iArr2, int i10) {
        int i11 = 0;
        long j8 = 0;
        while (i8 > 0) {
            if (i11 < Math.min(30, i8)) {
                j8 |= (iArr[i9] & 4294967295L) << i11;
                i11 += 32;
                i9++;
            }
            iArr2[i10] = ((int) j8) & 1073741823;
            j8 >>>= 30;
            i11 -= 30;
            i8 -= 30;
            i10++;
        }
    }

    private static int getMaximumDivsteps(int i8) {
        return ((i8 * 49) + (i8 < 46 ? 80 : 47)) / 17;
    }

    public static int inverse32(int i8) {
        int i9 = (2 - (i8 * i8)) * i8;
        int i10 = i9 * (2 - (i8 * i9));
        int i11 = i10 * (2 - (i8 * i10));
        return i11 * (2 - (i8 * i11));
    }

    public static void invert(int[] iArr, int[] iArr2, int[] iArr3) {
        checkedModOddInverseVar(iArr, iArr2, iArr3);
    }

    public static int modOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int numberOfLeadingZeros = (length << 5) - org.bouncycastle.util.e.numberOfLeadingZeros(iArr[length - 1]);
        int i8 = (numberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i8];
        int[] iArr6 = new int[i8];
        int[] iArr7 = new int[i8];
        int[] iArr8 = new int[i8];
        int[] iArr9 = new int[i8];
        char c8 = 0;
        iArr6[0] = 1;
        encode30(numberOfLeadingZeros, iArr2, 0, iArr8, 0);
        encode30(numberOfLeadingZeros, iArr, 0, iArr9, 0);
        System.arraycopy(iArr9, 0, iArr7, 0, i8);
        int inverse32 = inverse32(iArr9[0]);
        int maximumDivsteps = getMaximumDivsteps(numberOfLeadingZeros);
        int i9 = -1;
        int i10 = 0;
        while (i10 < maximumDivsteps) {
            int divsteps30 = divsteps30(i9, iArr7[c8], iArr8[c8], iArr4);
            updateDE30(i8, iArr5, iArr6, iArr4, inverse32, iArr9);
            updateFG30(i8, iArr7, iArr8, iArr4);
            i10 += 30;
            i9 = divsteps30;
            maximumDivsteps = maximumDivsteps;
            c8 = 0;
        }
        int i11 = iArr7[i8 - 1] >> 31;
        cnegate30(i8, i11, iArr7);
        cnormalize30(i8, i11, iArr5, iArr9);
        decode30(numberOfLeadingZeros, iArr5, 0, iArr3, 0);
        return n.equalTo(i8, iArr7, 1) & n.equalToZero(i8, iArr8);
    }

    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static boolean modOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int numberOfLeadingZeros = (length << 5) - org.bouncycastle.util.e.numberOfLeadingZeros(iArr[length - 1]);
        int i8 = (numberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i8];
        int[] iArr6 = new int[i8];
        int[] iArr7 = new int[i8];
        int[] iArr8 = new int[i8];
        int[] iArr9 = new int[i8];
        ?? r9 = 0;
        iArr6[0] = 1;
        encode30(numberOfLeadingZeros, iArr2, 0, iArr8, 0);
        encode30(numberOfLeadingZeros, iArr, 0, iArr9, 0);
        System.arraycopy(iArr9, 0, iArr7, 0, i8);
        int i9 = i8 - 1;
        int numberOfLeadingZeros2 = (-1) - (org.bouncycastle.util.e.numberOfLeadingZeros(iArr8[i9] | 1) - (((i8 * 30) + 2) - numberOfLeadingZeros));
        int inverse32 = inverse32(iArr9[0]);
        int maximumDivsteps = getMaximumDivsteps(numberOfLeadingZeros);
        int i10 = i8;
        int i11 = 0;
        while (!n.isZero(i10, iArr8)) {
            if (i11 >= maximumDivsteps) {
                return r9;
            }
            int i12 = i11 + 30;
            int divsteps30Var = divsteps30Var(numberOfLeadingZeros2, iArr7[r9], iArr8[r9], iArr4);
            int i13 = i10;
            int i14 = maximumDivsteps;
            int[] iArr10 = iArr6;
            updateDE30(i8, iArr5, iArr6, iArr4, inverse32, iArr9);
            updateFG30(i13, iArr7, iArr8, iArr4);
            int i15 = i13 - 1;
            int i16 = iArr7[i15];
            int i17 = iArr8[i15];
            int i18 = i13 - 2;
            if (((i18 >> 31) | ((i16 >> 31) ^ i16) | ((i17 >> 31) ^ i17)) == 0) {
                iArr7[i18] = (i16 << 30) | iArr7[i18];
                iArr8[i18] = iArr8[i18] | (i17 << 30);
                i10 = i13 - 1;
            } else {
                i10 = i13;
            }
            i11 = i12;
            numberOfLeadingZeros2 = divsteps30Var;
            maximumDivsteps = i14;
            iArr6 = iArr10;
            r9 = 0;
        }
        int i19 = i10;
        int i20 = iArr7[i19 - 1] >> 31;
        int i21 = iArr5[i9] >> 31;
        if (i21 < 0) {
            i21 = add30(i8, iArr5, iArr9);
        }
        if (i20 < 0) {
            i21 = negate30(i8, iArr5);
            negate30(i19, iArr7);
        }
        if (!n.isOne(i19, iArr7)) {
            return false;
        }
        if (i21 < 0) {
            add30(i8, iArr5, iArr9);
        }
        decode30(numberOfLeadingZeros, iArr5, 0, iArr3, 0);
        return true;
    }

    private static int negate30(int i8, int[] iArr) {
        int i9 = i8 - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = i10 - iArr[i11];
            iArr[i11] = 1073741823 & i12;
            i10 = i12 >> 30;
        }
        int i13 = i10 - iArr[i9];
        iArr[i9] = i13;
        return i13 >> 30;
    }

    public static int[] random(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] create = n.create(length);
        int i8 = length - 1;
        int i9 = iArr[i8];
        int i10 = i9 | (i9 >>> 1);
        int i11 = i10 | (i10 >>> 2);
        int i12 = i11 | (i11 >>> 4);
        int i13 = i12 | (i12 >>> 8);
        int i14 = i13 | (i13 >>> 16);
        do {
            for (int i15 = 0; i15 != length; i15++) {
                create[i15] = random.nextInt();
            }
            create[i8] = create[i8] & i14;
        } while (n.gte(length, create, iArr));
        return create;
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int length = iArr.length;
        if (n.sub(length, iArr2, iArr3, iArr4) != 0) {
            n.addTo(length, iArr, iArr4);
        }
    }

    private static void updateDE30(int i8, int[] iArr, int[] iArr2, int[] iArr3, int i9, int[] iArr4) {
        int i10 = i8;
        int i11 = iArr3[0];
        int i12 = iArr3[1];
        int i13 = iArr3[2];
        int i14 = iArr3[3];
        int i15 = i10 - 1;
        int i16 = iArr[i15] >> 31;
        int i17 = iArr2[i15] >> 31;
        int i18 = (i11 & i16) + (i12 & i17);
        int i19 = (i16 & i13) + (i17 & i14);
        int i20 = iArr4[0];
        long j8 = i11;
        long j9 = iArr[0];
        long j10 = i12;
        long j11 = iArr2[0];
        long j12 = (j8 * j9) + (j10 * j11);
        long j13 = i13;
        long j14 = i14;
        long j15 = (j9 * j13) + (j11 * j14);
        long j16 = i20;
        long j17 = i18 - (((((int) j12) * i9) + i18) & 1073741823);
        int i21 = i15;
        long j18 = i19 - (((((int) j15) * i9) + i19) & 1073741823);
        long j19 = (j15 + (j16 * j18)) >> 30;
        long j20 = (j12 + (j16 * j17)) >> 30;
        int i22 = 1;
        while (i22 < i10) {
            int i23 = iArr4[i22];
            long j21 = j19;
            long j22 = iArr[i22];
            int i24 = i22;
            long j23 = iArr2[i22];
            long j24 = j18;
            long j25 = i23;
            long j26 = j20 + (j8 * j22) + (j10 * j23) + (j25 * j17);
            long j27 = j21 + (j22 * j13) + (j23 * j14) + (j25 * j24);
            int i25 = i24 - 1;
            iArr[i25] = ((int) j26) & 1073741823;
            j20 = j26 >> 30;
            iArr2[i25] = ((int) j27) & 1073741823;
            j19 = j27 >> 30;
            i22 = i24 + 1;
            i10 = i8;
            i21 = i21;
            j18 = j24;
        }
        int i26 = i21;
        iArr[i26] = (int) j20;
        iArr2[i26] = (int) j19;
    }

    private static void updateFG30(int i8, int[] iArr, int[] iArr2, int[] iArr3) {
        int i9 = iArr3[0];
        int i10 = iArr3[1];
        int i11 = iArr3[2];
        int i12 = iArr3[3];
        long j8 = i9;
        long j9 = iArr[0];
        long j10 = i10;
        long j11 = iArr2[0];
        long j12 = i11;
        long j13 = i12;
        long j14 = ((j8 * j9) + (j10 * j11)) >> 30;
        long j15 = ((j9 * j12) + (j11 * j13)) >> 30;
        int i13 = 1;
        while (i13 < i8) {
            int i14 = iArr[i13];
            int i15 = iArr2[i13];
            int i16 = i13;
            long j16 = i14;
            long j17 = j8 * j16;
            long j18 = j8;
            long j19 = i15;
            long j20 = j14 + j17 + (j10 * j19);
            long j21 = j15 + (j16 * j12) + (j19 * j13);
            int i17 = i16 - 1;
            iArr[i17] = ((int) j20) & 1073741823;
            j14 = j20 >> 30;
            iArr2[i17] = 1073741823 & ((int) j21);
            j15 = j21 >> 30;
            i13 = i16 + 1;
            j8 = j18;
        }
        int i18 = i8 - 1;
        iArr[i18] = (int) j14;
        iArr2[i18] = (int) j15;
    }
}
