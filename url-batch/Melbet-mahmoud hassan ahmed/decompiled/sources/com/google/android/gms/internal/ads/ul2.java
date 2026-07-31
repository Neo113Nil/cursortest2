package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ul2 implements hj2<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final String f12846a;

    public ul2(String str) {
        this.f12846a = str;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        try {
            if (TextUtils.isEmpty(this.f12846a)) {
                return;
            }
            a3.a1.f(jSONObject2, "pii").put("adsid", this.f12846a);
        } catch (JSONException e7) {
            io0.h("Failed putting trustless token.", e7);
        }
    }
}
