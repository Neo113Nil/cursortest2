package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i91 implements kv3<hi1<qb1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<hv1> f6575a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f6576b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<u22> f6577c;

    public i91(yv3<hv1> yv3Var, yv3<Executor> yv3Var2, yv3<u22> yv3Var3) {
        this.f6575a = yv3Var;
        this.f6576b = yv3Var2;
        this.f6577c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        hv1 a7 = this.f6575a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return ((Boolean) sw.c().b(m10.f8287q6)).booleanValue() ? new hi1(this.f6577c.a(), dc3Var) : new hi1(a7, dc3Var);
    }
}
