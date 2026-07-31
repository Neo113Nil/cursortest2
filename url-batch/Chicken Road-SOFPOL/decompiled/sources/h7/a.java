package h7;

import d4.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import q6.s;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3213l = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: d, reason: collision with root package name */
    public final m f3214d;

    /* renamed from: e, reason: collision with root package name */
    public final s f3215e;

    /* renamed from: f, reason: collision with root package name */
    public b f3216f;

    /* renamed from: g, reason: collision with root package name */
    public long f3217g;

    /* renamed from: h, reason: collision with root package name */
    public long f3218h;
    public int i;
    private volatile int indexInArray;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3219j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f3220k;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i) {
        this.f3220k = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f3214d = new m();
        this.f3215e = new s();
        this.f3216f = b.f3224g;
        this.nextParkedWorker = c.f3229n;
        int nanoTime = (int) System.nanoTime();
        this.i = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final i a(boolean z3) {
        i e8;
        i e9;
        long j7;
        b bVar = this.f3216f;
        c cVar = this.f3220k;
        i iVar = null;
        m mVar = this.f3214d;
        b bVar2 = b.f3221d;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f3227l;
            do {
                j7 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j7) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f3251b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f3242e) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i = m.f3253d.get(mVar);
                    int i8 = m.f3252c.get(mVar);
                    while (true) {
                        if (i == i8 || m.f3254e.get(mVar) == 0) {
                            break;
                        }
                        i8--;
                        i c8 = mVar.c(i8, true);
                        if (c8 != null) {
                            iVar = c8;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.i.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f3227l.compareAndSet(cVar, j7, j7 - 4398046511104L));
            this.f3216f = bVar2;
        }
        if (z3) {
            boolean z7 = d(cVar.f3230d * 2) == 0;
            if (z7 && (e9 = e()) != null) {
                return e9;
            }
            mVar.getClass();
            i iVar4 = (i) m.f3251b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z7 && (e8 = e()) != null) {
                return e8;
            }
        } else {
            i e10 = e();
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

    public final int d(int i) {
        int i8 = this.i;
        int i9 = i8 ^ (i8 << 13);
        int i10 = i9 ^ (i9 >> 17);
        int i11 = i10 ^ (i10 << 5);
        this.i = i11;
        int i12 = i - 1;
        return (i12 & i) == 0 ? i11 & i12 : (i11 & Integer.MAX_VALUE) % i;
    }

    public final i e() {
        int d8 = d(2);
        c cVar = this.f3220k;
        if (d8 == 0) {
            i iVar = (i) cVar.f3234h.d();
            return iVar != null ? iVar : (i) cVar.i.d();
        }
        i iVar2 = (i) cVar.i.d();
        return iVar2 != null ? iVar2 : (i) cVar.f3234h.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3220k.f3233g);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f3216f;
        boolean z3 = bVar2 == b.f3221d;
        if (z3) {
            c.f3227l.addAndGet(this.f3220k, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f3216f = bVar;
        }
        return z3;
    }

    public final i i(int i) {
        long j7;
        i iVar;
        long j8;
        long j9;
        i iVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f3227l;
        c cVar = this.f3220k;
        int i8 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i8 < 2) {
            return null;
        }
        int d8 = d(i8);
        int i9 = 0;
        long j10 = Long.MAX_VALUE;
        while (i9 < i8) {
            d8++;
            if (d8 > i8) {
                d8 = 1;
            }
            a aVar = (a) cVar.f3235j.b(d8);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f3214d;
                if (i == 3) {
                    iVar = mVar.b();
                    j7 = 0;
                } else {
                    mVar.getClass();
                    int i10 = m.f3253d.get(mVar);
                    int i11 = m.f3252c.get(mVar);
                    boolean z3 = i == 1;
                    while (true) {
                        if (i10 == i11) {
                            j7 = 0;
                            break;
                        }
                        j7 = 0;
                        if (!z3 || m.f3254e.get(mVar) != 0) {
                            int i12 = i10 + 1;
                            iVar = mVar.c(i10, z3);
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
                s sVar = this.f3215e;
                if (iVar != null) {
                    sVar.f6205d = iVar;
                    iVar2 = iVar3;
                    j9 = -1;
                    j8 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f3251b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j8 = -1;
                            break;
                        }
                        j8 = -1;
                        if (((iVar4.f3242e ? 1 : 2) & i) == 0) {
                            break;
                        }
                        k.f3249f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f3241d;
                        long j11 = k.f3245b;
                        if (nanoTime < j11) {
                            j9 = j11 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                sVar.f6205d = iVar4;
                                j9 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j9 = -2;
                    iVar2 = iVar3;
                }
                if (j9 == j8) {
                    i iVar5 = (i) sVar.f6205d;
                    sVar.f6205d = iVar2;
                    return iVar5;
                }
                if (j9 > j7) {
                    j10 = Math.min(j10, j9);
                }
            }
            i9++;
            iVar3 = null;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = 0;
        }
        this.f3218h = j10;
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
        long j7;
        loop0: while (true) {
            boolean z3 = false;
            while (c.f3228m.get(this.f3220k) == 0) {
                b bVar = this.f3216f;
                b bVar2 = b.f3225h;
                if (bVar == bVar2) {
                    break loop0;
                }
                i a8 = a(this.f3219j);
                if (a8 != null) {
                    this.f3218h = 0L;
                    c cVar = this.f3220k;
                    this.f3217g = 0L;
                    if (this.f3216f == b.f3223f) {
                        this.f3216f = b.f3222e;
                    }
                    if (a8.f3242e) {
                        if (h(b.f3222e) && !cVar.f() && !cVar.e(c.f3227l.get(cVar))) {
                            cVar.f();
                        }
                        try {
                            a8.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        c.f3227l.addAndGet(cVar, -2097152L);
                        if (this.f3216f != bVar2) {
                            this.f3216f = b.f3224g;
                        }
                    } else {
                        try {
                            a8.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.f3219j = false;
                    if (this.f3218h == 0) {
                        Object obj = this.nextParkedWorker;
                        t tVar = c.f3229n;
                        if (obj != tVar) {
                            f3213l.set(this, -1);
                            while (this.nextParkedWorker != c.f3229n) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3213l;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    c cVar2 = this.f3220k;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f3228m;
                                    if (atomicIntegerFieldUpdater2.get(cVar2) != 0) {
                                        break;
                                    }
                                    b bVar3 = this.f3216f;
                                    b bVar4 = b.f3225h;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.f3223f);
                                    Thread.interrupted();
                                    if (this.f3217g == 0) {
                                        j7 = 2097151;
                                        this.f3217g = System.nanoTime() + this.f3220k.f3232f;
                                    } else {
                                        j7 = 2097151;
                                    }
                                    LockSupport.parkNanos(this.f3220k.f3232f);
                                    if (System.nanoTime() - this.f3217g >= 0) {
                                        this.f3217g = 0L;
                                        c cVar3 = this.f3220k;
                                        synchronized (cVar3.f3235j) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(cVar3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.f3227l;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar3) & j7)) > cVar3.f3230d) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            f(0);
                                                            cVar3.d(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j7);
                                                            if (andDecrement != i) {
                                                                Object b8 = cVar3.f3235j.b(andDecrement);
                                                                q6.i.b(b8);
                                                                a aVar = (a) b8;
                                                                cVar3.f3235j.c(i, aVar);
                                                                aVar.f(i);
                                                                cVar3.d(aVar, andDecrement, i);
                                                            }
                                                            cVar3.f3235j.c(andDecrement, null);
                                                            this.f3216f = bVar4;
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
                            c cVar4 = this.f3220k;
                            if (this.nextParkedWorker == tVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f3226k;
                                while (true) {
                                    long j8 = atomicLongFieldUpdater2.get(cVar4);
                                    int i8 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.f3235j.b((int) (j8 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.f3226k.compareAndSet(cVar5, j8, ((j8 + 2097152) & (-2097152)) | i8)) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else if (z3) {
                        h(b.f3223f);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f3218h);
                        this.f3218h = 0L;
                    } else {
                        z3 = true;
                    }
                }
            }
            break loop0;
        }
        h(b.f3225h);
    }
}
