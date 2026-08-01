package m8;

import c7.c0;
import f8.j0;
import f8.v0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: t, reason: collision with root package name */
    public static final Logger f6602t = Logger.getLogger(j.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final Executor f6603d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f6604e = new ArrayDeque();

    /* renamed from: i, reason: collision with root package name */
    public int f6605i = 1;

    /* renamed from: r, reason: collision with root package name */
    public long f6606r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final j0 f6607s = new j0(this, 13);

    public j(Executor executor) {
        c0.g(executor);
        this.f6603d = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c0.g(runnable);
        synchronized (this.f6604e) {
            int i3 = this.f6605i;
            if (i3 != 4 && i3 != 3) {
                long j = this.f6606r;
                v0 v0Var = new v0(runnable, 3);
                this.f6604e.add(v0Var);
                this.f6605i = 2;
                try {
                    this.f6603d.execute(this.f6607s);
                    if (this.f6605i != 2) {
                        return;
                    }
                    synchronized (this.f6604e) {
                        try {
                            if (this.f6606r == j && this.f6605i == 2) {
                                this.f6605i = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e2) {
                    synchronized (this.f6604e) {
                        try {
                            int i10 = this.f6605i;
                            boolean z10 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f6604e.removeLastOccurrence(v0Var)) {
                                z10 = false;
                            }
                            if (!(e2 instanceof RejectedExecutionException) || z10) {
                                throw e2;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f6604e.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f6603d + "}";
    }
}
