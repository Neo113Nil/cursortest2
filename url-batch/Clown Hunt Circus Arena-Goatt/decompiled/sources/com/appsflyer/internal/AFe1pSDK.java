package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFe1pSDK {
    public final String AFInAppEventType;
    public final int AFKeystoreWrapper;
    public final long valueOf;
    public final int values;

    public AFe1pSDK() {
    }

    static void AFInAppEventType(Map<String, Object> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1dSDK.valueOf().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            AFLogger.afDebugLog(new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n").append(map.toString()).toString());
            appsFlyerConversionListener.onConversionDataSuccess(map);
        }
    }

    static void AFInAppEventType(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1dSDK.valueOf().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            appsFlyerConversionListener.onConversionDataFail(str);
        }
    }

    public AFe1pSDK(String str, int i, int i2, long j) {
        this.AFInAppEventType = str;
        this.values = i;
        this.AFKeystoreWrapper = i2;
        this.valueOf = j;
    }

    public final String values() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.AFInAppEventType);
            jSONObject.put("min", this.values);
            jSONObject.put("expire", this.AFKeystoreWrapper);
            jSONObject.put("ttl", this.valueOf);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final int hashCode() {
        String str = this.AFInAppEventType;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.values) * 31) + this.AFKeystoreWrapper) * 31) + ((int) this.valueOf);
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AFe1pSDK aFe1pSDK = (AFe1pSDK) obj;
            if (this.values == aFe1pSDK.values && this.AFKeystoreWrapper == aFe1pSDK.AFKeystoreWrapper && this.valueOf == aFe1pSDK.valueOf && (str = this.AFInAppEventType) != null && str.equals(aFe1pSDK.AFInAppEventType)) {
                return true;
            }
        }
        return false;
    }
}
