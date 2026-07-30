package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1cSDK {
    public final String AFAdRevenueData;
    public final AFh1gSDK getCurrencyIso4217Code;
    public final AFh1aSDK getMediationNetwork;
    private final boolean getMonetizationNetwork;
    public final String getRevenue;

    public AFh1cSDK(String str) {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.AFAdRevenueData = string;
            this.getMonetizationNetwork = jSONObject.optBoolean("test_mode");
            this.getRevenue = str;
            this.getCurrencyIso4217Code = string.startsWith("default") ? AFh1gSDK.DEFAULT : AFh1gSDK.CUSTOM;
            JSONObject optJSONObject = jSONObject.optJSONObject("features");
            this.getMediationNetwork = optJSONObject != null ? new AFh1aSDK(optJSONObject) : null;
        } catch (JSONException e7) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e7);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFh1cSDK.class != obj.getClass()) {
            return false;
        }
        AFh1cSDK aFh1cSDK = (AFh1cSDK) obj;
        if (this.getMonetizationNetwork == aFh1cSDK.getMonetizationNetwork && this.AFAdRevenueData.equals(aFh1cSDK.AFAdRevenueData)) {
            return this.getRevenue.equals(aFh1cSDK.getRevenue);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.getRevenue.hashCode() + ((this.AFAdRevenueData.hashCode() + ((this.getMonetizationNetwork ? 1 : 0) * 31)) * 31);
        AFh1aSDK aFh1aSDK = this.getMediationNetwork;
        if (aFh1aSDK == null) {
            return hashCode;
        }
        return aFh1aSDK.hashCode() + (hashCode * 31);
    }
}
