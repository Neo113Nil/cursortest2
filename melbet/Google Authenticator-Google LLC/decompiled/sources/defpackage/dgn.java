package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dgn extends AbstractExecutorService implements AutoCloseable {
    private final ExecutorService a;
    private final dgl b;

    private dgn(ExecutorService executorService, dgl dglVar) {
        this.a = executorService;
        this.b = dglVar;
    }

    public static ExecutorService a(gzp gzpVar, ExecutorService executorService) {
        return gzpVar.f() ? new dgn(executorService, (dgl) gzpVar.b()) : executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.d(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dgk a = this.b.a();
        ExecutorService executorService = this.a;
        if (a == null) {
            executorService.execute(runnable);
        } else {
            executorService.execute(new dgc(a, runnable, 2));
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    public final String toString() {
        return this.a.toString();
    }
}
