package com.baidu.ar;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    public String f2766a;

    /* renamed from: b, reason: collision with root package name */
    public Map<String, gc> f2767b;

    public m1(String str) {
        this.f2766a = str;
    }

    public gc a(String str) {
        Map<String, gc> a8 = a();
        if (a8.containsKey(str)) {
            return a8.get(str);
        }
        return null;
    }

    public final Map<String, gc> a() {
        Map<String, gc> map = this.f2767b;
        if (map != null) {
            return map;
        }
        this.f2767b = new HashMap();
        File file = new File(this.f2766a.concat(File.separator).concat("res_config.json"));
        if (file.exists()) {
            try {
                JSONArray optJSONArray = new JSONObject(j4.k(file)).optJSONArray("res");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    for (int i8 = 0; i8 < length; i8++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
                        if (optJSONObject != null) {
                            gc gcVar = new gc();
                            gcVar.f2336a = optJSONObject.getString("resPath");
                            gcVar.f2337b = optJSONObject.optString("resId");
                            gcVar.f2338c = optJSONObject.optString("encoding");
                            optJSONObject.optString("md5");
                            this.f2767b.put(gcVar.f2336a, gcVar);
                        }
                    }
                }
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
        }
        return this.f2767b;
    }
}
