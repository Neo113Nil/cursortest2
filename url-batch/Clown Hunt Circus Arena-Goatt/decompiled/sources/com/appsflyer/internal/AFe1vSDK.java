package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class AFe1vSDK {
    private static final long AFInAppEventType = TimeUnit.HOURS.toSeconds(24);
    private final AFb1tSDK AFInAppEventParameterName;
    private final AFb1cSDK AFKeystoreWrapper;

    public AFe1vSDK(AFb1cSDK aFb1cSDK, AFb1tSDK aFb1tSDK) {
        this.AFKeystoreWrapper = aFb1cSDK;
        this.AFInAppEventParameterName = aFb1tSDK;
    }

    public final boolean values() {
        return Boolean.parseBoolean(this.AFKeystoreWrapper.valueOf("com.appsflyer.rc.sandbox"));
    }

    public final boolean valueOf() {
        return Boolean.parseBoolean(this.AFKeystoreWrapper.valueOf("com.appsflyer.rc.staging"));
    }

    public final long AFInAppEventParameterName() {
        String valueOf = this.AFKeystoreWrapper.valueOf("com.appsflyer.rc.cache.max-age-fallback");
        if (valueOf != null) {
            try {
                return Long.parseLong(valueOf);
            } catch (NumberFormatException e) {
                AFLogger.afErrorLog(new StringBuilder("Can't read maxAgeFallback from Manifest: ").append(e.getMessage()).toString(), e);
                return AFInAppEventType;
            }
        }
        return AFInAppEventType;
    }

    public final boolean AFInAppEventType() {
        if (this.AFInAppEventParameterName.AFInAppEventParameterName != null) {
            return System.currentTimeMillis() - this.AFInAppEventParameterName.values > TimeUnit.SECONDS.toMillis(this.AFInAppEventParameterName.AFInAppEventType);
        }
        AFLogger.afInfoLog("CFG: active config is missing - fetching from CDN");
        return true;
    }
}
