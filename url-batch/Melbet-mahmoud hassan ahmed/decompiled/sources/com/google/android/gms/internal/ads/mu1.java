package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mu1 implements kv3<Set<hi1<ow2>>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Executor> f8728a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<fv1> f8729b;

    public mu1(yv3<Executor> yv3Var, yv3<fv1> yv3Var2) {
        this.f8728a = yv3Var;
        this.f8729b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        Set singleton = ((Boolean) sw.c().b(m10.f8322v3)).booleanValue() ? Collections.singleton(new hi1(((gv1) this.f8729b).a(), dc3Var)) : Collections.emptySet();
        sv3.b(singleton);
        return singleton;
    }
}
