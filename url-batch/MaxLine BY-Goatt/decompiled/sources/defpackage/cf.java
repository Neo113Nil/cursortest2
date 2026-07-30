package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cf implements Executor {
    public final /* synthetic */ int m;
    public final ArrayDeque n;
    public Runnable o;
    public final Object p;
    public final Executor q;

    public cf(Executor executor) {
        this.m = 1;
        executor.getClass();
        this.q = executor;
        this.n = new ArrayDeque();
        this.p = new Object();
    }

    public final void a() {
        switch (this.m) {
            case 0:
                synchronized (this.p) {
                    try {
                        Runnable runnable = (Runnable) this.n.poll();
                        this.o = runnable;
                        if (runnable != null) {
                            ((of3) this.q).execute(runnable);
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (this.p) {
                    try {
                        Object poll = this.n.poll();
                        Runnable runnable2 = (Runnable) poll;
                        this.o = runnable2;
                        if (poll != null) {
                            this.q.execute(runnable2);
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.m) {
            case 0:
                synchronized (this.p) {
                    try {
                        this.n.add(new q1(2, this, runnable));
                        if (this.o == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            default:
                runnable.getClass();
                synchronized (this.p) {
                    try {
                        this.n.offer(new q1(21, runnable, this));
                        if (this.o == null) {
                            a();
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public cf(of3 of3Var) {
        this.m = 0;
        this.p = new Object();
        this.n = new ArrayDeque();
        this.q = of3Var;
    }
}
