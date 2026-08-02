package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class J1 implements W {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f5864a;

    /* renamed from: b, reason: collision with root package name */
    public final I1 f5865b = new I1(this);

    public J1(H1 h1) {
        this.f5864a = new WeakReference(h1);
    }

    @Override // com.google.android.gms.internal.play_billing.W
    public final void a(Runnable runnable, Executor executor) {
        this.f5865b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        H1 h1 = (H1) this.f5864a.get();
        boolean cancel = this.f5865b.cancel(z);
        if (!cancel || h1 == null) {
            return cancel;
        }
        h1.f5851a = null;
        h1.f5852b = null;
        h1.f5853c.h(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f5865b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5865b.f5842a instanceof C0332l0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5865b.isDone();
    }

    public final String toString() {
        return this.f5865b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        return this.f5865b.get(j4, timeUnit);
    }
}
