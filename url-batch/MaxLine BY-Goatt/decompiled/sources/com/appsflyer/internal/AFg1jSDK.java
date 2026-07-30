package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFg1jSDK {
    public static int AFInAppEventType;
    public static int AFKeystoreWrapper;
    public static int valueOf;
    public static final Object values = new Object();

    public static int AFInAppEventParameterName(int i) {
        int[][] iArr = AFg1sSDK.values.AFKeystoreWrapper;
        return ((iArr[0][i >>> 24] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }

    public static void AFInAppEventParameterName(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }
}
