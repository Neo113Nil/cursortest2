package com.appsflyer.internal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFg1tSDK {
    public static void AFInAppEventParameterName(int i, int i2, boolean z, int i3, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z) {
            AFKeystoreWrapper(iArr);
        }
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i ^ iArr[i4];
            int AFKeystoreWrapper = i2 ^ AFKeystoreWrapper(i5, iArr2);
            i4++;
            i2 = i5;
            i = AFKeystoreWrapper;
        }
        int i6 = i ^ iArr[iArr.length - 2];
        int i7 = i2 ^ iArr[iArr.length - 1];
        if (!z) {
            AFKeystoreWrapper(iArr);
        }
        iArr3[0] = i7;
        iArr3[1] = i6;
    }

    private static int AFKeystoreWrapper(int i, int[][] iArr) {
        return ((iArr[0][i >>> 24] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }

    private static void AFKeystoreWrapper(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }
}
