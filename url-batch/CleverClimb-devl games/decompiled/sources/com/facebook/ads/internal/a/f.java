package com.facebook.ads.internal.a;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f4885a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4886b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4887c;

    /* renamed from: d, reason: collision with root package name */
    private final List<String> f4888d;
    private final String e;
    private final String f;

    private f(String str, String str2, String str3, List<String> list, String str4, String str5) {
        this.f4885a = str;
        this.f4886b = str2;
        this.f4887c = str3;
        this.f4888d = list;
        this.e = str4;
        this.f = str5;
    }

    public static f a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("package");
        String optString2 = jSONObject.optString("appsite");
        String optString3 = jSONObject.optString("appsite_url");
        JSONArray optJSONArray = jSONObject.optJSONArray("key_hashes");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
            }
        }
        return new f(optString, optString2, optString3, arrayList, jSONObject.optString("market_uri"), jSONObject.optString("fallback_url"));
    }

    public String a() {
        return this.f4885a;
    }

    public String b() {
        return this.f4886b;
    }

    public String c() {
        return this.f4887c;
    }
}
