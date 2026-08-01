package k0;

import a.AbstractC0016a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class T implements K, X {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f903b = AtomicReferenceFieldUpdater.newUpdater(T.class, Object.class, "_state");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f904c = AtomicReferenceFieldUpdater.newUpdater(T.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public T(boolean z) {
        this._state = z ? AbstractC0058t.f945i : AbstractC0058t.f944h;
    }

    public static C0048i D(p0.l lVar) {
        while (lVar.m()) {
            p0.l i2 = lVar.i();
            if (i2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p0.l.f1161c;
                Object obj = atomicReferenceFieldUpdater.get(lVar);
                while (true) {
                    lVar = (p0.l) obj;
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
                if (lVar instanceof C0048i) {
                    return (C0048i) lVar;
                }
                if (lVar instanceof U) {
                    return null;
                }
            }
        }
    }

    public static String I(Object obj) {
        if (!(obj instanceof Q)) {
            return obj instanceof H ? ((H) obj).b() ? "Active" : "New" : obj instanceof C0050k ? "Cancelled" : "Completed";
        }
        Q q2 = (Q) obj;
        return q2.e() ? "Cancelling" : q2.f() ? "Completing" : "Active";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[EDGE_INSN: B:31:0x0055->B:25:0x0055 BREAK  A[LOOP:0: B:7:0x000c->B:30:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(K k2) {
        boolean z;
        V v2 = V.f905b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f904c;
        if (k2 == null) {
            atomicReferenceFieldUpdater.set(this, v2);
            return;
        }
        T t = (T) k2;
        do {
            Object y2 = t.y();
            boolean z2 = y2 instanceof A;
            z = false;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f903b;
            if (z2) {
                if (!((A) y2).f876b) {
                    A a2 = AbstractC0058t.f945i;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(t, y2, a2)) {
                        if (atomicReferenceFieldUpdater2.get(t) != y2) {
                            z = -1;
                            break;
                        }
                    }
                    t.getClass();
                    z = true;
                }
                if (z) {
                    break;
                }
            } else {
                if (y2 instanceof G) {
                    U u2 = ((G) y2).f884b;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(t, y2, u2)) {
                        if (atomicReferenceFieldUpdater2.get(t) != y2) {
                            z = -1;
                            break;
                        }
                    }
                    t.getClass();
                    z = true;
                }
                if (z) {
                }
            }
        } while (!z);
        InterfaceC0047h interfaceC0047h = (InterfaceC0047h) AbstractC0058t.d(t, true, new C0048i(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0047h);
        if (y() instanceof H) {
            return;
        }
        interfaceC0047h.d();
        atomicReferenceFieldUpdater.set(this, v2);
    }

    public final Object C(Object obj) {
        Object J;
        do {
            J = J(y(), obj);
            if (J == AbstractC0058t.f939c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0050k c0050k = obj instanceof C0050k ? (C0050k) obj : null;
                throw new IllegalStateException(str, c0050k != null ? c0050k.f925a : null);
            }
        } while (J == AbstractC0058t.f941e);
        return J;
    }

    public final void E(U u2, Throwable th) {
        Object k2 = u2.k();
        e0.h.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        A.c cVar = null;
        for (p0.l lVar = (p0.l) k2; !lVar.equals(u2); lVar = lVar.l()) {
            if (lVar instanceof M) {
                O o2 = (O) lVar;
                try {
                    o2.o(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        AbstractC0016a.a(cVar, th2);
                    } else {
                        cVar = new A.c("Exception in completion handler " + o2 + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            A(cVar);
        }
        q(th);
    }

    public final void H(O o2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        U u2 = new U();
        o2.getClass();
        p0.l.f1161c.lazySet(u2, o2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p0.l.f1160b;
        atomicReferenceFieldUpdater2.lazySet(u2, o2);
        loop0: while (true) {
            if (o2.k() == o2) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(o2, o2, u2)) {
                    if (atomicReferenceFieldUpdater2.get(o2) != o2) {
                        break;
                    }
                }
                u2.j(o2);
                break loop0;
            }
            break;
        }
        p0.l l2 = o2.l();
        do {
            atomicReferenceFieldUpdater = f903b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, o2, l2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == o2);
    }

    public final Object J(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof H)) {
            return AbstractC0058t.f939c;
        }
        if (((obj instanceof A) || (obj instanceof O)) && !(obj instanceof C0048i) && !(obj2 instanceof C0050k)) {
            H h2 = (H) obj;
            Object i2 = obj2 instanceof H ? new I((H) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f903b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, h2, i2)) {
                    F(obj2);
                    s(h2, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == h2);
            return AbstractC0058t.f941e;
        }
        H h3 = (H) obj;
        U x2 = x(h3);
        if (x2 == null) {
            return AbstractC0058t.f941e;
        }
        C0048i c0048i = null;
        Q q2 = h3 instanceof Q ? (Q) h3 : null;
        if (q2 == null) {
            q2 = new Q(x2, null);
        }
        synchronized (q2) {
            if (q2.f()) {
                return AbstractC0058t.f939c;
            }
            Q.f895c.set(q2, 1);
            if (q2 != h3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f903b;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, h3, q2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != h3) {
                        return AbstractC0058t.f941e;
                    }
                }
            }
            boolean e2 = q2.e();
            C0050k c0050k = obj2 instanceof C0050k ? (C0050k) obj2 : null;
            if (c0050k != null) {
                q2.a(c0050k.f925a);
            }
            Throwable d2 = q2.d();
            if (e2) {
                d2 = null;
            }
            if (d2 != null) {
                E(x2, d2);
            }
            C0048i c0048i2 = h3 instanceof C0048i ? (C0048i) h3 : null;
            if (c0048i2 == null) {
                U c2 = h3.c();
                if (c2 != null) {
                    c0048i = D(c2);
                }
            } else {
                c0048i = c0048i2;
            }
            if (c0048i != null) {
                while (AbstractC0058t.d(c0048i.f919f, false, new P(this, q2, c0048i, obj2), 1) == V.f905b) {
                    c0048i = D(c0048i);
                    if (c0048i == null) {
                    }
                }
                return AbstractC0058t.f940d;
            }
            return u(q2, obj2);
        }
    }

    @Override // k0.K
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new L(r(), null, this);
        }
        p(cancellationException);
    }

    @Override // k0.K
    public boolean b() {
        Object y2 = y();
        return (y2 instanceof H) && ((H) y2).b();
    }

    @Override // W.i
    public final W.i c(W.i iVar) {
        return AbstractC0016a.w(this, iVar);
    }

    @Override // W.i
    public final W.i e(W.h hVar) {
        return AbstractC0016a.v(this, hVar);
    }

    @Override // W.i
    public final Object f(Object obj, d0.p pVar) {
        return pVar.e(obj, this);
    }

    @Override // W.g
    public final W.h getKey() {
        return C0056q.f936c;
    }

    @Override // W.i
    public final W.g k(W.h hVar) {
        return AbstractC0016a.k(this, hVar);
    }

    public final boolean l(H h2, U u2, O o2) {
        char c2;
        S s2 = new S(o2, this, h2);
        do {
            p0.l i2 = u2.i();
            if (i2 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p0.l.f1161c;
                Object obj = atomicReferenceFieldUpdater.get(u2);
                while (true) {
                    i2 = (p0.l) obj;
                    if (!i2.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(i2);
                }
            }
            p0.l.f1161c.lazySet(o2, i2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p0.l.f1160b;
            atomicReferenceFieldUpdater2.lazySet(o2, u2);
            s2.f900c = u2;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(i2, u2, s2)) {
                    c2 = s2.a(i2) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(i2) != u2) {
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

    public void n(Object obj) {
        m(obj);
    }

    public final boolean o(Object obj) {
        io.flutter.plugin.editing.a aVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0058t.f939c;
        if (this instanceof N) {
            do {
                Object y2 = y();
                if (!(y2 instanceof H) || ((y2 instanceof Q) && ((Q) y2).f())) {
                    obj2 = AbstractC0058t.f939c;
                    break;
                }
                obj2 = J(y2, new C0050k(t(obj), false));
            } while (obj2 == AbstractC0058t.f941e);
            if (obj2 == AbstractC0058t.f940d) {
                return true;
            }
        }
        if (obj2 == AbstractC0058t.f939c) {
            Throwable th = null;
            loop1: while (true) {
                Object y3 = y();
                if (!(y3 instanceof Q)) {
                    if (!(y3 instanceof H)) {
                        aVar = AbstractC0058t.f942f;
                        break;
                    }
                    if (th == null) {
                        th = t(obj);
                    }
                    H h2 = (H) y3;
                    if (h2.b()) {
                        U x2 = x(h2);
                        if (x2 == null) {
                            continue;
                        } else {
                            Q q2 = new Q(x2, th);
                            do {
                                atomicReferenceFieldUpdater = f903b;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, h2, q2)) {
                                    E(x2, th);
                                    aVar = AbstractC0058t.f939c;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == h2);
                        }
                    } else {
                        Object J = J(y3, new C0050k(th, false));
                        if (J == AbstractC0058t.f939c) {
                            throw new IllegalStateException(("Cannot happen in " + y3).toString());
                        }
                        if (J != AbstractC0058t.f941e) {
                            obj2 = J;
                            break;
                        }
                    }
                } else {
                    synchronized (y3) {
                        try {
                            Q q3 = (Q) y3;
                            q3.getClass();
                            if (Q.f897e.get(q3) == AbstractC0058t.f943g) {
                                aVar = AbstractC0058t.f942f;
                            } else {
                                boolean e2 = ((Q) y3).e();
                                if (th == null) {
                                    th = t(obj);
                                }
                                ((Q) y3).a(th);
                                Throwable d2 = e2 ? null : ((Q) y3).d();
                                if (d2 != null) {
                                    E(((Q) y3).f898b, d2);
                                }
                                aVar = AbstractC0058t.f939c;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = aVar;
        }
        if (obj2 == AbstractC0058t.f939c || obj2 == AbstractC0058t.f940d) {
            return true;
        }
        if (obj2 == AbstractC0058t.f942f) {
            return false;
        }
        m(obj2);
        return true;
    }

    public void p(CancellationException cancellationException) {
        o(cancellationException);
    }

    public final boolean q(Throwable th) {
        if (this instanceof p0.u) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC0047h interfaceC0047h = (InterfaceC0047h) f904c.get(this);
        return (interfaceC0047h == null || interfaceC0047h == V.f905b) ? z : interfaceC0047h.g(th) || z;
    }

    public String r() {
        return "Job was cancelled";
    }

    public final void s(H h2, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f904c;
        InterfaceC0047h interfaceC0047h = (InterfaceC0047h) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0047h != null) {
            interfaceC0047h.d();
            atomicReferenceFieldUpdater.set(this, V.f905b);
        }
        A.c cVar = null;
        C0050k c0050k = obj instanceof C0050k ? (C0050k) obj : null;
        Throwable th = c0050k != null ? c0050k.f925a : null;
        if (h2 instanceof O) {
            try {
                ((O) h2).o(th);
                return;
            } catch (Throwable th2) {
                A(new A.c("Exception in completion handler " + h2 + " for " + this, th2));
                return;
            }
        }
        U c2 = h2.c();
        if (c2 != null) {
            Object k2 = c2.k();
            e0.h.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (p0.l lVar = (p0.l) k2; !lVar.equals(c2); lVar = lVar.l()) {
                if (lVar instanceof O) {
                    O o2 = (O) lVar;
                    try {
                        o2.o(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            AbstractC0016a.a(cVar, th3);
                        } else {
                            cVar = new A.c("Exception in completion handler " + o2 + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                A(cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable t(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        T t = (T) ((X) obj);
        Object y2 = t.y();
        if (y2 instanceof Q) {
            cancellationException = ((Q) y2).d();
        } else if (y2 instanceof C0050k) {
            cancellationException = ((C0050k) y2).f925a;
        } else {
            if (y2 instanceof H) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + y2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new L("Parent job is ".concat(I(y2)), cancellationException, t);
        }
        return cancellationException2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + I(y()) + '}');
        sb.append('@');
        sb.append(AbstractC0058t.a(this));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object u(Q q2, Object obj) {
        Throwable th = null;
        C0050k c0050k = obj instanceof C0050k ? (C0050k) obj : null;
        Throwable th2 = c0050k != null ? c0050k.f925a : null;
        synchronized (q2) {
            q2.e();
            ArrayList<Throwable> g2 = q2.g(th2);
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
            } else if (q2.e()) {
                th = new L(r(), null, this);
            }
            if (th != null && g2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                for (Throwable th3 : g2) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        AbstractC0016a.a(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0050k(th, false);
        }
        if (th != null && (q(th) || z(th))) {
            e0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0050k.f924b.compareAndSet((C0050k) obj, 0, 1);
        }
        F(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f903b;
        Object i2 = obj instanceof H ? new I((H) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, q2, i2) && atomicReferenceFieldUpdater.get(this) == q2) {
        }
        s(q2, obj);
        return obj;
    }

    public final CancellationException v() {
        CancellationException cancellationException;
        Object y2 = y();
        if (!(y2 instanceof Q)) {
            if (y2 instanceof H) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(y2 instanceof C0050k)) {
                return new L(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0050k) y2).f925a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new L(r(), th, this) : cancellationException;
        }
        Throwable d2 = ((Q) y2).d();
        if (d2 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = d2 instanceof CancellationException ? (CancellationException) d2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = r();
        }
        return new L(concat, d2, this);
    }

    public boolean w() {
        return true;
    }

    public final U x(H h2) {
        U c2 = h2.c();
        if (c2 != null) {
            return c2;
        }
        if (h2 instanceof A) {
            return new U();
        }
        if (h2 instanceof O) {
            H((O) h2);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + h2).toString());
    }

    public final Object y() {
        while (true) {
            Object obj = f903b.get(this);
            if (!(obj instanceof p0.r)) {
                return obj;
            }
            ((p0.r) obj).a(this);
        }
    }

    public boolean z(Throwable th) {
        return false;
    }

    public void A(A.c cVar) {
        throw cVar;
    }

    public void F(Object obj) {
    }

    public void m(Object obj) {
    }

    public void G() {
    }
}
