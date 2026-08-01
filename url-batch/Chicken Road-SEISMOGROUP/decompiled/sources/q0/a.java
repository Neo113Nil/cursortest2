package q0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1190j = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: b, reason: collision with root package name */
    public final l f1191b;

    /* renamed from: c, reason: collision with root package name */
    public final e0.k f1192c;

    /* renamed from: d, reason: collision with root package name */
    public int f1193d;

    /* renamed from: e, reason: collision with root package name */
    public long f1194e;

    /* renamed from: f, reason: collision with root package name */
    public long f1195f;

    /* renamed from: g, reason: collision with root package name */
    public int f1196g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1197h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f1198i;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i2) {
        this.f1198i = bVar;
        setDaemon(true);
        this.f1191b = new l();
        this.f1192c = new e0.k();
        this.f1193d = 4;
        this.nextParkedWorker = b.f1202l;
        f0.e.f583b.getClass();
        this.f1196g = f0.e.f584c.a().nextInt();
        f(i2);
    }

    public final h a(boolean z) {
        h e2;
        h e3;
        b bVar;
        long j2;
        int i2 = this.f1193d;
        h hVar = null;
        l lVar = this.f1191b;
        b bVar2 = this.f1198i;
        if (i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1200j;
            do {
                bVar = this.f1198i;
                j2 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    lVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f1227b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 != null && hVar2.f1216c.f112a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(lVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i3 = l.f1229d.get(lVar);
                    int i4 = l.f1228c.get(lVar);
                    while (true) {
                        if (i3 == i4 || l.f1230e.get(lVar) == 0) {
                            break;
                        }
                        i4--;
                        h c2 = lVar.c(i4, true);
                        if (c2 != null) {
                            hVar = c2;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f1208g.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f1200j.compareAndSet(bVar, j2, j2 - 4398046511104L));
            this.f1193d = 1;
        }
        if (z) {
            boolean z2 = d(bVar2.f1203b * 2) == 0;
            if (z2 && (e3 = e()) != null) {
                return e3;
            }
            lVar.getClass();
            h hVar4 = (h) l.f1227b.getAndSet(lVar, null);
            if (hVar4 == null) {
                hVar4 = lVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z2 && (e2 = e()) != null) {
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
        int i3 = this.f1196g;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f1196g = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final h e() {
        int d2 = d(2);
        b bVar = this.f1198i;
        if (d2 == 0) {
            h hVar = (h) bVar.f1207f.d();
            return hVar != null ? hVar : (h) bVar.f1208g.d();
        }
        h hVar2 = (h) bVar.f1208g.d();
        return hVar2 != null ? hVar2 : (h) bVar.f1207f.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1198i.f1206e);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i2) {
        int i3 = this.f1193d;
        boolean z = i3 == 1;
        if (z) {
            b.f1200j.addAndGet(this.f1198i, 4398046511104L);
        }
        if (i3 != i2) {
            this.f1193d = i2;
        }
        return z;
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
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1200j;
        b bVar = this.f1198i;
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
            a aVar = (a) bVar.f1209h.b(i6);
            if (aVar == null || aVar == this) {
                i3 = i6;
            } else {
                l lVar = aVar.f1191b;
                if (i2 == 3) {
                    hVar = lVar.b();
                } else {
                    lVar.getClass();
                    int i7 = l.f1229d.get(lVar);
                    int i8 = l.f1228c.get(lVar);
                    boolean z = i2 == 1;
                    while (i7 != i8 && (!z || l.f1230e.get(lVar) != 0)) {
                        int i9 = i7 + 1;
                        hVar = lVar.c(i7, z);
                        if (hVar != null) {
                            break;
                        }
                        i7 = i9;
                    }
                    hVar = hVar2;
                }
                e0.k kVar = this.f1192c;
                if (hVar == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f1227b;
                        h hVar3 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar3 == null) {
                            break;
                        }
                        if (((hVar3.f1216c.f112a == 1 ? 1 : 2) & i2) == 0) {
                            break;
                        }
                        j.f1223f.getClass();
                        i3 = i6;
                        long nanoTime = System.nanoTime() - hVar3.f1215b;
                        long j4 = j.f1219b;
                        if (nanoTime < j4) {
                            j2 = j4 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(lVar, hVar3, null)) {
                                kVar.f560b = hVar3;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(lVar) == hVar3);
                        i6 = i3;
                        hVar2 = null;
                    }
                } else {
                    kVar.f560b = hVar;
                    i3 = i6;
                }
                j2 = -1;
                if (j2 == -1) {
                    h hVar4 = (h) kVar.f560b;
                    kVar.f560b = hVar2;
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
        this.f1195f = j3;
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
            boolean z = false;
            while (true) {
                b bVar = this.f1198i;
                bVar.getClass();
                int i3 = 5;
                if (b.f1201k.get(bVar) == 0 && this.f1193d != 5) {
                    h a2 = a(this.f1197h);
                    int i4 = 3;
                    if (a2 != null) {
                        this.f1195f = 0L;
                        int i5 = a2.f1216c.f112a;
                        this.f1194e = 0L;
                        if (this.f1193d == 3) {
                            this.f1193d = 2;
                        }
                        b bVar2 = this.f1198i;
                        if (i5 != 0 && h(2) && !bVar2.e() && !bVar2.d(b.f1200j.get(bVar2))) {
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
                            b.f1200j.addAndGet(bVar2, -2097152L);
                            if (this.f1193d != 5) {
                                this.f1193d = 4;
                            }
                        }
                    } else {
                        this.f1197h = false;
                        if (this.f1195f == 0) {
                            Object obj = this.nextParkedWorker;
                            io.flutter.plugin.editing.a aVar = b.f1202l;
                            if (obj != aVar) {
                                f1190j.set(this, -1);
                                while (this.nextParkedWorker != b.f1202l) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1190j;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        b bVar3 = this.f1198i;
                                        bVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f1201k;
                                        if (atomicIntegerFieldUpdater2.get(bVar3) == 0 && this.f1193d != i3) {
                                            h(i4);
                                            Thread.interrupted();
                                            if (this.f1194e == 0) {
                                                this.f1194e = System.nanoTime() + this.f1198i.f1205d;
                                            }
                                            LockSupport.parkNanos(this.f1198i.f1205d);
                                            if (System.nanoTime() - this.f1194e >= 0) {
                                                this.f1194e = 0L;
                                                b bVar4 = this.f1198i;
                                                synchronized (bVar4.f1209h) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(bVar4) != 0)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f1200j;
                                                            if (((int) (atomicLongFieldUpdater2.get(bVar4) & 2097151)) > bVar4.f1203b) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i6 = this.indexInArray;
                                                                    f(0);
                                                                    bVar4.c(this, i6, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar4) & 2097151);
                                                                    if (andDecrement != i6) {
                                                                        Object b2 = bVar4.f1209h.b(andDecrement);
                                                                        e0.h.b(b2);
                                                                        a aVar2 = (a) b2;
                                                                        bVar4.f1209h.c(i6, aVar2);
                                                                        aVar2.f(i6);
                                                                        bVar4.c(aVar2, andDecrement, i6);
                                                                    }
                                                                    bVar4.f1209h.c(andDecrement, null);
                                                                    this.f1193d = 5;
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
                                b bVar5 = this.f1198i;
                                bVar5.getClass();
                                if (this.nextParkedWorker == aVar) {
                                    do {
                                        atomicLongFieldUpdater = b.f1199i;
                                        j2 = atomicLongFieldUpdater.get(bVar5);
                                        i2 = this.indexInArray;
                                        this.nextParkedWorker = bVar5.f1209h.b((int) (j2 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(bVar5, j2, ((j2 + 2097152) & (-2097152)) | i2));
                                }
                            }
                        } else {
                            if (z) {
                                h(3);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f1195f);
                                this.f1195f = 0L;
                                break;
                            }
                            z = true;
                        }
                    }
                }
            }
        }
        h(5);
    }
}
