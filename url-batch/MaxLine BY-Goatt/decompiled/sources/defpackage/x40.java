package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x40 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater u = AtomicIntegerFieldUpdater.newUpdater(x40.class, "workerCtl$volatile");
    private volatile int indexInArray;
    public final a93 m;
    public final c82 n;
    private volatile Object nextParkedWorker;
    public y40 o;
    public long p;
    public long q;
    public int r;
    public boolean s;
    public final /* synthetic */ z40 t;
    private volatile /* synthetic */ int workerCtl$volatile;

    public x40(z40 z40Var, int i) {
        this.t = z40Var;
        setDaemon(true);
        setContextClassLoader(z40.class.getClassLoader());
        this.m = new a93();
        this.n = new c82();
        this.o = y40.p;
        this.nextParkedWorker = z40.w;
        int nanoTime = (int) System.nanoTime();
        this.r = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final ht2 a(boolean z) {
        ht2 e;
        ht2 e2;
        long j;
        y40 y40Var = this.o;
        y40 y40Var2 = y40.m;
        z40 z40Var = this.t;
        a93 a93Var = this.m;
        if (y40Var != y40Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = z40.u;
            do {
                j = atomicLongFieldUpdater.get(z40Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    ht2 g = a93Var.g();
                    return (g == null && (g = (ht2) z40Var.r.d()) == null) ? i(1) : g;
                }
            } while (!z40.u.compareAndSet(z40Var, j, j - 4398046511104L));
            this.o = y40.m;
        }
        if (z) {
            boolean z2 = d(z40Var.m * 2) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            ht2 e3 = a93Var.e();
            if (e3 != null) {
                return e3;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            ht2 e4 = e();
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
        int i2 = this.r;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.r = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final ht2 e() {
        int d = d(2);
        z40 z40Var = this.t;
        jv0 jv0Var = z40Var.r;
        jv0 jv0Var2 = z40Var.q;
        if (d == 0) {
            ht2 ht2Var = (ht2) jv0Var2.d();
            return ht2Var != null ? ht2Var : (ht2) jv0Var.d();
        }
        ht2 ht2Var2 = (ht2) jv0Var.d();
        return ht2Var2 != null ? ht2Var2 : (ht2) jv0Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.t.p);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(y40 y40Var) {
        y40 y40Var2 = this.o;
        boolean z = y40Var2 == y40.m;
        if (z) {
            z40.u.addAndGet(this.t, 4398046511104L);
        }
        if (y40Var2 != y40Var) {
            this.o = y40Var;
        }
        return z;
    }

    public final ht2 i(int i) {
        ht2 ht2Var;
        long i2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = z40.u;
        z40 z40Var = this.t;
        int i3 = (int) (atomicLongFieldUpdater.get(z40Var) & 2097151);
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
            x40 x40Var = (x40) z40Var.s.b(d);
            if (x40Var != null && x40Var != this) {
                a93 a93Var = x40Var.m;
                if (i == 3) {
                    ht2Var = a93Var.f();
                } else {
                    a93Var.getClass();
                    int i5 = a93.d.get(a93Var);
                    int i6 = a93.c.get(a93Var);
                    boolean z = i == 1;
                    while (i5 != i6 && (!z || a93.e.get(a93Var) != 0)) {
                        int i7 = i5 + 1;
                        ht2Var = a93Var.h(i5, z);
                        if (ht2Var != null) {
                            break;
                        }
                        i5 = i7;
                    }
                    ht2Var = null;
                }
                c82 c82Var = this.n;
                if (ht2Var != null) {
                    c82Var.m = ht2Var;
                    i2 = -1;
                } else {
                    i2 = a93Var.i(i, c82Var);
                }
                if (i2 == -1) {
                    ht2 ht2Var2 = (ht2) c82Var.m;
                    c82Var.m = null;
                    return ht2Var2;
                }
                if (i2 > 0) {
                    j = Math.min(j, i2);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            j = 0;
        }
        this.q = j;
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
            while (z40.v.get(this.t) == 0) {
                y40 y40Var = this.o;
                y40 y40Var2 = y40.q;
                if (y40Var == y40Var2) {
                    break loop0;
                }
                ht2 a = a(this.s);
                if (a != null) {
                    this.q = 0L;
                    z40 z40Var = this.t;
                    this.p = 0L;
                    if (this.o == y40.o) {
                        this.o = y40.n;
                    }
                    if (a.n) {
                        if (h(y40.n) && !z40Var.p() && !z40Var.o(z40.u.get(z40Var))) {
                            z40Var.p();
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        z40.u.addAndGet(z40Var, -2097152L);
                        if (this.o != y40Var2) {
                            this.o = y40.p;
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
                    this.s = false;
                    if (this.q == 0) {
                        Object obj = this.nextParkedWorker;
                        ng0 ng0Var = z40.w;
                        if (obj != ng0Var) {
                            u.set(this, -1);
                            while (this.nextParkedWorker != z40.w) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = u;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    z40 z40Var2 = this.t;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = z40.v;
                                    if (atomicIntegerFieldUpdater2.get(z40Var2) != 0) {
                                        break;
                                    }
                                    y40 y40Var3 = this.o;
                                    y40 y40Var4 = y40.q;
                                    if (y40Var3 == y40Var4) {
                                        break;
                                    }
                                    h(y40.o);
                                    Thread.interrupted();
                                    if (this.p == 0) {
                                        j = 2097151;
                                        this.p = System.nanoTime() + this.t.o;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.t.o);
                                    if (System.nanoTime() - this.p >= 0) {
                                        this.p = 0L;
                                        z40 z40Var3 = this.t;
                                        synchronized (z40Var3.s) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(z40Var3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = z40.u;
                                                    if (((int) (atomicLongFieldUpdater.get(z40Var3) & j)) > z40Var3.m) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i = this.indexInArray;
                                                            f(0);
                                                            z40Var3.n(this, i, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(z40Var3) & j);
                                                            if (andDecrement != i) {
                                                                Object b = z40Var3.s.b(andDecrement);
                                                                b.getClass();
                                                                x40 x40Var = (x40) b;
                                                                z40Var3.s.c(i, x40Var);
                                                                x40Var.f(i);
                                                                z40Var3.n(x40Var, andDecrement, i);
                                                            }
                                                            z40Var3.s.c(andDecrement, null);
                                                            Unit unit = Unit.a;
                                                            this.o = y40Var4;
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
                            z40 z40Var4 = this.t;
                            if (this.nextParkedWorker == ng0Var) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = z40.t;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(z40Var4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = z40Var4.s.b((int) (j2 & 2097151));
                                    z40 z40Var5 = z40Var4;
                                    if (z40.t.compareAndSet(z40Var5, j2, ((j2 + 2097152) & (-2097152)) | i2)) {
                                        break;
                                    } else {
                                        z40Var4 = z40Var5;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(y40.o);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.q);
                        this.q = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(y40.q);
    }
}
