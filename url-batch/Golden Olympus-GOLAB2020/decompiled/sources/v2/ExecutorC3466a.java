package v2;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3321c;
import o2.N;
import org.jetbrains.annotations.Nullable;
import t2.C3427B;
import t2.G;

/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC3466a implements Executor, Closeable, AutoCloseable {

    /* renamed from: i, reason: collision with root package name */
    public static final C0284a f46433i = new C0284a(null);

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f46434j = AtomicLongFieldUpdater.newUpdater(ExecutorC3466a.class, "parkedWorkersStack$volatile");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f46435k = AtomicLongFieldUpdater.newUpdater(ExecutorC3466a.class, "controlState$volatile");

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f46436l = AtomicIntegerFieldUpdater.newUpdater(ExecutorC3466a.class, "_isTerminated$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final G f46437m = new G("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: b, reason: collision with root package name */
    public final int f46438b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46439c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final long f46440d;

    /* renamed from: e, reason: collision with root package name */
    public final String f46441e;

    /* renamed from: f, reason: collision with root package name */
    public final C3469d f46442f;

    /* renamed from: g, reason: collision with root package name */
    public final C3469d f46443g;

    /* renamed from: h, reason: collision with root package name */
    public final C3427B f46444h;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: v2.a$a, reason: collision with other inner class name */
    public static final class C0284a {
        public /* synthetic */ C0284a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0284a() {
        }
    }

    /* renamed from: v2.a$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46445a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f46457d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f46456c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f46455b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f46458e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f46459f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f46445a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: v2.a$d */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f46455b = new d("CPU_ACQUIRED", 0);

        /* renamed from: c, reason: collision with root package name */
        public static final d f46456c = new d("BLOCKING", 1);

        /* renamed from: d, reason: collision with root package name */
        public static final d f46457d = new d("PARKING", 2);

        /* renamed from: e, reason: collision with root package name */
        public static final d f46458e = new d("DORMANT", 3);

        /* renamed from: f, reason: collision with root package name */
        public static final d f46459f = new d("TERMINATED", 4);

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ d[] f46460g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC1371a f46461h;

        static {
            d[] c4 = c();
            f46460g = c4;
            f46461h = AbstractC1372b.a(c4);
        }

        private d(String str, int i4) {
        }

        private static final /* synthetic */ d[] c() {
            return new d[]{f46455b, f46456c, f46457d, f46458e, f46459f};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f46460g.clone();
        }
    }

    public ExecutorC3466a(int i4, int i5, long j4, String str) {
        this.f46438b = i4;
        this.f46439c = i5;
        this.f46440d = j4;
        this.f46441e = str;
        if (i4 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i4 + " should be at least 1").toString());
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should be greater than or equals to core pool size " + i4).toString());
        }
        if (i5 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j4 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
        this.f46442f = new C3469d();
        this.f46443g = new C3469d();
        this.f46444h = new C3427B((i4 + 1) * 2);
        this.controlState$volatile = i4 << 42;
        this._isTerminated$volatile = 0;
    }

    private final int J() {
        synchronized (this.f46444h) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j4 = f46435k.get(this);
                int i4 = (int) (j4 & 2097151);
                int d4 = kotlin.ranges.g.d(i4 - ((int) ((j4 & 4398044413952L) >> 21)), 0);
                if (d4 >= this.f46438b) {
                    return 0;
                }
                if (i4 >= this.f46439c) {
                    return 0;
                }
                int i5 = ((int) (W().get(this) & 2097151)) + 1;
                if (i5 <= 0 || this.f46444h.b(i5) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i5);
                this.f46444h.c(i5, cVar);
                if (i5 != ((int) (2097151 & f46435k.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i6 = d4 + 1;
                cVar.start();
                return i6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final c Q() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !Intrinsics.areEqual(ExecutorC3466a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void V(ExecutorC3466a executorC3466a, Runnable runnable, InterfaceC3474i interfaceC3474i, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            interfaceC3474i = AbstractC3477l.f46481g;
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        executorC3466a.U(runnable, interfaceC3474i, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater W() {
        return f46435k;
    }

    private final int Z(c cVar) {
        Object i4 = cVar.i();
        while (i4 != f46437m) {
            if (i4 == null) {
                return 0;
            }
            c cVar2 = (c) i4;
            int h4 = cVar2.h();
            if (h4 != 0) {
                return h4;
            }
            i4 = cVar2.i();
        }
        return -1;
    }

    private final c a0() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f46434j;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f46444h.b((int) (2097151 & j4));
            if (cVar == null) {
                return null;
            }
            long j5 = (2097152 + j4) & (-2097152);
            int Z3 = Z(cVar);
            if (Z3 >= 0 && f46434j.compareAndSet(this, j4, Z3 | j5)) {
                cVar.r(f46437m);
                return cVar;
            }
        }
    }

    private final void f0(long j4, boolean z4) {
        if (z4 || k0() || i0(j4)) {
            return;
        }
        k0();
    }

    private final AbstractRunnableC3473h h0(c cVar, AbstractRunnableC3473h abstractRunnableC3473h, boolean z4) {
        if (cVar == null || cVar.f46449d == d.f46459f) {
            return abstractRunnableC3473h;
        }
        if (abstractRunnableC3473h.f46472c.b() == 0 && cVar.f46449d == d.f46456c) {
            return abstractRunnableC3473h;
        }
        cVar.f46453h = true;
        return cVar.f46447b.a(abstractRunnableC3473h, z4);
    }

    private final boolean i0(long j4) {
        if (kotlin.ranges.g.d(((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21)), 0) < this.f46438b) {
            int J3 = J();
            if (J3 == 1 && this.f46438b > 1) {
                J();
            }
            if (J3 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean j0(ExecutorC3466a executorC3466a, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = f46435k.get(executorC3466a);
        }
        return executorC3466a.i0(j4);
    }

    private final boolean k0() {
        c a02;
        do {
            a02 = a0();
            if (a02 == null) {
                return false;
            }
        } while (!c.f46446j.compareAndSet(a02, -1, 0));
        LockSupport.unpark(a02);
        return true;
    }

    private final boolean p(AbstractRunnableC3473h abstractRunnableC3473h) {
        return abstractRunnableC3473h.f46472c.b() == 1 ? this.f46443g.a(abstractRunnableC3473h) : this.f46442f.a(abstractRunnableC3473h);
    }

    public final AbstractRunnableC3473h N(Runnable runnable, InterfaceC3474i interfaceC3474i) {
        long a4 = AbstractC3477l.f46480f.a();
        if (!(runnable instanceof AbstractRunnableC3473h)) {
            return new C3476k(runnable, a4, interfaceC3474i);
        }
        AbstractRunnableC3473h abstractRunnableC3473h = (AbstractRunnableC3473h) runnable;
        abstractRunnableC3473h.f46471b = a4;
        abstractRunnableC3473h.f46472c = interfaceC3474i;
        return abstractRunnableC3473h;
    }

    public final void U(Runnable runnable, InterfaceC3474i interfaceC3474i, boolean z4) {
        AbstractC3321c.a();
        AbstractRunnableC3473h N3 = N(runnable, interfaceC3474i);
        boolean z5 = false;
        boolean z6 = N3.f46472c.b() == 1;
        long addAndGet = z6 ? f46435k.addAndGet(this, 2097152L) : 0L;
        c Q3 = Q();
        AbstractRunnableC3473h h02 = h0(Q3, N3, z4);
        if (h02 != null && !p(h02)) {
            throw new RejectedExecutionException(this.f46441e + " was terminated");
        }
        if (z4 && Q3 != null) {
            z5 = true;
        }
        if (z6) {
            f0(addAndGet, z5);
        } else {
            if (z5) {
                return;
            }
            g0();
        }
    }

    public final boolean b0(c cVar) {
        long j4;
        int h4;
        if (cVar.i() != f46437m) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f46434j;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            h4 = cVar.h();
            cVar.r(this.f46444h.b((int) (2097151 & j4)));
        } while (!f46434j.compareAndSet(this, j4, ((2097152 + j4) & (-2097152)) | h4));
        return true;
    }

    public final void c0(c cVar, int i4, int i5) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f46434j;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            int i6 = (int) (2097151 & j4);
            long j5 = (2097152 + j4) & (-2097152);
            if (i6 == i4) {
                i6 = i5 == 0 ? Z(cVar) : i5;
            }
            if (i6 >= 0) {
                if (f46434j.compareAndSet(this, j4, j5 | i6)) {
                    return;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e0(10000L);
    }

    public final void d0(AbstractRunnableC3473h abstractRunnableC3473h) {
        try {
            abstractRunnableC3473h.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            } finally {
                AbstractC3321c.a();
            }
        }
    }

    public final void e0(long j4) {
        int i4;
        AbstractRunnableC3473h abstractRunnableC3473h;
        if (f46436l.compareAndSet(this, 0, 1)) {
            c Q3 = Q();
            synchronized (this.f46444h) {
                i4 = (int) (W().get(this) & 2097151);
            }
            if (1 <= i4) {
                int i5 = 1;
                while (true) {
                    Object b4 = this.f46444h.b(i5);
                    Intrinsics.checkNotNull(b4);
                    c cVar = (c) b4;
                    if (cVar != Q3) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j4);
                        }
                        cVar.f46447b.j(this.f46443g);
                    }
                    if (i5 == i4) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f46443g.b();
            this.f46442f.b();
            while (true) {
                if (Q3 != null) {
                    abstractRunnableC3473h = Q3.g(true);
                    if (abstractRunnableC3473h != null) {
                        continue;
                        d0(abstractRunnableC3473h);
                    }
                }
                abstractRunnableC3473h = (AbstractRunnableC3473h) this.f46442f.e();
                if (abstractRunnableC3473h == null && (abstractRunnableC3473h = (AbstractRunnableC3473h) this.f46443g.e()) == null) {
                    break;
                }
                d0(abstractRunnableC3473h);
            }
            if (Q3 != null) {
                Q3.u(d.f46459f);
            }
            f46434j.set(this, 0L);
            f46435k.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        V(this, runnable, null, false, 6, null);
    }

    public final void g0() {
        if (k0() || j0(this, 0L, 1, null)) {
            return;
        }
        k0();
    }

    public final boolean isTerminated() {
        return f46436l.get(this) != 0;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a4 = this.f46444h.a();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < a4; i9++) {
            c cVar = (c) this.f46444h.b(i9);
            if (cVar != null) {
                int i10 = cVar.f46447b.i();
                int i11 = b.f46445a[cVar.f46449d.ordinal()];
                if (i11 == 1) {
                    i6++;
                } else if (i11 == 2) {
                    i5++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i10);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i11 == 3) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i11 == 4) {
                    i7++;
                    if (i10 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i10);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i11 == 5) {
                    i8++;
                }
            }
        }
        long j4 = f46435k.get(this);
        return this.f46441e + '@' + N.b(this) + "[Pool Size {core = " + this.f46438b + ", max = " + this.f46439c + "}, Worker States {CPU = " + i4 + ", blocking = " + i5 + ", parked = " + i6 + ", dormant = " + i7 + ", terminated = " + i8 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f46442f.c() + ", global blocking queue size = " + this.f46443g.c() + ", Control State {created workers= " + ((int) (2097151 & j4)) + ", blocking tasks = " + ((int) ((4398044413952L & j4) >> 21)) + ", CPUs acquired = " + (this.f46438b - ((int) ((9223367638808264704L & j4) >> 42))) + "}]";
    }

    /* renamed from: v2.a$c */
    public final class c extends Thread {

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f46446j = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* renamed from: b, reason: collision with root package name */
        public final C3479n f46447b;

        /* renamed from: c, reason: collision with root package name */
        private final kotlin.jvm.internal.G f46448c;

        /* renamed from: d, reason: collision with root package name */
        public d f46449d;

        /* renamed from: e, reason: collision with root package name */
        private long f46450e;

        /* renamed from: f, reason: collision with root package name */
        private long f46451f;

        /* renamed from: g, reason: collision with root package name */
        private int f46452g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f46453h;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(ExecutorC3466a.this.getClass().getClassLoader());
            this.f46447b = new C3479n();
            this.f46448c = new kotlin.jvm.internal.G();
            this.f46449d = d.f46458e;
            this.nextParkedWorker = ExecutorC3466a.f46437m;
            int nanoTime = (int) System.nanoTime();
            this.f46452g = nanoTime == 0 ? 42 : nanoTime;
        }

        private final void b(int i4) {
            if (i4 == 0) {
                return;
            }
            ExecutorC3466a.W().addAndGet(ExecutorC3466a.this, -2097152L);
            if (this.f46449d != d.f46459f) {
                this.f46449d = d.f46458e;
            }
        }

        private final void c(int i4) {
            if (i4 != 0 && u(d.f46456c)) {
                ExecutorC3466a.this.g0();
            }
        }

        private final void d(AbstractRunnableC3473h abstractRunnableC3473h) {
            int b4 = abstractRunnableC3473h.f46472c.b();
            k(b4);
            c(b4);
            ExecutorC3466a.this.d0(abstractRunnableC3473h);
            b(b4);
        }

        private final AbstractRunnableC3473h e(boolean z4) {
            AbstractRunnableC3473h o4;
            AbstractRunnableC3473h o5;
            if (z4) {
                boolean z5 = m(ExecutorC3466a.this.f46438b * 2) == 0;
                if (z5 && (o5 = o()) != null) {
                    return o5;
                }
                AbstractRunnableC3473h k4 = this.f46447b.k();
                if (k4 != null) {
                    return k4;
                }
                if (!z5 && (o4 = o()) != null) {
                    return o4;
                }
            } else {
                AbstractRunnableC3473h o6 = o();
                if (o6 != null) {
                    return o6;
                }
            }
            return v(3);
        }

        private final AbstractRunnableC3473h f() {
            AbstractRunnableC3473h l4 = this.f46447b.l();
            if (l4 != null) {
                return l4;
            }
            AbstractRunnableC3473h abstractRunnableC3473h = (AbstractRunnableC3473h) ExecutorC3466a.this.f46443g.e();
            return abstractRunnableC3473h == null ? v(1) : abstractRunnableC3473h;
        }

        private final void k(int i4) {
            this.f46450e = 0L;
            if (this.f46449d == d.f46457d) {
                this.f46449d = d.f46456c;
            }
        }

        private final boolean l() {
            return this.nextParkedWorker != ExecutorC3466a.f46437m;
        }

        private final void n() {
            if (this.f46450e == 0) {
                this.f46450e = System.nanoTime() + ExecutorC3466a.this.f46440d;
            }
            LockSupport.parkNanos(ExecutorC3466a.this.f46440d);
            if (System.nanoTime() - this.f46450e >= 0) {
                this.f46450e = 0L;
                w();
            }
        }

        private final AbstractRunnableC3473h o() {
            if (m(2) == 0) {
                AbstractRunnableC3473h abstractRunnableC3473h = (AbstractRunnableC3473h) ExecutorC3466a.this.f46442f.e();
                return abstractRunnableC3473h != null ? abstractRunnableC3473h : (AbstractRunnableC3473h) ExecutorC3466a.this.f46443g.e();
            }
            AbstractRunnableC3473h abstractRunnableC3473h2 = (AbstractRunnableC3473h) ExecutorC3466a.this.f46443g.e();
            return abstractRunnableC3473h2 != null ? abstractRunnableC3473h2 : (AbstractRunnableC3473h) ExecutorC3466a.this.f46442f.e();
        }

        private final void p() {
            loop0: while (true) {
                boolean z4 = false;
                while (!ExecutorC3466a.this.isTerminated() && this.f46449d != d.f46459f) {
                    AbstractRunnableC3473h g4 = g(this.f46453h);
                    if (g4 != null) {
                        this.f46451f = 0L;
                        d(g4);
                    } else {
                        this.f46453h = false;
                        if (this.f46451f == 0) {
                            t();
                        } else if (z4) {
                            u(d.f46457d);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f46451f);
                            this.f46451f = 0L;
                        } else {
                            z4 = true;
                        }
                    }
                }
            }
            u(d.f46459f);
        }

        private final boolean s() {
            long j4;
            if (this.f46449d == d.f46455b) {
                return true;
            }
            ExecutorC3466a executorC3466a = ExecutorC3466a.this;
            AtomicLongFieldUpdater W3 = ExecutorC3466a.W();
            do {
                j4 = W3.get(executorC3466a);
                if (((int) ((9223367638808264704L & j4) >> 42)) == 0) {
                    return false;
                }
            } while (!ExecutorC3466a.W().compareAndSet(executorC3466a, j4, j4 - 4398046511104L));
            this.f46449d = d.f46455b;
            return true;
        }

        private final void t() {
            if (!l()) {
                ExecutorC3466a.this.b0(this);
                return;
            }
            f46446j.set(this, -1);
            while (l() && f46446j.get(this) == -1 && !ExecutorC3466a.this.isTerminated() && this.f46449d != d.f46459f) {
                u(d.f46457d);
                Thread.interrupted();
                n();
            }
        }

        private final AbstractRunnableC3473h v(int i4) {
            int i5 = (int) (ExecutorC3466a.W().get(ExecutorC3466a.this) & 2097151);
            if (i5 < 2) {
                return null;
            }
            int m4 = m(i5);
            ExecutorC3466a executorC3466a = ExecutorC3466a.this;
            long j4 = Long.MAX_VALUE;
            for (int i6 = 0; i6 < i5; i6++) {
                m4++;
                if (m4 > i5) {
                    m4 = 1;
                }
                c cVar = (c) executorC3466a.f46444h.b(m4);
                if (cVar != null && cVar != this) {
                    long r4 = cVar.f46447b.r(i4, this.f46448c);
                    if (r4 == -1) {
                        kotlin.jvm.internal.G g4 = this.f46448c;
                        AbstractRunnableC3473h abstractRunnableC3473h = (AbstractRunnableC3473h) g4.f41132b;
                        g4.f41132b = null;
                        return abstractRunnableC3473h;
                    }
                    if (r4 > 0) {
                        j4 = Math.min(j4, r4);
                    }
                }
            }
            if (j4 == Long.MAX_VALUE) {
                j4 = 0;
            }
            this.f46451f = j4;
            return null;
        }

        private final void w() {
            ExecutorC3466a executorC3466a = ExecutorC3466a.this;
            synchronized (executorC3466a.f46444h) {
                try {
                    if (executorC3466a.isTerminated()) {
                        return;
                    }
                    if (((int) (ExecutorC3466a.W().get(executorC3466a) & 2097151)) <= executorC3466a.f46438b) {
                        return;
                    }
                    if (f46446j.compareAndSet(this, -1, 1)) {
                        int i4 = this.indexInArray;
                        q(0);
                        executorC3466a.c0(this, i4, 0);
                        int andDecrement = (int) (ExecutorC3466a.W().getAndDecrement(executorC3466a) & 2097151);
                        if (andDecrement != i4) {
                            Object b4 = executorC3466a.f46444h.b(andDecrement);
                            Intrinsics.checkNotNull(b4);
                            c cVar = (c) b4;
                            executorC3466a.f46444h.c(i4, cVar);
                            cVar.q(i4);
                            executorC3466a.c0(cVar, andDecrement, i4);
                        }
                        executorC3466a.f46444h.c(andDecrement, null);
                        Unit unit = Unit.f41027a;
                        this.f46449d = d.f46459f;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final AbstractRunnableC3473h g(boolean z4) {
            return s() ? e(z4) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i4) {
            int i5 = this.f46452g;
            int i6 = i5 ^ (i5 << 13);
            int i7 = i6 ^ (i6 >> 17);
            int i8 = i7 ^ (i7 << 5);
            this.f46452g = i8;
            int i9 = i4 - 1;
            return (i9 & i4) == 0 ? i8 & i9 : (i8 & Integer.MAX_VALUE) % i4;
        }

        public final void q(int i4) {
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC3466a.this.f46441e);
            sb.append("-worker-");
            sb.append(i4 == 0 ? "TERMINATED" : String.valueOf(i4));
            setName(sb.toString());
            this.indexInArray = i4;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f46449d;
            boolean z4 = dVar2 == d.f46455b;
            if (z4) {
                ExecutorC3466a.W().addAndGet(ExecutorC3466a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f46449d = dVar;
            }
            return z4;
        }

        public c(ExecutorC3466a executorC3466a, int i4) {
            this();
            q(i4);
        }
    }
}
