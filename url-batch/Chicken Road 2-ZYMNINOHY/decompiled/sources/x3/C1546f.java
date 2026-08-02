package x3;

import c3.C0294f;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import g3.EnumC0441a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o3.InterfaceC1339l;

/* renamed from: x3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1546f extends AbstractC1527B implements InterfaceC1545e, h3.d, p0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16031f = AtomicIntegerFieldUpdater.newUpdater(C1546f.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16032g = AtomicReferenceFieldUpdater.newUpdater(C1546f.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16033h = AtomicReferenceFieldUpdater.newUpdater(C1546f.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0425c f16034d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0430h f16035e;

    public C1546f(int i4, InterfaceC0425c interfaceC0425c) {
        super(i4);
        this.f16034d = interfaceC0425c;
        this.f16035e = interfaceC0425c.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C1542b.f16017a;
    }

    public static Object A(g0 g0Var, Object obj, int i4, InterfaceC1339l interfaceC1339l) {
        if (obj instanceof C1554n) {
            return obj;
        }
        if (i4 != 1 && i4 != 2) {
            return obj;
        }
        if (interfaceC1339l != null || (g0Var instanceof C1530E)) {
            return new C1553m(obj, g0Var instanceof C1530E ? (C1530E) g0Var : null, interfaceC1339l, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void v(g0 g0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + g0Var + ", already has " + obj).toString());
    }

    @Override // x3.p0
    public final void a(C3.t tVar, int i4) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f16031f;
            i5 = atomicIntegerFieldUpdater.get(this);
            if ((i5 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, ((i5 >> 29) << 29) + i4));
        t(tVar);
    }

    @Override // x3.AbstractC1527B
    public final void b(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16032g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof g0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C1554n) {
                return;
            }
            if (!(obj2 instanceof C1553m)) {
                cancellationException2 = cancellationException;
                C1553m c1553m = new C1553m(obj2, (C1530E) null, (InterfaceC1339l) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c1553m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C1553m c1553m2 = (C1553m) obj2;
            if (c1553m2.f16045e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C1553m a3 = C1553m.a(c1553m2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            C1530E c1530e = c1553m2.f16042b;
            if (c1530e != null) {
                j(c1530e);
            }
            InterfaceC1339l interfaceC1339l = c1553m2.f16043c;
            if (interfaceC1339l != null) {
                k(interfaceC1339l, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // x3.InterfaceC1545e
    public final C3.v c(Object obj, InterfaceC1339l interfaceC1339l) {
        C3.v vVar = AbstractC1562w.f16063a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16032g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof g0)) {
                return null;
            }
            Object A4 = A((g0) obj2, obj, this.f15988c, interfaceC1339l);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, A4)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!u()) {
                n();
            }
            return vVar;
        }
    }

    @Override // x3.AbstractC1527B
    public final InterfaceC0425c d() {
        return this.f16034d;
    }

    @Override // x3.AbstractC1527B
    public final Throwable e(Object obj) {
        Throwable e4 = super.e(obj);
        if (e4 != null) {
            return e4;
        }
        return null;
    }

    @Override // x3.AbstractC1527B
    public final Object f(Object obj) {
        return obj instanceof C1553m ? ((C1553m) obj).f16041a : obj;
    }

    @Override // h3.d
    public final h3.d getCallerFrame() {
        InterfaceC0425c interfaceC0425c = this.f16034d;
        if (interfaceC0425c instanceof h3.d) {
            return (h3.d) interfaceC0425c;
        }
        return null;
    }

    @Override // f3.InterfaceC0425c
    public final InterfaceC0430h getContext() {
        return this.f16035e;
    }

    @Override // x3.AbstractC1527B
    public final Object h() {
        return f16032g.get(this);
    }

    @Override // x3.InterfaceC1545e
    public final void i(Object obj) {
        o(this.f15988c);
    }

    public final void j(C1530E c1530e) {
        try {
            c1530e.f15991a.dispose();
        } catch (Throwable th) {
            AbstractC1562w.e(this.f16035e, new G1.a("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    public final void k(InterfaceC1339l interfaceC1339l, Throwable th) {
        try {
            interfaceC1339l.invoke(th);
        } catch (Throwable th2) {
            AbstractC1562w.e(this.f16035e, new G1.a("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(C3.t tVar, Throwable th) {
        InterfaceC0430h interfaceC0430h = this.f16035e;
        int i4 = f16031f.get(this) & 536870911;
        if (i4 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            tVar.g(i4, interfaceC0430h);
        } catch (Throwable th2) {
            AbstractC1562w.e(interfaceC0430h, new G1.a("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16032g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof g0) {
                C1547g c1547g = new C1547g(this, th, (obj instanceof C1530E) || (obj instanceof C3.t));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1547g)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                g0 g0Var = (g0) obj;
                if (g0Var instanceof C1530E) {
                    j((C1530E) obj);
                } else if (g0Var instanceof C3.t) {
                    l((C3.t) obj, th);
                }
                if (!u()) {
                    n();
                }
                o(this.f15988c);
                return;
            }
            return;
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16033h;
        InterfaceC1529D interfaceC1529D = (InterfaceC1529D) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1529D == null) {
            return;
        }
        interfaceC1529D.dispose();
        atomicReferenceFieldUpdater.set(this, f0.f16036a);
    }

    public final void o(int i4) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f16031f;
            i5 = atomicIntegerFieldUpdater.get(this);
            int i6 = i5 >> 29;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i4 == 4;
                InterfaceC0425c interfaceC0425c = this.f16034d;
                if (!z && (interfaceC0425c instanceof C3.h)) {
                    boolean z4 = i4 == 1 || i4 == 2;
                    int i7 = this.f15988c;
                    if (z4 == (i7 == 1 || i7 == 2)) {
                        AbstractC1558s abstractC1558s = ((C3.h) interfaceC0425c).f293d;
                        InterfaceC0430h context = ((C3.h) interfaceC0425c).f294e.getContext();
                        if (abstractC1558s.t()) {
                            abstractC1558s.s(context, this);
                            return;
                        }
                        AbstractC1534I a3 = l0.a();
                        if (a3.f15997c >= 4294967296L) {
                            d3.f fVar = a3.f15999e;
                            if (fVar == null) {
                                fVar = new d3.f();
                                a3.f15999e = fVar;
                            }
                            fVar.addLast(this);
                            return;
                        }
                        a3.w(true);
                        try {
                            AbstractC1562w.i(this, interfaceC0425c, true);
                            do {
                            } while (a3.y());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC1562w.i(this, interfaceC0425c, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 1073741824 + (536870911 & i5)));
    }

    public Throwable p(d0 d0Var) {
        return d0Var.w();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        T t4;
        boolean u4 = u();
        do {
            atomicIntegerFieldUpdater = f16031f;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (u4) {
                    x();
                }
                Object obj = f16032g.get(this);
                if (obj instanceof C1554n) {
                    throw ((C1554n) obj).f16048a;
                }
                int i6 = this.f15988c;
                if ((i6 != 1 && i6 != 2) || (t4 = (T) this.f16035e.n(C1559t.f16059b)) == null || t4.a()) {
                    return f(obj);
                }
                CancellationException w4 = ((d0) t4).w();
                b(obj, w4);
                throw w4;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 536870912 + (536870911 & i4)));
        if (((InterfaceC1529D) f16033h.get(this)) == null) {
            s();
        }
        if (u4) {
            x();
        }
        return EnumC0441a.f9038a;
    }

    public final void r() {
        InterfaceC1529D s4 = s();
        if (s4 == null || (f16032g.get(this) instanceof g0)) {
            return;
        }
        s4.dispose();
        f16033h.set(this, f0.f16036a);
    }

    @Override // f3.InterfaceC0425c
    public final void resumeWith(Object obj) {
        Throwable a3 = C0294f.a(obj);
        if (a3 != null) {
            obj = new C1554n(a3, false);
        }
        z(obj, this.f15988c, null);
    }

    public final InterfaceC1529D s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        T t4 = (T) this.f16035e.n(C1559t.f16059b);
        if (t4 == null) {
            return null;
        }
        InterfaceC1529D f4 = AbstractC1562w.f(t4, true, new C1548h(this), 2);
        do {
            atomicReferenceFieldUpdater = f16033h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, f4)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return f4;
    }

    public final void t(g0 g0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16032g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C1542b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            boolean z = true;
            if (obj instanceof C1530E ? true : obj instanceof C3.t) {
                v(g0Var, obj);
                throw null;
            }
            if (obj instanceof C1554n) {
                C1554n c1554n = (C1554n) obj;
                c1554n.getClass();
                if (!C1554n.f16047b.compareAndSet(c1554n, 0, 1)) {
                    v(g0Var, obj);
                    throw null;
                }
                if (obj instanceof C1547g) {
                    if (obj == null) {
                        c1554n = null;
                    }
                    Throwable th = c1554n != null ? c1554n.f16048a : null;
                    if (g0Var instanceof C1530E) {
                        j((C1530E) g0Var);
                        return;
                    } else {
                        l((C3.t) g0Var, th);
                        return;
                    }
                }
                return;
            }
            if (obj instanceof C1553m) {
                C1553m c1553m = (C1553m) obj;
                if (c1553m.f16042b != null) {
                    v(g0Var, obj);
                    throw null;
                }
                if (g0Var instanceof C3.t) {
                    return;
                }
                C1530E c1530e = (C1530E) g0Var;
                if (c1553m.f16045e != null) {
                    j(c1530e);
                    return;
                }
                C1553m a3 = C1553m.a(c1553m, c1530e, null, 29);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, a3)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                if (g0Var instanceof C3.t) {
                    return;
                }
                C1553m c1553m2 = new C1553m(obj, (C1530E) g0Var, (InterfaceC1339l) null, (CancellationException) null, 28);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c1553m2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(w());
        sb.append('(');
        sb.append(AbstractC1562w.k(this.f16034d));
        sb.append("){");
        Object obj = f16032g.get(this);
        sb.append(obj instanceof g0 ? "Active" : obj instanceof C1547g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC1562w.c(this));
        return sb.toString();
    }

    public final boolean u() {
        if (this.f15988c != 2) {
            return false;
        }
        InterfaceC0425c interfaceC0425c = this.f16034d;
        kotlin.jvm.internal.i.c(interfaceC0425c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return C3.h.f292h.get((C3.h) interfaceC0425c) != null;
    }

    public String w() {
        return "CancellableContinuation";
    }

    public final void x() {
        InterfaceC0425c interfaceC0425c = this.f16034d;
        Throwable th = null;
        C3.h hVar = interfaceC0425c instanceof C3.h ? (C3.h) interfaceC0425c : null;
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3.h.f292h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                C3.v vVar = C3.a.f282d;
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

    public final void y(Object obj, InterfaceC1339l interfaceC1339l) {
        z(obj, this.f15988c, interfaceC1339l);
    }

    public final void z(Object obj, int i4, InterfaceC1339l interfaceC1339l) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16032g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof g0) {
                Object A4 = A((g0) obj2, obj, i4, interfaceC1339l);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, A4)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!u()) {
                    n();
                }
                o(i4);
                return;
            }
            if (obj2 instanceof C1547g) {
                C1547g c1547g = (C1547g) obj2;
                c1547g.getClass();
                if (C1547g.f16037c.compareAndSet(c1547g, 0, 1)) {
                    if (interfaceC1339l != null) {
                        k(interfaceC1339l, c1547g.f16048a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }
}
