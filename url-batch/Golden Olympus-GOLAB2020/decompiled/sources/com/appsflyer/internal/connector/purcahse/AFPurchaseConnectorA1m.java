package com.appsflyer.internal.connector.purcahse;

/* loaded from: classes.dex */
public class AFPurchaseConnectorA1m {
    public static void getPackageName(byte[] bArr, byte b4, long j4) {
        for (int i4 = 0; i4 < bArr.length; i4++) {
            if (((1 << i4) & j4) != 0) {
                bArr[i4] = (byte) (bArr[i4] ^ b4);
            }
        }
    }
}
