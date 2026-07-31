package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class yv {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20484a = "errMsg";

    public static JSONObject a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", str);
            jSONObject.put("adViewId", str2);
            return jSONObject;
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
            return jSONObject;
        }
    }
}
