package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a82 implements kv3<z72> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f2677a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<dl1> f2678b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f2679c;

    public a82(yv3<Context> yv3Var, yv3<dl1> yv3Var2, yv3<Executor> yv3Var3) {
        this.f2677a = yv3Var;
        this.f2678b = yv3Var2;
        this.f2679c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new z72(this.f2677a.a(), this.f2678b.a(), this.f2679c.a());
    }
}
