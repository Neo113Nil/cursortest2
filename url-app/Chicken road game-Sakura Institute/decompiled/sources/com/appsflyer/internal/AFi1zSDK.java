package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFi1zSDK {
    public final AFh1gSDK AFInAppEventParameterName;
    public final AFh1iSDK AFInAppEventType;
    public final String AFKeystoreWrapper;
    private final boolean valueOf;
    public final String values;

    public AFi1zSDK(String str) {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.AFKeystoreWrapper = string;
            this.valueOf = jSONObject.optBoolean("test_mode");
            this.values = str;
            this.AFInAppEventType = string.startsWith("default") ? AFh1iSDK.DEFAULT : AFh1iSDK.CUSTOM;
            JSONObject optJSONObject = jSONObject.optJSONObject("features");
            this.AFInAppEventParameterName = optJSONObject != null ? new AFh1gSDK(optJSONObject) : null;
        } catch (JSONException e4) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e4);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFi1zSDK.class != obj.getClass()) {
            return false;
        }
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        if (this.valueOf == aFi1zSDK.valueOf && this.AFKeystoreWrapper.equals(aFi1zSDK.AFKeystoreWrapper)) {
            return this.values.equals(aFi1zSDK.values);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.values.hashCode() + ((this.AFKeystoreWrapper.hashCode() + ((this.valueOf ? 1 : 0) * 31)) * 31);
        AFh1gSDK aFh1gSDK = this.AFInAppEventParameterName;
        return aFh1gSDK != null ? (hashCode * 31) + aFh1gSDK.hashCode() : hashCode;
    }
}
