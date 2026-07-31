package q2;

import e2.InterfaceC0424c;
import e2.InterfaceC0427f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: q2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0821h extends D implements InterfaceC0819f, X1.d, w0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7900i = AtomicIntegerFieldUpdater.newUpdater(C0821h.class, "_decisionAndIndex$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7901j = AtomicReferenceFieldUpdater.newUpdater(C0821h.class, Object.class, "_state$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7902k = AtomicReferenceFieldUpdater.newUpdater(C0821h.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final V1.d f7903g;

    /* renamed from: h, reason: collision with root package name */
    public final V1.i f7904h;

    public C0821h(int i3, V1.d dVar) {
        super(i3);
        this.f7903g = dVar;
        this.f7904h = dVar.t();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0815b.f7879a;
    }

    public static Object F(k0 k0Var, Object obj, int i3, InterfaceC0427f interfaceC0427f) {
        if ((obj instanceof C0829p) || !AbstractC0837y.q(i3)) {
            return obj;
        }
        if (interfaceC0427f != null || (k0Var instanceof C0818e)) {
            return new C0828o(obj, k0Var instanceof C0818e ? (C0818e) k0Var : null, interfaceC0427f, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void y(k0 k0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + k0Var + ", already has " + obj).toString());
    }

    public final void A() {
        V1.d dVar = this.f7903g;
        Throwable th = null;
        v2.f fVar = dVar instanceof v2.f ? (v2.f) dVar : null;
        if (fVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v2.f.f9794k;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                m1.q qVar = v2.a.f9784c;
                if (obj == qVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, qVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != qVar) {
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
            n();
            C(th);
        }
    }

    @Override // q2.InterfaceC0819f
    public final void B(Object obj) {
        o(this.f7850f);
    }

    @Override // q2.InterfaceC0819f
    public final boolean C(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7901j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof k0)) {
                return false;
            }
            C0822i c0822i = new C0822i(this, th, (obj instanceof C0818e) || (obj instanceof v2.r));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0822i)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            k0 k0Var = (k0) obj;
            if (k0Var instanceof C0818e) {
                h((C0818e) obj, th);
            } else if (k0Var instanceof v2.r) {
                l((v2.r) obj, th);
            }
            if (!x()) {
                n();
            }
            o(this.f7850f);
            return true;
        }
    }

    public final void D(Object obj, int i3, InterfaceC0427f interfaceC0427f) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7901j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof k0) {
                Object F3 = F((k0) obj2, obj, i3, interfaceC0427f);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, F3)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    n();
                }
                o(i3);
                return;
            }
            if (obj2 instanceof C0822i) {
                C0822i c0822i = (C0822i) obj2;
                c0822i.getClass();
                if (C0822i.f7905c.compareAndSet(c0822i, 0, 1)) {
                    if (interfaceC0427f != null) {
                        i(interfaceC0427f, c0822i.f7917a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void E(AbstractC0831s abstractC0831s) {
        R1.y yVar = R1.y.f4171a;
        V1.d dVar = this.f7903g;
        v2.f fVar = dVar instanceof v2.f ? (v2.f) dVar : null;
        D(yVar, (fVar != null ? fVar.f9795g : null) == abstractC0831s ? 4 : this.f7850f, null);
    }

    @Override // q2.w0
    public final void a(v2.r rVar, int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f7900i;
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i3));
        w(rVar);
    }

    @Override // q2.D
    public final void b(CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7901j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof k0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0829p) {
                return;
            }
            if (!(obj instanceof C0828o)) {
                C0828o c0828o = new C0828o(obj, (C0818e) null, (InterfaceC0427f) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0828o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0828o c0828o2 = (C0828o) obj;
            if (c0828o2.f7915e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0828o a3 = C0828o.a(c0828o2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            C0818e c0818e = c0828o2.f7912b;
            if (c0818e != null) {
                h(c0818e, cancellationException);
            }
            InterfaceC0427f interfaceC0427f = c0828o2.f7913c;
            if (interfaceC0427f != null) {
                i(interfaceC0427f, cancellationException, c0828o2.f7911a);
                return;
            }
            return;
        }
    }

    @Override // q2.D
    public final V1.d c() {
        return this.f7903g;
    }

    @Override // q2.D
    public final Throwable d(Object obj) {
        Throwable d3 = super.d(obj);
        if (d3 != null) {
            return d3;
        }
        return null;
    }

    @Override // q2.D
    public final Object e(Object obj) {
        return obj instanceof C0828o ? ((C0828o) obj).f7911a : obj;
    }

    @Override // q2.D
    public final Object g() {
        return f7901j.get(this);
    }

    public final void h(C0818e c0818e, Throwable th) {
        try {
            switch (c0818e.f7889a) {
                case 0:
                    ((ScheduledFuture) c0818e.f7890b).cancel(false);
                    break;
                case 1:
                    ((InterfaceC0424c) c0818e.f7890b).n(th);
                    break;
                default:
                    ((G) c0818e.f7890b).a();
                    break;
            }
        } catch (Throwable th2) {
            AbstractC0837y.m(this.f7904h, new C1.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void i(InterfaceC0427f interfaceC0427f, Throwable th, Object obj) {
        V1.i iVar = this.f7904h;
        try {
            interfaceC0427f.g(th, obj, iVar);
        } catch (Throwable th2) {
            AbstractC0837y.m(iVar, new C1.c("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // q2.InterfaceC0819f
    public final m1.q j(Object obj, InterfaceC0427f interfaceC0427f) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7901j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj2 instanceof k0;
            m1.q qVar = AbstractC0837y.f7940a;
            if (!z3) {
                boolean z4 = obj2 instanceof C0828o;
                return null;
            }
            Object F3 = F((k0) obj2, obj, this.f7850f, interfaceC0427f);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, F3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (x()) {
                return qVar;
            }
            n();
            return qVar;
        }
    }

    @Override // X1.d
    public final X1.d k() {
        V1.d dVar = this.f7903g;
        if (dVar instanceof X1.d) {
            return (X1.d) dVar;
        }
        return null;
    }

    public final void l(v2.r rVar, Throwable th) {
        V1.i iVar = this.f7904h;
        int i3 = f7900i.get(this) & 536870911;
        if (i3 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.g(i3, iVar);
        } catch (Throwable th2) {
            AbstractC0837y.m(iVar, new C1.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // q2.InterfaceC0819f
    public final void m(Object obj, InterfaceC0427f interfaceC0427f) {
        D(obj, this.f7850f, interfaceC0427f);
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7902k;
        G g3 = (G) atomicReferenceFieldUpdater.get(this);
        if (g3 == null) {
            return;
        }
        g3.a();
        atomicReferenceFieldUpdater.set(this, j0.f7909d);
    }

    public final void o(int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f7900i;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                V1.d dVar = this.f7903g;
                boolean z3 = i3 == 4;
                if (z3 || !(dVar instanceof v2.f) || AbstractC0837y.q(i3) != AbstractC0837y.q(this.f7850f)) {
                    AbstractC0837y.t(this, dVar, z3);
                    return;
                }
                v2.f fVar = (v2.f) dVar;
                AbstractC0831s abstractC0831s = fVar.f9795g;
                V1.i t3 = fVar.f9796h.t();
                if (abstractC0831s.F(t3)) {
                    abstractC0831s.D(t3, this);
                    return;
                }
                O a3 = p0.a();
                if (a3.L()) {
                    a3.I(this);
                    return;
                }
                a3.K(true);
                try {
                    AbstractC0837y.t(this, dVar, true);
                    do {
                    } while (a3.N());
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

    public Throwable p(f0 f0Var) {
        return f0Var.g();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        boolean x3 = x();
        do {
            atomicIntegerFieldUpdater = f7900i;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (x3) {
                    A();
                }
                Object obj = f7901j.get(this);
                if (obj instanceof C0829p) {
                    throw ((C0829p) obj).f7917a;
                }
                if (AbstractC0837y.q(this.f7850f)) {
                    X x4 = (X) this.f7904h.v(C0832t.f7929e);
                    if (x4 != null && !x4.b()) {
                        CancellationException g3 = x4.g();
                        b(g3);
                        throw g3;
                    }
                }
                return e(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 536870912 + (536870911 & i3)));
        if (((G) f7902k.get(this)) == null) {
            s();
        }
        if (x3) {
            A();
        }
        return W1.a.f4608d;
    }

    public final void r() {
        G s3 = s();
        if (s3 == null || (f7901j.get(this) instanceof k0)) {
            return;
        }
        s3.a();
        f7902k.set(this, j0.f7909d);
    }

    public final G s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        X x3 = (X) this.f7904h.v(C0832t.f7929e);
        if (x3 == null) {
            return null;
        }
        G n3 = AbstractC0837y.n(x3, true, new C0823j(this, 0));
        do {
            atomicReferenceFieldUpdater = f7902k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, n3)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return n3;
    }

    @Override // V1.d
    public final V1.i t() {
        return this.f7904h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(AbstractC0837y.w(this.f7903g));
        sb.append("){");
        Object obj = f7901j.get(this);
        sb.append(obj instanceof k0 ? "Active" : obj instanceof C0822i ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0837y.j(this));
        return sb.toString();
    }

    @Override // V1.d
    public final void u(Object obj) {
        Throwable a3 = R1.l.a(obj);
        if (a3 != null) {
            obj = new C0829p(a3, false);
        }
        D(obj, this.f7850f, null);
    }

    public final void v(InterfaceC0424c interfaceC0424c) {
        w(new C0818e(1, interfaceC0424c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ba, code lost:
    
        y(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bd, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(k0 k0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7901j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0815b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof C0818e) || (obj instanceof v2.r)) {
                break;
            }
            if (obj instanceof C0829p) {
                C0829p c0829p = (C0829p) obj;
                c0829p.getClass();
                if (!C0829p.f7916b.compareAndSet(c0829p, 0, 1)) {
                    y(k0Var, obj);
                    throw null;
                }
                if (obj instanceof C0822i) {
                    if (!(obj instanceof C0829p)) {
                        c0829p = null;
                    }
                    Throwable th = c0829p != null ? c0829p.f7917a : null;
                    if (k0Var instanceof C0818e) {
                        h((C0818e) k0Var, th);
                        return;
                    } else {
                        f2.j.d(k0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        l((v2.r) k0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0828o)) {
                if (k0Var instanceof v2.r) {
                    return;
                }
                f2.j.d(k0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0828o c0828o = new C0828o(obj, (C0818e) k0Var, (InterfaceC0427f) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0828o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0828o c0828o2 = (C0828o) obj;
            if (c0828o2.f7912b != null) {
                y(k0Var, obj);
                throw null;
            }
            if (k0Var instanceof v2.r) {
                return;
            }
            f2.j.d(k0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            C0818e c0818e = (C0818e) k0Var;
            Throwable th2 = c0828o2.f7915e;
            if (th2 != null) {
                h(c0818e, th2);
                return;
            }
            C0828o a3 = C0828o.a(c0828o2, c0818e, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean x() {
        if (this.f7850f == 2) {
            V1.d dVar = this.f7903g;
            f2.j.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (v2.f.f9794k.get((v2.f) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
