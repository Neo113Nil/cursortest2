package A2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.q;
import n0.C1148j;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final n f30a;

    /* renamed from: b, reason: collision with root package name */
    public final q f31b;

    /* renamed from: c, reason: collision with root package name */
    public b f32c;

    /* renamed from: d, reason: collision with root package name */
    public long f33d;

    /* renamed from: e, reason: collision with root package name */
    public long f34e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f36h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i3) {
        this.f36h = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f30a = new n();
        this.f31b = new q();
        this.f32c = b.f40d;
        this.nextParkedWorker = c.f45k;
        int nanoTime = (int) System.nanoTime();
        this.f = nanoTime == 0 ? 42 : nanoTime;
        f(i3);
    }

    public final i a(boolean z) {
        i e3;
        i e4;
        c cVar;
        long j3;
        b bVar = this.f32c;
        b bVar2 = b.f37a;
        i iVar = null;
        n nVar = this.f30a;
        c cVar2 = this.f36h;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f43i;
            do {
                cVar = this.f36h;
                j3 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    nVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f69b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(nVar);
                        if (iVar2 != null && iVar2.f58b.f59a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(nVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(nVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i3 = n.f71d.get(nVar);
                    int i4 = n.f70c.get(nVar);
                    while (true) {
                        if (i3 == i4 || n.f72e.get(nVar) == 0) {
                            break;
                        }
                        i4--;
                        i b3 = nVar.b(i4, true);
                        if (b3 != null) {
                            iVar = b3;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar2.f.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f43i.compareAndSet(cVar, j3, j3 - 4398046511104L));
            this.f32c = bVar2;
        }
        if (z) {
            boolean z2 = d(cVar2.f46a * 2) == 0;
            if (z2 && (e4 = e()) != null) {
                return e4;
            }
            nVar.getClass();
            i iVar4 = (i) n.f69b.getAndSet(nVar, null);
            if (iVar4 == null) {
                iVar4 = nVar.a();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z2 && (e3 = e()) != null) {
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
        int i4 = this.f;
        int i5 = i4 ^ (i4 << 13);
        int i6 = i5 ^ (i5 >> 17);
        int i7 = i6 ^ (i6 << 5);
        this.f = i7;
        int i8 = i3 - 1;
        return (i8 & i3) == 0 ? i7 & i8 : (i7 & Integer.MAX_VALUE) % i3;
    }

    public final i e() {
        int d3 = d(2);
        c cVar = this.f36h;
        if (d3 == 0) {
            i iVar = (i) cVar.f50e.d();
            return iVar != null ? iVar : (i) cVar.f.d();
        }
        i iVar2 = (i) cVar.f.d();
        return iVar2 != null ? iVar2 : (i) cVar.f50e.d();
    }

    public final void f(int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f36h.f49d);
        sb.append("-worker-");
        sb.append(i3 == 0 ? "TERMINATED" : String.valueOf(i3));
        setName(sb.toString());
        this.indexInArray = i3;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f32c;
        boolean z = bVar2 == b.f37a;
        if (z) {
            c.f43i.addAndGet(this.f36h, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f32c = bVar;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
    
        r7 = -2;
        r23 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i i(int i3) {
        int i4;
        long j3;
        i iVar;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f43i;
        c cVar = this.f36h;
        int i5 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar2 = null;
        if (i5 < 2) {
            return null;
        }
        int d3 = d(i5);
        int i6 = 0;
        long j6 = Long.MAX_VALUE;
        while (i6 < i5) {
            int i7 = d3 + 1;
            if (i7 > i5) {
                i7 = 1;
            }
            a aVar = (a) cVar.f51g.b(i7);
            if (aVar == null || aVar == this) {
                i4 = i7;
            } else {
                n nVar = aVar.f30a;
                if (i3 == 3) {
                    iVar = nVar.a();
                    j3 = 0;
                } else {
                    nVar.getClass();
                    int i8 = n.f71d.get(nVar);
                    int i9 = n.f70c.get(nVar);
                    boolean z = i3 == 1;
                    while (true) {
                        if (i8 == i9) {
                            j3 = 0;
                            break;
                        }
                        j3 = 0;
                        if (!z || n.f72e.get(nVar) != 0) {
                            int i10 = i8 + 1;
                            iVar = nVar.b(i8, z);
                            if (iVar != null) {
                                break;
                            }
                            i8 = i10;
                        } else {
                            break;
                        }
                    }
                    iVar = iVar2;
                }
                q qVar = this.f31b;
                if (iVar != null) {
                    qVar.f9692a = iVar;
                    i4 = i7;
                    j5 = -1;
                    j4 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f69b;
                        i iVar3 = (i) atomicReferenceFieldUpdater.get(nVar);
                        if (iVar3 == null) {
                            j4 = -1;
                            break;
                        }
                        j4 = -1;
                        if (((iVar3.f58b.f59a == 1 ? 1 : 2) & i3) == 0) {
                            break;
                        }
                        l.f.getClass();
                        i4 = i7;
                        long nanoTime = System.nanoTime() - iVar3.f57a;
                        long j7 = l.f62b;
                        if (nanoTime < j7) {
                            j5 = j7 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(nVar, iVar3, null)) {
                                qVar.f9692a = iVar3;
                                j5 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(nVar) == iVar3);
                        i7 = i4;
                        iVar2 = null;
                    }
                }
                if (j5 == j4) {
                    i iVar4 = (i) qVar.f9692a;
                    qVar.f9692a = iVar2;
                    return iVar4;
                }
                if (j5 > j3) {
                    j6 = Math.min(j6, j5);
                }
            }
            i6++;
            d3 = i4;
            iVar2 = null;
        }
        if (j6 == Long.MAX_VALUE) {
            j6 = 0;
        }
        this.f34e = j6;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        int i3;
        long j4;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                c cVar = this.f36h;
                cVar.getClass();
                if (c.f44j.get(cVar) == 0) {
                    b bVar = this.f32c;
                    b bVar2 = b.f41e;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i a3 = a(this.f35g);
                    if (a3 != null) {
                        this.f34e = 0L;
                        int i4 = a3.f58b.f59a;
                        this.f33d = 0L;
                        if (this.f32c == b.f39c) {
                            this.f32c = b.f38b;
                        }
                        c cVar2 = this.f36h;
                        if (i4 != 0 && h(b.f38b) && !cVar2.e() && !cVar2.d(c.f43i.get(cVar2))) {
                            cVar2.e();
                        }
                        cVar2.getClass();
                        try {
                            a3.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (i4 != 0) {
                            c.f43i.addAndGet(cVar2, -2097152L);
                            if (this.f32c != bVar2) {
                                this.f32c = b.f40d;
                            }
                        }
                    } else {
                        this.f35g = false;
                        if (this.f34e == 0) {
                            Object obj = this.nextParkedWorker;
                            C1148j c1148j = c.f45k;
                            long j5 = 2097151;
                            if (obj != c1148j) {
                                f29i.set(this, -1);
                                while (this.nextParkedWorker != c.f45k) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29i;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        c cVar3 = this.f36h;
                                        cVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f44j;
                                        if (atomicIntegerFieldUpdater2.get(cVar3) != 0) {
                                            break;
                                        }
                                        b bVar3 = this.f32c;
                                        b bVar4 = b.f41e;
                                        if (bVar3 == bVar4) {
                                            break;
                                        }
                                        h(b.f39c);
                                        Thread.interrupted();
                                        if (this.f33d == 0) {
                                            j4 = j5;
                                            this.f33d = System.nanoTime() + this.f36h.f48c;
                                        } else {
                                            j4 = j5;
                                        }
                                        LockSupport.parkNanos(this.f36h.f48c);
                                        if (System.nanoTime() - this.f33d >= 0) {
                                            this.f33d = 0L;
                                            c cVar4 = this.f36h;
                                            synchronized (cVar4.f51g) {
                                                try {
                                                    if (!(atomicIntegerFieldUpdater2.get(cVar4) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f43i;
                                                        if (((int) (atomicLongFieldUpdater2.get(cVar4) & j4)) > cVar4.f46a) {
                                                            if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                int i5 = this.indexInArray;
                                                                f(0);
                                                                cVar4.c(this, i5, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(cVar4) & j4);
                                                                if (andDecrement != i5) {
                                                                    Object b3 = cVar4.f51g.b(andDecrement);
                                                                    kotlin.jvm.internal.j.b(b3);
                                                                    a aVar = (a) b3;
                                                                    cVar4.f51g.c(i5, aVar);
                                                                    aVar.f(i5);
                                                                    cVar4.c(aVar, andDecrement, i5);
                                                                }
                                                                cVar4.f51g.c(andDecrement, null);
                                                                this.f32c = bVar4;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    throw th2;
                                                }
                                            }
                                        }
                                        j5 = j4;
                                    }
                                }
                            } else {
                                c cVar5 = this.f36h;
                                cVar5.getClass();
                                if (this.nextParkedWorker == c1148j) {
                                    do {
                                        atomicLongFieldUpdater = c.f42h;
                                        j3 = atomicLongFieldUpdater.get(cVar5);
                                        i3 = this.indexInArray;
                                        this.nextParkedWorker = cVar5.f51g.b((int) (j3 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(cVar5, j3, ((2097152 + j3) & (-2097152)) | i3));
                                }
                            }
                        } else {
                            if (z) {
                                h(b.f39c);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f34e);
                                this.f34e = 0L;
                                break;
                            }
                            z = true;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f41e);
    }
}
