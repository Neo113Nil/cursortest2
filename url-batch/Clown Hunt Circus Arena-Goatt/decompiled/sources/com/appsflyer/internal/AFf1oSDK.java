package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public abstract class AFf1oSDK extends AFf1jSDK {
    public AFf1oSDK(String str, String str2, Runnable runnable) {
        super(str, str2, runnable);
    }

    protected static boolean AFKeystoreWrapper() {
        if (AFa1dSDK.valueOf().AFInAppEventType(AFa1dSDK.valueOf().AFInAppEventParameterName().AFKeystoreWrapper(), false) <= 0) {
            return true;
        }
        AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
        return false;
    }
}
