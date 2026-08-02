package x3;

import a.AbstractC0124a;
import f3.C0431i;
import f3.InterfaceC0428f;
import f3.InterfaceC0429g;
import f3.InterfaceC0430h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class d0 implements T, h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16029a = AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16030b = AtomicReferenceFieldUpdater.newUpdater(d0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public d0(boolean z) {
        this._state$volatile = z ? AbstractC1562w.f16071i : AbstractC1562w.f16070h;
    }

    public static C1550j I(C3.k kVar) {
        while (kVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3.k.f303b;
            C3.k e4 = kVar.e();
            if (e4 == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (C3.k) obj;
                    if (!kVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = e4;
            }
        }
        while (true) {
            kVar = kVar.h();
            if (!kVar.i()) {
                if (kVar instanceof C1550j) {
                    return (C1550j) kVar;
                }
                if (kVar instanceof e0) {
                    return null;
                }
            }
        }
    }

    public static String O(Object obj) {
        if (!(obj instanceof b0)) {
            return obj instanceof InterfaceC1538M ? ((InterfaceC1538M) obj).a() ? "Active" : "New" : obj instanceof C1554n ? "Cancelled" : "Completed";
        }
        b0 b0Var = (b0) obj;
        return b0Var.e() ? "Cancelling" : b0Var.f() ? "Completing" : "Active";
    }

    public final Object A() {
        while (true) {
            Object obj = f16029a.get(this);
            if (!(obj instanceof C3.p)) {
                return obj;
            }
            ((C3.p) obj).a(this);
        }
    }

    public boolean B(Throwable th) {
        return false;
    }

    public final void D(T t4) {
        int N4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16030b;
        f0 f0Var = f0.f16036a;
        if (t4 == null) {
            atomicReferenceFieldUpdater.set(this, f0Var);
            return;
        }
        d0 d0Var = (d0) t4;
        do {
            N4 = d0Var.N(d0Var.A());
            if (N4 == 0) {
                break;
            }
        } while (N4 != 1);
        InterfaceC1549i interfaceC1549i = (InterfaceC1549i) AbstractC1562w.f(d0Var, true, new C1550j(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC1549i);
        if (A() instanceof InterfaceC1538M) {
            return;
        }
        interfaceC1549i.dispose();
        atomicReferenceFieldUpdater.set(this, f0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1529D E(boolean z, boolean z4, P p2) {
        Y y4;
        Throwable th;
        if (z) {
            y4 = p2 instanceof V ? (V) p2 : null;
            if (y4 == null) {
                y4 = new Q(p2);
            }
        } else {
            y4 = p2 instanceof Y ? (Y) p2 : null;
            if (y4 == null) {
                y4 = new S(0, p2);
            }
        }
        y4.f16010d = this;
        loop0: while (true) {
            Object A4 = A();
            if (A4 instanceof C1531F) {
                C1531F c1531f = (C1531F) A4;
                if (c1531f.f15992a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16029a;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, A4, y4)) {
                        if (atomicReferenceFieldUpdater.get(this) != A4) {
                            break;
                        }
                    }
                    break loop0;
                }
                e0 e0Var = new e0();
                Object c1537l = c1531f.f15992a ? e0Var : new C1537L(e0Var);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f16029a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, c1531f, c1537l) && atomicReferenceFieldUpdater2.get(this) == c1531f) {
                }
            } else {
                if (!(A4 instanceof InterfaceC1538M)) {
                    if (z4) {
                        C1554n c1554n = A4 instanceof C1554n ? (C1554n) A4 : null;
                        p2.d(c1554n != null ? c1554n.f16048a : null);
                    }
                    return f0.f16036a;
                }
                e0 c4 = ((InterfaceC1538M) A4).c();
                if (c4 == null) {
                    kotlin.jvm.internal.i.c(A4, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    M((Y) A4);
                } else {
                    InterfaceC1529D interfaceC1529D = f0.f16036a;
                    if (z && (A4 instanceof b0)) {
                        synchronized (A4) {
                            try {
                                th = ((b0) A4).d();
                                if (th != null) {
                                    if ((p2 instanceof C1550j) && !((b0) A4).f()) {
                                    }
                                }
                                if (j((InterfaceC1538M) A4, c4, y4)) {
                                    if (th == null) {
                                        return y4;
                                    }
                                    interfaceC1529D = y4;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z4) {
                            p2.d(th);
                        }
                        return interfaceC1529D;
                    }
                    if (j((InterfaceC1538M) A4, c4, y4)) {
                        break;
                    }
                }
            }
        }
    }

    public boolean F() {
        return this instanceof C1543c;
    }

    public final boolean G(Object obj) {
        Object P4;
        do {
            P4 = P(A(), obj);
            if (P4 == AbstractC1562w.f16065c) {
                return false;
            }
            if (P4 == AbstractC1562w.f16066d) {
                return true;
            }
        } while (P4 == AbstractC1562w.f16067e);
        l(P4);
        return true;
    }

    public final Object H(Object obj) {
        Object P4;
        do {
            P4 = P(A(), obj);
            if (P4 == AbstractC1562w.f16065c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C1554n c1554n = obj instanceof C1554n ? (C1554n) obj : null;
                throw new IllegalStateException(str, c1554n != null ? c1554n.f16048a : null);
            }
        } while (P4 == AbstractC1562w.f16067e);
        return P4;
    }

    public final void J(e0 e0Var, Throwable th) {
        Object g4 = e0Var.g();
        kotlin.jvm.internal.i.c(g4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        G1.a aVar = null;
        for (C3.k kVar = (C3.k) g4; !kVar.equals(e0Var); kVar = kVar.h()) {
            if (kVar instanceof V) {
                Y y4 = (Y) kVar;
                try {
                    y4.d(th);
                } catch (Throwable th2) {
                    if (aVar != null) {
                        O3.d.c(aVar, th2);
                    } else {
                        aVar = new G1.a("Exception in completion handler " + y4 + " for " + this, th2);
                    }
                }
            }
        }
        if (aVar != null) {
            C(aVar);
        }
        q(th);
    }

    public final void M(Y y4) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e0 e0Var = new e0();
        y4.getClass();
        C3.k.f303b.set(e0Var, y4);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C3.k.f302a;
        atomicReferenceFieldUpdater2.set(e0Var, y4);
        loop0: while (true) {
            if (y4.g() == y4) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(y4, y4, e0Var)) {
                    if (atomicReferenceFieldUpdater2.get(y4) != y4) {
                        break;
                    }
                }
                e0Var.f(y4);
                break loop0;
            }
            break;
        }
        C3.k h2 = y4.h();
        do {
            atomicReferenceFieldUpdater = f16029a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, y4, h2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == y4);
    }

    public final int N(Object obj) {
        boolean z = obj instanceof C1531F;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16029a;
        if (z) {
            if (((C1531F) obj).f15992a) {
                return 0;
            }
            C1531F c1531f = AbstractC1562w.f16071i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1531f)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof C1537L)) {
            return 0;
        }
        e0 e0Var = ((C1537L) obj).f16001a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object P(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC1538M)) {
            return AbstractC1562w.f16065c;
        }
        if (((obj instanceof C1531F) || (obj instanceof Y)) && !(obj instanceof C1550j) && !(obj2 instanceof C1554n)) {
            InterfaceC1538M interfaceC1538M = (InterfaceC1538M) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16029a;
            Object c1539n = obj2 instanceof InterfaceC1538M ? new C1539N((InterfaceC1538M) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1538M, c1539n)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC1538M) {
                    return AbstractC1562w.f16067e;
                }
            }
            K(obj2);
            t(interfaceC1538M, obj2);
            return obj2;
        }
        InterfaceC1538M interfaceC1538M2 = (InterfaceC1538M) obj;
        e0 z = z(interfaceC1538M2);
        if (z == null) {
            return AbstractC1562w.f16067e;
        }
        C1550j c1550j = null;
        b0 b0Var = interfaceC1538M2 instanceof b0 ? (b0) interfaceC1538M2 : null;
        if (b0Var == null) {
            b0Var = new b0(z, null);
        }
        synchronized (b0Var) {
            if (b0Var.f()) {
                return AbstractC1562w.f16065c;
            }
            b0.f16018b.set(b0Var, 1);
            if (b0Var != interfaceC1538M2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f16029a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC1538M2, b0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC1538M2) {
                        return AbstractC1562w.f16067e;
                    }
                }
            }
            boolean e4 = b0Var.e();
            C1554n c1554n = obj2 instanceof C1554n ? (C1554n) obj2 : null;
            if (c1554n != null) {
                b0Var.b(c1554n.f16048a);
            }
            Throwable d4 = b0Var.d();
            if (e4) {
                d4 = null;
            }
            if (d4 != null) {
                J(z, d4);
            }
            C1550j c1550j2 = interfaceC1538M2 instanceof C1550j ? (C1550j) interfaceC1538M2 : null;
            if (c1550j2 == null) {
                e0 c4 = interfaceC1538M2.c();
                if (c4 != null) {
                    c1550j = I(c4);
                }
            } else {
                c1550j = c1550j2;
            }
            if (c1550j != null) {
                while (AbstractC1562w.f(c1550j.f16039e, false, new a0(this, b0Var, c1550j, obj2), 1) == f0.f16036a) {
                    c1550j = I(c1550j);
                    if (c1550j == null) {
                    }
                }
                return AbstractC1562w.f16066d;
            }
            return v(b0Var, obj2);
        }
    }

    @Override // x3.T
    public boolean a() {
        Object A4 = A();
        return (A4 instanceof InterfaceC1538M) && ((InterfaceC1538M) A4).a();
    }

    @Override // x3.T
    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new U(r(), null, this);
        }
        p(cancellationException);
    }

    @Override // f3.InterfaceC0430h
    public final Object e(Object obj, o3.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0430h f(InterfaceC0430h context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == C0431i.f8817a ? this : (InterfaceC0430h) context.e(this, new com.startapp.sdk.components.c(2));
    }

    @Override // f3.InterfaceC0428f
    public final InterfaceC0429g getKey() {
        return C1559t.f16059b;
    }

    public final boolean j(InterfaceC1538M interfaceC1538M, e0 e0Var, Y y4) {
        char c4;
        c0 c0Var = new c0(y4, this, interfaceC1538M);
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3.k.f303b;
            C3.k e4 = e0Var.e();
            if (e4 == null) {
                Object obj = atomicReferenceFieldUpdater.get(e0Var);
                while (true) {
                    e4 = (C3.k) obj;
                    if (!e4.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(e4);
                }
            }
            C3.k.f303b.set(y4, e4);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C3.k.f302a;
            atomicReferenceFieldUpdater2.set(y4, e0Var);
            c0Var.f16025c = e0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(e4, e0Var, c0Var)) {
                    c4 = c0Var.a(e4) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(e4) != e0Var) {
                    c4 = 0;
                    break;
                }
            }
            if (c4 == 1) {
                return true;
            }
        } while (c4 != 2);
        return false;
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0430h k(InterfaceC0429g interfaceC0429g) {
        return AbstractC0124a.J(this, interfaceC0429g);
    }

    public void m(Object obj) {
        l(obj);
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0428f n(InterfaceC0429g interfaceC0429g) {
        return AbstractC0124a.x(this, interfaceC0429g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == x3.AbstractC1562w.f16066d) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(Object obj) {
        C3.v vVar;
        Object obj2 = AbstractC1562w.f16065c;
        if (y()) {
            do {
                Object A4 = A();
                if (!(A4 instanceof InterfaceC1538M) || ((A4 instanceof b0) && ((b0) A4).f())) {
                    obj2 = AbstractC1562w.f16065c;
                    break;
                }
                obj2 = P(A4, new C1554n(u(obj), false));
            } while (obj2 == AbstractC1562w.f16067e);
        }
        if (obj2 == AbstractC1562w.f16065c) {
            Throwable th = null;
            loop1: while (true) {
                Object A5 = A();
                if (!(A5 instanceof b0)) {
                    if (!(A5 instanceof InterfaceC1538M)) {
                        vVar = AbstractC1562w.f16068f;
                        break;
                    }
                    if (th == null) {
                        th = u(obj);
                    }
                    InterfaceC1538M interfaceC1538M = (InterfaceC1538M) A5;
                    if (interfaceC1538M.a()) {
                        e0 z = z(interfaceC1538M);
                        if (z != null) {
                            b0 b0Var = new b0(z, th);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16029a;
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1538M, b0Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != interfaceC1538M) {
                                    break;
                                }
                            }
                            J(z, th);
                            vVar = AbstractC1562w.f16065c;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object P4 = P(A5, new C1554n(th, false));
                        if (P4 == AbstractC1562w.f16065c) {
                            throw new IllegalStateException(("Cannot happen in " + A5).toString());
                        }
                        if (P4 != AbstractC1562w.f16067e) {
                            obj2 = P4;
                            break;
                        }
                    }
                } else {
                    synchronized (A5) {
                        b0 b0Var2 = (b0) A5;
                        b0Var2.getClass();
                        if (b0.f16020d.get(b0Var2) == AbstractC1562w.f16069g) {
                            vVar = AbstractC1562w.f16068f;
                        } else {
                            boolean e4 = ((b0) A5).e();
                            if (th == null) {
                                th = u(obj);
                            }
                            ((b0) A5).b(th);
                            Throwable d4 = e4 ? null : ((b0) A5).d();
                            if (d4 != null) {
                                J(((b0) A5).f16021a, d4);
                            }
                            vVar = AbstractC1562w.f16065c;
                        }
                    }
                }
            }
            obj2 = vVar;
        }
        if (obj2 != AbstractC1562w.f16065c && obj2 != AbstractC1562w.f16066d) {
            if (obj2 == AbstractC1562w.f16068f) {
                return false;
            }
            l(obj2);
            return true;
        }
        return true;
    }

    public void p(CancellationException cancellationException) {
        o(cancellationException);
    }

    public final boolean q(Throwable th) {
        if (F()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC1549i interfaceC1549i = (InterfaceC1549i) f16030b.get(this);
        return (interfaceC1549i == null || interfaceC1549i == f0.f16036a) ? z : interfaceC1549i.b(th) || z;
    }

    public String r() {
        return "Job was cancelled";
    }

    public boolean s(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return o(th) && x();
    }

    public final void t(InterfaceC1538M interfaceC1538M, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16030b;
        InterfaceC1549i interfaceC1549i = (InterfaceC1549i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1549i != null) {
            interfaceC1549i.dispose();
            atomicReferenceFieldUpdater.set(this, f0.f16036a);
        }
        G1.a aVar = null;
        C1554n c1554n = obj instanceof C1554n ? (C1554n) obj : null;
        Throwable th = c1554n != null ? c1554n.f16048a : null;
        if (interfaceC1538M instanceof Y) {
            try {
                ((Y) interfaceC1538M).d(th);
                return;
            } catch (Throwable th2) {
                C(new G1.a("Exception in completion handler " + interfaceC1538M + " for " + this, th2));
                return;
            }
        }
        e0 c4 = interfaceC1538M.c();
        if (c4 != null) {
            Object g4 = c4.g();
            kotlin.jvm.internal.i.c(g4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (C3.k kVar = (C3.k) g4; !kVar.equals(c4); kVar = kVar.h()) {
                if (kVar instanceof Y) {
                    Y y4 = (Y) kVar;
                    try {
                        y4.d(th);
                    } catch (Throwable th3) {
                        if (aVar != null) {
                            O3.d.c(aVar, th3);
                        } else {
                            aVar = new G1.a("Exception in completion handler " + y4 + " for " + this, th3);
                        }
                    }
                }
            }
            if (aVar != null) {
                C(aVar);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + O(A()) + '}');
        sb.append('@');
        sb.append(AbstractC1562w.c(this));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable u(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        d0 d0Var = (d0) ((h0) obj);
        Object A4 = d0Var.A();
        if (A4 instanceof b0) {
            cancellationException = ((b0) A4).d();
        } else if (A4 instanceof C1554n) {
            cancellationException = ((C1554n) A4).f16048a;
        } else {
            if (A4 instanceof InterfaceC1538M) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + A4).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new U("Parent job is ".concat(O(A4)), cancellationException, d0Var) : cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object v(b0 b0Var, Object obj) {
        Throwable th = null;
        C1554n c1554n = obj instanceof C1554n ? (C1554n) obj : null;
        Throwable th2 = c1554n != null ? c1554n.f16048a : null;
        synchronized (b0Var) {
            b0Var.e();
            ArrayList g4 = b0Var.g(th2);
            if (!g4.isEmpty()) {
                int size = g4.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    Object obj2 = g4.get(i4);
                    i4++;
                    if (!(((Throwable) obj2) instanceof CancellationException)) {
                        th = obj2;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) g4.get(0);
                }
            } else if (b0Var.e()) {
                th = new U(r(), null, this);
            }
            if (th != null && g4.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g4.size()));
                int size2 = g4.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj3 = g4.get(i5);
                    i5++;
                    Throwable th3 = (Throwable) obj3;
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        O3.d.c(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C1554n(th, false);
        }
        if (th != null && (q(th) || B(th))) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C1554n.f16047b.compareAndSet((C1554n) obj, 0, 1);
        }
        K(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16029a;
        Object c1539n = obj instanceof InterfaceC1538M ? new C1539N((InterfaceC1538M) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, b0Var, c1539n) && atomicReferenceFieldUpdater.get(this) == b0Var) {
        }
        t(b0Var, obj);
        return obj;
    }

    public final CancellationException w() {
        CancellationException cancellationException;
        Object A4 = A();
        if (!(A4 instanceof b0)) {
            if (A4 instanceof InterfaceC1538M) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(A4 instanceof C1554n)) {
                return new U(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C1554n) A4).f16048a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new U(r(), th, this) : cancellationException;
        }
        Throwable d4 = ((b0) A4).d();
        if (d4 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = d4 instanceof CancellationException ? (CancellationException) d4 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = r();
        }
        return new U(concat, d4, this);
    }

    public boolean x() {
        return true;
    }

    public boolean y() {
        return this instanceof C1552l;
    }

    public final e0 z(InterfaceC1538M interfaceC1538M) {
        e0 c4 = interfaceC1538M.c();
        if (c4 != null) {
            return c4;
        }
        if (interfaceC1538M instanceof C1531F) {
            return new e0();
        }
        if (interfaceC1538M instanceof Y) {
            M((Y) interfaceC1538M);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1538M).toString());
    }

    public void L() {
    }

    public void C(G1.a aVar) {
        throw aVar;
    }

    public void K(Object obj) {
    }

    public void l(Object obj) {
    }
}
