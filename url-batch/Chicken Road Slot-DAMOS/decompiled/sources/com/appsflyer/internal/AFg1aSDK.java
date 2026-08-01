package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFg1aSDK {
    public static String getCurrencyIso4217Code(String str) {
        return str.length() > 20 ? str.substring(0, 10).concat("...") : str;
    }

    private static String getMonetizationNetwork(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (i3 == 0 || i3 == str.length() - 1) {
                sb2.append(str.charAt(i3));
            } else {
                sb2.append("*");
            }
        }
        return sb2.toString();
    }

    public static void getRevenue(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    jSONObject.put("appsflyerKey", getMonetizationNetwork(jSONObject.getString("appsflyerKey")));
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", getCurrencyIso4217Code("tcstring"));
                }
                if (jSONObject.has("referrer")) {
                    jSONObject.put("referrer", getCurrencyIso4217Code("referrer"));
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(jSONObject);
                aFLogger.i(aFg1cSDK, sb2.toString());
            } catch (JSONException e2) {
                AFLogger.INSTANCE.e(AFg1cSDK.OTHER, "Not able to log the payload", e2);
            }
        }
    }
}
