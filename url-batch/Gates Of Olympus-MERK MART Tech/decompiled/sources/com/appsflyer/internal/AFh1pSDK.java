package com.appsflyer.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFh1pSDK {
    public final int AFInAppEventParameterName;
    public final long AFInAppEventType;
    public final int AFKeystoreWrapper;
    public final String values;

    public AFh1pSDK(String str, int i, int i2, long j) {
        this.values = str;
        this.AFKeystoreWrapper = i;
        this.AFInAppEventParameterName = i2;
        this.AFInAppEventType = j;
    }

    public final String AFKeystoreWrapper() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.values);
            jSONObject.put("min", this.AFKeystoreWrapper);
            jSONObject.put("expire", this.AFInAppEventParameterName);
            jSONObject.put("ttl", this.AFInAppEventType);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final int hashCode() {
        String str = this.values;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.AFKeystoreWrapper) * 31) + this.AFInAppEventParameterName) * 31) + ((int) this.AFInAppEventType);
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AFh1pSDK aFh1pSDK = (AFh1pSDK) obj;
            if (this.AFKeystoreWrapper == aFh1pSDK.AFKeystoreWrapper && this.AFInAppEventParameterName == aFh1pSDK.AFInAppEventParameterName && this.AFInAppEventType == aFh1pSDK.AFInAppEventType && (str = this.values) != null && str.equals(aFh1pSDK.values)) {
                return true;
            }
        }
        return false;
    }
}
