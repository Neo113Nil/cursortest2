package com.facebook.ads.internal.o;

import android.text.TextUtils;
import com.facebook.ads.internal.o.f;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static e f5275a = new e();

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            eVar = f5275a;
        }
        return eVar;
    }

    private g a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONArray("placements").getJSONObject(0);
        com.facebook.ads.internal.h.c cVar = new com.facebook.ads.internal.h.c(com.facebook.ads.internal.h.d.a(jSONObject2.getJSONObject("definition")), jSONObject2.optString("feature_config"));
        if (jSONObject2.has("ads")) {
            JSONArray jSONArray = jSONObject2.getJSONArray("ads");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                cVar.a(new com.facebook.ads.internal.h.a(jSONObject3.optString("adapter"), jSONObject3.optJSONObject("data"), jSONObject3.optJSONArray("trackers")));
            }
        }
        return new g(cVar, jSONObject.optString("server_request_id"), jSONObject.optString("server_response"), jSONObject.optString("an_validation_uuid"));
    }

    private h b(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONArray("placements").getJSONObject(0);
            return new h(jSONObject.optString(TJAdUnitConstants.String.MESSAGE, ""), jSONObject.optInt("code", 0), new com.facebook.ads.internal.h.c(com.facebook.ads.internal.h.d.a(jSONObject2.getJSONObject("definition")), jSONObject2.optString("feature_config")));
        } catch (JSONException unused) {
            return c(jSONObject);
        }
    }

    private h c(JSONObject jSONObject) {
        return new h(jSONObject.optString(TJAdUnitConstants.String.MESSAGE, ""), jSONObject.optInt("code", 0), null);
    }

    public f a(String str) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("type");
            char c2 = 65535;
            int hashCode = optString.hashCode();
            if (hashCode != 96432) {
                if (hashCode == 96784904 && optString.equals("error")) {
                    c2 = 1;
                }
            } else if (optString.equals("ads")) {
                c2 = 0;
            }
            switch (c2) {
                case 0:
                    return a(jSONObject);
                case 1:
                    return b(jSONObject);
                default:
                    JSONObject optJSONObject = jSONObject.optJSONObject("error");
                    if (optJSONObject != null) {
                        return c(optJSONObject);
                    }
                    break;
            }
        }
        return new f(f.a.UNKNOWN);
    }
}
