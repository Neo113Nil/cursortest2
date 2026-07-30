package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFf1vSDK {
    public final String AFInAppEventParameterName;
    public final AFe1mSDK AFInAppEventType;
    private final boolean AFKeystoreWrapper;
    public final AFf1xSDK valueOf;
    public final String values;

    public AFf1vSDK(String str) throws JSONException {
        AFf1xSDK aFf1xSDK;
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.values = string;
            this.AFKeystoreWrapper = jSONObject.optBoolean("test_mode");
            this.AFInAppEventParameterName = str;
            if (string.startsWith("default")) {
                aFf1xSDK = AFf1xSDK.DEFAULT;
            } else {
                aFf1xSDK = AFf1xSDK.CUSTOM;
            }
            this.valueOf = aFf1xSDK;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFf1vSDK aFf1vSDK = (AFf1vSDK) obj;
        if (this.AFKeystoreWrapper == aFf1vSDK.AFKeystoreWrapper && this.values.equals(aFf1vSDK.values)) {
            return this.AFInAppEventParameterName.equals(aFf1vSDK.AFInAppEventParameterName);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.AFKeystoreWrapper ? 1 : 0) * 31) + this.values.hashCode()) * 31) + this.AFInAppEventParameterName.hashCode();
        AFe1mSDK aFe1mSDK = this.AFInAppEventType;
        return aFe1mSDK != null ? (hashCode * 31) + aFe1mSDK.hashCode() : hashCode;
    }
}
