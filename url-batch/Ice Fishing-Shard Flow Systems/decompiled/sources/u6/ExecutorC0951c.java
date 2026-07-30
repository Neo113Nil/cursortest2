package u6;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import l0.C0654a;
import n6.AbstractC0792z;
import s6.p;

/* renamed from: u6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0951c implements Executor, Closeable {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8095p = AtomicLongFieldUpdater.newUpdater(ExecutorC0951c.class, "parkedWorkersStack$volatile");

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8096q = AtomicLongFieldUpdater.newUpdater(ExecutorC0951c.class, "controlState$volatile");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8097r = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0951c.class, "_isTerminated$volatile");

    /* renamed from: s, reason: collision with root package name */
    public static final C0654a f8098s = new C0654a("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final int f8099d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8100e;

    /* renamed from: i, reason: collision with root package name */
    public final long f8101i;

    /* renamed from: l, reason: collision with root package name */
    public final String f8102l;

    /* renamed from: m, reason: collision with root package name */
    public final C0954f f8103m;

    /* renamed from: n, reason: collision with root package name */
    public final C0954f f8104n;

    /* renamed from: o, reason: collision with root package name */
    public final p f8105o;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public ExecutorC0951c(String str, int i2, int i5, long j) {
        this.f8099d = i2;
        this.f8100e = i5;
        this.f8101i = j;
        this.f8102l = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(C4.p.h(i2, "Core pool size ", " should be at least 1").toString());
        }
        if (i5 < i2) {
            throw new IllegalArgumentException(C4.p.j("Max pool size ", " should be greater than or equals to core pool size ", i5, i2).toString());
        }
        if (i5 > 2097150) {
            throw new IllegalArgumentException(C4.p.h(i5, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f8103m = new C0954f();
        this.f8104n = new C0954f();
        this.f8105o = new p((i2 + 1) * 2);
        this.controlState$volatile = i2 << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void g(ExecutorC0951c executorC0951c, Runnable runnable, int i2) {
        executorC0951c.d(runnable, false, (i2 & 4) == 0);
    }

    public final int a() {
        synchronized (this.f8105o) {
            try {
                if (f8097r.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f8096q;
                long j = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j & 2097151);
                int i5 = i2 - ((int) ((j & 4398044413952L) >> 21));
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i5 >= this.f8099d) {
                    return 0;
                }
                if (i2 >= this.f8100e) {
                    return 0;
                }
                int i7 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i7 <= 0 || this.f8105o.b(i7) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C0949a c0949a = new C0949a(this, i7);
                this.f8105o.c(i7, c0949a);
                if (i7 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i8 = i5 + 1;
                c0949a.start();
                return i8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i2;
        i iVar;
        if (f8097r.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            C0949a c0949a = currentThread instanceof C0949a ? (C0949a) currentThread : null;
            if (c0949a == null || !Intrinsics.a(c0949a.f8088p, this)) {
                c0949a = null;
            }
            synchronized (this.f8105o) {
                i2 = (int) (f8096q.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i5 = 1;
                while (true) {
                    Object b7 = this.f8105o.b(i5);
                    Intrinsics.b(b7);
                    C0949a c0949a2 = (C0949a) b7;
                    if (c0949a2 != c0949a) {
                        while (c0949a2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c0949a2);
                            c0949a2.join(10000L);
                        }
                        m mVar = c0949a2.f8081d;
                        C0954f c0954f = this.f8104n;
                        mVar.getClass();
                        i iVar2 = (i) m.f8121b.getAndSet(mVar, null);
                        if (iVar2 != null) {
                            c0954f.a(iVar2);
                        }
                        while (true) {
                            i b8 = mVar.b();
                            if (b8 == null) {
                                break;
                            } else {
                                c0954f.a(b8);
                            }
                        }
                    }
                    if (i5 == i2) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f8104n.b();
            this.f8103m.b();
            while (true) {
                if (c0949a != null) {
                    iVar = c0949a.a(true);
                }
                iVar = (i) this.f8103m.d();
                if (iVar == null && (iVar = (i) this.f8104n.d()) == null) {
                    break;
                }
                try {
                    iVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (c0949a != null) {
                c0949a.h(EnumC0950b.f8093m);
            }
            f8095p.set(this, 0L);
            f8096q.set(this, 0L);
        }
    }

    public final void d(Runnable runnable, boolean z7, boolean z8) {
        i jVar;
        EnumC0950b enumC0950b;
        k.f8119f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f8111d = nanoTime;
            jVar.f8112e = z7;
        } else {
            jVar = new j(runnable, nanoTime, z7);
        }
        boolean z9 = jVar.f8112e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8096q;
        long addAndGet = z9 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        C0949a c0949a = currentThread instanceof C0949a ? (C0949a) currentThread : null;
        if (c0949a == null || !Intrinsics.a(c0949a.f8088p, this)) {
            c0949a = null;
        }
        if (c0949a != null && (enumC0950b = c0949a.f8083i) != EnumC0950b.f8093m && (jVar.f8112e || enumC0950b != EnumC0950b.f8090e)) {
            c0949a.f8087o = true;
            m mVar = c0949a.f8081d;
            if (z8) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f8121b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f8112e ? this.f8104n.a(jVar) : this.f8103m.a(jVar))) {
                throw new RejectedExecutionException(r4.f.f(new StringBuilder(), this.f8102l, " was terminated"));
            }
        }
        boolean z10 = z8 && c0949a != null;
        if (z9) {
            if (z10 || s() || j(addAndGet)) {
                return;
            }
            s();
            return;
        }
        if (z10 || s() || j(atomicLongFieldUpdater.get(this))) {
            return;
        }
        s();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(this, runnable, 6);
    }

    public final void h(C0949a c0949a, int i2, int i5) {
        while (true) {
            long j = f8095p.get(this);
            int i7 = (int) (2097151 & j);
            long j7 = (2097152 + j) & (-2097152);
            if (i7 == i2) {
                if (i5 == 0) {
                    Object c7 = c0949a.c();
                    while (true) {
                        if (c7 == f8098s) {
                            i7 = -1;
                            break;
                        }
                        if (c7 == null) {
                            i7 = 0;
                            break;
                        }
                        C0949a c0949a2 = (C0949a) c7;
                        int b7 = c0949a2.b();
                        if (b7 != 0) {
                            i7 = b7;
                            break;
                        }
                        c7 = c0949a2.c();
                    }
                } else {
                    i7 = i5;
                }
            }
            if (i7 >= 0) {
                if (f8095p.compareAndSet(this, j, i7 | j7)) {
                    return;
                }
            }
        }
    }

    public final boolean j(long j) {
        int i2 = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i5 = this.f8099d;
        if (i2 < i5) {
            int a7 = a();
            if (a7 == 1 && i5 > 1) {
                a();
            }
            if (a7 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        C0654a c0654a;
        int i2;
        while (true) {
            long j = f8095p.get(this);
            C0949a c0949a = (C0949a) this.f8105o.b((int) (2097151 & j));
            if (c0949a == null) {
                c0949a = null;
            } else {
                long j7 = (2097152 + j) & (-2097152);
                Object c7 = c0949a.c();
                while (true) {
                    c0654a = f8098s;
                    if (c7 == c0654a) {
                        i2 = -1;
                        break;
                    }
                    if (c7 == null) {
                        i2 = 0;
                        break;
                    }
                    C0949a c0949a2 = (C0949a) c7;
                    i2 = c0949a2.b();
                    if (i2 != 0) {
                        break;
                    }
                    c7 = c0949a2.c();
                }
                if (i2 >= 0) {
                    if (f8095p.compareAndSet(this, j, i2 | j7)) {
                        c0949a.g(c0654a);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c0949a == null) {
                return false;
            }
            if (C0949a.f8080q.compareAndSet(c0949a, -1, 0)) {
                LockSupport.unpark(c0949a);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f8105o;
        int a7 = pVar.a();
        int i2 = 0;
        int i5 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 1; i10 < a7; i10++) {
            C0949a c0949a = (C0949a) pVar.b(i10);
            if (c0949a != null) {
                m mVar = c0949a.f8081d;
                mVar.getClass();
                int i11 = m.f8121b.get(mVar) != null ? (m.f8122c.get(mVar) - m.f8123d.get(mVar)) + 1 : m.f8122c.get(mVar) - m.f8123d.get(mVar);
                int ordinal = c0949a.f8083i.ordinal();
                if (ordinal == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i11);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i5++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i7++;
                } else if (ordinal == 3) {
                    i8++;
                    if (i11 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i11);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        throw new R5.k();
                    }
                    i9++;
                }
            }
        }
        long j = f8096q.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f8102l);
        sb4.append('@');
        sb4.append(AbstractC0792z.g(this));
        sb4.append("[Pool Size {core = ");
        int i12 = this.f8099d;
        sb4.append(i12);
        sb4.append(", max = ");
        sb4.append(this.f8100e);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i5);
        sb4.append(", parked = ");
        sb4.append(i7);
        sb4.append(", dormant = ");
        sb4.append(i8);
        sb4.append(", terminated = ");
        sb4.append(i9);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f8103m.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f8104n.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i12 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
