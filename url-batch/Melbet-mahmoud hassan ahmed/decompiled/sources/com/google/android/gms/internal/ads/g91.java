package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g91 implements kv3<hi1<vf1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<hv1> f5493a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f5494b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<u22> f5495c;

    public g91(yv3<hv1> yv3Var, yv3<Executor> yv3Var2, yv3<u22> yv3Var3) {
        this.f5493a = yv3Var;
        this.f5494b = yv3Var2;
        this.f5495c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        hv1 a7 = this.f5493a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return ((Boolean) sw.c().b(m10.f8287q6)).booleanValue() ? new hi1(this.f5495c.a(), dc3Var) : new hi1(a7, dc3Var);
    }
}
