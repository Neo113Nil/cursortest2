package H5;

import a1.AbstractC0223a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o5.InterfaceC0567g;
import o5.InterfaceC0568h;
import o5.InterfaceC0569i;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public class g0 implements X, l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1080f = AtomicReferenceFieldUpdater.newUpdater(g0.class, Object.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1081g = AtomicReferenceFieldUpdater.newUpdater(g0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public g0(boolean z5) {
        this._state = z5 ? AbstractC0165z.f1123j : AbstractC0165z.f1122i;
    }

    public static C0151k L(M5.k kVar) {
        while (kVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = M5.k.f1607g;
            M5.k e4 = kVar.e();
            if (e4 == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (M5.k) obj;
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
                if (kVar instanceof C0151k) {
                    return (C0151k) kVar;
                }
                if (kVar instanceof i0) {
                    return null;
                }
            }
        }
    }

    public static String R(Object obj) {
        if (!(obj instanceof e0)) {
            return obj instanceof U ? ((U) obj).a() ? "Active" : "New" : obj instanceof C0156p ? "Cancelled" : "Completed";
        }
        e0 e0Var = (e0) obj;
        return e0Var.e() ? "Cancelling" : e0Var.f() ? "Completing" : "Active";
    }

    public boolean A() {
        return this instanceof C0153m;
    }

    public final i0 B(U u6) {
        i0 d7 = u6.d();
        if (d7 != null) {
            return d7;
        }
        if (u6 instanceof J) {
            return new i0();
        }
        if (u6 instanceof b0) {
            P((b0) u6);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + u6).toString());
    }

    public final Object C() {
        while (true) {
            Object obj = f1080f.get(this);
            if (!(obj instanceof M5.p)) {
                return obj;
            }
            ((M5.p) obj).a(this);
        }
    }

    public boolean D(Throwable th) {
        return false;
    }

    public final void F(X x6) {
        int Q6;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1081g;
        j0 j0Var = j0.f1085f;
        if (x6 == null) {
            atomicReferenceFieldUpdater.set(this, j0Var);
            return;
        }
        g0 g0Var = (g0) x6;
        do {
            Q6 = g0Var.Q(g0Var.C());
            if (Q6 == 0) {
                break;
            }
        } while (Q6 != 1);
        InterfaceC0150j interfaceC0150j = (InterfaceC0150j) AbstractC0165z.j(g0Var, new C0151k(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0150j);
        if (C() instanceof U) {
            return;
        }
        interfaceC0150j.b();
        atomicReferenceFieldUpdater.set(this, j0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final H G(boolean z5, boolean z6, InterfaceC0743l interfaceC0743l) {
        b0 b0Var;
        Throwable th;
        if (z5) {
            b0Var = interfaceC0743l instanceof Z ? (Z) interfaceC0743l : null;
            if (b0Var == null) {
                b0Var = new W(interfaceC0743l);
            }
        } else {
            b0Var = interfaceC0743l instanceof b0 ? (b0) interfaceC0743l : null;
            if (b0Var == null) {
                b0Var = new I(1, interfaceC0743l);
            }
        }
        b0Var.f1056i = this;
        loop0: while (true) {
            Object C6 = C();
            if (C6 instanceof J) {
                J j4 = (J) C6;
                if (j4.f1033f) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1080f;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, C6, b0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != C6) {
                            break;
                        }
                    }
                    break loop0;
                }
                i0 i0Var = new i0();
                U t6 = j4.f1033f ? i0Var : new T(i0Var);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1080f;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, j4, t6) && atomicReferenceFieldUpdater2.get(this) == j4) {
                }
            } else {
                if (!(C6 instanceof U)) {
                    if (z6) {
                        C0156p c0156p = C6 instanceof C0156p ? (C0156p) C6 : null;
                        interfaceC0743l.invoke(c0156p != null ? c0156p.f1093a : null);
                    }
                    return j0.f1085f;
                }
                i0 d7 = ((U) C6).d();
                if (d7 == null) {
                    kotlin.jvm.internal.i.c(C6, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    P((b0) C6);
                } else {
                    H h7 = j0.f1085f;
                    if (z5 && (C6 instanceof e0)) {
                        synchronized (C6) {
                            try {
                                th = ((e0) C6).c();
                                if (th != null) {
                                    if ((interfaceC0743l instanceof C0151k) && !((e0) C6).f()) {
                                    }
                                }
                                if (j((U) C6, d7, b0Var)) {
                                    if (th == null) {
                                        return b0Var;
                                    }
                                    h7 = b0Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z6) {
                            interfaceC0743l.invoke(th);
                        }
                        return h7;
                    }
                    if (j((U) C6, d7, b0Var)) {
                        break;
                    }
                }
            }
        }
    }

    public boolean H() {
        return this instanceof C0143c;
    }

    public final Object I(AbstractC0607c abstractC0607c) {
        k5.v vVar;
        while (true) {
            Object C6 = C();
            boolean z5 = C6 instanceof U;
            vVar = k5.v.f5219a;
            if (!z5) {
                X x6 = (X) abstractC0607c.getContext().m(C0162w.f1110g);
                if (x6 != null && !x6.a()) {
                    throw ((g0) x6).w();
                }
            } else if (Q(C6) >= 0) {
                C0147g c0147g = new C0147g(1, AbstractC0676f.m(abstractC0607c));
                c0147g.r();
                c0147g.t(new C0145e(1, G(false, true, new I(3, c0147g))));
                Object q6 = c0147g.q();
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                if (q6 != enumC0580a) {
                    q6 = vVar;
                }
                if (q6 == enumC0580a) {
                    return q6;
                }
            }
        }
        return vVar;
    }

    public final Object J(Object obj) {
        Object S3;
        do {
            S3 = S(C(), obj);
            if (S3 == AbstractC0165z.f1117d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0156p c0156p = obj instanceof C0156p ? (C0156p) obj : null;
                throw new IllegalStateException(str, c0156p != null ? c0156p.f1093a : null);
            }
        } while (S3 == AbstractC0165z.f1119f);
        return S3;
    }

    public String K() {
        return getClass().getSimpleName();
    }

    public final void M(i0 i0Var, Throwable th) {
        Object g7 = i0Var.g();
        kotlin.jvm.internal.i.c(g7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        r rVar = null;
        for (M5.k kVar = (M5.k) g7; !kVar.equals(i0Var); kVar = kVar.h()) {
            if (kVar instanceof Z) {
                b0 b0Var = (b0) kVar;
                try {
                    b0Var.k(th);
                } catch (Throwable th2) {
                    if (rVar != null) {
                        i6.g.a(rVar, th2);
                    } else {
                        rVar = new r("Exception in completion handler " + b0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (rVar != null) {
            E(rVar);
        }
        p(th);
    }

    public final void P(b0 b0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        i0 i0Var = new i0();
        b0Var.getClass();
        M5.k.f1607g.lazySet(i0Var, b0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = M5.k.f1606f;
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
        M5.k h7 = b0Var.h();
        do {
            atomicReferenceFieldUpdater = f1080f;
            if (atomicReferenceFieldUpdater.compareAndSet(this, b0Var, h7)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == b0Var);
    }

    public final int Q(Object obj) {
        boolean z5 = obj instanceof J;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1080f;
        if (z5) {
            if (((J) obj).f1033f) {
                return 0;
            }
            J j4 = AbstractC0165z.f1123j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, j4)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            O();
            return 1;
        }
        if (!(obj instanceof T)) {
            return 0;
        }
        i0 i0Var = ((T) obj).f1048f;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, i0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        O();
        return 1;
    }

    public final Object S(Object obj, Object obj2) {
        if (!(obj instanceof U)) {
            return AbstractC0165z.f1117d;
        }
        if (((obj instanceof J) || (obj instanceof b0)) && !(obj instanceof C0151k) && !(obj2 instanceof C0156p)) {
            U u6 = (U) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1080f;
            Object v5 = obj2 instanceof U ? new V((U) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, u6, v5)) {
                if (atomicReferenceFieldUpdater.get(this) != u6) {
                    return AbstractC0165z.f1119f;
                }
            }
            N(obj2);
            s(u6, obj2);
            return obj2;
        }
        U u7 = (U) obj;
        i0 B3 = B(u7);
        if (B3 == null) {
            return AbstractC0165z.f1119f;
        }
        C0151k c0151k = null;
        e0 e0Var = u7 instanceof e0 ? (e0) u7 : null;
        if (e0Var == null) {
            e0Var = new e0(B3, null);
        }
        synchronized (e0Var) {
            if (e0Var.f()) {
                return AbstractC0165z.f1117d;
            }
            e0.f1067g.set(e0Var, 1);
            if (e0Var != u7) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1080f;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, u7, e0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != u7) {
                        return AbstractC0165z.f1119f;
                    }
                }
            }
            boolean e4 = e0Var.e();
            C0156p c0156p = obj2 instanceof C0156p ? (C0156p) obj2 : null;
            if (c0156p != null) {
                e0Var.b(c0156p.f1093a);
            }
            Throwable c7 = e0Var.c();
            if (e4) {
                c7 = null;
            }
            if (c7 != null) {
                M(B3, c7);
            }
            C0151k c0151k2 = u7 instanceof C0151k ? (C0151k) u7 : null;
            if (c0151k2 == null) {
                i0 d7 = u7.d();
                if (d7 != null) {
                    c0151k = L(d7);
                }
            } else {
                c0151k = c0151k2;
            }
            if (c0151k != null) {
                while (AbstractC0165z.j(c0151k.f1086j, new d0(this, e0Var, c0151k, obj2), 1) == j0.f1085f) {
                    c0151k = L(c0151k);
                    if (c0151k == null) {
                    }
                }
                return AbstractC0165z.f1118e;
            }
            return u(e0Var, obj2);
        }
    }

    @Override // H5.X
    public boolean a() {
        Object C6 = C();
        return (C6 instanceof U) && ((U) C6).a();
    }

    @Override // H5.X
    public void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new Y(q(), null, this);
        }
        o(cancellationException);
    }

    @Override // o5.InterfaceC0567g
    public final InterfaceC0568h getKey() {
        return C0162w.f1110g;
    }

    @Override // o5.InterfaceC0569i
    public final Object h(Object obj, InterfaceC0747p interfaceC0747p) {
        return interfaceC0747p.invoke(obj, this);
    }

    public final boolean j(U u6, i0 i0Var, b0 b0Var) {
        char c7;
        f0 f0Var = new f0(b0Var, this, u6);
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = M5.k.f1607g;
            M5.k e4 = i0Var.e();
            if (e4 == null) {
                Object obj = atomicReferenceFieldUpdater.get(i0Var);
                while (true) {
                    e4 = (M5.k) obj;
                    if (!e4.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(e4);
                }
            }
            M5.k.f1607g.lazySet(b0Var, e4);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = M5.k.f1606f;
            atomicReferenceFieldUpdater2.lazySet(b0Var, i0Var);
            f0Var.f1072c = i0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(e4, i0Var, f0Var)) {
                    c7 = f0Var.a(e4) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(e4) != i0Var) {
                    c7 = 0;
                    break;
                }
            }
            if (c7 == 1) {
                return true;
            }
        } while (c7 != 2);
        return false;
    }

    public void l(Object obj) {
        k(obj);
    }

    @Override // o5.InterfaceC0569i
    public final InterfaceC0567g m(InterfaceC0568h key) {
        kotlin.jvm.internal.i.e(key, "key");
        if (kotlin.jvm.internal.i.a(C0162w.f1110g, key)) {
            return this;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == H5.AbstractC0165z.f1118e) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(Object obj) {
        M5.v vVar;
        Object obj2 = AbstractC0165z.f1117d;
        if (A()) {
            do {
                Object C6 = C();
                if (!(C6 instanceof U) || ((C6 instanceof e0) && ((e0) C6).f())) {
                    obj2 = AbstractC0165z.f1117d;
                    break;
                }
                obj2 = S(C6, new C0156p(t(obj), false));
            } while (obj2 == AbstractC0165z.f1119f);
        }
        if (obj2 == AbstractC0165z.f1117d) {
            Throwable th = null;
            loop1: while (true) {
                Object C7 = C();
                if (!(C7 instanceof e0)) {
                    if (!(C7 instanceof U)) {
                        vVar = AbstractC0165z.f1120g;
                        break;
                    }
                    if (th == null) {
                        th = t(obj);
                    }
                    U u6 = (U) C7;
                    if (u6.a()) {
                        i0 B3 = B(u6);
                        if (B3 != null) {
                            e0 e0Var = new e0(B3, th);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1080f;
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, u6, e0Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != u6) {
                                    break;
                                }
                            }
                            M(B3, th);
                            vVar = AbstractC0165z.f1117d;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object S3 = S(C7, new C0156p(th, false));
                        if (S3 == AbstractC0165z.f1117d) {
                            throw new IllegalStateException(("Cannot happen in " + C7).toString());
                        }
                        if (S3 != AbstractC0165z.f1119f) {
                            obj2 = S3;
                            break;
                        }
                    }
                } else {
                    synchronized (C7) {
                        e0 e0Var2 = (e0) C7;
                        e0Var2.getClass();
                        if (e0.f1069i.get(e0Var2) == AbstractC0165z.f1121h) {
                            vVar = AbstractC0165z.f1120g;
                        } else {
                            boolean e4 = ((e0) C7).e();
                            if (th == null) {
                                th = t(obj);
                            }
                            ((e0) C7).b(th);
                            Throwable c7 = e4 ? null : ((e0) C7).c();
                            if (c7 != null) {
                                M(((e0) C7).f1070f, c7);
                            }
                            vVar = AbstractC0165z.f1117d;
                        }
                    }
                }
            }
            obj2 = vVar;
        }
        if (obj2 != AbstractC0165z.f1117d && obj2 != AbstractC0165z.f1118e) {
            if (obj2 == AbstractC0165z.f1120g) {
                return false;
            }
            k(obj2);
            return true;
        }
        return true;
    }

    public void o(CancellationException cancellationException) {
        n(cancellationException);
    }

    public final boolean p(Throwable th) {
        if (H()) {
            return true;
        }
        boolean z5 = th instanceof CancellationException;
        InterfaceC0150j interfaceC0150j = (InterfaceC0150j) f1081g.get(this);
        return (interfaceC0150j == null || interfaceC0150j == j0.f1085f) ? z5 : interfaceC0150j.c(th) || z5;
    }

    public String q() {
        return "Job was cancelled";
    }

    public boolean r(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return n(th) && z();
    }

    public final void s(U u6, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1081g;
        InterfaceC0150j interfaceC0150j = (InterfaceC0150j) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0150j != null) {
            interfaceC0150j.b();
            atomicReferenceFieldUpdater.set(this, j0.f1085f);
        }
        r rVar = null;
        C0156p c0156p = obj instanceof C0156p ? (C0156p) obj : null;
        Throwable th = c0156p != null ? c0156p.f1093a : null;
        if (u6 instanceof b0) {
            try {
                ((b0) u6).k(th);
                return;
            } catch (Throwable th2) {
                E(new r("Exception in completion handler " + u6 + " for " + this, th2));
                return;
            }
        }
        i0 d7 = u6.d();
        if (d7 != null) {
            Object g7 = d7.g();
            kotlin.jvm.internal.i.c(g7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (M5.k kVar = (M5.k) g7; !kVar.equals(d7); kVar = kVar.h()) {
                if (kVar instanceof b0) {
                    b0 b0Var = (b0) kVar;
                    try {
                        b0Var.k(th);
                    } catch (Throwable th3) {
                        if (rVar != null) {
                            i6.g.a(rVar, th3);
                        } else {
                            rVar = new r("Exception in completion handler " + b0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (rVar != null) {
                E(rVar);
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
        g0 g0Var = (g0) ((l0) obj);
        Object C6 = g0Var.C();
        if (C6 instanceof e0) {
            cancellationException = ((e0) C6).c();
        } else if (C6 instanceof C0156p) {
            cancellationException = ((C0156p) C6).f1093a;
        } else {
            if (C6 instanceof U) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + C6).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new Y("Parent job is ".concat(R(C6)), cancellationException, g0Var) : cancellationException2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(K() + '{' + R(C()) + '}');
        sb.append('@');
        sb.append(AbstractC0165z.g(this));
        return sb.toString();
    }

    public final Object u(e0 e0Var, Object obj) {
        Throwable x6;
        C0156p c0156p = obj instanceof C0156p ? (C0156p) obj : null;
        Throwable th = c0156p != null ? c0156p.f1093a : null;
        synchronized (e0Var) {
            e0Var.e();
            ArrayList g7 = e0Var.g(th);
            x6 = x(e0Var, g7);
            if (x6 != null && g7.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g7.size()));
                int size = g7.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj2 = g7.get(i7);
                    i7++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != x6 && th2 != x6 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        i6.g.a(x6, th2);
                    }
                }
            }
        }
        if (x6 != null && x6 != th) {
            obj = new C0156p(x6, false);
        }
        if (x6 != null && (p(x6) || D(x6))) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0156p.f1092b.compareAndSet((C0156p) obj, 0, 1);
        }
        N(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1080f;
        Object v5 = obj instanceof U ? new V((U) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, e0Var, v5) && atomicReferenceFieldUpdater.get(this) == e0Var) {
        }
        s(e0Var, obj);
        return obj;
    }

    @Override // o5.InterfaceC0569i
    public final InterfaceC0569i v(InterfaceC0569i interfaceC0569i) {
        return AbstractC0223a.D(this, interfaceC0569i);
    }

    public final CancellationException w() {
        CancellationException cancellationException;
        Object C6 = C();
        if (!(C6 instanceof e0)) {
            if (C6 instanceof U) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(C6 instanceof C0156p)) {
                return new Y(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0156p) C6).f1093a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new Y(q(), th, this) : cancellationException;
        }
        Throwable c7 = ((e0) C6).c();
        if (c7 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c7 instanceof CancellationException ? (CancellationException) c7 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = q();
        }
        return new Y(concat, c7, this);
    }

    public final Throwable x(e0 e0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (e0Var.e()) {
                return new Y(q(), null, this);
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
        if (th2 instanceof r0) {
            int size2 = arrayList.size();
            while (true) {
                if (i7 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i7);
                i7++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof r0)) {
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

    @Override // o5.InterfaceC0569i
    public final InterfaceC0569i y(InterfaceC0568h interfaceC0568h) {
        return AbstractC0223a.B(this, interfaceC0568h);
    }

    public boolean z() {
        return true;
    }

    public void O() {
    }

    public void E(r rVar) {
        throw rVar;
    }

    public void N(Object obj) {
    }

    public void k(Object obj) {
    }
}
