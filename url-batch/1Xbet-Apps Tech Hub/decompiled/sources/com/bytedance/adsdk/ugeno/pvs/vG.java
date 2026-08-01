package com.bytedance.adsdk.ugeno.pvs;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONObject;

/* compiled from: UGExpressionParser.java */
/* loaded from: classes.dex */
public class vG {
    public static String pvs(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return str;
        }
        try {
            if (!str.startsWith("${") || !str.endsWith("}")) {
                return str;
            }
            com.bytedance.adsdk.pvs.icD.pvs pvs = com.bytedance.adsdk.pvs.icD.pvs.pvs(str.substring(2, str.length() - 1));
            Object pvs2 = pvs.pvs(jSONObject);
            Log.d("ELParser", "el: " + str + "; result: " + pvs2);
            if (pvs2 instanceof String) {
                return (String) pvs.pvs(jSONObject);
            }
            if (pvs2 instanceof com.bytedance.adsdk.pvs.icD.pvs.pvs) {
                return String.valueOf(Jd.pvs((com.bytedance.adsdk.pvs.icD.pvs.pvs) pvs2));
            }
            return String.valueOf(pvs2);
        } catch (Throwable unused) {
            return str;
        }
    }
}
