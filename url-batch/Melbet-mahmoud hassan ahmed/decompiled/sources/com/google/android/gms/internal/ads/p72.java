package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class p72 implements kv3<o72> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f10114a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<gk1> f10115b;

    public p72(yv3<Context> yv3Var, yv3<gk1> yv3Var2) {
        this.f10114a = yv3Var;
        this.f10115b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o72 a() {
        return new o72(this.f10114a.a(), this.f10115b.a());
    }
}
