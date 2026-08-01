package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFi1vSDK {
    public final String AFAdRevenueData;
    private final boolean getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final AFi1zSDK getMonetizationNetwork;
    public final AFh1dSDK getRevenue;

    public AFi1vSDK(String str) {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.AFAdRevenueData = string;
            this.getCurrencyIso4217Code = jSONObject.optBoolean("test_mode");
            this.getMediationNetwork = str;
            this.getRevenue = string.startsWith("default") ? AFh1dSDK.DEFAULT : AFh1dSDK.CUSTOM;
            JSONObject optJSONObject = jSONObject.optJSONObject("features");
            this.getMonetizationNetwork = optJSONObject != null ? new AFi1zSDK(optJSONObject) : null;
        } catch (JSONException e2) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e2);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFi1vSDK.class != obj.getClass()) {
            return false;
        }
        AFi1vSDK aFi1vSDK = (AFi1vSDK) obj;
        if (this.getCurrencyIso4217Code == aFi1vSDK.getCurrencyIso4217Code && this.AFAdRevenueData.equals(aFi1vSDK.AFAdRevenueData)) {
            return this.getMediationNetwork.equals(aFi1vSDK.getMediationNetwork);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.getMediationNetwork.hashCode() + ((this.AFAdRevenueData.hashCode() + ((this.getCurrencyIso4217Code ? 1 : 0) * 31)) * 31);
        AFi1zSDK aFi1zSDK = this.getMonetizationNetwork;
        if (aFi1zSDK == null) {
            return hashCode;
        }
        return aFi1zSDK.hashCode() + (hashCode * 31);
    }
}
