package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFb1tSDK {
    public AFf1vSDK AFInAppEventParameterName;
    public long AFInAppEventType;
    public final AFb1fSDK AFKeystoreWrapper;
    public long values;

    public AFb1tSDK(AFb1fSDK aFb1fSDK) {
        this.AFKeystoreWrapper = aFb1fSDK;
        this.AFInAppEventParameterName = values();
        this.values = aFb1fSDK.values("af_rc_timestamp", 0L);
        this.AFInAppEventType = aFb1fSDK.values("af_rc_max_age", 0L);
    }

    public static JSONObject AFInAppEventParameterName(String str) {
        JSONObject valueOf = AFa1rSDK.valueOf(str);
        if (valueOf != null) {
            try {
                boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
                boolean optBoolean = valueOf.optBoolean("monitor", false);
                AFb1wSDK afErrorLogForExcManagerOnly = AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly();
                if (!optBoolean || z) {
                    afErrorLogForExcManagerOnly.AFInAppEventParameterName();
                    afErrorLogForExcManagerOnly.valueOf();
                } else {
                    afErrorLogForExcManagerOnly.AFKeystoreWrapper();
                }
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
                StringBuilder sb = new StringBuilder("Error in handleResponse: ");
                sb.append(th.getMessage());
                AFLogger.afErrorLogForExcManagerOnly(sb.toString(), th);
                AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventParameterName();
                AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().valueOf();
            }
        }
        return valueOf;
    }

    private AFf1vSDK values() {
        String valueOf = this.AFKeystoreWrapper.valueOf("af_remote_config", (String) null);
        if (valueOf == null) {
            AFLogger.afDebugLog("CFG: No configuration found in cache");
            return null;
        }
        try {
            return new AFf1vSDK(new String(Base64.decode(valueOf, 2), Charset.defaultCharset()));
        } catch (Exception e) {
            AFLogger.afErrorLog("CFG: Error reading malformed configuration from cache, requires fetching from remote again", e, true);
            return null;
        }
    }

    public AFb1tSDK() {
    }
}
