package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class cb2 implements kv3<bb2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f3790a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<gk1> f3791b;

    public cb2(yv3<Context> yv3Var, yv3<gk1> yv3Var2) {
        this.f3790a = yv3Var;
        this.f3791b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bb2 a() {
        return new bb2(this.f3790a.a(), this.f3791b.a());
    }
}
