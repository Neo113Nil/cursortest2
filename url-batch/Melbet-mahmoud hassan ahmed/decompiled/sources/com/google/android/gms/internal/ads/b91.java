package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b91 implements kv3<hi1<wc1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<kf1> f3287a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f3288b;

    public b91(yv3<kf1> yv3Var, yv3<Executor> yv3Var2) {
        this.f3287a = yv3Var;
        this.f3288b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new hi1(this.f3287a.a(), this.f3288b.a());
    }
}
