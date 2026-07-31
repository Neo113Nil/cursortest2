package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dy2 implements kv3<cy2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Executor> f4396a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<oo0> f4397b;

    public dy2(yv3<Executor> yv3Var, yv3<oo0> yv3Var2) {
        this.f4396a = yv3Var;
        this.f4397b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new cy2(dc3Var, this.f4397b.a());
    }
}
