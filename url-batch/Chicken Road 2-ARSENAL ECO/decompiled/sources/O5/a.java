package O5;

import M5.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1794n = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: f, reason: collision with root package name */
    public final l f1795f;

    /* renamed from: g, reason: collision with root package name */
    public final s f1796g;

    /* renamed from: h, reason: collision with root package name */
    public int f1797h;

    /* renamed from: i, reason: collision with root package name */
    public long f1798i;
    private volatile int indexInArray;

    /* renamed from: j, reason: collision with root package name */
    public long f1799j;

    /* renamed from: k, reason: collision with root package name */
    public int f1800k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1801l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f1802m;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i7) {
        this.f1802m = bVar;
        setDaemon(true);
        this.f1795f = new l();
        this.f1796g = new s();
        this.f1797h = 4;
        this.nextParkedWorker = b.f1806p;
        A5.a aVar = A5.e.f57f;
        this.f1800k = A5.e.f57f.a().nextInt();
        f(i7);
    }

    public final h a(boolean z5) {
        h e4;
        h e7;
        long j4;
        int i7 = this.f1797h;
        b bVar = this.f1802m;
        h hVar = null;
        l lVar = this.f1795f;
        if (i7 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1804n;
            do {
                j4 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j4) >> 42)) == 0) {
                    lVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f1831b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 != null && hVar2.f1820g.f384a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(lVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i8 = l.f1833d.get(lVar);
                    int i9 = l.f1832c.get(lVar);
                    while (true) {
                        if (i8 == i9 || l.f1834e.get(lVar) == 0) {
                            break;
                        }
                        i9--;
                        h c7 = lVar.c(i9, true);
                        if (c7 != null) {
                            hVar = c7;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar.f1812k.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f1804n.compareAndSet(bVar, j4, j4 - 4398046511104L));
            this.f1797h = 1;
        }
        if (z5) {
            boolean z6 = d(bVar.f1807f * 2) == 0;
            if (z6 && (e7 = e()) != null) {
                return e7;
            }
            lVar.getClass();
            h hVar4 = (h) l.f1831b.getAndSet(lVar, null);
            if (hVar4 == null) {
                hVar4 = lVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z6 && (e4 = e()) != null) {
                return e4;
            }
        } else {
            h e8 = e();
            if (e8 != null) {
                return e8;
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

    public final int d(int i7) {
        int i8 = this.f1800k;
        int i9 = i8 ^ (i8 << 13);
        int i10 = i9 ^ (i9 >> 17);
        int i11 = i10 ^ (i10 << 5);
        this.f1800k = i11;
        int i12 = i7 - 1;
        return (i12 & i7) == 0 ? i11 & i12 : (i11 & Integer.MAX_VALUE) % i7;
    }

    public final h e() {
        int d7 = d(2);
        b bVar = this.f1802m;
        if (d7 == 0) {
            h hVar = (h) bVar.f1811j.d();
            return hVar != null ? hVar : (h) bVar.f1812k.d();
        }
        h hVar2 = (h) bVar.f1812k.d();
        return hVar2 != null ? hVar2 : (h) bVar.f1811j.d();
    }

    public final void f(int i7) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1802m.f1810i);
        sb.append("-worker-");
        sb.append(i7 == 0 ? "TERMINATED" : String.valueOf(i7));
        setName(sb.toString());
        this.indexInArray = i7;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i7) {
        int i8 = this.f1797h;
        boolean z5 = i8 == 1;
        if (z5) {
            b.f1804n.addAndGet(this.f1802m, 4398046511104L);
        }
        if (i8 != i7) {
            this.f1797h = i7;
        }
        return z5;
    }

    public final h i(int i7) {
        long j4;
        h hVar;
        long j7;
        long j8;
        h hVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1804n;
        b bVar = this.f1802m;
        int i8 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar3 = null;
        if (i8 < 2) {
            return null;
        }
        int d7 = d(i8);
        int i9 = 0;
        long j9 = Long.MAX_VALUE;
        while (i9 < i8) {
            d7++;
            if (d7 > i8) {
                d7 = 1;
            }
            a aVar = (a) bVar.f1813l.b(d7);
            if (aVar != null && aVar != this) {
                l lVar = aVar.f1795f;
                if (i7 == 3) {
                    hVar = lVar.b();
                    j4 = 0;
                } else {
                    lVar.getClass();
                    int i10 = l.f1833d.get(lVar);
                    int i11 = l.f1832c.get(lVar);
                    boolean z5 = i7 == 1;
                    while (true) {
                        if (i10 == i11) {
                            j4 = 0;
                            break;
                        }
                        j4 = 0;
                        if (!z5 || l.f1834e.get(lVar) != 0) {
                            int i12 = i10 + 1;
                            hVar = lVar.c(i10, z5);
                            if (hVar != null) {
                                break;
                            }
                            i10 = i12;
                        } else {
                            break;
                        }
                    }
                    hVar = hVar3;
                }
                s sVar = this.f1796g;
                if (hVar != null) {
                    sVar.f5233f = hVar;
                    hVar2 = hVar3;
                    j8 = -1;
                    j7 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f1831b;
                        h hVar4 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar4 == null) {
                            j7 = -1;
                            break;
                        }
                        j7 = -1;
                        if (((hVar4.f1820g.f384a == 1 ? 1 : 2) & i7) == 0) {
                            break;
                        }
                        j.f1827f.getClass();
                        l lVar2 = lVar;
                        long nanoTime = System.nanoTime() - hVar4.f1819f;
                        long j10 = j.f1823b;
                        if (nanoTime < j10) {
                            j8 = j10 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(lVar2, hVar4, null)) {
                                sVar.f5233f = hVar4;
                                j8 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(lVar2) == hVar4);
                        lVar = lVar2;
                        hVar3 = null;
                    }
                    j8 = -2;
                    hVar2 = hVar3;
                }
                if (j8 == j7) {
                    h hVar5 = (h) sVar.f5233f;
                    sVar.f5233f = hVar2;
                    return hVar5;
                }
                if (j8 > j4) {
                    j9 = Math.min(j9, j8);
                }
            }
            i9++;
            hVar3 = null;
        }
        if (j9 == Long.MAX_VALUE) {
            j9 = 0;
        }
        this.f1799j = j9;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j4;
        loop0: while (true) {
            boolean z5 = false;
            while (b.f1805o.get(this.f1802m) == 0 && this.f1797h != 5) {
                h a7 = a(this.f1801l);
                if (a7 != null) {
                    this.f1799j = 0L;
                    b bVar = this.f1802m;
                    int i7 = a7.f1820g.f384a;
                    this.f1798i = 0L;
                    if (this.f1797h == 3) {
                        this.f1797h = 2;
                    }
                    if (i7 != 0 && h(2) && !bVar.m() && !bVar.h(b.f1804n.get(bVar))) {
                        bVar.m();
                    }
                    try {
                        a7.run();
                    } catch (Throwable th) {
                        Thread currentThread = Thread.currentThread();
                        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                    }
                    if (i7 != 0) {
                        b.f1804n.addAndGet(bVar, -2097152L);
                        if (this.f1797h != 5) {
                            this.f1797h = 4;
                        }
                    }
                } else {
                    this.f1801l = false;
                    if (this.f1799j == 0) {
                        Object obj = this.nextParkedWorker;
                        v vVar = b.f1806p;
                        if (obj != vVar) {
                            f1794n.set(this, -1);
                            while (this.nextParkedWorker != b.f1806p) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1794n;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    b bVar2 = this.f1802m;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f1805o;
                                    if (atomicIntegerFieldUpdater2.get(bVar2) == 0 && this.f1797h != 5) {
                                        h(3);
                                        Thread.interrupted();
                                        if (this.f1798i == 0) {
                                            j4 = 2097151;
                                            this.f1798i = System.nanoTime() + this.f1802m.f1809h;
                                        } else {
                                            j4 = 2097151;
                                        }
                                        LockSupport.parkNanos(this.f1802m.f1809h);
                                        if (System.nanoTime() - this.f1798i >= 0) {
                                            this.f1798i = 0L;
                                            b bVar3 = this.f1802m;
                                            synchronized (bVar3.f1813l) {
                                                try {
                                                    if (!(atomicIntegerFieldUpdater2.get(bVar3) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1804n;
                                                        if (((int) (atomicLongFieldUpdater.get(bVar3) & j4)) > bVar3.f1807f) {
                                                            if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                int i8 = this.indexInArray;
                                                                f(0);
                                                                bVar3.g(this, i8, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(bVar3) & j4);
                                                                if (andDecrement != i8) {
                                                                    Object b7 = bVar3.f1813l.b(andDecrement);
                                                                    kotlin.jvm.internal.i.b(b7);
                                                                    a aVar = (a) b7;
                                                                    bVar3.f1813l.c(i8, aVar);
                                                                    aVar.f(i8);
                                                                    bVar3.g(aVar, andDecrement, i8);
                                                                }
                                                                bVar3.f1813l.c(andDecrement, null);
                                                                this.f1797h = 5;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            b bVar4 = this.f1802m;
                            if (this.nextParkedWorker == vVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f1803m;
                                while (true) {
                                    long j7 = atomicLongFieldUpdater2.get(bVar4);
                                    int i9 = this.indexInArray;
                                    this.nextParkedWorker = bVar4.f1813l.b((int) (j7 & 2097151));
                                    b bVar5 = bVar4;
                                    if (b.f1803m.compareAndSet(bVar5, j7, ((j7 + 2097152) & (-2097152)) | i9)) {
                                        break;
                                    } else {
                                        bVar4 = bVar5;
                                    }
                                }
                            }
                        }
                    } else if (z5) {
                        h(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f1799j);
                        this.f1799j = 0L;
                    } else {
                        z5 = true;
                    }
                }
            }
        }
        h(5);
    }
}
