package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhu {
    private static long zza(byte[] bArr, int i4, int i5) {
        return (zza(bArr, i4) >> i5) & 67108863;
    }

    private static long zza(byte[] bArr, int i4) {
        return (((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16)) & 4294967295L;
    }

    private static void zza(byte[] bArr, long j4, int i4) {
        int i5 = 0;
        while (i5 < 4) {
            bArr[i4 + i5] = (byte) (255 & j4);
            i5++;
            j4 >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long zza = zza(bArr, 0, 0) & 67108863;
            long zza2 = zza(bArr, 3, 2) & 67108611;
            long zza3 = zza(bArr, 6, 4) & 67092735;
            long zza4 = zza(bArr, 9, 6) & 66076671;
            long zza5 = zza(bArr, 12, 8) & 1048575;
            long j4 = zza2 * 5;
            long j5 = zza3 * 5;
            long j6 = zza4 * 5;
            long j7 = zza5 * 5;
            int i4 = 17;
            byte[] bArr3 = new byte[17];
            long j8 = 0;
            int i5 = 0;
            long j9 = 0;
            long j10 = 0;
            long j11 = 0;
            long j12 = 0;
            while (i5 < bArr2.length) {
                int min = Math.min(16, bArr2.length - i5);
                System.arraycopy(bArr2, i5, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i4, (byte) 0);
                }
                long zza6 = j12 + zza(bArr3, 0, 0);
                long zza7 = j8 + zza(bArr3, 3, 2);
                long zza8 = j9 + zza(bArr3, 6, 4);
                long zza9 = j10 + zza(bArr3, 9, 6);
                long zza10 = j11 + (zza(bArr3, 12, 8) | (bArr3[16] << 24));
                long j13 = (zza6 * zza) + (zza7 * j7) + (zza8 * j6) + (zza9 * j5) + (zza10 * j4);
                long j14 = (zza6 * zza2) + (zza7 * zza) + (zza8 * j7) + (zza9 * j6) + (zza10 * j5);
                long j15 = (zza6 * zza3) + (zza7 * zza2) + (zza8 * zza) + (zza9 * j7) + (zza10 * j6);
                long j16 = (zza6 * zza4) + (zza7 * zza3) + (zza8 * zza2) + (zza9 * zza) + (zza10 * j7);
                long j17 = j14 + (j13 >> 26);
                long j18 = j15 + (j17 >> 26);
                long j19 = j16 + (j18 >> 26);
                long j20 = (zza6 * zza5) + (zza7 * zza4) + (zza8 * zza3) + (zza9 * zza2) + (zza10 * zza) + (j19 >> 26);
                long j21 = (j13 & 67108863) + ((j20 >> 26) * 5);
                j8 = (j17 & 67108863) + (j21 >> 26);
                i5 += 16;
                j9 = j18 & 67108863;
                j10 = j19 & 67108863;
                j11 = j20 & 67108863;
                i4 = 17;
                j12 = j21 & 67108863;
            }
            long j22 = j9 + (j8 >> 26);
            long j23 = j22 & 67108863;
            long j24 = j10 + (j22 >> 26);
            long j25 = j24 & 67108863;
            long j26 = j11 + (j24 >> 26);
            long j27 = j26 & 67108863;
            long j28 = j12 + ((j26 >> 26) * 5);
            long j29 = j28 & 67108863;
            long j30 = (j8 & 67108863) + (j28 >> 26);
            long j31 = j29 + 5;
            long j32 = j31 & 67108863;
            long j33 = (j31 >> 26) + j30;
            long j34 = j23 + (j33 >> 26);
            long j35 = j25 + (j34 >> 26);
            long j36 = (j27 + (j35 >> 26)) - 67108864;
            long j37 = j36 >> 63;
            long j38 = ~j37;
            long j39 = (j30 & j37) | (j33 & 67108863 & j38);
            long j40 = (j23 & j37) | (j34 & 67108863 & j38);
            long j41 = (j25 & j37) | (j35 & 67108863 & j38);
            long j42 = ((j39 << 26) | (j29 & j37) | (j32 & j38)) & 4294967295L;
            long j43 = ((j39 >> 6) | (j40 << 20)) & 4294967295L;
            long j44 = ((j40 >> 12) | (j41 << 14)) & 4294967295L;
            long j45 = ((((j36 & j38) | (j27 & j37)) << 8) | (j41 >> 18)) & 4294967295L;
            long zza11 = j42 + zza(bArr, 16);
            long j46 = zza11 & 4294967295L;
            long zza12 = j43 + zza(bArr, 20) + (zza11 >> 32);
            long zza13 = j44 + zza(bArr, 24) + (zza12 >> 32);
            long zza14 = (j45 + zza(bArr, 28) + (zza13 >> 32)) & 4294967295L;
            byte[] bArr4 = new byte[16];
            zza(bArr4, j46, 0);
            zza(bArr4, zza12 & 4294967295L, 4);
            zza(bArr4, zza13 & 4294967295L, 8);
            zza(bArr4, zza14, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
