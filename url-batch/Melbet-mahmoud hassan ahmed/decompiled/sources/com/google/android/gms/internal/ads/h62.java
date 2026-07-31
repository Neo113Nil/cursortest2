package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h62 implements kv3<g62> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f6083a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<r51> f6084b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f6085c;

    public h62(yv3<Context> yv3Var, yv3<r51> yv3Var2, yv3<Executor> yv3Var3) {
        this.f6083a = yv3Var;
        this.f6084b = yv3Var2;
        this.f6085c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new g62(this.f6083a.a(), this.f6084b.a(), this.f6085c.a());
    }
}
