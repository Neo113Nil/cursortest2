package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFj1hSDK {

    /* renamed from: e, reason: collision with root package name */
    private static byte[] f5962e = new byte[256];
    static final byte[] AFKeystoreWrapper = new byte[256];
    static final int[] AFInAppEventType = new int[256];
    static final int[] valueOf = new int[256];
    static final int[] AFInAppEventParameterName = new int[256];
    static final int[] values = new int[256];
    private static int[] unregisterClient = new int[10];

    static {
        byte[] bArr;
        int i2;
        byte b4 = 1;
        byte b5 = 1;
        do {
            b4 = (byte) (((b4 & 128) != 0 ? 27 : 0) ^ ((b4 << 1) ^ b4));
            byte b6 = (byte) (b5 ^ (b5 << 1));
            byte b7 = (byte) (b6 ^ (b6 << 2));
            byte b8 = (byte) (b7 ^ (b7 << 4));
            b5 = (byte) (b8 ^ ((b8 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = f5962e;
            i2 = b4 & 255;
            int i4 = b5 & 255;
            bArr[i2] = (byte) (((((b5 ^ 99) ^ ((i4 << 1) | (i4 >> 7))) ^ ((i4 << 2) | (i4 >> 6))) ^ ((i4 << 3) | (i4 >> 5))) ^ ((i4 >> 4) | (i4 << 4)));
        } while (i2 != 1);
        bArr[0] = 99;
        for (int i5 = 0; i5 < 256; i5++) {
            int i6 = f5962e[i5] & 255;
            AFKeystoreWrapper[i6] = (byte) i5;
            int i7 = i5 << 1;
            if (i7 >= 256) {
                i7 ^= 283;
            }
            int i8 = i7 << 1;
            if (i8 >= 256) {
                i8 ^= 283;
            }
            int i9 = i8 << 1;
            if (i9 >= 256) {
                i9 ^= 283;
            }
            int i10 = i9 ^ i5;
            int i11 = ((i7 ^ (i8 ^ i9)) << 24) | (i10 << 16) | ((i10 ^ i8) << 8) | (i10 ^ i7);
            AFInAppEventType[i6] = i11;
            valueOf[i6] = (i11 >>> 8) | (i11 << 24);
            AFInAppEventParameterName[i6] = (i11 >>> 16) | (i11 << 16);
            values[i6] = (i11 << 8) | (i11 >>> 24);
        }
        unregisterClient[0] = 16777216;
        int i12 = 1;
        for (int i13 = 1; i13 < 10; i13++) {
            i12 <<= 1;
            if (i12 >= 256) {
                i12 ^= 283;
            }
            unregisterClient[i13] = i12 << 24;
        }
    }

    public static byte[][] AFInAppEventType(int i2) {
        byte[][] bArr = new byte[4][];
        for (int i4 = 0; i4 < 4; i4++) {
            int i5 = i2 >>> (i4 << 3);
            bArr[i4] = new byte[]{(byte) (i5 & 3), (byte) ((i5 >> 2) & 3), (byte) ((i5 >> 4) & 3), (byte) ((i5 >> 6) & 3)};
        }
        return bArr;
    }

    public static int[] values(byte[] bArr, int i2) {
        int i4 = i2;
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
                byte[] bArr2 = f5962e;
                i14 = ((bArr2[i14 >>> 24] & 255) | (((bArr2[(i14 >>> 16) & 255] << 24) | ((bArr2[(i14 >>> 8) & 255] & 255) << 16)) | ((bArr2[i14 & 255] & 255) << 8))) ^ unregisterClient[i13];
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
        iArr2[3] = iArr[i15 + 3];
        int i17 = i15 - 4;
        while (i16 < i4) {
            int i18 = iArr[i17];
            int[] iArr3 = AFInAppEventType;
            byte[] bArr3 = f5962e;
            int i19 = iArr3[bArr3[i18 >>> 24] & 255];
            int[] iArr4 = valueOf;
            int i20 = i19 ^ iArr4[bArr3[(i18 >>> 16) & 255] & 255];
            int[] iArr5 = AFInAppEventParameterName;
            int i21 = i20 ^ iArr5[bArr3[(i18 >>> 8) & 255] & 255];
            int[] iArr6 = values;
            iArr2[i5] = iArr6[bArr3[i18 & 255] & 255] ^ i21;
            int i22 = iArr[i17 + 1];
            iArr2[i5 + 1] = ((iArr4[bArr3[(i22 >>> 16) & 255] & 255] ^ iArr3[bArr3[i22 >>> 24] & 255]) ^ iArr5[bArr3[(i22 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i22 & 255] & 255];
            int i23 = iArr[i17 + 2];
            int i24 = i5 + 3;
            iArr2[i5 + 2] = iArr6[bArr3[i23 & 255] & 255] ^ ((iArr3[bArr3[i23 >>> 24] & 255] ^ iArr4[bArr3[(i23 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i23 >>> 8) & 255] & 255]);
            int i25 = iArr[i17 + 3];
            i5 += 4;
            iArr2[i24] = iArr6[bArr3[i25 & 255] & 255] ^ ((iArr3[bArr3[i25 >>> 24] & 255] ^ iArr4[bArr3[(i25 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i25 >>> 8) & 255] & 255]);
            i17 -= 4;
            i16++;
            i4 = i2;
        }
        iArr2[i5] = iArr[i17];
        iArr2[i5 + 1] = iArr[i17 + 1];
        iArr2[i5 + 2] = iArr[i17 + 2];
        iArr2[i5 + 3] = iArr[i17 + 3];
        return iArr2;
    }
}
