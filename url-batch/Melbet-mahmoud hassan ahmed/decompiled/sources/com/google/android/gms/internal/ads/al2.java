package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class al2 implements hj2<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final String f2860a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2861b;

    public al2(String str, String str2) {
        this.f2860a = str;
        this.f2861b = str2;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(JSONObject jSONObject) {
        try {
            JSONObject f7 = a3.a1.f(jSONObject, "pii");
            f7.put("doritos", this.f2860a);
            f7.put("doritos_v2", this.f2861b);
        } catch (JSONException unused) {
            a3.r1.k("Failed putting doritos string.");
        }
    }
}
