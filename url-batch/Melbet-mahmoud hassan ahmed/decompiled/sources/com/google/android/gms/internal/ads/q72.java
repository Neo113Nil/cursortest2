package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q72 implements c52<at2, y62> {

    /* renamed from: a, reason: collision with root package name */
    private final rt1 f10603a;

    public q72(rt1 rt1Var) {
        this.f10603a = rt1Var;
    }

    @Override // com.google.android.gms.internal.ads.c52
    public final d52<at2, y62> a(String str, JSONObject jSONObject) {
        return new d52<>(this.f10603a.b(str, jSONObject), new y62(), str);
    }
}
