package com.appsflyer.internal.connector.purcahse;

import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class AFPurchaseConnectorA1c {
    public int InAppPurchaseEvent;
    public int getQuantity;
    public int toJsonMap;

    public static void InAppPurchaseEvent(int[] iArr) {
        for (int i4 = 0; i4 < iArr.length / 2; i4++) {
            int i5 = iArr[i4];
            iArr[i4] = iArr[(iArr.length - i4) - 1];
            iArr[(iArr.length - i4) - 1] = i5;
        }
    }

    public static int getQuantity(int i4) {
        AFPurchaseConnectorA1p aFPurchaseConnectorA1p = AFPurchaseConnectorA1p.getQuantity;
        int i5 = (i4 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i6 = (i4 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i7 = (i4 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i8 = i4 & KotlinVersion.MAX_COMPONENT_VALUE;
        int[][] iArr = aFPurchaseConnectorA1p.getPackageName;
        return ((iArr[0][i5] + iArr[1][i6]) ^ iArr[2][i7]) + iArr[3][i8];
    }
}
