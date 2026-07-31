package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class kt2 implements kv3<jt2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f7637a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<xn0> f7638b;

    public kt2(yv3<Context> yv3Var, yv3<xn0> yv3Var2) {
        this.f7637a = yv3Var;
        this.f7638b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new jt2(((nt2) this.f7637a).b(), ((ot2) this.f7638b).a());
    }
}
