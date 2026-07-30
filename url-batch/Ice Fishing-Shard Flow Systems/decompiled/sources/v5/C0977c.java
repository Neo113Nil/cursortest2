package v5;

import A.k;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: v5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0977c {

    /* renamed from: e, reason: collision with root package name */
    public static final C0977c f8229e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0977c f8230f;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f8231a = null;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f8232b = null;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8233c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final Object f8234d = new Object();

    static {
        C0977c c0977c = new C0977c();
        c0977c.e();
        f8229e = c0977c;
        C0977c c0977c2 = new C0977c();
        c0977c2.a(null);
        f8230f = c0977c2;
    }

    public static C0977c d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return f8229e;
        }
        final C0977c c0977c = new C0977c();
        final AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final AtomicReference atomicReference = new AtomicReference();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            final C0977c c0977c2 = (C0977c) arrayList.get(i2);
            c0977c2.f(new Runnable() { // from class: v5.b
                @Override // java.lang.Runnable
                public final void run() {
                    Throwable th;
                    C0977c c0977c3 = C0977c.this;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    AtomicReference atomicReference2 = atomicReference;
                    AtomicInteger atomicInteger2 = atomicInteger;
                    C0977c c0977c4 = c0977c;
                    if (!c0977c3.b()) {
                        atomicBoolean2.set(true);
                        synchronized (c0977c3.f8234d) {
                            th = c0977c3.f8232b;
                        }
                        if (th != null) {
                            while (!atomicReference2.compareAndSet(null, th) && atomicReference2.get() == null) {
                            }
                        }
                    }
                    if (atomicInteger2.decrementAndGet() == 0) {
                        if (atomicBoolean2.get()) {
                            c0977c4.a((Throwable) atomicReference2.get());
                        } else {
                            c0977c4.e();
                        }
                    }
                }
            });
        }
        return c0977c;
    }

    public final void a(Throwable th) {
        synchronized (this.f8234d) {
            try {
                if (this.f8231a == null) {
                    this.f8231a = Boolean.FALSE;
                    this.f8232b = th;
                    ArrayList arrayList = this.f8233c;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((Runnable) obj).run();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z7;
        synchronized (this.f8234d) {
            try {
                Boolean bool = this.f8231a;
                z7 = bool != null && bool.booleanValue();
            } finally {
            }
        }
        return z7;
    }

    public final void c(long j, TimeUnit timeUnit) {
        boolean z7;
        synchronized (this.f8234d) {
            z7 = this.f8231a != null;
        }
        if (z7) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        f(new k(21, countDownLatch));
        try {
            countDownLatch.await(j, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void e() {
        synchronized (this.f8234d) {
            try {
                if (this.f8231a == null) {
                    this.f8231a = Boolean.TRUE;
                    ArrayList arrayList = this.f8233c;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((Runnable) obj).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Runnable runnable) {
        boolean z7;
        synchronized (this.f8234d) {
            if (this.f8231a != null) {
                z7 = true;
            } else {
                this.f8233c.add(runnable);
                z7 = false;
            }
        }
        if (z7) {
            runnable.run();
        }
    }
}
