package W2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.C1331f;

/* loaded from: classes.dex */
public class k0 implements InterfaceC0280c0, q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4279d = AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "_state$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4280e = AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public k0(boolean z4) {
        this._state$volatile = z4 ? B.f4217j : B.f4216i;
    }

    public static C0290l X(b3.i iVar) {
        while (iVar.i()) {
            b3.i f4 = iVar.f();
            if (f4 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b3.i.f5668e;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (b3.i) obj;
                    if (!iVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVar);
                }
            } else {
                iVar = f4;
            }
        }
        while (true) {
            iVar = iVar.h();
            if (!iVar.i()) {
                if (iVar instanceof C0290l) {
                    return (C0290l) iVar;
                }
                if (iVar instanceof m0) {
                    return null;
                }
            }
        }
    }

    public static String e0(Object obj) {
        if (!(obj instanceof j0)) {
            return obj instanceof Z ? ((Z) obj).b() ? "Active" : "New" : obj instanceof C0294p ? "Cancelled" : "Completed";
        }
        j0 j0Var = (j0) obj;
        return j0Var.e() ? "Cancelling" : j0.f4275e.get(j0Var) != 0 ? "Completing" : "Active";
    }

    public void A(Object obj) {
    }

    public void B(Object obj) {
        A(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0069, code lost:
    
        r0 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean C(Object obj) {
        b3.t tVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = B.f4211d;
        if (N()) {
            do {
                Object obj3 = f4279d.get(this);
                if (obj3 instanceof Z) {
                    if (obj3 instanceof j0) {
                        j0 j0Var = (j0) obj3;
                        j0Var.getClass();
                        if (j0.f4275e.get(j0Var) != 0) {
                        }
                    }
                    obj2 = f0(obj3, new C0294p(J(obj), false));
                }
                obj2 = B.f4211d;
                break;
            } while (obj2 == B.f4213f);
            if (obj2 == B.f4212e) {
                return true;
            }
        }
        if (obj2 == B.f4211d) {
            Throwable th = null;
            loop1: while (true) {
                Object obj4 = f4279d.get(this);
                if (!(obj4 instanceof j0)) {
                    if (!(obj4 instanceof Z)) {
                        tVar = B.f4214g;
                        break;
                    }
                    if (th == null) {
                        th = J(obj);
                    }
                    Z z4 = (Z) obj4;
                    if (z4.b()) {
                        m0 O3 = O(z4);
                        if (O3 == null) {
                            continue;
                        } else {
                            j0 j0Var2 = new j0(O3, th);
                            do {
                                atomicReferenceFieldUpdater = f4279d;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, z4, j0Var2)) {
                                    Y(O3, th);
                                    tVar = B.f4211d;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == z4);
                        }
                    } else {
                        Object f02 = f0(obj4, new C0294p(th, false));
                        if (f02 == B.f4211d) {
                            throw new IllegalStateException(("Cannot happen in " + obj4).toString());
                        }
                        if (f02 != B.f4213f) {
                            obj2 = f02;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        try {
                            j0 j0Var3 = (j0) obj4;
                            j0Var3.getClass();
                            if (j0.f4277j.get(j0Var3) == B.f4215h) {
                                tVar = B.f4214g;
                            } else {
                                boolean e4 = ((j0) obj4).e();
                                if (th == null) {
                                    th = J(obj);
                                }
                                ((j0) obj4).a(th);
                                Throwable c4 = e4 ? null : ((j0) obj4).c();
                                if (c4 != null) {
                                    Y(((j0) obj4).f4278d, c4);
                                }
                                tVar = B.f4211d;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
        if (obj2 != B.f4211d && obj2 != B.f4212e) {
            if (obj2 == B.f4214g) {
                return false;
            }
            A(obj2);
        }
        return true;
    }

    public void D(CancellationException cancellationException) {
        C(cancellationException);
    }

    public final boolean E(Throwable th) {
        if (T()) {
            return true;
        }
        boolean z4 = th instanceof CancellationException;
        InterfaceC0289k interfaceC0289k = (InterfaceC0289k) f4280e.get(this);
        return (interfaceC0289k == null || interfaceC0289k == o0.f4289d) ? z4 : interfaceC0289k.c(th) || z4;
    }

    public String F() {
        return "Job was cancelled";
    }

    public boolean G(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return C(th) && M();
    }

    public final void I(Z z4, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4280e;
        InterfaceC0289k interfaceC0289k = (InterfaceC0289k) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0289k != null) {
            interfaceC0289k.a();
            atomicReferenceFieldUpdater.set(this, o0.f4289d);
        }
        I1.b bVar = null;
        C0294p c0294p = obj instanceof C0294p ? (C0294p) obj : null;
        Throwable th = c0294p != null ? c0294p.f4291a : null;
        if (z4 instanceof g0) {
            try {
                ((g0) z4).l(th);
                return;
            } catch (Throwable th2) {
                Q(new I1.b("Exception in completion handler " + z4 + " for " + this, th2));
                return;
            }
        }
        m0 d4 = z4.d();
        if (d4 != null) {
            d4.e(new b3.h(1), 1);
            Object obj2 = b3.i.f5667d.get(d4);
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (b3.i iVar = (b3.i) obj2; !iVar.equals(d4); iVar = iVar.h()) {
                if (iVar instanceof g0) {
                    try {
                        ((g0) iVar).l(th);
                    } catch (Throwable th3) {
                        if (bVar != null) {
                            C1331f.a(bVar, th3);
                        } else {
                            bVar = new I1.b("Exception in completion handler " + iVar + " for " + this, th3);
                            Unit unit = Unit.f7487a;
                        }
                    }
                }
            }
            if (bVar != null) {
                Q(bVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable J(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        k0 k0Var = (k0) ((q0) obj);
        Object obj2 = f4279d.get(k0Var);
        if (obj2 instanceof j0) {
            cancellationException = ((j0) obj2).c();
        } else if (obj2 instanceof C0294p) {
            cancellationException = ((C0294p) obj2).f4291a;
        } else {
            if (obj2 instanceof Z) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new C0282d0("Parent job is ".concat(e0(obj2)), cancellationException, k0Var);
        }
        return cancellationException2;
    }

    public final Object K(j0 j0Var, Object obj) {
        Throwable L3;
        C0294p c0294p = obj instanceof C0294p ? (C0294p) obj : null;
        Throwable th = c0294p != null ? c0294p.f4291a : null;
        synchronized (j0Var) {
            j0Var.e();
            ArrayList<Throwable> f4 = j0Var.f(th);
            L3 = L(j0Var, f4);
            if (L3 != null && f4.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f4.size()));
                for (Throwable th2 : f4) {
                    if (th2 != L3 && th2 != L3 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        C1331f.a(L3, th2);
                    }
                }
            }
        }
        if (L3 != null && L3 != th) {
            obj = new C0294p(L3, false);
        }
        if (L3 != null && (E(L3) || P(L3))) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0294p.f4290b.compareAndSet((C0294p) obj, 0, 1);
        }
        Z(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4279d;
        Object c0276a0 = obj instanceof Z ? new C0276a0((Z) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, j0Var, c0276a0) && atomicReferenceFieldUpdater.get(this) == j0Var) {
        }
        I(j0Var, obj);
        return obj;
    }

    public final Throwable L(j0 j0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (j0Var.e()) {
                return new C0282d0(F(), null, this);
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
        if (th2 instanceof v0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof v0)) {
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

    public boolean M() {
        return true;
    }

    public boolean N() {
        return this instanceof C0292n;
    }

    public final m0 O(Z z4) {
        m0 d4 = z4.d();
        if (d4 != null) {
            return d4;
        }
        if (z4 instanceof N) {
            return new m0();
        }
        if (z4 instanceof g0) {
            c0((g0) z4);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + z4).toString());
    }

    public boolean P(Throwable th) {
        return false;
    }

    public void Q(I1.b bVar) {
        throw bVar;
    }

    public final void R(InterfaceC0280c0 interfaceC0280c0) {
        o0 o0Var = o0.f4289d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4280e;
        if (interfaceC0280c0 == null) {
            atomicReferenceFieldUpdater.set(this, o0Var);
            return;
        }
        interfaceC0280c0.h();
        InterfaceC0289k d4 = interfaceC0280c0.d(this);
        atomicReferenceFieldUpdater.set(this, d4);
        if (f4279d.get(this) instanceof Z) {
            return;
        }
        d4.a();
        atomicReferenceFieldUpdater.set(this, o0Var);
    }

    public final L S(boolean z4, g0 g0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o0 o0Var;
        boolean z5;
        boolean e4;
        g0Var.f4261j = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f4279d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z6 = obj instanceof N;
            o0Var = o0.f4289d;
            z5 = true;
            if (!z6) {
                if (!(obj instanceof Z)) {
                    z5 = false;
                    break;
                }
                Z z7 = (Z) obj;
                m0 d4 = z7.d();
                if (d4 == null) {
                    Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    c0((g0) obj);
                } else {
                    if (g0Var.k()) {
                        j0 j0Var = z7 instanceof j0 ? (j0) z7 : null;
                        Throwable c4 = j0Var != null ? j0Var.c() : null;
                        if (c4 != null) {
                            if (z4) {
                                g0Var.l(c4);
                            }
                            return o0Var;
                        }
                        e4 = d4.e(g0Var, 5);
                    } else {
                        e4 = d4.e(g0Var, 1);
                    }
                    if (e4) {
                        break;
                    }
                }
            } else {
                N n2 = (N) obj;
                if (n2.f4229d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                b0(n2);
            }
        }
        if (z5) {
            return g0Var;
        }
        if (z4) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0294p c0294p = obj2 instanceof C0294p ? (C0294p) obj2 : null;
            g0Var.l(c0294p != null ? c0294p.f4291a : null);
        }
        return o0Var;
    }

    public boolean T() {
        return this instanceof C0279c;
    }

    public final boolean U(Object obj) {
        Object f02;
        do {
            f02 = f0(f4279d.get(this), obj);
            if (f02 == B.f4211d) {
                return false;
            }
            if (f02 == B.f4212e) {
                return true;
            }
        } while (f02 == B.f4213f);
        A(f02);
        return true;
    }

    public final Object V(Object obj) {
        Object f02;
        do {
            f02 = f0(f4279d.get(this), obj);
            if (f02 == B.f4211d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0294p c0294p = obj instanceof C0294p ? (C0294p) obj : null;
                throw new IllegalStateException(str, c0294p != null ? c0294p.f4291a : null);
            }
        } while (f02 == B.f4213f);
        return f02;
    }

    public String W() {
        return getClass().getSimpleName();
    }

    public final void Y(m0 m0Var, Throwable th) {
        m0Var.e(new b3.h(4), 4);
        Object obj = b3.i.f5667d.get(m0Var);
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        I1.b bVar = null;
        for (b3.i iVar = (b3.i) obj; !iVar.equals(m0Var); iVar = iVar.h()) {
            if ((iVar instanceof g0) && ((g0) iVar).k()) {
                try {
                    ((g0) iVar).l(th);
                } catch (Throwable th2) {
                    if (bVar != null) {
                        C1331f.a(bVar, th2);
                    } else {
                        bVar = new I1.b("Exception in completion handler " + iVar + " for " + this, th2);
                        Unit unit = Unit.f7487a;
                    }
                }
            }
        }
        if (bVar != null) {
            Q(bVar);
        }
        E(th);
    }

    public void Z(Object obj) {
    }

    @Override // W2.InterfaceC0280c0
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0282d0(F(), null, this);
        }
        D(cancellationException);
    }

    public void a0() {
    }

    @Override // W2.InterfaceC0280c0
    public boolean b() {
        Object obj = f4279d.get(this);
        return (obj instanceof Z) && ((Z) obj).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [W2.Y] */
    public final void b0(N n2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m0 m0Var = new m0();
        if (!n2.f4229d) {
            m0Var = new Y(m0Var);
        }
        do {
            atomicReferenceFieldUpdater = f4279d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, n2, m0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == n2);
    }

    public final void c0(g0 g0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m0 m0Var = new m0();
        g0Var.getClass();
        b3.i.f5668e.set(m0Var, g0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b3.i.f5667d;
        atomicReferenceFieldUpdater2.set(m0Var, g0Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(g0Var) == g0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(g0Var, g0Var, m0Var)) {
                    if (atomicReferenceFieldUpdater2.get(g0Var) != g0Var) {
                        break;
                    }
                }
                m0Var.g(g0Var);
                break loop0;
            }
            break;
        }
        b3.i h4 = g0Var.h();
        do {
            atomicReferenceFieldUpdater = f4279d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, g0Var, h4)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == g0Var);
    }

    @Override // W2.InterfaceC0280c0
    public final InterfaceC0289k d(k0 k0Var) {
        C0290l c0290l = new C0290l(k0Var);
        c0290l.f4261j = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4279d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof N) {
                N n2 = (N) obj;
                if (n2.f4229d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0290l)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                b0(n2);
            } else {
                boolean z4 = obj instanceof Z;
                o0 o0Var = o0.f4289d;
                if (!z4) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0294p c0294p = obj2 instanceof C0294p ? (C0294p) obj2 : null;
                    c0290l.l(c0294p != null ? c0294p.f4291a : null);
                    return o0Var;
                }
                m0 d4 = ((Z) obj).d();
                if (d4 == null) {
                    Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    c0((g0) obj);
                } else if (!d4.e(c0290l, 7)) {
                    boolean e4 = d4.e(c0290l, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof j0) {
                        r4 = ((j0) obj3).c();
                    } else {
                        C0294p c0294p2 = obj3 instanceof C0294p ? (C0294p) obj3 : null;
                        if (c0294p2 != null) {
                            r4 = c0294p2.f4291a;
                        }
                    }
                    c0290l.l(r4);
                    if (e4) {
                        break loop0;
                    }
                    return o0Var;
                }
            }
        }
        return c0290l;
    }

    public final int d0(Object obj) {
        boolean z4 = obj instanceof N;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4279d;
        if (z4) {
            if (((N) obj).f4229d) {
                return 0;
            }
            N n2 = B.f4217j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, n2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            a0();
            return 1;
        }
        if (!(obj instanceof Y)) {
            return 0;
        }
        m0 m0Var = ((Y) obj).f4245d;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        a0();
        return 1;
    }

    public final Object f0(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof Z)) {
            return B.f4211d;
        }
        if (((obj instanceof N) || (obj instanceof g0)) && !(obj instanceof C0290l) && !(obj2 instanceof C0294p)) {
            Z z4 = (Z) obj;
            Object c0276a0 = obj2 instanceof Z ? new C0276a0((Z) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f4279d;
                if (atomicReferenceFieldUpdater.compareAndSet(this, z4, c0276a0)) {
                    Z(obj2);
                    I(z4, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == z4);
            return B.f4213f;
        }
        Z z5 = (Z) obj;
        m0 O3 = O(z5);
        if (O3 == null) {
            return B.f4213f;
        }
        j0 j0Var = z5 instanceof j0 ? (j0) z5 : null;
        if (j0Var == null) {
            j0Var = new j0(O3, null);
        }
        M2.E e4 = new M2.E();
        synchronized (j0Var) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j0.f4275e;
                if (atomicIntegerFieldUpdater.get(j0Var) != 0) {
                    return B.f4211d;
                }
                atomicIntegerFieldUpdater.set(j0Var, 1);
                if (j0Var != z5) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4279d;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, z5, j0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != z5) {
                            return B.f4213f;
                        }
                    }
                }
                boolean e5 = j0Var.e();
                C0294p c0294p = obj2 instanceof C0294p ? (C0294p) obj2 : null;
                if (c0294p != null) {
                    j0Var.a(c0294p.f4291a);
                }
                Throwable c4 = e5 ? null : j0Var.c();
                e4.f3580d = c4;
                Unit unit = Unit.f7487a;
                if (c4 != null) {
                    Y(O3, c4);
                }
                C0290l X3 = X(O3);
                if (X3 != null && g0(j0Var, X3, obj2)) {
                    return B.f4212e;
                }
                O3.e(new b3.h(2), 2);
                C0290l X4 = X(O3);
                return (X4 == null || !g0(j0Var, X4, obj2)) ? K(j0Var, obj2) : B.f4212e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W2.InterfaceC0280c0
    public final CancellationException g() {
        CancellationException cancellationException;
        Object obj = f4279d.get(this);
        if (!(obj instanceof j0)) {
            if (obj instanceof Z) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0294p)) {
                return new C0282d0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0294p) obj).f4291a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C0282d0(F(), th, this) : cancellationException;
        }
        Throwable c4 = ((j0) obj).c();
        if (c4 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c4 instanceof CancellationException ? (CancellationException) c4 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = F();
        }
        return new C0282d0(concat, c4, this);
    }

    public final boolean g0(j0 j0Var, C0290l c0290l, Object obj) {
        while (B.j(c0290l.f4281k, false, new i0(this, j0Var, c0290l, obj)) == o0.f4289d) {
            c0290l = X(c0290l);
            if (c0290l == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.g getKey() {
        return C0299v.f4296e;
    }

    @Override // W2.InterfaceC0280c0
    public final boolean h() {
        int d02;
        do {
            d02 = d0(f4279d.get(this));
            if (d02 == 0) {
                return false;
            }
        } while (d02 != 1);
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object i(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.h(obj, this);
    }

    @Override // W2.InterfaceC0280c0
    public final L j(boolean z4, boolean z5, f0 f0Var) {
        return S(z5, z4 ? new C0278b0(f0Var) : new M(1, f0Var));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element k(kotlin.coroutines.g gVar) {
        return kotlin.coroutines.f.a(this, gVar);
    }

    @Override // W2.InterfaceC0280c0
    public final L r(Function1 function1) {
        return S(true, new M(1, function1));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext s(CoroutineContext coroutineContext) {
        return kotlin.coroutines.f.c(coroutineContext, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(W() + '{' + e0(f4279d.get(this)) + '}');
        sb.append('@');
        sb.append(B.f(this));
        return sb.toString();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext w(kotlin.coroutines.g gVar) {
        return kotlin.coroutines.f.b(this, gVar);
    }

    @Override // W2.InterfaceC0280c0
    public final Object x(E2.c frame) {
        Object obj;
        do {
            obj = f4279d.get(this);
            if (!(obj instanceof Z)) {
                B.e(frame.p());
                return Unit.f7487a;
            }
        } while (d0(obj) < 0);
        C0286h c0286h = new C0286h(1, D2.f.b(frame));
        c0286h.s();
        c0286h.w(new C0283e(2, B.j(this, true, new C0288j(c0286h, 1))));
        Object r2 = c0286h.r();
        D2.a aVar = D2.a.f2163d;
        if (r2 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (r2 != aVar) {
            r2 = Unit.f7487a;
        }
        return r2 == aVar ? r2 : Unit.f7487a;
    }
}
