package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ok2 implements hj2<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final String f9698a;

    public ok2(String str) {
        this.f9698a = str;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(JSONObject jSONObject) {
        try {
            JSONObject f7 = a3.a1.f(jSONObject, "pii");
            if (TextUtils.isEmpty(this.f9698a)) {
                return;
            }
            f7.put("attok", this.f9698a);
        } catch (JSONException e7) {
            a3.r1.l("Failed putting attestation token.", e7);
        }
    }
}
