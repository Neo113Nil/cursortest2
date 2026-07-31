package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class yj1 implements kv3<Set<hi1<sk1>>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<sk1> f14707a;

    public yj1(yv3<sk1> yv3Var) {
        this.f14707a = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Set singleton = Collections.singleton(new hi1(this.f14707a.a(), wo0.f13899f));
        sv3.b(singleton);
        return singleton;
    }
}
