package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class U implements W {

    /* renamed from: b, reason: collision with root package name */
    public static final V f5913b = new V(U.class);

    /* renamed from: a, reason: collision with root package name */
    public final Object f5914a;

    public U(Object obj) {
        this.f5914a = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.W
    public final void a(Runnable runnable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (Exception e4) {
            f5913b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e4);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f5914a;
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
        return super.toString() + "[status=SUCCESS, result=[" + this.f5914a.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f5914a;
    }
}
