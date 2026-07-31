package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mv1 implements kv3<hi1<xd1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<jv1> f8732a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f8733b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<w22> f8734c;

    public mv1(yv3<jv1> yv3Var, yv3<Executor> yv3Var2, yv3<w22> yv3Var3) {
        this.f8732a = yv3Var;
        this.f8733b = yv3Var2;
        this.f8734c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        jv1 a7 = this.f8732a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return ((Boolean) sw.c().b(m10.f8287q6)).booleanValue() ? new hi1(this.f8734c.a(), dc3Var) : new hi1(a7, dc3Var);
    }
}
