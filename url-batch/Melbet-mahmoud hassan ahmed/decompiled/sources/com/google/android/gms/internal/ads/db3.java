package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
abstract class db3<T> extends ac3<T> {

    /* renamed from: h, reason: collision with root package name */
    private final Executor f4155h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ eb3 f4156i;

    db3(eb3 eb3Var, Executor executor) {
        this.f4156i = eb3Var;
        Objects.requireNonNull(executor);
        this.f4155h = executor;
    }

    @Override // com.google.android.gms.internal.ads.ac3
    final void d(Throwable th) {
        this.f4156i.f4555u = null;
        if (th instanceof ExecutionException) {
            this.f4156i.x(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.f4156i.cancel(false);
        } else {
            this.f4156i.x(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.ac3
    final void e(T t6) {
        this.f4156i.f4555u = null;
        h(t6);
    }

    @Override // com.google.android.gms.internal.ads.ac3
    final boolean f() {
        return this.f4156i.isDone();
    }

    abstract void h(T t6);

    final void i() {
        try {
            this.f4155h.execute(this);
        } catch (RejectedExecutionException e7) {
            this.f4156i.x(e7);
        }
    }
}
