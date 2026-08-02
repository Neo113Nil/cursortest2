package t2;

import a.AbstractC0129a;
import d2.InterfaceC0303f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C1148j;

/* loaded from: classes.dex */
public class e0 implements U, i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10413a = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10414b = AtomicReferenceFieldUpdater.newUpdater(e0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public e0(boolean z) {
        this._state$volatile = z ? AbstractC1212w.f10452i : AbstractC1212w.f10451h;
    }

    public static C1200j L(y2.k kVar) {
        while (kVar.i()) {
            y2.k e3 = kVar.e();
            if (e3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y2.k.f10852b;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (y2.k) obj;
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
                if (kVar instanceof C1200j) {
                    return (C1200j) kVar;
                }
                if (kVar instanceof f0) {
                    return null;
                }
            }
        }
    }

    public static String R(Object obj) {
        if (!(obj instanceof c0)) {
            return obj instanceof N ? ((N) obj).a() ? "Active" : "New" : obj instanceof C1204n ? "Cancelled" : "Completed";
        }
        c0 c0Var = (c0) obj;
        return c0Var.e() ? "Cancelling" : c0Var.f() ? "Completing" : "Active";
    }

    public boolean A() {
        return true;
    }

    public boolean B() {
        return this instanceof C1202l;
    }

    public final f0 C(N n3) {
        f0 d3 = n3.d();
        if (d3 != null) {
            return d3;
        }
        if (n3 instanceof G) {
            return new f0();
        }
        if (n3 instanceof Z) {
            P((Z) n3);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + n3).toString());
    }

    public final Object D() {
        while (true) {
            Object obj = f10413a.get(this);
            if (!(obj instanceof y2.p)) {
                return obj;
            }
            ((y2.p) obj).a(this);
        }
    }

    public boolean E(Throwable th) {
        return false;
    }

    public final void G(U u3) {
        int Q2;
        g0 g0Var = g0.f10420a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10414b;
        if (u3 == null) {
            atomicReferenceFieldUpdater.set(this, g0Var);
            return;
        }
        e0 e0Var = (e0) u3;
        do {
            Q2 = e0Var.Q(e0Var.D());
            if (Q2 == 0) {
                break;
            }
        } while (Q2 != 1);
        InterfaceC1199i interfaceC1199i = (InterfaceC1199i) AbstractC1212w.f(e0Var, true, new C1200j(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC1199i);
        if (D() instanceof N) {
            return;
        }
        interfaceC1199i.dispose();
        atomicReferenceFieldUpdater.set(this, g0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E H(boolean z, boolean z2, Q q3) {
        Z z3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if (z) {
            z3 = q3 instanceof W ? (W) q3 : null;
            if (z3 == null) {
                z3 = new S(q3);
            }
        } else {
            z3 = q3 instanceof Z ? (Z) q3 : null;
            if (z3 == null) {
                z3 = new T(0, q3);
            }
        }
        z3.f10395d = this;
        loop0: while (true) {
            Object D3 = D();
            if (D3 instanceof G) {
                G g3 = (G) D3;
                if (g3.f10380a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10413a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, D3, z3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != D3) {
                            break;
                        }
                    }
                    break loop0;
                }
                f0 f0Var = new f0();
                Object m3 = g3.f10380a ? f0Var : new M(f0Var);
                do {
                    atomicReferenceFieldUpdater = f10413a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, g3, m3)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == g3);
            } else {
                if (!(D3 instanceof N)) {
                    if (z2) {
                        C1204n c1204n = D3 instanceof C1204n ? (C1204n) D3 : null;
                        q3.c(c1204n != null ? c1204n.f10431a : null);
                    }
                    return g0.f10420a;
                }
                f0 d3 = ((N) D3).d();
                if (d3 == null) {
                    kotlin.jvm.internal.j.c(D3, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    P((Z) D3);
                } else {
                    E e3 = g0.f10420a;
                    if (z && (D3 instanceof c0)) {
                        synchronized (D3) {
                            try {
                                th = ((c0) D3).c();
                                if (th != null) {
                                    if ((q3 instanceof C1200j) && !((c0) D3).f()) {
                                    }
                                }
                                if (n((N) D3, d3, z3)) {
                                    if (th == null) {
                                        return z3;
                                    }
                                    e3 = z3;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z2) {
                            q3.c(th);
                        }
                        return e3;
                    }
                    if (n((N) D3, d3, z3)) {
                        break;
                    }
                }
            }
        }
    }

    public boolean I() {
        return this instanceof C1193c;
    }

    public final boolean J(Object obj) {
        Object S2;
        do {
            S2 = S(D(), obj);
            if (S2 == AbstractC1212w.f10447c) {
                return false;
            }
            if (S2 == AbstractC1212w.f10448d) {
                return true;
            }
        } while (S2 == AbstractC1212w.f10449e);
        o(S2);
        return true;
    }

    public final Object K(Object obj) {
        Object S2;
        do {
            S2 = S(D(), obj);
            if (S2 == AbstractC1212w.f10447c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C1204n c1204n = obj instanceof C1204n ? (C1204n) obj : null;
                throw new IllegalStateException(str, c1204n != null ? c1204n.f10431a : null);
            }
        } while (S2 == AbstractC1212w.f10449e);
        return S2;
    }

    public final void M(f0 f0Var, Throwable th) {
        Object g3 = f0Var.g();
        kotlin.jvm.internal.j.c(g3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        O0.b bVar = null;
        for (y2.k kVar = (y2.k) g3; !kVar.equals(f0Var); kVar = kVar.h()) {
            if (kVar instanceof W) {
                Z z = (Z) kVar;
                try {
                    z.c(th);
                } catch (Throwable th2) {
                    if (bVar != null) {
                        AbstractC0129a.e(bVar, th2);
                    } else {
                        bVar = new O0.b("Exception in completion handler " + z + " for " + this, th2);
                    }
                }
            }
        }
        if (bVar != null) {
            F(bVar);
        }
        t(th);
    }

    public final void P(Z z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        f0 f0Var = new f0();
        z.getClass();
        y2.k.f10852b.set(f0Var, z);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = y2.k.f10851a;
        atomicReferenceFieldUpdater2.set(f0Var, z);
        loop0: while (true) {
            if (z.g() == z) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(z, z, f0Var)) {
                    if (atomicReferenceFieldUpdater2.get(z) != z) {
                        break;
                    }
                }
                f0Var.f(z);
                break loop0;
            }
            break;
        }
        y2.k h3 = z.h();
        do {
            atomicReferenceFieldUpdater = f10413a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, z, h3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == z);
    }

    public final int Q(Object obj) {
        boolean z = obj instanceof G;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10413a;
        if (z) {
            if (((G) obj).f10380a) {
                return 0;
            }
            G g3 = AbstractC1212w.f10452i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof M)) {
            return 0;
        }
        f0 f0Var = ((M) obj).f10388a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object S(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof N)) {
            return AbstractC1212w.f10447c;
        }
        if (((obj instanceof G) || (obj instanceof Z)) && !(obj instanceof C1200j) && !(obj2 instanceof C1204n)) {
            N n3 = (N) obj;
            Object o = obj2 instanceof N ? new O((N) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f10413a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, n3, o)) {
                    N(obj2);
                    w(n3, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == n3);
            return AbstractC1212w.f10449e;
        }
        N n4 = (N) obj;
        f0 C3 = C(n4);
        if (C3 == null) {
            return AbstractC1212w.f10449e;
        }
        C1200j c1200j = null;
        c0 c0Var = n4 instanceof c0 ? (c0) n4 : null;
        if (c0Var == null) {
            c0Var = new c0(C3, null);
        }
        synchronized (c0Var) {
            try {
                if (c0Var.f()) {
                    return AbstractC1212w.f10447c;
                }
                c0.f10404b.set(c0Var, 1);
                if (c0Var != n4) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10413a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, n4, c0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != n4) {
                            return AbstractC1212w.f10449e;
                        }
                    }
                }
                boolean e3 = c0Var.e();
                C1204n c1204n = obj2 instanceof C1204n ? (C1204n) obj2 : null;
                if (c1204n != null) {
                    c0Var.b(c1204n.f10431a);
                }
                Throwable c3 = c0Var.c();
                if (e3) {
                    c3 = null;
                }
                if (c3 != null) {
                    M(C3, c3);
                }
                C1200j c1200j2 = n4 instanceof C1200j ? (C1200j) n4 : null;
                if (c1200j2 == null) {
                    f0 d3 = n4.d();
                    if (d3 != null) {
                        c1200j = L(d3);
                    }
                } else {
                    c1200j = c1200j2;
                }
                if (c1200j != null) {
                    while (AbstractC1212w.f(c1200j.f10422e, false, new b0(this, c0Var, c1200j, obj2), 1) == g0.f10420a) {
                        c1200j = L(c1200j);
                        if (c1200j == null) {
                        }
                    }
                    return AbstractC1212w.f10448d;
                }
                return y(c0Var, obj2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t2.U
    public boolean a() {
        Object D3 = D();
        return (D3 instanceof N) && ((N) D3).a();
    }

    @Override // t2.U
    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new V(u(), null, this);
        }
        s(cancellationException);
    }

    @Override // d2.InterfaceC0303f
    public final d2.g getKey() {
        return C1209t.f10441b;
    }

    @Override // d2.h
    public final InterfaceC0303f h(d2.g gVar) {
        return android.support.v4.media.session.a.x(this, gVar);
    }

    @Override // d2.h
    public final d2.h i(d2.h hVar) {
        return android.support.v4.media.session.a.E(this, hVar);
    }

    @Override // d2.h
    public final d2.h k(d2.g gVar) {
        return android.support.v4.media.session.a.D(this, gVar);
    }

    @Override // d2.h
    public final Object l(Object obj, l2.p pVar) {
        return pVar.invoke(obj, this);
    }

    public final boolean n(N n3, f0 f0Var, Z z) {
        char c3;
        d0 d0Var = new d0(z, this, n3);
        do {
            y2.k e3 = f0Var.e();
            if (e3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y2.k.f10852b;
                Object obj = atomicReferenceFieldUpdater.get(f0Var);
                while (true) {
                    e3 = (y2.k) obj;
                    if (!e3.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(e3);
                }
            }
            y2.k.f10852b.set(z, e3);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = y2.k.f10851a;
            atomicReferenceFieldUpdater2.set(z, f0Var);
            d0Var.f10410c = f0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(e3, f0Var, d0Var)) {
                    c3 = d0Var.a(e3) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(e3) != f0Var) {
                    c3 = 0;
                    break;
                }
            }
            if (c3 == 1) {
                return true;
            }
        } while (c3 != 2);
        return false;
    }

    public void p(Object obj) {
        o(obj);
    }

    public final Object q(f2.i iVar) {
        Object D3;
        do {
            D3 = D();
            if (!(D3 instanceof N)) {
                if (D3 instanceof C1204n) {
                    throw ((C1204n) D3).f10431a;
                }
                return AbstractC1212w.m(D3);
            }
        } while (Q(D3) < 0);
        a0 a0Var = new a0(C2.b.x(iVar), this);
        a0Var.t();
        a0Var.v(new F(AbstractC1212w.f(this, false, new T(1, a0Var), 3)));
        return a0Var.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == t2.AbstractC1212w.f10448d) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(Object obj) {
        C1148j c1148j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC1212w.f10447c;
        if (B()) {
            do {
                Object D3 = D();
                if (!(D3 instanceof N) || ((D3 instanceof c0) && ((c0) D3).f())) {
                    obj2 = AbstractC1212w.f10447c;
                    break;
                }
                obj2 = S(D3, new C1204n(x(obj), false));
            } while (obj2 == AbstractC1212w.f10449e);
        }
        if (obj2 == AbstractC1212w.f10447c) {
            Throwable th = null;
            loop1: while (true) {
                Object D4 = D();
                if (!(D4 instanceof c0)) {
                    if (!(D4 instanceof N)) {
                        c1148j = AbstractC1212w.f;
                        break;
                    }
                    if (th == null) {
                        th = x(obj);
                    }
                    N n3 = (N) D4;
                    if (n3.a()) {
                        f0 C3 = C(n3);
                        if (C3 == null) {
                            continue;
                        } else {
                            c0 c0Var = new c0(C3, th);
                            do {
                                atomicReferenceFieldUpdater = f10413a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, n3, c0Var)) {
                                    M(C3, th);
                                    c1148j = AbstractC1212w.f10447c;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == n3);
                        }
                    } else {
                        Object S2 = S(D4, new C1204n(th, false));
                        if (S2 == AbstractC1212w.f10447c) {
                            throw new IllegalStateException(("Cannot happen in " + D4).toString());
                        }
                        if (S2 != AbstractC1212w.f10449e) {
                            obj2 = S2;
                            break;
                        }
                    }
                } else {
                    synchronized (D4) {
                        try {
                            c0 c0Var2 = (c0) D4;
                            c0Var2.getClass();
                            if (c0.f10406d.get(c0Var2) == AbstractC1212w.f10450g) {
                                c1148j = AbstractC1212w.f;
                            } else {
                                boolean e3 = ((c0) D4).e();
                                if (th == null) {
                                    th = x(obj);
                                }
                                ((c0) D4).b(th);
                                Throwable c3 = e3 ? null : ((c0) D4).c();
                                if (c3 != null) {
                                    M(((c0) D4).f10407a, c3);
                                }
                                c1148j = AbstractC1212w.f10447c;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = c1148j;
        }
        if (obj2 != AbstractC1212w.f10447c && obj2 != AbstractC1212w.f10448d) {
            if (obj2 == AbstractC1212w.f) {
                return false;
            }
            o(obj2);
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
        boolean z = th instanceof CancellationException;
        InterfaceC1199i interfaceC1199i = (InterfaceC1199i) f10414b.get(this);
        return (interfaceC1199i == null || interfaceC1199i == g0.f10420a) ? z : interfaceC1199i.b(th) || z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + R(D()) + '}');
        sb.append('@');
        sb.append(AbstractC1212w.c(this));
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

    public final void w(N n3, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10414b;
        InterfaceC1199i interfaceC1199i = (InterfaceC1199i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1199i != null) {
            interfaceC1199i.dispose();
            atomicReferenceFieldUpdater.set(this, g0.f10420a);
        }
        O0.b bVar = null;
        C1204n c1204n = obj instanceof C1204n ? (C1204n) obj : null;
        Throwable th = c1204n != null ? c1204n.f10431a : null;
        if (n3 instanceof Z) {
            try {
                ((Z) n3).c(th);
                return;
            } catch (Throwable th2) {
                F(new O0.b("Exception in completion handler " + n3 + " for " + this, th2));
                return;
            }
        }
        f0 d3 = n3.d();
        if (d3 != null) {
            Object g3 = d3.g();
            kotlin.jvm.internal.j.c(g3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (y2.k kVar = (y2.k) g3; !kVar.equals(d3); kVar = kVar.h()) {
                if (kVar instanceof Z) {
                    Z z = (Z) kVar;
                    try {
                        z.c(th);
                    } catch (Throwable th3) {
                        if (bVar != null) {
                            AbstractC0129a.e(bVar, th3);
                        } else {
                            bVar = new O0.b("Exception in completion handler " + z + " for " + this, th3);
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
        e0 e0Var = (e0) ((i0) obj);
        Object D3 = e0Var.D();
        if (D3 instanceof c0) {
            cancellationException = ((c0) D3).c();
        } else if (D3 instanceof C1204n) {
            cancellationException = ((C1204n) D3).f10431a;
        } else {
            if (D3 instanceof N) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + D3).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new V("Parent job is ".concat(R(D3)), cancellationException, e0Var) : cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object y(c0 c0Var, Object obj) {
        Throwable th = null;
        C1204n c1204n = obj instanceof C1204n ? (C1204n) obj : null;
        Throwable th2 = c1204n != null ? c1204n.f10431a : null;
        synchronized (c0Var) {
            c0Var.e();
            ArrayList<Throwable> g3 = c0Var.g(th2);
            if (!g3.isEmpty()) {
                Iterator it = g3.iterator();
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
                    th = (Throwable) g3.get(0);
                }
            } else if (c0Var.e()) {
                th = new V(u(), null, this);
            }
            if (th != null && g3.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g3.size()));
                for (Throwable th3 : g3) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        AbstractC0129a.e(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C1204n(th, false);
        }
        if (th != null && (t(th) || E(th))) {
            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C1204n.f10430b.compareAndSet((C1204n) obj, 0, 1);
        }
        N(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10413a;
        Object o = obj instanceof N ? new O((N) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c0Var, o) && atomicReferenceFieldUpdater.get(this) == c0Var) {
        }
        w(c0Var, obj);
        return obj;
    }

    public final CancellationException z() {
        CancellationException cancellationException;
        Object D3 = D();
        if (!(D3 instanceof c0)) {
            if (D3 instanceof N) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(D3 instanceof C1204n)) {
                return new V(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C1204n) D3).f10431a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new V(u(), th, this) : cancellationException;
        }
        Throwable c3 = ((c0) D3).c();
        if (c3 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c3 instanceof CancellationException ? (CancellationException) c3 : null;
        if (cancellationException == null) {
            if (concat == null) {
                concat = u();
            }
            cancellationException = new V(concat, c3, this);
        }
        return cancellationException;
    }

    public void O() {
    }

    public void F(O0.b bVar) {
        throw bVar;
    }

    public void N(Object obj) {
    }

    public void o(Object obj) {
    }
}
