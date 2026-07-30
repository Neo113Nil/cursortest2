package c7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class f1 implements x0, l1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1692f = AtomicReferenceFieldUpdater.newUpdater(f1.class, Object.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1693g = AtomicReferenceFieldUpdater.newUpdater(f1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public f1(boolean z8) {
        this._state$volatile = z8 ? a0.f1669j : a0.f1668i;
    }

    public static l S(h7.i iVar) {
        while (iVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h7.i.f4689g;
            h7.i f9 = iVar.f();
            if (f9 == null) {
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (h7.i) obj;
                    if (!iVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVar);
                }
            } else {
                iVar = f9;
            }
        }
        while (true) {
            iVar = iVar.h();
            if (!iVar.i()) {
                if (iVar instanceof l) {
                    return (l) iVar;
                }
                if (iVar instanceof h1) {
                    return null;
                }
            }
        }
    }

    public static String a0(Object obj) {
        if (!(obj instanceof e1)) {
            return obj instanceof u0 ? ((u0) obj).b() ? "Active" : "New" : obj instanceof p ? "Cancelled" : "Completed";
        }
        e1 e1Var = (e1) obj;
        return e1Var.e() ? "Cancelling" : e1.f1687g.get(e1Var) != 0 ? "Completing" : "Active";
    }

    public final Throwable A(e1 e1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (e1Var.e()) {
                return new y0(r(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i8);
            i8++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof q1) {
            int size2 = arrayList.size();
            while (true) {
                if (i7 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i7);
                i7++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof q1)) {
                    obj2 = obj3;
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

    public boolean B() {
        return true;
    }

    public boolean C() {
        return this instanceof n;
    }

    @Override // h6.i
    public final Object D(Object obj, q6.e eVar) {
        return eVar.d(obj, this);
    }

    @Override // h6.i
    public final h6.i F(h6.h hVar) {
        return t6.a.G(this, hVar);
    }

    public final h1 G(u0 u0Var) {
        h1 c4 = u0Var.c();
        if (c4 != null) {
            return c4;
        }
        if (u0Var instanceof k0) {
            return new h1();
        }
        if (u0Var instanceof b1) {
            Y((b1) u0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + u0Var).toString());
    }

    public boolean H(Throwable th) {
        return false;
    }

    @Override // c7.x0
    public final i0 I(q6.c cVar) {
        return L(true, new j0(1, cVar));
    }

    public final void K(x0 x0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1693g;
        j1 j1Var = j1.f1710f;
        if (x0Var == null) {
            atomicReferenceFieldUpdater.set(this, j1Var);
            return;
        }
        x0Var.start();
        k T = x0Var.T(this);
        atomicReferenceFieldUpdater.set(this, T);
        if (f1692f.get(this) instanceof u0) {
            return;
        }
        T.a();
        atomicReferenceFieldUpdater.set(this, j1Var);
    }

    public final i0 L(boolean z8, b1 b1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j1 j1Var;
        boolean z9;
        boolean d8;
        b1Var.f1674i = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f1692f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z10 = obj instanceof k0;
            j1Var = j1.f1710f;
            z9 = true;
            if (!z10) {
                if (!(obj instanceof u0)) {
                    z9 = false;
                    break;
                }
                u0 u0Var = (u0) obj;
                h1 c4 = u0Var.c();
                if (c4 == null) {
                    Y((b1) obj);
                } else {
                    if (b1Var.k()) {
                        e1 e1Var = u0Var instanceof e1 ? (e1) u0Var : null;
                        Throwable d9 = e1Var != null ? e1Var.d() : null;
                        if (d9 == null) {
                            d8 = c4.d(b1Var, 5);
                        } else if (z8) {
                            b1Var.l(d9);
                            return j1Var;
                        }
                    } else {
                        d8 = c4.d(b1Var, 1);
                    }
                    if (d8) {
                        break;
                    }
                }
            } else {
                k0 k0Var = (k0) obj;
                if (k0Var.f1711f) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                X(k0Var);
            }
        }
        if (z9) {
            return b1Var;
        }
        if (z8) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            p pVar = obj2 instanceof p ? (p) obj2 : null;
            b1Var.l(pVar != null ? pVar.f1725a : null);
        }
        return j1Var;
    }

    public boolean M() {
        return this instanceof c;
    }

    @Override // c7.x0
    public final Object N(j6.c cVar) {
        Object obj;
        d6.z zVar;
        do {
            obj = f1692f.get(this);
            boolean z8 = obj instanceof u0;
            zVar = d6.z.f2639a;
            if (!z8) {
                a0.f(cVar.getContext());
                return zVar;
            }
        } while (Z(obj) < 0);
        h hVar = new h(1, a8.m.A(cVar));
        hVar.r();
        hVar.u(new e(2, a0.m(this, true, new j(hVar, 1))));
        Object q8 = hVar.q();
        i6.a aVar = i6.a.f4956f;
        if (q8 != aVar) {
            q8 = zVar;
        }
        return q8 == aVar ? q8 : zVar;
    }

    public final boolean O(Object obj) {
        Object b0;
        do {
            b0 = b0(f1692f.get(this), obj);
            if (b0 == a0.f1663d) {
                return false;
            }
            if (b0 == a0.f1664e) {
                return true;
            }
        } while (b0 == a0.f1665f);
        i(b0);
        return true;
    }

    public final Object P(Object obj) {
        Object b0;
        do {
            b0 = b0(f1692f.get(this), obj);
            if (b0 == a0.f1663d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                p pVar = obj instanceof p ? (p) obj : null;
                throw new IllegalStateException(str, pVar != null ? pVar.f1725a : null);
            }
        } while (b0 == a0.f1665f);
        return b0;
    }

    public String R() {
        return getClass().getSimpleName();
    }

    @Override // c7.x0
    public final k T(f1 f1Var) {
        l lVar = new l(f1Var);
        lVar.f1674i = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1692f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof k0) {
                k0 k0Var = (k0) obj;
                if (k0Var.f1711f) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                X(k0Var);
            } else {
                boolean z8 = obj instanceof u0;
                j1 j1Var = j1.f1710f;
                if (!z8) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    p pVar = obj2 instanceof p ? (p) obj2 : null;
                    lVar.l(pVar != null ? pVar.f1725a : null);
                    return j1Var;
                }
                h1 c4 = ((u0) obj).c();
                if (c4 == null) {
                    Y((b1) obj);
                } else if (!c4.d(lVar, 7)) {
                    boolean d8 = c4.d(lVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof e1) {
                        r4 = ((e1) obj3).d();
                    } else {
                        p pVar2 = obj3 instanceof p ? (p) obj3 : null;
                        if (pVar2 != null) {
                            r4 = pVar2.f1725a;
                        }
                    }
                    lVar.l(r4);
                    if (d8) {
                        break loop0;
                    }
                    return j1Var;
                }
            }
        }
        return lVar;
    }

    public final void U(h1 h1Var, Throwable th) {
        h1Var.d(new h7.h(4), 4);
        Object obj = h7.i.f4688f.get(h1Var);
        r6.k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        b4.c cVar = null;
        for (h7.i iVar = (h7.i) obj; !iVar.equals(h1Var); iVar = iVar.h()) {
            if ((iVar instanceof b1) && ((b1) iVar).k()) {
                try {
                    ((b1) iVar).l(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        d6.a.a(cVar, th2);
                    } else {
                        cVar = new b4.c("Exception in completion handler " + iVar + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            J(cVar);
        }
        q(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [c7.t0] */
    public final void X(k0 k0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h1 h1Var = new h1();
        if (!k0Var.f1711f) {
            h1Var = new t0(h1Var);
        }
        do {
            atomicReferenceFieldUpdater = f1692f;
            if (atomicReferenceFieldUpdater.compareAndSet(this, k0Var, h1Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == k0Var);
    }

    public final void Y(b1 b1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h1 h1Var = new h1();
        b1Var.getClass();
        h7.i.f4689g.set(h1Var, b1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h7.i.f4688f;
        atomicReferenceFieldUpdater2.set(h1Var, b1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(b1Var) == b1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(b1Var, b1Var, h1Var)) {
                    if (atomicReferenceFieldUpdater2.get(b1Var) != b1Var) {
                        break;
                    }
                }
                h1Var.g(b1Var);
                break loop0;
            }
            break;
        }
        h7.i h3 = b1Var.h();
        do {
            atomicReferenceFieldUpdater = f1692f;
            if (atomicReferenceFieldUpdater.compareAndSet(this, b1Var, h3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == b1Var);
    }

    public final int Z(Object obj) {
        boolean z8 = obj instanceof k0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1692f;
        if (z8) {
            if (((k0) obj).f1711f) {
                return 0;
            }
            k0 k0Var = a0.f1669j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            W();
            return 1;
        }
        if (!(obj instanceof t0)) {
            return 0;
        }
        h1 h1Var = ((t0) obj).f1745f;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        W();
        return 1;
    }

    @Override // c7.x0
    public boolean b() {
        Object obj = f1692f.get(this);
        return (obj instanceof u0) && ((u0) obj).b();
    }

    public final Object b0(Object obj, Object obj2) {
        if (!(obj instanceof u0)) {
            return a0.f1663d;
        }
        if (((obj instanceof k0) || (obj instanceof b1)) && !(obj instanceof l) && !(obj2 instanceof p)) {
            u0 u0Var = (u0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1692f;
            Object v0Var = obj2 instanceof u0 ? new v0((u0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, u0Var, v0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != u0Var) {
                    return a0.f1665f;
                }
            }
            V(obj2);
            v(u0Var, obj2);
            return obj2;
        }
        u0 u0Var2 = (u0) obj;
        h1 G = G(u0Var2);
        if (G == null) {
            return a0.f1665f;
        }
        e1 e1Var = u0Var2 instanceof e1 ? (e1) u0Var2 : null;
        if (e1Var == null) {
            e1Var = new e1(G, null);
        }
        synchronized (e1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e1.f1687g;
            if (atomicIntegerFieldUpdater.get(e1Var) != 0) {
                return a0.f1663d;
            }
            atomicIntegerFieldUpdater.set(e1Var, 1);
            if (e1Var != u0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1692f;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, u0Var2, e1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != u0Var2) {
                        return a0.f1665f;
                    }
                }
            }
            boolean e9 = e1Var.e();
            p pVar = obj2 instanceof p ? (p) obj2 : null;
            if (pVar != null) {
                e1Var.a(pVar.f1725a);
            }
            Throwable d8 = e9 ? null : e1Var.d();
            if (d8 != null) {
                U(G, d8);
            }
            l S = S(G);
            if (S != null && c0(e1Var, S, obj2)) {
                return a0.f1664e;
            }
            G.d(new h7.h(2), 2);
            l S2 = S(G);
            return (S2 == null || !c0(e1Var, S2, obj2)) ? y(e1Var, obj2) : a0.f1664e;
        }
    }

    @Override // c7.x0
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new y0(r(), null, this);
        }
        p(cancellationException);
    }

    public final boolean c0(e1 e1Var, l lVar, Object obj) {
        while (a0.m(lVar.f1712j, false, new d1(this, e1Var, lVar, obj)) == j1.f1710f) {
            lVar = S(lVar);
            if (lVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // h6.g
    public final h6.h getKey() {
        return u.f1748g;
    }

    public void j(Object obj) {
        i(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 == c7.a0.f1664e) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(Object obj) {
        h7.s sVar;
        Object obj2 = a0.f1663d;
        if (C()) {
            do {
                Object obj3 = f1692f.get(this);
                if (obj3 instanceof u0) {
                    if (obj3 instanceof e1) {
                        if (e1.f1687g.get((e1) obj3) != 0) {
                        }
                    }
                    obj2 = b0(obj3, new p(x(obj), false));
                }
                obj2 = a0.f1663d;
                break;
            } while (obj2 == a0.f1665f);
        }
        if (obj2 == a0.f1663d) {
            Throwable th = null;
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1692f;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                if (!(obj4 instanceof e1)) {
                    if (!(obj4 instanceof u0)) {
                        sVar = a0.f1666g;
                        break;
                    }
                    if (th == null) {
                        th = x(obj);
                    }
                    u0 u0Var = (u0) obj4;
                    if (u0Var.b()) {
                        h1 G = G(u0Var);
                        if (G != null) {
                            e1 e1Var = new e1(G, th);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, u0Var, e1Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != u0Var) {
                                    break;
                                }
                            }
                            U(G, th);
                            sVar = a0.f1663d;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object b0 = b0(obj4, new p(th, false));
                        if (b0 == a0.f1663d) {
                            throw new IllegalStateException(("Cannot happen in " + obj4).toString());
                        }
                        if (b0 != a0.f1665f) {
                            obj2 = b0;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        if (e1.f1689i.get((e1) obj4) == a0.f1667h) {
                            sVar = a0.f1666g;
                        } else {
                            boolean e9 = ((e1) obj4).e();
                            if (th == null) {
                                th = x(obj);
                            }
                            ((e1) obj4).a(th);
                            Throwable d8 = e9 ? null : ((e1) obj4).d();
                            if (d8 != null) {
                                U(((e1) obj4).f1690f, d8);
                            }
                            sVar = a0.f1663d;
                        }
                    }
                }
            }
            obj2 = sVar;
        }
        if (obj2 != a0.f1663d && obj2 != a0.f1664e) {
            if (obj2 == a0.f1666g) {
                return false;
            }
            i(obj2);
            return true;
        }
        return true;
    }

    @Override // c7.x0
    public final i0 n(boolean z8, boolean z9, a1 a1Var) {
        return L(z9, z8 ? new w0(a1Var) : new j0(1, a1Var));
    }

    public void p(CancellationException cancellationException) {
        m(cancellationException);
    }

    public final boolean q(Throwable th) {
        if (M()) {
            return true;
        }
        boolean z8 = th instanceof CancellationException;
        k kVar = (k) f1693g.get(this);
        return (kVar == null || kVar == j1.f1710f) ? z8 : kVar.e(th) || z8;
    }

    public String r() {
        return "Job was cancelled";
    }

    public boolean s(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m(th) && B();
    }

    @Override // c7.x0
    public final boolean start() {
        int Z;
        do {
            Z = Z(f1692f.get(this));
            if (Z == 0) {
                return false;
            }
        } while (Z != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(R() + '{' + a0(f1692f.get(this)) + '}');
        sb.append('@');
        sb.append(a0.i(this));
        return sb.toString();
    }

    @Override // h6.i
    public final h6.g u(h6.h hVar) {
        return t6.a.B(this, hVar);
    }

    public final void v(u0 u0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1693g;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        if (kVar != null) {
            kVar.a();
            atomicReferenceFieldUpdater.set(this, j1.f1710f);
        }
        b4.c cVar = null;
        p pVar = obj instanceof p ? (p) obj : null;
        Throwable th = pVar != null ? pVar.f1725a : null;
        if (u0Var instanceof b1) {
            try {
                ((b1) u0Var).l(th);
                return;
            } catch (Throwable th2) {
                J(new b4.c("Exception in completion handler " + u0Var + " for " + this, th2));
                return;
            }
        }
        h1 c4 = u0Var.c();
        if (c4 != null) {
            c4.d(new h7.h(1), 1);
            Object obj2 = h7.i.f4688f.get(c4);
            r6.k.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (h7.i iVar = (h7.i) obj2; !iVar.equals(c4); iVar = iVar.h()) {
                if (iVar instanceof b1) {
                    try {
                        ((b1) iVar).l(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            d6.a.a(cVar, th3);
                        } else {
                            cVar = new b4.c("Exception in completion handler " + iVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                J(cVar);
            }
        }
    }

    @Override // c7.x0
    public final CancellationException w() {
        CancellationException cancellationException;
        Object obj = f1692f.get(this);
        if (!(obj instanceof e1)) {
            if (obj instanceof u0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof p)) {
                return new y0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((p) obj).f1725a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new y0(r(), th, this) : cancellationException;
        }
        Throwable d8 = ((e1) obj).d();
        if (d8 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = d8 instanceof CancellationException ? (CancellationException) d8 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = r();
        }
        return new y0(concat, d8, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable x(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        f1 f1Var = (f1) ((l1) obj);
        Object obj2 = f1692f.get(f1Var);
        if (obj2 instanceof e1) {
            cancellationException = ((e1) obj2).d();
        } else if (obj2 instanceof p) {
            cancellationException = ((p) obj2).f1725a;
        } else {
            if (obj2 instanceof u0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new y0("Parent job is ".concat(a0(obj2)), cancellationException, f1Var) : cancellationException2;
    }

    public final Object y(e1 e1Var, Object obj) {
        Throwable A;
        p pVar = obj instanceof p ? (p) obj : null;
        Throwable th = pVar != null ? pVar.f1725a : null;
        synchronized (e1Var) {
            e1Var.e();
            ArrayList f9 = e1Var.f(th);
            A = A(e1Var, f9);
            if (A != null && f9.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f9.size()));
                int size = f9.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj2 = f9.get(i7);
                    i7++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != A && th2 != A && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        d6.a.a(A, th2);
                    }
                }
            }
        }
        if (A != null && A != th) {
            obj = new p(A, false);
        }
        if (A != null && (q(A) || H(A))) {
            r6.k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            p.f1724b.compareAndSet((p) obj, 0, 1);
        }
        V(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1692f;
        Object v0Var = obj instanceof u0 ? new v0((u0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, e1Var, v0Var) && atomicReferenceFieldUpdater.get(this) == e1Var) {
        }
        v(e1Var, obj);
        return obj;
    }

    @Override // h6.i
    public final h6.i z(h6.i iVar) {
        return t6.a.I(this, iVar);
    }

    public void W() {
    }

    public void J(b4.c cVar) {
        throw cVar;
    }

    public void V(Object obj) {
    }

    public void i(Object obj) {
    }
}
