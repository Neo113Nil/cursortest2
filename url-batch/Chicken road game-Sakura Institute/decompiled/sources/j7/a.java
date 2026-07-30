package j7;

import h7.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import r6.v;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5125n = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: f, reason: collision with root package name */
    public final m f5126f;

    /* renamed from: g, reason: collision with root package name */
    public final v f5127g;

    /* renamed from: h, reason: collision with root package name */
    public b f5128h;

    /* renamed from: i, reason: collision with root package name */
    public long f5129i;
    private volatile int indexInArray;

    /* renamed from: j, reason: collision with root package name */
    public long f5130j;

    /* renamed from: k, reason: collision with root package name */
    public int f5131k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5132l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f5133m;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i7) {
        this.f5133m = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f5126f = new m();
        this.f5127g = new v();
        this.f5128h = b.f5137i;
        this.nextParkedWorker = c.f5143p;
        int nanoTime = (int) System.nanoTime();
        this.f5131k = nanoTime == 0 ? 42 : nanoTime;
        f(i7);
    }

    public final i a(boolean z8) {
        i e9;
        i e10;
        long j8;
        b bVar = this.f5128h;
        c cVar = this.f5133m;
        i iVar = null;
        m mVar = this.f5126f;
        b bVar2 = b.f5134f;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f5141n;
            do {
                j8 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j8) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f5166b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f5157g) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i7 = m.f5168d.get(mVar);
                    int i8 = m.f5167c.get(mVar);
                    while (true) {
                        if (i7 == i8 || m.f5169e.get(mVar) == 0) {
                            break;
                        }
                        i8--;
                        i c4 = mVar.c(i8, true);
                        if (c4 != null) {
                            iVar = c4;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.f5149k.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f5141n.compareAndSet(cVar, j8, j8 - 4398046511104L));
            this.f5128h = bVar2;
        }
        if (z8) {
            boolean z9 = d(cVar.f5144f * 2) == 0;
            if (z9 && (e10 = e()) != null) {
                return e10;
            }
            mVar.getClass();
            i iVar4 = (i) m.f5166b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z9 && (e9 = e()) != null) {
                return e9;
            }
        } else {
            i e11 = e();
            if (e11 != null) {
                return e11;
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
        int i8 = this.f5131k;
        int i9 = i8 ^ (i8 << 13);
        int i10 = i9 ^ (i9 >> 17);
        int i11 = i10 ^ (i10 << 5);
        this.f5131k = i11;
        int i12 = i7 - 1;
        return (i12 & i7) == 0 ? i11 & i12 : (i11 & Integer.MAX_VALUE) % i7;
    }

    public final i e() {
        int d8 = d(2);
        c cVar = this.f5133m;
        if (d8 == 0) {
            i iVar = (i) cVar.f5148j.d();
            return iVar != null ? iVar : (i) cVar.f5149k.d();
        }
        i iVar2 = (i) cVar.f5149k.d();
        return iVar2 != null ? iVar2 : (i) cVar.f5148j.d();
    }

    public final void f(int i7) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5133m.f5147i);
        sb.append("-worker-");
        sb.append(i7 == 0 ? "TERMINATED" : String.valueOf(i7));
        setName(sb.toString());
        this.indexInArray = i7;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f5128h;
        boolean z8 = bVar2 == b.f5134f;
        if (z8) {
            c.f5141n.addAndGet(this.f5133m, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f5128h = bVar;
        }
        return z8;
    }

    public final i i(int i7) {
        long j8;
        i iVar;
        long j9;
        long j10;
        i iVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f5141n;
        c cVar = this.f5133m;
        int i8 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i8 < 2) {
            return null;
        }
        int d8 = d(i8);
        int i9 = 0;
        long j11 = Long.MAX_VALUE;
        while (i9 < i8) {
            d8++;
            if (d8 > i8) {
                d8 = 1;
            }
            a aVar = (a) cVar.f5150l.b(d8);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f5126f;
                if (i7 == 3) {
                    iVar = mVar.b();
                    j8 = 0;
                } else {
                    mVar.getClass();
                    int i10 = m.f5168d.get(mVar);
                    int i11 = m.f5167c.get(mVar);
                    boolean z8 = i7 == 1;
                    while (true) {
                        if (i10 == i11) {
                            j8 = 0;
                            break;
                        }
                        j8 = 0;
                        if (!z8 || m.f5169e.get(mVar) != 0) {
                            int i12 = i10 + 1;
                            iVar = mVar.c(i10, z8);
                            if (iVar != null) {
                                break;
                            }
                            i10 = i12;
                        } else {
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                v vVar = this.f5127g;
                if (iVar != null) {
                    vVar.f7968f = iVar;
                    iVar2 = iVar3;
                    j10 = -1;
                    j9 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f5166b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j9 = -1;
                            break;
                        }
                        j9 = -1;
                        if (((iVar4.f5157g ? 1 : 2) & i7) == 0) {
                            break;
                        }
                        k.f5164f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f5156f;
                        long j12 = k.f5160b;
                        if (nanoTime < j12) {
                            j10 = j12 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                vVar.f7968f = iVar4;
                                j10 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j10 = -2;
                    iVar2 = iVar3;
                }
                if (j10 == j9) {
                    i iVar5 = (i) vVar.f7968f;
                    vVar.f7968f = iVar2;
                    return iVar5;
                }
                if (j10 > j8) {
                    j11 = Math.min(j11, j10);
                }
            }
            i9++;
            iVar3 = null;
        }
        if (j11 == Long.MAX_VALUE) {
            j11 = 0;
        }
        this.f5130j = j11;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j8;
        loop0: while (true) {
            boolean z8 = false;
            while (c.f5142o.get(this.f5133m) == 0) {
                b bVar = this.f5128h;
                b bVar2 = b.f5138j;
                if (bVar == bVar2) {
                    break loop0;
                }
                i a3 = a(this.f5132l);
                if (a3 != null) {
                    this.f5130j = 0L;
                    c cVar = this.f5133m;
                    this.f5129i = 0L;
                    if (this.f5128h == b.f5136h) {
                        this.f5128h = b.f5135g;
                    }
                    if (a3.f5157g) {
                        if (h(b.f5135g) && !cVar.u() && !cVar.t(c.f5141n.get(cVar))) {
                            cVar.u();
                        }
                        try {
                            a3.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        c.f5141n.addAndGet(cVar, -2097152L);
                        if (this.f5128h != bVar2) {
                            this.f5128h = b.f5137i;
                        }
                    } else {
                        try {
                            a3.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.f5132l = false;
                    if (this.f5130j == 0) {
                        Object obj = this.nextParkedWorker;
                        s sVar = c.f5143p;
                        if (obj != sVar) {
                            f5125n.set(this, -1);
                            while (this.nextParkedWorker != c.f5143p) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5125n;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    c cVar2 = this.f5133m;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f5142o;
                                    if (atomicIntegerFieldUpdater2.get(cVar2) != 0) {
                                        break;
                                    }
                                    b bVar3 = this.f5128h;
                                    b bVar4 = b.f5138j;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.f5136h);
                                    Thread.interrupted();
                                    if (this.f5129i == 0) {
                                        j8 = 2097151;
                                        this.f5129i = System.nanoTime() + this.f5133m.f5146h;
                                    } else {
                                        j8 = 2097151;
                                    }
                                    LockSupport.parkNanos(this.f5133m.f5146h);
                                    if (System.nanoTime() - this.f5129i >= 0) {
                                        this.f5129i = 0L;
                                        c cVar3 = this.f5133m;
                                        synchronized (cVar3.f5150l) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(cVar3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.f5141n;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar3) & j8)) > cVar3.f5144f) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i7 = this.indexInArray;
                                                            f(0);
                                                            cVar3.n(this, i7, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j8);
                                                            if (andDecrement != i7) {
                                                                Object b9 = cVar3.f5150l.b(andDecrement);
                                                                r6.k.c(b9);
                                                                a aVar = (a) b9;
                                                                cVar3.f5150l.c(i7, aVar);
                                                                aVar.f(i7);
                                                                cVar3.n(aVar, andDecrement, i7);
                                                            }
                                                            cVar3.f5150l.c(andDecrement, null);
                                                            this.f5128h = bVar4;
                                                        }
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
                            c cVar4 = this.f5133m;
                            if (this.nextParkedWorker == sVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f5140m;
                                while (true) {
                                    long j9 = atomicLongFieldUpdater2.get(cVar4);
                                    int i8 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.f5150l.b((int) (j9 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.f5140m.compareAndSet(cVar5, j9, ((j9 + 2097152) & (-2097152)) | i8)) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else if (z8) {
                        h(b.f5136h);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f5130j);
                        this.f5130j = 0L;
                    } else {
                        z8 = true;
                    }
                }
            }
            break loop0;
        }
        h(b.f5138j);
    }
}
