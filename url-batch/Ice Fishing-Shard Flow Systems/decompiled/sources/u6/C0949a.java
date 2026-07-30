package u6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.Intrinsics;
import l0.C0654a;

/* renamed from: u6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0949a extends Thread {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8080q = AtomicIntegerFieldUpdater.newUpdater(C0949a.class, "workerCtl$volatile");

    /* renamed from: d, reason: collision with root package name */
    public final m f8081d;

    /* renamed from: e, reason: collision with root package name */
    public final D f8082e;

    /* renamed from: i, reason: collision with root package name */
    public EnumC0950b f8083i;
    private volatile int indexInArray;

    /* renamed from: l, reason: collision with root package name */
    public long f8084l;

    /* renamed from: m, reason: collision with root package name */
    public long f8085m;

    /* renamed from: n, reason: collision with root package name */
    public int f8086n;
    private volatile Object nextParkedWorker;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8087o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ExecutorC0951c f8088p;
    private volatile /* synthetic */ int workerCtl$volatile;

    public C0949a(ExecutorC0951c executorC0951c, int i2) {
        this.f8088p = executorC0951c;
        setDaemon(true);
        setContextClassLoader(ExecutorC0951c.class.getClassLoader());
        this.f8081d = new m();
        this.f8082e = new D();
        this.f8083i = EnumC0950b.f8092l;
        this.nextParkedWorker = ExecutorC0951c.f8098s;
        int nanoTime = (int) System.nanoTime();
        this.f8086n = nanoTime == 0 ? 42 : nanoTime;
        f(i2);
    }

    public final i a(boolean z7) {
        i e7;
        i e8;
        long j;
        EnumC0950b enumC0950b = this.f8083i;
        EnumC0950b enumC0950b2 = EnumC0950b.f8089d;
        ExecutorC0951c executorC0951c = this.f8088p;
        i iVar = null;
        m mVar = this.f8081d;
        if (enumC0950b != enumC0950b2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0951c.f8096q;
            do {
                j = atomicLongFieldUpdater.get(executorC0951c);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f8121b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f8112e) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i2 = m.f8123d.get(mVar);
                    int i5 = m.f8122c.get(mVar);
                    while (true) {
                        if (i2 == i5 || m.f8124e.get(mVar) == 0) {
                            break;
                        }
                        i5--;
                        i c7 = mVar.c(i5, true);
                        if (c7 != null) {
                            iVar = c7;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) executorC0951c.f8104n.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!ExecutorC0951c.f8096q.compareAndSet(executorC0951c, j, j - 4398046511104L));
            this.f8083i = EnumC0950b.f8089d;
        }
        if (z7) {
            boolean z8 = d(executorC0951c.f8099d * 2) == 0;
            if (z8 && (e8 = e()) != null) {
                return e8;
            }
            mVar.getClass();
            i iVar4 = (i) m.f8121b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z8 && (e7 = e()) != null) {
                return e7;
            }
        } else {
            i e9 = e();
            if (e9 != null) {
                return e9;
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
        int i5 = this.f8086n;
        int i7 = i5 ^ (i5 << 13);
        int i8 = i7 ^ (i7 >> 17);
        int i9 = i8 ^ (i8 << 5);
        this.f8086n = i9;
        int i10 = i2 - 1;
        return (i10 & i2) == 0 ? i9 & i10 : (i9 & Integer.MAX_VALUE) % i2;
    }

    public final i e() {
        int d7 = d(2);
        ExecutorC0951c executorC0951c = this.f8088p;
        if (d7 == 0) {
            i iVar = (i) executorC0951c.f8103m.d();
            return iVar != null ? iVar : (i) executorC0951c.f8104n.d();
        }
        i iVar2 = (i) executorC0951c.f8104n.d();
        return iVar2 != null ? iVar2 : (i) executorC0951c.f8103m.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8088p.f8102l);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(EnumC0950b enumC0950b) {
        EnumC0950b enumC0950b2 = this.f8083i;
        boolean z7 = enumC0950b2 == EnumC0950b.f8089d;
        if (z7) {
            ExecutorC0951c.f8096q.addAndGet(this.f8088p, 4398046511104L);
        }
        if (enumC0950b2 != enumC0950b) {
            this.f8083i = enumC0950b;
        }
        return z7;
    }

    public final i i(int i2) {
        long j;
        i iVar;
        long j7;
        long j8;
        i iVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0951c.f8096q;
        ExecutorC0951c executorC0951c = this.f8088p;
        int i5 = (int) (atomicLongFieldUpdater.get(executorC0951c) & 2097151);
        i iVar3 = null;
        if (i5 < 2) {
            return null;
        }
        int d7 = d(i5);
        int i7 = 0;
        long j9 = Long.MAX_VALUE;
        while (i7 < i5) {
            d7++;
            if (d7 > i5) {
                d7 = 1;
            }
            C0949a c0949a = (C0949a) executorC0951c.f8105o.b(d7);
            if (c0949a != null && c0949a != this) {
                m mVar = c0949a.f8081d;
                if (i2 == 3) {
                    iVar = mVar.b();
                    j = 0;
                } else {
                    mVar.getClass();
                    int i8 = m.f8123d.get(mVar);
                    int i9 = m.f8122c.get(mVar);
                    boolean z7 = i2 == 1;
                    while (true) {
                        if (i8 == i9) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z7 || m.f8124e.get(mVar) != 0) {
                            int i10 = i8 + 1;
                            iVar = mVar.c(i8, z7);
                            if (iVar != null) {
                                break;
                            }
                            i8 = i10;
                        } else {
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                D d8 = this.f8082e;
                if (iVar != null) {
                    d8.f6152d = iVar;
                    iVar2 = iVar3;
                    j8 = -1;
                    j7 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f8121b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j7 = -1;
                            break;
                        }
                        j7 = -1;
                        if (((iVar4.f8112e ? 1 : 2) & i2) == 0) {
                            break;
                        }
                        k.f8119f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f8111d;
                        long j10 = k.f8115b;
                        if (nanoTime < j10) {
                            j8 = j10 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                d8.f6152d = iVar4;
                                j8 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j8 = -2;
                    iVar2 = iVar3;
                }
                if (j8 == j7) {
                    i iVar5 = (i) d8.f6152d;
                    d8.f6152d = iVar2;
                    return iVar5;
                }
                if (j8 > j) {
                    j9 = Math.min(j9, j8);
                }
            }
            i7++;
            iVar3 = null;
        }
        if (j9 == Long.MAX_VALUE) {
            j9 = 0;
        }
        this.f8085m = j9;
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
        long j;
        loop0: while (true) {
            boolean z7 = false;
            while (ExecutorC0951c.f8097r.get(this.f8088p) == 0) {
                EnumC0950b enumC0950b = this.f8083i;
                EnumC0950b enumC0950b2 = EnumC0950b.f8093m;
                if (enumC0950b == enumC0950b2) {
                    break loop0;
                }
                i a7 = a(this.f8087o);
                if (a7 != null) {
                    this.f8085m = 0L;
                    ExecutorC0951c executorC0951c = this.f8088p;
                    this.f8084l = 0L;
                    if (this.f8083i == EnumC0950b.f8091i) {
                        this.f8083i = EnumC0950b.f8090e;
                    }
                    if (a7.f8112e) {
                        if (h(EnumC0950b.f8090e) && !executorC0951c.s() && !executorC0951c.j(ExecutorC0951c.f8096q.get(executorC0951c))) {
                            executorC0951c.s();
                        }
                        try {
                            a7.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        ExecutorC0951c.f8096q.addAndGet(executorC0951c, -2097152L);
                        if (this.f8083i != enumC0950b2) {
                            this.f8083i = EnumC0950b.f8092l;
                        }
                    } else {
                        try {
                            a7.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.f8087o = false;
                    if (this.f8085m == 0) {
                        Object obj = this.nextParkedWorker;
                        C0654a c0654a = ExecutorC0951c.f8098s;
                        if (obj != c0654a) {
                            f8080q.set(this, -1);
                            while (this.nextParkedWorker != ExecutorC0951c.f8098s) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8080q;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    ExecutorC0951c executorC0951c2 = this.f8088p;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC0951c.f8097r;
                                    if (atomicIntegerFieldUpdater2.get(executorC0951c2) != 0) {
                                        break;
                                    }
                                    EnumC0950b enumC0950b3 = this.f8083i;
                                    EnumC0950b enumC0950b4 = EnumC0950b.f8093m;
                                    if (enumC0950b3 == enumC0950b4) {
                                        break;
                                    }
                                    h(EnumC0950b.f8091i);
                                    Thread.interrupted();
                                    if (this.f8084l == 0) {
                                        j = 2097151;
                                        this.f8084l = System.nanoTime() + this.f8088p.f8101i;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.f8088p.f8101i);
                                    if (System.nanoTime() - this.f8084l >= 0) {
                                        this.f8084l = 0L;
                                        ExecutorC0951c executorC0951c3 = this.f8088p;
                                        synchronized (executorC0951c3.f8105o) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(executorC0951c3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0951c.f8096q;
                                                    if (((int) (atomicLongFieldUpdater.get(executorC0951c3) & j)) > executorC0951c3.f8099d) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i2 = this.indexInArray;
                                                            f(0);
                                                            executorC0951c3.h(this, i2, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC0951c3) & j);
                                                            if (andDecrement != i2) {
                                                                Object b7 = executorC0951c3.f8105o.b(andDecrement);
                                                                Intrinsics.b(b7);
                                                                C0949a c0949a = (C0949a) b7;
                                                                executorC0951c3.f8105o.c(i2, c0949a);
                                                                c0949a.f(i2);
                                                                executorC0951c3.h(c0949a, andDecrement, i2);
                                                            }
                                                            executorC0951c3.f8105o.c(andDecrement, null);
                                                            Unit unit = Unit.f6114a;
                                                            this.f8083i = enumC0950b4;
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
                            ExecutorC0951c executorC0951c4 = this.f8088p;
                            if (this.nextParkedWorker == c0654a) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC0951c.f8095p;
                                while (true) {
                                    long j7 = atomicLongFieldUpdater2.get(executorC0951c4);
                                    int i5 = this.indexInArray;
                                    this.nextParkedWorker = executorC0951c4.f8105o.b((int) (j7 & 2097151));
                                    ExecutorC0951c executorC0951c5 = executorC0951c4;
                                    if (ExecutorC0951c.f8095p.compareAndSet(executorC0951c5, j7, ((j7 + 2097152) & (-2097152)) | i5)) {
                                        break;
                                    } else {
                                        executorC0951c4 = executorC0951c5;
                                    }
                                }
                            }
                        }
                    } else if (z7) {
                        h(EnumC0950b.f8091i);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f8085m);
                        this.f8085m = 0L;
                    } else {
                        z7 = true;
                    }
                }
            }
            break loop0;
        }
        h(EnumC0950b.f8093m);
    }
}
