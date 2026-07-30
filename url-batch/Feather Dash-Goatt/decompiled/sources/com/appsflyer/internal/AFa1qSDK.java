package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFa1qSDK {
    public static JSONObject AFAdRevenueData(String str) {
        JSONObject currencyIso4217Code = AFg1lSDK.getCurrencyIso4217Code(str);
        if (currencyIso4217Code != null) {
            try {
                if (currencyIso4217Code.has("ol_id")) {
                    String optString = currencyIso4217Code.optString("ol_scheme", null);
                    String optString2 = currencyIso4217Code.optString("ol_domain", null);
                    String optString3 = currencyIso4217Code.optString("ol_ver", null);
                    if (optString != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                    }
                    if (optString2 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                    }
                    if (optString3 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_VERSION, optString3);
                        return currencyIso4217Code;
                    }
                }
            } catch (Throwable th) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb = new StringBuilder("Error in handleResponse: ");
                sb.append(th.getMessage());
                aFLogger.e(aFg1cSDK, sb.toString(), th, false, false, true);
                AFa1tSDK.getMediationNetwork().getRevenue().copy().getMediationNetwork();
                AFa1tSDK.getMediationNetwork().getRevenue().copy().AFAdRevenueData();
            }
        }
        return currencyIso4217Code;
    }
}
