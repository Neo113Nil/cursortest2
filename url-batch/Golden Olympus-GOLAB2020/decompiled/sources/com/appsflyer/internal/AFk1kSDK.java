package com.appsflyer.internal;

import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class AFk1kSDK {
    public int AFAdRevenueData;
    public int getCurrencyIso4217Code;
    public int getMonetizationNetwork;

    public static int AFAdRevenueData(int i4) {
        AFk1sSDK aFk1sSDK = AFk1sSDK.getMediationNetwork;
        int i5 = (i4 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i6 = (i4 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i7 = (i4 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i8 = i4 & KotlinVersion.MAX_COMPONENT_VALUE;
        int[][] iArr = aFk1sSDK.getRevenue;
        return ((iArr[0][i5] + iArr[1][i6]) ^ iArr[2][i7]) + iArr[3][i8];
    }

    public static void getMediationNetwork(int[] iArr) {
        for (int i4 = 0; i4 < iArr.length / 2; i4++) {
            int i5 = iArr[i4];
            iArr[i4] = iArr[(iArr.length - i4) - 1];
            iArr[(iArr.length - i4) - 1] = i5;
        }
    }
}
