package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w81 implements kv3<hi1<yu>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<kf1> f13753a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f13754b;

    public w81(yv3<kf1> yv3Var, yv3<Executor> yv3Var2) {
        this.f13753a = yv3Var;
        this.f13754b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new hi1(this.f13753a.a(), this.f13754b.a());
    }
}
