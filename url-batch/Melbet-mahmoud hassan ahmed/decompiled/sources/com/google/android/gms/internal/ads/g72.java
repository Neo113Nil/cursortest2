package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g72 implements kv3<f72> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f5476a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<po0> f5477b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ks2> f5478c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<Executor> f5479d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<gk1> f5480e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<et1> f5481f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<w70> f5482g;

    public g72(yv3<Context> yv3Var, yv3<po0> yv3Var2, yv3<ks2> yv3Var3, yv3<Executor> yv3Var4, yv3<gk1> yv3Var5, yv3<et1> yv3Var6, yv3<w70> yv3Var7) {
        this.f5476a = yv3Var;
        this.f5477b = yv3Var2;
        this.f5478c = yv3Var3;
        this.f5479d = yv3Var4;
        this.f5480e = yv3Var5;
        this.f5481f = yv3Var6;
        this.f5482g = yv3Var7;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new f72(this.f5476a.a(), ((rw0) this.f5477b).b(), ((ma1) this.f5478c).b(), this.f5479d.a(), this.f5480e.a(), this.f5481f.a(), new w70());
    }
}
