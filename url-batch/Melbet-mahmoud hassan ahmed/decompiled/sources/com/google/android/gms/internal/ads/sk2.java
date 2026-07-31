package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sk2 implements hj2<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f11850a;

    public sk2(JSONObject jSONObject) {
        this.f11850a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(JSONObject jSONObject) {
        try {
            jSONObject.put("cache_state", this.f11850a);
        } catch (JSONException unused) {
            a3.r1.k("Unable to get cache_state");
        }
    }
}
