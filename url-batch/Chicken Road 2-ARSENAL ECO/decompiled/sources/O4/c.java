package O4;

import H1.RunnableC0139m;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f1787e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f1788f;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f1789a = null;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f1790b = null;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1791c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final Object f1792d = new Object();

    static {
        c cVar = new c();
        cVar.e();
        f1787e = cVar;
        c cVar2 = new c();
        cVar2.a(null);
        f1788f = cVar2;
    }

    public static c d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return f1787e;
        }
        final c cVar = new c();
        final AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final AtomicReference atomicReference = new AtomicReference();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            final c cVar2 = (c) arrayList.get(i7);
            cVar2.f(new Runnable() { // from class: O4.b
                @Override // java.lang.Runnable
                public final void run() {
                    Throwable th;
                    c cVar3 = c.this;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    AtomicReference atomicReference2 = atomicReference;
                    AtomicInteger atomicInteger2 = atomicInteger;
                    c cVar4 = cVar;
                    if (!cVar3.b()) {
                        atomicBoolean2.set(true);
                        synchronized (cVar3.f1792d) {
                            th = cVar3.f1790b;
                        }
                        if (th != null) {
                            while (!atomicReference2.compareAndSet(null, th) && atomicReference2.get() == null) {
                            }
                        }
                    }
                    if (atomicInteger2.decrementAndGet() == 0) {
                        if (atomicBoolean2.get()) {
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
        synchronized (this.f1792d) {
            try {
                if (this.f1789a == null) {
                    this.f1789a = Boolean.FALSE;
                    this.f1790b = th;
                    ArrayList arrayList = this.f1791c;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((Runnable) obj).run();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z5;
        synchronized (this.f1792d) {
            try {
                Boolean bool = this.f1789a;
                z5 = bool != null && bool.booleanValue();
            } finally {
            }
        }
        return z5;
    }

    public final void c(long j4, TimeUnit timeUnit) {
        boolean z5;
        synchronized (this.f1792d) {
            z5 = this.f1789a != null;
        }
        if (z5) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        f(new RunnableC0139m(6, countDownLatch));
        try {
            countDownLatch.await(j4, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void e() {
        synchronized (this.f1792d) {
            try {
                if (this.f1789a == null) {
                    this.f1789a = Boolean.TRUE;
                    ArrayList arrayList = this.f1791c;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((Runnable) obj).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Runnable runnable) {
        boolean z5;
        synchronized (this.f1792d) {
            if (this.f1789a != null) {
                z5 = true;
            } else {
                this.f1791c.add(runnable);
                z5 = false;
            }
        }
        if (z5) {
            runnable.run();
        }
    }
}
