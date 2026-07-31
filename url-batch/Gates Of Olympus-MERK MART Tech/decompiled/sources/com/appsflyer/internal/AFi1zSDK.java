package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* loaded from: classes3.dex */
public abstract class AFi1zSDK extends AFi1pSDK {
    private AFd1pSDK valueOf;

    public AFi1zSDK(String str, String str2, AFd1pSDK aFd1pSDK, Runnable runnable) {
        super(str, str2, runnable);
        this.valueOf = aFd1pSDK;
    }

    protected final boolean AFInAppEventParameterName() {
        if (this.valueOf.valueOf.AFKeystoreWrapper("appsFlyerCount", 0) <= 0) {
            return true;
        }
        AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
        return false;
    }
}
