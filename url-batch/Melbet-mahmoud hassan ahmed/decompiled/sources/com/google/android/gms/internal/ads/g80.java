package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
final class g80 implements h80 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bp0 f5483a;

    g80(i80 i80Var, bp0 bp0Var) {
        this.f5483a = bp0Var;
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void a(JSONObject jSONObject) {
        this.f5483a.e(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.h80
    public final void b(String str) {
        this.f5483a.f(new qb0(str));
    }
}
