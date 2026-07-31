package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class fc0 implements h80 {

    /* renamed from: a, reason: collision with root package name */
    private final hb0 f5077a;

    /* renamed from: b, reason: collision with root package name */
    private final bp0 f5078b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ gc0 f5079c;

    public fc0(gc0 gc0Var, hb0 hb0Var, bp0 bp0Var) {
        this.f5079c = gc0Var;
        this.f5077a = hb0Var;
        this.f5078b = bp0Var;
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void a(JSONObject jSONObject) {
        tb0 tb0Var;
        try {
            try {
                bp0 bp0Var = this.f5078b;
                tb0Var = this.f5079c.f5553a;
                bp0Var.e(tb0Var.b(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e7) {
                this.f5078b.f(e7);
            }
        } finally {
            this.f5077a.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void b(String str) {
        try {
            if (str == null) {
                this.f5078b.f(new qb0());
            } else {
                this.f5078b.f(new qb0(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.f5077a.g();
            throw th;
        }
        this.f5077a.g();
    }
}
