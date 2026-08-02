package f1;

import Q0.o;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2179m = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: e, reason: collision with root package name */
    public final m f2180e;

    /* renamed from: f, reason: collision with root package name */
    public final o f2181f;

    /* renamed from: g, reason: collision with root package name */
    public int f2182g;

    /* renamed from: h, reason: collision with root package name */
    public long f2183h;

    /* renamed from: i, reason: collision with root package name */
    public long f2184i;
    private volatile int indexInArray;

    /* renamed from: j, reason: collision with root package name */
    public int f2185j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2186k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f2187l;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i2) {
        this.f2187l = bVar;
        setDaemon(true);
        this.f2180e = new m();
        this.f2181f = new o();
        this.f2182g = 4;
        this.nextParkedWorker = b.f2191o;
        S0.e.f1073e.getClass();
        this.f2185j = S0.e.f1074f.a().nextInt();
        f(i2);
    }

    public final h a(boolean z2) {
        h e2;
        h e3;
        b bVar;
        long j2;
        int i2 = this.f2182g;
        h hVar = null;
        m mVar = this.f2180e;
        b bVar2 = this.f2187l;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f2189m;
            do {
                bVar = this.f2187l;
                j2 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f2217b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 != null && hVar2.f2205f.f2206a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i3 = m.f2219d.get(mVar);
                    int i4 = m.f2218c.get(mVar);
                    while (true) {
                        if (i3 == i4 || m.f2220e.get(mVar) == 0) {
                            break;
                        }
                        i4--;
                        h c2 = mVar.c(i4, true);
                        if (c2 != null) {
                            hVar = c2;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f2197j.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f2189m.compareAndSet(bVar, j2, j2 - 4398046511104L));
            this.f2182g = 1;
        }
        if (z2) {
            boolean z3 = d(bVar2.f2192e * 2) == 0;
            if (z3 && (e3 = e()) != null) {
                return e3;
            }
            mVar.getClass();
            h hVar4 = (h) m.f2217b.getAndSet(mVar, null);
            if (hVar4 == null) {
                hVar4 = mVar.b();
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
        int i3 = this.f2185j;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f2185j = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final h e() {
        int d2 = d(2);
        b bVar = this.f2187l;
        if (d2 == 0) {
            h hVar = (h) bVar.f2196i.d();
            return hVar != null ? hVar : (h) bVar.f2197j.d();
        }
        h hVar2 = (h) bVar.f2197j.d();
        return hVar2 != null ? hVar2 : (h) bVar.f2196i.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2187l.f2195h);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f2182g;
        boolean z2 = i3 == 1;
        if (z2) {
            b.f2189m.addAndGet(this.f2187l, 4398046511104L);
        }
        if (i3 != i2) {
            this.f2182g = i2;
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h i(int i2) {
        int i3;
        h hVar;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f2189m;
        b bVar = this.f2187l;
        int i4 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar2 = null;
        if (i4 < 2) {
            return null;
        }
        int d2 = d(i4);
        int i5 = 0;
        long j3 = Long.MAX_VALUE;
        while (i5 < i4) {
            int i6 = d2 + 1;
            if (i6 > i4) {
                i6 = 1;
            }
            a aVar = (a) bVar.f2198k.b(i6);
            if (aVar == null || aVar == this) {
                i3 = i6;
            } else {
                m mVar = aVar.f2180e;
                if (i2 == 3) {
                    hVar = mVar.b();
                } else {
                    mVar.getClass();
                    int i7 = m.f2219d.get(mVar);
                    int i8 = m.f2218c.get(mVar);
                    boolean z2 = i2 == 1;
                    while (i7 != i8 && (!z2 || m.f2220e.get(mVar) != 0)) {
                        int i9 = i7 + 1;
                        hVar = mVar.c(i7, z2);
                        if (hVar != null) {
                            break;
                        }
                        i7 = i9;
                    }
                    hVar = hVar2;
                }
                o oVar = this.f2181f;
                if (hVar == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f2217b;
                        h hVar3 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar3 == null) {
                            break;
                        }
                        if (((hVar3.f2205f.f2206a == 1 ? 1 : 2) & i2) == 0) {
                            break;
                        }
                        k.f2213f.getClass();
                        i3 = i6;
                        long nanoTime = System.nanoTime() - hVar3.f2204e;
                        long j4 = k.f2209b;
                        if (nanoTime < j4) {
                            j2 = j4 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, hVar3, null)) {
                                oVar.f983e = hVar3;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == hVar3);
                        i6 = i3;
                        hVar2 = null;
                    }
                } else {
                    oVar.f983e = hVar;
                    i3 = i6;
                }
                j2 = -1;
                if (j2 == -1) {
                    h hVar4 = (h) oVar.f983e;
                    oVar.f983e = hVar2;
                    return hVar4;
                }
                if (j2 > 0) {
                    j3 = Math.min(j3, j2);
                }
            }
            i5++;
            d2 = i3;
            hVar2 = null;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = 0;
        }
        this.f2184i = j3;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        int i2;
        loop0: while (true) {
            boolean z2 = false;
            while (true) {
                b bVar = this.f2187l;
                bVar.getClass();
                int i3 = 5;
                if (b.f2190n.get(bVar) == 0 && this.f2182g != 5) {
                    h a2 = a(this.f2186k);
                    int i4 = 3;
                    if (a2 != null) {
                        this.f2184i = 0L;
                        int i5 = a2.f2205f.f2206a;
                        this.f2183h = 0L;
                        if (this.f2182g == 3) {
                            this.f2182g = 2;
                        }
                        b bVar2 = this.f2187l;
                        if (i5 != 0 && h(2) && !bVar2.e() && !bVar2.d(b.f2189m.get(bVar2))) {
                            bVar2.e();
                        }
                        bVar2.getClass();
                        try {
                            a2.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (i5 != 0) {
                            b.f2189m.addAndGet(bVar2, -2097152L);
                            if (this.f2182g != 5) {
                                this.f2182g = 4;
                            }
                        }
                    } else {
                        this.f2186k = false;
                        if (this.f2184i == 0) {
                            Object obj = this.nextParkedWorker;
                            B.m mVar = b.f2191o;
                            if (obj != mVar) {
                                f2179m.set(this, -1);
                                while (this.nextParkedWorker != b.f2191o) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2179m;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        b bVar3 = this.f2187l;
                                        bVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f2190n;
                                        if (atomicIntegerFieldUpdater2.get(bVar3) == 0 && this.f2182g != i3) {
                                            h(i4);
                                            Thread.interrupted();
                                            if (this.f2183h == 0) {
                                                this.f2183h = System.nanoTime() + this.f2187l.f2194g;
                                            }
                                            LockSupport.parkNanos(this.f2187l.f2194g);
                                            if (System.nanoTime() - this.f2183h >= 0) {
                                                this.f2183h = 0L;
                                                b bVar4 = this.f2187l;
                                                synchronized (bVar4.f2198k) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(bVar4) != 0)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f2189m;
                                                            if (((int) (atomicLongFieldUpdater2.get(bVar4) & 2097151)) > bVar4.f2192e) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i6 = this.indexInArray;
                                                                    f(0);
                                                                    bVar4.c(this, i6, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar4) & 2097151);
                                                                    if (andDecrement != i6) {
                                                                        Object b2 = bVar4.f2198k.b(andDecrement);
                                                                        Q0.h.b(b2);
                                                                        a aVar = (a) b2;
                                                                        bVar4.f2198k.c(i6, aVar);
                                                                        aVar.f(i6);
                                                                        bVar4.c(aVar, andDecrement, i6);
                                                                    }
                                                                    bVar4.f2198k.c(andDecrement, null);
                                                                    this.f2182g = 5;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            i3 = 5;
                                            i4 = 3;
                                        }
                                    }
                                }
                            } else {
                                b bVar5 = this.f2187l;
                                bVar5.getClass();
                                if (this.nextParkedWorker == mVar) {
                                    do {
                                        atomicLongFieldUpdater = b.f2188l;
                                        j2 = atomicLongFieldUpdater.get(bVar5);
                                        i2 = this.indexInArray;
                                        this.nextParkedWorker = bVar5.f2198k.b((int) (j2 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(bVar5, j2, ((j2 + 2097152) & (-2097152)) | i2));
                                }
                            }
                        } else {
                            if (z2) {
                                h(3);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f2184i);
                                this.f2184i = 0L;
                                break;
                            }
                            z2 = true;
                        }
                    }
                }
            }
        }
        h(5);
    }
}
