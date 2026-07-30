package k1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class q0 implements v0.f {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f714b = AtomicReferenceFieldUpdater.newUpdater(q0.class, Object.class, "_state");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f715c = AtomicReferenceFieldUpdater.newUpdater(q0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public q0(boolean z2) {
        this._state = z2 ? t.f725i : t.f724h;
    }

    public static h D(p1.l lVar) {
        while (lVar.m()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p1.l.f1060c;
            p1.l i2 = lVar.i();
            if (i2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(lVar);
                while (true) {
                    lVar = (p1.l) obj;
                    if (!lVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVar);
                }
            } else {
                lVar = i2;
            }
        }
        while (true) {
            lVar = lVar.l();
            if (!lVar.m()) {
                if (lVar instanceof h) {
                    return (h) lVar;
                }
                if (lVar instanceof r0) {
                    return null;
                }
            }
        }
    }

    public static String I(Object obj) {
        if (!(obj instanceof o0)) {
            return obj instanceof g0 ? ((g0) obj).f() ? "Active" : "New" : obj instanceof j ? "Cancelled" : "Completed";
        }
        o0 o0Var = (o0) obj;
        return o0Var.c() ? "Cancelling" : o0Var.d() ? "Completing" : "Active";
    }

    public final void A(q0 q0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f715c;
        s0 s0Var = s0.f716b;
        if (q0Var == null) {
            atomicReferenceFieldUpdater.set(this, s0Var);
            return;
        }
        loop0: while (true) {
            Object x2 = q0Var.x();
            boolean z2 = x2 instanceof a0;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f714b;
            if (!z2) {
                if (!(x2 instanceof f0)) {
                    break;
                }
                r0 r0Var = ((f0) x2).f679b;
                while (!atomicReferenceFieldUpdater2.compareAndSet(q0Var, x2, r0Var)) {
                    if (atomicReferenceFieldUpdater2.get(q0Var) != x2) {
                        break;
                    }
                }
                q0Var.getClass();
                break loop0;
            }
            if (!((a0) x2).f662b) {
                a0 a0Var = t.f725i;
                while (!atomicReferenceFieldUpdater2.compareAndSet(q0Var, x2, a0Var)) {
                    if (atomicReferenceFieldUpdater2.get(q0Var) != x2) {
                        break;
                    }
                }
                q0Var.getClass();
                break loop0;
            }
            break;
        }
        g gVar = (g) t.d(q0Var, new h(this), 2);
        atomicReferenceFieldUpdater.set(this, gVar);
        if (x() instanceof g0) {
            return;
        }
        gVar.b();
        atomicReferenceFieldUpdater.set(this, s0Var);
    }

    public boolean B() {
        Object x2 = x();
        return (x2 instanceof g0) && ((g0) x2).f();
    }

    public final Object C(Object obj) {
        Object J;
        do {
            J = J(x(), obj);
            if (J == t.f719c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                j jVar = obj instanceof j ? (j) obj : null;
                throw new IllegalStateException(str, jVar != null ? jVar.f689a : null);
            }
        } while (J == t.f721e);
        return J;
    }

    public final void E(r0 r0Var, Throwable th) {
        Object k2 = r0Var.k();
        k2.getClass();
        c0.c cVar = null;
        for (p1.l lVar = (p1.l) k2; !lVar.equals(r0Var); lVar = lVar.l()) {
            if (lVar instanceof k0) {
                m0 m0Var = (m0) lVar;
                try {
                    m0Var.o(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        a.a.a(cVar, th2);
                    } else {
                        cVar = new c0.c("Exception in completion handler " + m0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            z(cVar);
        }
        p(th);
    }

    public final void H(m0 m0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        r0 r0Var = new r0();
        m0Var.getClass();
        p1.l.f1060c.lazySet(r0Var, m0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p1.l.f1059b;
        atomicReferenceFieldUpdater2.lazySet(r0Var, m0Var);
        loop0: while (true) {
            if (m0Var.k() == m0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(m0Var, m0Var, r0Var)) {
                    if (atomicReferenceFieldUpdater2.get(m0Var) != m0Var) {
                        break;
                    }
                }
                r0Var.j(m0Var);
                break loop0;
            }
            break;
        }
        p1.l l2 = m0Var.l();
        do {
            atomicReferenceFieldUpdater = f714b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, m0Var, l2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == m0Var);
    }

    public final Object J(Object obj, Object obj2) {
        if (!(obj instanceof g0)) {
            return t.f719c;
        }
        if (((obj instanceof a0) || (obj instanceof m0)) && !(obj instanceof h) && !(obj2 instanceof j)) {
            g0 g0Var = (g0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f714b;
            Object h0Var = obj2 instanceof g0 ? new h0((g0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, g0Var, h0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != g0Var) {
                    return t.f721e;
                }
            }
            F(obj2);
            r(g0Var, obj2);
            return obj2;
        }
        g0 g0Var2 = (g0) obj;
        r0 w2 = w(g0Var2);
        if (w2 == null) {
            return t.f721e;
        }
        h hVar = null;
        o0 o0Var = g0Var2 instanceof o0 ? (o0) g0Var2 : null;
        if (o0Var == null) {
            o0Var = new o0(w2, null);
        }
        synchronized (o0Var) {
            if (o0Var.d()) {
                return t.f719c;
            }
            o0.f703c.set(o0Var, 1);
            if (o0Var != g0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f714b;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, g0Var2, o0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != g0Var2) {
                        return t.f721e;
                    }
                }
            }
            boolean c2 = o0Var.c();
            j jVar = obj2 instanceof j ? (j) obj2 : null;
            if (jVar != null) {
                o0Var.a(jVar.f689a);
            }
            Throwable b2 = o0Var.b();
            if (c2) {
                b2 = null;
            }
            if (b2 != null) {
                E(w2, b2);
            }
            h hVar2 = g0Var2 instanceof h ? (h) g0Var2 : null;
            if (hVar2 == null) {
                r0 e2 = g0Var2.e();
                if (e2 != null) {
                    hVar = D(e2);
                }
            } else {
                hVar = hVar2;
            }
            if (hVar != null) {
                while (t.d(hVar.f680f, new n0(this, o0Var, hVar, obj2), 1) == s0.f716b) {
                    hVar = D(hVar);
                    if (hVar == null) {
                    }
                }
                return t.f720d;
            }
            return t(o0Var, obj2);
        }
    }

    @Override // v0.h
    public final Object a(Object obj, c1.p pVar) {
        return pVar.g(obj, this);
    }

    public void g(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new j0(q(), null, this);
        }
        o(cancellationException);
    }

    @Override // v0.f
    public final v0.g getKey() {
        return q.f713c;
    }

    @Override // v0.h
    public final v0.h h(v0.h hVar) {
        return a.a.r(this, hVar);
    }

    @Override // v0.h
    public final v0.h i(v0.g gVar) {
        gVar.getClass();
        return d1.h.a(q.f713c, gVar) ? v0.i.f1196b : this;
    }

    @Override // v0.h
    public final v0.f j(v0.g gVar) {
        gVar.getClass();
        if (d1.h.a(q.f713c, gVar)) {
            return this;
        }
        return null;
    }

    public final boolean k(g0 g0Var, r0 r0Var, m0 m0Var) {
        p1.l i2;
        p0 p0Var = new p0(m0Var, this, g0Var);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p1.l.f1060c;
            i2 = r0Var.i();
            if (i2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(r0Var);
                while (true) {
                    i2 = (p1.l) obj;
                    if (!i2.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(i2);
                }
            }
            p1.l.f1060c.lazySet(m0Var, i2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p1.l.f1059b;
            atomicReferenceFieldUpdater2.lazySet(m0Var, r0Var);
            p0Var.f709c = r0Var;
            while (!atomicReferenceFieldUpdater2.compareAndSet(i2, r0Var, p0Var)) {
                if (atomicReferenceFieldUpdater2.get(i2) != r0Var) {
                    break;
                }
            }
        }
        return p0Var.b(i2) == null;
    }

    public void m(Object obj) {
        l(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0 == k1.t.f720d) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(Object obj) {
        o0.a aVar;
        Object obj2 = t.f719c;
        if (this instanceof l0) {
            do {
                Object x2 = x();
                if (!(x2 instanceof g0) || ((x2 instanceof o0) && ((o0) x2).d())) {
                    obj2 = t.f719c;
                    break;
                }
                obj2 = J(x2, new j(s(obj), false));
            } while (obj2 == t.f721e);
        }
        if (obj2 == t.f719c) {
            Throwable th = null;
            loop1: while (true) {
                Object x3 = x();
                if (!(x3 instanceof o0)) {
                    if (!(x3 instanceof g0)) {
                        aVar = t.f722f;
                        break;
                    }
                    if (th == null) {
                        th = s(obj);
                    }
                    g0 g0Var = (g0) x3;
                    if (g0Var.f()) {
                        r0 w2 = w(g0Var);
                        if (w2 != null) {
                            o0 o0Var = new o0(w2, th);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f714b;
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, g0Var, o0Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != g0Var) {
                                    break;
                                }
                            }
                            E(w2, th);
                            aVar = t.f719c;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object J = J(x3, new j(th, false));
                        if (J == t.f719c) {
                            f0.l.f("Cannot happen in ", x3);
                            return false;
                        }
                        if (J != t.f721e) {
                            obj2 = J;
                            break;
                        }
                    }
                } else {
                    synchronized (x3) {
                        if (o0.f705e.get((o0) x3) == t.f723g) {
                            aVar = t.f722f;
                        } else {
                            boolean c2 = ((o0) x3).c();
                            if (th == null) {
                                th = s(obj);
                            }
                            ((o0) x3).a(th);
                            Throwable b2 = c2 ? null : ((o0) x3).b();
                            if (b2 != null) {
                                E(((o0) x3).f706b, b2);
                            }
                            aVar = t.f719c;
                        }
                    }
                }
            }
            obj2 = aVar;
        }
        if (obj2 != t.f719c && obj2 != t.f720d) {
            if (obj2 == t.f722f) {
                return false;
            }
            l(obj2);
            return true;
        }
        return true;
    }

    public void o(CancellationException cancellationException) {
        n(cancellationException);
    }

    public final boolean p(Throwable th) {
        if (this instanceof p1.t) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        g gVar = (g) f715c.get(this);
        return (gVar == null || gVar == s0.f716b) ? z2 : gVar.d(th) || z2;
    }

    public String q() {
        return "Job was cancelled";
    }

    public final void r(g0 g0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f715c;
        g gVar = (g) atomicReferenceFieldUpdater.get(this);
        if (gVar != null) {
            gVar.b();
            atomicReferenceFieldUpdater.set(this, s0.f716b);
        }
        c0.c cVar = null;
        j jVar = obj instanceof j ? (j) obj : null;
        Throwable th = jVar != null ? jVar.f689a : null;
        if (g0Var instanceof m0) {
            try {
                ((m0) g0Var).o(th);
                return;
            } catch (Throwable th2) {
                z(new c0.c("Exception in completion handler " + g0Var + " for " + this, th2));
                return;
            }
        }
        r0 e2 = g0Var.e();
        if (e2 != null) {
            Object k2 = e2.k();
            k2.getClass();
            for (p1.l lVar = (p1.l) k2; !lVar.equals(e2); lVar = lVar.l()) {
                if (lVar instanceof m0) {
                    m0 m0Var = (m0) lVar;
                    try {
                        m0Var.o(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            a.a.a(cVar, th3);
                        } else {
                            cVar = new c0.c("Exception in completion handler " + m0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                z(cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Throwable] */
    public final Throwable s(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        q0 q0Var = (q0) obj;
        Object x2 = q0Var.x();
        if (x2 instanceof o0) {
            cancellationException = ((o0) x2).b();
        } else if (x2 instanceof j) {
            cancellationException = ((j) x2).f689a;
        } else {
            if (x2 instanceof g0) {
                f0.l.f("Cannot be cancelling child in this state: ", x2);
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new j0("Parent job is ".concat(I(x2)), cancellationException, q0Var) : cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object t(o0 o0Var, Object obj) {
        Throwable th = null;
        j jVar = obj instanceof j ? (j) obj : null;
        Throwable th2 = jVar != null ? jVar.f689a : null;
        synchronized (o0Var) {
            o0Var.c();
            ArrayList g2 = o0Var.g(th2);
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
            } else if (o0Var.c()) {
                th = new j0(q(), null, this);
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
                        a.a.a(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new j(th, false);
        }
        if (th != null && (p(th) || y(th))) {
            obj.getClass();
            j.f688b.compareAndSet((j) obj, 0, 1);
        }
        F(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f714b;
        Object h0Var = obj instanceof g0 ? new h0((g0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, o0Var, h0Var) && atomicReferenceFieldUpdater.get(this) == o0Var) {
        }
        r(o0Var, obj);
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + I(x()) + '}');
        sb.append('@');
        sb.append(t.a(this));
        return sb.toString();
    }

    public final CancellationException u() {
        CancellationException cancellationException;
        Object x2 = x();
        if (x2 instanceof o0) {
            Throwable b2 = ((o0) x2).b();
            if (b2 == null) {
                f0.l.f("Job is still new or active: ", this);
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = b2 instanceof CancellationException ? (CancellationException) b2 : null;
            return cancellationException == null ? new j0(concat, b2, this) : cancellationException;
        }
        if (x2 instanceof g0) {
            f0.l.f("Job is still new or active: ", this);
            return null;
        }
        if (!(x2 instanceof j)) {
            return new j0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((j) x2).f689a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new j0(q(), th, this) : cancellationException;
    }

    public boolean v() {
        return true;
    }

    public final r0 w(g0 g0Var) {
        r0 e2 = g0Var.e();
        if (e2 != null) {
            return e2;
        }
        if (g0Var instanceof a0) {
            return new r0();
        }
        if (g0Var instanceof m0) {
            H((m0) g0Var);
            return null;
        }
        f0.l.f("State should have list: ", g0Var);
        return null;
    }

    public final Object x() {
        while (true) {
            Object obj = f714b.get(this);
            if (!(obj instanceof p1.b)) {
                return obj;
            }
            ((p1.b) obj).b(this);
        }
    }

    public boolean y(Throwable th) {
        return false;
    }

    public void F(Object obj) {
    }

    public void l(Object obj) {
    }

    public void z(c0.c cVar) {
        throw cVar;
    }

    public void G() {
    }
}
