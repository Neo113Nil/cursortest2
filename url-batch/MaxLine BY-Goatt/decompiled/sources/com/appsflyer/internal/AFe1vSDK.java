package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFe1vSDK {
    private static final long AFInAppEventType = 86400;
    private final AFb1tSDK AFInAppEventParameterName;
    private final AFb1cSDK AFKeystoreWrapper;

    public AFe1vSDK(AFb1cSDK aFb1cSDK, AFb1tSDK aFb1tSDK) {
        this.AFKeystoreWrapper = aFb1cSDK;
        this.AFInAppEventParameterName = aFb1tSDK;
    }

    public final long AFInAppEventParameterName() {
        String valueOf = this.AFKeystoreWrapper.valueOf("com.appsflyer.rc.cache.max-age-fallback");
        if (valueOf == null) {
            return AFInAppEventType;
        }
        try {
            return Long.parseLong(valueOf);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("Can't read maxAgeFallback from Manifest: ");
            sb.append(e.getMessage());
            AFLogger.afErrorLog(sb.toString(), e);
            return AFInAppEventType;
        }
    }

    public final boolean AFInAppEventType() {
        if (this.AFInAppEventParameterName.AFInAppEventParameterName == null) {
            AFLogger.afInfoLog("CFG: active config is missing - fetching from CDN");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        AFb1tSDK aFb1tSDK = this.AFInAppEventParameterName;
        return currentTimeMillis - aFb1tSDK.values > TimeUnit.SECONDS.toMillis(aFb1tSDK.AFInAppEventType);
    }

    public final boolean valueOf() {
        return Boolean.parseBoolean(this.AFKeystoreWrapper.valueOf("com.appsflyer.rc.staging"));
    }

    public final boolean values() {
        return Boolean.parseBoolean(this.AFKeystoreWrapper.valueOf("com.appsflyer.rc.sandbox"));
    }
}
