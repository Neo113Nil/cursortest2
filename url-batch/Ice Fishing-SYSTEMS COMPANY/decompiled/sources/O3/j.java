package O3;

import B2.RunnableC0272f;
import O2.w;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class j implements Executor {

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f2516y = Logger.getLogger(j.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final Executor f2517n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayDeque f2518u = new ArrayDeque();

    /* renamed from: v, reason: collision with root package name */
    public int f2519v = 1;

    /* renamed from: w, reason: collision with root package name */
    public long f2520w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final RunnableC0272f f2521x = new RunnableC0272f(this);

    public j(Executor executor) {
        w.h(executor);
        this.f2517n = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        w.h(runnable);
        synchronized (this.f2518u) {
            int i = this.f2519v;
            if (i != 4 && i != 3) {
                long j9 = this.f2520w;
                i iVar = new i(0, runnable);
                this.f2518u.add(iVar);
                this.f2519v = 2;
                try {
                    this.f2517n.execute(this.f2521x);
                    if (this.f2519v != 2) {
                        return;
                    }
                    synchronized (this.f2518u) {
                        try {
                            if (this.f2520w == j9 && this.f2519v == 2) {
                                this.f2519v = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e6) {
                    synchronized (this.f2518u) {
                        try {
                            int i4 = this.f2519v;
                            boolean z8 = true;
                            if ((i4 != 1 && i4 != 2) || !this.f2518u.removeLastOccurrence(iVar)) {
                                z8 = false;
                            }
                            if (!(e6 instanceof RejectedExecutionException) || z8) {
                                throw e6;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f2518u.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f2517n + "}";
    }
}
