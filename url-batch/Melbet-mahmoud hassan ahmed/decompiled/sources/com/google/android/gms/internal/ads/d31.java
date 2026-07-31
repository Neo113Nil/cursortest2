package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d31 implements kv3<w21> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<un> f4057a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<lc0> f4058b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f4059c;

    public d31(yv3<un> yv3Var, yv3<lc0> yv3Var2, yv3<Executor> yv3Var3) {
        this.f4057a = yv3Var;
        this.f4058b = yv3Var2;
        this.f4059c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        un a7 = this.f4057a.a();
        lc0 a8 = this.f4058b.a();
        dc3 a9 = yu2.a();
        sv3.b(a9);
        return new w21(a7.c(), a8, a9);
    }
}
