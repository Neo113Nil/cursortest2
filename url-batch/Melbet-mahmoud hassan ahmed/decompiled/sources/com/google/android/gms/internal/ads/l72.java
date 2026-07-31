package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l72 implements kv3<k72> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f7854a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<po0> f7855b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<gk1> f7856c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<Executor> f7857d;

    public l72(yv3<Context> yv3Var, yv3<po0> yv3Var2, yv3<gk1> yv3Var3, yv3<Executor> yv3Var4) {
        this.f7854a = yv3Var;
        this.f7855b = yv3Var2;
        this.f7856c = yv3Var3;
        this.f7857d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Context a7 = this.f7854a.a();
        po0 b7 = ((rw0) this.f7855b).b();
        gk1 a8 = this.f7856c.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new k72(a7, b7, a8, dc3Var);
    }
}
