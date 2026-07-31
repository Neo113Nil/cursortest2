package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class mb3<V> extends kb3<V> implements cc3<V> {
    protected mb3() {
    }

    @Override // com.google.android.gms.internal.ads.cc3
    public final void b(Runnable runnable, Executor executor) {
        g().b(runnable, executor);
    }

    protected abstract cc3<? extends V> g();
}
