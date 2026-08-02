package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;
import w0.AbstractC1234c;

/* loaded from: classes.dex */
public final class J0 extends AbstractC0259s0 implements RunnableFuture {

    /* renamed from: h, reason: collision with root package name */
    public volatile I0 f2753h;

    public J0(Callable callable) {
        this.f2753h = new I0(this, callable);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0245n0
    public final String b() {
        I0 i02 = this.f2753h;
        return i02 != null ? AbstractC1234c.a("task=[", i02.toString(), "]") : super.b();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0245n0
    public final void c() {
        I0 i02;
        Object obj = this.f2890a;
        if (((obj instanceof C0212c0) && ((C0212c0) obj).f2837a) && (i02 = this.f2753h) != null) {
            RunnableC0271w0 runnableC0271w0 = I0.f2747d;
            RunnableC0271w0 runnableC0271w02 = I0.f2746c;
            Runnable runnable = (Runnable) i02.get();
            if (runnable instanceof Thread) {
                RunnableC0268v0 runnableC0268v0 = new RunnableC0268v0(i02);
                runnableC0268v0.setExclusiveOwnerThread(Thread.currentThread());
                if (i02.compareAndSet(runnable, runnableC0268v0)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) i02.getAndSet(runnableC0271w02)) == runnableC0271w0) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) i02.getAndSet(runnableC0271w02)) == runnableC0271w0) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.f2753h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        I0 i02 = this.f2753h;
        if (i02 != null) {
            i02.run();
        }
        this.f2753h = null;
    }
}
