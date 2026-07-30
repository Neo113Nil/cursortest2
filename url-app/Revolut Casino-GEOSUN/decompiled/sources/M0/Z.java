package M0;

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
    public static final AtomicReferenceFieldUpdater f650e = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_state");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f651f = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public Z(boolean z2) {
        this._state = z2 ? AbstractC0063v.f696i : AbstractC0063v.f695h;
    }

    public static C0052j K(R0.l lVar) {
        while (lVar.m()) {
            R0.l g2 = lVar.g();
            if (g2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R0.l.f920f;
                Object obj = atomicReferenceFieldUpdater.get(lVar);
                while (true) {
                    lVar = (R0.l) obj;
                    if (!lVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVar);
                }
            } else {
                lVar = g2;
            }
        }
        while (true) {
            lVar = lVar.l();
            if (!lVar.m()) {
                if (lVar instanceof C0052j) {
                    return (C0052j) lVar;
                }
                if (lVar instanceof a0) {
                    return null;
                }
            }
        }
    }

    public static String Q(Object obj) {
        if (!(obj instanceof X)) {
            return obj instanceof L ? ((L) obj).b() ? "Active" : "New" : obj instanceof C0056n ? "Cancelled" : "Completed";
        }
        X x2 = (X) obj;
        return x2.e() ? "Cancelling" : x2.f() ? "Completing" : "Active";
    }

    public boolean A() {
        return this instanceof C0054l;
    }

    public final a0 B(L l2) {
        a0 c2 = l2.c();
        if (c2 != null) {
            return c2;
        }
        if (l2 instanceof E) {
            return new a0();
        }
        if (l2 instanceof U) {
            O((U) l2);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + l2).toString());
    }

    public final Object C() {
        while (true) {
            Object obj = f650e.get(this);
            if (!(obj instanceof R0.r)) {
                return obj;
            }
            ((R0.r) obj).a(this);
        }
    }

    public boolean D(Throwable th) {
        return false;
    }

    public final void F(P p2) {
        int P2;
        b0 b0Var = b0.f654e;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f651f;
        if (p2 == null) {
            atomicReferenceFieldUpdater.set(this, b0Var);
            return;
        }
        Z z2 = (Z) p2;
        do {
            P2 = z2.P(z2.C());
            if (P2 == 0) {
                break;
            }
        } while (P2 != 1);
        InterfaceC0051i interfaceC0051i = (InterfaceC0051i) AbstractC0063v.e(z2, true, new C0052j(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0051i);
        if (C() instanceof L) {
            return;
        }
        interfaceC0051i.a();
        atomicReferenceFieldUpdater.set(this, b0Var);
    }

    public final C G(boolean z2, boolean z3, E0.l lVar) {
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
        u2.f636h = this;
        while (true) {
            Object C2 = C();
            if (C2 instanceof E) {
                E e2 = (E) C2;
                if (e2.f619e) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f650e;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, C2, u2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != C2) {
                            break;
                        }
                    }
                    return u2;
                }
                a0 a0Var = new a0();
                L k2 = e2.f619e ? a0Var : new K(a0Var);
                do {
                    atomicReferenceFieldUpdater = f650e;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, e2, k2)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == e2);
            } else {
                if (!(C2 instanceof L)) {
                    if (z3) {
                        C0056n c0056n = C2 instanceof C0056n ? (C0056n) C2 : null;
                        lVar.i(c0056n != null ? c0056n.f676a : null);
                    }
                    return b0.f654e;
                }
                a0 c2 = ((L) C2).c();
                if (c2 == null) {
                    F0.i.c(C2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    O((U) C2);
                } else {
                    C c3 = b0.f654e;
                    if (z2 && (C2 instanceof X)) {
                        synchronized (C2) {
                            try {
                                th = ((X) C2).d();
                                if (th != null) {
                                    if ((lVar instanceof C0052j) && !((X) C2).f()) {
                                    }
                                }
                                if (n((L) C2, c2, u2)) {
                                    if (th == null) {
                                        return u2;
                                    }
                                    c3 = u2;
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
                        return c3;
                    }
                    if (n((L) C2, c2, u2)) {
                        return u2;
                    }
                }
            }
        }
    }

    public boolean H() {
        return this instanceof C0045c;
    }

    public final boolean I(Object obj) {
        Object R2;
        do {
            R2 = R(C(), obj);
            if (R2 == AbstractC0063v.f690c) {
                return false;
            }
            if (R2 == AbstractC0063v.f691d) {
                return true;
            }
        } while (R2 == AbstractC0063v.f692e);
        o(R2);
        return true;
    }

    public final Object J(Object obj) {
        Object R2;
        do {
            R2 = R(C(), obj);
            if (R2 == AbstractC0063v.f690c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0056n c0056n = obj instanceof C0056n ? (C0056n) obj : null;
                throw new IllegalStateException(str, c0056n != null ? c0056n.f676a : null);
            }
        } while (R2 == AbstractC0063v.f692e);
        return R2;
    }

    public final void L(a0 a0Var, Throwable th) {
        Object k2 = a0Var.k();
        F0.i.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        M.c cVar = null;
        for (R0.l lVar = (R0.l) k2; !lVar.equals(a0Var); lVar = lVar.l()) {
            if (lVar instanceof S) {
                U u2 = (U) lVar;
                try {
                    u2.o(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        o.g.a(cVar, th2);
                    } else {
                        cVar = new M.c("Exception in completion handler " + u2 + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            E(cVar);
        }
        s(th);
    }

    public final void O(U u2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a0 a0Var = new a0();
        u2.getClass();
        R0.l.f920f.lazySet(a0Var, u2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = R0.l.f919e;
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
        R0.l l2 = u2.l();
        do {
            atomicReferenceFieldUpdater = f650e;
            if (atomicReferenceFieldUpdater.compareAndSet(this, u2, l2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == u2);
    }

    public final int P(Object obj) {
        boolean z2 = obj instanceof E;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f650e;
        if (z2) {
            if (((E) obj).f619e) {
                return 0;
            }
            E e2 = AbstractC0063v.f696i;
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
        a0 a0Var = ((K) obj).f628e;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object R(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof L)) {
            return AbstractC0063v.f690c;
        }
        if (((obj instanceof E) || (obj instanceof U)) && !(obj instanceof C0052j) && !(obj2 instanceof C0056n)) {
            L l2 = (L) obj;
            Object m2 = obj2 instanceof L ? new M((L) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f650e;
                if (atomicReferenceFieldUpdater.compareAndSet(this, l2, m2)) {
                    M(obj2);
                    v(l2, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == l2);
            return AbstractC0063v.f692e;
        }
        L l3 = (L) obj;
        a0 B2 = B(l3);
        if (B2 == null) {
            return AbstractC0063v.f692e;
        }
        C0052j c0052j = null;
        X x2 = l3 instanceof X ? (X) l3 : null;
        if (x2 == null) {
            x2 = new X(B2, null);
        }
        synchronized (x2) {
            if (x2.f()) {
                return AbstractC0063v.f690c;
            }
            X.f642f.set(x2, 1);
            if (x2 != l3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f650e;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, l3, x2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != l3) {
                        return AbstractC0063v.f692e;
                    }
                }
            }
            boolean e2 = x2.e();
            C0056n c0056n = obj2 instanceof C0056n ? (C0056n) obj2 : null;
            if (c0056n != null) {
                x2.a(c0056n.f676a);
            }
            Throwable d2 = x2.d();
            if (e2) {
                d2 = null;
            }
            if (d2 != null) {
                L(B2, d2);
            }
            C0052j c0052j2 = l3 instanceof C0052j ? (C0052j) l3 : null;
            if (c0052j2 == null) {
                a0 c2 = l3.c();
                if (c2 != null) {
                    c0052j = K(c2);
                }
            } else {
                c0052j = c0052j2;
            }
            if (c0052j != null) {
                while (AbstractC0063v.e(c0052j.f667i, false, new W(this, x2, c0052j, obj2), 1) == b0.f654e) {
                    c0052j = K(c0052j);
                    if (c0052j == null) {
                    }
                }
                return AbstractC0063v.f691d;
            }
            return x(x2, obj2);
        }
    }

    @Override // M0.P
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new Q(t(), null, this);
        }
        r(cancellationException);
    }

    @Override // M0.P
    public boolean b() {
        Object C2 = C();
        return (C2 instanceof L) && ((L) C2).b();
    }

    @Override // w0.i
    public final w0.g f(w0.h hVar) {
        return o.g.m(this, hVar);
    }

    @Override // w0.g
    public final w0.h getKey() {
        return C0061t.f687f;
    }

    @Override // w0.i
    public final Object h(Object obj, E0.p pVar) {
        return pVar.f(obj, this);
    }

    @Override // w0.i
    public final w0.i i(w0.h hVar) {
        return o.g.u(this, hVar);
    }

    @Override // w0.i
    public final w0.i k(w0.i iVar) {
        F0.i.e(iVar, "context");
        return iVar == w0.j.f3082e ? this : (w0.i) iVar.h(this, new w0.b(1));
    }

    public final boolean n(L l2, a0 a0Var, U u2) {
        char c2;
        Y y2 = new Y(u2, this, l2);
        do {
            R0.l g2 = a0Var.g();
            if (g2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R0.l.f920f;
                Object obj = atomicReferenceFieldUpdater.get(a0Var);
                while (true) {
                    g2 = (R0.l) obj;
                    if (!g2.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(g2);
                }
            }
            R0.l.f920f.lazySet(u2, g2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = R0.l.f919e;
            atomicReferenceFieldUpdater2.lazySet(u2, a0Var);
            y2.f647c = a0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(g2, a0Var, y2)) {
                    c2 = y2.a(g2) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(g2) != a0Var) {
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

    public void p(Object obj) {
        o(obj);
    }

    public final boolean q(Object obj) {
        A.j jVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0063v.f690c;
        if (A()) {
            do {
                Object C2 = C();
                if (!(C2 instanceof L) || ((C2 instanceof X) && ((X) C2).f())) {
                    obj2 = AbstractC0063v.f690c;
                    break;
                }
                obj2 = R(C2, new C0056n(w(obj), false));
            } while (obj2 == AbstractC0063v.f692e);
            if (obj2 == AbstractC0063v.f691d) {
                return true;
            }
        }
        if (obj2 == AbstractC0063v.f690c) {
            Throwable th = null;
            loop1: while (true) {
                Object C3 = C();
                if (!(C3 instanceof X)) {
                    if (!(C3 instanceof L)) {
                        jVar = AbstractC0063v.f693f;
                        break;
                    }
                    if (th == null) {
                        th = w(obj);
                    }
                    L l2 = (L) C3;
                    if (l2.b()) {
                        a0 B2 = B(l2);
                        if (B2 == null) {
                            continue;
                        } else {
                            X x2 = new X(B2, th);
                            do {
                                atomicReferenceFieldUpdater = f650e;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, l2, x2)) {
                                    L(B2, th);
                                    jVar = AbstractC0063v.f690c;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == l2);
                        }
                    } else {
                        Object R2 = R(C3, new C0056n(th, false));
                        if (R2 == AbstractC0063v.f690c) {
                            throw new IllegalStateException(("Cannot happen in " + C3).toString());
                        }
                        if (R2 != AbstractC0063v.f692e) {
                            obj2 = R2;
                            break;
                        }
                    }
                } else {
                    synchronized (C3) {
                        try {
                            X x3 = (X) C3;
                            x3.getClass();
                            if (X.f644h.get(x3) == AbstractC0063v.f694g) {
                                jVar = AbstractC0063v.f693f;
                            } else {
                                boolean e2 = ((X) C3).e();
                                if (th == null) {
                                    th = w(obj);
                                }
                                ((X) C3).a(th);
                                Throwable d2 = e2 ? null : ((X) C3).d();
                                if (d2 != null) {
                                    L(((X) C3).f645e, d2);
                                }
                                jVar = AbstractC0063v.f690c;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = jVar;
        }
        if (obj2 != AbstractC0063v.f690c && obj2 != AbstractC0063v.f691d) {
            if (obj2 == AbstractC0063v.f693f) {
                return false;
            }
            o(obj2);
        }
        return true;
    }

    public void r(CancellationException cancellationException) {
        q(cancellationException);
    }

    public final boolean s(Throwable th) {
        if (H()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0051i interfaceC0051i = (InterfaceC0051i) f651f.get(this);
        return (interfaceC0051i == null || interfaceC0051i == b0.f654e) ? z2 : interfaceC0051i.e(th) || z2;
    }

    public String t() {
        return "Job was cancelled";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + Q(C()) + '}');
        sb.append('@');
        sb.append(AbstractC0063v.b(this));
        return sb.toString();
    }

    public boolean u(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return q(th) && z();
    }

    public final void v(L l2, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f651f;
        InterfaceC0051i interfaceC0051i = (InterfaceC0051i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0051i != null) {
            interfaceC0051i.a();
            atomicReferenceFieldUpdater.set(this, b0.f654e);
        }
        M.c cVar = null;
        C0056n c0056n = obj instanceof C0056n ? (C0056n) obj : null;
        Throwable th = c0056n != null ? c0056n.f676a : null;
        if (l2 instanceof U) {
            try {
                ((U) l2).o(th);
                return;
            } catch (Throwable th2) {
                E(new M.c("Exception in completion handler " + l2 + " for " + this, th2));
                return;
            }
        }
        a0 c2 = l2.c();
        if (c2 != null) {
            Object k2 = c2.k();
            F0.i.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (R0.l lVar = (R0.l) k2; !lVar.equals(c2); lVar = lVar.l()) {
                if (lVar instanceof U) {
                    U u2 = (U) lVar;
                    try {
                        u2.o(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            o.g.a(cVar, th3);
                        } else {
                            cVar = new M.c("Exception in completion handler " + u2 + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                E(cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable w(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        Z z2 = (Z) ((d0) obj);
        Object C2 = z2.C();
        if (C2 instanceof X) {
            cancellationException = ((X) C2).d();
        } else if (C2 instanceof C0056n) {
            cancellationException = ((C0056n) C2).f676a;
        } else {
            if (C2 instanceof L) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + C2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new Q("Parent job is ".concat(Q(C2)), cancellationException, z2);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object x(X x2, Object obj) {
        Throwable th = null;
        C0056n c0056n = obj instanceof C0056n ? (C0056n) obj : null;
        Throwable th2 = c0056n != null ? c0056n.f676a : null;
        synchronized (x2) {
            x2.e();
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
            } else if (x2.e()) {
                th = new Q(t(), null, this);
            }
            if (th != null && g2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                for (Throwable th3 : g2) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        o.g.a(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0056n(th, false);
        }
        if (th != null && (s(th) || D(th))) {
            F0.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0056n.f675b.compareAndSet((C0056n) obj, 0, 1);
        }
        M(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f650e;
        Object m2 = obj instanceof L ? new M((L) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, x2, m2) && atomicReferenceFieldUpdater.get(this) == x2) {
        }
        v(x2, obj);
        return obj;
    }

    public final CancellationException y() {
        CancellationException cancellationException;
        Object C2 = C();
        if (!(C2 instanceof X)) {
            if (C2 instanceof L) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(C2 instanceof C0056n)) {
                return new Q(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0056n) C2).f676a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new Q(t(), th, this) : cancellationException;
        }
        Throwable d2 = ((X) C2).d();
        if (d2 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = d2 instanceof CancellationException ? (CancellationException) d2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = t();
        }
        return new Q(concat, d2, this);
    }

    public boolean z() {
        return true;
    }

    public void E(M.c cVar) {
        throw cVar;
    }

    public void M(Object obj) {
    }

    public void o(Object obj) {
    }

    public void N() {
    }
}
