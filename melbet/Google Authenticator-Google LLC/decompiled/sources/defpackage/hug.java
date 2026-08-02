package defpackage;

import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hug extends htf {
    private final hak a = new hak();
    private int b = 0;
    private boolean c = false;

    private final void a() {
        hak hakVar = this.a;
        synchronized (hakVar) {
            int i = this.b - 1;
            this.b = i;
            if (i == 0) {
                hakVar.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        hak hakVar = this.a;
        long nanos = timeUnit.toNanos(j);
        synchronized (hakVar) {
            while (true) {
                if (this.c && this.b == 0) {
                    return true;
                }
                if (nanos <= 0) {
                    return false;
                }
                long nanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(hakVar, nanos);
                nanos -= System.nanoTime() - nanoTime;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.a) {
            if (this.c) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            this.b++;
        }
        try {
            runnable.run();
        } finally {
            a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && this.b == 0) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        hak hakVar = this.a;
        synchronized (hakVar) {
            this.c = true;
            if (this.b == 0) {
                hakVar.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        shutdown();
        int i = hel.d;
        return his.a;
    }
}
