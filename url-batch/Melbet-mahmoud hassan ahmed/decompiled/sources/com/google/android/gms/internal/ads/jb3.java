package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class jb3<V> extends ib3<V> {

    /* renamed from: m, reason: collision with root package name */
    private final cc3<V> f7071m;

    jb3(cc3<V> cc3Var) {
        Objects.requireNonNull(cc3Var);
        this.f7071m = cc3Var;
    }

    @Override // com.google.android.gms.internal.ads.ga3, com.google.android.gms.internal.ads.cc3
    public final void b(Runnable runnable, Executor executor) {
        this.f7071m.b(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.ga3, java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return this.f7071m.cancel(z6);
    }

    @Override // com.google.android.gms.internal.ads.ga3, java.util.concurrent.Future
    public final V get() {
        return this.f7071m.get();
    }

    @Override // com.google.android.gms.internal.ads.ga3, java.util.concurrent.Future
    public final V get(long j7, TimeUnit timeUnit) {
        return this.f7071m.get(j7, timeUnit);
    }

    @Override // com.google.android.gms.internal.ads.ga3, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7071m.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.ga3, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7071m.isDone();
    }

    @Override // com.google.android.gms.internal.ads.ga3
    public final String toString() {
        return this.f7071m.toString();
    }
}
