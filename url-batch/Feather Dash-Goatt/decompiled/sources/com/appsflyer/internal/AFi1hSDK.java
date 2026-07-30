package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class AFi1hSDK extends AFj1zSDK {
    private AFc1kSDK getMediationNetwork;

    public AFi1hSDK(String str, String str2, AFc1kSDK aFc1kSDK, Runnable runnable) {
        super(str, str2, runnable);
        this.getMediationNetwork = aFc1kSDK;
    }

    public final boolean getMonetizationNetwork() {
        if (this.getMediationNetwork.getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0) <= 0) {
            return true;
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install referrer will not load, the counter >= 1, ");
        return false;
    }
}
