package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFa1pSDK implements AFe1zSDK<AFa1oSDK> {
    @Override // com.appsflyer.internal.AFe1zSDK
    public final /* synthetic */ AFa1oSDK getRevenue(String str) {
        JSONObject optJSONObject;
        DeepLink deepLink = null;
        if (str == null || str.length() == 0) {
            return new AFa1oSDK(false, null, 3, null);
        }
        JSONObject jSONObject = new JSONObject(str);
        boolean optBoolean = jSONObject.optBoolean("found", false);
        boolean optBoolean2 = jSONObject.optBoolean("is_second_ping", true);
        if (optBoolean && (optJSONObject = jSONObject.optJSONObject("click_event")) != null) {
            deepLink = DeepLink.getMediationNetwork(optJSONObject);
            deepLink.AFAdRevenueData.put("is_deferred", true);
        }
        return new AFa1oSDK(optBoolean2, deepLink);
    }
}
