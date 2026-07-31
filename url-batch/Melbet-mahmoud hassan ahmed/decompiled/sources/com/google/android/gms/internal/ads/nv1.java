package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class nv1 implements kv3<hi1<ya1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<jv1> f9343a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f9344b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<w22> f9345c;

    public nv1(yv3<jv1> yv3Var, yv3<Executor> yv3Var2, yv3<w22> yv3Var3) {
        this.f9343a = yv3Var;
        this.f9344b = yv3Var2;
        this.f9345c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        jv1 a7 = this.f9343a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return ((Boolean) sw.c().b(m10.f8287q6)).booleanValue() ? new hi1(this.f9345c.a(), dc3Var) : new hi1(a7, dc3Var);
    }
}
