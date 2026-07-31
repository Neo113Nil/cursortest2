package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r92 implements kv3<q92> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f11075a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<po0> f11076b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ks2> f11077c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<Executor> f11078d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<ms1> f11079e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<et1> f11080f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<w70> f11081g;

    public r92(yv3<Context> yv3Var, yv3<po0> yv3Var2, yv3<ks2> yv3Var3, yv3<Executor> yv3Var4, yv3<ms1> yv3Var5, yv3<et1> yv3Var6, yv3<w70> yv3Var7) {
        this.f11075a = yv3Var;
        this.f11076b = yv3Var2;
        this.f11077c = yv3Var3;
        this.f11078d = yv3Var4;
        this.f11079e = yv3Var5;
        this.f11080f = yv3Var6;
        this.f11081g = yv3Var7;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new q92(this.f11075a.a(), ((rw0) this.f11076b).b(), ((ma1) this.f11077c).b(), this.f11078d.a(), this.f11079e.a(), this.f11080f.a(), new w70());
    }
}
