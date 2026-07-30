package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1qSDK {
    static JSONObject getMonetizationNetwork(String str) {
        JSONObject AFAdRevenueData = AFg1eSDK.AFAdRevenueData(str);
        if (AFAdRevenueData != null) {
            try {
                if (AFAdRevenueData.has("ol_id")) {
                    String optString = AFAdRevenueData.optString("ol_scheme", null);
                    String optString2 = AFAdRevenueData.optString("ol_domain", null);
                    String optString3 = AFAdRevenueData.optString("ol_ver", null);
                    if (optString != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                    }
                    if (optString2 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                    }
                    if (optString3 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_VERSION, optString3);
                    }
                }
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, new StringBuilder("Error in handleResponse: ").append(th.getMessage()).toString(), th, false, false, true);
                AFa1ySDK.getRevenue().getMonetizationNetwork().copy().getRevenue();
                AFa1ySDK.getRevenue().getMonetizationNetwork().copy().getMediationNetwork();
            }
        }
        return AFAdRevenueData;
    }
}
