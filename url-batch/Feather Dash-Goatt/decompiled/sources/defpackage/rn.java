package defpackage;

import com.appsflyer.internal.l;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class rn implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(rn.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(rn.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(rn.class, "_isTerminated$volatile");
    public static final fv o = new fv("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int d;
    public final int e;
    public final long g;
    public final String h;
    public final v40 i;
    public final v40 j;
    public final y21 k;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public rn(String str, int i, int i2, long j) {
        this.d = i;
        this.e = i2;
        this.g = j;
        this.h = str;
        if (i < 1) {
            dd0.g("Core pool size ", i, " should be at least 1");
            throw null;
        }
        if (i2 < i) {
            af.d(i2, i, " should be greater than or equals to core pool size ", "Max pool size ");
            throw null;
        }
        if (i2 > 2097150) {
            dd0.g("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150");
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.i = new v40();
        this.j = new v40();
        this.k = new y21((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void c(rn rnVar, Runnable runnable, int i) {
        rnVar.b(runnable, false, (i & 4) == 0);
    }

    public final int a() {
        synchronized (this.k) {
            try {
                if (n.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = m;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.d) {
                    return 0;
                }
                if (i >= this.e) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.k.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                pn pnVar = new pn(this, i3);
                this.k.c(i3, pnVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                pnVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z, boolean z2) {
        mg1 pg1Var;
        qn qnVar;
        qg1.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof mg1) {
            pg1Var = (mg1) runnable;
            pg1Var.d = nanoTime;
            pg1Var.e = z;
        } else {
            pg1Var = new pg1(runnable, nanoTime, z);
        }
        boolean z3 = pg1Var.e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = m;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        pn pnVar = null;
        pn pnVar2 = currentThread instanceof pn ? (pn) currentThread : null;
        if (pnVar2 != null && pnVar2.l == this) {
            pnVar = pnVar2;
        }
        if (pnVar != null && (qnVar = pnVar.g) != qn.i && (pg1Var.e || qnVar != qn.e)) {
            pnVar.k = true;
            pg1Var = pnVar.d.a(pg1Var, z2);
        }
        if (pg1Var != null) {
            if (!(pg1Var.e ? this.j.a(pg1Var) : this.i.a(pg1Var))) {
                throw new RejectedExecutionException(this.h + " was terminated");
            }
        }
        boolean z4 = z2 && pnVar != null;
        if (z3) {
            if (z4 || f() || e(addAndGet)) {
                return;
            }
            f();
            return;
        }
        if (z4 || f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (r0 == null) goto L33;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i;
        mg1 mg1Var;
        if (n.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            pn pnVar = null;
            pn pnVar2 = currentThread instanceof pn ? (pn) currentThread : null;
            if (pnVar2 != null && pnVar2.l == this) {
                pnVar = pnVar2;
            }
            synchronized (this.k) {
                i = (int) (m.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object b = this.k.b(i2);
                    b.getClass();
                    pn pnVar3 = (pn) b;
                    if (pnVar3 != pnVar) {
                        while (pnVar3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(pnVar3);
                            pnVar3.join(10000L);
                        }
                        pnVar3.d.d(this.j);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.j.b();
            this.i.b();
            while (true) {
                if (pnVar != null) {
                    mg1Var = pnVar.a(true);
                }
                mg1Var = (mg1) this.i.d();
                if (mg1Var == null && (mg1Var = (mg1) this.j.d()) == null) {
                    break;
                }
                try {
                    mg1Var.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (pnVar != null) {
                pnVar.h(qn.i);
            }
            l.set(this, 0L);
            m.set(this, 0L);
        }
    }

    public final void d(pn pnVar, int i, int i2) {
        while (true) {
            long j = l.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = pnVar.c();
                    while (true) {
                        if (c == o) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        pn pnVar2 = (pn) c;
                        int b = pnVar2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = pnVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                rn rnVar = this;
                if (l.compareAndSet(rnVar, j, i3 | j2)) {
                    return;
                } else {
                    this = rnVar;
                }
            }
        }
    }

    public final boolean e(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.d;
        if (i < i2) {
            int a = a();
            if (a == 1 && i2 > 1) {
                a();
            }
            if (a > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, 6);
    }

    public final boolean f() {
        rn rnVar;
        fv fvVar;
        int i;
        while (true) {
            long j = l.get(this);
            pn pnVar = (pn) this.k.b((int) (2097151 & j));
            if (pnVar == null) {
                pnVar = null;
                rnVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = pnVar.c();
                while (true) {
                    fvVar = o;
                    if (c == fvVar) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    pn pnVar2 = (pn) c;
                    i = pnVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c = pnVar2.c();
                    j = j;
                }
                if (i >= 0) {
                    rn rnVar2 = this;
                    boolean compareAndSet = l.compareAndSet(rnVar2, j, i | j2);
                    rnVar = rnVar2;
                    if (compareAndSet) {
                        pnVar.g(fvVar);
                    }
                    this = rnVar;
                } else {
                    continue;
                }
            }
            if (pnVar == null) {
                return false;
            }
            if (pn.m.compareAndSet(pnVar, -1, 0)) {
                LockSupport.unpark(pnVar);
                return true;
            }
            this = rnVar;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        y21 y21Var = this.k;
        int a = y21Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            pn pnVar = (pn) y21Var.b(i6);
            if (pnVar != null) {
                int c = pnVar.d.c();
                int ordinal = pnVar.g.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (c > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(c);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        l.a();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = m.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.h);
        sb4.append('@');
        sb4.append(op.y(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.d;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.e);
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
        sb4.append(this.i.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.j.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
