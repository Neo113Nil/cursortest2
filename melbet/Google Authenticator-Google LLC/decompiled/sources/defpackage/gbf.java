package defpackage;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbf implements ExecutorService, AutoCloseable {
    private static final hkh c = hkh.l("com/google/apps/tiktok/concurrent/SuspendableUiThreadExecutor");
    private final Executor d;
    private final boolean e;
    private boolean f;
    private hvi g;
    public final Deque a = new ArrayDeque();
    public int b = 1;
    private final hvu h = new hvu(this, 1);

    public gbf(Executor executor, boolean z) {
        this.d = executor;
        this.e = z;
    }

    public static /* synthetic */ void d(hvi hviVar) {
        try {
            hnu.aR(hviVar);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((hkf) ((hkf) ((hkf) c.f()).h(e.getCause())).i("com/google/apps/tiktok/concurrent/SuspendableUiThreadExecutor", "logOnFailure", (char) 427, "SuspendableUiThreadExecutor.java")).s("Silently ignored exception in SuspendableUiThreadExecutor.");
        }
    }

    public final Queue a() {
        ArrayDeque arrayDeque;
        Deque deque = this.a;
        synchronized (deque) {
            hoq.I(this.f, "Executor may only be drained when it is suspended.");
            arrayDeque = new ArrayDeque(deque);
            deque.clear();
        }
        return arrayDeque;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        fao.c();
        synchronized (this.a) {
            this.f = false;
        }
        execute(hvs.a);
    }

    public final void c() {
        fao.c();
        synchronized (this.a) {
            this.f = true;
            this.b = 1;
            hvi hviVar = this.g;
            if (hviVar != null) {
                hviVar.cancel(false);
                this.g = null;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.e(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean z;
        int i;
        runnable.getClass();
        Deque deque = this.a;
        synchronized (deque) {
            if (!this.f && (i = this.b) != 3 && i != 2) {
                deque.add(runnable);
                hvi aL = hnu.aL(gvx.h(this.h), this.d);
                this.g = aL;
                aL.c(gvx.h(new fnh(aL, 15)), huf.a);
                this.b = 2;
            }
            deque.add(runnable);
        }
        synchronized (this.a) {
            z = false;
            if (fao.g() && this.e && !this.f && this.b != 3) {
                hvi hviVar = this.g;
                hviVar.getClass();
                hviVar.cancel(false);
                this.g = null;
                this.b = 2;
                z = true;
            }
        }
        if (z) {
            this.h.run();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return hnu.aM(new bsp(runnable, obj, 19, null), this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return hnu.aL(runnable, this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return hnu.aM(callable, this);
    }
}
