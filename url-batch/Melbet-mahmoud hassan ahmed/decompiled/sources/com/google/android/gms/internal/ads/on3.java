package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class on3 {
    static byte[] a(byte[] bArr, byte[] bArr2) {
        long b7 = b(bArr, 0, 0);
        long b8 = b(bArr, 3, 2) & 67108611;
        long b9 = b(bArr, 6, 4) & 67092735;
        long b10 = b(bArr, 9, 6) & 66076671;
        long b11 = b(bArr, 12, 8) & 1048575;
        long j7 = b8 * 5;
        long j8 = b9 * 5;
        long j9 = b10 * 5;
        long j10 = b11 * 5;
        int i7 = 17;
        byte[] bArr3 = new byte[17];
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        int i8 = 0;
        while (true) {
            int length = bArr2.length;
            if (i8 >= length) {
                long j16 = j11 + (j12 >> 26);
                long j17 = j16 & 67108863;
                long j18 = j13 + (j16 >> 26);
                long j19 = j18 & 67108863;
                long j20 = j14 + (j18 >> 26);
                long j21 = j20 & 67108863;
                long j22 = j15 + ((j20 >> 26) * 5);
                long j23 = j22 & 67108863;
                long j24 = (j12 & 67108863) + (j22 >> 26);
                long j25 = j23 + 5;
                long j26 = (j25 >> 26) + j24;
                long j27 = j17 + (j26 >> 26);
                long j28 = j19 + (j27 >> 26);
                long j29 = (j21 + (j28 >> 26)) - 67108864;
                long j30 = j29 >> 63;
                long j31 = j30 ^ (-1);
                long j32 = (j24 & j30) | (j26 & 67108863 & j31);
                long j33 = (j17 & j30) | (j27 & 67108863 & j31);
                long j34 = (j19 & j30) | (j28 & 67108863 & j31);
                long c7 = (((j23 & j30) | (j25 & 67108863 & j31) | (j32 << 26)) & 4294967295L) + c(bArr, 16);
                long c8 = (((j32 >> 6) | (j33 << 20)) & 4294967295L) + c(bArr, 20) + (c7 >> 32);
                long c9 = (((j33 >> 12) | (j34 << 14)) & 4294967295L) + c(bArr, 24) + (c8 >> 32);
                long c10 = c(bArr, 28);
                byte[] bArr4 = new byte[16];
                d(bArr4, c7 & 4294967295L, 0);
                d(bArr4, c8 & 4294967295L, 4);
                d(bArr4, c9 & 4294967295L, 8);
                d(bArr4, ((((j34 >> 18) | (((j21 & j30) | (j29 & j31)) << 8)) & 4294967295L) + c10 + (c9 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i8);
            System.arraycopy(bArr2, i8, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i7, (byte) 0);
            }
            long b12 = j15 + b(bArr3, 0, 0);
            long b13 = j12 + b(bArr3, 3, 2);
            long b14 = j11 + b(bArr3, 6, 4);
            long b15 = j13 + b(bArr3, 9, 6);
            long b16 = j14 + (b(bArr3, 12, 8) | (bArr3[16] << 24));
            long j35 = (b12 * b7) + (b13 * j10) + (b14 * j9) + (b15 * j8) + (b16 * j7);
            long j36 = (b12 * b8) + (b13 * b7) + (b14 * j10) + (b15 * j9) + (b16 * j8) + (j35 >> 26);
            long j37 = (b12 * b9) + (b13 * b8) + (b14 * b7) + (b15 * j10) + (b16 * j9) + (j36 >> 26);
            long j38 = (b12 * b10) + (b13 * b9) + (b14 * b8) + (b15 * b7) + (b16 * j10) + (j37 >> 26);
            long j39 = (b12 * b11) + (b13 * b10) + (b14 * b9) + (b15 * b8) + (b16 * b7) + (j38 >> 26);
            j14 = j39 & 67108863;
            long j40 = (j35 & 67108863) + ((j39 >> 26) * 5);
            j15 = j40 & 67108863;
            j12 = (j36 & 67108863) + (j40 >> 26);
            i8 += 16;
            j13 = j38 & 67108863;
            j11 = j37 & 67108863;
            i7 = 17;
        }
    }

    private static long b(byte[] bArr, int i7, int i8) {
        return (c(bArr, i7) >> i8) & 67108863;
    }

    private static long c(byte[] bArr, int i7) {
        return (((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16)) & 4294967295L;
    }

    private static void d(byte[] bArr, long j7, int i7) {
        int i8 = 0;
        while (i8 < 4) {
            bArr[i7 + i8] = (byte) (255 & j7);
            i8++;
            j7 >>= 8;
        }
    }
}
