package com.appsflyer.internal;

/* loaded from: classes.dex */
public class AFj1gSDK {
    public static void AFInAppEventParameterName(byte[] bArr, byte b4, long j4) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (((1 << i2) & j4) != 0) {
                bArr[i2] = (byte) (bArr[i2] ^ b4);
            }
        }
    }
}
