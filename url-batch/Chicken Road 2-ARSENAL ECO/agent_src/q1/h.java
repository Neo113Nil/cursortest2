package q1;

import D0.p;
import U0.t;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class h implements Executor {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f5775k = Logger.getLogger(h.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public final Executor f5776f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f5777g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public int f5778h = 1;

    /* renamed from: i, reason: collision with root package name */
    public long f5779i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final A.a f5780j = new A.a(this);

    public h(Executor executor) {
        t.f(executor);
        this.f5776f = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        t.f(runnable);
        synchronized (this.f5777g) {
            int i7 = this.f5778h;
            if (i7 != 4 && i7 != 3) {
                long j4 = this.f5779i;
                p pVar = new p(runnable, 2);
                this.f5777g.add(pVar);
                this.f5778h = 2;
                try {
                    this.f5776f.execute(this.f5780j);
                    if (this.f5778h != 2) {
                        return;
                    }
                    synchronized (this.f5777g) {
                        try {
                            if (this.f5779i == j4 && this.f5778h == 2) {
                                this.f5778h = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e4) {
                    synchronized (this.f5777g) {
                        try {
                            int i8 = this.f5778h;
                            boolean z5 = true;
                            if ((i8 != 1 && i8 != 2) || !this.f5777g.removeLastOccurrence(pVar)) {
                                z5 = false;
                            }
                            if (!(e4 instanceof RejectedExecutionException) || z5) {
                                throw e4;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f5777g.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f5776f + "}";
    }
}
