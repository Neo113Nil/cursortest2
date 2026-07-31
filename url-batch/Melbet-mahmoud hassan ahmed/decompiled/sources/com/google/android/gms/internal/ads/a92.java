package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a92 implements kv3<z82> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f2686a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f2687b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ms1> f2688c;

    public a92(yv3<Context> yv3Var, yv3<Executor> yv3Var2, yv3<ms1> yv3Var3) {
        this.f2686a = yv3Var;
        this.f2687b = yv3Var2;
        this.f2688c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new z82(this.f2686a.a(), this.f2687b.a(), this.f2688c.a());
    }
}
