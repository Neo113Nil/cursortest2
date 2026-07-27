package J3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f1361e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f1362f;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f1363a = null;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f1364b = null;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1365c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final Object f1366d = new Object();

    static {
        c cVar = new c();
        cVar.e();
        f1361e = cVar;
        c cVar2 = new c();
        cVar2.a(null);
        f1362f = cVar2;
    }

    public static c d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return f1361e;
        }
        final c cVar = new c();
        final AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final AtomicReference atomicReference = new AtomicReference();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final c cVar2 = (c) it.next();
            cVar2.f(new Runnable() { // from class: J3.b
                @Override // java.lang.Runnable
                public final void run() {
                    Throwable th;
                    c cVar3 = c.this;
                    boolean b6 = cVar3.b();
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    AtomicReference atomicReference2 = atomicReference;
                    if (!b6) {
                        atomicBoolean2.set(true);
                        synchronized (cVar3.f1366d) {
                            th = cVar3.f1364b;
                        }
                        if (th != null) {
                            while (!atomicReference2.compareAndSet(null, th) && atomicReference2.get() == null) {
                            }
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        boolean z = atomicBoolean2.get();
                        c cVar4 = cVar;
                        if (z) {
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
        synchronized (this.f1366d) {
            try {
                if (this.f1363a == null) {
                    this.f1363a = Boolean.FALSE;
                    this.f1364b = th;
                    Iterator it = this.f1365c.iterator();
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
        boolean z;
        synchronized (this.f1366d) {
            try {
                Boolean bool = this.f1363a;
                z = bool != null && bool.booleanValue();
            } finally {
            }
        }
        return z;
    }

    public final void c(long j2, TimeUnit timeUnit) {
        boolean z;
        synchronized (this.f1366d) {
            z = this.f1363a != null;
        }
        if (z) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        f(new B2.b(2, countDownLatch));
        try {
            countDownLatch.await(j2, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void e() {
        synchronized (this.f1366d) {
            try {
                if (this.f1363a == null) {
                    this.f1363a = Boolean.TRUE;
                    Iterator it = this.f1365c.iterator();
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
        boolean z;
        synchronized (this.f1366d) {
            if (this.f1363a != null) {
                z = true;
            } else {
                this.f1365c.add(runnable);
                z = false;
            }
        }
        if (z) {
            runnable.run();
        }
    }
}
