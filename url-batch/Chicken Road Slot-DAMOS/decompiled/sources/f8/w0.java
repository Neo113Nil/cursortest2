package f8;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w0 implements Executor {

    /* renamed from: t, reason: collision with root package name */
    public static final Logger f4191t = Logger.getLogger(w0.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final Executor f4192d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f4193e = new ArrayDeque();

    /* renamed from: i, reason: collision with root package name */
    public int f4194i = 1;

    /* renamed from: r, reason: collision with root package name */
    public long f4195r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final j0 f4196s = new j0(this, 7);

    public w0(Executor executor) {
        executor.getClass();
        this.f4192d = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f4193e) {
            int i3 = this.f4194i;
            if (i3 != 4 && i3 != 3) {
                long j = this.f4195r;
                v0 v0Var = new v0(runnable, 0);
                this.f4193e.add(v0Var);
                this.f4194i = 2;
                try {
                    this.f4192d.execute(this.f4196s);
                    if (this.f4194i != 2) {
                        return;
                    }
                    synchronized (this.f4193e) {
                        try {
                            if (this.f4195r == j && this.f4194i == 2) {
                                this.f4194i = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e2) {
                    synchronized (this.f4193e) {
                        try {
                            int i10 = this.f4194i;
                            boolean z10 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f4193e.removeLastOccurrence(v0Var)) {
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
            this.f4193e.add(runnable);
        }
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        String valueOf = String.valueOf(this.f4192d);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 32);
        sb2.append("SequentialExecutor@");
        sb2.append(identityHashCode);
        sb2.append("{");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
