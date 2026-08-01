package s1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class U implements M, Y {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4030a = AtomicReferenceFieldUpdater.newUpdater(U.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4031b = AtomicReferenceFieldUpdater.newUpdater(U.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public U(boolean z2) {
        this._state = z2 ? AbstractC0335s.h : AbstractC0335s.f4067g;
    }

    public static C0325h D(w1.i iVar) {
        while (iVar.m()) {
            w1.i i = iVar.i();
            if (i == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w1.i.f4505b;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (w1.i) obj;
                    if (!iVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVar);
                }
            } else {
                iVar = i;
            }
        }
        while (true) {
            iVar = iVar.l();
            if (!iVar.m()) {
                if (iVar instanceof C0325h) {
                    return (C0325h) iVar;
                }
                if (iVar instanceof V) {
                    return null;
                }
            }
        }
    }

    public static String I(Object obj) {
        if (!(obj instanceof S)) {
            return obj instanceof I ? ((I) obj).a() ? "Active" : "New" : obj instanceof C0327j ? "Cancelled" : "Completed";
        }
        S s2 = (S) obj;
        return s2.e() ? "Cancelling" : s2.f() ? "Completing" : "Active";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[EDGE_INSN: B:31:0x0055->B:25:0x0055 BREAK  A[LOOP:0: B:7:0x000c->B:30:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(M m2) {
        boolean z2;
        W w2 = W.f4032a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4031b;
        if (m2 == null) {
            atomicReferenceFieldUpdater.set(this, w2);
            return;
        }
        U u2 = (U) m2;
        do {
            Object x2 = u2.x();
            boolean z3 = x2 instanceof A;
            z2 = false;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4030a;
            if (z3) {
                if (!((A) x2).f4008a) {
                    A a2 = AbstractC0335s.h;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(u2, x2, a2)) {
                        if (atomicReferenceFieldUpdater2.get(u2) != x2) {
                            z2 = -1;
                            break;
                        }
                    }
                    u2.getClass();
                    z2 = true;
                }
                if (z2) {
                    break;
                }
            } else {
                if (x2 instanceof H) {
                    V v2 = ((H) x2).f4015a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(u2, x2, v2)) {
                        if (atomicReferenceFieldUpdater2.get(u2) != x2) {
                            z2 = -1;
                            break;
                        }
                    }
                    u2.getClass();
                    z2 = true;
                }
                if (z2) {
                }
            }
        } while (!z2);
        InterfaceC0324g interfaceC0324g = (InterfaceC0324g) AbstractC0335s.e(u2, true, new C0325h(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0324g);
        if (x() instanceof I) {
            return;
        }
        interfaceC0324g.e();
        atomicReferenceFieldUpdater.set(this, w2);
    }

    public boolean B() {
        return false;
    }

    public final Object C(Object obj) {
        Object J2;
        do {
            J2 = J(x(), obj);
            if (J2 == AbstractC0335s.f4063b) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0327j c0327j = obj instanceof C0327j ? (C0327j) obj : null;
                throw new IllegalStateException(str, c0327j != null ? c0327j.f4051a : null);
            }
        } while (J2 == AbstractC0335s.d);
        return J2;
    }

    public final void E(V v2, Throwable th) {
        Object k2 = v2.k();
        k1.e.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        X0.b bVar = null;
        for (w1.i iVar = (w1.i) k2; !iVar.equals(v2); iVar = iVar.l()) {
            if (iVar instanceof O) {
                P p2 = (P) iVar;
                try {
                    p2.o(th);
                } catch (Throwable th2) {
                    if (bVar != null) {
                        H1.d.b(bVar, th2);
                    } else {
                        bVar = new X0.b("Exception in completion handler " + p2 + " for " + this, th2);
                    }
                }
            }
        }
        if (bVar != null) {
            z(bVar);
        }
        n(th);
    }

    public void F(Object obj) {
    }

    public void G() {
    }

    public final void H(P p2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        V v2 = new V();
        p2.getClass();
        w1.i.f4505b.lazySet(v2, p2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w1.i.f4504a;
        atomicReferenceFieldUpdater2.lazySet(v2, p2);
        loop0: while (true) {
            if (p2.k() == p2) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(p2, p2, v2)) {
                    if (atomicReferenceFieldUpdater2.get(p2) != p2) {
                        break;
                    }
                }
                v2.j(p2);
                break loop0;
            }
            break;
        }
        w1.i l2 = p2.l();
        do {
            atomicReferenceFieldUpdater = f4030a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, p2, l2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == p2);
    }

    public final Object J(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof I)) {
            return AbstractC0335s.f4063b;
        }
        if (((obj instanceof A) || (obj instanceof P)) && !(obj instanceof C0325h) && !(obj2 instanceof C0327j)) {
            I i = (I) obj;
            Object j2 = obj2 instanceof I ? new J((I) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f4030a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, i, j2)) {
                    F(obj2);
                    r(i, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == i);
            return AbstractC0335s.d;
        }
        I i2 = (I) obj;
        V w2 = w(i2);
        if (w2 == null) {
            return AbstractC0335s.d;
        }
        C0325h c0325h = null;
        S s2 = i2 instanceof S ? (S) i2 : null;
        if (s2 == null) {
            s2 = new S(w2, null);
        }
        synchronized (s2) {
            if (s2.f()) {
                return AbstractC0335s.f4063b;
            }
            S.f4024b.set(s2, 1);
            if (s2 != i2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4030a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, i2, s2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != i2) {
                        return AbstractC0335s.d;
                    }
                }
            }
            boolean e2 = s2.e();
            C0327j c0327j = obj2 instanceof C0327j ? (C0327j) obj2 : null;
            if (c0327j != null) {
                s2.c(c0327j.f4051a);
            }
            Throwable d = s2.d();
            if (e2) {
                d = null;
            }
            if (d != null) {
                E(w2, d);
            }
            C0325h c0325h2 = i2 instanceof C0325h ? (C0325h) i2 : null;
            if (c0325h2 == null) {
                V b2 = i2.b();
                if (b2 != null) {
                    c0325h = D(b2);
                }
            } else {
                c0325h = c0325h2;
            }
            if (c0325h != null) {
                while (AbstractC0335s.e(c0325h.f4045e, false, new Q(this, s2, c0325h, obj2), 1) == W.f4032a) {
                    c0325h = D(c0325h);
                    if (c0325h == null) {
                    }
                }
                return AbstractC0335s.f4064c;
            }
            return t(s2, obj2);
        }
    }

    @Override // s1.M
    public boolean a() {
        Object x2 = x();
        return (x2 instanceof I) && ((I) x2).a();
    }

    @Override // b1.j
    public final b1.j d(b1.i iVar) {
        return b1.g.s(this, iVar);
    }

    public final boolean f(I i, V v2, P p2) {
        char c2;
        T t2 = new T(p2, this, i);
        do {
            w1.i i2 = v2.i();
            if (i2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w1.i.f4505b;
                Object obj = atomicReferenceFieldUpdater.get(v2);
                while (true) {
                    i2 = (w1.i) obj;
                    if (!i2.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(i2);
                }
            }
            w1.i.f4505b.lazySet(p2, i2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w1.i.f4504a;
            atomicReferenceFieldUpdater2.lazySet(p2, v2);
            t2.f4028c = v2;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(i2, v2, t2)) {
                    c2 = t2.a(i2) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(i2) != v2) {
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

    public void g(Object obj) {
    }

    @Override // b1.h
    public final b1.i getKey() {
        return C0333p.f4061b;
    }

    public void i(Object obj) {
        g(obj);
    }

    @Override // b1.j
    public final b1.j j(b1.j jVar) {
        return b1.g.x(this, jVar);
    }

    @Override // b1.j
    public final Object k(Object obj, j1.p pVar) {
        return pVar.d(obj, this);
    }

    public final void l(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new N(o(), null, this);
        }
        m(cancellationException);
    }

    public final boolean m(Object obj) {
        U.q qVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0335s.f4063b;
        if (this instanceof a0) {
            do {
                Object x2 = x();
                if (!(x2 instanceof I) || ((x2 instanceof S) && ((S) x2).f())) {
                    obj2 = AbstractC0335s.f4063b;
                    break;
                }
                obj2 = J(x2, new C0327j(s(obj), false));
            } while (obj2 == AbstractC0335s.d);
            if (obj2 == AbstractC0335s.f4064c) {
                return true;
            }
        }
        if (obj2 == AbstractC0335s.f4063b) {
            Throwable th = null;
            loop1: while (true) {
                Object x3 = x();
                if (!(x3 instanceof S)) {
                    if (!(x3 instanceof I)) {
                        qVar = AbstractC0335s.f4065e;
                        break;
                    }
                    if (th == null) {
                        th = s(obj);
                    }
                    I i = (I) x3;
                    if (i.a()) {
                        V w2 = w(i);
                        if (w2 == null) {
                            continue;
                        } else {
                            S s2 = new S(w2, th);
                            do {
                                atomicReferenceFieldUpdater = f4030a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, i, s2)) {
                                    E(w2, th);
                                    qVar = AbstractC0335s.f4063b;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == i);
                        }
                    } else {
                        Object J2 = J(x3, new C0327j(th, false));
                        if (J2 == AbstractC0335s.f4063b) {
                            throw new IllegalStateException(("Cannot happen in " + x3).toString());
                        }
                        if (J2 != AbstractC0335s.d) {
                            obj2 = J2;
                            break;
                        }
                    }
                } else {
                    synchronized (x3) {
                        try {
                            S s3 = (S) x3;
                            s3.getClass();
                            if (S.d.get(s3) == AbstractC0335s.f4066f) {
                                qVar = AbstractC0335s.f4065e;
                            } else {
                                boolean e2 = ((S) x3).e();
                                if (th == null) {
                                    th = s(obj);
                                }
                                ((S) x3).c(th);
                                Throwable d = e2 ? null : ((S) x3).d();
                                if (d != null) {
                                    E(((S) x3).f4026a, d);
                                }
                                qVar = AbstractC0335s.f4063b;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = qVar;
        }
        if (obj2 == AbstractC0335s.f4063b || obj2 == AbstractC0335s.f4064c) {
            return true;
        }
        if (obj2 == AbstractC0335s.f4065e) {
            return false;
        }
        g(obj2);
        return true;
    }

    public final boolean n(Throwable th) {
        if (B()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0324g interfaceC0324g = (InterfaceC0324g) f4031b.get(this);
        return (interfaceC0324g == null || interfaceC0324g == W.f4032a) ? z2 : interfaceC0324g.h(th) || z2;
    }

    public String o() {
        return "Job was cancelled";
    }

    @Override // b1.j
    public final b1.h p(b1.i iVar) {
        return b1.g.n(this, iVar);
    }

    public boolean q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m(th) && v();
    }

    public final void r(I i, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4031b;
        InterfaceC0324g interfaceC0324g = (InterfaceC0324g) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0324g != null) {
            interfaceC0324g.e();
            atomicReferenceFieldUpdater.set(this, W.f4032a);
        }
        X0.b bVar = null;
        C0327j c0327j = obj instanceof C0327j ? (C0327j) obj : null;
        Throwable th = c0327j != null ? c0327j.f4051a : null;
        if (i instanceof P) {
            try {
                ((P) i).o(th);
                return;
            } catch (Throwable th2) {
                z(new X0.b("Exception in completion handler " + i + " for " + this, th2));
                return;
            }
        }
        V b2 = i.b();
        if (b2 != null) {
            Object k2 = b2.k();
            k1.e.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (w1.i iVar = (w1.i) k2; !iVar.equals(b2); iVar = iVar.l()) {
                if (iVar instanceof P) {
                    P p2 = (P) iVar;
                    try {
                        p2.o(th);
                    } catch (Throwable th3) {
                        if (bVar != null) {
                            H1.d.b(bVar, th3);
                        } else {
                            bVar = new X0.b("Exception in completion handler " + p2 + " for " + this, th3);
                        }
                    }
                }
            }
            if (bVar != null) {
                z(bVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable s(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        U u2 = (U) ((Y) obj);
        Object x2 = u2.x();
        if (x2 instanceof S) {
            cancellationException = ((S) x2).d();
        } else if (x2 instanceof C0327j) {
            cancellationException = ((C0327j) x2).f4051a;
        } else {
            if (x2 instanceof I) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + x2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new N("Parent job is ".concat(I(x2)), cancellationException, u2);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object t(S s2, Object obj) {
        Throwable th = null;
        C0327j c0327j = obj instanceof C0327j ? (C0327j) obj : null;
        Throwable th2 = c0327j != null ? c0327j.f4051a : null;
        synchronized (s2) {
            s2.e();
            ArrayList<Throwable> g2 = s2.g(th2);
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
            } else if (s2.e()) {
                th = new N(o(), null, this);
            }
            if (th != null && g2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                for (Throwable th3 : g2) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        H1.d.b(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0327j(th, false);
        }
        if (th != null && (n(th) || y(th))) {
            k1.e.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0327j.f4050b.compareAndSet((C0327j) obj, 0, 1);
        }
        F(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4030a;
        Object j2 = obj instanceof I ? new J((I) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, s2, j2) && atomicReferenceFieldUpdater.get(this) == s2) {
        }
        r(s2, obj);
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + I(x()) + '}');
        sb.append('@');
        sb.append(AbstractC0335s.c(this));
        return sb.toString();
    }

    public final CancellationException u() {
        CancellationException cancellationException;
        Object x2 = x();
        if (!(x2 instanceof S)) {
            if (x2 instanceof I) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(x2 instanceof C0327j)) {
                return new N(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0327j) x2).f4051a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new N(o(), th, this) : cancellationException;
        }
        Throwable d = ((S) x2).d();
        if (d == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = d instanceof CancellationException ? (CancellationException) d : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = o();
        }
        return new N(concat, d, this);
    }

    public boolean v() {
        return true;
    }

    public final V w(I i) {
        V b2 = i.b();
        if (b2 != null) {
            return b2;
        }
        if (i instanceof A) {
            return new V();
        }
        if (i instanceof P) {
            H((P) i);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + i).toString());
    }

    public final Object x() {
        while (true) {
            Object obj = f4030a.get(this);
            if (!(obj instanceof w1.n)) {
                return obj;
            }
            ((w1.n) obj).a(this);
        }
    }

    public boolean y(Throwable th) {
        return false;
    }

    public void z(X0.b bVar) {
        throw bVar;
    }
}
