package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lj3 extends ok3 {
    public static final AtomicLong w = new AtomicLong(Long.MIN_VALUE);
    public jj3 o;
    public jj3 p;
    public final PriorityBlockingQueue q;
    public final LinkedBlockingQueue r;
    public final gj3 s;
    public final gj3 t;
    public final Object u;
    public final Semaphore v;

    public lj3(pj3 pj3Var) {
        super(pj3Var);
        this.u = new Object();
        this.v = new Semaphore(2);
        this.q = new PriorityBlockingQueue();
        this.r = new LinkedBlockingQueue();
        this.s = new gj3(this, "Thread death: Uncaught exception on worker thread");
        this.t = new gj3(this, "Thread death: Uncaught exception on network thread");
    }

    public final void A() {
        if (Thread.currentThread() == this.p) {
            return;
        }
        lh.g("Call expected from network thread");
    }

    public final void B() {
        if (Thread.currentThread() != this.o) {
            return;
        }
        lh.g("Call not expected from worker thread");
    }

    public final boolean C() {
        return Thread.currentThread() == this.o;
    }

    public final ij3 D(Callable callable) {
        y();
        ij3 ij3Var = new ij3(this, callable, false);
        if (Thread.currentThread() != this.o) {
            J(ij3Var);
            return ij3Var;
        }
        if (!this.q.isEmpty()) {
            vh3 vh3Var = ((pj3) this.m).r;
            pj3.m(vh3Var);
            vh3Var.u.b("Callable skipped the worker queue.");
        }
        ij3Var.run();
        return ij3Var;
    }

    public final ij3 E(Callable callable) {
        y();
        ij3 ij3Var = new ij3(this, callable, true);
        if (Thread.currentThread() == this.o) {
            ij3Var.run();
            return ij3Var;
        }
        J(ij3Var);
        return ij3Var;
    }

    public final void F(Runnable runnable) {
        y();
        ll3.v(runnable);
        J(new ij3(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object G(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            lj3 lj3Var = ((pj3) this.m).s;
            pj3.m(lj3Var);
            lj3Var.F(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                vh3 vh3Var = ((pj3) this.m).r;
                pj3.m(vh3Var);
                g10 g10Var = vh3Var.u;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                g10Var.b(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            vh3 vh3Var2 = ((pj3) this.m).r;
            pj3.m(vh3Var2);
            vh3Var2.u.b("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void H(Runnable runnable) {
        y();
        J(new ij3(this, runnable, true, "Task exception on worker thread"));
    }

    public final void I(Runnable runnable) {
        y();
        ij3 ij3Var = new ij3(this, runnable, false, "Task exception on network thread");
        synchronized (this.u) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.r;
                linkedBlockingQueue.add(ij3Var);
                jj3 jj3Var = this.p;
                if (jj3Var == null) {
                    jj3 jj3Var2 = new jj3(this, "Measurement Network", linkedBlockingQueue);
                    this.p = jj3Var2;
                    jj3Var2.setUncaughtExceptionHandler(this.t);
                    this.p.start();
                } else {
                    Object obj = jj3Var.m;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void J(ij3 ij3Var) {
        synchronized (this.u) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.q;
                priorityBlockingQueue.add(ij3Var);
                jj3 jj3Var = this.o;
                if (jj3Var == null) {
                    jj3 jj3Var2 = new jj3(this, "Measurement Worker", priorityBlockingQueue);
                    this.o = jj3Var2;
                    jj3Var2.setUncaughtExceptionHandler(this.s);
                    this.o.start();
                } else {
                    Object obj = jj3Var.m;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rp3
    public final void v() {
        if (Thread.currentThread() == this.o) {
            return;
        }
        lh.g("Call expected from worker thread");
    }

    @Override // defpackage.ok3
    public final boolean x() {
        return false;
    }
}
