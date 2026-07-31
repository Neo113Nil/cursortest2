package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AFh1oSDK {
    public final AFh1qSDK AFInAppEventParameterName;
    public final String AFInAppEventType;
    private final boolean AFKeystoreWrapper;
    public final String valueOf;
    public final AFh1vSDK values;

    public AFh1oSDK(String str) throws JSONException {
        AFh1vSDK aFh1vSDK;
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.valueOf = string;
            this.AFKeystoreWrapper = jSONObject.optBoolean("test_mode");
            this.AFInAppEventType = str;
            if (string.startsWith("default")) {
                aFh1vSDK = AFh1vSDK.DEFAULT;
            } else {
                aFh1vSDK = AFh1vSDK.CUSTOM;
            }
            this.values = aFh1vSDK;
            JSONObject optJSONObject = jSONObject.optJSONObject("features");
            this.AFInAppEventParameterName = optJSONObject != null ? new AFh1qSDK(optJSONObject) : null;
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
        AFh1oSDK aFh1oSDK = (AFh1oSDK) obj;
        if (this.AFKeystoreWrapper == aFh1oSDK.AFKeystoreWrapper && this.valueOf.equals(aFh1oSDK.valueOf)) {
            return this.AFInAppEventType.equals(aFh1oSDK.AFInAppEventType);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.AFKeystoreWrapper ? 1 : 0) * 31) + this.valueOf.hashCode()) * 31) + this.AFInAppEventType.hashCode();
        AFh1qSDK aFh1qSDK = this.AFInAppEventParameterName;
        return aFh1qSDK != null ? (hashCode * 31) + aFh1qSDK.hashCode() : hashCode;
    }
}
