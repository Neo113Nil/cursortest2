package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class qj1 implements kv3<Set<hi1<vf1>>> {

    /* renamed from: a, reason: collision with root package name */
    private final nj1 f10715a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<u91> f10716b;

    public qj1(nj1 nj1Var, yv3<u91> yv3Var) {
        this.f10715a = nj1Var;
        this.f10716b = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Set singleton = Collections.singleton(new hi1(this.f10716b.a(), wo0.f13899f));
        sv3.b(singleton);
        return singleton;
    }
}
