package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f91 implements kv3<hi1<jd1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<kf1> f5049a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f5050b;

    public f91(yv3<kf1> yv3Var, yv3<Executor> yv3Var2) {
        this.f5049a = yv3Var;
        this.f5050b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new hi1(this.f5049a.a(), this.f5050b.a());
    }
}
