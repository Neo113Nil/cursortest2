package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class vj1 implements kv3<Set<hi1<va1>>> {

    /* renamed from: a, reason: collision with root package name */
    private final nj1 f13422a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<u91> f13423b;

    public vj1(nj1 nj1Var, yv3<u91> yv3Var) {
        this.f13422a = nj1Var;
        this.f13423b = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Set<hi1<va1>> f7 = this.f13422a.f(this.f13423b.a());
        sv3.b(f7);
        return f7;
    }
}
