package com.appsflyer.internal;

/* loaded from: classes.dex */
public class AFk1qSDK {
    public static void getCurrencyIso4217Code(byte[] bArr, byte b4, long j4) {
        for (int i4 = 0; i4 < bArr.length; i4++) {
            if (((1 << i4) & j4) != 0) {
                bArr[i4] = (byte) (bArr[i4] ^ b4);
            }
        }
    }
}
