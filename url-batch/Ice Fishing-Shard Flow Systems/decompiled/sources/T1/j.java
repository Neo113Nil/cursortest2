package T1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import t1.u;

/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public static final Logger f2591n = Logger.getLogger(j.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final Executor f2592d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f2593e = new ArrayDeque();

    /* renamed from: i, reason: collision with root package name */
    public int f2594i = 1;

    /* renamed from: l, reason: collision with root package name */
    public long f2595l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final F.a f2596m = new F.a(this);

    public j(Executor executor) {
        u.f(executor);
        this.f2592d = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        u.f(runnable);
        synchronized (this.f2593e) {
            int i2 = this.f2594i;
            if (i2 != 4 && i2 != 3) {
                long j = this.f2595l;
                i iVar = new i(runnable, 0);
                this.f2593e.add(iVar);
                this.f2594i = 2;
                try {
                    this.f2592d.execute(this.f2596m);
                    if (this.f2594i != 2) {
                        return;
                    }
                    synchronized (this.f2593e) {
                        try {
                            if (this.f2595l == j && this.f2594i == 2) {
                                this.f2594i = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e7) {
                    synchronized (this.f2593e) {
                        try {
                            int i5 = this.f2594i;
                            boolean z7 = true;
                            if ((i5 != 1 && i5 != 2) || !this.f2593e.removeLastOccurrence(iVar)) {
                                z7 = false;
                            }
                            if (!(e7 instanceof RejectedExecutionException) || z7) {
                                throw e7;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f2593e.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f2592d + "}";
    }
}
