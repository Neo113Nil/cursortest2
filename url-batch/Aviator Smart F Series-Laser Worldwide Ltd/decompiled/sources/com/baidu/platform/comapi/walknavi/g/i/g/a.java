package com.baidu.platform.comapi.walknavi.g.i.g;

import com.baidu.platform.comapi.walknavi.g.i.e.b;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    public static b a(JSONObject jSONObject) {
        b bVar = new b();
        try {
            if (jSONObject.has("err_code")) {
                bVar.a(jSONObject.getInt("err_code"));
            }
            if (jSONObject.has("err_msg")) {
                bVar.c(jSONObject.getString("err_msg"));
            }
            if (jSONObject.has("ret")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("ret");
                if (jSONObject2.has("ar_key")) {
                    bVar.d(jSONObject2.getString("ar_key"));
                }
                if (jSONObject2.has("ar_resource")) {
                    bVar.f(jSONObject2.getString("ar_resource"));
                }
                if (jSONObject2.has("ar_resource_urls")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("ar_resource_urls");
                    String[] strArr = new String[jSONArray.length()];
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        strArr[i8] = jSONArray.getString(i8);
                    }
                    bVar.a(strArr);
                }
                if (jSONObject2.has("redirect_url")) {
                    bVar.e(jSONObject2.getString("redirect_url"));
                }
                if (jSONObject2.has("version_code")) {
                    bVar.g(jSONObject2.getString("version_code"));
                }
                if (jSONObject2.has("ar_type")) {
                    bVar.b(Integer.parseInt(jSONObject2.getString("ar_type")));
                }
                if (jSONObject2.has("md5")) {
                    bVar.h(jSONObject2.getString("md5"));
                }
                if (jSONObject2.has("hardware_satisfied")) {
                    bVar.a(jSONObject2.getBoolean("hardware_satisfied"));
                }
                if (jSONObject2.has("ac_id")) {
                    bVar.a(jSONObject2.getString("ac_id"));
                }
                if (jSONObject2.has("refused")) {
                    if (Integer.parseInt(jSONObject2.getString("refused")) == 1) {
                        bVar.b(true);
                    } else {
                        bVar.b(false);
                    }
                }
                bVar.b(jSONObject2.optString("ar_code_url"));
            }
        } catch (Exception unused) {
        }
        return bVar;
    }
}
