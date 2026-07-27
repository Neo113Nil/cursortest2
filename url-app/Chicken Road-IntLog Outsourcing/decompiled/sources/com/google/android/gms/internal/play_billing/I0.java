package com.google.android.gms.internal.play_billing;

import b2.AbstractC0279e;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class I0 extends AtomicReference implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final RunnableC0380w0 f5063c = new RunnableC0380w0();

    /* renamed from: d, reason: collision with root package name */
    public static final RunnableC0380w0 f5064d = new RunnableC0380w0();

    /* renamed from: a, reason: collision with root package name */
    public final Callable f5065a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J0 f5066b;

    public I0(J0 j02, Callable callable) {
        this.f5066b = j02;
        callable.getClass();
        this.f5065a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC0377v0 runnableC0377v0 = null;
        boolean z = false;
        int i2 = 0;
        while (true) {
            boolean z5 = runnable instanceof RunnableC0377v0;
            RunnableC0380w0 runnableC0380w0 = f5064d;
            if (!z5) {
                if (runnable != runnableC0380w0) {
                    break;
                }
            } else {
                runnableC0377v0 = (RunnableC0377v0) runnable;
            }
            i2++;
            if (i2 <= 1000) {
                Thread.yield();
            } else if (runnable == runnableC0380w0 || compareAndSet(runnable, runnableC0380w0)) {
                z = Thread.interrupted() || z;
                LockSupport.park(runnableC0377v0);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object call;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            J0 j02 = this.f5066b;
            boolean isDone = j02.isDone();
            RunnableC0380w0 runnableC0380w0 = f5063c;
            if (isDone) {
                call = null;
            } else {
                try {
                    call = this.f5065a.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, runnableC0380w0)) {
                            a(currentThread);
                        }
                        j02.e(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, runnableC0380w0)) {
                            a(currentThread);
                        }
                        j02.getClass();
                        if (AbstractC0354n0.f5214f.L(j02, null, AbstractC0354n0.f5215g)) {
                            AbstractC0354n0.i(j02);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, runnableC0380w0)) {
                a(currentThread);
            }
            if (isDone) {
                return;
            }
            j02.getClass();
            if (call == null) {
                call = AbstractC0354n0.f5215g;
            }
            if (AbstractC0354n0.f5214f.L(j02, null, call)) {
                AbstractC0354n0.i(j02);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return (runnable == f5063c ? "running=[DONE]" : runnable instanceof RunnableC0377v0 ? "running=[INTERRUPTED]" : runnable instanceof Thread ? AbstractC0279e.f("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]") + ", " + this.f5065a.toString();
    }
}
