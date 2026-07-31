package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class cx1 {

    /* renamed from: a, reason: collision with root package name */
    private Long f3972a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3973b;

    /* renamed from: c, reason: collision with root package name */
    private String f3974c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f3975d;

    /* renamed from: e, reason: collision with root package name */
    private String f3976e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f3977f;

    /* synthetic */ cx1(String str, bx1 bx1Var) {
        this.f3973b = str;
    }

    static /* bridge */ /* synthetic */ String a(cx1 cx1Var) {
        String str = (String) sw.c().b(m10.X6);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", cx1Var.f3972a);
            jSONObject.put("eventCategory", cx1Var.f3973b);
            jSONObject.putOpt("event", cx1Var.f3974c);
            jSONObject.putOpt("errorCode", cx1Var.f3975d);
            jSONObject.putOpt("rewardType", cx1Var.f3976e);
            jSONObject.putOpt("rewardAmount", cx1Var.f3977f);
        } catch (JSONException unused) {
            io0.g("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(\"h5adsEvent\",");
        sb.append(jSONObject2);
        sb.append(");");
        return sb.toString();
    }
}
