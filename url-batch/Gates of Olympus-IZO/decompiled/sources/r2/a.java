package r2;

import Z1.t;
import j1.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7295l = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: d, reason: collision with root package name */
    public final m f7296d;

    /* renamed from: e, reason: collision with root package name */
    public final t f7297e;

    /* renamed from: f, reason: collision with root package name */
    public b f7298f;

    /* renamed from: g, reason: collision with root package name */
    public long f7299g;

    /* renamed from: h, reason: collision with root package name */
    public long f7300h;

    /* renamed from: i, reason: collision with root package name */
    public int f7301i;
    private volatile int indexInArray;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7302j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f7303k;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i3) {
        this.f7303k = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f7296d = new m();
        this.f7297e = new t();
        this.f7298f = b.f7307g;
        this.nextParkedWorker = c.f7313n;
        int nanoTime = (int) System.nanoTime();
        this.f7301i = nanoTime == 0 ? 42 : nanoTime;
        f(i3);
    }

    public final i a(boolean z3) {
        i e3;
        i e4;
        c cVar;
        long j3;
        b bVar = this.f7298f;
        b bVar2 = b.f7304d;
        i iVar = null;
        m mVar = this.f7296d;
        c cVar2 = this.f7303k;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f7311l;
            do {
                cVar = this.f7303k;
                j3 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f7336b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f7327e) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i3 = m.f7338d.get(mVar);
                    int i4 = m.f7337c.get(mVar);
                    while (true) {
                        if (i3 == i4 || m.f7339e.get(mVar) == 0) {
                            break;
                        }
                        i4--;
                        i c3 = mVar.c(i4, true);
                        if (c3 != null) {
                            iVar = c3;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar2.f7319i.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f7311l.compareAndSet(cVar, j3, j3 - 4398046511104L));
            this.f7298f = b.f7304d;
        }
        if (z3) {
            boolean z4 = d(cVar2.f7314d * 2) == 0;
            if (z4 && (e4 = e()) != null) {
                return e4;
            }
            mVar.getClass();
            i iVar4 = (i) m.f7336b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z4 && (e3 = e()) != null) {
                return e3;
            }
        } else {
            i e5 = e();
            if (e5 != null) {
                return e5;
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
        int i4 = this.f7301i;
        int i5 = i4 ^ (i4 << 13);
        int i6 = i5 ^ (i5 >> 17);
        int i7 = i6 ^ (i6 << 5);
        this.f7301i = i7;
        int i8 = i3 - 1;
        return (i8 & i3) == 0 ? i7 & i8 : (i7 & Integer.MAX_VALUE) % i3;
    }

    public final i e() {
        int d3 = d(2);
        c cVar = this.f7303k;
        if (d3 == 0) {
            i iVar = (i) cVar.f7318h.d();
            return iVar != null ? iVar : (i) cVar.f7319i.d();
        }
        i iVar2 = (i) cVar.f7319i.d();
        return iVar2 != null ? iVar2 : (i) cVar.f7318h.d();
    }

    public final void f(int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7303k.f7317g);
        sb.append("-worker-");
        sb.append(i3 == 0 ? "TERMINATED" : String.valueOf(i3));
        setName(sb.toString());
        this.indexInArray = i3;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f7298f;
        boolean z3 = bVar2 == b.f7304d;
        if (z3) {
            c.f7311l.addAndGet(this.f7303k, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f7298f = bVar;
        }
        return z3;
    }

    public final i i(int i3) {
        i iVar;
        long j3;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f7311l;
        c cVar = this.f7303k;
        int i4 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        if (i4 < 2) {
            return null;
        }
        int d3 = d(i4);
        long j5 = Long.MAX_VALUE;
        for (int i5 = 0; i5 < i4; i5++) {
            d3++;
            if (d3 > i4) {
                d3 = 1;
            }
            a aVar = (a) cVar.f7320j.b(d3);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f7296d;
                if (i3 == 3) {
                    iVar = mVar.b();
                } else {
                    mVar.getClass();
                    int i6 = m.f7338d.get(mVar);
                    int i7 = m.f7337c.get(mVar);
                    boolean z3 = i3 == 1;
                    while (i6 != i7 && (!z3 || m.f7339e.get(mVar) != 0)) {
                        int i8 = i6 + 1;
                        iVar = mVar.c(i6, z3);
                        if (iVar != null) {
                            break;
                        }
                        i6 = i8;
                    }
                    iVar = null;
                }
                t tVar = this.f7297e;
                if (iVar != null) {
                    tVar.f3480d = iVar;
                    j4 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f7336b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        j3 = -2;
                        if (iVar2 == null) {
                            break;
                        }
                        if (((iVar2.f7327e ? 1 : 2) & i3) != 0) {
                            k.f7334f.getClass();
                            long nanoTime = System.nanoTime() - iVar2.f7326d;
                            long j6 = k.f7330b;
                            if (nanoTime >= j6) {
                                while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                    if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                        break;
                                    }
                                }
                                tVar.f3480d = iVar2;
                                j3 = -1;
                                break;
                            }
                            j3 = j6 - nanoTime;
                            break;
                        }
                        break;
                    }
                    j4 = j3;
                }
                if (j4 == -1) {
                    i iVar3 = (i) tVar.f3480d;
                    tVar.f3480d = null;
                    return iVar3;
                }
                if (j4 > 0) {
                    j5 = Math.min(j5, j4);
                }
            }
        }
        if (j5 == Long.MAX_VALUE) {
            j5 = 0;
        }
        this.f7300h = j5;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        boolean z3;
        boolean z4 = false;
        loop0: while (true) {
            boolean z5 = z4;
            while (true) {
                c cVar = this.f7303k;
                cVar.getClass();
                if (c.f7312m.get(cVar) == 0) {
                    b bVar = this.f7298f;
                    b bVar2 = b.f7308h;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i a3 = a(this.f7302j);
                    long j3 = -2097152;
                    if (a3 != null) {
                        this.f7300h = 0L;
                        this.f7299g = 0L;
                        if (this.f7298f == b.f7306f) {
                            this.f7298f = b.f7305e;
                        }
                        boolean z6 = a3.f7327e;
                        c cVar2 = this.f7303k;
                        if (z6) {
                            if (h(b.f7305e) && !cVar2.j() && !cVar2.i(c.f7311l.get(cVar2))) {
                                cVar2.j();
                            }
                            cVar2.getClass();
                            try {
                                a3.run();
                            } catch (Throwable th) {
                                Thread currentThread = Thread.currentThread();
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                            }
                            c.f7311l.addAndGet(cVar2, -2097152L);
                            if (this.f7298f != bVar2) {
                                this.f7298f = b.f7307g;
                            }
                        } else {
                            cVar2.getClass();
                            try {
                                a3.run();
                            } catch (Throwable th2) {
                                Thread currentThread2 = Thread.currentThread();
                                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                            }
                        }
                    } else {
                        this.f7302j = z4;
                        if (this.f7300h == 0) {
                            Object obj = this.nextParkedWorker;
                            p pVar = c.f7313n;
                            if (obj != pVar ? true : z4) {
                                f7295l.set(this, -1);
                                while (this.nextParkedWorker != c.f7313n) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f7295l;
                                    if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                        break;
                                    }
                                    c cVar3 = this.f7303k;
                                    cVar3.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = c.f7312m;
                                    if (atomicIntegerFieldUpdater3.get(cVar3) != 0) {
                                        break;
                                    }
                                    b bVar3 = this.f7298f;
                                    b bVar4 = b.f7308h;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.f7306f);
                                    Thread.interrupted();
                                    if (this.f7299g == 0) {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        this.f7299g = System.nanoTime() + this.f7303k.f7316f;
                                    } else {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                    }
                                    LockSupport.parkNanos(this.f7303k.f7316f);
                                    if (System.nanoTime() - this.f7299g >= 0) {
                                        this.f7299g = 0L;
                                        c cVar4 = this.f7303k;
                                        synchronized (cVar4.f7320j) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater3.get(cVar4) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.f7311l;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar4) & 2097151)) > cVar4.f7314d) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i3 = this.indexInArray;
                                                            z3 = false;
                                                            f(0);
                                                            cVar4.h(this, i3, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar4) & 2097151);
                                                            if (andDecrement != i3) {
                                                                Object b2 = cVar4.f7320j.b(andDecrement);
                                                                Z1.i.c(b2);
                                                                a aVar = (a) b2;
                                                                cVar4.f7320j.c(i3, aVar);
                                                                aVar.f(i3);
                                                                cVar4.h(aVar, andDecrement, i3);
                                                            }
                                                            cVar4.f7320j.c(andDecrement, null);
                                                            this.f7298f = bVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                        z4 = z3;
                                    }
                                    z3 = false;
                                    z4 = z3;
                                }
                            } else {
                                c cVar5 = this.f7303k;
                                cVar5.getClass();
                                if (this.nextParkedWorker == pVar) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f7310k;
                                        long j4 = atomicLongFieldUpdater2.get(cVar5);
                                        int i4 = this.indexInArray;
                                        this.nextParkedWorker = cVar5.f7320j.b((int) (j4 & 2097151));
                                        if (atomicLongFieldUpdater2.compareAndSet(cVar5, j4, ((2097152 + j4) & j3) | i4)) {
                                            break;
                                        } else {
                                            j3 = -2097152;
                                        }
                                    }
                                }
                            }
                            z4 = z4;
                        } else {
                            if (z5) {
                                h(b.f7306f);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f7300h);
                                this.f7300h = 0L;
                                break;
                            }
                            z5 = true;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f7308h);
    }
}
