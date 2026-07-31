package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qb3<V> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f10639a;

    /* renamed from: b, reason: collision with root package name */
    private final e73<cc3<? extends V>> f10640b;

    /* synthetic */ qb3(boolean z6, e73 e73Var, pb3 pb3Var) {
        this.f10639a = z6;
        this.f10640b = e73Var;
    }

    public final <C> cc3<C> a(Callable<C> callable, Executor executor) {
        return new eb3(this.f10640b, this.f10639a, executor, callable);
    }
}
