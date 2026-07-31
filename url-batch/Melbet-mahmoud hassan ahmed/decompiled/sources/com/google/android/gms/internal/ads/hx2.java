package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class hx2 implements kv3<gx2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f6446a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<po0> f6447b;

    public hx2(yv3<Context> yv3Var, yv3<po0> yv3Var2) {
        this.f6446a = yv3Var;
        this.f6447b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final gx2 a() {
        return new gx2(((gw0) this.f6446a).b(), ((rw0) this.f6447b).b());
    }
}
