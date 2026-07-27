package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFj1iSDK {
    public int AFInAppEventParameterName;
    public int AFKeystoreWrapper;
    public int values;

    public static void valueOf(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length / 2; i2++) {
            int i4 = iArr[i2];
            iArr[i2] = iArr[(iArr.length - i2) - 1];
            iArr[(iArr.length - i2) - 1] = i4;
        }
    }

    public static int values(int i2) {
        int[][] iArr = AFj1nSDK.AFInAppEventType.valueOf;
        return ((iArr[0][(i2 >>> 24) & 255] + iArr[1][(i2 >>> 16) & 255]) ^ iArr[2][(i2 >>> 8) & 255]) + iArr[3][i2 & 255];
    }
}
