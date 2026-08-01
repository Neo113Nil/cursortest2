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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ff implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(ff.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(ff.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(ff.class, "_isTerminated$volatile");
    public static final xj p = new xj("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int f;
    public final int g;
    public final long h;
    public final String i;
    public final wo j;
    public final wo k;
    public final e30 l;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public ff(int i, int i2, long j, String str) {
        this.f = i;
        this.g = i2;
        this.h = j;
        this.i = str;
        if (i < 1) {
            g9.p(i, " should be at least 1", "Core pool size ");
            throw null;
        }
        if (i2 < i) {
            g9.d(f60.d(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            g9.p(i2, " should not exceed maximal supported number of threads 2097150", "Max pool size ");
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.j = new wo();
        this.k = new wo();
        this.l = new e30((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
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
        i80 i80Var;
        if (o.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            df dfVar = currentThread instanceof df ? (df) currentThread : null;
            if (dfVar == null || dfVar.m != this) {
                dfVar = null;
            }
            synchronized (this.l) {
                i = (int) (n.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object b = this.l.b(i2);
                    b.getClass();
                    df dfVar2 = (df) b;
                    if (dfVar2 != dfVar) {
                        while (dfVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(dfVar2);
                            dfVar2.join(10000L);
                        }
                        df0 df0Var = dfVar2.f;
                        wo woVar = this.k;
                        df0Var.getClass();
                        i80 i80Var2 = (i80) df0.b.getAndSet(df0Var, null);
                        if (i80Var2 != null) {
                            woVar.a(i80Var2);
                        }
                        while (true) {
                            i80 a = df0Var.a();
                            if (a == null) {
                                break;
                            } else {
                                woVar.a(a);
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
                if (dfVar != null) {
                    i80Var = dfVar.a(true);
                }
                i80Var = (i80) this.j.d();
                if (i80Var == null && (i80Var = (i80) this.k.d()) == null) {
                    break;
                }
                try {
                    i80Var.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (dfVar != null) {
                dfVar.h(ef.j);
            }
            m.set(this, 0L);
            n.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(runnable, false);
    }

    public final int f() {
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
                df dfVar = new df(this, i3);
                this.l.c(i3, dfVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                dfVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Runnable runnable, boolean z) {
        i80 j80Var;
        ef efVar;
        m80.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i80) {
            j80Var = (i80) runnable;
            j80Var.f = nanoTime;
            j80Var.g = z;
        } else {
            j80Var = new j80(runnable, nanoTime, z);
        }
        boolean z2 = j80Var.g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = n;
        long addAndGet = z2 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        df dfVar = currentThread instanceof df ? (df) currentThread : null;
        if (dfVar == null || dfVar.m != this) {
            dfVar = null;
        }
        if (dfVar != null && (efVar = dfVar.h) != ef.j && (j80Var.g || efVar != ef.g)) {
            dfVar.l = true;
            df0 df0Var = dfVar.f;
            df0Var.getClass();
            j80Var = (i80) df0.b.getAndSet(df0Var, j80Var);
            if (j80Var != null) {
                AtomicReferenceArray atomicReferenceArray = df0Var.a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = df0.c;
                if (atomicIntegerFieldUpdater.get(df0Var) - df0.d.get(df0Var) != 127) {
                    if (j80Var.g) {
                        df0.e.incrementAndGet(df0Var);
                    }
                    int i = atomicIntegerFieldUpdater.get(df0Var) & 127;
                    while (atomicReferenceArray.get(i) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i, j80Var);
                    atomicIntegerFieldUpdater.incrementAndGet(df0Var);
                }
            }
            j80Var = null;
        }
        if (j80Var != null) {
            if (!(j80Var.g ? this.k.a(j80Var) : this.j.a(j80Var))) {
                throw new RejectedExecutionException(this.i + " was terminated");
            }
        }
        if (z2) {
            if (q() || k(addAndGet)) {
                return;
            }
            q();
            return;
        }
        if (q() || k(atomicLongFieldUpdater.get(this))) {
            return;
        }
        q();
    }

    public final void h(df dfVar, int i, int i2) {
        while (true) {
            long j = m.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = dfVar.c();
                    while (true) {
                        if (c == p) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        df dfVar2 = (df) c;
                        int b = dfVar2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = dfVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                ff ffVar = this;
                if (m.compareAndSet(ffVar, j, i3 | j2)) {
                    return;
                } else {
                    this = ffVar;
                }
            }
        }
    }

    public final boolean k(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f;
        if (i < i2) {
            int f = f();
            if (f == 1 && i2 > 1) {
                f();
            }
            if (f > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        ff ffVar;
        xj xjVar;
        int i;
        while (true) {
            long j = m.get(this);
            df dfVar = (df) this.l.b((int) (2097151 & j));
            if (dfVar == null) {
                dfVar = null;
                ffVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = dfVar.c();
                while (true) {
                    xjVar = p;
                    if (c == xjVar) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    df dfVar2 = (df) c;
                    i = dfVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c = dfVar2.c();
                    j = j;
                }
                if (i >= 0) {
                    ff ffVar2 = this;
                    boolean compareAndSet = m.compareAndSet(ffVar2, j, i | j2);
                    ffVar = ffVar2;
                    if (compareAndSet) {
                        dfVar.g(xjVar);
                    }
                    this = ffVar;
                } else {
                    continue;
                }
            }
            if (dfVar == null) {
                return false;
            }
            if (df.n.compareAndSet(dfVar, -1, 0)) {
                LockSupport.unpark(dfVar);
                return true;
            }
            this = ffVar;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        e30 e30Var = this.l;
        int a = e30Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            df dfVar = (df) e30Var.b(i6);
            if (dfVar != null) {
                df0 df0Var = dfVar.f;
                df0Var.getClass();
                int i7 = df0.b.get(df0Var) != null ? (df0.c.get(df0Var) - df0.d.get(df0Var)) + 1 : df0.c.get(df0Var) - df0.d.get(df0Var);
                int ordinal = dfVar.h.ordinal();
                if (ordinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i3++;
                } else if (ordinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        throw new lc();
                    }
                    i5++;
                }
            }
        }
        long j = n.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.i);
        sb4.append('@');
        sb4.append(xf.s(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f;
        sb4.append(i8);
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
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
