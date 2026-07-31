package m6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class g1 extends f1 {

    /* renamed from: h, reason: collision with root package name */
    private final Executor f19287h;

    public g1(Executor executor) {
        this.f19287h = executor;
        kotlinx.coroutines.internal.d.a(S());
    }

    private final void R(y5.g gVar, RejectedExecutionException rejectedExecutionException) {
        s1.c(gVar, e1.a("The task was rejected", rejectedExecutionException));
    }

    @Override // m6.f0
    public void P(y5.g gVar, Runnable runnable) {
        try {
            Executor S = S();
            c.a();
            S.execute(runnable);
        } catch (RejectedExecutionException e7) {
            c.a();
            R(gVar, e7);
            w0.b().P(gVar, runnable);
        }
    }

    public Executor S() {
        return this.f19287h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor S = S();
        ExecutorService executorService = S instanceof ExecutorService ? (ExecutorService) S : null;
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
    }

    public boolean equals(Object obj) {
        return (obj instanceof g1) && ((g1) obj).S() == S();
    }

    public int hashCode() {
        return System.identityHashCode(S());
    }

    @Override // m6.f0
    public String toString() {
        return S().toString();
    }
}
