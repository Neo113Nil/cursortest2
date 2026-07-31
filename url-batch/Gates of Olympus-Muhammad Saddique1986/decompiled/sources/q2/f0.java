package q2;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class f0 implements X, l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7895d = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_state$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7896e = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public f0(boolean z3) {
        this._state$volatile = z3 ? AbstractC0837y.f7949j : AbstractC0837y.f7948i;
    }

    public static C0825l Y(v2.i iVar) {
        while (iVar.i()) {
            v2.i f3 = iVar.f();
            if (f3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v2.i.f9808e;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (v2.i) obj;
                    if (!iVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVar);
                }
            } else {
                iVar = f3;
            }
        }
        while (true) {
            iVar = iVar.h();
            if (!iVar.i()) {
                if (iVar instanceof C0825l) {
                    return (C0825l) iVar;
                }
                if (iVar instanceof h0) {
                    return null;
                }
            }
        }
    }

    public static String f0(Object obj) {
        if (!(obj instanceof e0)) {
            return obj instanceof U ? ((U) obj).b() ? "Active" : "New" : obj instanceof C0829p ? "Cancelled" : "Completed";
        }
        e0 e0Var = (e0) obj;
        return e0Var.e() ? "Cancelling" : e0.f7891e.get(e0Var) != 0 ? "Completing" : "Active";
    }

    public void D(Object obj) {
        A(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0069, code lost:
    
        r0 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(Object obj) {
        m1.q qVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = AbstractC0837y.f7943d;
        if (O()) {
            do {
                Object obj3 = f7895d.get(this);
                if (obj3 instanceof U) {
                    if (obj3 instanceof e0) {
                        e0 e0Var = (e0) obj3;
                        e0Var.getClass();
                        if (e0.f7891e.get(e0Var) != 0) {
                        }
                    }
                    obj2 = g0(obj3, new C0829p(K(obj), false));
                }
                obj2 = AbstractC0837y.f7943d;
                break;
            } while (obj2 == AbstractC0837y.f7945f);
            if (obj2 == AbstractC0837y.f7944e) {
                return true;
            }
        }
        if (obj2 == AbstractC0837y.f7943d) {
            Throwable th = null;
            loop1: while (true) {
                Object obj4 = f7895d.get(this);
                if (!(obj4 instanceof e0)) {
                    if (!(obj4 instanceof U)) {
                        qVar = AbstractC0837y.f7946g;
                        break;
                    }
                    if (th == null) {
                        th = K(obj);
                    }
                    U u3 = (U) obj4;
                    if (u3.b()) {
                        h0 P3 = P(u3);
                        if (P3 == null) {
                            continue;
                        } else {
                            e0 e0Var2 = new e0(P3, th);
                            do {
                                atomicReferenceFieldUpdater = f7895d;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, u3, e0Var2)) {
                                    Z(P3, th);
                                    qVar = AbstractC0837y.f7943d;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == u3);
                        }
                    } else {
                        Object g02 = g0(obj4, new C0829p(th, false));
                        if (g02 == AbstractC0837y.f7943d) {
                            throw new IllegalStateException(("Cannot happen in " + obj4).toString());
                        }
                        if (g02 != AbstractC0837y.f7945f) {
                            obj2 = g02;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        try {
                            e0 e0Var3 = (e0) obj4;
                            e0Var3.getClass();
                            if (e0.f7893g.get(e0Var3) == AbstractC0837y.f7947h) {
                                qVar = AbstractC0837y.f7946g;
                            } else {
                                boolean e3 = ((e0) obj4).e();
                                if (th == null) {
                                    th = K(obj);
                                }
                                ((e0) obj4).a(th);
                                Throwable c2 = e3 ? null : ((e0) obj4).c();
                                if (c2 != null) {
                                    Z(((e0) obj4).f7894d, c2);
                                }
                                qVar = AbstractC0837y.f7943d;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
        if (obj2 != AbstractC0837y.f7943d && obj2 != AbstractC0837y.f7944e) {
            if (obj2 == AbstractC0837y.f7946g) {
                return false;
            }
            A(obj2);
        }
        return true;
    }

    public void F(CancellationException cancellationException) {
        E(cancellationException);
    }

    public final boolean G(Throwable th) {
        if (U()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        InterfaceC0824k interfaceC0824k = (InterfaceC0824k) f7896e.get(this);
        return (interfaceC0824k == null || interfaceC0824k == j0.f7909d) ? z3 : interfaceC0824k.c(th) || z3;
    }

    public String H() {
        return "Job was cancelled";
    }

    public boolean I(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return E(th) && N();
    }

    public final void J(U u3, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7896e;
        InterfaceC0824k interfaceC0824k = (InterfaceC0824k) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0824k != null) {
            interfaceC0824k.a();
            atomicReferenceFieldUpdater.set(this, j0.f7909d);
        }
        C1.c cVar = null;
        C0829p c0829p = obj instanceof C0829p ? (C0829p) obj : null;
        Throwable th = c0829p != null ? c0829p.f7917a : null;
        if (u3 instanceof b0) {
            try {
                ((b0) u3).l(th);
                return;
            } catch (Throwable th2) {
                R(new C1.c("Exception in completion handler " + u3 + " for " + this, th2));
                return;
            }
        }
        h0 d3 = u3.d();
        if (d3 != null) {
            d3.e(new v2.h(1), 1);
            Object obj2 = v2.i.f9807d.get(d3);
            f2.j.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (v2.i iVar = (v2.i) obj2; !iVar.equals(d3); iVar = iVar.h()) {
                if (iVar instanceof b0) {
                    try {
                        ((b0) iVar).l(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            R1.a.a(cVar, th3);
                        } else {
                            cVar = new C1.c("Exception in completion handler " + iVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                R(cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable K(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        f0 f0Var = (f0) ((l0) obj);
        Object obj2 = f7895d.get(f0Var);
        if (obj2 instanceof e0) {
            cancellationException = ((e0) obj2).c();
        } else if (obj2 instanceof C0829p) {
            cancellationException = ((C0829p) obj2).f7917a;
        } else {
            if (obj2 instanceof U) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new Y("Parent job is ".concat(f0(obj2)), cancellationException, f0Var);
        }
        return cancellationException2;
    }

    public final Object L(e0 e0Var, Object obj) {
        Throwable M3;
        C0829p c0829p = obj instanceof C0829p ? (C0829p) obj : null;
        Throwable th = c0829p != null ? c0829p.f7917a : null;
        synchronized (e0Var) {
            e0Var.e();
            ArrayList<Throwable> f3 = e0Var.f(th);
            M3 = M(e0Var, f3);
            if (M3 != null && f3.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f3.size()));
                for (Throwable th2 : f3) {
                    if (th2 != M3 && th2 != M3 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        R1.a.a(M3, th2);
                    }
                }
            }
        }
        if (M3 != null && M3 != th) {
            obj = new C0829p(M3, false);
        }
        if (M3 != null && (G(M3) || Q(M3))) {
            f2.j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0829p.f7916b.compareAndSet((C0829p) obj, 0, 1);
        }
        a0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7895d;
        Object v3 = obj instanceof U ? new V((U) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, e0Var, v3) && atomicReferenceFieldUpdater.get(this) == e0Var) {
        }
        J(e0Var, obj);
        return obj;
    }

    public final Throwable M(e0 e0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (e0Var.e()) {
                return new Y(H(), null, this);
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
        if (th2 instanceof q0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof q0)) {
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

    public boolean N() {
        return true;
    }

    public boolean O() {
        return this instanceof C0827n;
    }

    public final h0 P(U u3) {
        h0 d3 = u3.d();
        if (d3 != null) {
            return d3;
        }
        if (u3 instanceof I) {
            return new h0();
        }
        if (u3 instanceof b0) {
            d0((b0) u3);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + u3).toString());
    }

    public boolean Q(Throwable th) {
        return false;
    }

    public final void S(X x3) {
        j0 j0Var = j0.f7909d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7896e;
        if (x3 == null) {
            atomicReferenceFieldUpdater.set(this, j0Var);
            return;
        }
        x3.h();
        InterfaceC0824k z3 = x3.z(this);
        atomicReferenceFieldUpdater.set(this, z3);
        if (f7895d.get(this) instanceof U) {
            return;
        }
        z3.a();
        atomicReferenceFieldUpdater.set(this, j0Var);
    }

    public final G T(boolean z3, b0 b0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j0 j0Var;
        boolean z4;
        boolean e3;
        b0Var.f7880g = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f7895d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z5 = obj instanceof I;
            j0Var = j0.f7909d;
            z4 = true;
            if (!z5) {
                if (!(obj instanceof U)) {
                    z4 = false;
                    break;
                }
                U u3 = (U) obj;
                h0 d3 = u3.d();
                if (d3 == null) {
                    f2.j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    d0((b0) obj);
                } else {
                    if (b0Var.k()) {
                        e0 e0Var = u3 instanceof e0 ? (e0) u3 : null;
                        Throwable c2 = e0Var != null ? e0Var.c() : null;
                        if (c2 != null) {
                            if (z3) {
                                b0Var.l(c2);
                            }
                            return j0Var;
                        }
                        e3 = d3.e(b0Var, 5);
                    } else {
                        e3 = d3.e(b0Var, 1);
                    }
                    if (e3) {
                        break;
                    }
                }
            } else {
                I i3 = (I) obj;
                if (i3.f7855d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                c0(i3);
            }
        }
        if (z4) {
            return b0Var;
        }
        if (z3) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0829p c0829p = obj2 instanceof C0829p ? (C0829p) obj2 : null;
            b0Var.l(c0829p != null ? c0829p.f7917a : null);
        }
        return j0Var;
    }

    public boolean U() {
        return this instanceof C0816c;
    }

    public final boolean V(Object obj) {
        Object g02;
        do {
            g02 = g0(f7895d.get(this), obj);
            if (g02 == AbstractC0837y.f7943d) {
                return false;
            }
            if (g02 == AbstractC0837y.f7944e) {
                return true;
            }
        } while (g02 == AbstractC0837y.f7945f);
        A(g02);
        return true;
    }

    public final Object W(Object obj) {
        Object g02;
        do {
            g02 = g0(f7895d.get(this), obj);
            if (g02 == AbstractC0837y.f7943d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0829p c0829p = obj instanceof C0829p ? (C0829p) obj : null;
                throw new IllegalStateException(str, c0829p != null ? c0829p.f7917a : null);
            }
        } while (g02 == AbstractC0837y.f7945f);
        return g02;
    }

    public String X() {
        return getClass().getSimpleName();
    }

    public final void Z(h0 h0Var, Throwable th) {
        h0Var.e(new v2.h(4), 4);
        Object obj = v2.i.f9807d.get(h0Var);
        f2.j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C1.c cVar = null;
        for (v2.i iVar = (v2.i) obj; !iVar.equals(h0Var); iVar = iVar.h()) {
            if ((iVar instanceof b0) && ((b0) iVar).k()) {
                try {
                    ((b0) iVar).l(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        R1.a.a(cVar, th2);
                    } else {
                        cVar = new C1.c("Exception in completion handler " + iVar + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            R(cVar);
        }
        G(th);
    }

    @Override // q2.X
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new Y(H(), null, this);
        }
        F(cancellationException);
    }

    @Override // q2.X
    public boolean b() {
        Object obj = f7895d.get(this);
        return (obj instanceof U) && ((U) obj).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [q2.T] */
    public final void c0(I i3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h0 h0Var = new h0();
        if (!i3.f7855d) {
            h0Var = new T(h0Var);
        }
        do {
            atomicReferenceFieldUpdater = f7895d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, i3, h0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == i3);
    }

    @Override // V1.i
    public final V1.i d(V1.i iVar) {
        return AbstractC0508a.L(this, iVar);
    }

    public final void d0(b0 b0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h0 h0Var = new h0();
        b0Var.getClass();
        v2.i.f9808e.set(h0Var, b0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = v2.i.f9807d;
        atomicReferenceFieldUpdater2.set(h0Var, b0Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(b0Var) == b0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(b0Var, b0Var, h0Var)) {
                    if (atomicReferenceFieldUpdater2.get(b0Var) != b0Var) {
                        break;
                    }
                }
                h0Var.g(b0Var);
                break loop0;
            }
            break;
        }
        v2.i h3 = b0Var.h();
        do {
            atomicReferenceFieldUpdater = f7895d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, b0Var, h3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == b0Var);
    }

    @Override // V1.i
    public final Object e(Object obj, InterfaceC0426e interfaceC0426e) {
        return interfaceC0426e.h(obj, this);
    }

    public final int e0(Object obj) {
        boolean z3 = obj instanceof I;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7895d;
        if (z3) {
            if (((I) obj).f7855d) {
                return 0;
            }
            I i3 = AbstractC0837y.f7949j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, i3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            b0();
            return 1;
        }
        if (!(obj instanceof T)) {
            return 0;
        }
        h0 h0Var = ((T) obj).f7871d;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        b0();
        return 1;
    }

    @Override // q2.X
    public final CancellationException g() {
        CancellationException cancellationException;
        Object obj = f7895d.get(this);
        if (!(obj instanceof e0)) {
            if (obj instanceof U) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0829p)) {
                return new Y(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0829p) obj).f7917a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new Y(H(), th, this) : cancellationException;
        }
        Throwable c2 = ((e0) obj).c();
        if (c2 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c2 instanceof CancellationException ? (CancellationException) c2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = H();
        }
        return new Y(concat, c2, this);
    }

    public final Object g0(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof U)) {
            return AbstractC0837y.f7943d;
        }
        if (((obj instanceof I) || (obj instanceof b0)) && !(obj instanceof C0825l) && !(obj2 instanceof C0829p)) {
            U u3 = (U) obj;
            Object v3 = obj2 instanceof U ? new V((U) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f7895d;
                if (atomicReferenceFieldUpdater.compareAndSet(this, u3, v3)) {
                    a0(obj2);
                    J(u3, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == u3);
            return AbstractC0837y.f7945f;
        }
        U u4 = (U) obj;
        h0 P3 = P(u4);
        if (P3 == null) {
            return AbstractC0837y.f7945f;
        }
        e0 e0Var = u4 instanceof e0 ? (e0) u4 : null;
        if (e0Var == null) {
            e0Var = new e0(P3, null);
        }
        synchronized (e0Var) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e0.f7891e;
                if (atomicIntegerFieldUpdater.get(e0Var) != 0) {
                    return AbstractC0837y.f7943d;
                }
                atomicIntegerFieldUpdater.set(e0Var, 1);
                if (e0Var != u4) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7895d;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, u4, e0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != u4) {
                            return AbstractC0837y.f7945f;
                        }
                    }
                }
                boolean e3 = e0Var.e();
                C0829p c0829p = obj2 instanceof C0829p ? (C0829p) obj2 : null;
                if (c0829p != null) {
                    e0Var.a(c0829p.f7917a);
                }
                Throwable c2 = e3 ? null : e0Var.c();
                if (c2 != null) {
                    Z(P3, c2);
                }
                C0825l Y2 = Y(P3);
                if (Y2 != null && h0(e0Var, Y2, obj2)) {
                    return AbstractC0837y.f7944e;
                }
                P3.e(new v2.h(2), 2);
                C0825l Y3 = Y(P3);
                return (Y3 == null || !h0(e0Var, Y3, obj2)) ? L(e0Var, obj2) : AbstractC0837y.f7944e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V1.g
    public final V1.h getKey() {
        return C0832t.f7929e;
    }

    @Override // q2.X
    public final boolean h() {
        int e02;
        do {
            e02 = e0(f7895d.get(this));
            if (e02 == 0) {
                return false;
            }
        } while (e02 != 1);
        return true;
    }

    public final boolean h0(e0 e0Var, C0825l c0825l, Object obj) {
        while (AbstractC0837y.n(c0825l.f7910h, false, new d0(this, e0Var, c0825l, obj)) == j0.f7909d) {
            c0825l = Y(c0825l);
            if (c0825l == null) {
                return false;
            }
        }
        return true;
    }

    @Override // V1.i
    public final V1.i l(V1.h hVar) {
        return AbstractC0508a.K(this, hVar);
    }

    @Override // q2.X
    public final Object r(X1.c cVar) {
        Object obj;
        R1.y yVar;
        do {
            obj = f7895d.get(this);
            boolean z3 = obj instanceof U;
            yVar = R1.y.f4171a;
            if (!z3) {
                AbstractC0837y.g(cVar.t());
                return yVar;
            }
        } while (e0(obj) < 0);
        C0821h c0821h = new C0821h(1, l0.c.B(cVar));
        c0821h.r();
        c0821h.w(new C0818e(2, AbstractC0837y.n(this, true, new C0823j(c0821h, 1))));
        Object q3 = c0821h.q();
        W1.a aVar = W1.a.f4608d;
        if (q3 != aVar) {
            q3 = yVar;
        }
        return q3 == aVar ? q3 : yVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(X() + '{' + f0(f7895d.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC0837y.j(this));
        return sb.toString();
    }

    @Override // V1.i
    public final V1.g v(V1.h hVar) {
        return AbstractC0508a.C(this, hVar);
    }

    @Override // q2.X
    public final G w(boolean z3, boolean z4, a0 a0Var) {
        return T(z4, z3 ? new W(a0Var) : new H(1, a0Var));
    }

    @Override // q2.X
    public final G x(InterfaceC0424c interfaceC0424c) {
        return T(true, new H(1, interfaceC0424c));
    }

    @Override // q2.X
    public final InterfaceC0824k z(f0 f0Var) {
        C0825l c0825l = new C0825l(f0Var);
        c0825l.f7880g = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7895d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof I) {
                I i3 = (I) obj;
                if (i3.f7855d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0825l)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                c0(i3);
            } else {
                boolean z3 = obj instanceof U;
                j0 j0Var = j0.f7909d;
                if (!z3) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0829p c0829p = obj2 instanceof C0829p ? (C0829p) obj2 : null;
                    c0825l.l(c0829p != null ? c0829p.f7917a : null);
                    return j0Var;
                }
                h0 d3 = ((U) obj).d();
                if (d3 == null) {
                    f2.j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    d0((b0) obj);
                } else if (!d3.e(c0825l, 7)) {
                    boolean e3 = d3.e(c0825l, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof e0) {
                        r4 = ((e0) obj3).c();
                    } else {
                        C0829p c0829p2 = obj3 instanceof C0829p ? (C0829p) obj3 : null;
                        if (c0829p2 != null) {
                            r4 = c0829p2.f7917a;
                        }
                    }
                    c0825l.l(r4);
                    if (e3) {
                        break loop0;
                    }
                    return j0Var;
                }
            }
        }
        return c0825l;
    }

    public void b0() {
    }

    public void A(Object obj) {
    }

    public void R(C1.c cVar) {
        throw cVar;
    }

    public void a0(Object obj) {
    }
}
