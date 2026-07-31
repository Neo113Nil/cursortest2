package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fk2 implements hj2<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final String f5125a;

    public fk2(String str) {
        this.f5125a = str;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(JSONObject jSONObject) {
        try {
            jSONObject.put("ms", this.f5125a);
        } catch (JSONException e7) {
            a3.r1.l("Failed putting Ad ID.", e7);
        }
    }
}
