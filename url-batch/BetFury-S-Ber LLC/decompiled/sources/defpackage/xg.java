package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xg extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(xg.class, "workerCtl$volatile");
    public final ip0 f;
    public final a90 g;
    public yg h;
    public long i;
    private volatile int indexInArray;
    public long j;
    public int k;
    public boolean l;
    public final /* synthetic */ zg m;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public xg(zg zgVar, int i) {
        this.m = zgVar;
        setDaemon(true);
        setContextClassLoader(zg.class.getClassLoader());
        this.f = new ip0();
        this.g = new a90();
        this.h = yg.DORMANT;
        this.nextParkedWorker = zg.p;
        int nanoTime = (int) System.nanoTime();
        this.k = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final hh0 a(boolean z) {
        hh0 e;
        hh0 e2;
        long j;
        yg ygVar = this.h;
        yg ygVar2 = yg.CPU_ACQUIRED;
        zg zgVar = this.m;
        hh0 hh0Var = null;
        ip0 ip0Var = this.f;
        if (ygVar != ygVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = zg.n;
            do {
                j = atomicLongFieldUpdater.get(zgVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    ip0Var.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ip0.b;
                        hh0 hh0Var2 = (hh0) atomicReferenceFieldUpdater.get(ip0Var);
                        if (hh0Var2 != null && hh0Var2.g) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(ip0Var, hh0Var2, null)) {
                                if (atomicReferenceFieldUpdater.get(ip0Var) != hh0Var2) {
                                    break;
                                }
                            }
                            hh0Var = hh0Var2;
                            break loop1;
                        }
                    }
                    int i = ip0.d.get(ip0Var);
                    int i2 = ip0.c.get(ip0Var);
                    while (true) {
                        if (i == i2 || ip0.e.get(ip0Var) == 0) {
                            break;
                        }
                        i2--;
                        hh0 b = ip0Var.b(i2, true);
                        if (b != null) {
                            hh0Var = b;
                            break;
                        }
                    }
                    if (hh0Var != null) {
                        return hh0Var;
                    }
                    hh0 hh0Var3 = (hh0) zgVar.k.d();
                    return hh0Var3 == null ? i(1) : hh0Var3;
                }
            } while (!zg.n.compareAndSet(zgVar, j, j - 4398046511104L));
            this.h = yg.CPU_ACQUIRED;
        }
        if (z) {
            boolean z2 = d(zgVar.f * 2) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            ip0Var.getClass();
            hh0 hh0Var4 = (hh0) ip0.b.getAndSet(ip0Var, null);
            if (hh0Var4 == null) {
                hh0Var4 = ip0Var.a();
            }
            if (hh0Var4 != null) {
                return hh0Var4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            hh0 e3 = e();
            if (e3 != null) {
                return e3;
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
        int i2 = this.k;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.k = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final hh0 e() {
        int d = d(2);
        zg zgVar = this.m;
        ks ksVar = zgVar.k;
        ks ksVar2 = zgVar.j;
        if (d == 0) {
            hh0 hh0Var = (hh0) ksVar2.d();
            return hh0Var != null ? hh0Var : (hh0) ksVar.d();
        }
        hh0 hh0Var2 = (hh0) ksVar.d();
        return hh0Var2 != null ? hh0Var2 : (hh0) ksVar2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.m.i);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(yg ygVar) {
        yg ygVar2 = this.h;
        boolean z = ygVar2 == yg.CPU_ACQUIRED;
        if (z) {
            zg.n.addAndGet(this.m, 4398046511104L);
        }
        if (ygVar2 != ygVar) {
            this.h = ygVar;
        }
        return z;
    }

    public final hh0 i(int i) {
        long j;
        hh0 hh0Var;
        long j2;
        long j3;
        hh0 hh0Var2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = zg.n;
        zg zgVar = this.m;
        int i2 = (int) (atomicLongFieldUpdater.get(zgVar) & 2097151);
        hh0 hh0Var3 = null;
        if (i2 < 2) {
            return null;
        }
        int d = d(i2);
        int i3 = 0;
        long j4 = Long.MAX_VALUE;
        while (i3 < i2) {
            d++;
            if (d > i2) {
                d = 1;
            }
            xg xgVar = (xg) zgVar.l.b(d);
            if (xgVar != null && xgVar != this) {
                ip0 ip0Var = xgVar.f;
                if (i == 3) {
                    hh0Var = ip0Var.a();
                    j = 0;
                } else {
                    ip0Var.getClass();
                    int i4 = ip0.d.get(ip0Var);
                    int i5 = ip0.c.get(ip0Var);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 == i5) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z || ip0.e.get(ip0Var) != 0) {
                            int i6 = i4 + 1;
                            hh0Var = ip0Var.b(i4, z);
                            if (hh0Var != null) {
                                break;
                            }
                            i4 = i6;
                        } else {
                            break;
                        }
                    }
                    hh0Var = hh0Var3;
                }
                a90 a90Var = this.g;
                if (hh0Var != null) {
                    a90Var.f = hh0Var;
                    hh0Var2 = hh0Var3;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ip0.b;
                        hh0 hh0Var4 = (hh0) atomicReferenceFieldUpdater.get(ip0Var);
                        if (hh0Var4 == null) {
                            j2 = -1;
                            break;
                        }
                        j2 = -1;
                        if (((hh0Var4.g ? 1 : 2) & i) == 0) {
                            break;
                        }
                        lh0.f.getClass();
                        ip0 ip0Var2 = ip0Var;
                        long nanoTime = System.nanoTime() - hh0Var4.f;
                        long j5 = lh0.b;
                        if (nanoTime < j5) {
                            j3 = j5 - nanoTime;
                            hh0Var2 = null;
                            break;
                        }
                        do {
                            hh0Var2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(ip0Var2, hh0Var4, null)) {
                                a90Var.f = hh0Var4;
                                j3 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(ip0Var2) == hh0Var4);
                        ip0Var = ip0Var2;
                        hh0Var3 = null;
                    }
                    j3 = -2;
                    hh0Var2 = hh0Var3;
                }
                if (j3 == j2) {
                    hh0 hh0Var5 = (hh0) a90Var.f;
                    a90Var.f = hh0Var2;
                    return hh0Var5;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i3++;
            hh0Var3 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.j = j4;
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
            boolean z = false;
            while (zg.o.get(this.m) == 0) {
                yg ygVar = this.h;
                yg ygVar2 = yg.TERMINATED;
                if (ygVar == ygVar2) {
                    break loop0;
                }
                hh0 a = a(this.l);
                if (a != null) {
                    this.j = 0L;
                    zg zgVar = this.m;
                    this.i = 0L;
                    if (this.h == yg.PARKING) {
                        this.h = yg.BLOCKING;
                    }
                    if (a.g) {
                        if (h(yg.BLOCKING) && !zgVar.D() && !zgVar.w(zg.n.get(zgVar))) {
                            zgVar.D();
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        zg.n.addAndGet(zgVar, -2097152L);
                        if (this.h != ygVar2) {
                            this.h = yg.DORMANT;
                        }
                    } else {
                        try {
                            a.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.l = false;
                    if (this.j == 0) {
                        Object obj = this.nextParkedWorker;
                        lm lmVar = zg.p;
                        if (obj != lmVar) {
                            n.set(this, -1);
                            while (this.nextParkedWorker != zg.p) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    zg zgVar2 = this.m;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = zg.o;
                                    if (atomicIntegerFieldUpdater2.get(zgVar2) != 0) {
                                        break;
                                    }
                                    yg ygVar3 = this.h;
                                    yg ygVar4 = yg.TERMINATED;
                                    if (ygVar3 == ygVar4) {
                                        break;
                                    }
                                    h(yg.PARKING);
                                    Thread.interrupted();
                                    if (this.i == 0) {
                                        j = 2097151;
                                        this.i = System.nanoTime() + this.m.h;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.m.h);
                                    if (System.nanoTime() - this.i >= 0) {
                                        this.i = 0L;
                                        zg zgVar3 = this.m;
                                        synchronized (zgVar3.l) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(zgVar3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = zg.n;
                                                    if (((int) (atomicLongFieldUpdater.get(zgVar3) & j)) > zgVar3.f) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            f(0);
                                                            zgVar3.r(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(zgVar3) & j);
                                                            if (andDecrement != i) {
                                                                Object b = zgVar3.l.b(andDecrement);
                                                                b.getClass();
                                                                xg xgVar = (xg) b;
                                                                zgVar3.l.c(i, xgVar);
                                                                xgVar.f(i);
                                                                zgVar3.r(xgVar, andDecrement, i);
                                                            }
                                                            zgVar3.l.c(andDecrement, null);
                                                            this.h = ygVar4;
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
                            zg zgVar4 = this.m;
                            if (this.nextParkedWorker == lmVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = zg.m;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(zgVar4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = zgVar4.l.b((int) (j2 & 2097151));
                                    zg zgVar5 = zgVar4;
                                    if (zg.m.compareAndSet(zgVar5, j2, ((j2 + 2097152) & (-2097152)) | i2)) {
                                        break;
                                    } else {
                                        zgVar4 = zgVar5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(yg.PARKING);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.j);
                        this.j = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(yg.TERMINATED);
    }
}
