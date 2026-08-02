package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hqf extends AbstractExecutorService implements AutoCloseable {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public boolean g;
    public final ThreadFactory i;
    public final boolean j;
    public final Runnable k;
    public final Runnable l;
    public final hqd[] m;
    public final hqd[] n;
    public final CountDownLatch o;
    public final AtomicReference p;
    private final int q;
    private boolean r;
    private final boolean s;
    private final hqe[] t;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e = new AtomicInteger();
    public final AtomicInteger f = new AtomicInteger();
    public final AtomicBoolean h = new AtomicBoolean();

    public hqf(int i, ThreadFactory threadFactory, Runnable runnable, Runnable runnable2) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.Y(i, "numThreads must be positive: "));
        }
        this.q = Integer.MAX_VALUE;
        this.i = threadFactory;
        this.j = true;
        this.k = runnable;
        this.l = runnable2;
        this.s = true;
        this.o = new CountDownLatch(i);
        int i2 = i + 1;
        hqd[] hqdVarArr = new hqd[i2];
        hqd[] hqdVarArr2 = new hqd[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            hqdVarArr[i4] = new hqd(b, i4);
            hqdVarArr2[i4] = new hqd(a, i4);
        }
        this.m = hqdVarArr;
        this.n = hqdVarArr2;
        hqe[] hqeVarArr = new hqe[i];
        hqd hqdVar = hqdVarArr[0];
        while (i3 < i) {
            hqd hqdVar2 = new hqd(hqdVar, i3);
            hqeVarArr[i3] = new hqe(this, i3);
            i3++;
            hqdVar = hqdVar2;
        }
        this.t = hqeVarArr;
        this.p = new AtomicReference(hqdVar);
    }

    public final void a() {
        if (this.s) {
            this.d.decrementAndGet();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.o.await(j, timeUnit);
    }

    public final void b(boolean z) {
        this.r = true;
        while (true) {
            AtomicReference atomicReference = this.p;
            hqd hqdVar = (hqd) atomicReference.get();
            Object obj = hqdVar.a;
            if (obj == a) {
                return;
            }
            Object obj2 = b;
            if (a.a(atomicReference, hqdVar, (obj != obj2 || z) ? this.n[0] : this.n[hqdVar.b])) {
                while (hqdVar.a != obj2) {
                    hqe hqeVar = this.t[hqdVar.b];
                    Thread thread = hqeVar.b;
                    hqeVar.i = 3;
                    if (thread != null) {
                        LockSupport.unpark(thread);
                    } else {
                        hqeVar.a();
                    }
                    hqdVar = (hqd) hqdVar.a;
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.d(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AtomicInteger atomicInteger;
        int i;
        runnable.getClass();
        if (!this.r) {
            if (this.s) {
                int i2 = this.q;
                if (i2 != Integer.MAX_VALUE) {
                    do {
                        atomicInteger = this.d;
                        i = atomicInteger.get();
                        if (i != i2) {
                        }
                    } while (!atomicInteger.compareAndSet(i, i + 1));
                } else {
                    this.d.incrementAndGet();
                }
            }
            hqd hqdVar = new hqd(runnable, -1);
            ConcurrentLinkedQueue concurrentLinkedQueue = this.c;
            concurrentLinkedQueue.add(hqdVar);
            while (true) {
                AtomicReference atomicReference = this.p;
                hqd hqdVar2 = (hqd) atomicReference.get();
                Object obj = hqdVar2.a;
                if (obj == b) {
                    int i3 = hqdVar2.b;
                    int min = Math.min(i3 + 1, this.t.length);
                    if (min == i3 || a.a(atomicReference, hqdVar2, this.m[min])) {
                        return;
                    }
                } else {
                    if (obj == a) {
                        if (concurrentLinkedQueue.remove(hqdVar)) {
                            a();
                            throw new RejectedExecutionException();
                        }
                        return;
                    }
                    int i4 = hqdVar2.b;
                    if (a.a(atomicReference, hqdVar2, (hqd) obj)) {
                        hqe hqeVar = this.t[i4];
                        Thread thread = hqeVar.b;
                        hqeVar.i = 1;
                        if (thread != null) {
                            LockSupport.unpark(thread);
                            return;
                        } else {
                            hqeVar.h.e.incrementAndGet();
                            hqeVar.b();
                            return;
                        }
                    }
                }
            }
        }
        throw new RejectedExecutionException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return ((hqd) this.p.get()).a == a;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.o.getCount() == 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        b(false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        b(true);
        ArrayList arrayList = new ArrayList();
        if (this.h.compareAndSet(false, true)) {
            while (true) {
                hqd hqdVar = (hqd) this.c.poll();
                if (hqdVar == null) {
                    break;
                }
                a();
                arrayList.add((Runnable) hqdVar.a);
            }
            this.g = true;
            for (hqe hqeVar : this.t) {
                Thread thread = hqeVar.c;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        return arrayList;
    }
}
