package io.appmetrica.analytics.idsync.impl;

import android.util.Base64;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public final class v {
    public static String a(D d4) {
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", d4.f9878a);
        jSONObject.put("url", d4.f9880c);
        jSONObject.put("responseCode", d4.f9882e);
        byte[] bArr = d4.f9883f;
        try {
            encodeToString = new String(bArr, AbstractC1504a.f15936a);
        } catch (Throwable unused) {
            encodeToString = Base64.encodeToString(bArr, 0);
        }
        jSONObject.put("responseBody", encodeToString);
        Map map = d4.f9884g;
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject2.putOpt((String) entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        jSONObject.put("responseHeaders", jSONObject2);
        return jSONObject.toString();
    }
}
