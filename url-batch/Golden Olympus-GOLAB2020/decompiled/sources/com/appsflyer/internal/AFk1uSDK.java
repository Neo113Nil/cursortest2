package com.appsflyer.internal;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class AFk1uSDK {
    private static byte[] component1 = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    static final byte[] getMonetizationNetwork = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    static final int[] getMediationNetwork = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    static final int[] AFAdRevenueData = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    static final int[] getCurrencyIso4217Code = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    static final int[] getRevenue = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    private static int[] areAllFieldsValid = new int[10];

    static {
        byte[] bArr;
        int i4;
        byte b4 = 1;
        byte b5 = 1;
        do {
            b4 = (byte) (((b4 & 128) != 0 ? 27 : 0) ^ ((b4 << 1) ^ b4));
            byte b6 = (byte) (b5 ^ (b5 << 1));
            byte b7 = (byte) (b6 ^ (b6 << 2));
            byte b8 = (byte) (b7 ^ (b7 << 4));
            b5 = (byte) (b8 ^ ((b8 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = component1;
            i4 = b4 & 255;
            int i5 = b5 & 255;
            bArr[i4] = (byte) (((((b5 ^ 99) ^ ((i5 << 1) | (i5 >> 7))) ^ ((i5 << 2) | (i5 >> 6))) ^ ((i5 << 3) | (i5 >> 5))) ^ ((i5 >> 4) | (i5 << 4)));
        } while (i4 != 1);
        bArr[0] = 99;
        for (int i6 = 0; i6 < 256; i6++) {
            int i7 = component1[i6] & 255;
            getMonetizationNetwork[i7] = (byte) i6;
            int i8 = i6 << 1;
            if (i8 >= 256) {
                i8 ^= 283;
            }
            int i9 = i8 << 1;
            if (i9 >= 256) {
                i9 ^= 283;
            }
            int i10 = i9 << 1;
            if (i10 >= 256) {
                i10 ^= 283;
            }
            int i11 = i10 ^ i6;
            int i12 = ((i8 ^ (i9 ^ i10)) << 24) | (i11 << 16) | ((i11 ^ i9) << 8) | (i11 ^ i8);
            getMediationNetwork[i7] = i12;
            AFAdRevenueData[i7] = (i12 >>> 8) | (i12 << 24);
            getCurrencyIso4217Code[i7] = (i12 >>> 16) | (i12 << 16);
            getRevenue[i7] = (i12 << 8) | (i12 >>> 24);
        }
        areAllFieldsValid[0] = 16777216;
        int i13 = 1;
        for (int i14 = 1; i14 < 10; i14++) {
            i13 <<= 1;
            if (i13 >= 256) {
                i13 ^= 283;
            }
            areAllFieldsValid[i14] = i13 << 24;
        }
    }

    static int[] getCurrencyIso4217Code(byte[] bArr, int i4) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i5 = 4;
        int i6 = (i4 + 1) * 4;
        int[] iArr = new int[i6];
        int i7 = 0;
        for (int i8 = 0; i8 < 4; i8++) {
            int i9 = i7 + 3;
            int i10 = ((bArr[i7 + 1] & 255) << 16) | (bArr[i7] << 24) | ((bArr[i7 + 2] & 255) << 8);
            i7 += 4;
            iArr[i8] = i10 | (bArr[i9] & 255);
        }
        int i11 = 4;
        int i12 = 0;
        int i13 = 0;
        while (i11 < i6) {
            int i14 = iArr[i11 - 1];
            if (i12 == 0) {
                byte[] bArr2 = component1;
                i14 = ((bArr2[i14 >>> 24] & 255) | (((bArr2[(i14 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] << 24) | ((bArr2[(i14 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] & 255) << 16)) | ((bArr2[i14 & KotlinVersion.MAX_COMPONENT_VALUE] & 255) << 8))) ^ areAllFieldsValid[i13];
                i12 = 4;
                i13++;
            }
            iArr[i11] = i14 ^ iArr[i11 - 4];
            i11++;
            i12--;
        }
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int[] iArr2 = new int[i6];
        int i15 = i4 * 4;
        iArr2[0] = iArr[i15];
        int i16 = 1;
        iArr2[1] = iArr[i15 + 1];
        iArr2[2] = iArr[i15 + 2];
        char c4 = 3;
        iArr2[3] = iArr[i15 + 3];
        int i17 = i15 - 4;
        while (i16 < i4) {
            int i18 = iArr[i17];
            int[] iArr3 = getMediationNetwork;
            byte[] bArr3 = component1;
            int i19 = iArr3[bArr3[i18 >>> 24] & 255];
            int[] iArr4 = AFAdRevenueData;
            int i20 = i19 ^ iArr4[bArr3[(i18 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] & 255];
            int[] iArr5 = getCurrencyIso4217Code;
            int i21 = i20 ^ iArr5[bArr3[(i18 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] & 255];
            int[] iArr6 = getRevenue;
            iArr2[i5] = iArr6[bArr3[i18 & KotlinVersion.MAX_COMPONENT_VALUE] & 255] ^ i21;
            int i22 = iArr[i17 + 1];
            char c5 = c4;
            int[] iArr7 = iArr2;
            iArr7[i5 + 1] = ((iArr4[bArr3[(i22 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] & 255] ^ iArr3[bArr3[i22 >>> 24] & 255]) ^ iArr5[bArr3[(i22 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] & 255]) ^ iArr6[bArr3[i22 & KotlinVersion.MAX_COMPONENT_VALUE] & 255];
            int i23 = iArr[i17 + 2];
            int i24 = i5 + 3;
            iArr7[i5 + 2] = iArr6[bArr3[i23 & KotlinVersion.MAX_COMPONENT_VALUE] & 255] ^ ((iArr3[bArr3[i23 >>> 24] & 255] ^ iArr4[bArr3[(i23 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] & 255]) ^ iArr5[bArr3[(i23 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] & 255]);
            int i25 = iArr[i17 + 3];
            i5 += 4;
            iArr7[i24] = iArr6[bArr3[i25 & KotlinVersion.MAX_COMPONENT_VALUE] & 255] ^ ((iArr3[bArr3[i25 >>> 24] & 255] ^ iArr4[bArr3[(i25 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE] & 255]) ^ iArr5[bArr3[(i25 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] & 255]);
            i17 -= 4;
            i16++;
            c4 = c5;
            iArr2 = iArr7;
        }
        int[] iArr8 = iArr2;
        iArr8[i5] = iArr[i17];
        iArr8[i5 + 1] = iArr[i17 + 1];
        iArr8[i5 + 2] = iArr[i17 + 2];
        iArr8[i5 + 3] = iArr[i17 + 3];
        return iArr8;
    }

    public static byte[][] getMediationNetwork(int i4) {
        byte[][] bArr = new byte[4][];
        for (int i5 = 0; i5 < 4; i5++) {
            int i6 = i4 >>> (i5 << 3);
            bArr[i5] = new byte[]{(byte) (i6 & 3), (byte) ((i6 >> 2) & 3), (byte) ((i6 >> 4) & 3), (byte) ((i6 >> 6) & 3)};
        }
        return bArr;
    }
}
