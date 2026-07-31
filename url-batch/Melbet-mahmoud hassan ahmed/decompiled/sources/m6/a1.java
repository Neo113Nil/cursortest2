package m6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class a1 extends b1 {

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f19267j = AtomicReferenceFieldUpdater.newUpdater(a1.class, Object.class, "_queue");

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f19268k = AtomicReferenceFieldUpdater.newUpdater(a1.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    public static abstract class a implements Runnable, Comparable<a>, x0, kotlinx.coroutines.internal.e0 {

        /* renamed from: f, reason: collision with root package name */
        public long f19269f;

        /* renamed from: g, reason: collision with root package name */
        private Object f19270g;

        /* renamed from: h, reason: collision with root package name */
        private int f19271h;

        @Override // kotlinx.coroutines.internal.e0
        public void b(int i7) {
            this.f19271h = i7;
        }

        @Override // m6.x0
        public final synchronized void d() {
            kotlinx.coroutines.internal.y yVar;
            kotlinx.coroutines.internal.y yVar2;
            Object obj = this.f19270g;
            yVar = d1.f19276a;
            if (obj == yVar) {
                return;
            }
            b bVar = obj instanceof b ? (b) obj : null;
            if (bVar != null) {
                bVar.g(this);
            }
            yVar2 = d1.f19276a;
            this.f19270g = yVar2;
        }

        @Override // kotlinx.coroutines.internal.e0
        public void e(kotlinx.coroutines.internal.d0<?> d0Var) {
            kotlinx.coroutines.internal.y yVar;
            Object obj = this.f19270g;
            yVar = d1.f19276a;
            if (!(obj != yVar)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f19270g = d0Var;
        }

        @Override // kotlinx.coroutines.internal.e0
        public int f() {
            return this.f19271h;
        }

        @Override // kotlinx.coroutines.internal.e0
        public kotlinx.coroutines.internal.d0<?> h() {
            Object obj = this.f19270g;
            if (obj instanceof kotlinx.coroutines.internal.d0) {
                return (kotlinx.coroutines.internal.d0) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            long j7 = this.f19269f - aVar.f19269f;
            if (j7 > 0) {
                return 1;
            }
            return j7 < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[Catch: all -> 0x0048, TryCatch #0 {, blocks: (B:11:0x000d, B:19:0x0021, B:20:0x0037, B:22:0x0040, B:23:0x0042, B:27:0x0024, B:30:0x002e), top: B:10:0x000d, outer: #1 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized int j(long j7, b bVar, a1 a1Var) {
            kotlinx.coroutines.internal.y yVar;
            long j8;
            long j9;
            int i7;
            Object obj = this.f19270g;
            yVar = d1.f19276a;
            if (obj == yVar) {
                i7 = 2;
            } else {
                synchronized (bVar) {
                    a b7 = bVar.b();
                    if (a1Var.i0()) {
                        return 1;
                    }
                    if (b7 != null) {
                        long j10 = b7.f19269f;
                        if (j10 - j7 < 0) {
                            j7 = j10;
                        }
                        if (j7 - bVar.f19272b > 0) {
                        }
                        j8 = this.f19269f;
                        j9 = bVar.f19272b;
                        if (j8 - j9 < 0) {
                            this.f19269f = j9;
                        }
                        bVar.a(this);
                        i7 = 0;
                    }
                    bVar.f19272b = j7;
                    j8 = this.f19269f;
                    j9 = bVar.f19272b;
                    if (j8 - j9 < 0) {
                    }
                    bVar.a(this);
                    i7 = 0;
                }
            }
            return i7;
        }

        public final boolean k(long j7) {
            return j7 - this.f19269f >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f19269f + ']';
        }
    }

    public static final class b extends kotlinx.coroutines.internal.d0<a> {

        /* renamed from: b, reason: collision with root package name */
        public long f19272b;

        public b(long j7) {
            this.f19272b = j7;
        }
    }

    private final void e0() {
        kotlinx.coroutines.internal.y yVar;
        kotlinx.coroutines.internal.y yVar2;
        if (p0.a() && !i0()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19267j;
                yVar = d1.f19277b;
                if (androidx.work.impl.utils.futures.b.a(atomicReferenceFieldUpdater, this, null, yVar)) {
                    return;
                }
            } else {
                if (obj instanceof kotlinx.coroutines.internal.p) {
                    ((kotlinx.coroutines.internal.p) obj).d();
                    return;
                }
                yVar2 = d1.f19277b;
                if (obj == yVar2) {
                    return;
                }
                kotlinx.coroutines.internal.p pVar = new kotlinx.coroutines.internal.p(8, true);
                pVar.a((Runnable) obj);
                if (androidx.work.impl.utils.futures.b.a(f19267j, this, obj, pVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable f0() {
        kotlinx.coroutines.internal.y yVar;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.p) {
                kotlinx.coroutines.internal.p pVar = (kotlinx.coroutines.internal.p) obj;
                Object j7 = pVar.j();
                if (j7 != kotlinx.coroutines.internal.p.f18364h) {
                    return (Runnable) j7;
                }
                androidx.work.impl.utils.futures.b.a(f19267j, this, obj, pVar.i());
            } else {
                yVar = d1.f19277b;
                if (obj == yVar) {
                    return null;
                }
                if (androidx.work.impl.utils.futures.b.a(f19267j, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean h0(Runnable runnable) {
        kotlinx.coroutines.internal.y yVar;
        while (true) {
            Object obj = this._queue;
            if (i0()) {
                return false;
            }
            if (obj == null) {
                if (androidx.work.impl.utils.futures.b.a(f19267j, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.p) {
                kotlinx.coroutines.internal.p pVar = (kotlinx.coroutines.internal.p) obj;
                int a7 = pVar.a(runnable);
                if (a7 == 0) {
                    return true;
                }
                if (a7 == 1) {
                    androidx.work.impl.utils.futures.b.a(f19267j, this, obj, pVar.i());
                } else if (a7 == 2) {
                    return false;
                }
            } else {
                yVar = d1.f19277b;
                if (obj == yVar) {
                    return false;
                }
                kotlinx.coroutines.internal.p pVar2 = new kotlinx.coroutines.internal.p(8, true);
                pVar2.a((Runnable) obj);
                pVar2.a(runnable);
                if (androidx.work.impl.utils.futures.b.a(f19267j, this, obj, pVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean i0() {
        return this._isCompleted;
    }

    private final void l0() {
        c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) this._delayed;
            a i7 = bVar == null ? null : bVar.i();
            if (i7 == null) {
                return;
            } else {
                b0(nanoTime, i7);
            }
        }
    }

    private final int o0(long j7, a aVar) {
        if (i0()) {
            return 1;
        }
        b bVar = (b) this._delayed;
        if (bVar == null) {
            androidx.work.impl.utils.futures.b.a(f19268k, this, null, new b(j7));
            Object obj = this._delayed;
            kotlin.jvm.internal.i.b(obj);
            bVar = (b) obj;
        }
        return aVar.j(j7, bVar, this);
    }

    private final void p0(boolean z6) {
        this._isCompleted = z6 ? 1 : 0;
    }

    private final boolean q0(a aVar) {
        b bVar = (b) this._delayed;
        return (bVar == null ? null : bVar.e()) == aVar;
    }

    @Override // m6.f0
    public final void P(y5.g gVar, Runnable runnable) {
        g0(runnable);
    }

    @Override // m6.z0
    protected long U() {
        long b7;
        kotlinx.coroutines.internal.y yVar;
        if (super.U() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.p)) {
                yVar = d1.f19277b;
                return obj == yVar ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.internal.p) obj).g()) {
                return 0L;
            }
        }
        b bVar = (b) this._delayed;
        a e7 = bVar == null ? null : bVar.e();
        if (e7 == null) {
            return Long.MAX_VALUE;
        }
        long j7 = e7.f19269f;
        c.a();
        b7 = i6.f.b(j7 - System.nanoTime(), 0L);
        return b7;
    }

    public final void g0(Runnable runnable) {
        if (h0(runnable)) {
            c0();
        } else {
            r0.f19326l.g0(runnable);
        }
    }

    protected boolean j0() {
        kotlinx.coroutines.internal.y yVar;
        if (!Y()) {
            return false;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.p) {
                return ((kotlinx.coroutines.internal.p) obj).g();
            }
            yVar = d1.f19277b;
            if (obj != yVar) {
                return false;
            }
        }
        return true;
    }

    public long k0() {
        a aVar;
        if (Z()) {
            return 0L;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.d()) {
            c.a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (bVar) {
                    a b7 = bVar.b();
                    aVar = null;
                    if (b7 != null) {
                        a aVar2 = b7;
                        if (aVar2.k(nanoTime) ? h0(aVar2) : false) {
                            aVar = bVar.h(0);
                        }
                    }
                }
            } while (aVar != null);
        }
        Runnable f02 = f0();
        if (f02 == null) {
            return U();
        }
        f02.run();
        return 0L;
    }

    protected final void m0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void n0(long j7, a aVar) {
        int o02 = o0(j7, aVar);
        if (o02 == 0) {
            if (q0(aVar)) {
                c0();
            }
        } else if (o02 == 1) {
            b0(j7, aVar);
        } else if (o02 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @Override // m6.z0
    protected void shutdown() {
        f2.f19284a.b();
        p0(true);
        e0();
        while (k0() <= 0) {
        }
        l0();
    }
}
