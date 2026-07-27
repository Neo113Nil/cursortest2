package com.appsflyer.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1fSDK {
    public final long AFInAppEventParameterName;
    public final int AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final int valueOf;

    public AFh1fSDK(String str, int i2, int i4, long j4) {
        this.AFKeystoreWrapper = str;
        this.valueOf = i2;
        this.AFInAppEventType = i4;
        this.AFInAppEventParameterName = j4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && AFh1fSDK.class == obj.getClass()) {
            AFh1fSDK aFh1fSDK = (AFh1fSDK) obj;
            if (this.valueOf == aFh1fSDK.valueOf && this.AFInAppEventType == aFh1fSDK.AFInAppEventType && this.AFInAppEventParameterName == aFh1fSDK.AFInAppEventParameterName && (str = this.AFKeystoreWrapper) != null && str.equals(aFh1fSDK.AFKeystoreWrapper)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.AFKeystoreWrapper;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.valueOf) * 31) + this.AFInAppEventType) * 31) + ((int) this.AFInAppEventParameterName);
    }

    public final String valueOf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.AFKeystoreWrapper);
            jSONObject.put("min", this.valueOf);
            jSONObject.put("expire", this.AFInAppEventType);
            jSONObject.put("ttl", this.AFInAppEventParameterName);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
