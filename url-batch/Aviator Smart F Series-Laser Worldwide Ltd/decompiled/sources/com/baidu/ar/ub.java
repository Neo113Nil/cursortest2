package com.baidu.ar;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class ub {

    /* renamed from: a, reason: collision with root package name */
    public String f3411a;

    /* renamed from: b, reason: collision with root package name */
    public String f3412b;

    public String a() {
        return this.f3411a;
    }

    public String b() {
        return this.f3412b;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", a());
            jSONObject.put("appKey", b());
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    public void a(String str) {
        this.f3411a = str;
    }

    public void b(String str) {
        this.f3412b = str;
    }
}
