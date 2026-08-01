package ge;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class h extends i0 implements f, nd.d, b2 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4353t = AtomicIntegerFieldUpdater.newUpdater(h.class, "_decisionAndIndex$volatile");

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4354u = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_state$volatile");

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4355v = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: r, reason: collision with root package name */
    public final ld.a f4356r;

    /* renamed from: s, reason: collision with root package name */
    public final CoroutineContext f4357s;

    public h(int i3, ld.a aVar) {
        super(i3);
        this.f4356r = aVar;
        this.f4357s = aVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f4333a;
    }

    public static Object C(p1 p1Var, Object obj, int i3, vd.n nVar) {
        if (obj instanceof q) {
            return obj;
        }
        if (i3 != 1 && i3 != 2) {
            return obj;
        }
        if (nVar != null || (p1Var instanceof e)) {
            return new p(obj, p1Var instanceof e ? (e) p1Var : null, nVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void x(p1 p1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + p1Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i3, vd.n nVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4354u;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof p1) {
                Object C = C((p1) obj2, obj, i3, nVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    o();
                }
                p(i3);
                return;
            }
            if (obj2 instanceof i) {
                i iVar = (i) obj2;
                if (i.f4360c.compareAndSet(iVar, 0, 1)) {
                    if (nVar != null) {
                        l(nVar, iVar.f4394a, obj);
                        return;
                    }
                    return;
                }
            }
            a2.r.n(obj, "Already resumed, but proposed with update ");
            return;
        }
    }

    public final void B(t tVar, Unit unit) {
        ld.a aVar = this.f4356r;
        le.g gVar = aVar instanceof le.g ? (le.g) aVar : null;
        A(unit, (gVar != null ? gVar.f5973r : null) == tVar ? 4 : this.f4361i, null);
    }

    @Override // ge.b2
    public final void a(le.s sVar, int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f4353t;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                kotlin.collections.i0.l("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i3));
        v(sVar);
    }

    @Override // ge.i0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4354u;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof p1) {
                kotlin.collections.i0.l("Not completed");
                return;
            }
            if (obj instanceof q) {
                return;
            }
            if (!(obj instanceof p)) {
                cancellationException2 = cancellationException;
                p pVar = new p(obj, (e) null, (vd.n) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            p pVar2 = (p) obj;
            if (pVar2.f4388e != null) {
                kotlin.collections.i0.l("Must be called at most once");
                return;
            }
            p a9 = p.a(pVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a9)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            e eVar = pVar2.f4385b;
            if (eVar != null) {
                k(eVar, cancellationException);
            }
            vd.n nVar = pVar2.f4386c;
            if (nVar != null) {
                l(nVar, cancellationException, pVar2.f4384a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // ge.i0
    public final ld.a c() {
        return this.f4356r;
    }

    @Override // ge.i0
    public final Throwable d(Object obj) {
        Throwable d10 = super.d(obj);
        if (d10 != null) {
            return d10;
        }
        return null;
    }

    @Override // ge.f
    public final void e(Object obj, vd.n nVar) {
        A(obj, this.f4361i, nVar);
    }

    @Override // ge.f
    public final a8.f f(Object obj, vd.n nVar) {
        a8.f fVar = a0.f4323a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4354u;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof p1)) {
                return null;
            }
            Object C = C((p1) obj2, obj, this.f4361i, nVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!w()) {
                o();
            }
            return fVar;
        }
    }

    @Override // ge.f
    public final void g(Object obj) {
        p(this.f4361i);
    }

    @Override // nd.d
    public final nd.d getCallerFrame() {
        ld.a aVar = this.f4356r;
        if (aVar instanceof nd.d) {
            return (nd.d) aVar;
        }
        return null;
    }

    @Override // ld.a
    public final CoroutineContext getContext() {
        return this.f4357s;
    }

    @Override // ge.i0
    public final Object h(Object obj) {
        return obj instanceof p ? ((p) obj).f4384a : obj;
    }

    @Override // ge.i0
    public final Object j() {
        return f4354u.get(this);
    }

    public final void k(e eVar, Throwable th) {
        try {
            switch (eVar.f4345a) {
                case 0:
                    ((ScheduledFuture) eVar.f4346b).cancel(false);
                    break;
                case 1:
                    ((Function1) eVar.f4346b).invoke(th);
                    break;
                default:
                    ((m0) eVar.f4346b).a();
                    break;
            }
        } catch (Throwable th2) {
            a0.o(new com.google.android.gms.internal.measurement.d0("Exception in invokeOnCancellation handler for " + this, th2, 1), this.f4357s);
        }
    }

    public final void l(vd.n nVar, Throwable th, Object obj) {
        CoroutineContext coroutineContext = this.f4357s;
        try {
            nVar.a(th, obj, coroutineContext);
        } catch (Throwable th2) {
            a0.o(new com.google.android.gms.internal.measurement.d0("Exception in resume onCancellation handler for " + this, th2, 1), coroutineContext);
        }
    }

    public final void m(le.s sVar, Throwable th) {
        CoroutineContext coroutineContext = this.f4357s;
        int i3 = f4353t.get(this) & 536870911;
        if (i3 == 536870911) {
            kotlin.collections.i0.l("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            sVar.g(i3, coroutineContext);
        } catch (Throwable th2) {
            a0.o(new com.google.android.gms.internal.measurement.d0("Exception in invokeOnCancellation handler for " + this, th2, 1), coroutineContext);
        }
    }

    public final boolean n(Throwable th) {
        Throwable th2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4354u;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof p1)) {
                return false;
            }
            boolean z10 = (obj instanceof e) || (obj instanceof le.s);
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            i iVar = new i(th2, z10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, iVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            p1 p1Var = (p1) obj;
            if (p1Var instanceof e) {
                k((e) obj, th);
            } else if (p1Var instanceof le.s) {
                m((le.s) obj, th);
            }
            if (!w()) {
                o();
            }
            p(this.f4361i);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4355v;
        m0 m0Var = (m0) atomicReferenceFieldUpdater.get(this);
        if (m0Var == null) {
            return;
        }
        m0Var.a();
        atomicReferenceFieldUpdater.set(this, o1.f4383d);
    }

    public final void p(int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f4353t;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 1) {
                    kotlin.collections.i0.l("Already resumed");
                    return;
                }
                boolean z10 = i3 == 4;
                ld.a aVar = this.f4356r;
                if (!z10 && (aVar instanceof le.g)) {
                    boolean z11 = i3 == 1 || i3 == 2;
                    int i12 = this.f4361i;
                    if (z11 == (i12 == 1 || i12 == 2)) {
                        le.g gVar = (le.g) aVar;
                        t tVar = gVar.f5973r;
                        CoroutineContext context = gVar.f5974s.getContext();
                        if (le.b.i(tVar, context)) {
                            le.b.h(tVar, context, this);
                            return;
                        }
                        p0 a9 = u1.a();
                        if (a9.f4390i >= 4294967296L) {
                            a9.Q(this);
                            return;
                        }
                        a9.R(true);
                        try {
                            a0.v(this, aVar, true);
                            do {
                            } while (a9.T());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                a0.v(this, aVar, z10);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public Throwable q(k1 k1Var) {
        return k1Var.x();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        c1 c1Var;
        boolean w6 = w();
        do {
            atomicIntegerFieldUpdater = f4353t;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i10 = i3 >> 29;
            if (i10 != 0) {
                if (i10 != 2) {
                    kotlin.collections.i0.l("Already suspended");
                    return null;
                }
                if (w6) {
                    z();
                }
                Object obj = f4354u.get(this);
                if (obj instanceof q) {
                    throw ((q) obj).f4394a;
                }
                int i11 = this.f4361i;
                if ((i11 != 1 && i11 != 2) || (c1Var = (c1) this.f4357s.m(u.f4403e)) == null || c1Var.d()) {
                    return h(obj);
                }
                CancellationException x10 = c1Var.x();
                b(x10);
                throw x10;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 536870912 + (536870911 & i3)));
        if (((m0) f4355v.get(this)) == null) {
            t();
        }
        if (w6) {
            z();
        }
        return md.a.f6622d;
    }

    @Override // ld.a
    public final void resumeWith(Object obj) {
        Throwable a9 = hd.n.a(obj);
        if (a9 != null) {
            obj = new q(a9, false);
        }
        A(obj, this.f4361i, null);
    }

    public final void s() {
        m0 t6 = t();
        if (t6 == null || (f4354u.get(this) instanceof p1)) {
            return;
        }
        t6.a();
        f4355v.set(this, o1.f4383d);
    }

    public final m0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c1 c1Var = (c1) this.f4357s.m(u.f4403e);
        if (c1Var == null) {
            return null;
        }
        m0 p4 = a0.p(c1Var, true, new j(this, 0));
        do {
            atomicReferenceFieldUpdater = f4355v;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, p4)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return p4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y());
        sb2.append('(');
        sb2.append(a0.z(this.f4356r));
        sb2.append("){");
        Object obj = f4354u.get(this);
        sb2.append(obj instanceof p1 ? "Active" : obj instanceof i ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(a0.m(this));
        return sb2.toString();
    }

    public final void u(Function1 function1) {
        v(new e(1, function1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a0, code lost:
    
        x(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(p1 p1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4354u;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, p1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof e) || (obj instanceof le.s)) {
                break;
            }
            if (obj instanceof q) {
                q qVar = (q) obj;
                if (!q.f4393b.compareAndSet(qVar, 0, 1)) {
                    x(p1Var, obj);
                    throw null;
                }
                if (obj instanceof i) {
                    Throwable th = qVar.f4394a;
                    if (p1Var instanceof e) {
                        k((e) p1Var, th);
                        return;
                    } else {
                        m((le.s) p1Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof p)) {
                if (p1Var instanceof le.s) {
                    return;
                }
                p pVar = new p(obj, (e) p1Var, (vd.n) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            p pVar2 = (p) obj;
            if (pVar2.f4385b != null) {
                x(p1Var, obj);
                throw null;
            }
            if (p1Var instanceof le.s) {
                return;
            }
            e eVar = (e) p1Var;
            Throwable th2 = pVar2.f4388e;
            if (th2 != null) {
                k(eVar, th2);
                return;
            }
            p a9 = p.a(pVar2, eVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a9)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean w() {
        if (this.f4361i != 2) {
            return false;
        }
        ld.a aVar = this.f4356r;
        aVar.getClass();
        return le.g.f5972v.get((le.g) aVar) != null;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        ld.a aVar = this.f4356r;
        Throwable th = null;
        le.g gVar = aVar instanceof le.g ? (le.g) aVar : null;
        if (gVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = le.g.f5972v;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                a8.f fVar = le.b.f5966c;
                if (obj == fVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, this)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != fVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        a2.r.n(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            te.a1.e("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            o();
            n(th);
        }
    }
}
