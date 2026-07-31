package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class vi2 implements kv3<si2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<pm0> f13412a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<dc3> f13413b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Context> f13414c;

    public vi2(yv3<pm0> yv3Var, yv3<dc3> yv3Var2, yv3<Context> yv3Var3) {
        this.f13412a = yv3Var;
        this.f13413b = yv3Var2;
        this.f13414c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        pm0 a7 = this.f13412a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new si2(a7, dc3Var, ((nt2) this.f13414c).b());
    }
}
