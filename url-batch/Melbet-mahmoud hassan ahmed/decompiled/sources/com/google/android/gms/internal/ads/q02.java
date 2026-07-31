package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q02 implements kv3<p02> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<bw0> f10496a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f10497b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<po0> f10498c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<ks2> f10499d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<Executor> f10500e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<String> f10501f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<rd1> f10502g;

    /* renamed from: h, reason: collision with root package name */
    private final yv3<vd1> f10503h;

    public q02(yv3<bw0> yv3Var, yv3<Context> yv3Var2, yv3<po0> yv3Var3, yv3<ks2> yv3Var4, yv3<Executor> yv3Var5, yv3<String> yv3Var6, yv3<rd1> yv3Var7, yv3<vd1> yv3Var8) {
        this.f10496a = yv3Var;
        this.f10497b = yv3Var2;
        this.f10498c = yv3Var3;
        this.f10499d = yv3Var4;
        this.f10500e = yv3Var5;
        this.f10501f = yv3Var6;
        this.f10502g = yv3Var7;
        this.f10503h = yv3Var8;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p02 a() {
        bw0 a7 = this.f10496a.a();
        Context b7 = ((nt2) this.f10497b).b();
        po0 b8 = ((rw0) this.f10498c).b();
        ks2 b9 = ((ma1) this.f10499d).b();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new p02(a7, b7, b8, b9, dc3Var, this.f10501f.a(), ((sd1) this.f10502g).a(), ((wd1) this.f10503h).a());
    }
}
