package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
final class k22 implements vb0<l22> {
    k22() {
    }

    @Override // com.google.android.gms.internal.ads.vb0
    public final /* bridge */ /* synthetic */ JSONObject a(l22 l22Var) {
        l22 l22Var2 = l22Var;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", l22Var2.f7790c.b());
        jSONObject2.put("signals", l22Var2.f7789b);
        jSONObject3.put("body", l22Var2.f7788a.f10032c);
        jSONObject3.put("headers", y2.t.q().N(l22Var2.f7788a.f10031b));
        jSONObject3.put("response_code", l22Var2.f7788a.f10030a);
        jSONObject3.put("latency", l22Var2.f7788a.f10033d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", l22Var2.f7790c.g());
        return jSONObject;
    }
}
