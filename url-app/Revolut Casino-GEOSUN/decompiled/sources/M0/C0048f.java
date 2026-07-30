package M0;

import R0.AbstractC0068a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u0.AbstractC0244d;

/* renamed from: M0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0048f extends A implements InterfaceC0047e, y0.c, l0 {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f658j = AtomicIntegerFieldUpdater.newUpdater(C0048f.class, "_decisionAndIndex");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f659k = AtomicReferenceFieldUpdater.newUpdater(C0048f.class, Object.class, "_state");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f660l = AtomicReferenceFieldUpdater.newUpdater(C0048f.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: h, reason: collision with root package name */
    public final w0.d f661h;

    /* renamed from: i, reason: collision with root package name */
    public final w0.i f662i;

    public C0048f(int i2, w0.d dVar) {
        super(i2);
        this.f661h = dVar;
        this.f662i = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C0044b.f653e;
    }

    public static Object B(c0 c0Var, Object obj, int i2, E0.l lVar) {
        if ((obj instanceof C0056n) || !AbstractC0063v.f(i2)) {
            return obj;
        }
        if (lVar != null || (c0Var instanceof D)) {
            return new C0055m(obj, c0Var instanceof D ? (D) c0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(c0 c0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + c0Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i2, E0.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f659k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof c0) {
                Object B2 = B((c0) obj2, obj, i2, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, B2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    p();
                }
                q(i2);
                return;
            }
            if (obj2 instanceof C0049g) {
                C0049g c0049g = (C0049g) obj2;
                c0049g.getClass();
                if (C0049g.f663c.compareAndSet(c0049g, 0, 1)) {
                    if (lVar != null) {
                        m(lVar, c0049g.f676a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // M0.l0
    public final void a(R0.v vVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f658j;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        v(vVar);
    }

    @Override // M0.A
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f659k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof c0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0056n) {
                return;
            }
            if (!(obj2 instanceof C0055m)) {
                C0055m c0055m = new C0055m(obj2, (D) null, (E0.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0055m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0055m c0055m2 = (C0055m) obj2;
            if (c0055m2.f674e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0055m a2 = C0055m.a(c0055m2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            D d2 = c0055m2.f671b;
            if (d2 != null) {
                l(d2, cancellationException);
            }
            E0.l lVar = c0055m2.f672c;
            if (lVar != null) {
                m(lVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // M0.InterfaceC0047e
    public final void c(Object obj, E0.l lVar) {
        A(obj, this.f615g, lVar);
    }

    @Override // M0.A
    public final w0.d d() {
        return this.f661h;
    }

    @Override // M0.InterfaceC0047e
    public final A.j e(Object obj, E0.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f659k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof c0;
            A.j jVar = AbstractC0063v.f688a;
            if (!z2) {
                boolean z3 = obj2 instanceof C0055m;
                return null;
            }
            Object B2 = B((c0) obj2, obj, this.f615g, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, B2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (w()) {
                return jVar;
            }
            p();
            return jVar;
        }
    }

    @Override // M0.A
    public final Throwable f(Object obj) {
        Throwable f2 = super.f(obj);
        if (f2 != null) {
            return f2;
        }
        return null;
    }

    @Override // y0.c
    public final y0.c g() {
        w0.d dVar = this.f661h;
        if (dVar instanceof y0.c) {
            return (y0.c) dVar;
        }
        return null;
    }

    @Override // w0.d
    public final w0.i getContext() {
        return this.f662i;
    }

    @Override // M0.A
    public final Object h(Object obj) {
        return obj instanceof C0055m ? ((C0055m) obj).f670a : obj;
    }

    @Override // M0.InterfaceC0047e
    public final void j(Object obj) {
        q(this.f615g);
    }

    @Override // M0.A
    public final Object k() {
        return f659k.get(this);
    }

    public final void l(D d2, Throwable th) {
        try {
            d2.a(th);
        } catch (Throwable th2) {
            AbstractC0063v.d(new M.c("Exception in invokeOnCancellation handler for " + this, th2), this.f662i);
        }
    }

    public final void m(E0.l lVar, Throwable th) {
        try {
            lVar.i(th);
        } catch (Throwable th2) {
            AbstractC0063v.d(new M.c("Exception in resume onCancellation handler for " + this, th2), this.f662i);
        }
    }

    public final void n(R0.v vVar, Throwable th) {
        w0.i iVar = this.f662i;
        int i2 = f658j.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            vVar.g(i2, iVar);
        } catch (Throwable th2) {
            AbstractC0063v.d(new M.c("Exception in invokeOnCancellation handler for " + this, th2), iVar);
        }
    }

    public final void o(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f659k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof c0) {
                C0049g c0049g = new C0049g(this, th, (obj instanceof D) || (obj instanceof R0.v));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0049g)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                c0 c0Var = (c0) obj;
                if (c0Var instanceof D) {
                    l((D) obj, th);
                } else if (c0Var instanceof R0.v) {
                    n((R0.v) obj, th);
                }
                if (!w()) {
                    p();
                }
                q(this.f615g);
                return;
            }
            return;
        }
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f660l;
        C c2 = (C) atomicReferenceFieldUpdater.get(this);
        if (c2 == null) {
            return;
        }
        c2.a();
        atomicReferenceFieldUpdater.set(this, b0.f654e);
    }

    public final void q(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f658j;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i2 == 4;
                w0.d dVar = this.f661h;
                if (z2 || !(dVar instanceof R0.h) || AbstractC0063v.f(i2) != AbstractC0063v.f(this.f615g)) {
                    AbstractC0063v.i(this, dVar, z2);
                    return;
                }
                AbstractC0060s abstractC0060s = ((R0.h) dVar).f907h;
                w0.i context = ((R0.h) dVar).f908i.getContext();
                if (abstractC0060s.d()) {
                    abstractC0060s.c(context, this);
                    return;
                }
                H a2 = h0.a();
                if (a2.f624g >= 4294967296L) {
                    v0.b bVar = a2.f626i;
                    if (bVar == null) {
                        bVar = new v0.b();
                        a2.f626i = bVar;
                    }
                    bVar.addLast(this);
                    return;
                }
                a2.j(true);
                try {
                    AbstractC0063v.i(this, dVar, true);
                    do {
                    } while (a2.m());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public Throwable r(Z z2) {
        return z2.y();
    }

    @Override // w0.d
    public final void resumeWith(Object obj) {
        Throwable a2 = AbstractC0244d.a(obj);
        if (a2 != null) {
            obj = new C0056n(a2, false);
        }
        A(obj, this.f615g, null);
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean w2 = w();
        do {
            atomicIntegerFieldUpdater = f658j;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (w2) {
                    z();
                }
                Object obj = f659k.get(this);
                if (obj instanceof C0056n) {
                    throw ((C0056n) obj).f676a;
                }
                if (AbstractC0063v.f(this.f615g)) {
                    P p2 = (P) this.f662i.f(C0061t.f687f);
                    if (p2 != null && !p2.b()) {
                        CancellationException y2 = ((Z) p2).y();
                        b(obj, y2);
                        throw y2;
                    }
                }
                return h(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((C) f660l.get(this)) == null) {
            u();
        }
        if (w2) {
            z();
        }
        return x0.a.f3094e;
    }

    public final void t() {
        C u2 = u();
        if (u2 == null || (f659k.get(this) instanceof c0)) {
            return;
        }
        u2.a();
        f660l.set(this, b0.f654e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(AbstractC0063v.k(this.f661h));
        sb.append("){");
        Object obj = f659k.get(this);
        sb.append(obj instanceof c0 ? "Active" : obj instanceof C0049g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0063v.b(this));
        return sb.toString();
    }

    public final C u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        P p2 = (P) this.f662i.f(C0061t.f687f);
        if (p2 == null) {
            return null;
        }
        C e2 = AbstractC0063v.e(p2, true, new C0050h(this), 2);
        do {
            atomicReferenceFieldUpdater = f660l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, e2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return e2;
    }

    public final void v(c0 c0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f659k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0044b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof D ? true : obj instanceof R0.v) {
                x(c0Var, obj);
                throw null;
            }
            if (obj instanceof C0056n) {
                C0056n c0056n = (C0056n) obj;
                c0056n.getClass();
                if (!C0056n.f675b.compareAndSet(c0056n, 0, 1)) {
                    x(c0Var, obj);
                    throw null;
                }
                if (obj instanceof C0049g) {
                    if (!(obj instanceof C0056n)) {
                        c0056n = null;
                    }
                    Throwable th = c0056n != null ? c0056n.f676a : null;
                    if (c0Var instanceof D) {
                        l((D) c0Var, th);
                        return;
                    } else {
                        F0.i.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        n((R0.v) c0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0055m)) {
                if (c0Var instanceof R0.v) {
                    return;
                }
                F0.i.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0055m c0055m = new C0055m(obj, (D) c0Var, (E0.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0055m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0055m c0055m2 = (C0055m) obj;
            if (c0055m2.f671b != null) {
                x(c0Var, obj);
                throw null;
            }
            if (c0Var instanceof R0.v) {
                return;
            }
            F0.i.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            D d2 = (D) c0Var;
            Throwable th2 = c0055m2.f674e;
            if (th2 != null) {
                l(d2, th2);
                return;
            }
            C0055m a2 = C0055m.a(c0055m2, d2, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean w() {
        if (this.f615g == 2) {
            w0.d dVar = this.f661h;
            F0.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (R0.h.f906l.get((R0.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        w0.d dVar = this.f661h;
        Throwable th = null;
        R0.h hVar = dVar instanceof R0.h ? (R0.h) dVar : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R0.h.f906l;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                A.j jVar = AbstractC0068a.f896d;
                if (obj == jVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, jVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != jVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            p();
            o(th);
        }
    }
}
