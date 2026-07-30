package q1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1089j = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: b, reason: collision with root package name */
    public final k f1090b;

    /* renamed from: c, reason: collision with root package name */
    public final d1.k f1091c;

    /* renamed from: d, reason: collision with root package name */
    public int f1092d;

    /* renamed from: e, reason: collision with root package name */
    public long f1093e;

    /* renamed from: f, reason: collision with root package name */
    public long f1094f;

    /* renamed from: g, reason: collision with root package name */
    public int f1095g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1096h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f1097i;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i2) {
        this.f1097i = bVar;
        setDaemon(true);
        this.f1090b = new k();
        this.f1091c = new d1.k();
        this.f1092d = 4;
        this.nextParkedWorker = b.f1101l;
        this.f1095g = e1.a.f243a.a().nextInt();
        f(i2);
    }

    public final g a(boolean z2) {
        g e2;
        g e3;
        long j2;
        int i2 = this.f1092d;
        b bVar = this.f1097i;
        g gVar = null;
        k kVar = this.f1090b;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1099j;
            do {
                j2 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    kVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f1126b;
                        g gVar2 = (g) atomicReferenceFieldUpdater.get(kVar);
                        if (gVar2 != null && gVar2.f1115c.f133a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, gVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(kVar) != gVar2) {
                                    break;
                                }
                            }
                            gVar = gVar2;
                            break loop1;
                        }
                    }
                    int i3 = k.f1128d.get(kVar);
                    int i4 = k.f1127c.get(kVar);
                    while (true) {
                        if (i3 == i4 || k.f1129e.get(kVar) == 0) {
                            break;
                        }
                        i4--;
                        g b2 = kVar.b(i4, true);
                        if (b2 != null) {
                            gVar = b2;
                            break;
                        }
                    }
                    if (gVar != null) {
                        return gVar;
                    }
                    g gVar3 = (g) bVar.f1107g.d();
                    return gVar3 == null ? i(1) : gVar3;
                }
            } while (!b.f1099j.compareAndSet(bVar, j2, j2 - 4398046511104L));
            this.f1092d = 1;
        }
        if (z2) {
            boolean z3 = d(bVar.f1102b * 2) == 0;
            if (z3 && (e3 = e()) != null) {
                return e3;
            }
            kVar.getClass();
            g gVar4 = (g) k.f1126b.getAndSet(kVar, null);
            if (gVar4 == null) {
                gVar4 = kVar.a();
            }
            if (gVar4 != null) {
                return gVar4;
            }
            if (!z3 && (e2 = e()) != null) {
                return e2;
            }
        } else {
            g e4 = e();
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
        int i3 = this.f1095g;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f1095g = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final g e() {
        int d2 = d(2);
        b bVar = this.f1097i;
        e eVar = bVar.f1107g;
        e eVar2 = bVar.f1106f;
        if (d2 == 0) {
            g gVar = (g) eVar2.d();
            return gVar != null ? gVar : (g) eVar.d();
        }
        g gVar2 = (g) eVar.d();
        return gVar2 != null ? gVar2 : (g) eVar2.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1097i.f1105e);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f1092d;
        boolean z2 = i3 == 1;
        if (z2) {
            b.f1099j.addAndGet(this.f1097i, 4398046511104L);
        }
        if (i3 != i2) {
            this.f1092d = i2;
        }
        return z2;
    }

    public final g i(int i2) {
        long j2;
        g gVar;
        long j3;
        long j4;
        g gVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1099j;
        b bVar = this.f1097i;
        int i3 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        g gVar3 = null;
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
            a aVar = (a) bVar.f1108h.b(d2);
            if (aVar != null && aVar != this) {
                k kVar = aVar.f1090b;
                if (i2 == 3) {
                    gVar = kVar.a();
                    j2 = 0;
                } else {
                    kVar.getClass();
                    int i5 = k.f1128d.get(kVar);
                    int i6 = k.f1127c.get(kVar);
                    boolean z2 = i2 == 1;
                    while (true) {
                        if (i5 == i6) {
                            j2 = 0;
                            break;
                        }
                        j2 = 0;
                        if (!z2 || k.f1129e.get(kVar) != 0) {
                            int i7 = i5 + 1;
                            gVar = kVar.b(i5, z2);
                            if (gVar != null) {
                                break;
                            }
                            i5 = i7;
                        } else {
                            break;
                        }
                    }
                    gVar = gVar3;
                }
                d1.k kVar2 = this.f1091c;
                if (gVar != null) {
                    kVar2.f94b = gVar;
                    gVar2 = gVar3;
                    j4 = -1;
                    j3 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f1126b;
                        g gVar4 = (g) atomicReferenceFieldUpdater.get(kVar);
                        if (gVar4 == null) {
                            j3 = -1;
                            break;
                        }
                        j3 = -1;
                        if (((gVar4.f1115c.f133a == 1 ? 1 : 2) & i2) == 0) {
                            break;
                        }
                        i.f1122f.getClass();
                        k kVar3 = kVar;
                        long nanoTime = System.nanoTime() - gVar4.f1114b;
                        long j6 = i.f1118b;
                        if (nanoTime < j6) {
                            j4 = j6 - nanoTime;
                            gVar2 = null;
                            break;
                        }
                        do {
                            gVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(kVar3, gVar4, null)) {
                                kVar2.f94b = gVar4;
                                j4 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(kVar3) == gVar4);
                        kVar = kVar3;
                        gVar3 = null;
                    }
                    j4 = -2;
                    gVar2 = gVar3;
                }
                if (j4 == j3) {
                    g gVar5 = (g) kVar2.f94b;
                    kVar2.f94b = gVar2;
                    return gVar5;
                }
                if (j4 > j2) {
                    j5 = Math.min(j5, j4);
                }
            }
            i4++;
            gVar3 = null;
        }
        if (j5 == Long.MAX_VALUE) {
            j5 = 0;
        }
        this.f1094f = j5;
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
            while (b.f1100k.get(this.f1097i) == 0 && this.f1092d != 5) {
                g a2 = a(this.f1096h);
                if (a2 != null) {
                    this.f1094f = 0L;
                    b bVar = this.f1097i;
                    int i2 = a2.f1115c.f133a;
                    this.f1093e = 0L;
                    if (this.f1092d == 3) {
                        this.f1092d = 2;
                    }
                    if (i2 != 0 && h(2) && !bVar.e() && !bVar.d(b.f1099j.get(bVar))) {
                        bVar.e();
                    }
                    try {
                        a2.run();
                    } catch (Throwable th) {
                        Thread currentThread = Thread.currentThread();
                        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                    }
                    if (i2 != 0) {
                        b.f1099j.addAndGet(bVar, -2097152L);
                        if (this.f1092d != 5) {
                            this.f1092d = 4;
                        }
                    }
                } else {
                    this.f1096h = false;
                    if (this.f1094f == 0) {
                        Object obj = this.nextParkedWorker;
                        o0.a aVar = b.f1101l;
                        if (obj != aVar) {
                            f1089j.set(this, -1);
                            while (this.nextParkedWorker != b.f1101l) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1089j;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    b bVar2 = this.f1097i;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f1100k;
                                    if (atomicIntegerFieldUpdater2.get(bVar2) == 0 && this.f1092d != 5) {
                                        h(3);
                                        Thread.interrupted();
                                        if (this.f1093e == 0) {
                                            j2 = 2097151;
                                            this.f1093e = System.nanoTime() + this.f1097i.f1104d;
                                        } else {
                                            j2 = 2097151;
                                        }
                                        LockSupport.parkNanos(this.f1097i.f1104d);
                                        if (System.nanoTime() - this.f1093e >= 0) {
                                            this.f1093e = 0L;
                                            b bVar3 = this.f1097i;
                                            synchronized (bVar3.f1108h) {
                                                try {
                                                    if (!(atomicIntegerFieldUpdater2.get(bVar3) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1099j;
                                                        if (((int) (atomicLongFieldUpdater.get(bVar3) & j2)) > bVar3.f1102b) {
                                                            if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                int i3 = this.indexInArray;
                                                                f(0);
                                                                bVar3.c(this, i3, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(bVar3) & j2);
                                                                if (andDecrement != i3) {
                                                                    Object b2 = bVar3.f1108h.b(andDecrement);
                                                                    b2.getClass();
                                                                    a aVar2 = (a) b2;
                                                                    bVar3.f1108h.c(i3, aVar2);
                                                                    aVar2.f(i3);
                                                                    bVar3.c(aVar2, andDecrement, i3);
                                                                }
                                                                bVar3.f1108h.c(andDecrement, null);
                                                                this.f1092d = 5;
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
                            b bVar4 = this.f1097i;
                            if (this.nextParkedWorker == aVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f1098i;
                                while (true) {
                                    long j3 = atomicLongFieldUpdater2.get(bVar4);
                                    int i4 = this.indexInArray;
                                    this.nextParkedWorker = bVar4.f1108h.b((int) (j3 & 2097151));
                                    b bVar5 = bVar4;
                                    if (b.f1098i.compareAndSet(bVar5, j3, ((j3 + 2097152) & (-2097152)) | i4)) {
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
                        LockSupport.parkNanos(this.f1094f);
                        this.f1094f = 0L;
                    } else {
                        z2 = true;
                    }
                }
            }
        }
        h(5);
    }
}
