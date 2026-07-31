package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class vb3<V> implements cc3<V> {

    /* renamed from: g, reason: collision with root package name */
    static final cc3<?> f13287g = new vb3(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Logger f13288h = Logger.getLogger(vb3.class.getName());

    /* renamed from: f, reason: collision with root package name */
    private final V f13289f;

    vb3(V v6) {
        this.f13289f = v6;
    }

    @Override // com.google.android.gms.internal.ads.cc3
    public final void b(Runnable runnable, Executor executor) {
        q43.c(runnable, "Runnable was null.");
        q43.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e7) {
            Logger logger = f13288h;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), (Throwable) e7);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.f13289f;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j7, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit);
        return this.f13289f;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f13289f);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 27 + valueOf.length());
        sb.append(obj);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }
}
