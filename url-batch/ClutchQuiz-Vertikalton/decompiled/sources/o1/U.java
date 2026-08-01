package o1;

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
    public static final AtomicReferenceFieldUpdater f3327a = AtomicReferenceFieldUpdater.newUpdater(U.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3328b = AtomicReferenceFieldUpdater.newUpdater(U.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public U(boolean z2) {
        this._state = z2 ? AbstractC0299s.h : AbstractC0299s.f3364g;
    }

    public static C0289h C(s1.i iVar) {
        while (iVar.m()) {
            s1.i i = iVar.i();
            if (i == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.i.f3656b;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (s1.i) obj;
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
                if (iVar instanceof C0289h) {
                    return (C0289h) iVar;
                }
                if (iVar instanceof V) {
                    return null;
                }
            }
        }
    }

    public static String H(Object obj) {
        if (!(obj instanceof S)) {
            return obj instanceof I ? ((I) obj).a() ? "Active" : "New" : obj instanceof C0291j ? "Cancelled" : "Completed";
        }
        S s2 = (S) obj;
        return s2.e() ? "Cancelling" : s2.f() ? "Completing" : "Active";
    }

    public boolean A() {
        return false;
    }

    public final Object B(Object obj) {
        Object I2;
        do {
            I2 = I(w(), obj);
            if (I2 == AbstractC0299s.f3360b) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0291j c0291j = obj instanceof C0291j ? (C0291j) obj : null;
                throw new IllegalStateException(str, c0291j != null ? c0291j.f3348a : null);
            }
        } while (I2 == AbstractC0299s.d);
        return I2;
    }

    public final void D(V v2, Throwable th) {
        Object k2 = v2.k();
        g1.f.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        U0.c cVar = null;
        for (s1.i iVar = (s1.i) k2; !iVar.equals(v2); iVar = iVar.l()) {
            if (iVar instanceof O) {
                P p2 = (P) iVar;
                try {
                    p2.o(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        T.d.g(cVar, th2);
                    } else {
                        cVar = new U0.c("Exception in completion handler " + p2 + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            y(cVar);
        }
        l(th);
    }

    public void E(Object obj) {
    }

    public void F() {
    }

    public final void G(P p2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        V v2 = new V();
        p2.getClass();
        s1.i.f3656b.lazySet(v2, p2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s1.i.f3655a;
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
        s1.i l2 = p2.l();
        do {
            atomicReferenceFieldUpdater = f3327a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, p2, l2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == p2);
    }

    public final Object I(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof I)) {
            return AbstractC0299s.f3360b;
        }
        if (((obj instanceof A) || (obj instanceof P)) && !(obj instanceof C0289h) && !(obj2 instanceof C0291j)) {
            I i = (I) obj;
            Object j2 = obj2 instanceof I ? new J((I) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f3327a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, i, j2)) {
                    E(obj2);
                    o(i, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == i);
            return AbstractC0299s.d;
        }
        I i2 = (I) obj;
        V v2 = v(i2);
        if (v2 == null) {
            return AbstractC0299s.d;
        }
        C0289h c0289h = null;
        S s2 = i2 instanceof S ? (S) i2 : null;
        if (s2 == null) {
            s2 = new S(v2, null);
        }
        synchronized (s2) {
            if (s2.f()) {
                return AbstractC0299s.f3360b;
            }
            S.f3321b.set(s2, 1);
            if (s2 != i2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3327a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, i2, s2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != i2) {
                        return AbstractC0299s.d;
                    }
                }
            }
            boolean e2 = s2.e();
            C0291j c0291j = obj2 instanceof C0291j ? (C0291j) obj2 : null;
            if (c0291j != null) {
                s2.c(c0291j.f3348a);
            }
            Throwable d = s2.d();
            if (e2) {
                d = null;
            }
            if (d != null) {
                D(v2, d);
            }
            C0289h c0289h2 = i2 instanceof C0289h ? (C0289h) i2 : null;
            if (c0289h2 == null) {
                V b2 = i2.b();
                if (b2 != null) {
                    c0289h = C(b2);
                }
            } else {
                c0289h = c0289h2;
            }
            if (c0289h != null) {
                while (AbstractC0299s.f(c0289h.f3342e, false, new Q(this, s2, c0289h, obj2), 1) == W.f3329a) {
                    c0289h = C(c0289h);
                    if (c0289h == null) {
                    }
                }
                return AbstractC0299s.f3361c;
            }
            return r(s2, obj2);
        }
    }

    @Override // o1.M
    public boolean a() {
        Object w2 = w();
        return (w2 instanceof I) && ((I) w2).a();
    }

    public final boolean d(I i, V v2, P p2) {
        char c2;
        T t2 = new T(p2, this, i);
        do {
            s1.i i2 = v2.i();
            if (i2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.i.f3656b;
                Object obj = atomicReferenceFieldUpdater.get(v2);
                while (true) {
                    i2 = (s1.i) obj;
                    if (!i2.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(i2);
                }
            }
            s1.i.f3656b.lazySet(p2, i2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s1.i.f3655a;
            atomicReferenceFieldUpdater2.lazySet(p2, v2);
            t2.f3325c = v2;
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

    public void f(Object obj) {
    }

    public void g(Object obj) {
        f(obj);
    }

    @Override // X0.g
    public final X0.h getKey() {
        return C0297p.f3358b;
    }

    public final boolean i(Object obj) {
        T.r rVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0299s.f3360b;
        if (this instanceof a0) {
            do {
                Object w2 = w();
                if (!(w2 instanceof I) || ((w2 instanceof S) && ((S) w2).f())) {
                    obj2 = AbstractC0299s.f3360b;
                    break;
                }
                obj2 = I(w2, new C0291j(q(obj), false));
            } while (obj2 == AbstractC0299s.d);
            if (obj2 == AbstractC0299s.f3361c) {
                return true;
            }
        }
        if (obj2 == AbstractC0299s.f3360b) {
            Throwable th = null;
            loop1: while (true) {
                Object w3 = w();
                if (!(w3 instanceof S)) {
                    if (!(w3 instanceof I)) {
                        rVar = AbstractC0299s.f3362e;
                        break;
                    }
                    if (th == null) {
                        th = q(obj);
                    }
                    I i = (I) w3;
                    if (i.a()) {
                        V v2 = v(i);
                        if (v2 == null) {
                            continue;
                        } else {
                            S s2 = new S(v2, th);
                            do {
                                atomicReferenceFieldUpdater = f3327a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, i, s2)) {
                                    D(v2, th);
                                    rVar = AbstractC0299s.f3360b;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == i);
                        }
                    } else {
                        Object I2 = I(w3, new C0291j(th, false));
                        if (I2 == AbstractC0299s.f3360b) {
                            throw new IllegalStateException(("Cannot happen in " + w3).toString());
                        }
                        if (I2 != AbstractC0299s.d) {
                            obj2 = I2;
                            break;
                        }
                    }
                } else {
                    synchronized (w3) {
                        try {
                            S s3 = (S) w3;
                            s3.getClass();
                            if (S.d.get(s3) == AbstractC0299s.f3363f) {
                                rVar = AbstractC0299s.f3362e;
                            } else {
                                boolean e2 = ((S) w3).e();
                                if (th == null) {
                                    th = q(obj);
                                }
                                ((S) w3).c(th);
                                Throwable d = e2 ? null : ((S) w3).d();
                                if (d != null) {
                                    D(((S) w3).f3323a, d);
                                }
                                rVar = AbstractC0299s.f3360b;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = rVar;
        }
        if (obj2 == AbstractC0299s.f3360b || obj2 == AbstractC0299s.f3361c) {
            return true;
        }
        if (obj2 == AbstractC0299s.f3362e) {
            return false;
        }
        f(obj2);
        return true;
    }

    @Override // X0.i
    public final X0.g j(X0.h hVar) {
        return T.d.r(this, hVar);
    }

    @Override // X0.i
    public final X0.i k(X0.i iVar) {
        return T.d.G(this, iVar);
    }

    public final boolean l(Throwable th) {
        if (A()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0288g interfaceC0288g = (InterfaceC0288g) f3328b.get(this);
        return (interfaceC0288g == null || interfaceC0288g == W.f3329a) ? z2 : interfaceC0288g.h(th) || z2;
    }

    public String m() {
        return "Job was cancelled";
    }

    public boolean n(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return i(th) && t();
    }

    public final void o(I i, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3328b;
        InterfaceC0288g interfaceC0288g = (InterfaceC0288g) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0288g != null) {
            interfaceC0288g.e();
            atomicReferenceFieldUpdater.set(this, W.f3329a);
        }
        U0.c cVar = null;
        C0291j c0291j = obj instanceof C0291j ? (C0291j) obj : null;
        Throwable th = c0291j != null ? c0291j.f3348a : null;
        if (i instanceof P) {
            try {
                ((P) i).o(th);
                return;
            } catch (Throwable th2) {
                y(new U0.c("Exception in completion handler " + i + " for " + this, th2));
                return;
            }
        }
        V b2 = i.b();
        if (b2 != null) {
            Object k2 = b2.k();
            g1.f.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (s1.i iVar = (s1.i) k2; !iVar.equals(b2); iVar = iVar.l()) {
                if (iVar instanceof P) {
                    P p2 = (P) iVar;
                    try {
                        p2.o(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            T.d.g(cVar, th3);
                        } else {
                            cVar = new U0.c("Exception in completion handler " + p2 + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                y(cVar);
            }
        }
    }

    @Override // X0.i
    public final X0.i p(X0.h hVar) {
        return T.d.A(this, hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable q(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        U u2 = (U) ((Y) obj);
        Object w2 = u2.w();
        if (w2 instanceof S) {
            cancellationException = ((S) w2).d();
        } else if (w2 instanceof C0291j) {
            cancellationException = ((C0291j) w2).f3348a;
        } else {
            if (w2 instanceof I) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + w2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new N("Parent job is ".concat(H(w2)), cancellationException, u2);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object r(S s2, Object obj) {
        Throwable th = null;
        C0291j c0291j = obj instanceof C0291j ? (C0291j) obj : null;
        Throwable th2 = c0291j != null ? c0291j.f3348a : null;
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
                th = new N(m(), null, this);
            }
            if (th != null && g2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                for (Throwable th3 : g2) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        T.d.g(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0291j(th, false);
        }
        if (th != null && (l(th) || x(th))) {
            g1.f.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0291j.f3347b.compareAndSet((C0291j) obj, 0, 1);
        }
        E(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3327a;
        Object j2 = obj instanceof I ? new J((I) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, s2, j2) && atomicReferenceFieldUpdater.get(this) == s2) {
        }
        o(s2, obj);
        return obj;
    }

    public final CancellationException s() {
        CancellationException cancellationException;
        Object w2 = w();
        if (!(w2 instanceof S)) {
            if (w2 instanceof I) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(w2 instanceof C0291j)) {
                return new N(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0291j) w2).f3348a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new N(m(), th, this) : cancellationException;
        }
        Throwable d = ((S) w2).d();
        if (d == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = d instanceof CancellationException ? (CancellationException) d : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = m();
        }
        return new N(concat, d, this);
    }

    public boolean t() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + H(w()) + '}');
        sb.append('@');
        sb.append(AbstractC0299s.d(this));
        return sb.toString();
    }

    @Override // X0.i
    public final Object u(Object obj, f1.p pVar) {
        return pVar.d(obj, this);
    }

    public final V v(I i) {
        V b2 = i.b();
        if (b2 != null) {
            return b2;
        }
        if (i instanceof A) {
            return new V();
        }
        if (i instanceof P) {
            G((P) i);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + i).toString());
    }

    public final Object w() {
        while (true) {
            Object obj = f3327a.get(this);
            if (!(obj instanceof s1.n)) {
                return obj;
            }
            ((s1.n) obj).a(this);
        }
    }

    public boolean x(Throwable th) {
        return false;
    }

    public void y(U0.c cVar) {
        throw cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[EDGE_INSN: B:31:0x0055->B:25:0x0055 BREAK  A[LOOP:0: B:7:0x000c->B:30:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(M m2) {
        boolean z2;
        W w2 = W.f3329a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3328b;
        if (m2 == null) {
            atomicReferenceFieldUpdater.set(this, w2);
            return;
        }
        U u2 = (U) m2;
        do {
            Object w3 = u2.w();
            boolean z3 = w3 instanceof A;
            z2 = false;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3327a;
            if (z3) {
                if (!((A) w3).f3305a) {
                    A a2 = AbstractC0299s.h;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(u2, w3, a2)) {
                        if (atomicReferenceFieldUpdater2.get(u2) != w3) {
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
                if (w3 instanceof H) {
                    V v2 = ((H) w3).f3312a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(u2, w3, v2)) {
                        if (atomicReferenceFieldUpdater2.get(u2) != w3) {
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
        InterfaceC0288g interfaceC0288g = (InterfaceC0288g) AbstractC0299s.f(u2, true, new C0289h(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0288g);
        if (w() instanceof I) {
            return;
        }
        interfaceC0288g.e();
        atomicReferenceFieldUpdater.set(this, w2);
    }
}
