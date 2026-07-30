package U6;

import D.RunnableC0281a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f3310e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f3311f;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f3312a = null;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f3313b = null;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3314c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final Object f3315d = new Object();

    static {
        c cVar = new c();
        cVar.e();
        f3310e = cVar;
        c cVar2 = new c();
        cVar2.a(null);
        f3311f = cVar2;
    }

    public static c d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return f3310e;
        }
        final c cVar = new c();
        final AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final AtomicReference atomicReference = new AtomicReference();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final c cVar2 = (c) it.next();
            cVar2.f(new Runnable() { // from class: U6.b
                @Override // java.lang.Runnable
                public final void run() {
                    Throwable th;
                    c cVar3 = c.this;
                    boolean b9 = cVar3.b();
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    AtomicReference atomicReference2 = atomicReference;
                    if (!b9) {
                        atomicBoolean2.set(true);
                        synchronized (cVar3.f3315d) {
                            th = cVar3.f3313b;
                        }
                        if (th != null) {
                            while (!atomicReference2.compareAndSet(null, th) && atomicReference2.get() == null) {
                            }
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        boolean z8 = atomicBoolean2.get();
                        c cVar4 = cVar;
                        if (z8) {
                            cVar4.a((Throwable) atomicReference2.get());
                        } else {
                            cVar4.e();
                        }
                    }
                }
            });
        }
        return cVar;
    }

    public final void a(Throwable th) {
        synchronized (this.f3315d) {
            try {
                if (this.f3312a == null) {
                    this.f3312a = Boolean.FALSE;
                    this.f3313b = th;
                    Iterator it = this.f3314c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z8;
        synchronized (this.f3315d) {
            try {
                Boolean bool = this.f3312a;
                z8 = bool != null && bool.booleanValue();
            } finally {
            }
        }
        return z8;
    }

    public final void c(long j9, TimeUnit timeUnit) {
        boolean z8;
        synchronized (this.f3315d) {
            z8 = this.f3312a != null;
        }
        if (z8) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        f(new RunnableC0281a(6, countDownLatch));
        try {
            countDownLatch.await(j9, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void e() {
        synchronized (this.f3315d) {
            try {
                if (this.f3312a == null) {
                    this.f3312a = Boolean.TRUE;
                    Iterator it = this.f3314c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Runnable runnable) {
        boolean z8;
        synchronized (this.f3315d) {
            if (this.f3312a != null) {
                z8 = true;
            } else {
                this.f3314c.add(runnable);
                z8 = false;
            }
        }
        if (z8) {
            runnable.run();
        }
    }
}
