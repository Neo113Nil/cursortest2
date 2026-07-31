package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class wj1 implements kv3<xl0> {

    /* renamed from: a, reason: collision with root package name */
    private final nj1 f13837a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f13838b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ks2> f13839c;

    public wj1(nj1 nj1Var, yv3<Context> yv3Var, yv3<ks2> yv3Var2) {
        this.f13837a = nj1Var;
        this.f13838b = yv3Var;
        this.f13839c = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final xl0 a() {
        return new xl0(((nt2) this.f13838b).b(), ((ma1) this.f13839c).b().f7620f);
    }
}
