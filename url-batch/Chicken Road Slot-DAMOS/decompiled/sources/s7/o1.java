package s7;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o1 extends x1 {

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicLong f8895y = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: i, reason: collision with root package name */
    public n1 f8896i;

    /* renamed from: r, reason: collision with root package name */
    public n1 f8897r;

    /* renamed from: s, reason: collision with root package name */
    public final PriorityBlockingQueue f8898s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedBlockingQueue f8899t;

    /* renamed from: u, reason: collision with root package name */
    public final l1 f8900u;

    /* renamed from: v, reason: collision with root package name */
    public final l1 f8901v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f8902w;

    /* renamed from: x, reason: collision with root package name */
    public final Semaphore f8903x;

    public o1(q1 q1Var) {
        super(q1Var);
        this.f8902w = new Object();
        this.f8903x = new Semaphore(2);
        this.f8898s = new PriorityBlockingQueue();
        this.f8899t = new LinkedBlockingQueue();
        this.f8900u = new l1(this, "Thread death: Uncaught exception on worker thread");
        this.f8901v = new l1(this, "Thread death: Uncaught exception on network thread");
    }

    public final m1 A(Callable callable) {
        u();
        m1 m1Var = new m1(this, callable, true);
        if (Thread.currentThread() == this.f8896i) {
            m1Var.run();
            return m1Var;
        }
        F(m1Var);
        return m1Var;
    }

    public final void B(Runnable runnable) {
        u();
        c7.c0.g(runnable);
        F(new m1(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object C(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            o1 o1Var = ((q1) this.f1478d).f8938u;
            q1.l(o1Var);
            o1Var.B(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                v0 v0Var = ((q1) this.f1478d).f8937t;
                q1.l(v0Var);
                t0 t0Var = v0Var.f9053w;
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                t0Var.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            v0 v0Var2 = ((q1) this.f1478d).f8937t;
            q1.l(v0Var2);
            v0Var2.f9053w.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void D(Runnable runnable) {
        u();
        F(new m1(this, runnable, true, "Task exception on worker thread"));
    }

    public final void E(Runnable runnable) {
        u();
        m1 m1Var = new m1(this, runnable, false, "Task exception on network thread");
        synchronized (this.f8902w) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f8899t;
                linkedBlockingQueue.add(m1Var);
                n1 n1Var = this.f8897r;
                if (n1Var == null) {
                    n1 n1Var2 = new n1(this, "Measurement Network", linkedBlockingQueue);
                    this.f8897r = n1Var2;
                    n1Var2.setUncaughtExceptionHandler(this.f8901v);
                    this.f8897r.start();
                } else {
                    Object obj = n1Var.f8865d;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void F(m1 m1Var) {
        synchronized (this.f8902w) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f8898s;
                priorityBlockingQueue.add(m1Var);
                n1 n1Var = this.f8896i;
                if (n1Var == null) {
                    n1 n1Var2 = new n1(this, "Measurement Worker", priorityBlockingQueue);
                    this.f8896i = n1Var2;
                    n1Var2.setUncaughtExceptionHandler(this.f8900u);
                    this.f8896i.start();
                } else {
                    Object obj = n1Var.f8865d;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c1.b
    public final void s() {
        if (Thread.currentThread() == this.f8896i) {
            return;
        }
        kotlin.collections.i0.l("Call expected from worker thread");
    }

    @Override // s7.x1
    public final boolean t() {
        return false;
    }

    public final void w() {
        if (Thread.currentThread() == this.f8897r) {
            return;
        }
        kotlin.collections.i0.l("Call expected from network thread");
    }

    public final void x() {
        if (Thread.currentThread() != this.f8896i) {
            return;
        }
        kotlin.collections.i0.l("Call not expected from worker thread");
    }

    public final boolean y() {
        return Thread.currentThread() == this.f8896i;
    }

    public final m1 z(Callable callable) {
        u();
        m1 m1Var = new m1(this, callable, false);
        if (Thread.currentThread() != this.f8896i) {
            F(m1Var);
            return m1Var;
        }
        if (!this.f8898s.isEmpty()) {
            v0 v0Var = ((q1) this.f1478d).f8937t;
            q1.l(v0Var);
            v0Var.f9053w.a("Callable skipped the worker queue.");
        }
        m1Var.run();
        return m1Var;
    }
}
