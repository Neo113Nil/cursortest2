package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pv1 implements kv3<hi1<ow2>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<aw1> f10391a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f10392b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<d32> f10393c;

    public pv1(yv3<aw1> yv3Var, yv3<Executor> yv3Var2, yv3<d32> yv3Var3) {
        this.f10391a = yv3Var;
        this.f10392b = yv3Var2;
        this.f10393c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        aw1 a7 = this.f10391a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return ((Boolean) sw.c().b(m10.f8287q6)).booleanValue() ? new hi1(this.f10393c.a(), dc3Var) : new hi1(a7, dc3Var);
    }
}
