package defpackage;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class htf extends AbstractExecutorService implements AutoCloseable, hvl {
    protected htf() {
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: bw, reason: merged with bridge method [inline-methods] */
    public final hvi submit(Runnable runnable) {
        return (hvi) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: bx, reason: merged with bridge method [inline-methods] */
    public final hvi submit(Callable callable) {
        return (hvi) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: by, reason: merged with bridge method [inline-methods] */
    public final hvi submit(Runnable runnable, Object obj) {
        return (hvi) super.submit(runnable, obj);
    }

    public /* synthetic */ void close() {
        a.d(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return new hwd(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return hwd.d(runnable, obj);
    }
}
