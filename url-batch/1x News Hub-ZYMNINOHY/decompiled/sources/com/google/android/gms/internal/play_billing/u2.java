package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class u2 implements InterfaceFutureC0277y0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2940a;

    /* renamed from: b, reason: collision with root package name */
    public final t2 f2941b = new t2(this);

    public u2(s2 s2Var) {
        this.f2940a = new WeakReference(s2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC0277y0
    public final void a(Runnable runnable, Executor executor) {
        this.f2941b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        s2 s2Var = (s2) this.f2940a.get();
        boolean cancel = this.f2941b.cancel(z);
        if (!cancel || s2Var == null) {
            return cancel;
        }
        s2Var.f2925a = null;
        s2Var.f2926b = null;
        s2Var.f2927c.h(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f2941b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2941b.f2919a instanceof W0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2941b.isDone();
    }

    public final String toString() {
        return this.f2941b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f2941b.get(j3, timeUnit);
    }
}
