package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import v2.a;

/* loaded from: classes.dex */
public final class zj2 implements hj2<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final a.C0146a f15164a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15165b;

    public zj2(a.C0146a c0146a, String str) {
        this.f15164a = c0146a;
        this.f15165b = str;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(JSONObject jSONObject) {
        try {
            JSONObject f7 = a3.a1.f(jSONObject, "pii");
            a.C0146a c0146a = this.f15164a;
            if (c0146a == null || TextUtils.isEmpty(c0146a.a())) {
                f7.put("pdid", this.f15165b);
                f7.put("pdidtype", "ssaid");
            } else {
                f7.put("rdid", this.f15164a.a());
                f7.put("is_lat", this.f15164a.b());
                f7.put("idtype", "adid");
            }
        } catch (JSONException e7) {
            a3.r1.l("Failed putting Ad ID.", e7);
        }
    }
}
