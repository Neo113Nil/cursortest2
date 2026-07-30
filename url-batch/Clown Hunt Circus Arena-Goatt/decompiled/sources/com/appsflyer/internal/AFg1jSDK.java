package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFg1jSDK {
    public static int AFInAppEventType;
    public static int AFKeystoreWrapper;
    public static int valueOf;
    public static final Object values = new Object();

    public static void AFInAppEventParameterName(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int AFInAppEventParameterName(int i) {
        AFg1sSDK aFg1sSDK = AFg1sSDK.values;
        return ((aFg1sSDK.AFKeystoreWrapper[0][i >>> 24] + aFg1sSDK.AFKeystoreWrapper[1][(i >>> 16) & 255]) ^ aFg1sSDK.AFKeystoreWrapper[2][(i >>> 8) & 255]) + aFg1sSDK.AFKeystoreWrapper[3][i & 255];
    }
}
