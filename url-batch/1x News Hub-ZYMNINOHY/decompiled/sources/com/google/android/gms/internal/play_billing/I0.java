package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import w0.AbstractC1234c;

/* loaded from: classes.dex */
public final class I0 extends AtomicReference implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final RunnableC0271w0 f2746c = new RunnableC0271w0();

    /* renamed from: d, reason: collision with root package name */
    public static final RunnableC0271w0 f2747d = new RunnableC0271w0();

    /* renamed from: a, reason: collision with root package name */
    public final Callable f2748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J0 f2749b;

    public I0(J0 j02, Callable callable) {
        this.f2749b = j02;
        callable.getClass();
        this.f2748a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC0268v0 runnableC0268v0 = null;
        boolean z = false;
        int i3 = 0;
        while (true) {
            boolean z2 = runnable instanceof RunnableC0268v0;
            RunnableC0271w0 runnableC0271w0 = f2747d;
            if (!z2) {
                if (runnable != runnableC0271w0) {
                    break;
                }
            } else {
                runnableC0268v0 = (RunnableC0268v0) runnable;
            }
            i3++;
            if (i3 <= 1000) {
                Thread.yield();
            } else if (runnable == runnableC0271w0 || compareAndSet(runnable, runnableC0271w0)) {
                z = Thread.interrupted() || z;
                LockSupport.park(runnableC0268v0);
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
            J0 j02 = this.f2749b;
            boolean isDone = j02.isDone();
            RunnableC0271w0 runnableC0271w0 = f2746c;
            if (isDone) {
                call = null;
            } else {
                try {
                    call = this.f2748a.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, runnableC0271w0)) {
                            a(currentThread);
                        }
                        j02.d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, runnableC0271w0)) {
                            a(currentThread);
                        }
                        j02.getClass();
                        if (AbstractC0245n0.f.D(j02, null, AbstractC0245n0.f2889g)) {
                            AbstractC0245n0.h(j02);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, runnableC0271w0)) {
                a(currentThread);
            }
            if (isDone) {
                return;
            }
            j02.getClass();
            if (call == null) {
                call = AbstractC0245n0.f2889g;
            }
            if (AbstractC0245n0.f.D(j02, null, call)) {
                AbstractC0245n0.h(j02);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return AbstractC0033i.k(runnable == f2746c ? "running=[DONE]" : runnable instanceof RunnableC0268v0 ? "running=[INTERRUPTED]" : runnable instanceof Thread ? AbstractC1234c.a("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", this.f2748a.toString());
    }
}
