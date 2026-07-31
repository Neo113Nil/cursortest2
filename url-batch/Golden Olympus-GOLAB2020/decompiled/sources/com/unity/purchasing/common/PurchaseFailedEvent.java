package com.unity.purchasing.common;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PurchaseFailedEvent {
    public static String jsonEncodePurchaseFailure(String str, PurchaseFailureReason purchaseFailureReason, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productId", str);
            jSONObject.put("reason", purchaseFailureReason);
            jSONObject.put(CrashHianalyticsData.MESSAGE, str2);
            return jSONObject.toString();
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }
}
