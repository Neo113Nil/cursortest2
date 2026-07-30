package com.appsflyer.internal;

import android.content.pm.PackageItemInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class AFd1sSDK {
    private static String values = "288";
    private Bundle AFInAppEventParameterName = null;
    public final AFd1pSDK AFInAppEventType;
    public final AFd1qSDK AFKeystoreWrapper;
    public final AFd1lSDK valueOf;

    public AFd1sSDK(AFd1lSDK aFd1lSDK, AFd1qSDK aFd1qSDK, AFd1pSDK aFd1pSDK) {
        this.valueOf = aFd1lSDK;
        this.AFKeystoreWrapper = aFd1qSDK;
        this.AFInAppEventType = aFd1pSDK;
    }

    public static String values() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String AFInAppEventType() {
        return "6.14.0";
    }

    public static String valueOf() {
        return UUID.randomUUID().toString();
    }

    public static String AFInAppEventParameterName() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public final boolean unregisterClient() {
        return !this.AFInAppEventType.valueOf();
    }

    public final String AFInAppEventType(String str) {
        Object obj;
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = ((PackageItemInfo) this.valueOf.AFKeystoreWrapper.getPackageManager().getApplicationInfo(this.valueOf.AFKeystoreWrapper.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.AFInAppEventParameterName;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder("Could not load manifest metadata!").append(th.getMessage()).toString(), th);
            return null;
        }
    }

    public final boolean AFInAppEventParameterName(String str) {
        String AFInAppEventType = AFInAppEventType(str);
        if (AFInAppEventType != null) {
            return Boolean.parseBoolean(AFInAppEventType);
        }
        return false;
    }

    public static String registerClient() {
        return new StringBuilder("version: 6.14.0 (build ").append(values).append(")").toString();
    }

    public final String d() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = AFInAppEventType("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public final String AFKeystoreWrapper() {
        AFh1uSDK aFh1uSDK = this.AFInAppEventType.AFLogger;
        AFb1zSDK aFb1zSDK = aFh1uSDK != null ? new AFb1zSDK(aFh1uSDK.values, aFh1uSDK.registerClient) : null;
        if (aFb1zSDK != null) {
            return aFb1zSDK.AFInAppEventParameterName;
        }
        return null;
    }

    public final String AFKeystoreWrapper(String str) {
        try {
            int identifier = this.valueOf.AFKeystoreWrapper.getResources().getIdentifier(str, "string", this.valueOf.AFKeystoreWrapper.getPackageName());
            if (identifier != 0) {
                return this.valueOf.AFKeystoreWrapper.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e) {
            AFLogger.afErrorLog(new StringBuilder("Could not load string resource!").append(e.getMessage()).toString(), e);
            return null;
        }
    }
}
