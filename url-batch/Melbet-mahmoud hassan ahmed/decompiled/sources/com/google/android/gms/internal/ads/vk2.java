package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class vk2 implements ij2<hj2<JSONObject>> {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f13429a;

    vk2(Context context) {
        this.f13429a = gj0.c(context);
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<hj2<JSONObject>> a() {
        return rb3.i(new hj2() { // from class: com.google.android.gms.internal.ads.uk2
            @Override // com.google.android.gms.internal.ads.hj2
            public final void c(Object obj) {
                vk2.this.b((JSONObject) obj);
            }
        });
    }

    final /* synthetic */ void b(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f13429a);
        } catch (JSONException unused) {
            a3.r1.k("Failed putting version constants.");
        }
    }
}
