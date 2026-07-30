package com.appsflyer.internal;

import android.content.pm.PackageItemInfo;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;

/* loaded from: classes.dex */
public final class AFb1cSDK {
    private static String valueOf = "253";
    public final AFb1fSDK AFInAppEventType;
    private Bundle AFKeystoreWrapper = null;
    public final AFb1bSDK values;

    public AFb1cSDK(AFb1bSDK aFb1bSDK, AFb1fSDK aFb1fSDK) {
        this.values = aFb1bSDK;
        this.AFInAppEventType = aFb1fSDK;
    }

    public static String values() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public final String valueOf(String str) {
        Object obj;
        try {
            if (this.AFKeystoreWrapper == null) {
                this.AFKeystoreWrapper = ((PackageItemInfo) this.values.AFInAppEventParameterName.getPackageManager().getApplicationInfo(this.values.AFInAppEventParameterName.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.AFKeystoreWrapper;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder("Could not load manifest metadata!").append(th.getMessage()).toString(), th);
            return null;
        }
    }

    public final boolean AFInAppEventType(String str) {
        String valueOf2 = valueOf(str);
        if (valueOf2 != null) {
            return Boolean.parseBoolean(valueOf2);
        }
        return false;
    }

    public static String AFInAppEventParameterName() {
        return new StringBuilder("version: 6.12.1 (build ").append(valueOf).append(")").toString();
    }

    public final String AFKeystoreWrapper() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = valueOf("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }
}
