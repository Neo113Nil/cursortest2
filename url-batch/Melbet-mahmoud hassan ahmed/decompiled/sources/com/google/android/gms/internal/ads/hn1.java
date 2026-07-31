package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class hn1 implements kv3<xl0> {

    /* renamed from: a, reason: collision with root package name */
    private final dn1 f6354a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f6355b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ks2> f6356c;

    public hn1(dn1 dn1Var, yv3<Context> yv3Var, yv3<ks2> yv3Var2) {
        this.f6354a = dn1Var;
        this.f6355b = yv3Var;
        this.f6356c = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final xl0 a() {
        return new xl0(((nt2) this.f6355b).b(), ((ma1) this.f6356c).b().f7620f);
    }
}
