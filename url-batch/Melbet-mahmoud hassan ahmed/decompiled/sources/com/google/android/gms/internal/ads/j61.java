package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j61 implements kv3<e61> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<u61> f6987a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<b60> f6988b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Runnable> f6989c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<Executor> f6990d;

    public j61(yv3<u61> yv3Var, yv3<b60> yv3Var2, yv3<Runnable> yv3Var3, yv3<Executor> yv3Var4) {
        this.f6987a = yv3Var;
        this.f6988b = yv3Var2;
        this.f6989c = yv3Var3;
        this.f6990d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new e61(((s81) this.f6987a).a(), ((i61) this.f6988b).b(), ((h61) this.f6989c).b(), this.f6990d.a());
    }
}
