package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class el2 implements hj2<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f4657a;

    public el2(List<String> list) {
        this.f4657a = list;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(JSONObject jSONObject) {
        try {
            jSONObject.put("eid", TextUtils.join(",", this.f4657a));
        } catch (JSONException unused) {
            a3.r1.k("Failed putting experiment ids.");
        }
    }
}
