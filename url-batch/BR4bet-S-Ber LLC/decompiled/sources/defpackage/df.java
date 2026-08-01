package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class df extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(df.class, "workerCtl$volatile");
    public final df0 f;
    public final t20 g;
    public ef h;
    public long i;
    private volatile int indexInArray;
    public long j;
    public int k;
    public boolean l;
    public final /* synthetic */ ff m;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public df(ff ffVar, int i) {
        this.m = ffVar;
        setDaemon(true);
        setContextClassLoader(ff.class.getClassLoader());
        this.f = new df0();
        this.g = new t20(0);
        this.h = ef.i;
        this.nextParkedWorker = ff.p;
        int nanoTime = (int) System.nanoTime();
        this.k = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final i80 a(boolean z) {
        i80 e;
        i80 e2;
        long j;
        ef efVar = this.h;
        ff ffVar = this.m;
        i80 i80Var = null;
        df0 df0Var = this.f;
        ef efVar2 = ef.f;
        if (efVar != efVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ff.n;
            do {
                j = atomicLongFieldUpdater.get(ffVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    df0Var.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = df0.b;
                        i80 i80Var2 = (i80) atomicReferenceFieldUpdater.get(df0Var);
                        if (i80Var2 != null && i80Var2.g) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(df0Var, i80Var2, null)) {
                                if (atomicReferenceFieldUpdater.get(df0Var) != i80Var2) {
                                    break;
                                }
                            }
                            i80Var = i80Var2;
                            break loop1;
                        }
                    }
                    int i = df0.d.get(df0Var);
                    int i2 = df0.c.get(df0Var);
                    while (true) {
                        if (i == i2 || df0.e.get(df0Var) == 0) {
                            break;
                        }
                        i2--;
                        i80 b = df0Var.b(i2, true);
                        if (b != null) {
                            i80Var = b;
                            break;
                        }
                    }
                    if (i80Var != null) {
                        return i80Var;
                    }
                    i80 i80Var3 = (i80) ffVar.k.d();
                    return i80Var3 == null ? i(1) : i80Var3;
                }
            } while (!ff.n.compareAndSet(ffVar, j, j - 4398046511104L));
            this.h = efVar2;
        }
        if (z) {
            boolean z2 = d(ffVar.f * 2) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            df0Var.getClass();
            i80 i80Var4 = (i80) df0.b.getAndSet(df0Var, null);
            if (i80Var4 == null) {
                i80Var4 = df0Var.a();
            }
            if (i80Var4 != null) {
                return i80Var4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            i80 e3 = e();
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

    public final i80 e() {
        int d = d(2);
        ff ffVar = this.m;
        wo woVar = ffVar.k;
        wo woVar2 = ffVar.j;
        if (d == 0) {
            i80 i80Var = (i80) woVar2.d();
            return i80Var != null ? i80Var : (i80) woVar.d();
        }
        i80 i80Var2 = (i80) woVar.d();
        return i80Var2 != null ? i80Var2 : (i80) woVar2.d();
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

    public final boolean h(ef efVar) {
        ef efVar2 = this.h;
        boolean z = efVar2 == ef.f;
        if (z) {
            ff.n.addAndGet(this.m, 4398046511104L);
        }
        if (efVar2 != efVar) {
            this.h = efVar;
        }
        return z;
    }

    public final i80 i(int i) {
        long j;
        i80 i80Var;
        long j2;
        long j3;
        i80 i80Var2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ff.n;
        ff ffVar = this.m;
        int i2 = (int) (atomicLongFieldUpdater.get(ffVar) & 2097151);
        i80 i80Var3 = null;
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
            df dfVar = (df) ffVar.l.b(d);
            if (dfVar != null && dfVar != this) {
                df0 df0Var = dfVar.f;
                if (i == 3) {
                    i80Var = df0Var.a();
                    j = 0;
                } else {
                    df0Var.getClass();
                    int i4 = df0.d.get(df0Var);
                    int i5 = df0.c.get(df0Var);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 == i5) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z || df0.e.get(df0Var) != 0) {
                            int i6 = i4 + 1;
                            i80Var = df0Var.b(i4, z);
                            if (i80Var != null) {
                                break;
                            }
                            i4 = i6;
                        } else {
                            break;
                        }
                    }
                    i80Var = i80Var3;
                }
                t20 t20Var = this.g;
                if (i80Var != null) {
                    t20Var.g = i80Var;
                    i80Var2 = i80Var3;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = df0.b;
                        i80 i80Var4 = (i80) atomicReferenceFieldUpdater.get(df0Var);
                        if (i80Var4 == null) {
                            j2 = -1;
                            break;
                        }
                        j2 = -1;
                        if (((i80Var4.g ? 1 : 2) & i) == 0) {
                            break;
                        }
                        m80.f.getClass();
                        df0 df0Var2 = df0Var;
                        long nanoTime = System.nanoTime() - i80Var4.f;
                        long j5 = m80.b;
                        if (nanoTime < j5) {
                            j3 = j5 - nanoTime;
                            i80Var2 = null;
                            break;
                        }
                        do {
                            i80Var2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(df0Var2, i80Var4, null)) {
                                t20Var.g = i80Var4;
                                j3 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(df0Var2) == i80Var4);
                        df0Var = df0Var2;
                        i80Var3 = null;
                    }
                    j3 = -2;
                    i80Var2 = i80Var3;
                }
                if (j3 == j2) {
                    i80 i80Var5 = (i80) t20Var.g;
                    t20Var.g = i80Var2;
                    return i80Var5;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i3++;
            i80Var3 = null;
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
            while (ff.o.get(this.m) == 0) {
                ef efVar = this.h;
                ef efVar2 = ef.j;
                if (efVar == efVar2) {
                    break loop0;
                }
                i80 a = a(this.l);
                if (a != null) {
                    this.j = 0L;
                    ff ffVar = this.m;
                    this.i = 0L;
                    if (this.h == ef.h) {
                        this.h = ef.g;
                    }
                    if (a.g) {
                        if (h(ef.g) && !ffVar.q() && !ffVar.k(ff.n.get(ffVar))) {
                            ffVar.q();
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        ff.n.addAndGet(ffVar, -2097152L);
                        if (this.h != efVar2) {
                            this.h = ef.i;
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
                        xj xjVar = ff.p;
                        if (obj != xjVar) {
                            n.set(this, -1);
                            while (this.nextParkedWorker != ff.p) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    ff ffVar2 = this.m;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ff.o;
                                    if (atomicIntegerFieldUpdater2.get(ffVar2) != 0) {
                                        break;
                                    }
                                    ef efVar3 = this.h;
                                    ef efVar4 = ef.j;
                                    if (efVar3 == efVar4) {
                                        break;
                                    }
                                    h(ef.h);
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
                                        ff ffVar3 = this.m;
                                        synchronized (ffVar3.l) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(ffVar3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = ff.n;
                                                    if (((int) (atomicLongFieldUpdater.get(ffVar3) & j)) > ffVar3.f) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            f(0);
                                                            ffVar3.h(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(ffVar3) & j);
                                                            if (andDecrement != i) {
                                                                Object b = ffVar3.l.b(andDecrement);
                                                                b.getClass();
                                                                df dfVar = (df) b;
                                                                ffVar3.l.c(i, dfVar);
                                                                dfVar.f(i);
                                                                ffVar3.h(dfVar, andDecrement, i);
                                                            }
                                                            ffVar3.l.c(andDecrement, null);
                                                            this.h = efVar4;
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
                            ff ffVar4 = this.m;
                            if (this.nextParkedWorker == xjVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ff.m;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(ffVar4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = ffVar4.l.b((int) (j2 & 2097151));
                                    ff ffVar5 = ffVar4;
                                    if (ff.m.compareAndSet(ffVar5, j2, ((j2 + 2097152) & (-2097152)) | i2)) {
                                        break;
                                    } else {
                                        ffVar4 = ffVar5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(ef.h);
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
        h(ef.j);
    }
}
