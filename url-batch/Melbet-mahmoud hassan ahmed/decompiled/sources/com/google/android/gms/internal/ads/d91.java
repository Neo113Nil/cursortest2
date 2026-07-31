package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d91 implements kv3<hi1<z2.q>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<kf1> f4120a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f4121b;

    public d91(yv3<kf1> yv3Var, yv3<Executor> yv3Var2) {
        this.f4120a = yv3Var;
        this.f4121b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new hi1(this.f4120a.a(), this.f4121b.a());
    }
}
