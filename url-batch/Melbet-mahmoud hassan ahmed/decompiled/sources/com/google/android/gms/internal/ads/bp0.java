package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class bp0<T> implements cc3<T> {

    /* renamed from: f, reason: collision with root package name */
    private final kc3<T> f3485f = kc3.E();

    private static final boolean a(boolean z6) {
        if (!z6) {
            y2.t.p().r(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.cc3
    public final void b(Runnable runnable, Executor executor) {
        this.f3485f.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        return this.f3485f.cancel(z6);
    }

    public final boolean e(T t6) {
        boolean w6 = this.f3485f.w(t6);
        a(w6);
        return w6;
    }

    public final boolean f(Throwable th) {
        boolean x6 = this.f3485f.x(th);
        a(x6);
        return x6;
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.f3485f.get();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j7, TimeUnit timeUnit) {
        return this.f3485f.get(j7, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3485f.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3485f.isDone();
    }
}
