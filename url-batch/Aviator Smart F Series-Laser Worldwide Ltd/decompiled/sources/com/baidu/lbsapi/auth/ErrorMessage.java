package com.baidu.lbsapi.auth;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class ErrorMessage {
    ErrorMessage() {
    }

    static String a(int i8, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i8);
            jSONObject.put("message", str);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    static String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", -1);
            jSONObject.put("message", str);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
