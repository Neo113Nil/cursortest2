package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pn extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(pn.class, "workerCtl$volatile");
    public final gq1 d;
    public final z11 e;
    public qn g;
    public long h;
    public long i;
    private volatile int indexInArray;
    public int j;
    public boolean k;
    public final /* synthetic */ rn l;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public pn(rn rnVar, int i) {
        this.l = rnVar;
        setDaemon(true);
        setContextClassLoader(rn.class.getClassLoader());
        this.d = new gq1();
        this.e = new z11();
        this.g = qn.h;
        this.nextParkedWorker = rn.o;
        int nanoTime = (int) System.nanoTime();
        this.j = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final mg1 a(boolean z) {
        mg1 e;
        mg1 e2;
        long j;
        qn qnVar = this.g;
        qn qnVar2 = qn.d;
        rn rnVar = this.l;
        gq1 gq1Var = this.d;
        if (qnVar != qnVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = rn.m;
            do {
                j = atomicLongFieldUpdater.get(rnVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mg1 g = gq1Var.g();
                    return (g == null && (g = (mg1) rnVar.j.d()) == null) ? i(1) : g;
                }
            } while (!rn.m.compareAndSet(rnVar, j, j - 4398046511104L));
            this.g = qn.d;
        }
        if (z) {
            boolean z2 = d(rnVar.d * 2) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            mg1 e3 = gq1Var.e();
            if (e3 != null) {
                return e3;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            mg1 e4 = e();
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

    public final int d(int i) {
        int i2 = this.j;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.j = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final mg1 e() {
        int d = d(2);
        rn rnVar = this.l;
        v40 v40Var = rnVar.j;
        v40 v40Var2 = rnVar.i;
        if (d == 0) {
            mg1 mg1Var = (mg1) v40Var2.d();
            return mg1Var != null ? mg1Var : (mg1) v40Var.d();
        }
        mg1 mg1Var2 = (mg1) v40Var.d();
        return mg1Var2 != null ? mg1Var2 : (mg1) v40Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.l.h);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(qn qnVar) {
        qn qnVar2 = this.g;
        boolean z = qnVar2 == qn.d;
        if (z) {
            rn.m.addAndGet(this.l, 4398046511104L);
        }
        if (qnVar2 != qnVar) {
            this.g = qnVar;
        }
        return z;
    }

    public final mg1 i(int i) {
        mg1 mg1Var;
        long i2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = rn.m;
        rn rnVar = this.l;
        int i3 = (int) (atomicLongFieldUpdater.get(rnVar) & 2097151);
        if (i3 < 2) {
            return null;
        }
        int d = d(i3);
        long j = Long.MAX_VALUE;
        for (int i4 = 0; i4 < i3; i4++) {
            d++;
            if (d > i3) {
                d = 1;
            }
            pn pnVar = (pn) rnVar.k.b(d);
            if (pnVar != null && pnVar != this) {
                gq1 gq1Var = pnVar.d;
                if (i == 3) {
                    mg1Var = gq1Var.f();
                } else {
                    gq1Var.getClass();
                    int i5 = gq1.d.get(gq1Var);
                    int i6 = gq1.c.get(gq1Var);
                    boolean z = i == 1;
                    while (i5 != i6 && (!z || gq1.e.get(gq1Var) != 0)) {
                        int i7 = i5 + 1;
                        mg1Var = gq1Var.h(i5, z);
                        if (mg1Var != null) {
                            break;
                        }
                        i5 = i7;
                    }
                    mg1Var = null;
                }
                z11 z11Var = this.e;
                if (mg1Var != null) {
                    z11Var.d = mg1Var;
                    i2 = -1;
                } else {
                    i2 = gq1Var.i(i, z11Var);
                }
                if (i2 == -1) {
                    mg1 mg1Var2 = (mg1) z11Var.d;
                    z11Var.d = null;
                    return mg1Var2;
                }
                if (i2 > 0) {
                    j = Math.min(j, i2);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            j = 0;
        }
        this.i = j;
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
            while (rn.n.get(this.l) == 0) {
                qn qnVar = this.g;
                qn qnVar2 = qn.i;
                if (qnVar == qnVar2) {
                    break loop0;
                }
                mg1 a = a(this.k);
                if (a != null) {
                    this.i = 0L;
                    rn rnVar = this.l;
                    this.h = 0L;
                    if (this.g == qn.g) {
                        this.g = qn.e;
                    }
                    if (a.e) {
                        if (h(qn.e) && !rnVar.f() && !rnVar.e(rn.m.get(rnVar))) {
                            rnVar.f();
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        rn.m.addAndGet(rnVar, -2097152L);
                        if (this.g != qnVar2) {
                            this.g = qn.h;
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
                    this.k = false;
                    if (this.i == 0) {
                        Object obj = this.nextParkedWorker;
                        fv fvVar = rn.o;
                        if (obj != fvVar) {
                            m.set(this, -1);
                            while (this.nextParkedWorker != rn.o) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    rn rnVar2 = this.l;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = rn.n;
                                    if (atomicIntegerFieldUpdater2.get(rnVar2) != 0) {
                                        break;
                                    }
                                    qn qnVar3 = this.g;
                                    qn qnVar4 = qn.i;
                                    if (qnVar3 == qnVar4) {
                                        break;
                                    }
                                    h(qn.g);
                                    Thread.interrupted();
                                    if (this.h == 0) {
                                        j = 2097151;
                                        this.h = System.nanoTime() + this.l.g;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.l.g);
                                    if (System.nanoTime() - this.h >= 0) {
                                        this.h = 0L;
                                        rn rnVar3 = this.l;
                                        synchronized (rnVar3.k) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(rnVar3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = rn.m;
                                                    if (((int) (atomicLongFieldUpdater.get(rnVar3) & j)) > rnVar3.d) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            f(0);
                                                            rnVar3.d(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(rnVar3) & j);
                                                            if (andDecrement != i) {
                                                                Object b = rnVar3.k.b(andDecrement);
                                                                b.getClass();
                                                                pn pnVar = (pn) b;
                                                                rnVar3.k.c(i, pnVar);
                                                                pnVar.f(i);
                                                                rnVar3.d(pnVar, andDecrement, i);
                                                            }
                                                            rnVar3.k.c(andDecrement, null);
                                                            this.g = qnVar4;
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
                            rn rnVar4 = this.l;
                            if (this.nextParkedWorker == fvVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = rn.l;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(rnVar4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = rnVar4.k.b((int) (j2 & 2097151));
                                    rn rnVar5 = rnVar4;
                                    if (rn.l.compareAndSet(rnVar5, j2, ((j2 + 2097152) & (-2097152)) | i2)) {
                                        break;
                                    } else {
                                        rnVar4 = rnVar5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(qn.g);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.i);
                        this.i = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(qn.i);
    }
}
