package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qf2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f10673a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f10674b;

    public qf2(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f10673a = jSONObject;
        this.f10674b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        JSONObject jSONObject = this.f10673a;
        if (jSONObject != null) {
            bundle2.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f10674b;
        if (jSONObject2 != null) {
            bundle2.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
