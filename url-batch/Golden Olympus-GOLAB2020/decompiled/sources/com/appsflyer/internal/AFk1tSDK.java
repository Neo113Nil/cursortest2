package com.appsflyer.internal;

import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class AFk1tSDK {
    public static void AFAdRevenueData(int i4, int i5, boolean z4, int i6, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z4) {
            getCurrencyIso4217Code(iArr);
        }
        int i7 = 0;
        while (i7 < i6) {
            int i8 = i4 ^ iArr[i7];
            int mediationNetwork = i5 ^ getMediationNetwork(i8, iArr2);
            i7++;
            i5 = i8;
            i4 = mediationNetwork;
        }
        int i9 = i4 ^ iArr[iArr.length - 2];
        int i10 = i5 ^ iArr[iArr.length - 1];
        if (!z4) {
            getCurrencyIso4217Code(iArr);
        }
        iArr3[0] = i10;
        iArr3[1] = i9;
    }

    private static void getCurrencyIso4217Code(int[] iArr) {
        for (int i4 = 0; i4 < iArr.length / 2; i4++) {
            int i5 = iArr[i4];
            iArr[i4] = iArr[(iArr.length - i4) - 1];
            iArr[(iArr.length - i4) - 1] = i5;
        }
    }

    private static int getMediationNetwork(int i4, int[][] iArr) {
        return ((iArr[0][i4 >>> 24] + iArr[1][(i4 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE]) ^ iArr[2][(i4 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE]) + iArr[3][i4 & KotlinVersion.MAX_COMPONENT_VALUE];
    }
}
