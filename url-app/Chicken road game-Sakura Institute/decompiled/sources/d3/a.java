package d3;

import M2.E;
import b3.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6090o = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: d, reason: collision with root package name */
    public final m f6091d;

    /* renamed from: e, reason: collision with root package name */
    public final E f6092e;

    /* renamed from: i, reason: collision with root package name */
    public b f6093i;
    private volatile int indexInArray;

    /* renamed from: j, reason: collision with root package name */
    public long f6094j;

    /* renamed from: k, reason: collision with root package name */
    public long f6095k;

    /* renamed from: l, reason: collision with root package name */
    public int f6096l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6097m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f6098n;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i2) {
        this.f6098n = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f6091d = new m();
        this.f6092e = new E();
        this.f6093i = b.f6102j;
        this.nextParkedWorker = c.f6108q;
        int nanoTime = (int) System.nanoTime();
        this.f6096l = nanoTime == 0 ? 42 : nanoTime;
        f(i2);
    }

    public final i a(boolean z4) {
        i e4;
        i e5;
        c cVar;
        long j4;
        b bVar = this.f6093i;
        b bVar2 = b.f6099d;
        i iVar = null;
        m mVar = this.f6091d;
        c cVar2 = this.f6098n;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f6106o;
            do {
                cVar = this.f6098n;
                j4 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j4) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f6131b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f6122e) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i2 = m.f6133d.get(mVar);
                    int i4 = m.f6132c.get(mVar);
                    while (true) {
                        if (i2 == i4 || m.f6134e.get(mVar) == 0) {
                            break;
                        }
                        i4--;
                        i c4 = mVar.c(i4, true);
                        if (c4 != null) {
                            iVar = c4;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar2.f6114l.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f6106o.compareAndSet(cVar, j4, j4 - 4398046511104L));
            this.f6093i = b.f6099d;
        }
        if (z4) {
            boolean z5 = d(cVar2.f6109d * 2) == 0;
            if (z5 && (e5 = e()) != null) {
                return e5;
            }
            mVar.getClass();
            i iVar4 = (i) m.f6131b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z5 && (e4 = e()) != null) {
                return e4;
            }
        } else {
            i e6 = e();
            if (e6 != null) {
                return e6;
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
        int i4 = this.f6096l;
        int i5 = i4 ^ (i4 << 13);
        int i6 = i5 ^ (i5 >> 17);
        int i7 = i6 ^ (i6 << 5);
        this.f6096l = i7;
        int i8 = i2 - 1;
        return (i8 & i2) == 0 ? i7 & i8 : (i7 & Integer.MAX_VALUE) % i2;
    }

    public final i e() {
        int d4 = d(2);
        c cVar = this.f6098n;
        if (d4 == 0) {
            i iVar = (i) cVar.f6113k.d();
            return iVar != null ? iVar : (i) cVar.f6114l.d();
        }
        i iVar2 = (i) cVar.f6114l.d();
        return iVar2 != null ? iVar2 : (i) cVar.f6113k.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6098n.f6112j);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f6093i;
        boolean z4 = bVar2 == b.f6099d;
        if (z4) {
            c.f6106o.addAndGet(this.f6098n, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f6093i = bVar;
        }
        return z4;
    }

    public final i i(int i2) {
        i iVar;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f6106o;
        c cVar = this.f6098n;
        int i4 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        if (i4 < 2) {
            return null;
        }
        int d4 = d(i4);
        long j6 = Long.MAX_VALUE;
        for (int i5 = 0; i5 < i4; i5++) {
            d4++;
            if (d4 > i4) {
                d4 = 1;
            }
            a aVar = (a) cVar.f6115m.b(d4);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f6091d;
                if (i2 == 3) {
                    iVar = mVar.b();
                } else {
                    mVar.getClass();
                    int i6 = m.f6133d.get(mVar);
                    int i7 = m.f6132c.get(mVar);
                    boolean z4 = i2 == 1;
                    while (i6 != i7 && (!z4 || m.f6134e.get(mVar) != 0)) {
                        int i8 = i6 + 1;
                        iVar = mVar.c(i6, z4);
                        if (iVar != null) {
                            break;
                        }
                        i6 = i8;
                    }
                    iVar = null;
                }
                E e4 = this.f6092e;
                if (iVar != null) {
                    e4.f3580d = iVar;
                    j5 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f6131b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        j4 = -2;
                        if (iVar2 == null) {
                            break;
                        }
                        if (((iVar2.f6122e ? 1 : 2) & i2) != 0) {
                            k.f6129f.getClass();
                            long nanoTime = System.nanoTime() - iVar2.f6121d;
                            long j7 = k.f6125b;
                            if (nanoTime >= j7) {
                                while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                    if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                        break;
                                    }
                                }
                                e4.f3580d = iVar2;
                                j4 = -1;
                                break;
                            }
                            j4 = j7 - nanoTime;
                            break;
                        }
                        break;
                    }
                    j5 = j4;
                }
                if (j5 == -1) {
                    i iVar3 = (i) e4.f3580d;
                    e4.f3580d = null;
                    return iVar3;
                }
                if (j5 > 0) {
                    j6 = Math.min(j6, j5);
                }
            }
        }
        if (j6 == Long.MAX_VALUE) {
            j6 = 0;
        }
        this.f6095k = j6;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        boolean z4;
        boolean z5 = false;
        loop0: while (true) {
            boolean z6 = z5;
            while (true) {
                c cVar = this.f6098n;
                cVar.getClass();
                if (c.f6107p.get(cVar) == 0) {
                    b bVar = this.f6093i;
                    b bVar2 = b.f6103k;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i a4 = a(this.f6097m);
                    long j4 = -2097152;
                    if (a4 != null) {
                        this.f6095k = 0L;
                        this.f6094j = 0L;
                        if (this.f6093i == b.f6101i) {
                            this.f6093i = b.f6100e;
                        }
                        boolean z7 = a4.f6122e;
                        c cVar2 = this.f6098n;
                        if (z7) {
                            if (h(b.f6100e) && !cVar2.h() && !cVar2.g(c.f6106o.get(cVar2))) {
                                cVar2.h();
                            }
                            cVar2.getClass();
                            try {
                                a4.run();
                            } catch (Throwable th) {
                                Thread currentThread = Thread.currentThread();
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                            }
                            c.f6106o.addAndGet(cVar2, -2097152L);
                            if (this.f6093i != bVar2) {
                                this.f6093i = b.f6102j;
                            }
                        } else {
                            cVar2.getClass();
                            try {
                                a4.run();
                            } catch (Throwable th2) {
                                Thread currentThread2 = Thread.currentThread();
                                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                            }
                        }
                    } else {
                        this.f6097m = z5;
                        if (this.f6095k == 0) {
                            Object obj = this.nextParkedWorker;
                            t tVar = c.f6108q;
                            if (obj != tVar ? true : z5) {
                                f6090o.set(this, -1);
                                while (this.nextParkedWorker != c.f6108q) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f6090o;
                                    if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                        break;
                                    }
                                    c cVar3 = this.f6098n;
                                    cVar3.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = c.f6107p;
                                    if (atomicIntegerFieldUpdater3.get(cVar3) != 0) {
                                        break;
                                    }
                                    b bVar3 = this.f6093i;
                                    b bVar4 = b.f6103k;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.f6101i);
                                    Thread.interrupted();
                                    if (this.f6094j == 0) {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        this.f6094j = System.nanoTime() + this.f6098n.f6111i;
                                    } else {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                    }
                                    LockSupport.parkNanos(this.f6098n.f6111i);
                                    if (System.nanoTime() - this.f6094j >= 0) {
                                        this.f6094j = 0L;
                                        c cVar4 = this.f6098n;
                                        synchronized (cVar4.f6115m) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater3.get(cVar4) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.f6106o;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar4) & 2097151)) > cVar4.f6109d) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i2 = this.indexInArray;
                                                            z4 = false;
                                                            f(0);
                                                            cVar4.f(this, i2, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar4) & 2097151);
                                                            if (andDecrement != i2) {
                                                                Object b4 = cVar4.f6115m.b(andDecrement);
                                                                Intrinsics.c(b4);
                                                                a aVar = (a) b4;
                                                                cVar4.f6115m.c(i2, aVar);
                                                                aVar.f(i2);
                                                                cVar4.f(aVar, andDecrement, i2);
                                                            }
                                                            cVar4.f6115m.c(andDecrement, null);
                                                            Unit unit = Unit.f7487a;
                                                            this.f6093i = bVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                        z5 = z4;
                                    }
                                    z4 = false;
                                    z5 = z4;
                                }
                            } else {
                                c cVar5 = this.f6098n;
                                cVar5.getClass();
                                if (this.nextParkedWorker == tVar) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f6105n;
                                        long j5 = atomicLongFieldUpdater2.get(cVar5);
                                        int i4 = this.indexInArray;
                                        this.nextParkedWorker = cVar5.f6115m.b((int) (j5 & 2097151));
                                        if (atomicLongFieldUpdater2.compareAndSet(cVar5, j5, ((2097152 + j5) & j4) | i4)) {
                                            break;
                                        } else {
                                            j4 = -2097152;
                                        }
                                    }
                                }
                            }
                            z5 = z5;
                        } else {
                            if (z6) {
                                h(b.f6101i);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f6095k);
                                this.f6095k = 0L;
                                break;
                            }
                            z6 = true;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f6103k);
    }
}
