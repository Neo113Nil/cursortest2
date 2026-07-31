package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class l51 implements kv3<Set<hi1<zn>>> {

    /* renamed from: a, reason: collision with root package name */
    private final b51 f7819a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<n61> f7820b;

    public l51(b51 b51Var, yv3<n61> yv3Var) {
        this.f7819a = b51Var;
        this.f7820b = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Set singleton = Collections.singleton(new hi1(this.f7820b.a(), wo0.f13899f));
        sv3.b(singleton);
        return singleton;
    }
}
