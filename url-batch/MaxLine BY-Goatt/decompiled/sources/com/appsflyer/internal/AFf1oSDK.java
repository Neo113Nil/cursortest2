package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class AFf1oSDK extends AFf1jSDK {
    public AFf1oSDK(String str, String str2, Runnable runnable) {
        super(str, str2, runnable);
    }

    public static boolean AFKeystoreWrapper() {
        if (AFa1dSDK.valueOf().AFInAppEventType(AFa1dSDK.valueOf().AFInAppEventParameterName().AFKeystoreWrapper(), false) <= 0) {
            return true;
        }
        AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
        return false;
    }
}
