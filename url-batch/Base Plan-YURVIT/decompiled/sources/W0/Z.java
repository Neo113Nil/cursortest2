package W0;

import a.AbstractC0086a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class Z implements P, d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f939e = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_state");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f940f = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public Z(boolean z2) {
        this._state = z2 ? AbstractC0081v.f983i : AbstractC0081v.f982h;
    }

    public static C0070j L(b1.l lVar) {
        while (lVar.n()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1.l.f1762f;
            b1.l f2 = lVar.f();
            if (f2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(lVar);
                while (true) {
                    lVar = (b1.l) obj;
                    if (!lVar.n()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVar);
                }
            } else {
                lVar = f2;
            }
        }
        while (true) {
            lVar = lVar.m();
            if (!lVar.n()) {
                if (lVar instanceof C0070j) {
                    return (C0070j) lVar;
                }
                if (lVar instanceof a0) {
                    return null;
                }
            }
        }
    }

    public static String R(Object obj) {
        if (!(obj instanceof X)) {
            return obj instanceof L ? ((L) obj).a() ? "Active" : "New" : obj instanceof C0074n ? "Cancelled" : "Completed";
        }
        X x2 = (X) obj;
        return x2.d() ? "Cancelling" : x2.f() ? "Completing" : "Active";
    }

    public boolean A() {
        return true;
    }

    public boolean B() {
        return this instanceof C0072l;
    }

    public final a0 C(L l2) {
        a0 e2 = l2.e();
        if (e2 != null) {
            return e2;
        }
        if (l2 instanceof E) {
            return new a0();
        }
        if (l2 instanceof U) {
            P((U) l2);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + l2).toString());
    }

    public final Object D() {
        while (true) {
            Object obj = f939e.get(this);
            if (!(obj instanceof b1.r)) {
                return obj;
            }
            ((b1.r) obj).a(this);
        }
    }

    public boolean E(Throwable th) {
        return false;
    }

    public final void G(P p2) {
        int Q2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f940f;
        b0 b0Var = b0.f943e;
        if (p2 == null) {
            atomicReferenceFieldUpdater.set(this, b0Var);
            return;
        }
        Z z2 = (Z) p2;
        do {
            Q2 = z2.Q(z2.D());
            if (Q2 == 0) {
                break;
            }
        } while (Q2 != 1);
        InterfaceC0069i interfaceC0069i = (InterfaceC0069i) AbstractC0081v.e(z2, true, new C0070j(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0069i);
        if (D() instanceof L) {
            return;
        }
        interfaceC0069i.b();
        atomicReferenceFieldUpdater.set(this, b0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C H(boolean z2, boolean z3, O0.l lVar) {
        U u2;
        Throwable th;
        if (z2) {
            u2 = lVar instanceof S ? (S) lVar : null;
            if (u2 == null) {
                u2 = new N(lVar);
            }
        } else {
            u2 = lVar instanceof U ? (U) lVar : null;
            if (u2 == null) {
                u2 = new O(0, lVar);
            }
        }
        u2.f925h = this;
        loop0: while (true) {
            Object D2 = D();
            if (D2 instanceof E) {
                E e2 = (E) D2;
                if (e2.f908e) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f939e;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, D2, u2)) {
                        if (atomicReferenceFieldUpdater.get(this) != D2) {
                            break;
                        }
                    }
                    break loop0;
                }
                a0 a0Var = new a0();
                Object k2 = e2.f908e ? a0Var : new K(a0Var);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f939e;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, e2, k2) && atomicReferenceFieldUpdater2.get(this) == e2) {
                }
            } else {
                if (!(D2 instanceof L)) {
                    if (z3) {
                        C0074n c0074n = D2 instanceof C0074n ? (C0074n) D2 : null;
                        lVar.j(c0074n != null ? c0074n.f965a : null);
                    }
                    return b0.f943e;
                }
                a0 e3 = ((L) D2).e();
                if (e3 == null) {
                    P0.h.c(D2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    P((U) D2);
                } else {
                    C c2 = b0.f943e;
                    if (z2 && (D2 instanceof X)) {
                        synchronized (D2) {
                            try {
                                th = ((X) D2).c();
                                if (th != null) {
                                    if ((lVar instanceof C0070j) && !((X) D2).f()) {
                                    }
                                }
                                if (o((L) D2, e3, u2)) {
                                    if (th == null) {
                                        return u2;
                                    }
                                    c2 = u2;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z3) {
                            lVar.j(th);
                        }
                        return c2;
                    }
                    if (o((L) D2, e3, u2)) {
                        break;
                    }
                }
            }
        }
    }

    public boolean I() {
        return this instanceof C0063c;
    }

    public final boolean J(Object obj) {
        Object S2;
        do {
            S2 = S(D(), obj);
            if (S2 == AbstractC0081v.f977c) {
                return false;
            }
            if (S2 == AbstractC0081v.f978d) {
                return true;
            }
        } while (S2 == AbstractC0081v.f979e);
        p(S2);
        return true;
    }

    public final Object K(Object obj) {
        Object S2;
        do {
            S2 = S(D(), obj);
            if (S2 == AbstractC0081v.f977c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0074n c0074n = obj instanceof C0074n ? (C0074n) obj : null;
                throw new IllegalStateException(str, c0074n != null ? c0074n.f965a : null);
            }
        } while (S2 == AbstractC0081v.f979e);
        return S2;
    }

    public final void M(a0 a0Var, Throwable th) {
        Object l2 = a0Var.l();
        P0.h.c(l2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        D0.b bVar = null;
        for (b1.l lVar = (b1.l) l2; !lVar.equals(a0Var); lVar = lVar.m()) {
            if (lVar instanceof S) {
                U u2 = (U) lVar;
                try {
                    u2.p(th);
                } catch (Throwable th2) {
                    if (bVar != null) {
                        AbstractC0086a.c(bVar, th2);
                    } else {
                        bVar = new D0.b("Exception in completion handler " + u2 + " for " + this, th2);
                    }
                }
            }
        }
        if (bVar != null) {
            F(bVar);
        }
        t(th);
    }

    public final void P(U u2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a0 a0Var = new a0();
        u2.getClass();
        b1.l.f1762f.lazySet(a0Var, u2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b1.l.f1761e;
        atomicReferenceFieldUpdater2.lazySet(a0Var, u2);
        loop0: while (true) {
            if (u2.l() == u2) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(u2, u2, a0Var)) {
                    if (atomicReferenceFieldUpdater2.get(u2) != u2) {
                        break;
                    }
                }
                a0Var.g(u2);
                break loop0;
            }
            break;
        }
        b1.l m2 = u2.m();
        do {
            atomicReferenceFieldUpdater = f939e;
            if (atomicReferenceFieldUpdater.compareAndSet(this, u2, m2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == u2);
    }

    public final int Q(Object obj) {
        boolean z2 = obj instanceof E;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f939e;
        if (z2) {
            if (((E) obj).f908e) {
                return 0;
            }
            E e2 = AbstractC0081v.f983i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof K)) {
            return 0;
        }
        a0 a0Var = ((K) obj).f917e;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object S(Object obj, Object obj2) {
        if (!(obj instanceof L)) {
            return AbstractC0081v.f977c;
        }
        if (((obj instanceof E) || (obj instanceof U)) && !(obj instanceof C0070j) && !(obj2 instanceof C0074n)) {
            L l2 = (L) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f939e;
            Object m2 = obj2 instanceof L ? new M((L) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, l2, m2)) {
                if (atomicReferenceFieldUpdater.get(this) != l2) {
                    return AbstractC0081v.f979e;
                }
            }
            N(obj2);
            w(l2, obj2);
            return obj2;
        }
        L l3 = (L) obj;
        a0 C2 = C(l3);
        if (C2 == null) {
            return AbstractC0081v.f979e;
        }
        C0070j c0070j = null;
        X x2 = l3 instanceof X ? (X) l3 : null;
        if (x2 == null) {
            x2 = new X(C2, null);
        }
        synchronized (x2) {
            if (x2.f()) {
                return AbstractC0081v.f977c;
            }
            X.f931f.set(x2, 1);
            if (x2 != l3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f939e;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, l3, x2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != l3) {
                        return AbstractC0081v.f979e;
                    }
                }
            }
            boolean d2 = x2.d();
            C0074n c0074n = obj2 instanceof C0074n ? (C0074n) obj2 : null;
            if (c0074n != null) {
                x2.b(c0074n.f965a);
            }
            Throwable c2 = x2.c();
            if (d2) {
                c2 = null;
            }
            if (c2 != null) {
                M(C2, c2);
            }
            C0070j c0070j2 = l3 instanceof C0070j ? (C0070j) l3 : null;
            if (c0070j2 == null) {
                a0 e2 = l3.e();
                if (e2 != null) {
                    c0070j = L(e2);
                }
            } else {
                c0070j = c0070j2;
            }
            if (c0070j != null) {
                while (AbstractC0081v.e(c0070j.f956i, false, new W(this, x2, c0070j, obj2), 1) == b0.f943e) {
                    c0070j = L(c0070j);
                    if (c0070j == null) {
                    }
                }
                return AbstractC0081v.f978d;
            }
            return y(x2, obj2);
        }
    }

    @Override // W0.P
    public boolean a() {
        Object D2 = D();
        return (D2 instanceof L) && ((L) D2).a();
    }

    @Override // W0.P
    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new Q(u(), null, this);
        }
        s(cancellationException);
    }

    @Override // G0.g
    public final G0.h getKey() {
        return C0079t.f974f;
    }

    @Override // G0.i
    public final Object h(Object obj, O0.p pVar) {
        return pVar.i(obj, this);
    }

    @Override // G0.i
    public final G0.i i(G0.h hVar) {
        return AbstractC0086a.z(this, hVar);
    }

    @Override // G0.i
    public final G0.i j(G0.i iVar) {
        P0.h.e(iVar, "context");
        return iVar == G0.j.f500e ? this : (G0.i) iVar.h(this, new G0.b(1));
    }

    @Override // G0.i
    public final G0.g m(G0.h hVar) {
        return AbstractC0086a.p(this, hVar);
    }

    public final boolean o(L l2, a0 a0Var, U u2) {
        char c2;
        Y y2 = new Y(u2, this, l2);
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1.l.f1762f;
            b1.l f2 = a0Var.f();
            if (f2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(a0Var);
                while (true) {
                    f2 = (b1.l) obj;
                    if (!f2.n()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f2);
                }
            }
            b1.l.f1762f.lazySet(u2, f2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b1.l.f1761e;
            atomicReferenceFieldUpdater2.lazySet(u2, a0Var);
            y2.f936c = a0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(f2, a0Var, y2)) {
                    c2 = y2.a(f2) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(f2) != a0Var) {
                    c2 = 0;
                    break;
                }
            }
            if (c2 == 1) {
                return true;
            }
        } while (c2 != 2);
        return false;
    }

    public void q(Object obj) {
        p(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == W0.AbstractC0081v.f978d) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(Object obj) {
        B0.E e2;
        Object obj2 = AbstractC0081v.f977c;
        if (B()) {
            do {
                Object D2 = D();
                if (!(D2 instanceof L) || ((D2 instanceof X) && ((X) D2).f())) {
                    obj2 = AbstractC0081v.f977c;
                    break;
                }
                obj2 = S(D2, new C0074n(x(obj), false));
            } while (obj2 == AbstractC0081v.f979e);
        }
        if (obj2 == AbstractC0081v.f977c) {
            Throwable th = null;
            loop1: while (true) {
                Object D3 = D();
                if (!(D3 instanceof X)) {
                    if (!(D3 instanceof L)) {
                        e2 = AbstractC0081v.f980f;
                        break;
                    }
                    if (th == null) {
                        th = x(obj);
                    }
                    L l2 = (L) D3;
                    if (l2.a()) {
                        a0 C2 = C(l2);
                        if (C2 != null) {
                            X x2 = new X(C2, th);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f939e;
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, l2, x2)) {
                                if (atomicReferenceFieldUpdater.get(this) != l2) {
                                    break;
                                }
                            }
                            M(C2, th);
                            e2 = AbstractC0081v.f977c;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object S2 = S(D3, new C0074n(th, false));
                        if (S2 == AbstractC0081v.f977c) {
                            throw new IllegalStateException(("Cannot happen in " + D3).toString());
                        }
                        if (S2 != AbstractC0081v.f979e) {
                            obj2 = S2;
                            break;
                        }
                    }
                } else {
                    synchronized (D3) {
                        X x3 = (X) D3;
                        x3.getClass();
                        if (X.f933h.get(x3) == AbstractC0081v.f981g) {
                            e2 = AbstractC0081v.f980f;
                        } else {
                            boolean d2 = ((X) D3).d();
                            if (th == null) {
                                th = x(obj);
                            }
                            ((X) D3).b(th);
                            Throwable c2 = d2 ? null : ((X) D3).c();
                            if (c2 != null) {
                                M(((X) D3).f934e, c2);
                            }
                            e2 = AbstractC0081v.f977c;
                        }
                    }
                }
            }
            obj2 = e2;
        }
        if (obj2 != AbstractC0081v.f977c && obj2 != AbstractC0081v.f978d) {
            if (obj2 == AbstractC0081v.f980f) {
                return false;
            }
            p(obj2);
            return true;
        }
        return true;
    }

    public void s(CancellationException cancellationException) {
        r(cancellationException);
    }

    public final boolean t(Throwable th) {
        if (I()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0069i interfaceC0069i = (InterfaceC0069i) f940f.get(this);
        return (interfaceC0069i == null || interfaceC0069i == b0.f943e) ? z2 : interfaceC0069i.d(th) || z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + R(D()) + '}');
        sb.append('@');
        sb.append(AbstractC0081v.b(this));
        return sb.toString();
    }

    public String u() {
        return "Job was cancelled";
    }

    public boolean v(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return r(th) && A();
    }

    public final void w(L l2, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f940f;
        InterfaceC0069i interfaceC0069i = (InterfaceC0069i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0069i != null) {
            interfaceC0069i.b();
            atomicReferenceFieldUpdater.set(this, b0.f943e);
        }
        D0.b bVar = null;
        C0074n c0074n = obj instanceof C0074n ? (C0074n) obj : null;
        Throwable th = c0074n != null ? c0074n.f965a : null;
        if (l2 instanceof U) {
            try {
                ((U) l2).p(th);
                return;
            } catch (Throwable th2) {
                F(new D0.b("Exception in completion handler " + l2 + " for " + this, th2));
                return;
            }
        }
        a0 e2 = l2.e();
        if (e2 != null) {
            Object l3 = e2.l();
            P0.h.c(l3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (b1.l lVar = (b1.l) l3; !lVar.equals(e2); lVar = lVar.m()) {
                if (lVar instanceof U) {
                    U u2 = (U) lVar;
                    try {
                        u2.p(th);
                    } catch (Throwable th3) {
                        if (bVar != null) {
                            AbstractC0086a.c(bVar, th3);
                        } else {
                            bVar = new D0.b("Exception in completion handler " + u2 + " for " + this, th3);
                        }
                    }
                }
            }
            if (bVar != null) {
                F(bVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable x(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        Z z2 = (Z) ((d0) obj);
        Object D2 = z2.D();
        if (D2 instanceof X) {
            cancellationException = ((X) D2).c();
        } else if (D2 instanceof C0074n) {
            cancellationException = ((C0074n) D2).f965a;
        } else {
            if (D2 instanceof L) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + D2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new Q("Parent job is ".concat(R(D2)), cancellationException, z2) : cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object y(X x2, Object obj) {
        Throwable th = null;
        C0074n c0074n = obj instanceof C0074n ? (C0074n) obj : null;
        Throwable th2 = c0074n != null ? c0074n.f965a : null;
        synchronized (x2) {
            x2.d();
            ArrayList g2 = x2.g(th2);
            if (!g2.isEmpty()) {
                int size = g2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    Object obj2 = g2.get(i2);
                    i2++;
                    if (!(((Throwable) obj2) instanceof CancellationException)) {
                        th = obj2;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) g2.get(0);
                }
            } else if (x2.d()) {
                th = new Q(u(), null, this);
            }
            if (th != null && g2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                int size2 = g2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = g2.get(i3);
                    i3++;
                    Throwable th3 = (Throwable) obj3;
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        AbstractC0086a.c(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0074n(th, false);
        }
        if (th != null && (t(th) || E(th))) {
            P0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0074n.f964b.compareAndSet((C0074n) obj, 0, 1);
        }
        N(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f939e;
        Object m2 = obj instanceof L ? new M((L) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, x2, m2) && atomicReferenceFieldUpdater.get(this) == x2) {
        }
        w(x2, obj);
        return obj;
    }

    public final CancellationException z() {
        CancellationException cancellationException;
        Object D2 = D();
        if (!(D2 instanceof X)) {
            if (D2 instanceof L) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(D2 instanceof C0074n)) {
                return new Q(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0074n) D2).f965a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new Q(u(), th, this) : cancellationException;
        }
        Throwable c2 = ((X) D2).c();
        if (c2 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c2 instanceof CancellationException ? (CancellationException) c2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = u();
        }
        return new Q(concat, c2, this);
    }

    public void F(D0.b bVar) {
        throw bVar;
    }

    public void N(Object obj) {
    }

    public void p(Object obj) {
    }

    public void O() {
    }
}
