package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.eg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3157eg extends AbstractExecutorService implements SD {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f30448n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f30449u;

    public C3157eg(Executor executor) {
        this.f30449u = executor;
    }

    public final J3.a a(Runnable runnable) {
        return (J3.a) super.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j9, TimeUnit timeUnit) {
        switch (this.f30448n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f30449u).awaitTermination(j9, timeUnit);
        }
    }

    public final J3.a b(Callable callable) {
        return (J3.a) super.submit(callable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f30448n) {
            case 0:
                this.f30449u.execute(runnable);
                break;
            default:
                ((ExecutorService) this.f30449u).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.f30448n) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f30449u).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.f30448n) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f30449u).isTerminated();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC3083dE(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.f30448n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.f30449u).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.f30448n) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f30449u).shutdownNow();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (J3.a) super.submit(runnable);
    }

    public String toString() {
        switch (this.f30448n) {
            case 1:
                String obj = super.toString();
                String valueOf = String.valueOf((ExecutorService) this.f30449u);
                return com.anythink.basead.b.c.i.q(new StringBuilder(String.valueOf(obj).length() + 1 + valueOf.length() + 1), obj, "[", valueOf, "]");
            default:
                return super.toString();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC3083dE(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (J3.a) super.submit(runnable, obj);
    }

    public C3157eg(ExecutorService executorService) {
        executorService.getClass();
        this.f30449u = executorService;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (J3.a) super.submit(callable);
    }
}
