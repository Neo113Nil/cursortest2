package r1;

import b1.EnumC0098a;
import c1.InterfaceC0107d;
import i1.InterfaceC0192l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: r1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355e extends AbstractC0374y implements InterfaceC0354d, InterfaceC0107d, h0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4067f = AtomicIntegerFieldUpdater.newUpdater(C0355e.class, "_decisionAndIndex");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4068g = AtomicReferenceFieldUpdater.newUpdater(C0355e.class, Object.class, "_state");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4069h = AtomicReferenceFieldUpdater.newUpdater(C0355e.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public final a1.d f4070d;
    public final a1.i e;

    public C0355e(a1.d dVar, int i) {
        super(i);
        this.f4070d = dVar;
        this.e = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C0352b.f4064a;
    }

    public static void s(Y y2, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + y2 + ", already has " + obj).toString());
    }

    public static Object v(Y y2, Object obj, int i, InterfaceC0192l interfaceC0192l) {
        if ((obj instanceof C0361k) || !AbstractC0369t.g(i)) {
            return obj;
        }
        if (interfaceC0192l != null || (y2 instanceof L)) {
            return new C0360j(obj, y2 instanceof L ? (L) y2 : null, interfaceC0192l, (CancellationException) null, 16);
        }
        return obj;
    }

    @Override // r1.h0
    public final void a(t1.j jVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f4067f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        q(jVar);
    }

    @Override // r1.AbstractC0374y
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4068g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof Y) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0361k) {
                return;
            }
            if (!(obj2 instanceof C0360j)) {
                C0360j c0360j = new C0360j(obj2, (L) null, (InterfaceC0192l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0360j)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0360j c0360j2 = (C0360j) obj2;
            if (c0360j2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0360j a2 = C0360j.a(c0360j2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            L l2 = c0360j2.f4075b;
            if (l2 != null) {
                h(l2, cancellationException);
            }
            InterfaceC0192l interfaceC0192l = c0360j2.f4076c;
            if (interfaceC0192l != null) {
                i(interfaceC0192l, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // r1.AbstractC0374y
    public final a1.d c() {
        return this.f4070d;
    }

    @Override // r1.AbstractC0374y
    public final Throwable d(Object obj) {
        Throwable d2 = super.d(obj);
        if (d2 != null) {
            return d2;
        }
        return null;
    }

    @Override // r1.AbstractC0374y
    public final Object e(Object obj) {
        return obj instanceof C0360j ? ((C0360j) obj).f4074a : obj;
    }

    @Override // r1.AbstractC0374y
    public final Object g() {
        return f4068g.get(this);
    }

    @Override // c1.InterfaceC0107d
    public final InterfaceC0107d getCallerFrame() {
        a1.d dVar = this.f4070d;
        if (dVar instanceof InterfaceC0107d) {
            return (InterfaceC0107d) dVar;
        }
        return null;
    }

    @Override // a1.d
    public final a1.i getContext() {
        return this.e;
    }

    public final void h(L l2, Throwable th) {
        try {
            l2.a(th);
        } catch (Throwable th2) {
            AbstractC0369t.e(this.e, new W0.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void i(InterfaceC0192l interfaceC0192l, Throwable th) {
        try {
            interfaceC0192l.g(th);
        } catch (Throwable th2) {
            AbstractC0369t.e(this.e, new W0.c("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void j(w1.t tVar, Throwable th) {
        a1.i iVar = this.e;
        int i = f4067f.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            tVar.g(i, iVar);
        } catch (Throwable th2) {
            AbstractC0369t.e(iVar, new W0.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4068g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Y) {
                C0356f c0356f = new C0356f(this, th, (obj instanceof L) || (obj instanceof w1.t));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0356f)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                Y y2 = (Y) obj;
                if (y2 instanceof L) {
                    h((L) obj, th);
                } else if (y2 instanceof w1.t) {
                    j((w1.t) obj, th);
                }
                if (!r()) {
                    l();
                }
                m(this.f4099c);
                return;
            }
            return;
        }
    }

    public final void l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4069h;
        A a2 = (A) atomicReferenceFieldUpdater.get(this);
        if (a2 == null) {
            return;
        }
        a2.e();
        atomicReferenceFieldUpdater.set(this, X.f4062a);
    }

    public final void m(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f4067f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i == 4;
                a1.d dVar = this.f4070d;
                if (z2 || !(dVar instanceof w1.g) || AbstractC0369t.g(i) != AbstractC0369t.g(this.f4099c)) {
                    AbstractC0369t.j(this, dVar, z2);
                    return;
                }
                AbstractC0366p abstractC0366p = ((w1.g) dVar).f4474d;
                a1.i context = ((w1.g) dVar).e.getContext();
                if (abstractC0366p.E()) {
                    abstractC0366p.D(context, this);
                    return;
                }
                E a2 = d0.a();
                if (a2.f4040c >= 4294967296L) {
                    X0.i iVar = a2.e;
                    if (iVar == null) {
                        iVar = new X0.i();
                        a2.e = iVar;
                    }
                    iVar.addLast(this);
                    return;
                }
                a2.H(true);
                try {
                    AbstractC0369t.j(this, dVar, true);
                    do {
                    } while (a2.I());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public final Object n() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean r2 = r();
        do {
            atomicIntegerFieldUpdater = f4067f;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (r2) {
                    t();
                }
                Object obj = f4068g.get(this);
                if (obj instanceof C0361k) {
                    throw ((C0361k) obj).f4079a;
                }
                if (AbstractC0369t.g(this.f4099c)) {
                    N n2 = (N) this.e.d(C0367q.f4090b);
                    if (n2 != null && !n2.a()) {
                        CancellationException o2 = ((V) n2).o();
                        b(obj, o2);
                        throw o2;
                    }
                }
                return e(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((A) f4069h.get(this)) == null) {
            p();
        }
        if (r2) {
            t();
        }
        return EnumC0098a.f2223a;
    }

    public final void o() {
        A p2 = p();
        if (p2 == null || (f4068g.get(this) instanceof Y)) {
            return;
        }
        p2.e();
        f4069h.set(this, X.f4062a);
    }

    public final A p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        N n2 = (N) this.e.d(C0367q.f4090b);
        if (n2 == null) {
            return null;
        }
        A f2 = AbstractC0369t.f(n2, true, new C0357g(this), 2);
        do {
            atomicReferenceFieldUpdater = f4069h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, f2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return f2;
    }

    public final void q(Y y2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4068g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0352b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, y2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof L ? true : obj instanceof w1.t) {
                s(y2, obj);
                throw null;
            }
            if (obj instanceof C0361k) {
                C0361k c0361k = (C0361k) obj;
                c0361k.getClass();
                if (!C0361k.f4078b.compareAndSet(c0361k, 0, 1)) {
                    s(y2, obj);
                    throw null;
                }
                if (obj instanceof C0356f) {
                    if (!(obj instanceof C0361k)) {
                        c0361k = null;
                    }
                    Throwable th = c0361k != null ? c0361k.f4079a : null;
                    if (y2 instanceof L) {
                        h((L) y2, th);
                        return;
                    } else {
                        j1.h.c(y2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        j((w1.t) y2, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0360j)) {
                if (y2 instanceof w1.t) {
                    return;
                }
                j1.h.c(y2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0360j c0360j = new C0360j(obj, (L) y2, (InterfaceC0192l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0360j)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0360j c0360j2 = (C0360j) obj;
            if (c0360j2.f4075b != null) {
                s(y2, obj);
                throw null;
            }
            if (y2 instanceof w1.t) {
                return;
            }
            j1.h.c(y2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            L l2 = (L) y2;
            Throwable th2 = c0360j2.e;
            if (th2 != null) {
                h(l2, th2);
                return;
            }
            C0360j a2 = C0360j.a(c0360j2, l2, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean r() {
        if (this.f4099c == 2) {
            a1.d dVar = this.f4070d;
            j1.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (w1.g.f4473h.get((w1.g) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // a1.d
    public final void resumeWith(Object obj) {
        Throwable a2 = W0.f.a(obj);
        if (a2 != null) {
            obj = new C0361k(a2, false);
        }
        u(obj, this.f4099c, null);
    }

    public final void t() {
        a1.d dVar = this.f4070d;
        Throwable th = null;
        w1.g gVar = dVar instanceof w1.g ? (w1.g) dVar : null;
        if (gVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w1.g.f4473h;
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                V.q qVar = w1.a.f4465d;
                if (obj == qVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, qVar, this)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != qVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
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
            k(th);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC0369t.k(this.f4070d));
        sb.append("){");
        Object obj = f4068g.get(this);
        sb.append(obj instanceof Y ? "Active" : obj instanceof C0356f ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0369t.c(this));
        return sb.toString();
    }

    public final void u(Object obj, int i, InterfaceC0192l interfaceC0192l) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4068g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof Y) {
                Object v2 = v((Y) obj2, obj, i, interfaceC0192l);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, v2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!r()) {
                    l();
                }
                m(i);
                return;
            }
            if (obj2 instanceof C0356f) {
                C0356f c0356f = (C0356f) obj2;
                c0356f.getClass();
                if (C0356f.f4072c.compareAndSet(c0356f, 0, 1)) {
                    if (interfaceC0192l != null) {
                        i(interfaceC0192l, c0356f.f4079a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }
}
