package com.appsflyer.internal;

/* loaded from: classes.dex */
public class AFk1pSDK {
    public static void getCurrencyIso4217Code(byte[] bArr, byte b7, long j) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (((1 << i2) & j) != 0) {
                bArr[i2] = (byte) (bArr[i2] ^ b7);
            }
        }
    }
}
