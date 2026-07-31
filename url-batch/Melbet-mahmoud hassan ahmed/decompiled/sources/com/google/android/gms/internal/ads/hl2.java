package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hl2 implements hj2<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f6329a;

    public hl2(Bundle bundle) {
        this.f6329a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (this.f6329a != null) {
            try {
                a3.a1.f(a3.a1.f(jSONObject2, "device"), "play_store").put("parental_controls", y2.t.q().M(this.f6329a));
            } catch (JSONException unused) {
                a3.r1.k("Failed putting parental controls bundle.");
            }
        }
    }
}
