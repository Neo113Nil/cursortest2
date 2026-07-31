package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFc1sSDK {
    static JSONObject valueOf(String str) {
        JSONObject valueOf = AFa1oSDK.valueOf(str);
        if (valueOf != null) {
            try {
                if (valueOf.has("ol_id")) {
                    String optString = valueOf.optString("ol_scheme", null);
                    String optString2 = valueOf.optString("ol_domain", null);
                    String optString3 = valueOf.optString("ol_ver", null);
                    if (optString != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                    }
                    if (optString2 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                    }
                    if (optString3 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_VERSION, optString3);
                        return valueOf;
                    }
                }
            } catch (Throwable th) {
                AFLogger.afErrorLogForExcManagerOnly(new StringBuilder("Error in handleResponse: ").append(th.getMessage()).toString(), th);
                AFb1tSDK.AFInAppEventType().values().afInfoLog().valueOf();
                AFb1tSDK.AFInAppEventType().values().afInfoLog().AFInAppEventParameterName();
            }
        }
        return valueOf;
    }
}
