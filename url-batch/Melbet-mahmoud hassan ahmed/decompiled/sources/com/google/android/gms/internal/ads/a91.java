package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a91 implements kv3<hi1<qb1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<kf1> f2684a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f2685b;

    public a91(yv3<kf1> yv3Var, yv3<Executor> yv3Var2) {
        this.f2684a = yv3Var;
        this.f2685b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new hi1(this.f2684a.a(), this.f2685b.a());
    }
}
