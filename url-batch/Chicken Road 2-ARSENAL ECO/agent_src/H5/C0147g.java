package H5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k5.AbstractC0479i;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;
import p5.EnumC0580a;
import x5.InterfaceC0743l;

/* renamed from: H5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0147g extends E implements InterfaceC0146f, q5.d, x0 {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1075k = AtomicIntegerFieldUpdater.newUpdater(C0147g.class, "_decisionAndIndex");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1076l = AtomicReferenceFieldUpdater.newUpdater(C0147g.class, Object.class, "_state");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1077m = AtomicReferenceFieldUpdater.newUpdater(C0147g.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0564d f1078i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0569i f1079j;

    public C0147g(int i7, InterfaceC0564d interfaceC0564d) {
        super(i7);
        this.f1078i = interfaceC0564d;
        this.f1079j = interfaceC0564d.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C0142b.f1055f;
    }

    public static Object C(k0 k0Var, Object obj, int i7, InterfaceC0743l interfaceC0743l) {
        if (obj instanceof C0156p) {
            return obj;
        }
        if (i7 != 1 && i7 != 2) {
            return obj;
        }
        if (interfaceC0743l != null || (k0Var instanceof C0145e)) {
            return new C0155o(obj, k0Var instanceof C0145e ? (C0145e) k0Var : null, interfaceC0743l, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void w(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A(Object obj, int i7, InterfaceC0743l interfaceC0743l) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1076l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof k0) {
                Object C6 = C((k0) obj2, obj, i7, interfaceC0743l);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C6)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!v()) {
                    n();
                }
                o(i7);
                return;
            }
            if (obj2 instanceof C0148h) {
                C0148h c0148h = (C0148h) obj2;
                c0148h.getClass();
                if (C0148h.f1082c.compareAndSet(c0148h, 0, 1)) {
                    if (interfaceC0743l != null) {
                        k(interfaceC0743l, c0148h.f1093a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(AbstractC0161v abstractC0161v) {
        InterfaceC0564d interfaceC0564d = this.f1078i;
        M5.h hVar = interfaceC0564d instanceof M5.h ? (M5.h) interfaceC0564d : null;
        A(k5.v.f5219a, (hVar != null ? hVar.f1596i : null) == abstractC0161v ? 4 : this.f1026h, null);
    }

    @Override // H5.x0
    public final void a(M5.t tVar, int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        do {
            atomicIntegerFieldUpdater = f1075k;
            i8 = atomicIntegerFieldUpdater.get(this);
            if ((i8 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, ((i8 >> 29) << 29) + i7));
        u(tVar);
    }

    @Override // H5.E
    public final void b(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1076l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof k0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0156p) {
                return;
            }
            if (!(obj2 instanceof C0155o)) {
                cancellationException2 = cancellationException;
                C0155o c0155o = new C0155o(obj2, (C0145e) null, (InterfaceC0743l) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0155o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0155o c0155o2 = (C0155o) obj2;
            if (c0155o2.f1091e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0155o a7 = C0155o.a(c0155o2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a7)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            C0145e c0145e = c0155o2.f1088b;
            if (c0145e != null) {
                j(c0145e, cancellationException);
            }
            InterfaceC0743l interfaceC0743l = c0155o2.f1089c;
            if (interfaceC0743l != null) {
                k(interfaceC0743l, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // H5.E
    public final InterfaceC0564d c() {
        return this.f1078i;
    }

    @Override // H5.E
    public final Throwable d(Object obj) {
        Throwable d7 = super.d(obj);
        if (d7 != null) {
            return d7;
        }
        return null;
    }

    @Override // H5.E
    public final Object e(Object obj) {
        return obj instanceof C0155o ? ((C0155o) obj).f1087a : obj;
    }

    @Override // H5.InterfaceC0146f
    public final M5.v f(Object obj, InterfaceC0743l interfaceC0743l) {
        M5.v vVar = AbstractC0165z.f1114a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1076l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof k0)) {
                return null;
            }
            Object C6 = C((k0) obj2, obj, this.f1026h, interfaceC0743l);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C6)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!v()) {
                n();
            }
            return vVar;
        }
    }

    @Override // q5.d
    public final q5.d getCallerFrame() {
        InterfaceC0564d interfaceC0564d = this.f1078i;
        if (interfaceC0564d instanceof q5.d) {
            return (q5.d) interfaceC0564d;
        }
        return null;
    }

    @Override // o5.InterfaceC0564d
    public final InterfaceC0569i getContext() {
        return this.f1079j;
    }

    @Override // H5.E
    public final Object h() {
        return f1076l.get(this);
    }

    @Override // H5.InterfaceC0146f
    public final void i(Object obj) {
        o(this.f1026h);
    }

    public final void j(C0145e c0145e, Throwable th) {
        try {
            c0145e.a(th);
        } catch (Throwable th2) {
            AbstractC0165z.i(this.f1079j, new r("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(InterfaceC0743l interfaceC0743l, Throwable th) {
        try {
            interfaceC0743l.invoke(th);
        } catch (Throwable th2) {
            AbstractC0165z.i(this.f1079j, new r("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(M5.t tVar, Throwable th) {
        InterfaceC0569i interfaceC0569i = this.f1079j;
        int i7 = f1075k.get(this) & 536870911;
        if (i7 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            tVar.g(i7, interfaceC0569i);
        } catch (Throwable th2) {
            AbstractC0165z.i(interfaceC0569i, new r("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1076l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof k0)) {
                return false;
            }
            C0148h c0148h = new C0148h(this, th, (obj instanceof C0145e) || (obj instanceof M5.t));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0148h)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            k0 k0Var = (k0) obj;
            if (k0Var instanceof C0145e) {
                j((C0145e) obj, th);
            } else if (k0Var instanceof M5.t) {
                l((M5.t) obj, th);
            }
            if (!v()) {
                n();
            }
            o(this.f1026h);
            return true;
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1077m;
        H h7 = (H) atomicReferenceFieldUpdater.get(this);
        if (h7 == null) {
            return;
        }
        h7.b();
        atomicReferenceFieldUpdater.set(this, j0.f1085f);
    }

    public final void o(int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        do {
            atomicIntegerFieldUpdater = f1075k;
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z5 = i7 == 4;
                InterfaceC0564d interfaceC0564d = this.f1078i;
                if (!z5 && (interfaceC0564d instanceof M5.h)) {
                    boolean z6 = i7 == 1 || i7 == 2;
                    int i10 = this.f1026h;
                    if (z6 == (i10 == 1 || i10 == 2)) {
                        AbstractC0161v abstractC0161v = ((M5.h) interfaceC0564d).f1596i;
                        InterfaceC0569i context = ((M5.h) interfaceC0564d).f1597j.getContext();
                        if (abstractC0161v.H()) {
                            abstractC0161v.F(context, this);
                            return;
                        }
                        P a7 = p0.a();
                        if (a7.f1044h >= 4294967296L) {
                            a7.J(this);
                            return;
                        }
                        a7.L(true);
                        try {
                            AbstractC0165z.n(this, interfaceC0564d, true);
                            do {
                            } while (a7.N());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC0165z.n(this, interfaceC0564d, z5);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
    }

    public Throwable p(g0 g0Var) {
        return g0Var.w();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        X x6;
        boolean v5 = v();
        do {
            atomicIntegerFieldUpdater = f1075k;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (v5) {
                    y();
                }
                Object obj = f1076l.get(this);
                if (obj instanceof C0156p) {
                    throw ((C0156p) obj).f1093a;
                }
                int i9 = this.f1026h;
                if ((i9 != 1 && i9 != 2) || (x6 = (X) this.f1079j.m(C0162w.f1110g)) == null || x6.a()) {
                    return e(obj);
                }
                CancellationException w5 = ((g0) x6).w();
                b(obj, w5);
                throw w5;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        if (((H) f1077m.get(this)) == null) {
            s();
        }
        if (v5) {
            y();
        }
        return EnumC0580a.f5697f;
    }

    public final void r() {
        H s6 = s();
        if (s6 == null || (f1076l.get(this) instanceof k0)) {
            return;
        }
        s6.b();
        f1077m.set(this, j0.f1085f);
    }

    @Override // o5.InterfaceC0564d
    public final void resumeWith(Object obj) {
        Throwable a7 = AbstractC0479i.a(obj);
        if (a7 != null) {
            obj = new C0156p(a7, false);
        }
        A(obj, this.f1026h, null);
    }

    public final H s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        X x6 = (X) this.f1079j.m(C0162w.f1110g);
        if (x6 == null) {
            return null;
        }
        H j4 = AbstractC0165z.j(x6, new C0149i(this), 2);
        do {
            atomicReferenceFieldUpdater = f1077m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, j4)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return j4;
    }

    public final void t(InterfaceC0743l interfaceC0743l) {
        u(interfaceC0743l instanceof C0145e ? (C0145e) interfaceC0743l : new C0145e(2, interfaceC0743l));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(AbstractC0165z.q(this.f1078i));
        sb.append("){");
        Object obj = f1076l.get(this);
        sb.append(obj instanceof k0 ? "Active" : obj instanceof C0148h ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0165z.g(this));
        return sb.toString();
    }

    public final void u(k0 k0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1076l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0142b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            boolean z5 = true;
            if (obj instanceof C0145e ? true : obj instanceof M5.t) {
                w(k0Var, obj);
                throw null;
            }
            if (obj instanceof C0156p) {
                C0156p c0156p = (C0156p) obj;
                c0156p.getClass();
                if (!C0156p.f1092b.compareAndSet(c0156p, 0, 1)) {
                    w(k0Var, obj);
                    throw null;
                }
                if (obj instanceof C0148h) {
                    if (obj == null) {
                        c0156p = null;
                    }
                    Throwable th = c0156p != null ? c0156p.f1093a : null;
                    if (k0Var instanceof C0145e) {
                        j((C0145e) k0Var, th);
                        return;
                    } else {
                        kotlin.jvm.internal.i.c(k0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        l((M5.t) k0Var, th);
                        return;
                    }
                }
                return;
            }
            if (obj instanceof C0155o) {
                C0155o c0155o = (C0155o) obj;
                if (c0155o.f1088b != null) {
                    w(k0Var, obj);
                    throw null;
                }
                if (k0Var instanceof M5.t) {
                    return;
                }
                kotlin.jvm.internal.i.c(k0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0145e c0145e = (C0145e) k0Var;
                Throwable th2 = c0155o.f1091e;
                if (th2 != null) {
                    j(c0145e, th2);
                    return;
                }
                C0155o a7 = C0155o.a(c0155o, c0145e, null, 29);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, a7)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z5 = false;
                        break;
                    }
                }
                if (z5) {
                    return;
                }
            } else {
                if (k0Var instanceof M5.t) {
                    return;
                }
                kotlin.jvm.internal.i.c(k0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0155o c0155o2 = new C0155o(obj, (C0145e) k0Var, (InterfaceC0743l) null, (CancellationException) null, 28);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0155o2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z5 = false;
                        break;
                    }
                }
                if (z5) {
                    return;
                }
            }
        }
    }

    public final boolean v() {
        if (this.f1026h != 2) {
            return false;
        }
        InterfaceC0564d interfaceC0564d = this.f1078i;
        kotlin.jvm.internal.i.c(interfaceC0564d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return M5.h.f1595m.get((M5.h) interfaceC0564d) != null;
    }

    public String x() {
        return "CancellableContinuation";
    }

    public final void y() {
        InterfaceC0564d interfaceC0564d = this.f1078i;
        Throwable th = null;
        M5.h hVar = interfaceC0564d instanceof M5.h ? (M5.h) interfaceC0564d : null;
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = M5.h.f1595m;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                M5.v vVar = M5.a.f1585d;
                if (obj == vVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, vVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != vVar) {
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
            n();
            m(th);
        }
    }

    public final void z(Object obj, InterfaceC0743l interfaceC0743l) {
        A(obj, this.f1026h, interfaceC0743l);
    }
}
