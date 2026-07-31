package d1;

import B0.E;
import P0.o;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1809m = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: e, reason: collision with root package name */
    public final m f1810e;

    /* renamed from: f, reason: collision with root package name */
    public final o f1811f;

    /* renamed from: g, reason: collision with root package name */
    public int f1812g;

    /* renamed from: h, reason: collision with root package name */
    public long f1813h;

    /* renamed from: i, reason: collision with root package name */
    public long f1814i;
    private volatile int indexInArray;

    /* renamed from: j, reason: collision with root package name */
    public int f1815j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1816k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f1817l;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i2) {
        this.f1817l = bVar;
        setDaemon(true);
        this.f1810e = new m();
        this.f1811f = new o();
        this.f1812g = 4;
        this.nextParkedWorker = b.f1821o;
        Q0.a aVar = Q0.e.f810e;
        this.f1815j = Q0.e.f810e.a().nextInt();
        f(i2);
    }

    public final h a(boolean z2) {
        h e2;
        h e3;
        long j2;
        int i2 = this.f1812g;
        b bVar = this.f1817l;
        h hVar = null;
        m mVar = this.f1810e;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1819m;
            do {
                j2 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f1847b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 != null && hVar2.f1835f.f1836a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i3 = m.f1849d.get(mVar);
                    int i4 = m.f1848c.get(mVar);
                    while (true) {
                        if (i3 == i4 || m.f1850e.get(mVar) == 0) {
                            break;
                        }
                        i4--;
                        h b2 = mVar.b(i4, true);
                        if (b2 != null) {
                            hVar = b2;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar.f1827j.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f1819m.compareAndSet(bVar, j2, j2 - 4398046511104L));
            this.f1812g = 1;
        }
        if (z2) {
            boolean z3 = d(bVar.f1822e * 2) == 0;
            if (z3 && (e3 = e()) != null) {
                return e3;
            }
            mVar.getClass();
            h hVar4 = (h) m.f1847b.getAndSet(mVar, null);
            if (hVar4 == null) {
                hVar4 = mVar.a();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z3 && (e2 = e()) != null) {
                return e2;
            }
        } else {
            h e4 = e();
            if (e4 != null) {
                return e4;
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

    public final int d(int i2) {
        int i3 = this.f1815j;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f1815j = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final h e() {
        int d2 = d(2);
        b bVar = this.f1817l;
        if (d2 == 0) {
            h hVar = (h) bVar.f1826i.d();
            return hVar != null ? hVar : (h) bVar.f1827j.d();
        }
        h hVar2 = (h) bVar.f1827j.d();
        return hVar2 != null ? hVar2 : (h) bVar.f1826i.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1817l.f1825h);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f1812g;
        boolean z2 = i3 == 1;
        if (z2) {
            b.f1819m.addAndGet(this.f1817l, 4398046511104L);
        }
        if (i3 != i2) {
            this.f1812g = i2;
        }
        return z2;
    }

    public final h i(int i2) {
        long j2;
        h hVar;
        long j3;
        long j4;
        h hVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1819m;
        b bVar = this.f1817l;
        int i3 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar3 = null;
        if (i3 < 2) {
            return null;
        }
        int d2 = d(i3);
        int i4 = 0;
        long j5 = Long.MAX_VALUE;
        while (i4 < i3) {
            d2++;
            if (d2 > i3) {
                d2 = 1;
            }
            a aVar = (a) bVar.f1828k.b(d2);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f1810e;
                if (i2 == 3) {
                    hVar = mVar.a();
                    j2 = 0;
                } else {
                    mVar.getClass();
                    int i5 = m.f1849d.get(mVar);
                    int i6 = m.f1848c.get(mVar);
                    boolean z2 = i2 == 1;
                    while (true) {
                        if (i5 == i6) {
                            j2 = 0;
                            break;
                        }
                        j2 = 0;
                        if (!z2 || m.f1850e.get(mVar) != 0) {
                            int i7 = i5 + 1;
                            hVar = mVar.b(i5, z2);
                            if (hVar != null) {
                                break;
                            }
                            i5 = i7;
                        } else {
                            break;
                        }
                    }
                    hVar = hVar3;
                }
                o oVar = this.f1811f;
                if (hVar != null) {
                    oVar.f807e = hVar;
                    hVar2 = hVar3;
                    j4 = -1;
                    j3 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f1847b;
                        h hVar4 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar4 == null) {
                            j3 = -1;
                            break;
                        }
                        j3 = -1;
                        if (((hVar4.f1835f.f1836a == 1 ? 1 : 2) & i2) == 0) {
                            break;
                        }
                        k.f1843f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - hVar4.f1834e;
                        long j6 = k.f1839b;
                        if (nanoTime < j6) {
                            j4 = j6 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, hVar4, null)) {
                                oVar.f807e = hVar4;
                                j4 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == hVar4);
                        mVar = mVar2;
                        hVar3 = null;
                    }
                    j4 = -2;
                    hVar2 = hVar3;
                }
                if (j4 == j3) {
                    h hVar5 = (h) oVar.f807e;
                    oVar.f807e = hVar2;
                    return hVar5;
                }
                if (j4 > j2) {
                    j5 = Math.min(j5, j4);
                }
            }
            i4++;
            hVar3 = null;
        }
        if (j5 == Long.MAX_VALUE) {
            j5 = 0;
        }
        this.f1814i = j5;
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
        long j2;
        loop0: while (true) {
            boolean z2 = false;
            while (b.f1820n.get(this.f1817l) == 0 && this.f1812g != 5) {
                h a2 = a(this.f1816k);
                if (a2 != null) {
                    this.f1814i = 0L;
                    b bVar = this.f1817l;
                    int i2 = a2.f1835f.f1836a;
                    this.f1813h = 0L;
                    if (this.f1812g == 3) {
                        this.f1812g = 2;
                    }
                    if (i2 != 0 && h(2) && !bVar.e() && !bVar.d(b.f1819m.get(bVar))) {
                        bVar.e();
                    }
                    try {
                        a2.run();
                    } catch (Throwable th) {
                        Thread currentThread = Thread.currentThread();
                        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                    }
                    if (i2 != 0) {
                        b.f1819m.addAndGet(bVar, -2097152L);
                        if (this.f1812g != 5) {
                            this.f1812g = 4;
                        }
                    }
                } else {
                    this.f1816k = false;
                    if (this.f1814i == 0) {
                        Object obj = this.nextParkedWorker;
                        E e2 = b.f1821o;
                        if (obj != e2) {
                            f1809m.set(this, -1);
                            while (this.nextParkedWorker != b.f1821o) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1809m;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    b bVar2 = this.f1817l;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f1820n;
                                    if (atomicIntegerFieldUpdater2.get(bVar2) == 0 && this.f1812g != 5) {
                                        h(3);
                                        Thread.interrupted();
                                        if (this.f1813h == 0) {
                                            j2 = 2097151;
                                            this.f1813h = System.nanoTime() + this.f1817l.f1824g;
                                        } else {
                                            j2 = 2097151;
                                        }
                                        LockSupport.parkNanos(this.f1817l.f1824g);
                                        if (System.nanoTime() - this.f1813h >= 0) {
                                            this.f1813h = 0L;
                                            b bVar3 = this.f1817l;
                                            synchronized (bVar3.f1828k) {
                                                try {
                                                    if (!(atomicIntegerFieldUpdater2.get(bVar3) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1819m;
                                                        if (((int) (atomicLongFieldUpdater.get(bVar3) & j2)) > bVar3.f1822e) {
                                                            if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                int i3 = this.indexInArray;
                                                                f(0);
                                                                bVar3.c(this, i3, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(bVar3) & j2);
                                                                if (andDecrement != i3) {
                                                                    Object b2 = bVar3.f1828k.b(andDecrement);
                                                                    P0.h.b(b2);
                                                                    a aVar = (a) b2;
                                                                    bVar3.f1828k.c(i3, aVar);
                                                                    aVar.f(i3);
                                                                    bVar3.c(aVar, andDecrement, i3);
                                                                }
                                                                bVar3.f1828k.c(andDecrement, null);
                                                                this.f1812g = 5;
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
                            b bVar4 = this.f1817l;
                            if (this.nextParkedWorker == e2) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f1818l;
                                while (true) {
                                    long j3 = atomicLongFieldUpdater2.get(bVar4);
                                    int i4 = this.indexInArray;
                                    this.nextParkedWorker = bVar4.f1828k.b((int) (j3 & 2097151));
                                    b bVar5 = bVar4;
                                    if (b.f1818l.compareAndSet(bVar5, j3, ((j3 + 2097152) & (-2097152)) | i4)) {
                                        break;
                                    } else {
                                        bVar4 = bVar5;
                                    }
                                }
                            }
                        }
                    } else if (z2) {
                        h(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f1814i);
                        this.f1814i = 0L;
                    } else {
                        z2 = true;
                    }
                }
            }
        }
        h(5);
    }
}
