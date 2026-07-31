package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class rv2<E, V> implements cc3<V> {

    /* renamed from: f, reason: collision with root package name */
    private final E f11430f;

    /* renamed from: g, reason: collision with root package name */
    private final String f11431g;

    /* renamed from: h, reason: collision with root package name */
    private final cc3<V> f11432h;

    public rv2(E e7, String str, cc3<V> cc3Var) {
        this.f11430f = e7;
        this.f11431g = str;
        this.f11432h = cc3Var;
    }

    public final E a() {
        return this.f11430f;
    }

    @Override // com.google.android.gms.internal.ads.cc3
    public final void b(Runnable runnable, Executor executor) {
        this.f11432h.b(runnable, executor);
    }

    public final String c() {
        return this.f11431g;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return this.f11432h.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.f11432h.get();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j7, TimeUnit timeUnit) {
        return this.f11432h.get(j7, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11432h.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11432h.isDone();
    }

    public final String toString() {
        String str = this.f11431g;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }
}
