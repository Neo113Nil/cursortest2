package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class oj1 implements kv3<Set<hi1<mb1>>> {

    /* renamed from: a, reason: collision with root package name */
    private final nj1 f9688a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<u91> f9689b;

    public oj1(nj1 nj1Var, yv3<u91> yv3Var) {
        this.f9688a = nj1Var;
        this.f9689b = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Set singleton = Collections.singleton(new hi1(this.f9689b.a(), wo0.f13899f));
        sv3.b(singleton);
        return singleton;
    }
}
