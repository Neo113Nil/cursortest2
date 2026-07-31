package k2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: k2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0536h extends D implements InterfaceC0534f, R1.d, w0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5361i = AtomicIntegerFieldUpdater.newUpdater(C0536h.class, "_decisionAndIndex$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5362j = AtomicReferenceFieldUpdater.newUpdater(C0536h.class, Object.class, "_state$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5363k = AtomicReferenceFieldUpdater.newUpdater(C0536h.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final P1.d f5364g;

    /* renamed from: h, reason: collision with root package name */
    public final P1.i f5365h;

    public C0536h(int i3, P1.d dVar) {
        super(i3);
        this.f5364g = dVar;
        this.f5365h = dVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0530b.f5340a;
    }

    public static Object C(k0 k0Var, Object obj, int i3, Y1.f fVar) {
        if ((obj instanceof C0544p) || !AbstractC0552y.p(i3)) {
            return obj;
        }
        if (fVar != null || (k0Var instanceof C0533e)) {
            return new C0543o(obj, k0Var instanceof C0533e ? (C0533e) k0Var : null, fVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(k0 k0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + k0Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i3, Y1.f fVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5362j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof k0) {
                Object C = C((k0) obj2, obj, i3, fVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    l();
                }
                m(i3);
                return;
            }
            if (obj2 instanceof C0537i) {
                C0537i c0537i = (C0537i) obj2;
                c0537i.getClass();
                if (C0537i.f5366c.compareAndSet(c0537i, 0, 1)) {
                    if (fVar != null) {
                        j(fVar, c0537i.f5378a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(AbstractC0546s abstractC0546s) {
        L1.z zVar = L1.z.f2729a;
        P1.d dVar = this.f5364g;
        p2.f fVar = dVar instanceof p2.f ? (p2.f) dVar : null;
        A(zVar, (fVar != null ? fVar.f6774g : null) == abstractC0546s ? 4 : this.f5311f, null);
    }

    @Override // k2.w0
    public final void a(p2.s sVar, int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f5361i;
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i3));
        u(sVar);
    }

    @Override // k2.D
    public final void b(CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5362j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof k0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0544p) {
                return;
            }
            if (!(obj instanceof C0543o)) {
                C0543o c0543o = new C0543o(obj, (C0533e) null, (Y1.f) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0543o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0543o c0543o2 = (C0543o) obj;
            if (c0543o2.f5376e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0543o a3 = C0543o.a(c0543o2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            C0533e c0533e = c0543o2.f5373b;
            if (c0533e != null) {
                h(c0533e, cancellationException);
            }
            Y1.f fVar = c0543o2.f5374c;
            if (fVar != null) {
                j(fVar, cancellationException, c0543o2.f5372a);
                return;
            }
            return;
        }
    }

    @Override // k2.D
    public final P1.d c() {
        return this.f5364g;
    }

    @Override // k2.D
    public final Throwable d(Object obj) {
        Throwable d3 = super.d(obj);
        if (d3 != null) {
            return d3;
        }
        return null;
    }

    @Override // k2.D
    public final Object e(Object obj) {
        return obj instanceof C0543o ? ((C0543o) obj).f5372a : obj;
    }

    @Override // k2.D
    public final Object g() {
        return f5362j.get(this);
    }

    @Override // R1.d
    public final R1.d getCallerFrame() {
        P1.d dVar = this.f5364g;
        if (dVar instanceof R1.d) {
            return (R1.d) dVar;
        }
        return null;
    }

    @Override // P1.d
    public final P1.i getContext() {
        return this.f5365h;
    }

    public final void h(C0533e c0533e, Throwable th) {
        try {
            switch (c0533e.f5350a) {
                case 0:
                    ((ScheduledFuture) c0533e.f5351b).cancel(false);
                    break;
                case 1:
                    ((Y1.c) c0533e.f5351b).j(th);
                    break;
                default:
                    ((G) c0533e.f5351b).a();
                    break;
            }
        } catch (Throwable th2) {
            AbstractC0552y.l(this.f5365h, new L1.f("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // k2.InterfaceC0534f
    public final j1.p i(Object obj, Y1.f fVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5362j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj2 instanceof k0;
            j1.p pVar = AbstractC0552y.f5400a;
            if (!z3) {
                boolean z4 = obj2 instanceof C0543o;
                return null;
            }
            Object C = C((k0) obj2, obj, this.f5311f, fVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (w()) {
                return pVar;
            }
            l();
            return pVar;
        }
    }

    public final void j(Y1.f fVar, Throwable th, Object obj) {
        P1.i iVar = this.f5365h;
        try {
            fVar.f(th, obj, iVar);
        } catch (Throwable th2) {
            AbstractC0552y.l(iVar, new L1.f("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void k(p2.s sVar, Throwable th) {
        P1.i iVar = this.f5365h;
        int i3 = f5361i.get(this) & 536870911;
        if (i3 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            sVar.g(i3, iVar);
        } catch (Throwable th2) {
            AbstractC0552y.l(iVar, new L1.f("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5363k;
        G g3 = (G) atomicReferenceFieldUpdater.get(this);
        if (g3 == null) {
            return;
        }
        g3.a();
        atomicReferenceFieldUpdater.set(this, j0.f5370d);
    }

    public final void m(int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f5361i;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                P1.d dVar = this.f5364g;
                boolean z3 = i3 == 4;
                if (z3 || !(dVar instanceof p2.f) || AbstractC0552y.p(i3) != AbstractC0552y.p(this.f5311f)) {
                    AbstractC0552y.s(this, dVar, z3);
                    return;
                }
                p2.f fVar = (p2.f) dVar;
                AbstractC0546s abstractC0546s = fVar.f6774g;
                P1.i context = fVar.f6775h.getContext();
                if (abstractC0546s.Q(context)) {
                    abstractC0546s.P(context, this);
                    return;
                }
                O a3 = p0.a();
                if (a3.W()) {
                    a3.T(this);
                    return;
                }
                a3.V(true);
                try {
                    AbstractC0552y.s(this, dVar, true);
                    do {
                    } while (a3.Y());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
    }

    @Override // k2.InterfaceC0534f
    public final void n(Object obj, Y1.f fVar) {
        A(obj, this.f5311f, fVar);
    }

    public Throwable o(f0 f0Var) {
        return f0Var.m();
    }

    public final Object p() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        boolean w3 = w();
        do {
            atomicIntegerFieldUpdater = f5361i;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (w3) {
                    z();
                }
                Object obj = f5362j.get(this);
                if (obj instanceof C0544p) {
                    throw ((C0544p) obj).f5378a;
                }
                if (AbstractC0552y.p(this.f5311f)) {
                    X x3 = (X) this.f5365h.k(C0547t.f5390e);
                    if (x3 != null && !x3.b()) {
                        CancellationException m3 = x3.m();
                        b(m3);
                        throw m3;
                    }
                }
                return e(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 536870912 + (536870911 & i3)));
        if (((G) f5363k.get(this)) == null) {
            r();
        }
        if (w3) {
            z();
        }
        return Q1.a.f3113d;
    }

    public final void q() {
        G r3 = r();
        if (r3 == null || (f5362j.get(this) instanceof k0)) {
            return;
        }
        r3.a();
        f5363k.set(this, j0.f5370d);
    }

    public final G r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        X x3 = (X) this.f5365h.k(C0547t.f5390e);
        if (x3 == null) {
            return null;
        }
        G m3 = AbstractC0552y.m(x3, true, new C0538j(this, 0));
        do {
            atomicReferenceFieldUpdater = f5363k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, m3)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return m3;
    }

    @Override // P1.d
    public final void resumeWith(Object obj) {
        Throwable a3 = L1.m.a(obj);
        if (a3 != null) {
            obj = new C0544p(a3, false);
        }
        A(obj, this.f5311f, null);
    }

    public final void s(Y1.c cVar) {
        u(new C0533e(1, cVar));
    }

    @Override // k2.InterfaceC0534f
    public final void t(Object obj) {
        m(this.f5311f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(AbstractC0552y.v(this.f5364g));
        sb.append("){");
        Object obj = f5362j.get(this);
        sb.append(obj instanceof k0 ? "Active" : obj instanceof C0537i ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0552y.i(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ad, code lost:
    
        x(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b0, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(k0 k0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5362j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0530b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof C0533e) || (obj instanceof p2.s)) {
                break;
            }
            if (obj instanceof C0544p) {
                C0544p c0544p = (C0544p) obj;
                c0544p.getClass();
                if (!C0544p.f5377b.compareAndSet(c0544p, 0, 1)) {
                    x(k0Var, obj);
                    throw null;
                }
                if (obj instanceof C0537i) {
                    if (!(obj instanceof C0544p)) {
                        c0544p = null;
                    }
                    Throwable th = c0544p != null ? c0544p.f5378a : null;
                    if (k0Var instanceof C0533e) {
                        h((C0533e) k0Var, th);
                        return;
                    } else {
                        k((p2.s) k0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0543o)) {
                if (k0Var instanceof p2.s) {
                    return;
                }
                C0543o c0543o = new C0543o(obj, (C0533e) k0Var, (Y1.f) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0543o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0543o c0543o2 = (C0543o) obj;
            if (c0543o2.f5373b != null) {
                x(k0Var, obj);
                throw null;
            }
            if (k0Var instanceof p2.s) {
                return;
            }
            C0533e c0533e = (C0533e) k0Var;
            Throwable th2 = c0543o2.f5376e;
            if (th2 != null) {
                h(c0533e, th2);
                return;
            }
            C0543o a3 = C0543o.a(c0543o2, c0533e, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    @Override // k2.InterfaceC0534f
    public final boolean v(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5362j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof k0)) {
                return false;
            }
            C0537i c0537i = new C0537i(this, th, (obj instanceof C0533e) || (obj instanceof p2.s));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0537i)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            k0 k0Var = (k0) obj;
            if (k0Var instanceof C0533e) {
                h((C0533e) obj, th);
            } else if (k0Var instanceof p2.s) {
                k((p2.s) obj, th);
            }
            if (!w()) {
                l();
            }
            m(this.f5311f);
            return true;
        }
    }

    public final boolean w() {
        if (this.f5311f == 2) {
            P1.d dVar = this.f5364g;
            Z1.i.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (p2.f.f6773k.get((p2.f) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        P1.d dVar = this.f5364g;
        Throwable th = null;
        p2.f fVar = dVar instanceof p2.f ? (p2.f) dVar : null;
        if (fVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p2.f.f6773k;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                j1.p pVar = p2.a.f6763c;
                if (obj == pVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, pVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != pVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            l();
            v(th);
        }
    }
}
