package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFk1sSDK {
    private static byte[] component1 = new byte[256];
    static final byte[] getCurrencyIso4217Code = new byte[256];
    static final int[] AFAdRevenueData = new int[256];
    static final int[] getMediationNetwork = new int[256];
    static final int[] getRevenue = new int[256];
    static final int[] getMonetizationNetwork = new int[256];
    private static int[] areAllFieldsValid = new int[10];

    static {
        byte[] bArr;
        int i2;
        byte b7 = 1;
        byte b8 = 1;
        do {
            b7 = (byte) (((b7 & 128) != 0 ? 27 : 0) ^ ((b7 << 1) ^ b7));
            byte b9 = (byte) (b8 ^ (b8 << 1));
            byte b10 = (byte) (b9 ^ (b9 << 2));
            byte b11 = (byte) (b10 ^ (b10 << 4));
            b8 = (byte) (b11 ^ ((b11 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = component1;
            i2 = b7 & 255;
            int i5 = b8 & 255;
            bArr[i2] = (byte) (((((b8 ^ 99) ^ ((i5 << 1) | (i5 >> 7))) ^ ((i5 << 2) | (i5 >> 6))) ^ ((i5 << 3) | (i5 >> 5))) ^ ((i5 >> 4) | (i5 << 4)));
        } while (i2 != 1);
        bArr[0] = 99;
        for (int i7 = 0; i7 < 256; i7++) {
            int i8 = component1[i7] & 255;
            getCurrencyIso4217Code[i8] = (byte) i7;
            int i9 = i7 << 1;
            if (i9 >= 256) {
                i9 ^= 283;
            }
            int i10 = i9 << 1;
            if (i10 >= 256) {
                i10 ^= 283;
            }
            int i11 = i10 << 1;
            if (i11 >= 256) {
                i11 ^= 283;
            }
            int i12 = i11 ^ i7;
            int i13 = ((i9 ^ (i10 ^ i11)) << 24) | (i12 << 16) | ((i12 ^ i10) << 8) | (i12 ^ i9);
            AFAdRevenueData[i8] = i13;
            getMediationNetwork[i8] = (i13 >>> 8) | (i13 << 24);
            getRevenue[i8] = (i13 >>> 16) | (i13 << 16);
            getMonetizationNetwork[i8] = (i13 << 8) | (i13 >>> 24);
        }
        areAllFieldsValid[0] = 16777216;
        int i14 = 1;
        for (int i15 = 1; i15 < 10; i15++) {
            i14 <<= 1;
            if (i14 >= 256) {
                i14 ^= 283;
            }
            areAllFieldsValid[i15] = i14 << 24;
        }
    }

    public static byte[][] getCurrencyIso4217Code(int i2) {
        byte[][] bArr = new byte[4][];
        for (int i5 = 0; i5 < 4; i5++) {
            int i7 = i2 >>> (i5 << 3);
            bArr[i5] = new byte[]{(byte) (i7 & 3), (byte) ((i7 >> 2) & 3), (byte) ((i7 >> 4) & 3), (byte) ((i7 >> 6) & 3)};
        }
        return bArr;
    }

    public static int[] getCurrencyIso4217Code(byte[] bArr, int i2) {
        if (bArr.length == 16) {
            int i5 = 4;
            int i7 = (i2 + 1) * 4;
            int[] iArr = new int[i7];
            int i8 = 0;
            for (int i9 = 0; i9 < 4; i9++) {
                int i10 = i8 + 3;
                int i11 = ((bArr[i8 + 1] & 255) << 16) | (bArr[i8] << 24) | ((bArr[i8 + 2] & 255) << 8);
                i8 += 4;
                iArr[i9] = i11 | (bArr[i10] & 255);
            }
            int i12 = 4;
            int i13 = 0;
            int i14 = 0;
            while (i12 < i7) {
                int i15 = iArr[i12 - 1];
                if (i13 == 0) {
                    byte[] bArr2 = component1;
                    i15 = ((bArr2[i15 >>> 24] & 255) | (((bArr2[(i15 >>> 16) & 255] << 24) | ((bArr2[(i15 >>> 8) & 255] & 255) << 16)) | ((bArr2[i15 & 255] & 255) << 8))) ^ areAllFieldsValid[i14];
                    i13 = 4;
                    i14++;
                }
                iArr[i12] = i15 ^ iArr[i12 - 4];
                i12++;
                i13--;
            }
            if (bArr.length == 16) {
                int[] iArr2 = new int[i7];
                int i16 = i2 * 4;
                iArr2[0] = iArr[i16];
                int i17 = 1;
                iArr2[1] = iArr[i16 + 1];
                iArr2[2] = iArr[i16 + 2];
                char c7 = 3;
                iArr2[3] = iArr[i16 + 3];
                int i18 = i16 - 4;
                while (i17 < i2) {
                    int i19 = iArr[i18];
                    int[] iArr3 = AFAdRevenueData;
                    byte[] bArr3 = component1;
                    int i20 = iArr3[bArr3[i19 >>> 24] & 255];
                    int[] iArr4 = getMediationNetwork;
                    int i21 = i20 ^ iArr4[bArr3[(i19 >>> 16) & 255] & 255];
                    int[] iArr5 = getRevenue;
                    int i22 = i21 ^ iArr5[bArr3[(i19 >>> 8) & 255] & 255];
                    int[] iArr6 = getMonetizationNetwork;
                    iArr2[i5] = iArr6[bArr3[i19 & 255] & 255] ^ i22;
                    int i23 = iArr[i18 + 1];
                    char c8 = c7;
                    int[] iArr7 = iArr2;
                    iArr7[i5 + 1] = ((iArr4[bArr3[(i23 >>> 16) & 255] & 255] ^ iArr3[bArr3[i23 >>> 24] & 255]) ^ iArr5[bArr3[(i23 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i23 & 255] & 255];
                    int i24 = iArr[i18 + 2];
                    int i25 = i5 + 3;
                    iArr7[i5 + 2] = iArr6[bArr3[i24 & 255] & 255] ^ ((iArr3[bArr3[i24 >>> 24] & 255] ^ iArr4[bArr3[(i24 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i24 >>> 8) & 255] & 255]);
                    int i26 = iArr[i18 + 3];
                    i5 += 4;
                    iArr7[i25] = iArr6[bArr3[i26 & 255] & 255] ^ ((iArr3[bArr3[i26 >>> 24] & 255] ^ iArr4[bArr3[(i26 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i26 >>> 8) & 255] & 255]);
                    i18 -= 4;
                    i17++;
                    c7 = c8;
                    iArr2 = iArr7;
                }
                int[] iArr8 = iArr2;
                iArr8[i5] = iArr[i18];
                iArr8[i5 + 1] = iArr[i18 + 1];
                iArr8[i5 + 2] = iArr[i18 + 2];
                iArr8[i5 + 3] = iArr[i18 + 3];
                return iArr8;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
