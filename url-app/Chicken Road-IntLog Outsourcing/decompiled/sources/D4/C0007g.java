package D4;

import G0.C0051a;
import f4.AbstractC0432i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import l4.EnumC1260a;
import t4.InterfaceC1441l;

/* renamed from: D4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0007g extends D implements InterfaceC0006f, m4.d, x0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f508f = AtomicIntegerFieldUpdater.newUpdater(C0007g.class, "_decisionAndIndex");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f509g = AtomicReferenceFieldUpdater.newUpdater(C0007g.class, Object.class, "_state");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f510h = AtomicReferenceFieldUpdater.newUpdater(C0007g.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1218d f511d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1223i f512e;

    public C0007g(int i2, InterfaceC1218d interfaceC1218d) {
        super(i2);
        this.f511d = interfaceC1218d;
        this.f512e = interfaceC1218d.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C0002b.f488a;
    }

    public static Object C(k0 k0Var, Object obj, int i2, InterfaceC1441l interfaceC1441l) {
        if ((obj instanceof C0016p) || !AbstractC0024y.m(i2)) {
            return obj;
        }
        if (interfaceC1441l != null || (k0Var instanceof C0005e)) {
            return new C0015o(obj, k0Var instanceof C0005e ? (C0005e) k0Var : null, interfaceC1441l, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(k0 k0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + k0Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i2, InterfaceC1441l interfaceC1441l) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f509g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof k0) {
                Object C2 = C((k0) obj2, obj, i2, interfaceC1441l);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    o();
                }
                p(i2);
                return;
            }
            if (obj2 instanceof C0008h) {
                C0008h c0008h = (C0008h) obj2;
                c0008h.getClass();
                if (C0008h.f515c.compareAndSet(c0008h, 0, 1)) {
                    if (interfaceC1441l != null) {
                        l(interfaceC1441l, c0008h.f526a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(AbstractC0020u abstractC0020u) {
        f4.v vVar = f4.v.f5689a;
        InterfaceC1218d interfaceC1218d = this.f511d;
        I4.h hVar = interfaceC1218d instanceof I4.h ? (I4.h) interfaceC1218d : null;
        A(vVar, (hVar != null ? hVar.f1294d : null) == abstractC0020u ? 4 : this.f458c, null);
    }

    @Override // D4.x0
    public final void a(I4.u uVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f508f;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        v(uVar);
    }

    @Override // D4.D
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f509g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof k0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0016p) {
                return;
            }
            if (!(obj2 instanceof C0015o)) {
                C0015o c0015o = new C0015o(obj2, (C0005e) null, (InterfaceC1441l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0015o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0015o c0015o2 = (C0015o) obj2;
            if (c0015o2.f524e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0015o a6 = C0015o.a(c0015o2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a6)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            C0005e c0005e = c0015o2.f521b;
            if (c0005e != null) {
                k(c0005e, cancellationException);
            }
            InterfaceC1441l interfaceC1441l = c0015o2.f522c;
            if (interfaceC1441l != null) {
                l(interfaceC1441l, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // D4.D
    public final InterfaceC1218d c() {
        return this.f511d;
    }

    @Override // D4.InterfaceC0006f
    public final C0051a d(Object obj, InterfaceC1441l interfaceC1441l) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f509g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z = obj2 instanceof k0;
            C0051a c0051a = AbstractC0024y.f548a;
            if (!z) {
                boolean z5 = obj2 instanceof C0015o;
                return null;
            }
            Object C2 = C((k0) obj2, obj, this.f458c, interfaceC1441l);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (w()) {
                return c0051a;
            }
            o();
            return c0051a;
        }
    }

    @Override // D4.D
    public final Throwable e(Object obj) {
        Throwable e3 = super.e(obj);
        if (e3 != null) {
            return e3;
        }
        return null;
    }

    @Override // D4.InterfaceC0006f
    public final void f(Object obj, InterfaceC1441l interfaceC1441l) {
        A(obj, this.f458c, interfaceC1441l);
    }

    @Override // D4.D
    public final Object g(Object obj) {
        return obj instanceof C0015o ? ((C0015o) obj).f520a : obj;
    }

    @Override // m4.d
    public final m4.d getCallerFrame() {
        InterfaceC1218d interfaceC1218d = this.f511d;
        if (interfaceC1218d instanceof m4.d) {
            return (m4.d) interfaceC1218d;
        }
        return null;
    }

    @Override // k4.InterfaceC1218d
    public final InterfaceC1223i getContext() {
        return this.f512e;
    }

    @Override // D4.D
    public final Object i() {
        return f509g.get(this);
    }

    @Override // D4.InterfaceC0006f
    public final void j(Object obj) {
        p(this.f458c);
    }

    public final void k(C0005e c0005e, Throwable th) {
        try {
            c0005e.a(th);
        } catch (Throwable th2) {
            AbstractC0024y.j(new C1.b("Exception in invokeOnCancellation handler for " + this, th2), this.f512e);
        }
    }

    public final void l(InterfaceC1441l interfaceC1441l, Throwable th) {
        try {
            interfaceC1441l.invoke(th);
        } catch (Throwable th2) {
            AbstractC0024y.j(new C1.b("Exception in resume onCancellation handler for " + this, th2), this.f512e);
        }
    }

    public final void m(I4.u uVar, Throwable th) {
        InterfaceC1223i interfaceC1223i = this.f512e;
        int i2 = f508f.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            uVar.g(i2, interfaceC1223i);
        } catch (Throwable th2) {
            AbstractC0024y.j(new C1.b("Exception in invokeOnCancellation handler for " + this, th2), interfaceC1223i);
        }
    }

    public final boolean n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f509g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof k0)) {
                return false;
            }
            C0008h c0008h = new C0008h(this, th, (obj instanceof C0005e) || (obj instanceof I4.u));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0008h)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            k0 k0Var = (k0) obj;
            if (k0Var instanceof C0005e) {
                k((C0005e) obj, th);
            } else if (k0Var instanceof I4.u) {
                m((I4.u) obj, th);
            }
            if (!w()) {
                o();
            }
            p(this.f458c);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f510h;
        G g6 = (G) atomicReferenceFieldUpdater.get(this);
        if (g6 == null) {
            return;
        }
        g6.b();
        atomicReferenceFieldUpdater.set(this, j0.f518a);
    }

    public final void p(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f508f;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i6 = i3 >> 29;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i2 == 4;
                InterfaceC1218d interfaceC1218d = this.f511d;
                if (z || !(interfaceC1218d instanceof I4.h) || AbstractC0024y.m(i2) != AbstractC0024y.m(this.f458c)) {
                    AbstractC0024y.p(this, interfaceC1218d, z);
                    return;
                }
                AbstractC0020u abstractC0020u = ((I4.h) interfaceC1218d).f1294d;
                InterfaceC1223i context = ((I4.h) interfaceC1218d).f1295e.getContext();
                if (abstractC0020u.E()) {
                    abstractC0020u.C(context, this);
                    return;
                }
                O a6 = p0.a();
                if (a6.J()) {
                    a6.G(this);
                    return;
                }
                a6.I(true);
                try {
                    AbstractC0024y.p(this, interfaceC1218d, true);
                    do {
                    } while (a6.L());
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

    public Throwable q(g0 g0Var) {
        return g0Var.x();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean w3 = w();
        do {
            atomicIntegerFieldUpdater = f508f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (w3) {
                    z();
                }
                Object obj = f509g.get(this);
                if (obj instanceof C0016p) {
                    throw ((C0016p) obj).f526a;
                }
                if (AbstractC0024y.m(this.f458c)) {
                    X x5 = (X) this.f512e.o(C0021v.f545b);
                    if (x5 != null && !x5.a()) {
                        CancellationException x6 = ((g0) x5).x();
                        b(obj, x6);
                        throw x6;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((G) f510h.get(this)) == null) {
            t();
        }
        if (w3) {
            z();
        }
        return EnumC1260a.f11058a;
    }

    @Override // k4.InterfaceC1218d
    public final void resumeWith(Object obj) {
        Throwable a6 = AbstractC0432i.a(obj);
        if (a6 != null) {
            obj = new C0016p(a6, false);
        }
        A(obj, this.f458c, null);
    }

    public final void s() {
        G t5 = t();
        if (t5 == null || (f509g.get(this) instanceof k0)) {
            return;
        }
        t5.b();
        f510h.set(this, j0.f518a);
    }

    public final G t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        X x5 = (X) this.f512e.o(C0021v.f545b);
        if (x5 == null) {
            return null;
        }
        G k3 = AbstractC0024y.k(x5, true, new C0009i(this), 2);
        do {
            atomicReferenceFieldUpdater = f510h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, k3)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return k3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(AbstractC0024y.t(this.f511d));
        sb.append("){");
        Object obj = f509g.get(this);
        sb.append(obj instanceof k0 ? "Active" : obj instanceof C0008h ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0024y.h(this));
        return sb.toString();
    }

    public final void u(InterfaceC1441l interfaceC1441l) {
        v(interfaceC1441l instanceof C0005e ? (C0005e) interfaceC1441l : new C0005e(2, interfaceC1441l));
    }

    public final void v(k0 k0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f509g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0002b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof C0005e ? true : obj instanceof I4.u) {
                x(k0Var, obj);
                throw null;
            }
            if (obj instanceof C0016p) {
                C0016p c0016p = (C0016p) obj;
                c0016p.getClass();
                if (!C0016p.f525b.compareAndSet(c0016p, 0, 1)) {
                    x(k0Var, obj);
                    throw null;
                }
                if (obj instanceof C0008h) {
                    if (!(obj instanceof C0016p)) {
                        c0016p = null;
                    }
                    Throwable th = c0016p != null ? c0016p.f526a : null;
                    if (k0Var instanceof C0005e) {
                        k((C0005e) k0Var, th);
                        return;
                    } else {
                        kotlin.jvm.internal.i.c(k0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        m((I4.u) k0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0015o)) {
                if (k0Var instanceof I4.u) {
                    return;
                }
                kotlin.jvm.internal.i.c(k0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0015o c0015o = new C0015o(obj, (C0005e) k0Var, (InterfaceC1441l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0015o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0015o c0015o2 = (C0015o) obj;
            if (c0015o2.f521b != null) {
                x(k0Var, obj);
                throw null;
            }
            if (k0Var instanceof I4.u) {
                return;
            }
            kotlin.jvm.internal.i.c(k0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            C0005e c0005e = (C0005e) k0Var;
            Throwable th2 = c0015o2.f524e;
            if (th2 != null) {
                k(c0005e, th2);
                return;
            }
            C0015o a6 = C0015o.a(c0015o2, c0005e, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a6)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean w() {
        if (this.f458c == 2) {
            InterfaceC1218d interfaceC1218d = this.f511d;
            kotlin.jvm.internal.i.c(interfaceC1218d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (I4.h.f1293h.get((I4.h) interfaceC1218d) != null) {
                return true;
            }
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        InterfaceC1218d interfaceC1218d = this.f511d;
        Throwable th = null;
        I4.h hVar = interfaceC1218d instanceof I4.h ? (I4.h) interfaceC1218d : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I4.h.f1293h;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                C0051a c0051a = I4.a.f1283d;
                if (obj == c0051a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, c0051a, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != c0051a) {
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
            o();
            n(th);
        }
    }
}
