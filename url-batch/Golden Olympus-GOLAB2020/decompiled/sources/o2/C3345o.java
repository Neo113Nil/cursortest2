package o2;

import a2.AbstractC1241b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3341m;
import t2.AbstractC3429D;
import t2.C3440k;

/* renamed from: o2.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3345o extends W implements InterfaceC3343n, kotlin.coroutines.jvm.internal.e, a1 {

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f42089g = AtomicIntegerFieldUpdater.newUpdater(C3345o.class, "_decisionAndIndex$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f42090h = AtomicReferenceFieldUpdater.newUpdater(C3345o.class, Object.class, "_state$volatile");

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f42091i = AtomicReferenceFieldUpdater.newUpdater(C3345o.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.coroutines.d f42092e;

    /* renamed from: f, reason: collision with root package name */
    private final CoroutineContext f42093f;

    public C3345o(kotlin.coroutines.d dVar, int i4) {
        super(i4);
        this.f42092e = dVar;
        this.f42093f = dVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C3323d.f42048b;
    }

    private final String A() {
        Object z4 = z();
        return z4 instanceof K0 ? "Active" : z4 instanceof r ? "Cancelled" : "Completed";
    }

    private final InterfaceC3320b0 F() {
        InterfaceC3359v0 interfaceC3359v0 = (InterfaceC3359v0) getContext().get(InterfaceC3359v0.f42105N2);
        if (interfaceC3359v0 == null) {
            return null;
        }
        InterfaceC3320b0 l4 = B0.l(interfaceC3359v0, true, false, new C3352s(this), 2, null);
        androidx.concurrent.futures.b.a(f42091i, this, null, l4);
        return l4;
    }

    private final void G(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42090h;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C3323d)) {
                if (obj2 instanceof InterfaceC3341m ? true : obj2 instanceof AbstractC3429D) {
                    J(obj, obj2);
                } else {
                    if (obj2 instanceof C3308B) {
                        C3308B c3308b = (C3308B) obj2;
                        if (!c3308b.c()) {
                            J(obj, obj2);
                        }
                        if (obj2 instanceof r) {
                            if (obj2 == null) {
                                c3308b = null;
                            }
                            Throwable th = c3308b != null ? c3308b.f41962a : null;
                            if (obj instanceof InterfaceC3341m) {
                                m((InterfaceC3341m) obj, th);
                                return;
                            } else {
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                o((AbstractC3429D) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof C3307A) {
                        C3307A c3307a = (C3307A) obj2;
                        if (c3307a.f41957b != null) {
                            J(obj, obj2);
                        }
                        if (obj instanceof AbstractC3429D) {
                            return;
                        }
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        InterfaceC3341m interfaceC3341m = (InterfaceC3341m) obj;
                        if (c3307a.c()) {
                            m(interfaceC3341m, c3307a.f41960e);
                            return;
                        } else {
                            if (androidx.concurrent.futures.b.a(f42090h, this, obj2, C3307A.b(c3307a, null, interfaceC3341m, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof AbstractC3429D) {
                            return;
                        }
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (androidx.concurrent.futures.b.a(f42090h, this, obj2, new C3307A(obj2, (InterfaceC3341m) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (androidx.concurrent.futures.b.a(f42090h, this, obj2, obj)) {
                return;
            }
        }
    }

    private final boolean I() {
        if (!X.c(this.f42029d)) {
            return false;
        }
        kotlin.coroutines.d dVar = this.f42092e;
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C3440k) dVar).r();
    }

    private final void J(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void O(Object obj, int i4, Function1 function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42090h;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof K0)) {
                Object obj3 = obj;
                Function1 function12 = function1;
                if (obj2 instanceof r) {
                    r rVar = (r) obj2;
                    if (rVar.e()) {
                        if (function12 != null) {
                            n(function12, rVar.f41962a);
                            return;
                        }
                        return;
                    }
                }
                l(obj3);
                throw new W1.f();
            }
            Object obj4 = obj;
            int i5 = i4;
            Function1 function13 = function1;
            if (androidx.concurrent.futures.b.a(f42090h, this, obj2, Q((K0) obj2, obj4, i5, function13, null))) {
                t();
                v(i5);
                return;
            } else {
                obj = obj4;
                i4 = i5;
                function1 = function13;
            }
        }
    }

    static /* synthetic */ void P(C3345o c3345o, Object obj, int i4, Function1 function1, int i5, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i5 & 4) != 0) {
            function1 = null;
        }
        c3345o.O(obj, i4, function1);
    }

    private final Object Q(K0 k02, Object obj, int i4, Function1 function1, Object obj2) {
        if (obj instanceof C3308B) {
            return obj;
        }
        if ((X.b(i4) || obj2 != null) && !(function1 == null && !(k02 instanceof InterfaceC3341m) && obj2 == null)) {
            return new C3307A(obj, k02 instanceof InterfaceC3341m ? (InterfaceC3341m) k02 : null, function1, obj2, null, 16, null);
        }
        return obj;
    }

    private final boolean R() {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42089g;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f42089g.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
        return true;
    }

    private final t2.G S(Object obj, Object obj2, Function1 function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42090h;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof K0)) {
                Object obj4 = obj2;
                if ((obj3 instanceof C3307A) && obj4 != null && ((C3307A) obj3).f41959d == obj4) {
                    return AbstractC3347p.f42095a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            Function1 function12 = function1;
            if (androidx.concurrent.futures.b.a(f42090h, this, obj3, Q((K0) obj3, obj5, this.f42029d, function12, obj6))) {
                t();
                return AbstractC3347p.f42095a;
            }
            obj = obj5;
            function1 = function12;
            obj2 = obj6;
        }
    }

    private final boolean T() {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42089g;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f42089g.compareAndSet(this, i4, 536870912 + (536870911 & i4)));
        return true;
    }

    private final Void l(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void o(AbstractC3429D abstractC3429D, Throwable th) {
        int i4 = f42089g.get(this) & 536870911;
        if (i4 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC3429D.s(i4, th, getContext());
        } catch (Throwable th2) {
            AbstractC3315I.a(getContext(), new C3310D("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean r(Throwable th) {
        if (!I()) {
            return false;
        }
        kotlin.coroutines.d dVar = this.f42092e;
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C3440k) dVar).s(th);
    }

    private final void t() {
        if (I()) {
            return;
        }
        s();
    }

    private final void v(int i4) {
        if (R()) {
            return;
        }
        X.a(this, i4);
    }

    private final InterfaceC3320b0 x() {
        return (InterfaceC3320b0) f42091i.get(this);
    }

    public void E() {
        InterfaceC3320b0 F4 = F();
        if (F4 != null && isCompleted()) {
            F4.dispose();
            f42091i.set(this, J0.f42008b);
        }
    }

    public final void H(InterfaceC3341m interfaceC3341m) {
        G(interfaceC3341m);
    }

    protected String K() {
        return "CancellableContinuation";
    }

    public final void L(Throwable th) {
        if (r(th)) {
            return;
        }
        q(th);
        t();
    }

    public final void M() {
        Throwable v4;
        kotlin.coroutines.d dVar = this.f42092e;
        C3440k c3440k = dVar instanceof C3440k ? (C3440k) dVar : null;
        if (c3440k == null || (v4 = c3440k.v(this)) == null) {
            return;
        }
        s();
        q(v4);
    }

    public final boolean N() {
        Object obj = f42090h.get(this);
        if ((obj instanceof C3307A) && ((C3307A) obj).f41959d != null) {
            s();
            return false;
        }
        f42089g.set(this, 536870911);
        f42090h.set(this, C3323d.f42048b);
        return true;
    }

    @Override // o2.W
    public void a(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42090h;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof K0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C3308B) {
                return;
            }
            if (obj2 instanceof C3307A) {
                C3307A c3307a = (C3307A) obj2;
                if (c3307a.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (androidx.concurrent.futures.b.a(f42090h, this, obj2, C3307A.b(c3307a, null, null, null, null, th3, 15, null))) {
                    c3307a.d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (androidx.concurrent.futures.b.a(f42090h, this, obj2, new C3307A(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // o2.W
    public final kotlin.coroutines.d b() {
        return this.f42092e;
    }

    @Override // o2.W
    public Throwable c(Object obj) {
        Throwable c4 = super.c(obj);
        if (c4 != null) {
            return c4;
        }
        return null;
    }

    @Override // o2.a1
    public void d(AbstractC3429D abstractC3429D, int i4) {
        int i5;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42089g;
        do {
            i5 = atomicIntegerFieldUpdater.get(this);
            if ((i5 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, ((i5 >> 29) << 29) + i4));
        G(abstractC3429D);
    }

    @Override // o2.W
    public Object e(Object obj) {
        return obj instanceof C3307A ? ((C3307A) obj).f41956a : obj;
    }

    @Override // o2.InterfaceC3343n
    public void f(Function1 function1) {
        AbstractC3349q.c(this, new InterfaceC3341m.a(function1));
    }

    @Override // o2.InterfaceC3343n
    public Object g(Throwable th) {
        return S(new C3308B(th, false, 2, null), null, null);
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d dVar = this.f42092e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    public CoroutineContext getContext() {
        return this.f42093f;
    }

    @Override // o2.InterfaceC3343n
    public Object h(Object obj, Object obj2, Function1 function1) {
        return S(obj, obj2, function1);
    }

    @Override // o2.InterfaceC3343n
    public boolean isActive() {
        return z() instanceof K0;
    }

    @Override // o2.InterfaceC3343n
    public boolean isCompleted() {
        return !(z() instanceof K0);
    }

    @Override // o2.W
    public Object j() {
        return z();
    }

    @Override // o2.InterfaceC3343n
    public void k(AbstractC3313G abstractC3313G, Object obj) {
        kotlin.coroutines.d dVar = this.f42092e;
        C3440k c3440k = dVar instanceof C3440k ? (C3440k) dVar : null;
        P(this, obj, (c3440k != null ? c3440k.f46232e : null) == abstractC3313G ? 4 : this.f42029d, null, 4, null);
    }

    public final void m(InterfaceC3341m interfaceC3341m, Throwable th) {
        try {
            interfaceC3341m.a(th);
        } catch (Throwable th2) {
            AbstractC3315I.a(getContext(), new C3310D("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n(Function1 function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            AbstractC3315I.a(getContext(), new C3310D("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // o2.InterfaceC3343n
    public void p(Object obj, Function1 function1) {
        O(obj, this.f42029d, function1);
    }

    public boolean q(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42090h;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof K0)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f42090h, this, obj, new r(this, th, (obj instanceof InterfaceC3341m) || (obj instanceof AbstractC3429D))));
        K0 k02 = (K0) obj;
        if (k02 instanceof InterfaceC3341m) {
            m((InterfaceC3341m) obj, th);
        } else if (k02 instanceof AbstractC3429D) {
            o((AbstractC3429D) obj, th);
        }
        t();
        v(this.f42029d);
        return true;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(Object obj) {
        P(this, AbstractC3311E.c(obj, this), this.f42029d, null, 4, null);
    }

    public final void s() {
        InterfaceC3320b0 x4 = x();
        if (x4 == null) {
            return;
        }
        x4.dispose();
        f42091i.set(this, J0.f42008b);
    }

    public String toString() {
        return K() + '(' + N.c(this.f42092e) + "){" + A() + "}@" + N.b(this);
    }

    @Override // o2.InterfaceC3343n
    public void u(Object obj) {
        v(this.f42029d);
    }

    public Throwable w(InterfaceC3359v0 interfaceC3359v0) {
        return interfaceC3359v0.getCancellationException();
    }

    public final Object y() {
        InterfaceC3359v0 interfaceC3359v0;
        boolean I3 = I();
        if (T()) {
            if (x() == null) {
                F();
            }
            if (I3) {
                M();
            }
            return AbstractC1241b.f();
        }
        if (I3) {
            M();
        }
        Object z4 = z();
        if (z4 instanceof C3308B) {
            throw ((C3308B) z4).f41962a;
        }
        if (!X.b(this.f42029d) || (interfaceC3359v0 = (InterfaceC3359v0) getContext().get(InterfaceC3359v0.f42105N2)) == null || interfaceC3359v0.isActive()) {
            return e(z4);
        }
        CancellationException cancellationException = interfaceC3359v0.getCancellationException();
        a(z4, cancellationException);
        throw cancellationException;
    }

    public final Object z() {
        return f42090h.get(this);
    }
}
