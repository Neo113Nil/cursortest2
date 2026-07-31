package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
abstract class ac3<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private static final Runnable f2730f = new zb3(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Runnable f2731g = new zb3(null);

    ac3() {
    }

    private final void c(Thread thread) {
        Runnable runnable = get();
        xb3 xb3Var = null;
        boolean z6 = false;
        int i7 = 0;
        while (true) {
            if (!(runnable instanceof xb3)) {
                if (runnable != f2731g) {
                    break;
                }
            } else {
                xb3Var = (xb3) runnable;
            }
            i7++;
            if (i7 > 1000) {
                Runnable runnable2 = f2731g;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z6 = Thread.interrupted() || z6;
                    LockSupport.park(xb3Var);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z6) {
            thread.interrupt();
        }
    }

    abstract T a();

    abstract String b();

    abstract void d(Throwable th);

    abstract void e(T t6);

    abstract boolean f();

    final void g() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            xb3 xb3Var = new xb3(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, xb3Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (getAndSet(f2730f) == f2731g) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (getAndSet(f2730f) == f2731g) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        T t6 = null;
        if (compareAndSet(null, currentThread)) {
            boolean z6 = !f();
            if (z6) {
                try {
                    t6 = a();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f2730f)) {
                        c(currentThread);
                    }
                    d(th);
                    return;
                }
            }
            if (!compareAndSet(currentThread, f2730f)) {
                c(currentThread);
            }
            if (z6) {
                e(t6);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f2730f) {
            str = "running=[DONE]";
        } else if (runnable instanceof xb3) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String b7 = b();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(b7).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(b7);
        return sb2.toString();
    }
}
