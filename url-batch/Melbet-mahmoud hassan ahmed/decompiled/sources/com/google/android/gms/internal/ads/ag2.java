package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ag2 implements kv3<zf2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f2759a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<dc3> f2760b;

    public ag2(yv3<Context> yv3Var, yv3<dc3> yv3Var2) {
        this.f2759a = yv3Var;
        this.f2760b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Context b7 = ((nt2) this.f2759a).b();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new zf2(b7, dc3Var);
    }
}
