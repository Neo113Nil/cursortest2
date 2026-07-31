package Y2;

import java.math.BigInteger;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public abstract class g {
    public static int A(int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = iArr2[0] & 4294967295L;
        long j5 = iArr2[1] & 4294967295L;
        long j6 = iArr2[2] & 4294967295L;
        long j7 = iArr2[3] & 4294967295L;
        long j8 = iArr2[4] & 4294967295L;
        long j9 = iArr2[5] & 4294967295L;
        long j10 = iArr2[6] & 4294967295L;
        long j11 = iArr2[7] & 4294967295L;
        long j12 = 0;
        int i4 = 0;
        while (i4 < 8) {
            long j13 = iArr[i4] & 4294967295L;
            long j14 = (j13 * j4) + (iArr3[i4] & 4294967295L);
            int i5 = i4;
            iArr3[i5] = (int) j14;
            int i6 = i5 + 1;
            long j15 = (j14 >>> 32) + (j13 * j5) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j15;
            long j16 = (j15 >>> 32) + (j13 * j6) + (iArr3[r4] & 4294967295L);
            iArr3[i5 + 2] = (int) j16;
            long j17 = (j16 >>> 32) + (j13 * j7) + (iArr3[r4] & 4294967295L);
            iArr3[i5 + 3] = (int) j17;
            long j18 = (j17 >>> 32) + (j13 * j8) + (iArr3[r4] & 4294967295L);
            iArr3[i5 + 4] = (int) j18;
            long j19 = (j18 >>> 32) + (j13 * j9) + (iArr3[r4] & 4294967295L);
            iArr3[i5 + 5] = (int) j19;
            long j20 = (j19 >>> 32) + (j13 * j10) + (iArr3[r4] & 4294967295L);
            iArr3[i5 + 6] = (int) j20;
            long j21 = (j20 >>> 32) + (j13 * j11) + (iArr3[r4] & 4294967295L);
            iArr3[i5 + 7] = (int) j21;
            long j22 = (j21 >>> 32) + j12 + (iArr3[r4] & 4294967295L);
            iArr3[i5 + 8] = (int) j22;
            j12 = j22 >>> 32;
            i4 = i6;
        }
        return (int) j12;
    }

    public static int B(int i4, int[] iArr, int[] iArr2) {
        long j4 = i4 & 4294967295L;
        long j5 = ((iArr2[0] & 4294967295L) * j4) + (iArr[0] & 4294967295L);
        iArr2[0] = (int) j5;
        long j6 = (j5 >>> 32) + ((iArr2[1] & 4294967295L) * j4) + (iArr[1] & 4294967295L);
        iArr2[1] = (int) j6;
        long j7 = (j6 >>> 32) + ((iArr2[2] & 4294967295L) * j4) + (iArr[2] & 4294967295L);
        iArr2[2] = (int) j7;
        long j8 = (j7 >>> 32) + ((iArr2[3] & 4294967295L) * j4) + (iArr[3] & 4294967295L);
        iArr2[3] = (int) j8;
        long j9 = (j8 >>> 32) + ((iArr2[4] & 4294967295L) * j4) + (iArr[4] & 4294967295L);
        iArr2[4] = (int) j9;
        long j10 = (j9 >>> 32) + ((iArr2[5] & 4294967295L) * j4) + (iArr[5] & 4294967295L);
        iArr2[5] = (int) j10;
        long j11 = (j10 >>> 32) + ((iArr2[6] & 4294967295L) * j4) + (iArr[6] & 4294967295L);
        iArr2[6] = (int) j11;
        long j12 = (j11 >>> 32) + (j4 * (iArr2[7] & 4294967295L)) + (4294967295L & iArr[7]);
        iArr2[7] = (int) j12;
        return (int) (j12 >>> 32);
    }

    public static void C(int[] iArr, int i4, int[] iArr2, int i5) {
        long j4 = iArr[i4] & 4294967295L;
        int i6 = 0;
        int i7 = 16;
        int i8 = 7;
        while (true) {
            int i9 = i8 - 1;
            long j5 = iArr[i4 + i8] & 4294967295L;
            long j6 = j5 * j5;
            iArr2[i5 + (i7 - 1)] = (i6 << 31) | ((int) (j6 >>> 33));
            i7 -= 2;
            iArr2[i5 + i7] = (int) (j6 >>> 1);
            i6 = (int) j6;
            if (i9 <= 0) {
                long j7 = j4 * j4;
                long j8 = (j7 >>> 33) | ((i6 << 31) & 4294967295L);
                iArr2[i5] = (int) j7;
                int i10 = ((int) (j7 >>> 32)) & 1;
                long j9 = iArr[i4 + 1] & 4294967295L;
                long j10 = j8 + (j9 * j4);
                int i11 = (int) j10;
                iArr2[i5 + 1] = (i11 << 1) | i10;
                int i12 = i11 >>> 31;
                long j11 = (iArr2[r12] & 4294967295L) + (j10 >>> 32);
                long j12 = iArr[i4 + 2] & 4294967295L;
                long j13 = j11 + (j12 * j4);
                int i13 = (int) j13;
                iArr2[i5 + 2] = (i13 << 1) | i12;
                long j14 = (iArr2[r15] & 4294967295L) + (j13 >>> 32) + (j12 * j9);
                long j15 = (iArr2[r18] & 4294967295L) + (j14 >>> 32);
                long j16 = iArr[i4 + 3] & 4294967295L;
                long j17 = (iArr2[r14] & 4294967295L) + (j15 >>> 32);
                long j18 = (iArr2[r7] & 4294967295L) + (j17 >>> 32);
                long j19 = j17 & 4294967295L;
                long j20 = (j14 & 4294967295L) + (j16 * j4);
                int i14 = (int) j20;
                iArr2[i5 + 3] = (i14 << 1) | (i13 >>> 31);
                int i15 = i14 >>> 31;
                long j21 = (j15 & 4294967295L) + (j20 >>> 32) + (j16 * j9);
                long j22 = j19 + (j21 >>> 32) + (j16 * j12);
                long j23 = j18 + (j22 >>> 32);
                long j24 = iArr[i4 + 4] & 4294967295L;
                long j25 = (iArr2[r2] & 4294967295L) + (j23 >>> 32);
                long j26 = (iArr2[r15] & 4294967295L) + (j25 >>> 32);
                long j27 = j25 & 4294967295L;
                long j28 = (j21 & 4294967295L) + (j24 * j4);
                int i16 = (int) j28;
                iArr2[i5 + 4] = (i16 << 1) | i15;
                int i17 = i16 >>> 31;
                long j29 = (j22 & 4294967295L) + (j28 >>> 32) + (j24 * j9);
                long j30 = (j23 & 4294967295L) + (j29 >>> 32) + (j24 * j12);
                long j31 = j29 & 4294967295L;
                long j32 = j27 + (j30 >>> 32) + (j24 * j16);
                long j33 = j26 + (j32 >>> 32);
                long j34 = iArr[i4 + 5] & 4294967295L;
                long j35 = (iArr2[r18] & 4294967295L) + (j33 >>> 32);
                long j36 = (iArr2[r24] & 4294967295L) + (j35 >>> 32);
                long j37 = j35 & 4294967295L;
                long j38 = j31 + (j34 * j4);
                int i18 = (int) j38;
                iArr2[i5 + 5] = (i18 << 1) | i17;
                int i19 = i18 >>> 31;
                long j39 = (j30 & 4294967295L) + (j38 >>> 32) + (j34 * j9);
                long j40 = (j32 & 4294967295L) + (j39 >>> 32) + (j34 * j12);
                long j41 = j39 & 4294967295L;
                long j42 = (j33 & 4294967295L) + (j40 >>> 32) + (j34 * j16);
                long j43 = j40 & 4294967295L;
                long j44 = j37 + (j42 >>> 32) + (j34 * j24);
                long j45 = j36 + (j44 >>> 32);
                long j46 = iArr[i4 + 6] & 4294967295L;
                long j47 = (iArr2[r14] & 4294967295L) + (j45 >>> 32);
                long j48 = (iArr2[r26] & 4294967295L) + (j47 >>> 32);
                long j49 = j47 & 4294967295L;
                long j50 = j41 + (j46 * j4);
                int i20 = (int) j50;
                iArr2[i5 + 6] = (i20 << 1) | i19;
                int i21 = i20 >>> 31;
                long j51 = j43 + (j50 >>> 32) + (j46 * j9);
                long j52 = (j42 & 4294967295L) + (j51 >>> 32) + (j46 * j12);
                long j53 = j51 & 4294967295L;
                long j54 = (j44 & 4294967295L) + (j52 >>> 32) + (j46 * j16);
                long j55 = j52 & 4294967295L;
                long j56 = (j45 & 4294967295L) + (j54 >>> 32) + (j46 * j24);
                long j57 = j54 & 4294967295L;
                long j58 = j49 + (j56 >>> 32) + (j46 * j34);
                long j59 = j48 + (j58 >>> 32);
                long j60 = iArr[i4 + 7] & 4294967295L;
                long j61 = (iArr2[r7] & 4294967295L) + (j59 >>> 32);
                long j62 = (iArr2[r20] & 4294967295L) + (j61 >>> 32);
                long j63 = j61 & 4294967295L;
                long j64 = j53 + (j4 * j60);
                int i22 = (int) j64;
                iArr2[i5 + 7] = (i22 << 1) | i21;
                long j65 = j55 + (j64 >>> 32) + (j9 * j60);
                long j66 = j57 + (j65 >>> 32) + (j60 * j12);
                long j67 = (j56 & 4294967295L) + (j66 >>> 32) + (j60 * j16);
                long j68 = (j58 & 4294967295L) + (j67 >>> 32) + (j60 * j24);
                long j69 = (j59 & 4294967295L) + (j68 >>> 32) + (j60 * j34);
                long j70 = j63 + (j69 >>> 32) + (j60 * j46);
                long j71 = j62 + (j70 >>> 32);
                int i23 = (int) j65;
                iArr2[i5 + 8] = (i22 >>> 31) | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j66;
                iArr2[i5 + 9] = i24 | (i25 << 1);
                int i26 = (int) j67;
                iArr2[i5 + 10] = (i26 << 1) | (i25 >>> 31);
                int i27 = (int) j68;
                iArr2[i5 + 11] = (i26 >>> 31) | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j69;
                iArr2[i5 + 12] = i28 | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j70;
                iArr2[i5 + 13] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) j71;
                iArr2[i5 + 14] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = i5 + 15;
                iArr2[i35] = i34 | ((iArr2[i35] + ((int) (j71 >>> 32))) << 1);
                return;
            }
            i8 = i9;
        }
    }

    public static void D(int[] iArr, int[] iArr2) {
        long j4 = iArr[0] & 4294967295L;
        int i4 = 16;
        int i5 = 0;
        int i6 = 7;
        while (true) {
            int i7 = i6 - 1;
            long j5 = iArr[i6] & 4294967295L;
            long j6 = j5 * j5;
            iArr2[i4 - 1] = (i5 << 31) | ((int) (j6 >>> 33));
            i4 -= 2;
            iArr2[i4] = (int) (j6 >>> 1);
            i5 = (int) j6;
            if (i7 <= 0) {
                long j7 = j4 * j4;
                long j8 = (j7 >>> 33) | ((i5 << 31) & 4294967295L);
                iArr2[0] = (int) j7;
                long j9 = iArr[1] & 4294967295L;
                long j10 = j8 + (j9 * j4);
                int i8 = (int) j10;
                iArr2[1] = (i8 << 1) | (((int) (j7 >>> 32)) & 1);
                long j11 = (iArr2[2] & 4294967295L) + (j10 >>> 32);
                long j12 = iArr[2] & 4294967295L;
                long j13 = j11 + (j12 * j4);
                int i9 = (int) j13;
                iArr2[2] = (i9 << 1) | (i8 >>> 31);
                long j14 = (iArr2[3] & 4294967295L) + (j13 >>> 32) + (j12 * j9);
                long j15 = (iArr2[4] & 4294967295L) + (j14 >>> 32);
                long j16 = iArr[3] & 4294967295L;
                long j17 = (iArr2[5] & 4294967295L) + (j15 >>> 32);
                long j18 = (iArr2[6] & 4294967295L) + (j17 >>> 32);
                long j19 = (j14 & 4294967295L) + (j16 * j4);
                int i10 = (int) j19;
                iArr2[3] = (i10 << 1) | (i9 >>> 31);
                int i11 = i10 >>> 31;
                long j20 = (j15 & 4294967295L) + (j19 >>> 32) + (j16 * j9);
                long j21 = (j17 & 4294967295L) + (j20 >>> 32) + (j16 * j12);
                long j22 = j20 & 4294967295L;
                long j23 = j18 + (j21 >>> 32);
                long j24 = j21 & 4294967295L;
                long j25 = iArr[4] & 4294967295L;
                long j26 = (iArr2[7] & 4294967295L) + (j23 >>> 32);
                long j27 = (iArr2[8] & 4294967295L) + (j26 >>> 32);
                long j28 = j22 + (j25 * j4);
                int i12 = (int) j28;
                iArr2[4] = (i12 << 1) | i11;
                int i13 = i12 >>> 31;
                long j29 = j24 + (j28 >>> 32) + (j25 * j9);
                long j30 = (j23 & 4294967295L) + (j29 >>> 32) + (j25 * j12);
                long j31 = j29 & 4294967295L;
                long j32 = (j26 & 4294967295L) + (j30 >>> 32) + (j25 * j16);
                long j33 = j30 & 4294967295L;
                long j34 = j27 + (j32 >>> 32);
                long j35 = j32 & 4294967295L;
                long j36 = iArr[5] & 4294967295L;
                long j37 = (iArr2[9] & 4294967295L) + (j34 >>> 32);
                long j38 = j34 & 4294967295L;
                long j39 = j31 + (j36 * j4);
                int i14 = (int) j39;
                iArr2[5] = (i14 << 1) | i13;
                int i15 = i14 >>> 31;
                long j40 = j33 + (j39 >>> 32) + (j36 * j9);
                long j41 = j35 + (j40 >>> 32) + (j36 * j12);
                long j42 = j40 & 4294967295L;
                long j43 = j38 + (j41 >>> 32) + (j36 * j16);
                long j44 = j41 & 4294967295L;
                long j45 = (j37 & 4294967295L) + (j43 >>> 32) + (j36 * j25);
                long j46 = j43 & 4294967295L;
                long j47 = (iArr2[10] & 4294967295L) + (j37 >>> 32) + (j45 >>> 32);
                long j48 = j45 & 4294967295L;
                long j49 = iArr[6] & 4294967295L;
                long j50 = (iArr2[11] & 4294967295L) + (j47 >>> 32);
                long j51 = j47 & 4294967295L;
                long j52 = j42 + (j49 * j4);
                int i16 = (int) j52;
                iArr2[6] = (i16 << 1) | i15;
                int i17 = i16 >>> 31;
                long j53 = j44 + (j52 >>> 32) + (j49 * j9);
                long j54 = j46 + (j53 >>> 32) + (j49 * j12);
                long j55 = j53 & 4294967295L;
                long j56 = j48 + (j54 >>> 32) + (j49 * j16);
                long j57 = j54 & 4294967295L;
                long j58 = j51 + (j56 >>> 32) + (j49 * j25);
                long j59 = j56 & 4294967295L;
                long j60 = (j50 & 4294967295L) + (j58 >>> 32) + (j49 * j36);
                long j61 = j58 & 4294967295L;
                long j62 = (iArr2[12] & 4294967295L) + (j50 >>> 32) + (j60 >>> 32);
                long j63 = j60 & 4294967295L;
                long j64 = iArr[7] & 4294967295L;
                long j65 = (iArr2[13] & 4294967295L) + (j62 >>> 32);
                long j66 = j62 & 4294967295L;
                long j67 = j55 + (j4 * j64);
                int i18 = (int) j67;
                iArr2[7] = (i18 << 1) | i17;
                int i19 = i18 >>> 31;
                long j68 = j57 + (j67 >>> 32) + (j64 * j9);
                long j69 = j59 + (j68 >>> 32) + (j64 * j12);
                long j70 = j61 + (j69 >>> 32) + (j64 * j16);
                long j71 = j63 + (j70 >>> 32) + (j64 * j25);
                long j72 = j66 + (j71 >>> 32) + (j36 * j64);
                long j73 = (j65 & 4294967295L) + (j72 >>> 32) + (j64 * j49);
                long j74 = (iArr2[14] & 4294967295L) + (j65 >>> 32) + (j73 >>> 32);
                int i20 = (int) j68;
                iArr2[8] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j69;
                iArr2[9] = i21 | (i22 << 1);
                int i23 = (int) j70;
                iArr2[10] = (i22 >>> 31) | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j71;
                iArr2[11] = i24 | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) j72;
                iArr2[12] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j73;
                iArr2[13] = i28 | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j74;
                iArr2[14] = i30 | (i31 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j74 >>> 32))) << 1) | (i31 >>> 31);
                return;
            }
            i6 = i7;
        }
    }

    public static int E(int[] iArr, int i4, int[] iArr2, int i5, int[] iArr3, int i6) {
        long j4 = (iArr[i4] & 4294967295L) - (iArr2[i5] & 4294967295L);
        iArr3[i6] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr[i4 + 1] & 4294967295L) - (iArr2[i5 + 1] & 4294967295L));
        iArr3[i6 + 1] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr[i4 + 2] & 4294967295L) - (iArr2[i5 + 2] & 4294967295L));
        iArr3[i6 + 2] = (int) j6;
        long j7 = (j6 >> 32) + ((iArr[i4 + 3] & 4294967295L) - (iArr2[i5 + 3] & 4294967295L));
        iArr3[i6 + 3] = (int) j7;
        long j8 = (j7 >> 32) + ((iArr[i4 + 4] & 4294967295L) - (iArr2[i5 + 4] & 4294967295L));
        iArr3[i6 + 4] = (int) j8;
        long j9 = (j8 >> 32) + ((iArr[i4 + 5] & 4294967295L) - (iArr2[i5 + 5] & 4294967295L));
        iArr3[i6 + 5] = (int) j9;
        long j10 = (j9 >> 32) + ((iArr[i4 + 6] & 4294967295L) - (iArr2[i5 + 6] & 4294967295L));
        iArr3[i6 + 6] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr[i4 + 7] & 4294967295L) - (iArr2[i5 + 7] & 4294967295L));
        iArr3[i6 + 7] = (int) j11;
        return (int) (j11 >> 32);
    }

    public static int F(int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L));
        iArr3[1] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L));
        iArr3[2] = (int) j6;
        long j7 = (j6 >> 32) + ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L));
        iArr3[3] = (int) j7;
        long j8 = (j7 >> 32) + ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L));
        iArr3[4] = (int) j8;
        long j9 = (j8 >> 32) + ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L));
        iArr3[5] = (int) j9;
        long j10 = (j9 >> 32) + ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L));
        iArr3[6] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr[7] & 4294967295L) - (iArr2[7] & 4294967295L));
        iArr3[7] = (int) j11;
        return (int) (j11 >> 32);
    }

    public static int G(int[] iArr, int[] iArr2) {
        long j4 = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L));
        iArr2[1] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L));
        iArr2[2] = (int) j6;
        long j7 = (j6 >> 32) + ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L));
        iArr2[3] = (int) j7;
        long j8 = (j7 >> 32) + ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L));
        iArr2[4] = (int) j8;
        long j9 = (j8 >> 32) + ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L));
        iArr2[5] = (int) j9;
        long j10 = (j9 >> 32) + ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L));
        iArr2[6] = (int) j10;
        long j11 = (j10 >> 32) + ((iArr2[7] & 4294967295L) - (4294967295L & iArr[7]));
        iArr2[7] = (int) j11;
        return (int) (j11 >> 32);
    }

    public static BigInteger H(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = iArr[i4];
            if (i5 != 0) {
                Z2.d.a(i5, bArr, (7 - i4) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger I(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i4 = 0; i4 < 4; i4++) {
            long j4 = jArr[i4];
            if (j4 != 0) {
                Z2.d.b(j4, bArr, (3 - i4) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void J(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr3[1] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr3[2] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr3[3] = (int) j7;
        long j8 = (j7 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L);
        iArr3[4] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L);
        iArr3[5] = (int) j9;
        long j10 = (j9 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L);
        iArr3[6] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L);
        iArr3[7] = (int) j11;
        return (int) (j11 >>> 32);
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L);
        iArr3[1] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L);
        iArr3[2] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L);
        iArr3[3] = (int) j7;
        long j8 = (j7 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L);
        iArr3[4] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L);
        iArr3[5] = (int) j9;
        long j10 = (j9 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L);
        iArr3[6] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (iArr3[7] & 4294967295L);
        iArr3[7] = (int) j11;
        return (int) (j11 >>> 32);
    }

    public static int c(int[] iArr, int i4, int[] iArr2, int i5, int i6) {
        long j4 = (i6 & 4294967295L) + (iArr[i4] & 4294967295L) + (iArr2[i5] & 4294967295L);
        iArr2[i5] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[i4 + 1] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i5 + 1] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[i4 + 2] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i5 + 2] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[i4 + 3] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i5 + 3] = (int) j7;
        long j8 = (j7 >>> 32) + (iArr[i4 + 4] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i5 + 4] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[i4 + 5] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i5 + 5] = (int) j9;
        long j10 = (j9 >>> 32) + (iArr[i4 + 6] & 4294967295L) + (iArr2[r6] & 4294967295L);
        iArr2[i5 + 6] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[i4 + 7] & 4294967295L) + (4294967295L & iArr2[r12]);
        iArr2[i5 + 7] = (int) j11;
        return (int) (j11 >>> 32);
    }

    public static int d(int[] iArr, int[] iArr2) {
        long j4 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr2[0] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr2[1] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr2[2] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr2[3] = (int) j7;
        long j8 = (j7 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L);
        iArr2[4] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L);
        iArr2[5] = (int) j9;
        long j10 = (j9 >>> 32) + (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L);
        iArr2[6] = (int) j10;
        long j11 = (j10 >>> 32) + (iArr[7] & 4294967295L) + (4294967295L & iArr2[7]);
        iArr2[7] = (int) j11;
        return (int) (j11 >>> 32);
    }

    public static int e(int[] iArr, int i4, int[] iArr2, int i5) {
        long j4 = (iArr[i4] & 4294967295L) + (iArr2[i5] & 4294967295L);
        int i6 = (int) j4;
        iArr[i4] = i6;
        iArr2[i5] = i6;
        long j5 = (j4 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i7 = (int) j5;
        iArr[i4 + 1] = i7;
        iArr2[i5 + 1] = i7;
        long j6 = (j5 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i8 = (int) j6;
        iArr[i4 + 2] = i8;
        iArr2[i5 + 2] = i8;
        long j7 = (j6 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i9 = (int) j7;
        iArr[i4 + 3] = i9;
        iArr2[i5 + 3] = i9;
        long j8 = (j7 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i10 = (int) j8;
        iArr[i4 + 4] = i10;
        iArr2[i5 + 4] = i10;
        long j9 = (j8 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i11 = (int) j9;
        iArr[i4 + 5] = i11;
        iArr2[i5 + 5] = i11;
        long j10 = (j9 >>> 32) + (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L);
        int i12 = (int) j10;
        iArr[i4 + 6] = i12;
        iArr2[i5 + 6] = i12;
        long j11 = (j10 >>> 32) + (iArr[r12] & 4294967295L) + (4294967295L & iArr2[r14]);
        int i13 = (int) j11;
        iArr[i4 + 7] = i13;
        iArr2[i5 + 7] = i13;
        return (int) (j11 >>> 32);
    }

    public static int[] f() {
        return new int[8];
    }

    public static long[] g() {
        return new long[4];
    }

    public static int[] h() {
        return new int[16];
    }

    public static long[] i() {
        return new long[8];
    }

    public static boolean j(int[] iArr, int i4, int[] iArr2, int i5, int[] iArr3, int i6) {
        boolean p4 = p(iArr, i4, iArr2, i5);
        if (p4) {
            E(iArr, i4, iArr2, i5, iArr3, i6);
            return p4;
        }
        E(iArr2, i5, iArr, i4, iArr3, i6);
        return p4;
    }

    public static boolean k(int[] iArr, int[] iArr2) {
        for (int i4 = 7; i4 >= 0; i4--) {
            if (iArr[i4] != iArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(long[] jArr, long[] jArr2) {
        for (int i4 = 3; i4 >= 0; i4--) {
            if (jArr[i4] != jArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    public static int[] m(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] f4 = f();
        int i4 = 0;
        while (bigInteger.signum() != 0) {
            f4[i4] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i4++;
        }
        return f4;
    }

    public static long[] n(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] g4 = g();
        int i4 = 0;
        while (bigInteger.signum() != 0) {
            g4[i4] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i4++;
        }
        return g4;
    }

    public static int o(int[] iArr, int i4) {
        int i5;
        if (i4 == 0) {
            i5 = iArr[0];
        } else {
            if ((i4 & KotlinVersion.MAX_COMPONENT_VALUE) != i4) {
                return 0;
            }
            i5 = iArr[i4 >>> 5] >>> (i4 & 31);
        }
        return i5 & 1;
    }

    public static boolean p(int[] iArr, int i4, int[] iArr2, int i5) {
        for (int i6 = 7; i6 >= 0; i6--) {
            int i7 = iArr[i4 + i6] ^ Integer.MIN_VALUE;
            int i8 = Integer.MIN_VALUE ^ iArr2[i5 + i6];
            if (i7 < i8) {
                return false;
            }
            if (i7 > i8) {
                return true;
            }
        }
        return true;
    }

    public static boolean q(int[] iArr, int[] iArr2) {
        for (int i4 = 7; i4 >= 0; i4--) {
            int i5 = iArr[i4] ^ Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE ^ iArr2[i4];
            if (i5 < i6) {
                return false;
            }
            if (i5 > i6) {
                return true;
            }
        }
        return true;
    }

    public static boolean r(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i4 = 1; i4 < 8; i4++) {
            if (iArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean s(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i4 = 1; i4 < 4; i4++) {
            if (jArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean t(int[] iArr) {
        for (int i4 = 0; i4 < 8; i4++) {
            if (iArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean u(long[] jArr) {
        for (int i4 = 0; i4 < 4; i4++) {
            if (jArr[i4] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void v(int[] iArr, int i4, int[] iArr2, int i5, int[] iArr3, int i6) {
        long j4 = iArr2[i5] & 4294967295L;
        long j5 = iArr2[i5 + 1] & 4294967295L;
        long j6 = iArr2[i5 + 2] & 4294967295L;
        long j7 = iArr2[i5 + 3] & 4294967295L;
        long j8 = iArr2[i5 + 4] & 4294967295L;
        long j9 = iArr2[i5 + 5] & 4294967295L;
        long j10 = iArr2[i5 + 6] & 4294967295L;
        long j11 = iArr2[i5 + 7] & 4294967295L;
        long j12 = iArr[i4] & 4294967295L;
        long j13 = j12 * j4;
        iArr3[i6] = (int) j13;
        long j14 = (j13 >>> 32) + (j12 * j5);
        iArr3[i6 + 1] = (int) j14;
        long j15 = (j14 >>> 32) + (j12 * j6);
        iArr3[i6 + 2] = (int) j15;
        long j16 = (j15 >>> 32) + (j12 * j7);
        iArr3[i6 + 3] = (int) j16;
        long j17 = (j16 >>> 32) + (j12 * j8);
        iArr3[i6 + 4] = (int) j17;
        long j18 = (j17 >>> 32) + (j12 * j9);
        iArr3[i6 + 5] = (int) j18;
        long j19 = (j18 >>> 32) + (j12 * j10);
        iArr3[i6 + 6] = (int) j19;
        long j20 = (j19 >>> 32) + (j12 * j11);
        iArr3[i6 + 7] = (int) j20;
        iArr3[i6 + 8] = (int) (j20 >>> 32);
        int i7 = 1;
        int i8 = i6;
        while (i7 < 8) {
            int i9 = i8 + 1;
            int i10 = i8;
            long j21 = iArr[i4 + i7] & 4294967295L;
            long j22 = (j21 * j4) + (iArr3[i9] & 4294967295L);
            iArr3[i9] = (int) j22;
            long j23 = (j22 >>> 32) + (j21 * j5) + (iArr3[r3] & 4294967295L);
            iArr3[i10 + 2] = (int) j23;
            long j24 = (j23 >>> 32) + (j21 * j6) + (iArr3[r24] & 4294967295L);
            iArr3[i10 + 3] = (int) j24;
            long j25 = (j24 >>> 32) + (j21 * j7) + (iArr3[r24] & 4294967295L);
            iArr3[i10 + 4] = (int) j25;
            long j26 = (j25 >>> 32) + (j21 * j8) + (iArr3[r24] & 4294967295L);
            iArr3[i10 + 5] = (int) j26;
            long j27 = (j26 >>> 32) + (j21 * j9) + (iArr3[r24] & 4294967295L);
            iArr3[i10 + 6] = (int) j27;
            long j28 = (j27 >>> 32) + (j21 * j10) + (iArr3[r24] & 4294967295L);
            iArr3[i10 + 7] = (int) j28;
            long j29 = (j28 >>> 32) + (j21 * j11) + (iArr3[r24] & 4294967295L);
            iArr3[i10 + 8] = (int) j29;
            iArr3[i10 + 9] = (int) (j29 >>> 32);
            i7++;
            i8 = i9;
        }
    }

    public static void w(int[] iArr, int[] iArr2, int[] iArr3) {
        long j4 = iArr2[0] & 4294967295L;
        long j5 = iArr2[1] & 4294967295L;
        long j6 = iArr2[2] & 4294967295L;
        long j7 = iArr2[3] & 4294967295L;
        long j8 = iArr2[4] & 4294967295L;
        long j9 = iArr2[5] & 4294967295L;
        long j10 = iArr2[6] & 4294967295L;
        long j11 = iArr2[7] & 4294967295L;
        long j12 = iArr[0] & 4294967295L;
        long j13 = j12 * j4;
        iArr3[0] = (int) j13;
        long j14 = (j13 >>> 32) + (j12 * j5);
        iArr3[1] = (int) j14;
        long j15 = (j14 >>> 32) + (j12 * j6);
        iArr3[2] = (int) j15;
        long j16 = (j15 >>> 32) + (j12 * j7);
        iArr3[3] = (int) j16;
        long j17 = (j16 >>> 32) + (j12 * j8);
        iArr3[4] = (int) j17;
        long j18 = (j17 >>> 32) + (j12 * j9);
        iArr3[5] = (int) j18;
        long j19 = (j18 >>> 32) + (j12 * j10);
        iArr3[6] = (int) j19;
        long j20 = (j19 >>> 32) + (j12 * j11);
        iArr3[7] = (int) j20;
        iArr3[8] = (int) (j20 >>> 32);
        int i4 = 1;
        for (int i5 = 8; i4 < i5; i5 = 8) {
            long j21 = iArr[i4] & 4294967295L;
            long j22 = j8;
            long j23 = (j21 * j4) + (iArr3[i4] & 4294967295L);
            iArr3[i4] = (int) j23;
            int i6 = i4 + 1;
            long j24 = (j23 >>> 32) + (j21 * j5) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j24;
            long j25 = (j24 >>> 32) + (j21 * j6) + (iArr3[r25] & 4294967295L);
            iArr3[i4 + 2] = (int) j25;
            long j26 = (j25 >>> 32) + (j21 * j7) + (iArr3[r25] & 4294967295L);
            iArr3[i4 + 3] = (int) j26;
            long j27 = (j26 >>> 32) + (j21 * j22) + (iArr3[r25] & 4294967295L);
            iArr3[i4 + 4] = (int) j27;
            long j28 = (j27 >>> 32) + (j21 * j9) + (iArr3[r25] & 4294967295L);
            iArr3[i4 + 5] = (int) j28;
            long j29 = (j28 >>> 32) + (j21 * j10) + (iArr3[r25] & 4294967295L);
            iArr3[i4 + 6] = (int) j29;
            long j30 = (j29 >>> 32) + (j21 * j11) + (iArr3[r14] & 4294967295L);
            iArr3[i4 + 7] = (int) j30;
            iArr3[i4 + 8] = (int) (j30 >>> 32);
            i4 = i6;
            j8 = j22;
        }
    }

    public static long x(int i4, int[] iArr, int i5, int[] iArr2, int i6, int[] iArr3, int i7) {
        long j4 = i4 & 4294967295L;
        long j5 = iArr[i5] & 4294967295L;
        long j6 = (j4 * j5) + (iArr2[i6] & 4294967295L);
        iArr3[i7] = (int) j6;
        long j7 = iArr[i5 + 1] & 4294967295L;
        long j8 = (j6 >>> 32) + (j4 * j7) + j5 + (iArr2[i6 + 1] & 4294967295L);
        iArr3[i7 + 1] = (int) j8;
        long j9 = j8 >>> 32;
        long j10 = iArr[i5 + 2] & 4294967295L;
        long j11 = j9 + (j4 * j10) + j7 + (iArr2[i6 + 2] & 4294967295L);
        iArr3[i7 + 2] = (int) j11;
        long j12 = iArr[i5 + 3] & 4294967295L;
        long j13 = (j11 >>> 32) + (j4 * j12) + j10 + (iArr2[i6 + 3] & 4294967295L);
        iArr3[i7 + 3] = (int) j13;
        long j14 = iArr[i5 + 4] & 4294967295L;
        long j15 = (j13 >>> 32) + (j4 * j14) + j12 + (iArr2[i6 + 4] & 4294967295L);
        iArr3[i7 + 4] = (int) j15;
        long j16 = iArr[i5 + 5] & 4294967295L;
        long j17 = (j15 >>> 32) + (j4 * j16) + j14 + (iArr2[i6 + 5] & 4294967295L);
        iArr3[i7 + 5] = (int) j17;
        long j18 = iArr[i5 + 6] & 4294967295L;
        long j19 = (j17 >>> 32) + (j4 * j18) + j16 + (iArr2[i6 + 6] & 4294967295L);
        iArr3[i7 + 6] = (int) j19;
        long j20 = iArr[i5 + 7] & 4294967295L;
        long j21 = (j19 >>> 32) + (j4 * j20) + j18 + (4294967295L & iArr2[i6 + 7]);
        iArr3[i7 + 7] = (int) j21;
        return (j21 >>> 32) + j20;
    }

    public static int y(int i4, long j4, int[] iArr, int i5) {
        long j5 = i4 & 4294967295L;
        long j6 = j4 & 4294967295L;
        long j7 = (j5 * j6) + (iArr[i5] & 4294967295L);
        iArr[i5] = (int) j7;
        long j8 = j4 >>> 32;
        long j9 = (j5 * j8) + j6;
        long j10 = (j7 >>> 32) + j9 + (iArr[r4] & 4294967295L);
        iArr[i5 + 1] = (int) j10;
        long j11 = (j10 >>> 32) + j8 + (iArr[r4] & 4294967295L);
        iArr[i5 + 2] = (int) j11;
        long j12 = j11 >>> 32;
        long j13 = j12 + (iArr[r0] & 4294967295L);
        iArr[i5 + 3] = (int) j13;
        if ((j13 >>> 32) == 0) {
            return 0;
        }
        return m.t(8, iArr, i5, 4);
    }

    public static int z(int i4, int i5, int[] iArr, int i6) {
        long j4 = i4 & 4294967295L;
        long j5 = i5 & 4294967295L;
        long j6 = (j4 * j5) + (iArr[i6] & 4294967295L);
        iArr[i6] = (int) j6;
        long j7 = (j6 >>> 32) + j5 + (iArr[r5] & 4294967295L);
        iArr[i6 + 1] = (int) j7;
        long j8 = j7 >>> 32;
        long j9 = j8 + (iArr[r0] & 4294967295L);
        iArr[i6 + 2] = (int) j9;
        if ((j9 >>> 32) == 0) {
            return 0;
        }
        return m.t(8, iArr, i6, 3);
    }
}
