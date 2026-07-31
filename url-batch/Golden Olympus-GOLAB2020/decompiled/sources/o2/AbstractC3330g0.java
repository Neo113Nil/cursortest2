package o2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import o2.T;
import org.jetbrains.annotations.Nullable;

/* renamed from: o2.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3330g0 extends AbstractC3332h0 implements T {

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f42072g = AtomicReferenceFieldUpdater.newUpdater(AbstractC3330g0.class, Object.class, "_queue$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f42073h = AtomicReferenceFieldUpdater.newUpdater(AbstractC3330g0.class, Object.class, "_delayed$volatile");

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f42074i = AtomicIntegerFieldUpdater.newUpdater(AbstractC3330g0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* renamed from: o2.g0$a */
    private final class a extends c {

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC3343n f42075d;

        public a(long j4, InterfaceC3343n interfaceC3343n) {
            super(j4);
            this.f42075d = interfaceC3343n;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f42075d.k(AbstractC3330g0.this, Unit.f41027a);
        }

        @Override // o2.AbstractC3330g0.c
        public String toString() {
            return super.toString() + this.f42075d;
        }
    }

    /* renamed from: o2.g0$b */
    private static final class b extends c {

        /* renamed from: d, reason: collision with root package name */
        private final Runnable f42077d;

        public b(long j4, Runnable runnable) {
            super(j4);
            this.f42077d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f42077d.run();
        }

        @Override // o2.AbstractC3330g0.c
        public String toString() {
            return super.toString() + this.f42077d;
        }
    }

    /* renamed from: o2.g0$c */
    public static abstract class c implements Runnable, Comparable, InterfaceC3320b0, t2.N {

        @Nullable
        private volatile Object _heap;

        /* renamed from: b, reason: collision with root package name */
        public long f42078b;

        /* renamed from: c, reason: collision with root package name */
        private int f42079c = -1;

        public c(long j4) {
            this.f42078b = j4;
        }

        @Override // t2.N
        public void a(t2.M m4) {
            t2.G g4;
            Object obj = this._heap;
            g4 = AbstractC3336j0.f42082a;
            if (obj == g4) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = m4;
        }

        @Override // t2.N
        public t2.M c() {
            Object obj = this._heap;
            if (obj instanceof t2.M) {
                return (t2.M) obj;
            }
            return null;
        }

        @Override // t2.N
        public void d(int i4) {
            this.f42079c = i4;
        }

        @Override // o2.InterfaceC3320b0
        public final void dispose() {
            t2.G g4;
            t2.G g5;
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    g4 = AbstractC3336j0.f42082a;
                    if (obj == g4) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    g5 = AbstractC3336j0.f42082a;
                    this._heap = g5;
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t2.N
        public int e() {
            return this.f42079c;
        }

        @Override // java.lang.Comparable
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j4 = this.f42078b - cVar.f42078b;
            if (j4 > 0) {
                return 1;
            }
            return j4 < 0 ? -1 : 0;
        }

        public final int g(long j4, d dVar, AbstractC3330g0 abstractC3330g0) {
            t2.G g4;
            synchronized (this) {
                Object obj = this._heap;
                g4 = AbstractC3336j0.f42082a;
                if (obj == g4) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (abstractC3330g0.isCompleted()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f42080c = j4;
                        } else {
                            long j5 = cVar.f42078b;
                            if (j5 - j4 < 0) {
                                j4 = j5;
                            }
                            if (j4 - dVar.f42080c > 0) {
                                dVar.f42080c = j4;
                            }
                        }
                        long j6 = this.f42078b;
                        long j7 = dVar.f42080c;
                        if (j6 - j7 < 0) {
                            this.f42078b = j7;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final boolean h(long j4) {
            return j4 - this.f42078b >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f42078b + ']';
        }
    }

    /* renamed from: o2.g0$d */
    public static final class d extends t2.M {

        /* renamed from: c, reason: collision with root package name */
        public long f42080c;

        public d(long j4) {
            this.f42080c = j4;
        }
    }

    private final void i0() {
        t2.G g4;
        t2.G g5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42072g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f42072g;
                g4 = AbstractC3336j0.f42083b;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, null, g4)) {
                    return;
                }
            } else {
                if (obj instanceof t2.t) {
                    ((t2.t) obj).d();
                    return;
                }
                g5 = AbstractC3336j0.f42083b;
                if (obj == g5) {
                    return;
                }
                t2.t tVar = new t2.t(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                tVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f42072g, this, obj, tVar)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        return f42074i.get(this) != 0;
    }

    private final Runnable j0() {
        t2.G g4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42072g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof t2.t) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                t2.t tVar = (t2.t) obj;
                Object m4 = tVar.m();
                if (m4 != t2.t.f46256h) {
                    return (Runnable) m4;
                }
                androidx.concurrent.futures.b.a(f42072g, this, obj, tVar.l());
            } else {
                g4 = AbstractC3336j0.f42083b;
                if (obj == g4) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f42072g, this, obj, null)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean l0(Runnable runnable) {
        t2.G g4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42072g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f42072g, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof t2.t) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                t2.t tVar = (t2.t) obj;
                int a4 = tVar.a(runnable);
                if (a4 == 0) {
                    return true;
                }
                if (a4 == 1) {
                    androidx.concurrent.futures.b.a(f42072g, this, obj, tVar.l());
                } else if (a4 == 2) {
                    return false;
                }
            } else {
                g4 = AbstractC3336j0.f42083b;
                if (obj == g4) {
                    return false;
                }
                t2.t tVar2 = new t2.t(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                tVar2.a((Runnable) obj);
                tVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f42072g, this, obj, tVar2)) {
                    return true;
                }
            }
        }
    }

    private final void q0() {
        c cVar;
        AbstractC3321c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f42073h.get(this);
            if (dVar == null || (cVar = (c) dVar.j()) == null) {
                return;
            } else {
                f0(nanoTime, cVar);
            }
        }
    }

    private final int t0(long j4, c cVar) {
        if (isCompleted()) {
            return 1;
        }
        d dVar = (d) f42073h.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f42073h, this, null, new d(j4));
            Object obj = f42073h.get(this);
            Intrinsics.checkNotNull(obj);
            dVar = (d) obj;
        }
        return cVar.g(j4, dVar, this);
    }

    private final void v0(boolean z4) {
        f42074i.set(this, z4 ? 1 : 0);
    }

    private final boolean w0(c cVar) {
        d dVar = (d) f42073h.get(this);
        return (dVar != null ? (c) dVar.f() : null) == cVar;
    }

    @Override // o2.AbstractC3328f0
    protected long W() {
        c cVar;
        t2.G g4;
        if (super.W() == 0) {
            return 0L;
        }
        Object obj = f42072g.get(this);
        if (obj != null) {
            if (!(obj instanceof t2.t)) {
                g4 = AbstractC3336j0.f42083b;
                return obj == g4 ? Long.MAX_VALUE : 0L;
            }
            if (!((t2.t) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f42073h.get(this);
        if (dVar == null || (cVar = (c) dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j4 = cVar.f42078b;
        AbstractC3321c.a();
        return kotlin.ranges.g.e(j4 - System.nanoTime(), 0L);
    }

    @Override // o2.AbstractC3328f0
    public long b0() {
        t2.N n4;
        if (c0()) {
            return 0L;
        }
        d dVar = (d) f42073h.get(this);
        if (dVar != null && !dVar.e()) {
            AbstractC3321c.a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        t2.N b4 = dVar.b();
                        if (b4 != null) {
                            c cVar = (c) b4;
                            n4 = cVar.h(nanoTime) ? l0(cVar) : false ? dVar.i(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (((c) n4) != null);
        }
        Runnable j02 = j0();
        if (j02 == null) {
            return W();
        }
        j02.run();
        return 0L;
    }

    @Override // o2.T
    public void e(long j4, InterfaceC3343n interfaceC3343n) {
        long c4 = AbstractC3336j0.c(j4);
        if (c4 < 4611686018427387903L) {
            AbstractC3321c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c4 + nanoTime, interfaceC3343n);
            s0(nanoTime, aVar);
            AbstractC3349q.a(interfaceC3343n, aVar);
        }
    }

    public InterfaceC3320b0 f(long j4, Runnable runnable, CoroutineContext coroutineContext) {
        return T.a.a(this, j4, runnable, coroutineContext);
    }

    @Override // o2.AbstractC3313G
    public final void g(CoroutineContext coroutineContext, Runnable runnable) {
        k0(runnable);
    }

    public void k0(Runnable runnable) {
        if (l0(runnable)) {
            g0();
        } else {
            O.f42018j.k0(runnable);
        }
    }

    protected boolean p0() {
        t2.G g4;
        if (!a0()) {
            return false;
        }
        d dVar = (d) f42073h.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f42072g.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof t2.t) {
            return ((t2.t) obj).j();
        }
        g4 = AbstractC3336j0.f42083b;
        return obj == g4;
    }

    protected final void r0() {
        f42072g.set(this, null);
        f42073h.set(this, null);
    }

    public final void s0(long j4, c cVar) {
        int t02 = t0(j4, cVar);
        if (t02 == 0) {
            if (w0(cVar)) {
                g0();
            }
        } else if (t02 == 1) {
            f0(j4, cVar);
        } else if (t02 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    @Override // o2.AbstractC3328f0
    public void shutdown() {
        T0.f42024a.c();
        v0(true);
        i0();
        while (b0() <= 0) {
        }
        q0();
    }

    protected final InterfaceC3320b0 u0(long j4, Runnable runnable) {
        long c4 = AbstractC3336j0.c(j4);
        if (c4 >= 4611686018427387903L) {
            return J0.f42008b;
        }
        AbstractC3321c.a();
        long nanoTime = System.nanoTime();
        b bVar = new b(c4 + nanoTime, runnable);
        s0(nanoTime, bVar);
        return bVar;
    }
}
