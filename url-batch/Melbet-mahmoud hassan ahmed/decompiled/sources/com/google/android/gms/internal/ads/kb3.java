package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class kb3<V> extends v63 implements Future<V> {
    protected kb3() {
    }

    protected abstract Future<? extends V> f();

    @Override // java.util.concurrent.Future
    public final V get() {
        return f().get();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j7, TimeUnit timeUnit) {
        return f().get(j7, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return f().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return f().isDone();
    }
}
