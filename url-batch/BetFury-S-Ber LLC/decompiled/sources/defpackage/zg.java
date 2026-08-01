package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class zg implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(zg.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(zg.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(zg.class, "_isTerminated$volatile");
    public static final lm p = new lm("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int f;
    public final int g;
    public final long h;
    public final String i;
    public final ks j;
    public final ks k;
    public final m90 l;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public zg(int i, int i2, long j, String str) {
        this.f = i;
        this.g = i2;
        this.h = j;
        this.i = str;
        if (i < 1) {
            s9.r(i, " should be at least 1", "Core pool size ");
            throw null;
        }
        if (i2 < i) {
            s9.e(r7.a(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            s9.r(i2, " should not exceed maximal supported number of threads 2097150", "Max pool size ");
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.j = new ks();
        this.k = new ks();
        this.l = new m90((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public final boolean D() {
        zg zgVar;
        lm lmVar;
        int i;
        while (true) {
            long j = m.get(this);
            xg xgVar = (xg) this.l.b((int) (2097151 & j));
            if (xgVar == null) {
                xgVar = null;
                zgVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = xgVar.c();
                while (true) {
                    lmVar = p;
                    if (c == lmVar) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    xg xgVar2 = (xg) c;
                    i = xgVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c = xgVar2.c();
                    j = j;
                }
                if (i >= 0) {
                    zg zgVar2 = this;
                    boolean compareAndSet = m.compareAndSet(zgVar2, j, i | j2);
                    zgVar = zgVar2;
                    if (compareAndSet) {
                        xgVar.g(lmVar);
                    }
                    this = zgVar;
                } else {
                    continue;
                }
            }
            if (xgVar == null) {
                return false;
            }
            if (xg.n.compareAndSet(xgVar, -1, 0)) {
                LockSupport.unpark(xgVar);
                return true;
            }
            this = zgVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 == null) goto L38;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        hh0 hh0Var;
        if (o.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            xg xgVar = currentThread instanceof xg ? (xg) currentThread : null;
            if (xgVar == null || xgVar.m != this) {
                xgVar = null;
            }
            synchronized (this.l) {
                i = (int) (n.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object b = this.l.b(i2);
                    b.getClass();
                    xg xgVar2 = (xg) b;
                    if (xgVar2 != xgVar) {
                        while (xgVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(xgVar2);
                            xgVar2.join(10000L);
                        }
                        ip0 ip0Var = xgVar2.f;
                        ks ksVar = this.k;
                        ip0Var.getClass();
                        hh0 hh0Var2 = (hh0) ip0.b.getAndSet(ip0Var, null);
                        if (hh0Var2 != null) {
                            ksVar.a(hh0Var2);
                        }
                        while (true) {
                            hh0 a = ip0Var.a();
                            if (a == null) {
                                break;
                            } else {
                                ksVar.a(a);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.k.b();
            this.j.b();
            while (true) {
                if (xgVar != null) {
                    hh0Var = xgVar.a(true);
                }
                hh0Var = (hh0) this.j.d();
                if (hh0Var == null && (hh0Var = (hh0) this.k.d()) == null) {
                    break;
                }
                try {
                    hh0Var.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (xgVar != null) {
                xgVar.h(yg.TERMINATED);
            }
            m.set(this, 0L);
            n.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        n(runnable, false);
    }

    public final int i() {
        synchronized (this.l) {
            try {
                if (o.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = n;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f) {
                    return 0;
                }
                if (i >= this.g) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.l.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                xg xgVar = new xg(this, i3);
                this.l.c(i3, xgVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                xgVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(Runnable runnable, boolean z) {
        hh0 ih0Var;
        yg ygVar;
        lh0.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof hh0) {
            ih0Var = (hh0) runnable;
            ih0Var.f = nanoTime;
            ih0Var.g = z;
        } else {
            ih0Var = new ih0(runnable, nanoTime, z);
        }
        boolean z2 = ih0Var.g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = n;
        long addAndGet = z2 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        xg xgVar = currentThread instanceof xg ? (xg) currentThread : null;
        if (xgVar == null || xgVar.m != this) {
            xgVar = null;
        }
        if (xgVar != null && (ygVar = xgVar.h) != yg.TERMINATED && (ih0Var.g || ygVar != yg.BLOCKING)) {
            xgVar.l = true;
            ip0 ip0Var = xgVar.f;
            ip0Var.getClass();
            ih0Var = (hh0) ip0.b.getAndSet(ip0Var, ih0Var);
            if (ih0Var != null) {
                AtomicReferenceArray atomicReferenceArray = ip0Var.a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ip0.c;
                if (atomicIntegerFieldUpdater.get(ip0Var) - ip0.d.get(ip0Var) != 127) {
                    if (ih0Var.g) {
                        ip0.e.incrementAndGet(ip0Var);
                    }
                    int i = atomicIntegerFieldUpdater.get(ip0Var) & 127;
                    while (atomicReferenceArray.get(i) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i, ih0Var);
                    atomicIntegerFieldUpdater.incrementAndGet(ip0Var);
                }
            }
            ih0Var = null;
        }
        if (ih0Var != null) {
            if (!(ih0Var.g ? this.k.a(ih0Var) : this.j.a(ih0Var))) {
                throw new RejectedExecutionException(r7.d(new StringBuilder(), this.i, " was terminated"));
            }
        }
        if (z2) {
            if (D() || w(addAndGet)) {
                return;
            }
            D();
            return;
        }
        if (D() || w(atomicLongFieldUpdater.get(this))) {
            return;
        }
        D();
    }

    public final void r(xg xgVar, int i, int i2) {
        while (true) {
            long j = m.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = xgVar.c();
                    while (true) {
                        if (c == p) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        xg xgVar2 = (xg) c;
                        int b = xgVar2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = xgVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                zg zgVar = this;
                if (m.compareAndSet(zgVar, j, i3 | j2)) {
                    return;
                } else {
                    this = zgVar;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        m90 m90Var = this.l;
        int a = m90Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            xg xgVar = (xg) m90Var.b(i6);
            if (xgVar != null) {
                ip0 ip0Var = xgVar.f;
                ip0Var.getClass();
                int i7 = ip0.b.get(ip0Var) != null ? (ip0.c.get(ip0Var) - ip0.d.get(ip0Var)) + 1 : ip0.c.get(ip0Var) - ip0.d.get(ip0Var);
                int i8 = wg.a[xgVar.h.ordinal()];
                if (i8 == 1) {
                    i3++;
                } else if (i8 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i8 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i8 == 4) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i8 != 5) {
                        throw new md();
                    }
                    i5++;
                }
            }
        }
        long j = n.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.i);
        sb4.append('@');
        sb4.append(bi.D(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.f;
        sb4.append(i9);
        sb4.append(", max = ");
        sb4.append(this.g);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.j.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.k.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean w(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f;
        if (i < i2) {
            int i3 = i();
            if (i3 == 1 && i2 > 1) {
                i();
            }
            if (i3 > 0) {
                return true;
            }
        }
        return false;
    }
}
