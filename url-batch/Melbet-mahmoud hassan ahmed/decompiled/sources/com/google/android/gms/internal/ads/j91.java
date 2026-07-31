package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j91 implements kv3<hi1<pi1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<kf1> f7030a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f7031b;

    public j91(yv3<kf1> yv3Var, yv3<Executor> yv3Var2) {
        this.f7030a = yv3Var;
        this.f7031b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new hi1(this.f7030a.a(), this.f7031b.a());
    }
}
