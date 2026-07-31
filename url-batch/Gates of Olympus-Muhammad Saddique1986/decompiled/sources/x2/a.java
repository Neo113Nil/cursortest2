package x2;

import f2.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m1.q;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10320l = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: d, reason: collision with root package name */
    public final m f10321d;

    /* renamed from: e, reason: collision with root package name */
    public final u f10322e;

    /* renamed from: f, reason: collision with root package name */
    public b f10323f;

    /* renamed from: g, reason: collision with root package name */
    public long f10324g;

    /* renamed from: h, reason: collision with root package name */
    public long f10325h;

    /* renamed from: i, reason: collision with root package name */
    public int f10326i;
    private volatile int indexInArray;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10327j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f10328k;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i3) {
        this.f10328k = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f10321d = new m();
        this.f10322e = new u();
        this.f10323f = b.f10332g;
        this.nextParkedWorker = c.f10338n;
        int nanoTime = (int) System.nanoTime();
        this.f10326i = nanoTime == 0 ? 42 : nanoTime;
        f(i3);
    }

    public final i a(boolean z3) {
        i e3;
        i e4;
        c cVar;
        long j3;
        b bVar = this.f10323f;
        b bVar2 = b.f10329d;
        i iVar = null;
        m mVar = this.f10321d;
        c cVar2 = this.f10328k;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f10336l;
            do {
                cVar = this.f10328k;
                j3 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f10361b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f10352e) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i3 = m.f10363d.get(mVar);
                    int i4 = m.f10362c.get(mVar);
                    while (true) {
                        if (i3 == i4 || m.f10364e.get(mVar) == 0) {
                            break;
                        }
                        i4--;
                        i c2 = mVar.c(i4, true);
                        if (c2 != null) {
                            iVar = c2;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar2.f10344i.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f10336l.compareAndSet(cVar, j3, j3 - 4398046511104L));
            this.f10323f = bVar2;
        }
        if (z3) {
            boolean z4 = d(cVar2.f10339d * 2) == 0;
            if (z4 && (e4 = e()) != null) {
                return e4;
            }
            mVar.getClass();
            i iVar4 = (i) m.f10361b.getAndSet(mVar, null);
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
        int i4 = this.f10326i;
        int i5 = i4 ^ (i4 << 13);
        int i6 = i5 ^ (i5 >> 17);
        int i7 = i6 ^ (i6 << 5);
        this.f10326i = i7;
        int i8 = i3 - 1;
        return (i8 & i3) == 0 ? i7 & i8 : (i7 & Integer.MAX_VALUE) % i3;
    }

    public final i e() {
        int d3 = d(2);
        c cVar = this.f10328k;
        if (d3 == 0) {
            i iVar = (i) cVar.f10343h.d();
            return iVar != null ? iVar : (i) cVar.f10344i.d();
        }
        i iVar2 = (i) cVar.f10344i.d();
        return iVar2 != null ? iVar2 : (i) cVar.f10343h.d();
    }

    public final void f(int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10328k.f10342g);
        sb.append("-worker-");
        sb.append(i3 == 0 ? "TERMINATED" : String.valueOf(i3));
        setName(sb.toString());
        this.indexInArray = i3;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f10323f;
        boolean z3 = bVar2 == b.f10329d;
        if (z3) {
            c.f10336l.addAndGet(this.f10328k, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f10323f = bVar;
        }
        return z3;
    }

    public final i i(int i3) {
        i iVar;
        long j3;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f10336l;
        c cVar = this.f10328k;
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
            a aVar = (a) cVar.f10345j.b(d3);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f10321d;
                if (i3 == 3) {
                    iVar = mVar.b();
                } else {
                    mVar.getClass();
                    int i6 = m.f10363d.get(mVar);
                    int i7 = m.f10362c.get(mVar);
                    boolean z3 = i3 == 1;
                    while (i6 != i7 && (!z3 || m.f10364e.get(mVar) != 0)) {
                        int i8 = i6 + 1;
                        iVar = mVar.c(i6, z3);
                        if (iVar != null) {
                            break;
                        }
                        i6 = i8;
                    }
                    iVar = null;
                }
                u uVar = this.f10322e;
                if (iVar != null) {
                    uVar.f5832d = iVar;
                    j4 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f10361b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        j3 = -2;
                        if (iVar2 == null) {
                            break;
                        }
                        if (((iVar2.f10352e ? 1 : 2) & i3) != 0) {
                            k.f10359f.getClass();
                            long nanoTime = System.nanoTime() - iVar2.f10351d;
                            long j6 = k.f10355b;
                            if (nanoTime >= j6) {
                                while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                    if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                        break;
                                    }
                                }
                                uVar.f5832d = iVar2;
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
                    i iVar3 = (i) uVar.f5832d;
                    uVar.f5832d = null;
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
        this.f10325h = j5;
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
                c cVar = this.f10328k;
                cVar.getClass();
                if (c.f10337m.get(cVar) == 0) {
                    b bVar = this.f10323f;
                    b bVar2 = b.f10333h;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i a3 = a(this.f10327j);
                    long j3 = -2097152;
                    if (a3 != null) {
                        this.f10325h = 0L;
                        this.f10324g = 0L;
                        if (this.f10323f == b.f10331f) {
                            this.f10323f = b.f10330e;
                        }
                        boolean z6 = a3.f10352e;
                        c cVar2 = this.f10328k;
                        if (z6) {
                            if (h(b.f10330e) && !cVar2.h() && !cVar2.g(c.f10336l.get(cVar2))) {
                                cVar2.h();
                            }
                            cVar2.getClass();
                            try {
                                a3.run();
                            } catch (Throwable th) {
                                Thread currentThread = Thread.currentThread();
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                            }
                            c.f10336l.addAndGet(cVar2, -2097152L);
                            if (this.f10323f != bVar2) {
                                this.f10323f = b.f10332g;
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
                        this.f10327j = z4;
                        if (this.f10325h == 0) {
                            Object obj = this.nextParkedWorker;
                            q qVar = c.f10338n;
                            if (obj != qVar ? true : z4) {
                                f10320l.set(this, -1);
                                while (this.nextParkedWorker != c.f10338n) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f10320l;
                                    if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                        break;
                                    }
                                    c cVar3 = this.f10328k;
                                    cVar3.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = c.f10337m;
                                    if (atomicIntegerFieldUpdater3.get(cVar3) != 0) {
                                        break;
                                    }
                                    b bVar3 = this.f10323f;
                                    b bVar4 = b.f10333h;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.f10331f);
                                    Thread.interrupted();
                                    if (this.f10324g == 0) {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        this.f10324g = System.nanoTime() + this.f10328k.f10341f;
                                    } else {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                    }
                                    LockSupport.parkNanos(this.f10328k.f10341f);
                                    if (System.nanoTime() - this.f10324g >= 0) {
                                        this.f10324g = 0L;
                                        c cVar4 = this.f10328k;
                                        synchronized (cVar4.f10345j) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater3.get(cVar4) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.f10336l;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar4) & 2097151)) > cVar4.f10339d) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i3 = this.indexInArray;
                                                            z3 = false;
                                                            f(0);
                                                            cVar4.e(this, i3, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar4) & 2097151);
                                                            if (andDecrement != i3) {
                                                                Object b3 = cVar4.f10345j.b(andDecrement);
                                                                f2.j.c(b3);
                                                                a aVar = (a) b3;
                                                                cVar4.f10345j.c(i3, aVar);
                                                                aVar.f(i3);
                                                                cVar4.e(aVar, andDecrement, i3);
                                                            }
                                                            cVar4.f10345j.c(andDecrement, null);
                                                            this.f10323f = bVar4;
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
                                c cVar5 = this.f10328k;
                                cVar5.getClass();
                                if (this.nextParkedWorker == qVar) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f10335k;
                                        long j4 = atomicLongFieldUpdater2.get(cVar5);
                                        int i4 = this.indexInArray;
                                        this.nextParkedWorker = cVar5.f10345j.b((int) (j4 & 2097151));
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
                                h(b.f10331f);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f10325h);
                                this.f10325h = 0L;
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
        h(b.f10333h);
    }
}
