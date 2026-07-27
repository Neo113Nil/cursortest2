package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFj1oSDK {
    private static void AFInAppEventType(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length / 2; i2++) {
            int i4 = iArr[i2];
            iArr[i2] = iArr[(iArr.length - i2) - 1];
            iArr[(iArr.length - i2) - 1] = i4;
        }
    }

    public static void values(int i2, int i4, boolean z4, int i5, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z4) {
            AFInAppEventType(iArr);
        }
        int i6 = i2;
        int i7 = i4;
        int i8 = 0;
        while (i8 < i5) {
            int i9 = i6 ^ iArr[i8];
            int i10 = i7 ^ ((iArr2[2][(i9 >>> 8) & 255] ^ (iArr2[0][i9 >>> 24] + iArr2[1][(i9 >>> 16) & 255])) + iArr2[3][i9 & 255]);
            i8++;
            i7 = i9;
            i6 = i10;
        }
        int i11 = i6 ^ iArr[iArr.length - 2];
        int i12 = i7 ^ iArr[iArr.length - 1];
        if (!z4) {
            AFInAppEventType(iArr);
        }
        iArr3[0] = i12;
        iArr3[1] = i11;
    }
}
