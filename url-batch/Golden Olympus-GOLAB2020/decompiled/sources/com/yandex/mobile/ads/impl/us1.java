package com.yandex.mobile.ads.impl;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public abstract class us1<R, E extends Exception> implements RunnableFuture<R> {

    /* renamed from: b, reason: collision with root package name */
    private final vq f33239b = new vq();

    /* renamed from: c, reason: collision with root package name */
    private final vq f33240c = new vq();

    /* renamed from: d, reason: collision with root package name */
    private final Object f33241d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private Exception f33242e;

    /* renamed from: f, reason: collision with root package name */
    private Thread f33243f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f33244g;

    protected us1() {
    }

    public final void a() {
        this.f33240c.b();
    }

    protected abstract void b();

    protected abstract void c();

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        synchronized (this.f33241d) {
            try {
                if (!this.f33244g && !this.f33240c.d()) {
                    this.f33244g = true;
                    b();
                    Thread thread = this.f33243f;
                    if (thread == null) {
                        this.f33239b.e();
                        this.f33240c.e();
                    } else if (z4) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        this.f33240c.a();
        if (this.f33244g) {
            throw new CancellationException();
        }
        if (this.f33242e == null) {
            return null;
        }
        throw new ExecutionException(this.f33242e);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f33244g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f33240c.d();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f33241d) {
            try {
                if (this.f33244g) {
                    return;
                }
                this.f33243f = Thread.currentThread();
                this.f33239b.e();
                try {
                    try {
                        c();
                        synchronized (this.f33241d) {
                            this.f33240c.e();
                            this.f33243f = null;
                            Thread.interrupted();
                        }
                    } catch (Exception e4) {
                        this.f33242e = e4;
                        synchronized (this.f33241d) {
                            this.f33240c.e();
                            this.f33243f = null;
                            Thread.interrupted();
                        }
                    }
                } catch (Throwable th) {
                    synchronized (this.f33241d) {
                        this.f33240c.e();
                        this.f33243f = null;
                        Thread.interrupted();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final R get(long j4, TimeUnit timeUnit) {
        if (this.f33240c.a(TimeUnit.MILLISECONDS.convert(j4, timeUnit))) {
            if (!this.f33244g) {
                if (this.f33242e == null) {
                    return null;
                }
                throw new ExecutionException(this.f33242e);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }
}
