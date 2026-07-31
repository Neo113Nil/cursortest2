package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class nc0 implements h80 {

    /* renamed from: a, reason: collision with root package name */
    private final bp0 f9041a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ oc0 f9042b;

    public nc0(oc0 oc0Var, bp0 bp0Var) {
        this.f9042b = oc0Var;
        this.f9041a = bp0Var;
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void a(JSONObject jSONObject) {
        try {
            this.f9041a.e(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e7) {
            this.f9041a.f(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void b(String str) {
        try {
            if (str == null) {
                this.f9041a.f(new qb0());
            } else {
                this.f9041a.f(new qb0(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
