package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class eb3<V> extends pa3<Object, V> {

    /* renamed from: u, reason: collision with root package name */
    private db3<?> f4555u;

    eb3(z63<? extends cc3<?>> z63Var, boolean z6, Executor executor, Callable<V> callable) {
        super(z63Var, z6, false);
        this.f4555u = new cb3(this, callable, executor);
        U();
    }

    @Override // com.google.android.gms.internal.ads.pa3
    final void M(int i7) {
        super.M(i7);
        if (i7 == 1) {
            this.f4555u = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.pa3
    final void S(int i7, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.pa3
    final void T() {
        db3<?> db3Var = this.f4555u;
        if (db3Var != null) {
            db3Var.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.ga3
    protected final void t() {
        db3<?> db3Var = this.f4555u;
        if (db3Var != null) {
            db3Var.g();
        }
    }
}
