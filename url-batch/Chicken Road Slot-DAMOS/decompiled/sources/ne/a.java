package ne;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import wd.b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7249w = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: d, reason: collision with root package name */
    public final l f7250d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f7251e;

    /* renamed from: i, reason: collision with root package name */
    public b f7252i;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* renamed from: r, reason: collision with root package name */
    public long f7253r;

    /* renamed from: s, reason: collision with root package name */
    public long f7254s;

    /* renamed from: t, reason: collision with root package name */
    public int f7255t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7256u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f7257v;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i3) {
        this.f7257v = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f7250d = new l();
        this.f7251e = new b0();
        this.f7252i = b.f7261r;
        this.nextParkedWorker = c.f7267y;
        int nanoTime = (int) System.nanoTime();
        this.f7255t = nanoTime == 0 ? 42 : nanoTime;
        f(i3);
    }

    public final h a(boolean z10) {
        h e2;
        h e9;
        long j;
        b bVar = this.f7252i;
        b bVar2 = b.f7258d;
        c cVar = this.f7257v;
        h hVar = null;
        l lVar = this.f7250d;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f7265w;
            do {
                j = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    lVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f7290b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 != null && hVar2.f7281e) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(lVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i3 = l.f7292d.get(lVar);
                    int i10 = l.f7291c.get(lVar);
                    while (true) {
                        if (i3 == i10 || l.f7293e.get(lVar) == 0) {
                            break;
                        }
                        i10--;
                        h c10 = lVar.c(i10, true);
                        if (c10 != null) {
                            hVar = c10;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) cVar.f7273t.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!c.f7265w.compareAndSet(cVar, j, j - 4398046511104L));
            this.f7252i = b.f7258d;
        }
        if (z10) {
            boolean z11 = d(cVar.f7268d * 2) == 0;
            if (z11 && (e9 = e()) != null) {
                return e9;
            }
            lVar.getClass();
            h hVar4 = (h) l.f7290b.getAndSet(lVar, null);
            if (hVar4 == null) {
                hVar4 = lVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z11 && (e2 = e()) != null) {
                return e2;
            }
        } else {
            h e10 = e();
            if (e10 != null) {
                return e10;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i3) {
        int i10 = this.f7255t;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f7255t = i13;
        int i14 = i3 - 1;
        return (i14 & i3) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % i3;
    }

    public final h e() {
        int d10 = d(2);
        c cVar = this.f7257v;
        f fVar = cVar.f7273t;
        f fVar2 = cVar.f7272s;
        if (d10 == 0) {
            h hVar = (h) fVar2.d();
            return hVar != null ? hVar : (h) fVar.d();
        }
        h hVar2 = (h) fVar.d();
        return hVar2 != null ? hVar2 : (h) fVar2.d();
    }

    public final void f(int i3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7257v.f7271r);
        sb2.append("-worker-");
        sb2.append(i3 == 0 ? "TERMINATED" : String.valueOf(i3));
        setName(sb2.toString());
        this.indexInArray = i3;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f7252i;
        boolean z10 = bVar2 == b.f7258d;
        if (z10) {
            c.f7265w.addAndGet(this.f7257v, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f7252i = bVar;
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a2, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h i(int i3) {
        long j;
        h hVar;
        long j3;
        long j10;
        h hVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f7265w;
        c cVar = this.f7257v;
        int i10 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        h hVar3 = null;
        if (i10 < 2) {
            return null;
        }
        int d10 = d(i10);
        int i11 = 0;
        long j11 = Long.MAX_VALUE;
        while (i11 < i10) {
            d10++;
            if (d10 > i10) {
                d10 = 1;
            }
            a aVar = (a) cVar.f7274u.b(d10);
            if (aVar != null && aVar != this) {
                l lVar = aVar.f7250d;
                lVar.getClass();
                if (i3 == 3) {
                    hVar = lVar.b();
                    j = 0;
                } else {
                    boolean z10 = i3 == 1;
                    int i12 = l.f7292d.get(lVar);
                    int i13 = l.f7291c.get(lVar);
                    while (true) {
                        if (i12 == i13) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z10 || l.f7293e.get(lVar) != 0) {
                            int i14 = i12 + 1;
                            h c10 = lVar.c(i12, z10);
                            if (c10 != null) {
                                hVar = c10;
                                break;
                            }
                            i12 = i14;
                        } else {
                            break;
                        }
                    }
                    hVar = hVar3;
                }
                b0 b0Var = this.f7251e;
                if (hVar != null) {
                    b0Var.f10141d = hVar;
                    hVar2 = hVar3;
                    j10 = -1;
                    j3 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f7290b;
                        h hVar4 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar4 == null) {
                            j3 = -1;
                            break;
                        }
                        j3 = -1;
                        if (((hVar4.f7281e ? 1 : 2) & i3) == 0) {
                            break;
                        }
                        j.f7288f.getClass();
                        l lVar2 = lVar;
                        long nanoTime = System.nanoTime() - hVar4.f7280d;
                        long j12 = j.f7284b;
                        if (nanoTime < j12) {
                            j10 = j12 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(lVar2, hVar4, null)) {
                                b0Var.f10141d = hVar4;
                                j10 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(lVar2) == hVar4);
                        lVar = lVar2;
                        hVar3 = null;
                    }
                }
                if (j10 == j3) {
                    h hVar5 = (h) b0Var.f10141d;
                    b0Var.f10141d = hVar2;
                    return hVar5;
                }
                if (j10 > j) {
                    j11 = Math.min(j11, j10);
                }
            }
            i11++;
            hVar3 = null;
        }
        if (j11 == Long.MAX_VALUE) {
            j11 = 0;
        }
        this.f7254s = j11;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z10 = false;
            while (c.f7266x.get(this.f7257v) != 1) {
                b bVar = this.f7252i;
                b bVar2 = b.f7262s;
                if (bVar == bVar2) {
                    break loop0;
                }
                h a9 = a(this.f7256u);
                if (a9 != null) {
                    this.f7254s = 0L;
                    c cVar = this.f7257v;
                    this.f7253r = 0L;
                    if (this.f7252i == b.f7260i) {
                        this.f7252i = b.f7259e;
                    }
                    if (a9.f7281e) {
                        if (h(b.f7259e) && !cVar.m() && !cVar.j(c.f7265w.get(cVar))) {
                            cVar.m();
                        }
                        try {
                            a9.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        c.f7265w.addAndGet(cVar, -2097152L);
                        if (this.f7252i != bVar2) {
                            this.f7252i = b.f7261r;
                        }
                    } else {
                        try {
                            a9.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.f7256u = false;
                    if (this.f7254s == 0) {
                        Object obj = this.nextParkedWorker;
                        a8.f fVar = c.f7267y;
                        if (obj != fVar) {
                            f7249w.set(this, -1);
                            while (this.nextParkedWorker != c.f7267y) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7249w;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    c cVar2 = this.f7257v;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f7266x;
                                    if (atomicIntegerFieldUpdater2.get(cVar2) == 1) {
                                        break;
                                    }
                                    b bVar3 = this.f7252i;
                                    b bVar4 = b.f7262s;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.f7260i);
                                    Thread.interrupted();
                                    if (this.f7253r == 0) {
                                        j = 2097151;
                                        this.f7253r = System.nanoTime() + this.f7257v.f7270i;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.f7257v.f7270i);
                                    if (System.nanoTime() - this.f7253r >= 0) {
                                        this.f7253r = 0L;
                                        c cVar3 = this.f7257v;
                                        synchronized (cVar3.f7274u) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(cVar3) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.f7265w;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar3) & j)) > cVar3.f7268d && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i3 = this.indexInArray;
                                                        f(0);
                                                        cVar3.i(this, i3, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j);
                                                        if (andDecrement != i3) {
                                                            Object b10 = cVar3.f7274u.b(andDecrement);
                                                            b10.getClass();
                                                            a aVar = (a) b10;
                                                            cVar3.f7274u.c(i3, aVar);
                                                            aVar.f(i3);
                                                            cVar3.i(aVar, andDecrement, i3);
                                                        }
                                                        cVar3.f7274u.c(andDecrement, null);
                                                        this.f7252i = bVar4;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar4 = this.f7257v;
                            if (this.nextParkedWorker == fVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f7264v;
                                while (true) {
                                    long j3 = atomicLongFieldUpdater2.get(cVar4);
                                    int i10 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.f7274u.b((int) (j3 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.f7264v.compareAndSet(cVar5, j3, ((j3 + 2097152) & (-2097152)) | i10)) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else if (z10) {
                        h(b.f7260i);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f7254s);
                        this.f7254s = 0L;
                    } else {
                        z10 = true;
                    }
                }
            }
            break loop0;
        }
        h(b.f7262s);
    }
}
