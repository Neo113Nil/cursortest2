package Y0;

import a.AbstractC0132a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class Z implements P, d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1193e = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_state");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1194f = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public Z(boolean z2) {
        this._state = z2 ? AbstractC0127v.f1239i : AbstractC0127v.f1238h;
    }

    public static C0116j M(d1.l lVar) {
        while (lVar.m()) {
            d1.l f2 = lVar.f();
            if (f2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d1.l.f2089f;
                Object obj = atomicReferenceFieldUpdater.get(lVar);
                while (true) {
                    lVar = (d1.l) obj;
                    if (!lVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVar);
                }
            } else {
                lVar = f2;
            }
        }
        while (true) {
            lVar = lVar.l();
            if (!lVar.m()) {
                if (lVar instanceof C0116j) {
                    return (C0116j) lVar;
                }
                if (lVar instanceof a0) {
                    return null;
                }
            }
        }
    }

    public static String S(Object obj) {
        if (!(obj instanceof X)) {
            return obj instanceof L ? ((L) obj).b() ? "Active" : "New" : obj instanceof C0120n ? "Cancelled" : "Completed";
        }
        X x2 = (X) obj;
        return x2.d() ? "Cancelling" : x2.f() ? "Completing" : "Active";
    }

    public final CancellationException A() {
        CancellationException cancellationException;
        Object E2 = E();
        if (!(E2 instanceof X)) {
            if (E2 instanceof L) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(E2 instanceof C0120n)) {
                return new Q(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0120n) E2).f1219a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new Q(v(), th, this) : cancellationException;
        }
        Throwable c2 = ((X) E2).c();
        if (c2 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c2 instanceof CancellationException ? (CancellationException) c2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = v();
        }
        return new Q(concat, c2, this);
    }

    public boolean B() {
        return true;
    }

    public boolean C() {
        return this instanceof C0118l;
    }

    public final a0 D(L l2) {
        a0 e2 = l2.e();
        if (e2 != null) {
            return e2;
        }
        if (l2 instanceof E) {
            return new a0();
        }
        if (l2 instanceof U) {
            Q((U) l2);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + l2).toString());
    }

    public final Object E() {
        while (true) {
            Object obj = f1193e.get(this);
            if (!(obj instanceof d1.r)) {
                return obj;
            }
            ((d1.r) obj).a(this);
        }
    }

    public boolean F(Throwable th) {
        return false;
    }

    public final void H(P p2) {
        int R2;
        b0 b0Var = b0.f1197e;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1194f;
        if (p2 == null) {
            atomicReferenceFieldUpdater.set(this, b0Var);
            return;
        }
        Z z2 = (Z) p2;
        do {
            R2 = z2.R(z2.E());
            if (R2 == 0) {
                break;
            }
        } while (R2 != 1);
        InterfaceC0115i interfaceC0115i = (InterfaceC0115i) AbstractC0127v.e(z2, true, new C0116j(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0115i);
        if (E() instanceof L) {
            return;
        }
        interfaceC0115i.a();
        atomicReferenceFieldUpdater.set(this, b0Var);
    }

    public final C I(boolean z2, boolean z3, P0.l lVar) {
        U u2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
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
        u2.f1179h = this;
        while (true) {
            Object E2 = E();
            if (E2 instanceof E) {
                E e2 = (E) E2;
                if (e2.f1162e) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1193e;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, E2, u2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != E2) {
                            break;
                        }
                    }
                    return u2;
                }
                a0 a0Var = new a0();
                Object k2 = e2.f1162e ? a0Var : new K(a0Var);
                do {
                    atomicReferenceFieldUpdater = f1193e;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, e2, k2)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == e2);
            } else {
                if (!(E2 instanceof L)) {
                    if (z3) {
                        C0120n c0120n = E2 instanceof C0120n ? (C0120n) E2 : null;
                        lVar.i(c0120n != null ? c0120n.f1219a : null);
                    }
                    return b0.f1197e;
                }
                a0 e3 = ((L) E2).e();
                if (e3 == null) {
                    Q0.h.c(E2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Q((U) E2);
                } else {
                    C c2 = b0.f1197e;
                    if (z2 && (E2 instanceof X)) {
                        synchronized (E2) {
                            try {
                                th = ((X) E2).c();
                                if (th != null) {
                                    if ((lVar instanceof C0116j) && !((X) E2).f()) {
                                    }
                                }
                                if (p((L) E2, e3, u2)) {
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
                            lVar.i(th);
                        }
                        return c2;
                    }
                    if (p((L) E2, e3, u2)) {
                        return u2;
                    }
                }
            }
        }
    }

    public boolean J() {
        return this instanceof C0109c;
    }

    public final boolean K(Object obj) {
        Object T2;
        do {
            T2 = T(E(), obj);
            if (T2 == AbstractC0127v.f1233c) {
                return false;
            }
            if (T2 == AbstractC0127v.f1234d) {
                return true;
            }
        } while (T2 == AbstractC0127v.f1235e);
        q(T2);
        return true;
    }

    public final Object L(Object obj) {
        Object T2;
        do {
            T2 = T(E(), obj);
            if (T2 == AbstractC0127v.f1233c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0120n c0120n = obj instanceof C0120n ? (C0120n) obj : null;
                throw new IllegalStateException(str, c0120n != null ? c0120n.f1219a : null);
            }
        } while (T2 == AbstractC0127v.f1235e);
        return T2;
    }

    public final void N(a0 a0Var, Throwable th) {
        Object k2 = a0Var.k();
        Q0.h.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        F0.b bVar = null;
        for (d1.l lVar = (d1.l) k2; !lVar.equals(a0Var); lVar = lVar.l()) {
            if (lVar instanceof S) {
                U u2 = (U) lVar;
                try {
                    u2.o(th);
                } catch (Throwable th2) {
                    if (bVar != null) {
                        AbstractC0132a.c(bVar, th2);
                    } else {
                        bVar = new F0.b("Exception in completion handler " + u2 + " for " + this, th2);
                    }
                }
            }
        }
        if (bVar != null) {
            G(bVar);
        }
        u(th);
    }

    public final void Q(U u2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a0 a0Var = new a0();
        u2.getClass();
        d1.l.f2089f.lazySet(a0Var, u2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d1.l.f2088e;
        atomicReferenceFieldUpdater2.lazySet(a0Var, u2);
        loop0: while (true) {
            if (u2.k() == u2) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(u2, u2, a0Var)) {
                    if (atomicReferenceFieldUpdater2.get(u2) != u2) {
                        break;
                    }
                }
                a0Var.j(u2);
                break loop0;
            }
            break;
        }
        d1.l l2 = u2.l();
        do {
            atomicReferenceFieldUpdater = f1193e;
            if (atomicReferenceFieldUpdater.compareAndSet(this, u2, l2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == u2);
    }

    public final int R(Object obj) {
        boolean z2 = obj instanceof E;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1193e;
        if (z2) {
            if (((E) obj).f1162e) {
                return 0;
            }
            E e2 = AbstractC0127v.f1239i;
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
        a0 a0Var = ((K) obj).f1171e;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object T(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof L)) {
            return AbstractC0127v.f1233c;
        }
        if (((obj instanceof E) || (obj instanceof U)) && !(obj instanceof C0116j) && !(obj2 instanceof C0120n)) {
            L l2 = (L) obj;
            Object m2 = obj2 instanceof L ? new M((L) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f1193e;
                if (atomicReferenceFieldUpdater.compareAndSet(this, l2, m2)) {
                    O(obj2);
                    x(l2, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == l2);
            return AbstractC0127v.f1235e;
        }
        L l3 = (L) obj;
        a0 D2 = D(l3);
        if (D2 == null) {
            return AbstractC0127v.f1235e;
        }
        C0116j c0116j = null;
        X x2 = l3 instanceof X ? (X) l3 : null;
        if (x2 == null) {
            x2 = new X(D2, null);
        }
        synchronized (x2) {
            if (x2.f()) {
                return AbstractC0127v.f1233c;
            }
            X.f1185f.set(x2, 1);
            if (x2 != l3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1193e;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, l3, x2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != l3) {
                        return AbstractC0127v.f1235e;
                    }
                }
            }
            boolean d2 = x2.d();
            C0120n c0120n = obj2 instanceof C0120n ? (C0120n) obj2 : null;
            if (c0120n != null) {
                x2.a(c0120n.f1219a);
            }
            Throwable c2 = x2.c();
            if (d2) {
                c2 = null;
            }
            if (c2 != null) {
                N(D2, c2);
            }
            C0116j c0116j2 = l3 instanceof C0116j ? (C0116j) l3 : null;
            if (c0116j2 == null) {
                a0 e2 = l3.e();
                if (e2 != null) {
                    c0116j = M(e2);
                }
            } else {
                c0116j = c0116j2;
            }
            if (c0116j != null) {
                while (AbstractC0127v.e(c0116j.f1210i, false, new W(this, x2, c0116j, obj2), 1) == b0.f1197e) {
                    c0116j = M(c0116j);
                    if (c0116j == null) {
                    }
                }
                return AbstractC0127v.f1234d;
            }
            return z(x2, obj2);
        }
    }

    @Override // Y0.P
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new Q(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // Y0.P
    public boolean b() {
        Object E2 = E();
        return (E2 instanceof L) && ((L) E2).b();
    }

    @Override // H0.i
    public final H0.i d(H0.h hVar) {
        return i1.a.v(this, hVar);
    }

    @Override // H0.g
    public final H0.h getKey() {
        return C0125t.f1230f;
    }

    @Override // H0.i
    public final H0.i i(H0.i iVar) {
        Q0.h.e(iVar, "context");
        return iVar == H0.j.f503e ? this : (H0.i) iVar.m(this, H0.b.f498h);
    }

    @Override // H0.i
    public final H0.g k(H0.h hVar) {
        return i1.a.m(this, hVar);
    }

    @Override // H0.i
    public final Object m(Object obj, P0.p pVar) {
        return pVar.h(obj, this);
    }

    public final boolean p(L l2, a0 a0Var, U u2) {
        char c2;
        Y y2 = new Y(u2, this, l2);
        do {
            d1.l f2 = a0Var.f();
            if (f2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d1.l.f2089f;
                Object obj = atomicReferenceFieldUpdater.get(a0Var);
                while (true) {
                    f2 = (d1.l) obj;
                    if (!f2.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f2);
                }
            }
            d1.l.f2089f.lazySet(u2, f2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d1.l.f2088e;
            atomicReferenceFieldUpdater2.lazySet(u2, a0Var);
            y2.f1190c = a0Var;
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

    public void r(Object obj) {
        q(obj);
    }

    public final boolean s(Object obj) {
        B.m mVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0127v.f1233c;
        if (C()) {
            do {
                Object E2 = E();
                if (!(E2 instanceof L) || ((E2 instanceof X) && ((X) E2).f())) {
                    obj2 = AbstractC0127v.f1233c;
                    break;
                }
                obj2 = T(E2, new C0120n(y(obj), false));
            } while (obj2 == AbstractC0127v.f1235e);
            if (obj2 == AbstractC0127v.f1234d) {
                return true;
            }
        }
        if (obj2 == AbstractC0127v.f1233c) {
            Throwable th = null;
            loop1: while (true) {
                Object E3 = E();
                if (!(E3 instanceof X)) {
                    if (!(E3 instanceof L)) {
                        mVar = AbstractC0127v.f1236f;
                        break;
                    }
                    if (th == null) {
                        th = y(obj);
                    }
                    L l2 = (L) E3;
                    if (l2.b()) {
                        a0 D2 = D(l2);
                        if (D2 == null) {
                            continue;
                        } else {
                            X x2 = new X(D2, th);
                            do {
                                atomicReferenceFieldUpdater = f1193e;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, l2, x2)) {
                                    N(D2, th);
                                    mVar = AbstractC0127v.f1233c;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == l2);
                        }
                    } else {
                        Object T2 = T(E3, new C0120n(th, false));
                        if (T2 == AbstractC0127v.f1233c) {
                            throw new IllegalStateException(("Cannot happen in " + E3).toString());
                        }
                        if (T2 != AbstractC0127v.f1235e) {
                            obj2 = T2;
                            break;
                        }
                    }
                } else {
                    synchronized (E3) {
                        try {
                            X x3 = (X) E3;
                            x3.getClass();
                            if (X.f1187h.get(x3) == AbstractC0127v.f1237g) {
                                mVar = AbstractC0127v.f1236f;
                            } else {
                                boolean d2 = ((X) E3).d();
                                if (th == null) {
                                    th = y(obj);
                                }
                                ((X) E3).a(th);
                                Throwable c2 = d2 ? null : ((X) E3).c();
                                if (c2 != null) {
                                    N(((X) E3).f1188e, c2);
                                }
                                mVar = AbstractC0127v.f1233c;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = mVar;
        }
        if (obj2 != AbstractC0127v.f1233c && obj2 != AbstractC0127v.f1234d) {
            if (obj2 == AbstractC0127v.f1236f) {
                return false;
            }
            q(obj2);
        }
        return true;
    }

    public void t(CancellationException cancellationException) {
        s(cancellationException);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + S(E()) + '}');
        sb.append('@');
        sb.append(AbstractC0127v.b(this));
        return sb.toString();
    }

    public final boolean u(Throwable th) {
        if (J()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0115i interfaceC0115i = (InterfaceC0115i) f1194f.get(this);
        return (interfaceC0115i == null || interfaceC0115i == b0.f1197e) ? z2 : interfaceC0115i.c(th) || z2;
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean w(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return s(th) && B();
    }

    public final void x(L l2, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1194f;
        InterfaceC0115i interfaceC0115i = (InterfaceC0115i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0115i != null) {
            interfaceC0115i.a();
            atomicReferenceFieldUpdater.set(this, b0.f1197e);
        }
        F0.b bVar = null;
        C0120n c0120n = obj instanceof C0120n ? (C0120n) obj : null;
        Throwable th = c0120n != null ? c0120n.f1219a : null;
        if (l2 instanceof U) {
            try {
                ((U) l2).o(th);
                return;
            } catch (Throwable th2) {
                G(new F0.b("Exception in completion handler " + l2 + " for " + this, th2));
                return;
            }
        }
        a0 e2 = l2.e();
        if (e2 != null) {
            Object k2 = e2.k();
            Q0.h.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (d1.l lVar = (d1.l) k2; !lVar.equals(e2); lVar = lVar.l()) {
                if (lVar instanceof U) {
                    U u2 = (U) lVar;
                    try {
                        u2.o(th);
                    } catch (Throwable th3) {
                        if (bVar != null) {
                            AbstractC0132a.c(bVar, th3);
                        } else {
                            bVar = new F0.b("Exception in completion handler " + u2 + " for " + this, th3);
                        }
                    }
                }
            }
            if (bVar != null) {
                G(bVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable y(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        Z z2 = (Z) ((d0) obj);
        Object E2 = z2.E();
        if (E2 instanceof X) {
            cancellationException = ((X) E2).c();
        } else if (E2 instanceof C0120n) {
            cancellationException = ((C0120n) E2).f1219a;
        } else {
            if (E2 instanceof L) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + E2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new Q("Parent job is ".concat(S(E2)), cancellationException, z2);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(X x2, Object obj) {
        Throwable th = null;
        C0120n c0120n = obj instanceof C0120n ? (C0120n) obj : null;
        Throwable th2 = c0120n != null ? c0120n.f1219a : null;
        synchronized (x2) {
            x2.d();
            ArrayList<Throwable> g2 = x2.g(th2);
            if (!g2.isEmpty()) {
                Iterator it = g2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th = next;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) g2.get(0);
                }
            } else if (x2.d()) {
                th = new Q(v(), null, this);
            }
            if (th != null && g2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                for (Throwable th3 : g2) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        AbstractC0132a.c(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0120n(th, false);
        }
        if (th != null && (u(th) || F(th))) {
            Q0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0120n.f1218b.compareAndSet((C0120n) obj, 0, 1);
        }
        O(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1193e;
        Object m2 = obj instanceof L ? new M((L) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, x2, m2) && atomicReferenceFieldUpdater.get(this) == x2) {
        }
        x(x2, obj);
        return obj;
    }

    public void P() {
    }

    public void G(F0.b bVar) {
        throw bVar;
    }

    public void O(Object obj) {
    }

    public void q(Object obj) {
    }
}
