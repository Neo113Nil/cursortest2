package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
abstract class ScalarUtil {
    private static final long M = 4294967295L;

    ScalarUtil() {
    }

    static void addShifted_NP(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i;
        int[] iArr5 = iArr3;
        char c = ' ';
        int i4 = 0;
        long j = 4294967295L;
        long j2 = 0;
        if (i2 == 0) {
            long j3 = 0;
            while (i4 <= i3) {
                long j4 = iArr5[i4] & 4294967295L;
                long j5 = j3 + j4 + (iArr2[i4] & 4294967295L);
                int i5 = (int) j5;
                j3 = j5 >>> 32;
                iArr5[i4] = i5;
                long j6 = j2 + (iArr[i4] & 4294967295L) + j4 + (i5 & 4294967295L);
                iArr[i4] = (int) j6;
                j2 = j6 >>> 32;
                i4++;
            }
            return;
        }
        if (i2 < 32) {
            int i6 = 0;
            long j7 = 0;
            long j8 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i4 <= i3) {
                int i9 = iArr5[i4];
                char c2 = c;
                int i10 = -i2;
                long j9 = j;
                long j10 = j7 + (iArr[i4] & j9) + (((i6 >>> i10) | (i9 << i2)) & j9);
                int i11 = iArr2[i4];
                long j11 = j8 + (i9 & j9) + (((i11 << i2) | (i7 >>> i10)) & j9);
                int i12 = (int) j11;
                j8 = j11 >>> c2;
                iArr5[i4] = i12;
                long j12 = j10 + (((i8 >>> i10) | (i12 << i2)) & j9);
                iArr[i4] = (int) j12;
                j7 = j12 >>> c2;
                i4++;
                i7 = i11;
                i8 = i12;
                i6 = i9;
                c = c2;
                j = j9;
            }
            return;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, i3);
        int i13 = i2 >>> 5;
        int i14 = i2 & 31;
        if (i14 == 0) {
            long j13 = 0;
            for (int i15 = i13; i15 <= i3; i15++) {
                int i16 = i15 - i13;
                long j14 = j13 + (iArr5[i15] & 4294967295L) + (iArr2[i16] & 4294967295L);
                iArr5[i15] = (int) j14;
                j13 = j14 >>> 32;
                long j15 = j2 + (iArr[i15] & 4294967295L) + (iArr4[i16] & 4294967295L) + (iArr5[i16] & 4294967295L);
                iArr[i15] = (int) j15;
                j2 = j15 >>> 32;
            }
            return;
        }
        int i17 = i13;
        int i18 = 0;
        int i19 = 0;
        long j16 = 0;
        while (i17 <= i3) {
            int i20 = i17 - i13;
            int i21 = iArr4[i20];
            int i22 = -i14;
            long j17 = j2 + (iArr[i17] & 4294967295L) + (((i4 >>> i22) | (i21 << i14)) & 4294967295L);
            int i23 = iArr2[i20];
            long j18 = j16 + (iArr5[i17] & 4294967295L) + (((i23 << r21) | (i18 >>> i22)) & 4294967295L);
            iArr3[i17] = (int) j18;
            j16 = j18 >>> 32;
            int i24 = iArr3[i20];
            long j19 = j17 + (((i24 << r21) | (i19 >>> i22)) & 4294967295L);
            iArr[i17] = (int) j19;
            j2 = j19 >>> 32;
            i17++;
            i14 = i14;
            iArr5 = iArr3;
            i19 = i24;
            i18 = i23;
            i4 = i21;
            i3 = i;
        }
    }

    static void addShifted_UV(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i2 >>> 5;
        int i4 = i2 & 31;
        char c = ' ';
        long j = 4294967295L;
        long j2 = 0;
        if (i4 == 0) {
            long j3 = 0;
            for (int i5 = i3; i5 <= i; i5++) {
                int i6 = i5 - i3;
                long j4 = j2 + (iArr[i5] & 4294967295L) + (iArr3[i6] & 4294967295L);
                long j5 = j3 + (iArr2[i5] & 4294967295L) + (iArr4[i6] & 4294967295L);
                iArr[i5] = (int) j4;
                j2 = j4 >>> 32;
                iArr2[i5] = (int) j5;
                j3 = j5 >>> 32;
            }
            return;
        }
        int i7 = i3;
        int i8 = 0;
        int i9 = 0;
        long j6 = 0;
        while (i7 <= i) {
            int i10 = i7 - i3;
            int i11 = iArr3[i10];
            int i12 = iArr4[i10];
            char c2 = c;
            long j7 = j;
            long j8 = j2 + (iArr[i7] & j7);
            long j9 = j8 + (((i8 >>> (-i4)) | (i11 << i4)) & j7);
            long j10 = j6 + (iArr2[i7] & j7) + (((i9 >>> r3) | (i12 << i4)) & j7);
            iArr[i7] = (int) j9;
            j2 = j9 >>> c2;
            iArr2[i7] = (int) j10;
            j6 = j10 >>> c2;
            i7++;
            c = c2;
            i9 = i12;
            i8 = i11;
            j = j7;
        }
    }

    static int getBitLength(int i, int[] iArr) {
        int i2 = iArr[i] >> 31;
        while (i > 0 && iArr[i] == i2) {
            i--;
        }
        return ((i * 32) + 32) - Integers.numberOfLeadingZeros(iArr[i] ^ i2);
    }

    static int getBitLengthPositive(int i, int[] iArr) {
        while (i > 0 && iArr[i] == 0) {
            i--;
        }
        return ((i * 32) + 32) - Integers.numberOfLeadingZeros(iArr[i]);
    }

    static boolean lessThan(int i, int[] iArr, int[] iArr2) {
        do {
            int i2 = iArr[i] - 2147483648;
            int i3 = iArr2[i] - 2147483648;
            if (i2 < i3) {
                return true;
            }
            if (i2 > i3) {
                return false;
            }
            i--;
        } while (i >= 0);
        return false;
    }

    static void subShifted_NP(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i;
        int[] iArr5 = iArr3;
        char c = ' ';
        int i4 = 0;
        long j = 4294967295L;
        long j2 = 0;
        if (i2 == 0) {
            long j3 = 0;
            while (i4 <= i3) {
                long j4 = iArr5[i4] & 4294967295L;
                long j5 = (j3 + j4) - (iArr2[i4] & 4294967295L);
                int i5 = (int) j5;
                j3 = j5 >> 32;
                iArr5[i4] = i5;
                long j6 = ((j2 + (iArr[i4] & 4294967295L)) - j4) - (i5 & 4294967295L);
                iArr[i4] = (int) j6;
                j2 = j6 >> 32;
                i4++;
            }
            return;
        }
        if (i2 < 32) {
            int i6 = 0;
            long j7 = 0;
            long j8 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i4 <= i3) {
                int i9 = iArr5[i4];
                char c2 = c;
                int i10 = -i2;
                long j9 = j;
                long j10 = (j7 + (iArr[i4] & j9)) - (((i6 >>> i10) | (i9 << i2)) & j9);
                int i11 = iArr2[i4];
                long j11 = (j8 + (i9 & j9)) - (((i11 << i2) | (i7 >>> i10)) & j9);
                int i12 = (int) j11;
                j8 = j11 >> c2;
                iArr5[i4] = i12;
                long j12 = j10 - (((i8 >>> i10) | (i12 << i2)) & j9);
                iArr[i4] = (int) j12;
                j7 = j12 >> c2;
                i4++;
                i7 = i11;
                i8 = i12;
                i6 = i9;
                c = c2;
                j = j9;
            }
            return;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, i3);
        int i13 = i2 >>> 5;
        int i14 = i2 & 31;
        if (i14 == 0) {
            long j13 = 0;
            for (int i15 = i13; i15 <= i3; i15++) {
                int i16 = i15 - i13;
                long j14 = (j13 + (iArr5[i15] & 4294967295L)) - (iArr2[i16] & 4294967295L);
                iArr5[i15] = (int) j14;
                j13 = j14 >> 32;
                long j15 = ((j2 + (iArr[i15] & 4294967295L)) - (iArr4[i16] & 4294967295L)) - (iArr5[i16] & 4294967295L);
                iArr[i15] = (int) j15;
                j2 = j15 >> 32;
            }
            return;
        }
        int i17 = i13;
        int i18 = 0;
        int i19 = 0;
        long j16 = 0;
        while (i17 <= i3) {
            int i20 = i17 - i13;
            int i21 = iArr4[i20];
            int i22 = -i14;
            long j17 = (j2 + (iArr[i17] & 4294967295L)) - (((i4 >>> i22) | (i21 << i14)) & 4294967295L);
            int i23 = iArr2[i20];
            long j18 = (j16 + (iArr5[i17] & 4294967295L)) - (((i23 << r21) | (i18 >>> i22)) & 4294967295L);
            iArr3[i17] = (int) j18;
            j16 = j18 >> 32;
            int i24 = iArr3[i20];
            long j19 = j17 - (((i24 << r21) | (i19 >>> i22)) & 4294967295L);
            iArr[i17] = (int) j19;
            j2 = j19 >> 32;
            i17++;
            i14 = i14;
            iArr5 = iArr3;
            i19 = i24;
            i18 = i23;
            i4 = i21;
            i3 = i;
        }
    }

    static void subShifted_UV(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i2 >>> 5;
        int i4 = i2 & 31;
        char c = ' ';
        long j = 4294967295L;
        long j2 = 0;
        if (i4 == 0) {
            long j3 = 0;
            for (int i5 = i3; i5 <= i; i5++) {
                int i6 = i5 - i3;
                long j4 = (j2 + (iArr[i5] & 4294967295L)) - (iArr3[i6] & 4294967295L);
                long j5 = (j3 + (iArr2[i5] & 4294967295L)) - (iArr4[i6] & 4294967295L);
                iArr[i5] = (int) j4;
                j2 = j4 >> 32;
                iArr2[i5] = (int) j5;
                j3 = j5 >> 32;
            }
            return;
        }
        int i7 = i3;
        int i8 = 0;
        int i9 = 0;
        long j6 = 0;
        while (i7 <= i) {
            int i10 = i7 - i3;
            int i11 = iArr3[i10];
            int i12 = iArr4[i10];
            char c2 = c;
            long j7 = j;
            long j8 = j2 + (iArr[i7] & j7);
            long j9 = j8 - (((i8 >>> (-i4)) | (i11 << i4)) & j7);
            long j10 = (j6 + (iArr2[i7] & j7)) - (((i9 >>> r3) | (i12 << i4)) & j7);
            iArr[i7] = (int) j9;
            j2 = j9 >> c2;
            iArr2[i7] = (int) j10;
            j6 = j10 >> c2;
            i7++;
            c = c2;
            i9 = i12;
            i8 = i11;
            j = j7;
        }
    }
}
