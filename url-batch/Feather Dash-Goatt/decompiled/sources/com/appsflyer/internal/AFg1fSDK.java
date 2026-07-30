package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFg1fSDK {
    public static void AFAdRevenueData(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    jSONObject.put("appsflyerKey", getCurrencyIso4217Code(jSONObject.getString("appsflyerKey")));
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", getMediationNetwork("tcstring"));
                }
                if (jSONObject.has("referrer")) {
                    jSONObject.put("referrer", getMediationNetwork("referrer"));
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(jSONObject);
                aFLogger.i(aFg1cSDK, sb.toString());
            } catch (JSONException e) {
                AFLogger.INSTANCE.e(AFg1cSDK.OTHER, "Not able to log the payload", e);
            }
        }
    }

    private static String getCurrencyIso4217Code(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb.append(str.charAt(i));
            } else {
                sb.append("*");
            }
        }
        return sb.toString();
    }

    public static String getMediationNetwork(String str) {
        return str.length() > 20 ? str.substring(0, 10).concat("...") : str;
    }
}
