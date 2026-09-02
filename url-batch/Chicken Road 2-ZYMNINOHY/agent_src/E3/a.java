package E3;

import C3.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f683i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final n f684a;

    /* renamed from: b, reason: collision with root package name */
    public final p f685b;

    /* renamed from: c, reason: collision with root package name */
    public b f686c;

    /* renamed from: d, reason: collision with root package name */
    public long f687d;

    /* renamed from: e, reason: collision with root package name */
    public long f688e;

    /* renamed from: f, reason: collision with root package name */
    public int f689f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f690g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f691h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i4) {
        this.f691h = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f684a = new n();
        this.f685b = new p();
        this.f686c = b.f695d;
        this.nextParkedWorker = c.f701k;
        int nanoTime = (int) System.nanoTime();
        this.f689f = nanoTime == 0 ? 42 : nanoTime;
        f(i4);
    }

    public final i a(boolean z) {
        i e4;
        i e5;
        long j4;
        b bVar = this.f686c;
        b bVar2 = b.f692a;
        c cVar = this.f691h;
        i iVar = null;
        n nVar = this.f684a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f699i;
            do {
                j4 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j4) >> 42)) == 0) {
                    nVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f727b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(nVar);
                        if (iVar2 != null && iVar2.f715b.f716a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(nVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(nVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i4 = n.f729d.get(nVar);
                    int i5 = n.f728c.get(nVar);
                    while (true) {
                        if (i4 == i5 || n.f730e.get(nVar) == 0) {
                            break;
                        }
                        i5--;
                        i b4 = nVar.b(i5, true);
                        if (b4 != null) {
                            iVar = b4;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.f707f.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f699i.compareAndSet(cVar, j4, j4 - 4398046511104L));
            this.f686c = b.f692a;
        }
        if (z) {
            boolean z4 = d(cVar.f702a * 2) == 0;
            if (z4 && (e5 = e()) != null) {
                return e5;
            }
            nVar.getClass();
            i iVar4 = (i) n.f727b.getAndSet(nVar, null);
            if (iVar4 == null) {
                iVar4 = nVar.a();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z4 && (e4 = e()) != null) {
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

    public final int d(int i4) {
        int i5 = this.f689f;
        int i6 = i5 ^ (i5 << 13);
        int i7 = i6 ^ (i6 >> 17);
        int i8 = i7 ^ (i7 << 5);
        this.f689f = i8;
        int i9 = i4 - 1;
        return (i9 & i4) == 0 ? i8 & i9 : (i8 & Integer.MAX_VALUE) % i4;
    }

    public final i e() {
        int d4 = d(2);
        c cVar = this.f691h;
        if (d4 == 0) {
            i iVar = (i) cVar.f706e.d();
            return iVar != null ? iVar : (i) cVar.f707f.d();
        }
        i iVar2 = (i) cVar.f707f.d();
        return iVar2 != null ? iVar2 : (i) cVar.f706e.d();
    }

    public final void f(int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f691h.f705d);
        sb.append("-worker-");
        sb.append(i4 == 0 ? "TERMINATED" : String.valueOf(i4));
        setName(sb.toString());
        this.indexInArray = i4;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f686c;
        boolean z = bVar2 == b.f692a;
        if (z) {
            c.f699i.addAndGet(this.f691h, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f686c = bVar;
        }
        return z;
    }

    public final i i(int i4) {
        long j4;
        i iVar;
        long j5;
        long j6;
        i iVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f699i;
        c cVar = this.f691h;
        int i5 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i5 < 2) {
            return null;
        }
        int d4 = d(i5);
        int i6 = 0;
        long j7 = Long.MAX_VALUE;
        while (i6 < i5) {
            d4++;
            if (d4 > i5) {
                d4 = 1;
            }
            a aVar = (a) cVar.f708g.b(d4);
            if (aVar != null && aVar != this) {
                n nVar = aVar.f684a;
                if (i4 == 3) {
                    iVar = nVar.a();
                    j4 = 0;
                } else {
                    nVar.getClass();
                    int i7 = n.f729d.get(nVar);
                    int i8 = n.f728c.get(nVar);
                    boolean z = i4 == 1;
                    while (true) {
                        if (i7 == i8) {
                            j4 = 0;
                            break;
                        }
                        j4 = 0;
                        if (!z || n.f730e.get(nVar) != 0) {
                            int i9 = i7 + 1;
                            iVar = nVar.b(i7, z);
                            if (iVar != null) {
                                break;
                            }
                            i7 = i9;
                        } else {
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                p pVar = this.f685b;
                if (iVar != null) {
                    pVar.f14159a = iVar;
                    iVar2 = iVar3;
                    j6 = -1;
                    j5 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f727b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(nVar);
                        if (iVar4 == null) {
                            j5 = -1;
                            break;
                        }
                        j5 = -1;
                        if (((iVar4.f715b.f716a == 1 ? 1 : 2) & i4) == 0) {
                            break;
                        }
                        l.f723f.getClass();
                        n nVar2 = nVar;
                        long nanoTime = System.nanoTime() - iVar4.f714a;
                        long j8 = l.f719b;
                        if (nanoTime < j8) {
                            j6 = j8 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(nVar2, iVar4, null)) {
                                pVar.f14159a = iVar4;
                                j6 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(nVar2) == iVar4);
                        nVar = nVar2;
                        iVar3 = null;
                    }
                    j6 = -2;
                    iVar2 = iVar3;
                }
                if (j6 == j5) {
                    i iVar5 = (i) pVar.f14159a;
                    pVar.f14159a = iVar2;
                    return iVar5;
                }
                if (j6 > j4) {
                    j7 = Math.min(j7, j6);
                }
            }
            i6++;
            iVar3 = null;
        }
        if (j7 == Long.MAX_VALUE) {
            j7 = 0;
        }
        this.f688e = j7;
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
        long j4;
        loop0: while (true) {
            boolean z = false;
            while (c.f700j.get(this.f691h) == 0) {
                b bVar = this.f686c;
                b bVar2 = b.f696e;
                if (bVar == bVar2) {
                    break loop0;
                }
                i a3 = a(this.f690g);
                if (a3 != null) {
                    this.f688e = 0L;
                    c cVar = this.f691h;
                    int i4 = a3.f715b.f716a;
                    this.f687d = 0L;
                    if (this.f686c == b.f694c) {
                        this.f686c = b.f693b;
                    }
                    if (i4 != 0 && h(b.f693b) && !cVar.k() && !cVar.f(c.f699i.get(cVar))) {
                        cVar.k();
                    }
                    try {
                        a3.run();
                    } catch (Throwable th) {
                        Thread currentThread = Thread.currentThread();
                        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                    }
                    if (i4 != 0) {
                        c.f699i.addAndGet(cVar, -2097152L);
                        if (this.f686c != bVar2) {
                            this.f686c = b.f695d;
                        }
                    }
                } else {
                    this.f690g = false;
                    if (this.f688e == 0) {
                        Object obj = this.nextParkedWorker;
                        v vVar = c.f701k;
                        if (obj != vVar) {
                            f683i.set(this, -1);
                            while (this.nextParkedWorker != c.f701k) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f683i;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    c cVar2 = this.f691h;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f700j;
                                    if (atomicIntegerFieldUpdater2.get(cVar2) != 0) {
                                        break;
                                    }
                                    b bVar3 = this.f686c;
                                    b bVar4 = b.f696e;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.f694c);
                                    Thread.interrupted();
                                    if (this.f687d == 0) {
                                        j4 = 2097151;
                                        this.f687d = System.nanoTime() + this.f691h.f704c;
                                    } else {
                                        j4 = 2097151;
                                    }
                                    LockSupport.parkNanos(this.f691h.f704c);
                                    if (System.nanoTime() - this.f687d >= 0) {
                                        this.f687d = 0L;
                                        c cVar3 = this.f691h;
                                        synchronized (cVar3.f708g) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(cVar3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.f699i;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar3) & j4)) > cVar3.f702a) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i5 = this.indexInArray;
                                                            f(0);
                                                            cVar3.e(this, i5, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j4);
                                                            if (andDecrement != i5) {
                                                                Object b4 = cVar3.f708g.b(andDecrement);
                                                                kotlin.jvm.internal.i.b(b4);
                                                                a aVar = (a) b4;
                                                                cVar3.f708g.c(i5, aVar);
                                                                aVar.f(i5);
                                                                cVar3.e(aVar, andDecrement, i5);
                                                            }
                                                            cVar3.f708g.c(andDecrement, null);
                                                            this.f686c = bVar4;
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
                        } else {
                            c cVar4 = this.f691h;
                            if (this.nextParkedWorker == vVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f698h;
                                while (true) {
                                    long j5 = atomicLongFieldUpdater2.get(cVar4);
                                    int i6 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.f708g.b((int) (j5 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.f698h.compareAndSet(cVar5, j5, ((j5 + 2097152) & (-2097152)) | i6)) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(b.f694c);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f688e);
                        this.f688e = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(b.f696e);
    }
}
