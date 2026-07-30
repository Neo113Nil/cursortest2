package com.appsflyer.internal;

/* loaded from: classes3.dex */
public class AFj1gSDK {
    public static void AFInAppEventParameterName(byte[] bArr, byte b, long j) {
        for (int i = 0; i < bArr.length; i++) {
            if (((1 << i) & j) != 0) {
                bArr[i] = (byte) (bArr[i] ^ b);
            }
        }
    }
}
