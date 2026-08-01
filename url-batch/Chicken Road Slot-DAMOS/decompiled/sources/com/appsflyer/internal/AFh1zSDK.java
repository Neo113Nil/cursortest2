package com.appsflyer.internal;

import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFh1zSDK extends AFh1ySDK {
    private final AFd1zSDK getMediationNetwork;

    public AFh1zSDK(AFd1zSDK aFd1zSDK) {
        aFd1zSDK.getClass();
        this.getMediationNetwork = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z10, boolean z11, boolean z12, boolean z13) {
        aFg1cSDK.getClass();
        str.getClass();
        th.getClass();
        if (z12) {
            if (StringsKt.r(str)) {
                str = "missing label";
            }
            this.getMediationNetwork.afErrorLogForExcManagerOnly().getMonetizationNetwork(th, withTag$SDK_prodRelease(str, aFg1cSDK));
        }
    }
}
