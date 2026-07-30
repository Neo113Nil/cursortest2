package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFk1rSDK {
    private static int getMediationNetwork(int i2, int[][] iArr) {
        return ((iArr[0][i2 >>> 24] + iArr[1][(i2 >>> 16) & 255]) ^ iArr[2][(i2 >>> 8) & 255]) + iArr[3][i2 & 255];
    }

    public static void getRevenue(int i2, int i5, boolean z7, int i7, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z7) {
            getRevenue(iArr);
        }
        int i8 = 0;
        while (i8 < i7) {
            int i9 = i2 ^ iArr[i8];
            int mediationNetwork = i5 ^ getMediationNetwork(i9, iArr2);
            i8++;
            i5 = i9;
            i2 = mediationNetwork;
        }
        int i10 = i2 ^ iArr[iArr.length - 2];
        int i11 = i5 ^ iArr[iArr.length - 1];
        if (!z7) {
            getRevenue(iArr);
        }
        iArr3[0] = i11;
        iArr3[1] = i10;
    }

    private static void getRevenue(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length / 2; i2++) {
            int i5 = iArr[i2];
            iArr[i2] = iArr[(iArr.length - i2) - 1];
            iArr[(iArr.length - i2) - 1] = i5;
        }
    }
}
