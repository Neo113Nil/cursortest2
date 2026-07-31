package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class e82 implements kv3<d82> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f4522a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<dl1> f4523b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<po0> f4524c;

    public e82(yv3<Context> yv3Var, yv3<dl1> yv3Var2, yv3<po0> yv3Var3) {
        this.f4522a = yv3Var;
        this.f4523b = yv3Var2;
        this.f4524c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new d82(this.f4522a.a(), this.f4523b.a(), ((rw0) this.f4524c).b());
    }
}
