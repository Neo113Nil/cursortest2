package com.appsflyer.internal;

/* loaded from: classes3.dex */
public final class AFj1iSDK {
    public int AFInAppEventParameterName;
    public int AFKeystoreWrapper;
    public int values;

    public static void valueOf(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int values(int i) {
        AFj1nSDK aFj1nSDK = AFj1nSDK.AFInAppEventType;
        return ((aFj1nSDK.valueOf[0][(i >>> 24) & 255] + aFj1nSDK.valueOf[1][(i >>> 16) & 255]) ^ aFj1nSDK.valueOf[2][(i >>> 8) & 255]) + aFj1nSDK.valueOf[3][i & 255];
    }
}
