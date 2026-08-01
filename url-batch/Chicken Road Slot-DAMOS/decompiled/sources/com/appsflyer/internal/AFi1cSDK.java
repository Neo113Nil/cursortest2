package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class AFi1cSDK extends AFj1tSDK {
    private AFc1oSDK getCurrencyIso4217Code;

    public AFi1cSDK(String str, String str2, AFc1oSDK aFc1oSDK, Runnable runnable) {
        super(str, str2, runnable);
        this.getCurrencyIso4217Code = aFc1oSDK;
    }

    public final boolean getRevenue() {
        if (this.getCurrencyIso4217Code.getMediationNetwork.getRevenue("appsFlyerCount", 0) <= 0) {
            return true;
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install referrer will not load, the counter >= 1, ");
        return false;
    }
}
