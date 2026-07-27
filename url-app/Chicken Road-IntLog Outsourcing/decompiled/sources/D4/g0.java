package D4;

import G0.C0051a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.InterfaceC1221g;
import k4.InterfaceC1222h;
import k4.InterfaceC1223i;
import l4.EnumC1260a;
import m4.AbstractC1295c;
import n2.AbstractC1341c;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public class g0 implements X, l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f513a = AtomicReferenceFieldUpdater.newUpdater(g0.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f514b = AtomicReferenceFieldUpdater.newUpdater(g0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public g0(boolean z) {
        this._state = z ? AbstractC0024y.f557j : AbstractC0024y.f556i;
    }

    public static C0011k O(I4.k kVar) {
        while (kVar.i()) {
            I4.k e3 = kVar.e();
            if (e3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I4.k.f1305b;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (I4.k) obj;
                    if (!kVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = e3;
            }
        }
        while (true) {
            kVar = kVar.h();
            if (!kVar.i()) {
                if (kVar instanceof C0011k) {
                    return (C0011k) kVar;
                }
                if (kVar instanceof i0) {
                    return null;
                }
            }
        }
    }

    public static String U(Object obj) {
        if (!(obj instanceof e0)) {
            return obj instanceof U ? ((U) obj).a() ? "Active" : "New" : obj instanceof C0016p ? "Cancelled" : "Completed";
        }
        e0 e0Var = (e0) obj;
        return e0Var.e() ? "Cancelling" : e0Var.f() ? "Completing" : "Active";
    }

    @Override // k4.InterfaceC1223i
    public final InterfaceC1223i A(InterfaceC1223i interfaceC1223i) {
        return AbstractC1341c.A(this, interfaceC1223i);
    }

    public boolean B() {
        return this instanceof C0013m;
    }

    public final i0 C(U u5) {
        i0 d6 = u5.d();
        if (d6 != null) {
            return d6;
        }
        if (u5 instanceof I) {
            return new i0();
        }
        if (u5 instanceof b0) {
            S((b0) u5);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + u5).toString());
    }

    public final Object D() {
        while (true) {
            Object obj = f513a.get(this);
            if (!(obj instanceof I4.q)) {
                return obj;
            }
            ((I4.q) obj).a(this);
        }
    }

    public boolean E(Throwable th) {
        return false;
    }

    public final void G(X x5) {
        int T2;
        j0 j0Var = j0.f518a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f514b;
        if (x5 == null) {
            atomicReferenceFieldUpdater.set(this, j0Var);
            return;
        }
        g0 g0Var = (g0) x5;
        do {
            T2 = g0Var.T(g0Var.D());
            if (T2 == 0) {
                break;
            }
        } while (T2 != 1);
        InterfaceC0010j interfaceC0010j = (InterfaceC0010j) AbstractC0024y.k(g0Var, true, new C0011k(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0010j);
        if (I()) {
            interfaceC0010j.b();
            atomicReferenceFieldUpdater.set(this, j0Var);
        }
    }

    public final G H(boolean z, boolean z5, InterfaceC1441l interfaceC1441l) {
        b0 b0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if (z) {
            b0Var = interfaceC1441l instanceof Z ? (Z) interfaceC1441l : null;
            if (b0Var == null) {
                b0Var = new W(interfaceC1441l);
            }
        } else {
            b0Var = interfaceC1441l instanceof b0 ? (b0) interfaceC1441l : null;
            if (b0Var == null) {
                b0Var = new H(1, interfaceC1441l);
            }
        }
        b0Var.f489d = this;
        while (true) {
            Object D5 = D();
            if (D5 instanceof I) {
                I i2 = (I) D5;
                if (i2.f465a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f513a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, D5, b0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != D5) {
                            break;
                        }
                    }
                    return b0Var;
                }
                i0 i0Var = new i0();
                U t5 = i2.f465a ? i0Var : new T(i0Var);
                do {
                    atomicReferenceFieldUpdater = f513a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, i2, t5)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == i2);
            } else {
                if (!(D5 instanceof U)) {
                    if (z5) {
                        C0016p c0016p = D5 instanceof C0016p ? (C0016p) D5 : null;
                        interfaceC1441l.invoke(c0016p != null ? c0016p.f526a : null);
                    }
                    return j0.f518a;
                }
                i0 d6 = ((U) D5).d();
                if (d6 == null) {
                    kotlin.jvm.internal.i.c(D5, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    S((b0) D5);
                } else {
                    G g6 = j0.f518a;
                    if (z && (D5 instanceof e0)) {
                        synchronized (D5) {
                            try {
                                th = ((e0) D5).c();
                                if (th != null) {
                                    if ((interfaceC1441l instanceof C0011k) && !((e0) D5).f()) {
                                    }
                                }
                                if (k((U) D5, d6, b0Var)) {
                                    if (th == null) {
                                        return b0Var;
                                    }
                                    g6 = b0Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z5) {
                            interfaceC1441l.invoke(th);
                        }
                        return g6;
                    }
                    if (k((U) D5, d6, b0Var)) {
                        return b0Var;
                    }
                }
            }
        }
    }

    public final boolean I() {
        return !(D() instanceof U);
    }

    public boolean J() {
        return this instanceof C0003c;
    }

    public final Object K(AbstractC1295c abstractC1295c) {
        Object D5;
        f4.v vVar;
        do {
            D5 = D();
            boolean z = D5 instanceof U;
            vVar = f4.v.f5689a;
            if (!z) {
                AbstractC0024y.e(abstractC1295c.getContext());
                return vVar;
            }
        } while (T(D5) < 0);
        C0007g c0007g = new C0007g(1, B0.f.F(abstractC1295c));
        c0007g.s();
        c0007g.u(new C0005e(1, H(false, true, new H(3, c0007g))));
        Object r5 = c0007g.r();
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (r5 != enumC1260a) {
            r5 = vVar;
        }
        return r5 == enumC1260a ? r5 : vVar;
    }

    public final boolean L(Object obj) {
        Object V5;
        do {
            V5 = V(D(), obj);
            if (V5 == AbstractC0024y.f551d) {
                return false;
            }
            if (V5 == AbstractC0024y.f552e) {
                return true;
            }
        } while (V5 == AbstractC0024y.f553f);
        l(V5);
        return true;
    }

    public final Object M(Object obj) {
        Object V5;
        do {
            V5 = V(D(), obj);
            if (V5 == AbstractC0024y.f551d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0016p c0016p = obj instanceof C0016p ? (C0016p) obj : null;
                throw new IllegalStateException(str, c0016p != null ? c0016p.f526a : null);
            }
        } while (V5 == AbstractC0024y.f553f);
        return V5;
    }

    public String N() {
        return getClass().getSimpleName();
    }

    public final void P(i0 i0Var, Throwable th) {
        Object g6 = i0Var.g();
        kotlin.jvm.internal.i.c(g6, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C1.b bVar = null;
        for (I4.k kVar = (I4.k) g6; !kVar.equals(i0Var); kVar = kVar.h()) {
            if (kVar instanceof Z) {
                b0 b0Var = (b0) kVar;
                try {
                    b0Var.k(th);
                } catch (Throwable th2) {
                    if (bVar != null) {
                        K1.b.C(bVar, th2);
                    } else {
                        bVar = new C1.b("Exception in completion handler " + b0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (bVar != null) {
            F(bVar);
        }
        r(th);
    }

    public final void S(b0 b0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        i0 i0Var = new i0();
        b0Var.getClass();
        I4.k.f1305b.lazySet(i0Var, b0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = I4.k.f1304a;
        atomicReferenceFieldUpdater2.lazySet(i0Var, b0Var);
        loop0: while (true) {
            if (b0Var.g() == b0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(b0Var, b0Var, i0Var)) {
                    if (atomicReferenceFieldUpdater2.get(b0Var) != b0Var) {
                        break;
                    }
                }
                i0Var.f(b0Var);
                break loop0;
            }
            break;
        }
        I4.k h3 = b0Var.h();
        do {
            atomicReferenceFieldUpdater = f513a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, b0Var, h3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == b0Var);
    }

    public final int T(Object obj) {
        boolean z = obj instanceof I;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f513a;
        if (z) {
            if (((I) obj).f465a) {
                return 0;
            }
            I i2 = AbstractC0024y.f557j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, i2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            R();
            return 1;
        }
        if (!(obj instanceof T)) {
            return 0;
        }
        i0 i0Var = ((T) obj).f481a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, i0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        R();
        return 1;
    }

    public final Object V(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof U)) {
            return AbstractC0024y.f551d;
        }
        if (((obj instanceof I) || (obj instanceof b0)) && !(obj instanceof C0011k) && !(obj2 instanceof C0016p)) {
            U u5 = (U) obj;
            Object v4 = obj2 instanceof U ? new V((U) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f513a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, u5, v4)) {
                    Q(obj2);
                    u(u5, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == u5);
            return AbstractC0024y.f553f;
        }
        U u6 = (U) obj;
        i0 C2 = C(u6);
        if (C2 == null) {
            return AbstractC0024y.f553f;
        }
        C0011k c0011k = null;
        e0 e0Var = u6 instanceof e0 ? (e0) u6 : null;
        if (e0Var == null) {
            e0Var = new e0(C2, null);
        }
        synchronized (e0Var) {
            if (e0Var.f()) {
                return AbstractC0024y.f551d;
            }
            e0.f500b.set(e0Var, 1);
            if (e0Var != u6) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f513a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, u6, e0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != u6) {
                        return AbstractC0024y.f553f;
                    }
                }
            }
            boolean e3 = e0Var.e();
            C0016p c0016p = obj2 instanceof C0016p ? (C0016p) obj2 : null;
            if (c0016p != null) {
                e0Var.b(c0016p.f526a);
            }
            Throwable c2 = e0Var.c();
            if (e3) {
                c2 = null;
            }
            if (c2 != null) {
                P(C2, c2);
            }
            C0011k c0011k2 = u6 instanceof C0011k ? (C0011k) u6 : null;
            if (c0011k2 == null) {
                i0 d6 = u6.d();
                if (d6 != null) {
                    c0011k = O(d6);
                }
            } else {
                c0011k = c0011k2;
            }
            if (c0011k != null) {
                while (AbstractC0024y.k(c0011k.f519e, false, new d0(this, e0Var, c0011k, obj2), 1) == j0.f518a) {
                    c0011k = O(c0011k);
                    if (c0011k == null) {
                    }
                }
                return AbstractC0024y.f552e;
            }
            return w(e0Var, obj2);
        }
    }

    @Override // D4.X
    public boolean a() {
        Object D5 = D();
        return (D5 instanceof U) && ((U) D5).a();
    }

    @Override // D4.X
    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new Y(s(), null, this);
        }
        p(cancellationException);
    }

    @Override // k4.InterfaceC1223i
    public final InterfaceC1223i c(InterfaceC1222h interfaceC1222h) {
        return AbstractC1341c.x(this, interfaceC1222h);
    }

    @Override // k4.InterfaceC1221g
    public final InterfaceC1222h getKey() {
        return C0021v.f545b;
    }

    public final boolean k(U u5, i0 i0Var, b0 b0Var) {
        char c2;
        f0 f0Var = new f0(b0Var, this, u5);
        do {
            I4.k e3 = i0Var.e();
            if (e3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I4.k.f1305b;
                Object obj = atomicReferenceFieldUpdater.get(i0Var);
                while (true) {
                    e3 = (I4.k) obj;
                    if (!e3.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(e3);
                }
            }
            I4.k.f1305b.lazySet(b0Var, e3);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = I4.k.f1304a;
            atomicReferenceFieldUpdater2.lazySet(b0Var, i0Var);
            f0Var.f505c = i0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(e3, i0Var, f0Var)) {
                    c2 = f0Var.a(e3) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(e3) != i0Var) {
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

    public void m(Object obj) {
        l(obj);
    }

    public final boolean n(Object obj) {
        C0051a c0051a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0024y.f551d;
        if (B()) {
            do {
                Object D5 = D();
                if (!(D5 instanceof U) || ((D5 instanceof e0) && ((e0) D5).f())) {
                    obj2 = AbstractC0024y.f551d;
                    break;
                }
                obj2 = V(D5, new C0016p(v(obj), false));
            } while (obj2 == AbstractC0024y.f553f);
            if (obj2 == AbstractC0024y.f552e) {
                return true;
            }
        }
        if (obj2 == AbstractC0024y.f551d) {
            Throwable th = null;
            loop1: while (true) {
                Object D6 = D();
                if (!(D6 instanceof e0)) {
                    if (!(D6 instanceof U)) {
                        c0051a = AbstractC0024y.f554g;
                        break;
                    }
                    if (th == null) {
                        th = v(obj);
                    }
                    U u5 = (U) D6;
                    if (u5.a()) {
                        i0 C2 = C(u5);
                        if (C2 == null) {
                            continue;
                        } else {
                            e0 e0Var = new e0(C2, th);
                            do {
                                atomicReferenceFieldUpdater = f513a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, u5, e0Var)) {
                                    P(C2, th);
                                    c0051a = AbstractC0024y.f551d;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == u5);
                        }
                    } else {
                        Object V5 = V(D6, new C0016p(th, false));
                        if (V5 == AbstractC0024y.f551d) {
                            throw new IllegalStateException(("Cannot happen in " + D6).toString());
                        }
                        if (V5 != AbstractC0024y.f553f) {
                            obj2 = V5;
                            break;
                        }
                    }
                } else {
                    synchronized (D6) {
                        try {
                            e0 e0Var2 = (e0) D6;
                            e0Var2.getClass();
                            if (e0.f502d.get(e0Var2) == AbstractC0024y.f555h) {
                                c0051a = AbstractC0024y.f554g;
                            } else {
                                boolean e3 = ((e0) D6).e();
                                if (th == null) {
                                    th = v(obj);
                                }
                                ((e0) D6).b(th);
                                Throwable c2 = e3 ? null : ((e0) D6).c();
                                if (c2 != null) {
                                    P(((e0) D6).f503a, c2);
                                }
                                c0051a = AbstractC0024y.f551d;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = c0051a;
        }
        if (obj2 != AbstractC0024y.f551d && obj2 != AbstractC0024y.f552e) {
            if (obj2 == AbstractC0024y.f554g) {
                return false;
            }
            l(obj2);
        }
        return true;
    }

    @Override // k4.InterfaceC1223i
    public final InterfaceC1221g o(InterfaceC1222h interfaceC1222h) {
        return AbstractC1341c.n(this, interfaceC1222h);
    }

    public void p(CancellationException cancellationException) {
        n(cancellationException);
    }

    @Override // k4.InterfaceC1223i
    public final Object q(Object obj, InterfaceC1445p interfaceC1445p) {
        return interfaceC1445p.invoke(obj, this);
    }

    public final boolean r(Throwable th) {
        if (J()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC0010j interfaceC0010j = (InterfaceC0010j) f514b.get(this);
        return (interfaceC0010j == null || interfaceC0010j == j0.f518a) ? z : interfaceC0010j.c(th) || z;
    }

    public String s() {
        return "Job was cancelled";
    }

    public boolean t(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return n(th) && z();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(N() + '{' + U(D()) + '}');
        sb.append('@');
        sb.append(AbstractC0024y.h(this));
        return sb.toString();
    }

    public final void u(U u5, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f514b;
        InterfaceC0010j interfaceC0010j = (InterfaceC0010j) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0010j != null) {
            interfaceC0010j.b();
            atomicReferenceFieldUpdater.set(this, j0.f518a);
        }
        C1.b bVar = null;
        C0016p c0016p = obj instanceof C0016p ? (C0016p) obj : null;
        Throwable th = c0016p != null ? c0016p.f526a : null;
        if (u5 instanceof b0) {
            try {
                ((b0) u5).k(th);
                return;
            } catch (Throwable th2) {
                F(new C1.b("Exception in completion handler " + u5 + " for " + this, th2));
                return;
            }
        }
        i0 d6 = u5.d();
        if (d6 != null) {
            Object g6 = d6.g();
            kotlin.jvm.internal.i.c(g6, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (I4.k kVar = (I4.k) g6; !kVar.equals(d6); kVar = kVar.h()) {
                if (kVar instanceof b0) {
                    b0 b0Var = (b0) kVar;
                    try {
                        b0Var.k(th);
                    } catch (Throwable th3) {
                        if (bVar != null) {
                            K1.b.C(bVar, th3);
                        } else {
                            bVar = new C1.b("Exception in completion handler " + b0Var + " for " + this, th3);
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
    public final Throwable v(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        g0 g0Var = (g0) ((l0) obj);
        Object D5 = g0Var.D();
        if (D5 instanceof e0) {
            cancellationException = ((e0) D5).c();
        } else if (D5 instanceof C0016p) {
            cancellationException = ((C0016p) D5).f526a;
        } else {
            if (D5 instanceof U) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + D5).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new Y("Parent job is ".concat(U(D5)), cancellationException, g0Var);
        }
        return cancellationException2;
    }

    public final Object w(e0 e0Var, Object obj) {
        Throwable y5;
        C0016p c0016p = obj instanceof C0016p ? (C0016p) obj : null;
        Throwable th = c0016p != null ? c0016p.f526a : null;
        synchronized (e0Var) {
            e0Var.e();
            ArrayList<Throwable> g6 = e0Var.g(th);
            y5 = y(e0Var, g6);
            if (y5 != null && g6.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g6.size()));
                for (Throwable th2 : g6) {
                    if (th2 != y5 && th2 != y5 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        K1.b.C(y5, th2);
                    }
                }
            }
        }
        if (y5 != null && y5 != th) {
            obj = new C0016p(y5, false);
        }
        if (y5 != null && (r(y5) || E(y5))) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0016p.f525b.compareAndSet((C0016p) obj, 0, 1);
        }
        Q(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f513a;
        Object v4 = obj instanceof U ? new V((U) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, e0Var, v4) && atomicReferenceFieldUpdater.get(this) == e0Var) {
        }
        u(e0Var, obj);
        return obj;
    }

    public final CancellationException x() {
        CancellationException cancellationException;
        Object D5 = D();
        if (!(D5 instanceof e0)) {
            if (D5 instanceof U) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(D5 instanceof C0016p)) {
                return new Y(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0016p) D5).f526a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new Y(s(), th, this) : cancellationException;
        }
        Throwable c2 = ((e0) D5).c();
        if (c2 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c2 instanceof CancellationException ? (CancellationException) c2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = s();
        }
        return new Y(concat, c2, this);
    }

    public final Throwable y(e0 e0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (e0Var.e()) {
                return new Y(s(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof r0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof r0)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean z() {
        return true;
    }

    public void R() {
    }

    public void F(C1.b bVar) {
        throw bVar;
    }

    public void Q(Object obj) {
    }

    public void l(Object obj) {
    }
}
