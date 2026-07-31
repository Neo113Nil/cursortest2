package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class e12 implements kv3<c12> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f4456a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<pm0> f4457b;

    public e12(yv3<Context> yv3Var, yv3<pm0> yv3Var2) {
        this.f4456a = yv3Var;
        this.f4457b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c12 a() {
        return new c12(((nt2) this.f4456a).b(), this.f4457b.a());
    }
}
