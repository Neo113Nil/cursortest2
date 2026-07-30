package com.realsil.sdk.dfu.utils;

import com.realsil.sdk.core.logger.ZLogger;

/* loaded from: classes4.dex */
public class AesJni {
    public static final int MODE_AES_256 = 3;

    static {
        try {
            ZLogger.v("AesJni: V1.0.0.1");
            System.loadLibrary("RtkAesJni");
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
        }
    }

    public byte[] aesEncrypt(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9];
        byte[] bArr3 = new byte[i9];
        try {
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            aes_encrypt(bArr2, bArr3);
            return bArr3;
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
            return bArr3;
        }
    }

    public native boolean aesInit(int i8, byte[] bArr);

    public native void aes_encrypt(byte[] bArr, byte[] bArr2);

    public void testJniCallback(int i8, int i9) {
    }
}
