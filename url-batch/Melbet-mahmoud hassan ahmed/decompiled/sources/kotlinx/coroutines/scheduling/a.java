package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.y;
import m6.p0;
import m6.q0;
import v5.q;

/* loaded from: classes.dex */
public final class a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: f, reason: collision with root package name */
    public final int f18389f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18390g;

    /* renamed from: h, reason: collision with root package name */
    public final long f18391h;

    /* renamed from: i, reason: collision with root package name */
    public final String f18392i;

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.d f18393j;

    /* renamed from: k, reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.d f18394k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceArray<c> f18395l;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: m, reason: collision with root package name */
    public static final C0089a f18384m = new C0089a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final y f18388q = new y("NOT_IN_STACK");

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f18385n = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ AtomicLongFieldUpdater f18386o = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f18387p = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: kotlinx.coroutines.scheduling.a$a, reason: collision with other inner class name */
    public static final class C0089a {
        private C0089a() {
        }

        public /* synthetic */ C0089a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18396a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f18396a = iArr;
        }
    }

    public final class c extends Thread {

        /* renamed from: m, reason: collision with root package name */
        static final /* synthetic */ AtomicIntegerFieldUpdater f18397m = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: f, reason: collision with root package name */
        public final m f18398f;

        /* renamed from: g, reason: collision with root package name */
        public d f18399g;

        /* renamed from: h, reason: collision with root package name */
        private long f18400h;

        /* renamed from: i, reason: collision with root package name */
        private long f18401i;
        private volatile int indexInArray;

        /* renamed from: j, reason: collision with root package name */
        private int f18402j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f18403k;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.f18398f = new m();
            this.f18399g = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f18388q;
            this.f18402j = g6.c.f16682f.b();
        }

        public c(int i7) {
            this();
            n(i7);
        }

        private final void a(int i7) {
            if (i7 == 0) {
                return;
            }
            a.f18386o.addAndGet(a.this, -2097152L);
            d dVar = this.f18399g;
            if (dVar != d.TERMINATED) {
                if (p0.a()) {
                    if (!(dVar == d.BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.f18399g = d.DORMANT;
            }
        }

        private final void b(int i7) {
            if (i7 != 0 && r(d.BLOCKING)) {
                a.this.O();
            }
        }

        private final void c(i iVar) {
            int M = iVar.f18428g.M();
            h(M);
            b(M);
            a.this.C(iVar);
            a(M);
        }

        private final i d(boolean z6) {
            i l7;
            i l8;
            if (z6) {
                boolean z7 = j(a.this.f18389f * 2) == 0;
                if (z7 && (l8 = l()) != null) {
                    return l8;
                }
                i h7 = this.f18398f.h();
                if (h7 != null) {
                    return h7;
                }
                if (!z7 && (l7 = l()) != null) {
                    return l7;
                }
            } else {
                i l9 = l();
                if (l9 != null) {
                    return l9;
                }
            }
            return s(false);
        }

        private final void h(int i7) {
            this.f18400h = 0L;
            if (this.f18399g == d.PARKING) {
                if (p0.a()) {
                    if (!(i7 == 1)) {
                        throw new AssertionError();
                    }
                }
                this.f18399g = d.BLOCKING;
            }
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f18388q;
        }

        private final void k() {
            if (this.f18400h == 0) {
                this.f18400h = System.nanoTime() + a.this.f18391h;
            }
            LockSupport.parkNanos(a.this.f18391h);
            if (System.nanoTime() - this.f18400h >= 0) {
                this.f18400h = 0L;
                t();
            }
        }

        private final i l() {
            kotlinx.coroutines.scheduling.d dVar;
            if (j(2) == 0) {
                i d7 = a.this.f18393j.d();
                if (d7 != null) {
                    return d7;
                }
                dVar = a.this.f18394k;
            } else {
                i d8 = a.this.f18394k.d();
                if (d8 != null) {
                    return d8;
                }
                dVar = a.this.f18393j;
            }
            return dVar.d();
        }

        private final void m() {
            loop0: while (true) {
                boolean z6 = false;
                while (!a.this.isTerminated() && this.f18399g != d.TERMINATED) {
                    i e7 = e(this.f18403k);
                    if (e7 != null) {
                        this.f18401i = 0L;
                        c(e7);
                    } else {
                        this.f18403k = false;
                        if (this.f18401i == 0) {
                            q();
                        } else if (z6) {
                            r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f18401i);
                            this.f18401i = 0L;
                        } else {
                            z6 = true;
                        }
                    }
                }
            }
            r(d.TERMINATED);
        }

        private final boolean p() {
            boolean z6;
            if (this.f18399g != d.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j7 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j7) >> 42)) == 0) {
                        z6 = false;
                        break;
                    }
                    if (a.f18386o.compareAndSet(aVar, j7, j7 - 4398046511104L)) {
                        z6 = true;
                        break;
                    }
                }
                if (!z6) {
                    return false;
                }
                this.f18399g = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.x(this);
                return;
            }
            if (p0.a()) {
                if (!(this.f18398f.f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (i() && this.workerCtl == -1 && !a.this.isTerminated() && this.f18399g != d.TERMINATED) {
                r(d.PARKING);
                Thread.interrupted();
                k();
            }
        }

        private final i s(boolean z6) {
            if (p0.a()) {
                if (!(this.f18398f.f() == 0)) {
                    throw new AssertionError();
                }
            }
            int i7 = (int) (a.this.controlState & 2097151);
            if (i7 < 2) {
                return null;
            }
            int j7 = j(i7);
            a aVar = a.this;
            long j8 = Long.MAX_VALUE;
            for (int i8 = 0; i8 < i7; i8++) {
                j7++;
                if (j7 > i7) {
                    j7 = 1;
                }
                c cVar = aVar.f18395l.get(j7);
                if (cVar != null && cVar != this) {
                    if (p0.a()) {
                        if (!(this.f18398f.f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    m mVar = this.f18398f;
                    m mVar2 = cVar.f18398f;
                    long k7 = z6 ? mVar.k(mVar2) : mVar.l(mVar2);
                    if (k7 == -1) {
                        return this.f18398f.h();
                    }
                    if (k7 > 0) {
                        j8 = Math.min(j8, k7);
                    }
                }
            }
            if (j8 == Long.MAX_VALUE) {
                j8 = 0;
            }
            this.f18401i = j8;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.f18395l) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (aVar.controlState & 2097151)) <= aVar.f18389f) {
                    return;
                }
                if (f18397m.compareAndSet(this, -1, 1)) {
                    int f7 = f();
                    n(0);
                    aVar.y(this, f7, 0);
                    int andDecrement = (int) (2097151 & a.f18386o.getAndDecrement(aVar));
                    if (andDecrement != f7) {
                        c cVar = aVar.f18395l.get(andDecrement);
                        kotlin.jvm.internal.i.b(cVar);
                        c cVar2 = cVar;
                        aVar.f18395l.set(f7, cVar2);
                        cVar2.n(f7);
                        aVar.y(cVar2, andDecrement, f7);
                    }
                    aVar.f18395l.set(andDecrement, null);
                    q qVar = q.f22838a;
                    this.f18399g = d.TERMINATED;
                }
            }
        }

        public final i e(boolean z6) {
            i d7;
            if (p()) {
                return d(z6);
            }
            if (!z6 || (d7 = this.f18398f.h()) == null) {
                d7 = a.this.f18394k.d();
            }
            return d7 == null ? s(true) : d7;
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i7) {
            int i8 = this.f18402j;
            int i9 = i8 ^ (i8 << 13);
            int i10 = i9 ^ (i9 >> 17);
            int i11 = i10 ^ (i10 << 5);
            this.f18402j = i11;
            int i12 = i7 - 1;
            return (i12 & i7) == 0 ? i11 & i12 : (i11 & Integer.MAX_VALUE) % i7;
        }

        public final void n(int i7) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f18392i);
            sb.append("-worker-");
            sb.append(i7 == 0 ? "TERMINATED" : String.valueOf(i7));
            setName(sb.toString());
            this.indexInArray = i7;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f18399g;
            boolean z6 = dVar2 == d.CPU_ACQUIRED;
            if (z6) {
                a.f18386o.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f18399g = dVar;
            }
            return z6;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i7, int i8, long j7, String str) {
        this.f18389f = i7;
        this.f18390g = i8;
        this.f18391h = j7;
        this.f18392i = str;
        if (!(i7 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i7 + " should be at least 1").toString());
        }
        if (!(i8 >= i7)) {
            throw new IllegalArgumentException(("Max pool size " + i8 + " should be greater than or equals to core pool size " + i7).toString());
        }
        if (!(i8 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i8 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j7 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j7 + " must be positive").toString());
        }
        this.f18393j = new kotlinx.coroutines.scheduling.d();
        this.f18394k = new kotlinx.coroutines.scheduling.d();
        this.parkedWorkersStack = 0L;
        this.f18395l = new AtomicReferenceArray<>(i8 + 1);
        this.controlState = i7 << 42;
        this._isTerminated = 0;
    }

    private final void M(boolean z6) {
        long addAndGet = f18386o.addAndGet(this, 2097152L);
        if (z6 || S() || Q(addAndGet)) {
            return;
        }
        S();
    }

    private final i P(c cVar, i iVar, boolean z6) {
        if (cVar == null || cVar.f18399g == d.TERMINATED) {
            return iVar;
        }
        if (iVar.f18428g.M() == 0 && cVar.f18399g == d.BLOCKING) {
            return iVar;
        }
        cVar.f18403k = true;
        return cVar.f18398f.a(iVar, z6);
    }

    private final boolean Q(long j7) {
        int a7;
        a7 = i6.f.a(((int) (2097151 & j7)) - ((int) ((j7 & 4398044413952L) >> 21)), 0);
        if (a7 < this.f18389f) {
            int f7 = f();
            if (f7 == 1 && this.f18389f > 1) {
                f();
            }
            if (f7 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean R(a aVar, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = aVar.controlState;
        }
        return aVar.Q(j7);
    }

    private final boolean S() {
        c w6;
        do {
            w6 = w();
            if (w6 == null) {
                return false;
            }
        } while (!c.f18397m.compareAndSet(w6, -1, 0));
        LockSupport.unpark(w6);
        return true;
    }

    private final boolean b(i iVar) {
        return (iVar.f18428g.M() == 1 ? this.f18394k : this.f18393j).a(iVar);
    }

    private final int f() {
        int a7;
        int i7;
        synchronized (this.f18395l) {
            if (isTerminated()) {
                i7 = -1;
            } else {
                long j7 = this.controlState;
                int i8 = (int) (j7 & 2097151);
                a7 = i6.f.a(i8 - ((int) ((j7 & 4398044413952L) >> 21)), 0);
                if (a7 >= this.f18389f) {
                    return 0;
                }
                if (i8 >= this.f18390g) {
                    return 0;
                }
                int i9 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i9 > 0 && this.f18395l.get(i9) == null)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c cVar = new c(i9);
                this.f18395l.set(i9, cVar);
                if (!(i9 == ((int) (2097151 & f18386o.incrementAndGet(this))))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                cVar.start();
                i7 = a7 + 1;
            }
            return i7;
        }
    }

    private final c i() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar != null && kotlin.jvm.internal.i.a(a.this, this)) {
            return cVar;
        }
        return null;
    }

    public static /* synthetic */ void u(a aVar, Runnable runnable, j jVar, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            jVar = g.f18425f;
        }
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        aVar.q(runnable, jVar, z6);
    }

    private final int v(c cVar) {
        int f7;
        do {
            Object g7 = cVar.g();
            if (g7 == f18388q) {
                return -1;
            }
            if (g7 == null) {
                return 0;
            }
            cVar = (c) g7;
            f7 = cVar.f();
        } while (f7 == 0);
        return f7;
    }

    private final c w() {
        while (true) {
            long j7 = this.parkedWorkersStack;
            c cVar = this.f18395l.get((int) (2097151 & j7));
            if (cVar == null) {
                return null;
            }
            long j8 = (2097152 + j7) & (-2097152);
            int v6 = v(cVar);
            if (v6 >= 0 && f18385n.compareAndSet(this, j7, v6 | j8)) {
                cVar.o(f18388q);
                return cVar;
            }
        }
    }

    public final void C(i iVar) {
        try {
            iVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void D(long j7) {
        int i7;
        if (f18387p.compareAndSet(this, 0, 1)) {
            c i8 = i();
            synchronized (this.f18395l) {
                i7 = (int) (this.controlState & 2097151);
            }
            if (1 <= i7) {
                int i9 = 1;
                while (true) {
                    int i10 = i9 + 1;
                    c cVar = this.f18395l.get(i9);
                    kotlin.jvm.internal.i.b(cVar);
                    c cVar2 = cVar;
                    if (cVar2 != i8) {
                        while (cVar2.isAlive()) {
                            LockSupport.unpark(cVar2);
                            cVar2.join(j7);
                        }
                        d dVar = cVar2.f18399g;
                        if (p0.a()) {
                            if (!(dVar == d.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        cVar2.f18398f.g(this.f18394k);
                    }
                    if (i9 == i7) {
                        break;
                    } else {
                        i9 = i10;
                    }
                }
            }
            this.f18394k.b();
            this.f18393j.b();
            while (true) {
                i e7 = i8 == null ? null : i8.e(true);
                if (e7 == null && (e7 = this.f18393j.d()) == null && (e7 = this.f18394k.d()) == null) {
                    break;
                } else {
                    C(e7);
                }
            }
            if (i8 != null) {
                i8.r(d.TERMINATED);
            }
            if (p0.a()) {
                if (!(((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.f18389f)) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public final void O() {
        if (S() || R(this, 0L, 1, null)) {
            return;
        }
        S();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        D(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        u(this, runnable, null, false, 6, null);
    }

    public final i h(Runnable runnable, j jVar) {
        long a7 = l.f18435f.a();
        if (!(runnable instanceof i)) {
            return new k(runnable, a7, jVar);
        }
        i iVar = (i) runnable;
        iVar.f18427f = a7;
        iVar.f18428g = jVar;
        return iVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void q(Runnable runnable, j jVar, boolean z6) {
        m6.c.a();
        i h7 = h(runnable, jVar);
        c i7 = i();
        i P = P(i7, h7, z6);
        if (P != null && !b(P)) {
            throw new RejectedExecutionException(kotlin.jvm.internal.i.i(this.f18392i, " was terminated"));
        }
        boolean z7 = z6 && i7 != null;
        if (h7.f18428g.M() != 0) {
            M(z7);
        } else {
            if (z7) {
                return;
            }
            O();
        }
    }

    public String toString() {
        int i7;
        int i8;
        int i9;
        int i10;
        StringBuilder sb;
        char c7;
        ArrayList arrayList = new ArrayList();
        int length = this.f18395l.length();
        int i11 = 0;
        if (1 < length) {
            i8 = 0;
            int i12 = 0;
            i9 = 0;
            i10 = 0;
            int i13 = 1;
            while (true) {
                int i14 = i13 + 1;
                c cVar = this.f18395l.get(i13);
                if (cVar != null) {
                    int f7 = cVar.f18398f.f();
                    int i15 = b.f18396a[cVar.f18399g.ordinal()];
                    if (i15 != 1) {
                        if (i15 == 2) {
                            i8++;
                            sb = new StringBuilder();
                            sb.append(f7);
                            c7 = 'b';
                        } else if (i15 == 3) {
                            i12++;
                            sb = new StringBuilder();
                            sb.append(f7);
                            c7 = 'c';
                        } else if (i15 == 4) {
                            i9++;
                            if (f7 > 0) {
                                sb = new StringBuilder();
                                sb.append(f7);
                                c7 = 'd';
                            }
                        } else if (i15 == 5) {
                            i10++;
                        }
                        sb.append(c7);
                        arrayList.add(sb.toString());
                    } else {
                        i11++;
                    }
                }
                if (i14 >= length) {
                    break;
                }
                i13 = i14;
            }
            i7 = i11;
            i11 = i12;
        } else {
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
        }
        long j7 = this.controlState;
        return this.f18392i + '@' + q0.b(this) + "[Pool Size {core = " + this.f18389f + ", max = " + this.f18390g + "}, Worker States {CPU = " + i11 + ", blocking = " + i8 + ", parked = " + i7 + ", dormant = " + i9 + ", terminated = " + i10 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f18393j.c() + ", global blocking queue size = " + this.f18394k.c() + ", Control State {created workers= " + ((int) (2097151 & j7)) + ", blocking tasks = " + ((int) ((4398044413952L & j7) >> 21)) + ", CPUs acquired = " + (this.f18389f - ((int) ((9223367638808264704L & j7) >> 42))) + "}]";
    }

    public final boolean x(c cVar) {
        long j7;
        long j8;
        int f7;
        if (cVar.g() != f18388q) {
            return false;
        }
        do {
            j7 = this.parkedWorkersStack;
            int i7 = (int) (2097151 & j7);
            j8 = (2097152 + j7) & (-2097152);
            f7 = cVar.f();
            if (p0.a()) {
                if (!(f7 != 0)) {
                    throw new AssertionError();
                }
            }
            cVar.o(this.f18395l.get(i7));
        } while (!f18385n.compareAndSet(this, j7, f7 | j8));
        return true;
    }

    public final void y(c cVar, int i7, int i8) {
        while (true) {
            long j7 = this.parkedWorkersStack;
            int i9 = (int) (2097151 & j7);
            long j8 = (2097152 + j7) & (-2097152);
            if (i9 == i7) {
                i9 = i8 == 0 ? v(cVar) : i8;
            }
            if (i9 >= 0 && f18385n.compareAndSet(this, j7, j8 | i9)) {
                return;
            }
        }
    }
}
