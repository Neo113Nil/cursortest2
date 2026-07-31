package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class eg2 implements kv3<cg2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f4605a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<dc3> f4606b;

    public eg2(yv3<Context> yv3Var, yv3<dc3> yv3Var2) {
        this.f4605a = yv3Var;
        this.f4606b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Context a7 = this.f4605a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new cg2(a7, dc3Var);
    }
}
