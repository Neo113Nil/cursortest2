package f8;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class q0 extends AtomicReference implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final b7.p0 f4168d;

    /* renamed from: e, reason: collision with root package name */
    public static final b7.p0 f4169e;

    static {
        int i3 = 2;
        f4168d = new b7.p0(i3);
        f4169e = new b7.p0(i3);
    }

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public final void c() {
        b7.p0 p0Var = f4169e;
        b7.p0 p0Var2 = f4168d;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            p0 p0Var3 = new p0(this);
            p0.a(p0Var3, Thread.currentThread());
            if (compareAndSet(runnable, p0Var3)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(p0Var2)) == p0Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        p0 p0Var = null;
        boolean z10 = false;
        int i3 = 0;
        while (true) {
            boolean z11 = runnable instanceof p0;
            b7.p0 p0Var2 = f4169e;
            if (!z11 && runnable != p0Var2) {
                break;
            }
            if (z11) {
                p0Var = (p0) runnable;
            }
            i3++;
            if (i3 <= 1000) {
                Thread.yield();
            } else if (runnable == p0Var2 || compareAndSet(runnable, p0Var2)) {
                z10 = Thread.interrupted() || z10;
                LockSupport.park(p0Var);
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean d10 = d();
            b7.p0 p0Var = f4168d;
            if (!d10) {
                try {
                    obj = e();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, p0Var)) {
                        g(currentThread);
                    }
                    if (d10) {
                        return;
                    }
                    a(th);
                    return;
                }
            }
            if (!compareAndSet(currentThread, p0Var)) {
                g(currentThread);
            }
            if (d10) {
                return;
            }
            b(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f4168d) {
            str = "running=[DONE]";
        } else if (runnable instanceof p0) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 21);
            sb2.append("running=[RUNNING ON ");
            sb2.append(name);
            sb2.append("]");
            str = sb2.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String f3 = f();
        StringBuilder sb3 = new StringBuilder(String.valueOf(f3).length() + str.length() + 2);
        sb3.append(str);
        sb3.append(", ");
        sb3.append(f3);
        return sb3.toString();
    }
}
