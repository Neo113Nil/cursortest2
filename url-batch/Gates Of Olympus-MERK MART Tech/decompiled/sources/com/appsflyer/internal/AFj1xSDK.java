package com.appsflyer.internal;

/* loaded from: classes3.dex */
public final class AFj1xSDK {
    public int AFInAppEventType;
    public int AFKeystoreWrapper;
    public int values;

    public static void values(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int AFKeystoreWrapper(int i) {
        AFi1eSDK aFi1eSDK = AFi1eSDK.AFInAppEventParameterName;
        return ((aFi1eSDK.AFKeystoreWrapper[0][(i >>> 24) & 255] + aFi1eSDK.AFKeystoreWrapper[1][(i >>> 16) & 255]) ^ aFi1eSDK.AFKeystoreWrapper[2][(i >>> 8) & 255]) + aFi1eSDK.AFKeystoreWrapper[3][i & 255];
    }
}
