package r1;

import a.AbstractC0058a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class V implements N, Z {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4060a = AtomicReferenceFieldUpdater.newUpdater(V.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4061b = AtomicReferenceFieldUpdater.newUpdater(V.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public V(boolean z2) {
        this._state = z2 ? AbstractC0369t.i : AbstractC0369t.f4097h;
    }

    public static String F(Object obj) {
        if (!(obj instanceof T)) {
            return obj instanceof J ? ((J) obj).a() ? "Active" : "New" : obj instanceof C0361k ? "Cancelled" : "Completed";
        }
        T t2 = (T) obj;
        return t2.e() ? "Cancelling" : t2.f() ? "Completing" : "Active";
    }

    public static C0359i y(w1.j jVar) {
        while (jVar.m()) {
            w1.j i = jVar.i();
            if (i == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w1.j.f4483b;
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (w1.j) obj;
                    if (!jVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = i;
            }
        }
        while (true) {
            jVar = jVar.l();
            if (!jVar.m()) {
                if (jVar instanceof C0359i) {
                    return (C0359i) jVar;
                }
                if (jVar instanceof W) {
                    return null;
                }
            }
        }
    }

    public final void A(W w2, Throwable th) {
        Object k2 = w2.k();
        j1.h.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        W0.c cVar = null;
        for (w1.j jVar = (w1.j) k2; !jVar.equals(w2); jVar = jVar.l()) {
            if (jVar instanceof P) {
                Q q2 = (Q) jVar;
                try {
                    q2.o(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        AbstractC0058a.a(cVar, th2);
                    } else {
                        cVar = new W0.c("Exception in completion handler " + q2 + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            u(cVar);
        }
        i(th);
    }

    @Override // a1.i
    public final a1.i B(a1.i iVar) {
        return AbstractC0058a.R(this, iVar);
    }

    public void C(Object obj) {
    }

    public void D() {
    }

    public final void E(Q q2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        W w2 = new W();
        q2.getClass();
        w1.j.f4483b.lazySet(w2, q2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w1.j.f4482a;
        atomicReferenceFieldUpdater2.lazySet(w2, q2);
        loop0: while (true) {
            if (q2.k() == q2) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(q2, q2, w2)) {
                    if (atomicReferenceFieldUpdater2.get(q2) != q2) {
                        break;
                    }
                }
                w2.j(q2);
                break loop0;
            }
            break;
        }
        w1.j l2 = q2.l();
        do {
            atomicReferenceFieldUpdater = f4060a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, q2, l2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == q2);
    }

    public final Object G(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof J)) {
            return AbstractC0369t.f4093c;
        }
        if (((obj instanceof B) || (obj instanceof Q)) && !(obj instanceof C0359i) && !(obj2 instanceof C0361k)) {
            J j = (J) obj;
            Object k2 = obj2 instanceof J ? new K((J) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f4060a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, j, k2)) {
                    C(obj2);
                    l(j, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == j);
            return AbstractC0369t.e;
        }
        J j2 = (J) obj;
        W r2 = r(j2);
        if (r2 == null) {
            return AbstractC0369t.e;
        }
        C0359i c0359i = null;
        T t2 = j2 instanceof T ? (T) j2 : null;
        if (t2 == null) {
            t2 = new T(r2, null);
        }
        synchronized (t2) {
            if (t2.f()) {
                return AbstractC0369t.f4093c;
            }
            T.f4053b.set(t2, 1);
            if (t2 != j2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4060a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, j2, t2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != j2) {
                        return AbstractC0369t.e;
                    }
                }
            }
            boolean e = t2.e();
            C0361k c0361k = obj2 instanceof C0361k ? (C0361k) obj2 : null;
            if (c0361k != null) {
                t2.c(c0361k.f4079a);
            }
            Throwable d2 = t2.d();
            if (e) {
                d2 = null;
            }
            if (d2 != null) {
                A(r2, d2);
            }
            C0359i c0359i2 = j2 instanceof C0359i ? (C0359i) j2 : null;
            if (c0359i2 == null) {
                W b2 = j2.b();
                if (b2 != null) {
                    c0359i = y(b2);
                }
            } else {
                c0359i = c0359i2;
            }
            if (c0359i != null) {
                while (AbstractC0369t.f(c0359i.e, false, new S(this, t2, c0359i, obj2), 1) == X.f4062a) {
                    c0359i = y(c0359i);
                    if (c0359i == null) {
                    }
                }
                return AbstractC0369t.f4094d;
            }
            return n(t2, obj2);
        }
    }

    @Override // r1.N
    public boolean a() {
        Object s2 = s();
        return (s2 instanceof J) && ((J) s2).a();
    }

    public final boolean c(J j, W w2, Q q2) {
        char c2;
        U u2 = new U(q2, this, j);
        do {
            w1.j i = w2.i();
            if (i == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w1.j.f4483b;
                Object obj = atomicReferenceFieldUpdater.get(w2);
                while (true) {
                    i = (w1.j) obj;
                    if (!i.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(i);
                }
            }
            w1.j.f4483b.lazySet(q2, i);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w1.j.f4482a;
            atomicReferenceFieldUpdater2.lazySet(q2, w2);
            u2.f4058c = w2;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(i, w2, u2)) {
                    c2 = u2.a(i) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(i) != w2) {
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

    @Override // a1.i
    public final a1.g d(a1.h hVar) {
        return AbstractC0058a.s(this, hVar);
    }

    public void e(Object obj) {
    }

    public void f(Object obj) {
        e(obj);
    }

    public final void g(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new O(j(), null, this);
        }
        h(cancellationException);
    }

    @Override // a1.g
    public final a1.h getKey() {
        return C0367q.f4090b;
    }

    public final boolean h(Object obj) {
        V.q qVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0369t.f4093c;
        if (this instanceof b0) {
            do {
                Object s2 = s();
                if (!(s2 instanceof J) || ((s2 instanceof T) && ((T) s2).f())) {
                    obj2 = AbstractC0369t.f4093c;
                    break;
                }
                obj2 = G(s2, new C0361k(m(obj), false));
            } while (obj2 == AbstractC0369t.e);
            if (obj2 == AbstractC0369t.f4094d) {
                return true;
            }
        }
        if (obj2 == AbstractC0369t.f4093c) {
            Throwable th = null;
            loop1: while (true) {
                Object s3 = s();
                if (!(s3 instanceof T)) {
                    if (!(s3 instanceof J)) {
                        qVar = AbstractC0369t.f4095f;
                        break;
                    }
                    if (th == null) {
                        th = m(obj);
                    }
                    J j = (J) s3;
                    if (j.a()) {
                        W r2 = r(j);
                        if (r2 == null) {
                            continue;
                        } else {
                            T t2 = new T(r2, th);
                            do {
                                atomicReferenceFieldUpdater = f4060a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, j, t2)) {
                                    A(r2, th);
                                    qVar = AbstractC0369t.f4093c;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == j);
                        }
                    } else {
                        Object G2 = G(s3, new C0361k(th, false));
                        if (G2 == AbstractC0369t.f4093c) {
                            throw new IllegalStateException(("Cannot happen in " + s3).toString());
                        }
                        if (G2 != AbstractC0369t.e) {
                            obj2 = G2;
                            break;
                        }
                    }
                } else {
                    synchronized (s3) {
                        try {
                            T t3 = (T) s3;
                            t3.getClass();
                            if (T.f4055d.get(t3) == AbstractC0369t.f4096g) {
                                qVar = AbstractC0369t.f4095f;
                            } else {
                                boolean e = ((T) s3).e();
                                if (th == null) {
                                    th = m(obj);
                                }
                                ((T) s3).c(th);
                                Throwable d2 = e ? null : ((T) s3).d();
                                if (d2 != null) {
                                    A(((T) s3).f4056a, d2);
                                }
                                qVar = AbstractC0369t.f4093c;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = qVar;
        }
        if (obj2 == AbstractC0369t.f4093c || obj2 == AbstractC0369t.f4094d) {
            return true;
        }
        if (obj2 == AbstractC0369t.f4095f) {
            return false;
        }
        e(obj2);
        return true;
    }

    public final boolean i(Throwable th) {
        if (w()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0358h interfaceC0358h = (InterfaceC0358h) f4061b.get(this);
        return (interfaceC0358h == null || interfaceC0358h == X.f4062a) ? z2 : interfaceC0358h.h(th) || z2;
    }

    public String j() {
        return "Job was cancelled";
    }

    public boolean k(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return h(th) && p();
    }

    public final void l(J j, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4061b;
        InterfaceC0358h interfaceC0358h = (InterfaceC0358h) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0358h != null) {
            interfaceC0358h.e();
            atomicReferenceFieldUpdater.set(this, X.f4062a);
        }
        W0.c cVar = null;
        C0361k c0361k = obj instanceof C0361k ? (C0361k) obj : null;
        Throwable th = c0361k != null ? c0361k.f4079a : null;
        if (j instanceof Q) {
            try {
                ((Q) j).o(th);
                return;
            } catch (Throwable th2) {
                u(new W0.c("Exception in completion handler " + j + " for " + this, th2));
                return;
            }
        }
        W b2 = j.b();
        if (b2 != null) {
            Object k2 = b2.k();
            j1.h.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (w1.j jVar = (w1.j) k2; !jVar.equals(b2); jVar = jVar.l()) {
                if (jVar instanceof Q) {
                    Q q2 = (Q) jVar;
                    try {
                        q2.o(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            AbstractC0058a.a(cVar, th3);
                        } else {
                            cVar = new W0.c("Exception in completion handler " + q2 + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                u(cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable m(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        V v2 = (V) ((Z) obj);
        Object s2 = v2.s();
        if (s2 instanceof T) {
            cancellationException = ((T) s2).d();
        } else if (s2 instanceof C0361k) {
            cancellationException = ((C0361k) s2).f4079a;
        } else {
            if (s2 instanceof J) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + s2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new O("Parent job is ".concat(F(s2)), cancellationException, v2);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object n(T t2, Object obj) {
        Throwable th = null;
        C0361k c0361k = obj instanceof C0361k ? (C0361k) obj : null;
        Throwable th2 = c0361k != null ? c0361k.f4079a : null;
        synchronized (t2) {
            t2.e();
            ArrayList<Throwable> g2 = t2.g(th2);
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
            } else if (t2.e()) {
                th = new O(j(), null, this);
            }
            if (th != null && g2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                for (Throwable th3 : g2) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        AbstractC0058a.a(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0361k(th, false);
        }
        if (th != null && (i(th) || t(th))) {
            j1.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0361k.f4078b.compareAndSet((C0361k) obj, 0, 1);
        }
        C(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4060a;
        Object k2 = obj instanceof J ? new K((J) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, t2, k2) && atomicReferenceFieldUpdater.get(this) == t2) {
        }
        l(t2, obj);
        return obj;
    }

    public final CancellationException o() {
        CancellationException cancellationException;
        Object s2 = s();
        if (!(s2 instanceof T)) {
            if (s2 instanceof J) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(s2 instanceof C0361k)) {
                return new O(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0361k) s2).f4079a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new O(j(), th, this) : cancellationException;
        }
        Throwable d2 = ((T) s2).d();
        if (d2 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = d2 instanceof CancellationException ? (CancellationException) d2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = j();
        }
        return new O(concat, d2, this);
    }

    public boolean p() {
        return true;
    }

    @Override // a1.i
    public final Object q(Object obj, i1.p pVar) {
        return pVar.d(obj, this);
    }

    public final W r(J j) {
        W b2 = j.b();
        if (b2 != null) {
            return b2;
        }
        if (j instanceof B) {
            return new W();
        }
        if (j instanceof Q) {
            E((Q) j);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + j).toString());
    }

    public final Object s() {
        while (true) {
            Object obj = f4060a.get(this);
            if (!(obj instanceof w1.p)) {
                return obj;
            }
            ((w1.p) obj).a(this);
        }
    }

    public boolean t(Throwable th) {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + F(s()) + '}');
        sb.append('@');
        sb.append(AbstractC0369t.c(this));
        return sb.toString();
    }

    public void u(W0.c cVar) {
        throw cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[EDGE_INSN: B:31:0x0055->B:25:0x0055 BREAK  A[LOOP:0: B:7:0x000c->B:30:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(N n2) {
        boolean z2;
        X x2 = X.f4062a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4061b;
        if (n2 == null) {
            atomicReferenceFieldUpdater.set(this, x2);
            return;
        }
        V v2 = (V) n2;
        do {
            Object s2 = v2.s();
            boolean z3 = s2 instanceof B;
            z2 = false;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4060a;
            if (z3) {
                if (!((B) s2).f4036a) {
                    B b2 = AbstractC0369t.i;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(v2, s2, b2)) {
                        if (atomicReferenceFieldUpdater2.get(v2) != s2) {
                            z2 = -1;
                            break;
                        }
                    }
                    v2.getClass();
                    z2 = true;
                }
                if (z2) {
                    break;
                }
            } else {
                if (s2 instanceof I) {
                    W w2 = ((I) s2).f4044a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(v2, s2, w2)) {
                        if (atomicReferenceFieldUpdater2.get(v2) != s2) {
                            z2 = -1;
                            break;
                        }
                    }
                    v2.getClass();
                    z2 = true;
                }
                if (z2) {
                }
            }
        } while (!z2);
        InterfaceC0358h interfaceC0358h = (InterfaceC0358h) AbstractC0369t.f(v2, true, new C0359i(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0358h);
        if (s() instanceof J) {
            return;
        }
        interfaceC0358h.e();
        atomicReferenceFieldUpdater.set(this, x2);
    }

    public boolean w() {
        return false;
    }

    public final Object x(Object obj) {
        Object G2;
        do {
            G2 = G(s(), obj);
            if (G2 == AbstractC0369t.f4093c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0361k c0361k = obj instanceof C0361k ? (C0361k) obj : null;
                throw new IllegalStateException(str, c0361k != null ? c0361k.f4079a : null);
            }
        } while (G2 == AbstractC0369t.e);
        return G2;
    }

    @Override // a1.i
    public final a1.i z(a1.h hVar) {
        return AbstractC0058a.N(this, hVar);
    }
}
