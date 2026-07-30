package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class n91 implements Executor {
    public static final Logger j = Logger.getLogger(n91.class.getName());
    public final Executor d;
    public final ArrayDeque e = new ArrayDeque();
    public int g = 1;
    public long h = 0;
    public final lf i = new lf(this);

    public n91(Executor executor) {
        y90.i(executor);
        this.d = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y90.i(runnable);
        synchronized (this.e) {
            int i = this.g;
            if (i != 4 && i != 3) {
                long j2 = this.h;
                boolean z = true;
                m51 m51Var = new m51(runnable, 1);
                this.e.add(m51Var);
                this.g = 2;
                try {
                    this.d.execute(this.i);
                    if (this.g != 2) {
                        return;
                    }
                    synchronized (this.e) {
                        try {
                            if (this.h == j2 && this.g == 2) {
                                this.g = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.e) {
                        try {
                            int i2 = this.g;
                            if ((i2 != 1 && i2 != 2) || !this.e.removeLastOccurrence(m51Var)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                            return;
                        } finally {
                        }
                    }
                }
            }
            this.e.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.d + "}";
    }
}
