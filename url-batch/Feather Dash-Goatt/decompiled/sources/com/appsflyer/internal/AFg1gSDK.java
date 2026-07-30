package com.appsflyer.internal;

import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFg1gSDK extends AFg1hSDK {
    private final AFd1zSDK AFAdRevenueData;

    public AFg1gSDK(AFd1zSDK aFd1zSDK) {
        aFd1zSDK.getClass();
        this.AFAdRevenueData = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        aFg1cSDK.getClass();
        str.getClass();
        th.getClass();
        if (z3) {
            if (StringsKt.n(str)) {
                str = "missing label";
            }
            this.AFAdRevenueData.afLogForce().getMediationNetwork(th, withTag$SDK_prodRelease(str, aFg1cSDK));
        }
    }
}
