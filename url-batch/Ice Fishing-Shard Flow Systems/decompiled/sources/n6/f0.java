package n6;

import R5.C0164d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.C0654a;

/* loaded from: classes.dex */
public class f0 implements X, k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7054d = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_state$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7055e = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public f0(boolean z7) {
        this._state$volatile = z7 ? AbstractC0792z.j : AbstractC0792z.f7103i;
    }

    public static C0779l M(s6.j jVar) {
        while (jVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s6.j.f7839e;
            s6.j e7 = jVar.e();
            if (e7 == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (s6.j) obj;
                    if (!jVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = e7;
            }
        }
        while (true) {
            jVar = jVar.g();
            if (!jVar.h()) {
                if (jVar instanceof C0779l) {
                    return (C0779l) jVar;
                }
                if (jVar instanceof h0) {
                    return null;
                }
            }
        }
    }

    public static String T(Object obj) {
        if (!(obj instanceof e0)) {
            return obj instanceof U ? ((U) obj).a() ? "Active" : "New" : obj instanceof C0784q ? "Cancelled" : "Completed";
        }
        e0 e0Var = (e0) obj;
        return e0Var.e() ? "Cancelling" : e0.f7050e.get(e0Var) != 0 ? "Completing" : "Active";
    }

    public final h0 A(U u7) {
        h0 c7 = u7.c();
        if (c7 != null) {
            return c7;
        }
        if (u7 instanceof J) {
            return new h0();
        }
        if (u7 instanceof b0) {
            R((b0) u7);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + u7).toString());
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext B(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    public boolean C(Throwable th) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (r4 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, n6.b0, n6.l, s6.j] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, n6.H] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v8, types: [n6.h0, s6.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(X x7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        int S7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7055e;
        i0 i0Var = i0.f7065d;
        if (x7 == null) {
            atomicReferenceFieldUpdater2.set(this, i0Var);
            return;
        }
        f0 f0Var = (f0) x7;
        do {
            atomicReferenceFieldUpdater = f7054d;
            S7 = f0Var.S(atomicReferenceFieldUpdater.get(f0Var));
            if (S7 == 0) {
                break;
            }
        } while (S7 != 1);
        ?? c0779l = new C0779l(this);
        c0779l.f7039l = f0Var;
        loop1: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(f0Var);
            if (obj instanceof J) {
                J j = (J) obj;
                if (j.f7016d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(f0Var, obj, c0779l)) {
                        if (atomicReferenceFieldUpdater.get(f0Var) != obj) {
                            break;
                        }
                    }
                    break loop1;
                }
                f0Var.Q(j);
            } else {
                if (obj instanceof U) {
                    ?? c7 = ((U) obj).c();
                    if (c7 == 0) {
                        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        f0Var.R((b0) obj);
                    } else if (!c7.d(c0779l, 7)) {
                        boolean d7 = c7.d(c0779l, 3);
                        Object obj2 = atomicReferenceFieldUpdater.get(f0Var);
                        if (obj2 instanceof e0) {
                            r6 = ((e0) obj2).d();
                        } else {
                            C0784q c0784q = obj2 instanceof C0784q ? (C0784q) obj2 : null;
                            if (c0784q != null) {
                                r6 = c0784q.f7076a;
                            }
                        }
                        c0779l.k(r6);
                    }
                } else {
                    Object obj3 = atomicReferenceFieldUpdater.get(f0Var);
                    C0784q c0784q2 = obj3 instanceof C0784q ? (C0784q) obj3 : null;
                    c0779l.k(c0784q2 != null ? c0784q2.f7076a : null);
                }
            }
        }
        atomicReferenceFieldUpdater2.set(this, c0779l);
        if (G()) {
            c0779l.dispose();
            atomicReferenceFieldUpdater2.set(this, i0Var);
        }
    }

    public final H F(boolean z7, b0 b0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        i0 i0Var;
        boolean z8;
        boolean d7;
        b0Var.f7039l = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f7054d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z9 = obj instanceof J;
            i0Var = i0.f7065d;
            z8 = true;
            if (!z9) {
                if (!(obj instanceof U)) {
                    z8 = false;
                    break;
                }
                U u7 = (U) obj;
                h0 c7 = u7.c();
                if (c7 == null) {
                    Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    R((b0) obj);
                } else {
                    if (b0Var.j()) {
                        e0 e0Var = u7 instanceof e0 ? (e0) u7 : null;
                        Throwable d8 = e0Var != null ? e0Var.d() : null;
                        if (d8 == null) {
                            d7 = c7.d(b0Var, 5);
                        } else if (z7) {
                            b0Var.k(d8);
                            return i0Var;
                        }
                    } else {
                        d7 = c7.d(b0Var, 1);
                    }
                    if (d7) {
                        break;
                    }
                }
            } else {
                J j = (J) obj;
                if (j.f7016d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Q(j);
            }
        }
        if (z8) {
            return b0Var;
        }
        if (z7) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0784q c0784q = obj2 instanceof C0784q ? (C0784q) obj2 : null;
            b0Var.k(c0784q != null ? c0784q.f7076a : null);
        }
        return i0Var;
    }

    public final boolean G() {
        return !(f7054d.get(this) instanceof U);
    }

    public boolean H() {
        return this instanceof C0770c;
    }

    public final Object I(X5.c frame) {
        Object obj;
        do {
            obj = f7054d.get(this);
            if (!(obj instanceof U)) {
                AbstractC0792z.e(frame.getContext());
                return Unit.f6114a;
            }
        } while (S(obj) < 0);
        C0775h c0775h = new C0775h(1, W5.d.b(frame));
        c0775h.s();
        c0775h.v(new C0772e(2, AbstractC0792z.j(this, true, new C0777j(c0775h, 1))));
        Object r7 = c0775h.r();
        W5.a aVar = W5.a.f2787d;
        if (r7 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (r7 != aVar) {
            r7 = Unit.f6114a;
        }
        return r7 == aVar ? r7 : Unit.f6114a;
    }

    public final boolean J(Object obj) {
        Object U4;
        do {
            U4 = U(f7054d.get(this), obj);
            if (U4 == AbstractC0792z.f7098d) {
                return false;
            }
            if (U4 == AbstractC0792z.f7099e) {
                return true;
            }
        } while (U4 == AbstractC0792z.f7100f);
        l(U4);
        return true;
    }

    public final Object K(Object obj) {
        Object U4;
        do {
            U4 = U(f7054d.get(this), obj);
            if (U4 == AbstractC0792z.f7098d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0784q c0784q = obj instanceof C0784q ? (C0784q) obj : null;
                throw new IllegalStateException(str, c0784q != null ? c0784q.f7076a : null);
            }
        } while (U4 == AbstractC0792z.f7100f);
        return U4;
    }

    public String L() {
        return getClass().getSimpleName();
    }

    public final void N(h0 h0Var, Throwable th) {
        h0Var.d(new s6.h(4), 4);
        Object obj = s6.j.f7838d.get(h0Var);
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        E1.i iVar = null;
        for (s6.j jVar = (s6.j) obj; !jVar.equals(h0Var); jVar = jVar.g()) {
            if ((jVar instanceof b0) && ((b0) jVar).j()) {
                try {
                    ((b0) jVar).k(th);
                } catch (Throwable th2) {
                    if (iVar != null) {
                        C0164d.a(iVar, th2);
                    } else {
                        iVar = new E1.i("Exception in completion handler " + jVar + " for " + this, th2);
                        Unit unit = Unit.f6114a;
                    }
                }
            }
        }
        if (iVar != null) {
            D(iVar);
        }
        p(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [n6.T] */
    public final void Q(J j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h0 h0Var = new h0();
        if (!j.f7016d) {
            h0Var = new T(h0Var);
        }
        do {
            atomicReferenceFieldUpdater = f7054d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, j, h0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == j);
    }

    public final void R(b0 b0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h0 h0Var = new h0();
        b0Var.getClass();
        s6.j.f7839e.set(h0Var, b0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s6.j.f7838d;
        atomicReferenceFieldUpdater2.set(h0Var, b0Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(b0Var) == b0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(b0Var, b0Var, h0Var)) {
                    if (atomicReferenceFieldUpdater2.get(b0Var) != b0Var) {
                        break;
                    }
                }
                h0Var.f(b0Var);
                break loop0;
            }
            break;
        }
        s6.j g7 = b0Var.g();
        do {
            atomicReferenceFieldUpdater = f7054d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, b0Var, g7)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == b0Var);
    }

    public final int S(Object obj) {
        boolean z7 = obj instanceof J;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7054d;
        if (z7) {
            if (((J) obj).f7016d) {
                return 0;
            }
            J j = AbstractC0792z.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, j)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            P();
            return 1;
        }
        if (!(obj instanceof T)) {
            return 0;
        }
        h0 h0Var = ((T) obj).f7031d;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        P();
        return 1;
    }

    public final Object U(Object obj, Object obj2) {
        if (!(obj instanceof U)) {
            return AbstractC0792z.f7098d;
        }
        if (((obj instanceof J) || (obj instanceof b0)) && !(obj instanceof C0779l) && !(obj2 instanceof C0784q)) {
            U u7 = (U) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7054d;
            Object v7 = obj2 instanceof U ? new V((U) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, u7, v7)) {
                if (atomicReferenceFieldUpdater.get(this) != u7) {
                    return AbstractC0792z.f7100f;
                }
            }
            O(obj2);
            s(u7, obj2);
            return obj2;
        }
        U u8 = (U) obj;
        h0 A7 = A(u8);
        if (A7 == null) {
            return AbstractC0792z.f7100f;
        }
        e0 e0Var = u8 instanceof e0 ? (e0) u8 : null;
        if (e0Var == null) {
            e0Var = new e0(A7, null);
        }
        synchronized (e0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e0.f7050e;
            if (atomicIntegerFieldUpdater.get(e0Var) != 0) {
                return AbstractC0792z.f7098d;
            }
            atomicIntegerFieldUpdater.set(e0Var, 1);
            if (e0Var != u8) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7054d;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, u8, e0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != u8) {
                        return AbstractC0792z.f7100f;
                    }
                }
            }
            boolean e7 = e0Var.e();
            C0784q c0784q = obj2 instanceof C0784q ? (C0784q) obj2 : null;
            if (c0784q != null) {
                e0Var.b(c0784q.f7076a);
            }
            Throwable d7 = e7 ? null : e0Var.d();
            Unit unit = Unit.f6114a;
            if (d7 != null) {
                N(A7, d7);
            }
            C0779l M7 = M(A7);
            if (M7 != null && V(e0Var, M7, obj2)) {
                return AbstractC0792z.f7099e;
            }
            A7.d(new s6.h(2), 2);
            C0779l M8 = M(A7);
            return (M8 == null || !V(e0Var, M8, obj2)) ? v(e0Var, obj2) : AbstractC0792z.f7099e;
        }
    }

    public final boolean V(e0 e0Var, C0779l c0779l, Object obj) {
        while (AbstractC0792z.j(c0779l.f7068m, false, new d0(this, e0Var, c0779l, obj)) == i0.f7065d) {
            c0779l = M(c0779l);
            if (c0779l == null) {
                return false;
            }
        }
        return true;
    }

    @Override // n6.X
    public boolean a() {
        Object obj = f7054d.get(this);
        return (obj instanceof U) && ((U) obj).a();
    }

    @Override // n6.X
    public void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new Y(q(), null, this);
        }
        o(cancellationException);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element g(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return C0787u.f7085e;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext j(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    public void m(Object obj) {
        l(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r0 == n6.AbstractC0792z.f7099e) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(Object obj) {
        C0654a c0654a;
        Object obj2 = AbstractC0792z.f7098d;
        if (z()) {
            do {
                Object obj3 = f7054d.get(this);
                if (obj3 instanceof U) {
                    if (obj3 instanceof e0) {
                        e0 e0Var = (e0) obj3;
                        e0Var.getClass();
                        if (e0.f7050e.get(e0Var) != 0) {
                        }
                    }
                    obj2 = U(obj3, new C0784q(u(obj), false));
                }
                obj2 = AbstractC0792z.f7098d;
                break;
            } while (obj2 == AbstractC0792z.f7100f);
        }
        if (obj2 == AbstractC0792z.f7098d) {
            Throwable th = null;
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7054d;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                if (!(obj4 instanceof e0)) {
                    if (!(obj4 instanceof U)) {
                        c0654a = AbstractC0792z.f7101g;
                        break;
                    }
                    if (th == null) {
                        th = u(obj);
                    }
                    U u7 = (U) obj4;
                    if (u7.a()) {
                        h0 A7 = A(u7);
                        if (A7 != null) {
                            e0 e0Var2 = new e0(A7, th);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, u7, e0Var2)) {
                                if (atomicReferenceFieldUpdater.get(this) != u7) {
                                    break;
                                }
                            }
                            N(A7, th);
                            c0654a = AbstractC0792z.f7098d;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object U4 = U(obj4, new C0784q(th, false));
                        if (U4 == AbstractC0792z.f7098d) {
                            throw new IllegalStateException(("Cannot happen in " + obj4).toString());
                        }
                        if (U4 != AbstractC0792z.f7100f) {
                            obj2 = U4;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        e0 e0Var3 = (e0) obj4;
                        e0Var3.getClass();
                        if (e0.f7052l.get(e0Var3) == AbstractC0792z.f7102h) {
                            c0654a = AbstractC0792z.f7101g;
                        } else {
                            boolean e7 = ((e0) obj4).e();
                            if (th == null) {
                                th = u(obj);
                            }
                            ((e0) obj4).b(th);
                            Throwable d7 = e7 ? null : ((e0) obj4).d();
                            if (d7 != null) {
                                N(((e0) obj4).f7053d, d7);
                            }
                            c0654a = AbstractC0792z.f7098d;
                        }
                    }
                }
            }
            obj2 = c0654a;
        }
        if (obj2 != AbstractC0792z.f7098d && obj2 != AbstractC0792z.f7099e) {
            if (obj2 == AbstractC0792z.f7101g) {
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
        if (H()) {
            return true;
        }
        boolean z7 = th instanceof CancellationException;
        InterfaceC0778k interfaceC0778k = (InterfaceC0778k) f7055e.get(this);
        return (interfaceC0778k == null || interfaceC0778k == i0.f7065d) ? z7 : interfaceC0778k.b(th) || z7;
    }

    public String q() {
        return "Job was cancelled";
    }

    public boolean r(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return n(th) && y();
    }

    public final void s(U u7, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7055e;
        InterfaceC0778k interfaceC0778k = (InterfaceC0778k) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0778k != null) {
            interfaceC0778k.dispose();
            atomicReferenceFieldUpdater.set(this, i0.f7065d);
        }
        E1.i iVar = null;
        C0784q c0784q = obj instanceof C0784q ? (C0784q) obj : null;
        Throwable th = c0784q != null ? c0784q.f7076a : null;
        if (u7 instanceof b0) {
            try {
                ((b0) u7).k(th);
                return;
            } catch (Throwable th2) {
                D(new E1.i("Exception in completion handler " + u7 + " for " + this, th2));
                return;
            }
        }
        h0 c7 = u7.c();
        if (c7 != null) {
            c7.d(new s6.h(1), 1);
            Object obj2 = s6.j.f7838d.get(c7);
            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (s6.j jVar = (s6.j) obj2; !jVar.equals(c7); jVar = jVar.g()) {
                if (jVar instanceof b0) {
                    try {
                        ((b0) jVar).k(th);
                    } catch (Throwable th3) {
                        if (iVar != null) {
                            C0164d.a(iVar, th3);
                        } else {
                            iVar = new E1.i("Exception in completion handler " + jVar + " for " + this, th3);
                            Unit unit = Unit.f6114a;
                        }
                    }
                }
            }
            if (iVar != null) {
                D(iVar);
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object t(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(L() + '{' + T(f7054d.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC0792z.g(this));
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
        f0 f0Var = (f0) ((k0) obj);
        Object obj2 = f7054d.get(f0Var);
        if (obj2 instanceof e0) {
            cancellationException = ((e0) obj2).d();
        } else if (obj2 instanceof C0784q) {
            cancellationException = ((C0784q) obj2).f7076a;
        } else {
            if (obj2 instanceof U) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new Y("Parent job is ".concat(T(obj2)), cancellationException, f0Var) : cancellationException2;
    }

    public final Object v(e0 e0Var, Object obj) {
        Throwable x7;
        C0784q c0784q = obj instanceof C0784q ? (C0784q) obj : null;
        Throwable th = c0784q != null ? c0784q.f7076a : null;
        synchronized (e0Var) {
            e0Var.e();
            ArrayList f7 = e0Var.f(th);
            x7 = x(e0Var, f7);
            if (x7 != null && f7.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f7.size()));
                int size = f7.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = f7.get(i2);
                    i2++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != x7 && th2 != x7 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        C0164d.a(x7, th2);
                    }
                }
            }
        }
        if (x7 != null && x7 != th) {
            obj = new C0784q(x7, false);
        }
        if (x7 != null && (p(x7) || C(x7))) {
            Intrinsics.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0784q.f7075b.compareAndSet((C0784q) obj, 0, 1);
        }
        O(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7054d;
        Object v7 = obj instanceof U ? new V((U) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, e0Var, v7) && atomicReferenceFieldUpdater.get(this) == e0Var) {
        }
        s(e0Var, obj);
        return obj;
    }

    public final CancellationException w() {
        CancellationException cancellationException;
        Object obj = f7054d.get(this);
        if (!(obj instanceof e0)) {
            if (obj instanceof U) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0784q)) {
                return new Y(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0784q) obj).f7076a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new Y(q(), th, this) : cancellationException;
        }
        Throwable d7 = ((e0) obj).d();
        if (d7 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = d7 instanceof CancellationException ? (CancellationException) d7 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = q();
        }
        return new Y(concat, d7, this);
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
        int i2 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i5);
            i5++;
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
            int size2 = arrayList.size();
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i2);
                i2++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof q0)) {
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

    public boolean y() {
        return true;
    }

    public boolean z() {
        return this instanceof C0781n;
    }

    public void P() {
    }

    public void D(E1.i iVar) {
        throw iVar;
    }

    public void O(Object obj) {
    }

    public void l(Object obj) {
    }
}
