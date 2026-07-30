package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFf1vSDK {
    public final String AFInAppEventParameterName;
    public final AFe1mSDK AFInAppEventType;
    private final boolean AFKeystoreWrapper;
    public final AFf1xSDK valueOf;
    public final String values;

    public AFf1vSDK(String str) {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.values = string;
            this.AFKeystoreWrapper = jSONObject.optBoolean("test_mode");
            this.AFInAppEventParameterName = str;
            this.valueOf = string.startsWith("default") ? AFf1xSDK.DEFAULT : AFf1xSDK.CUSTOM;
            JSONObject optJSONObject = jSONObject.optJSONObject("features");
            this.AFInAppEventType = optJSONObject != null ? new AFe1mSDK(optJSONObject) : null;
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFf1vSDK.class != obj.getClass()) {
            return false;
        }
        AFf1vSDK aFf1vSDK = (AFf1vSDK) obj;
        if (this.AFKeystoreWrapper == aFf1vSDK.AFKeystoreWrapper && this.values.equals(aFf1vSDK.values)) {
            return this.AFInAppEventParameterName.equals(aFf1vSDK.AFInAppEventParameterName);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.AFInAppEventParameterName.hashCode() + ((this.values.hashCode() + ((this.AFKeystoreWrapper ? 1 : 0) * 31)) * 31);
        AFe1mSDK aFe1mSDK = this.AFInAppEventType;
        if (aFe1mSDK == null) {
            return hashCode;
        }
        return aFe1mSDK.hashCode() + (hashCode * 31);
    }
}
