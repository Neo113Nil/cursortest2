package com.appsflyer.internal;

import android.content.pm.PackageItemInfo;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;

/* loaded from: classes3.dex */
public final class AFd1pSDK {
    private static String AFKeystoreWrapper = "279";
    public final AFd1nSDK AFInAppEventParameterName;
    public final AFd1xSDK valueOf;
    private Bundle values = null;

    public AFd1pSDK(AFd1nSDK aFd1nSDK, AFd1xSDK aFd1xSDK) {
        this.AFInAppEventParameterName = aFd1nSDK;
        this.valueOf = aFd1xSDK;
    }

    public static String AFInAppEventType() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    public final String AFInAppEventParameterName(String str) {
        Object obj;
        try {
            if (this.values == null) {
                this.values = ((PackageItemInfo) this.AFInAppEventParameterName.AFKeystoreWrapper.getPackageManager().getApplicationInfo(this.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.values;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder("Could not load manifest metadata!").append(th.getMessage()).toString(), th);
            return null;
        }
    }

    public final boolean AFKeystoreWrapper(String str) {
        String AFInAppEventParameterName = AFInAppEventParameterName(str);
        if (AFInAppEventParameterName != null) {
            return Boolean.parseBoolean(AFInAppEventParameterName);
        }
        return false;
    }

    public static String valueOf() {
        return new StringBuilder("version: 6.12.6 (build ").append(AFKeystoreWrapper).append(")").toString();
    }

    public final String AFInAppEventParameterName() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = AFInAppEventParameterName("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public final String valueOf(String str) {
        try {
            int identifier = this.AFInAppEventParameterName.AFKeystoreWrapper.getResources().getIdentifier(str, TypedValues.Custom.S_STRING, this.AFInAppEventParameterName.AFKeystoreWrapper.getPackageName());
            if (identifier != 0) {
                return this.AFInAppEventParameterName.AFKeystoreWrapper.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e) {
            AFLogger.afErrorLog(new StringBuilder("Could not load string resource!").append(e.getMessage()).toString(), e);
            return null;
        }
    }
}
