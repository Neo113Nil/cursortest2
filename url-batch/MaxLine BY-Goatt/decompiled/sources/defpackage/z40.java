package defpackage;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z40 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater t = AtomicLongFieldUpdater.newUpdater(z40.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater u = AtomicLongFieldUpdater.newUpdater(z40.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(z40.class, "_isTerminated$volatile");
    public static final ng0 w = new ng0("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int m;
    public final int n;
    public final long o;
    public final String p;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final jv0 q;
    public final jv0 r;
    public final h92 s;

    public z40(String str, int i, int i2, long j) {
        this.m = i;
        this.n = i2;
        this.o = j;
        this.p = str;
        if (i < 1) {
            lh.c(in1.l(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            lh.c(q40.j("Max pool size ", i2, i, " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            lh.c(in1.l(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            ch2.i("Idle worker keep alive time ", j, " must be positive");
            throw null;
        }
        this.q = new jv0();
        this.r = new jv0();
        this.s = new h92((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void m(z40 z40Var, Runnable runnable, int i) {
        z40Var.f(runnable, false, (i & 4) == 0);
    }

    public final int b() {
        synchronized (this.s) {
            try {
                if (v.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = u;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.m) {
                    return 0;
                }
                if (i >= this.n) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.s.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                x40 x40Var = new x40(this, i3);
                this.s.c(i3, x40Var);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                x40Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
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
        ht2 ht2Var;
        if (v.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            x40 x40Var = null;
            x40 x40Var2 = currentThread instanceof x40 ? (x40) currentThread : null;
            if (x40Var2 != null && x40Var2.t == this) {
                x40Var = x40Var2;
            }
            synchronized (this.s) {
                i = (int) (u.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object b = this.s.b(i2);
                    b.getClass();
                    x40 x40Var3 = (x40) b;
                    if (x40Var3 != x40Var) {
                        while (x40Var3.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(x40Var3);
                            x40Var3.join(10000L);
                        }
                        x40Var3.m.d(this.r);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.r.b();
            this.q.b();
            while (true) {
                if (x40Var != null) {
                    ht2Var = x40Var.a(true);
                }
                ht2Var = (ht2) this.q.d();
                if (ht2Var == null && (ht2Var = (ht2) this.r.d()) == null) {
                    break;
                }
                try {
                    ht2Var.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (x40Var != null) {
                x40Var.h(y40.q);
            }
            t.set(this, 0L);
            u.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m(this, runnable, 6);
    }

    public final void f(Runnable runnable, boolean z, boolean z2) {
        ht2 mt2Var;
        y40 y40Var;
        rt2.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof ht2) {
            mt2Var = (ht2) runnable;
            mt2Var.m = nanoTime;
            mt2Var.n = z;
        } else {
            mt2Var = new mt2(runnable, nanoTime, z);
        }
        boolean z3 = mt2Var.n;
        AtomicLongFieldUpdater atomicLongFieldUpdater = u;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        x40 x40Var = null;
        x40 x40Var2 = currentThread instanceof x40 ? (x40) currentThread : null;
        if (x40Var2 != null && x40Var2.t == this) {
            x40Var = x40Var2;
        }
        if (x40Var != null && (y40Var = x40Var.o) != y40.q && (mt2Var.n || y40Var != y40.n)) {
            x40Var.s = true;
            mt2Var = x40Var.m.a(mt2Var, z2);
        }
        if (mt2Var != null) {
            if (!(mt2Var.n ? this.r.a(mt2Var) : this.q.a(mt2Var))) {
                throw new RejectedExecutionException(q40.p(new StringBuilder(), this.p, " was terminated"));
            }
        }
        boolean z4 = z2 && x40Var != null;
        if (z3) {
            if (z4 || p() || o(addAndGet)) {
                return;
            }
            p();
            return;
        }
        if (z4 || p() || o(atomicLongFieldUpdater.get(this))) {
            return;
        }
        p();
    }

    public final void n(x40 x40Var, int i, int i2) {
        while (true) {
            long j = t.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = x40Var.c();
                    while (true) {
                        if (c == w) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        x40 x40Var2 = (x40) c;
                        int b = x40Var2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = x40Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                z40 z40Var = this;
                if (t.compareAndSet(z40Var, j, i3 | j2)) {
                    return;
                } else {
                    this = z40Var;
                }
            }
        }
    }

    public final boolean o(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.m;
        if (i < i2) {
            int b = b();
            if (b == 1 && i2 > 1) {
                b();
            }
            if (b > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        z40 z40Var;
        ng0 ng0Var;
        int i;
        while (true) {
            long j = t.get(this);
            x40 x40Var = (x40) this.s.b((int) (2097151 & j));
            if (x40Var == null) {
                x40Var = null;
                z40Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = x40Var.c();
                while (true) {
                    ng0Var = w;
                    if (c == ng0Var) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    x40 x40Var2 = (x40) c;
                    i = x40Var2.b();
                    if (i != 0) {
                        break;
                    }
                    c = x40Var2.c();
                    j = j;
                }
                if (i >= 0) {
                    z40 z40Var2 = this;
                    boolean compareAndSet = t.compareAndSet(z40Var2, j, i | j2);
                    z40Var = z40Var2;
                    if (compareAndSet) {
                        x40Var.g(ng0Var);
                    }
                    this = z40Var;
                } else {
                    continue;
                }
            }
            if (x40Var == null) {
                return false;
            }
            if (x40.u.compareAndSet(x40Var, -1, 0)) {
                LockSupport.unpark(x40Var);
                return true;
            }
            this = z40Var;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        h92 h92Var = this.s;
        int a = h92Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            x40 x40Var = (x40) h92Var.b(i6);
            if (x40Var != null) {
                int c = x40Var.m.c();
                int ordinal = x40Var.o.ordinal();
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
                        a.b();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = u.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.p);
        sb4.append('@');
        sb4.append(o70.x(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.m;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.n);
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
        sb4.append(this.q.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.r.c());
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
