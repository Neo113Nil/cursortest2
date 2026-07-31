package m6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m6.o1;

/* loaded from: classes.dex */
public class l<T> extends t0<T> implements k<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f19300l = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decision");

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f19301m = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: i, reason: collision with root package name */
    private final y5.d<T> f19302i;

    /* renamed from: j, reason: collision with root package name */
    private final y5.g f19303j;

    /* renamed from: k, reason: collision with root package name */
    private x0 f19304k;

    /* JADX WARN: Multi-variable type inference failed */
    public l(y5.d<? super T> dVar, int i7) {
        super(i7);
        this.f19302i = dVar;
        if (p0.a()) {
            if (!(i7 != -1)) {
                throw new AssertionError();
            }
        }
        this.f19303j = dVar.getContext();
        this._decision = 0;
        this._state = d.f19275f;
    }

    private final boolean A() {
        return u0.c(this.f19331h) && ((kotlinx.coroutines.internal.f) this.f19302i).p();
    }

    private final i B(f6.l<? super Throwable, v5.q> lVar) {
        return lVar instanceof i ? (i) lVar : new l1(lVar);
    }

    private final void C(f6.l<? super Throwable, v5.q> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    private final void F() {
        y5.d<T> dVar = this.f19302i;
        kotlinx.coroutines.internal.f fVar = dVar instanceof kotlinx.coroutines.internal.f ? (kotlinx.coroutines.internal.f) dVar : null;
        Throwable s7 = fVar != null ? fVar.s(this) : null;
        if (s7 == null) {
            return;
        }
        s();
        q(s7);
    }

    private final void H(Object obj, int i7, f6.l<? super Throwable, v5.q> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof b2)) {
                if (obj2 instanceof o) {
                    o oVar = (o) obj2;
                    if (oVar.c()) {
                        if (lVar == null) {
                            return;
                        }
                        p(lVar, oVar.f19365a);
                        return;
                    }
                }
                m(obj);
                throw new v5.d();
            }
        } while (!androidx.work.impl.utils.futures.b.a(f19301m, this, obj2, J((b2) obj2, obj, i7, lVar, null)));
        t();
        u(i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void I(l lVar, Object obj, int i7, f6.l lVar2, int i8, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i8 & 4) != 0) {
            lVar2 = null;
        }
        lVar.H(obj, i7, lVar2);
    }

    private final Object J(b2 b2Var, Object obj, int i7, f6.l<? super Throwable, v5.q> lVar, Object obj2) {
        if (obj instanceof y) {
            if (p0.a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (!p0.a()) {
                return obj;
            }
            if (lVar == null) {
                return obj;
            }
            throw new AssertionError();
        }
        if (!u0.b(i7) && obj2 == null) {
            return obj;
        }
        if (lVar != null || (((b2Var instanceof i) && !(b2Var instanceof e)) || obj2 != null)) {
            return new x(obj, b2Var instanceof i ? (i) b2Var : null, lVar, obj2, null, 16, null);
        }
        return obj;
    }

    private final boolean K() {
        do {
            int i7 = this._decision;
            if (i7 != 0) {
                if (i7 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f19300l.compareAndSet(this, 0, 2));
        return true;
    }

    private final kotlinx.coroutines.internal.y L(Object obj, Object obj2, f6.l<? super Throwable, v5.q> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (!(obj3 instanceof b2)) {
                if (!(obj3 instanceof x) || obj2 == null) {
                    return null;
                }
                x xVar = (x) obj3;
                if (xVar.f19361d != obj2) {
                    return null;
                }
                if (!p0.a() || kotlin.jvm.internal.i.a(xVar.f19358a, obj)) {
                    return m.f19306a;
                }
                throw new AssertionError();
            }
        } while (!androidx.work.impl.utils.futures.b.a(f19301m, this, obj3, J((b2) obj3, obj, this.f19331h, lVar, obj2)));
        t();
        return m.f19306a;
    }

    private final boolean M() {
        do {
            int i7 = this._decision;
            if (i7 != 0) {
                if (i7 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f19300l.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void m(Object obj) {
        throw new IllegalStateException(kotlin.jvm.internal.i.i("Already resumed, but proposed with update ", obj).toString());
    }

    private final void n(f6.l<? super Throwable, v5.q> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new b0(kotlin.jvm.internal.i.i("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    private final boolean r(Throwable th) {
        if (A()) {
            return ((kotlinx.coroutines.internal.f) this.f19302i).q(th);
        }
        return false;
    }

    private final void t() {
        if (A()) {
            return;
        }
        s();
    }

    private final void u(int i7) {
        if (K()) {
            return;
        }
        u0.a(this, i7);
    }

    private final String y() {
        Object x6 = x();
        return x6 instanceof b2 ? "Active" : x6 instanceof o ? "Cancelled" : "Completed";
    }

    private final x0 z() {
        o1 o1Var = (o1) getContext().get(o1.f19317c);
        if (o1Var == null) {
            return null;
        }
        x0 d7 = o1.a.d(o1Var, true, false, new p(this), 2, null);
        this.f19304k = d7;
        return d7;
    }

    protected String D() {
        return "CancellableContinuation";
    }

    public final void E(Throwable th) {
        if (r(th)) {
            return;
        }
        q(th);
        t();
    }

    public final boolean G() {
        if (p0.a()) {
            if (!(this.f19331h == 2)) {
                throw new AssertionError();
            }
        }
        if (p0.a()) {
            if (!(this.f19304k != a2.f19273f)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (p0.a() && !(!(obj instanceof b2))) {
            throw new AssertionError();
        }
        if ((obj instanceof x) && ((x) obj).f19361d != null) {
            s();
            return false;
        }
        this._decision = 0;
        this._state = d.f19275f;
        return true;
    }

    @Override // m6.k
    public Object a(T t6, Object obj) {
        return L(t6, obj, null);
    }

    @Override // m6.t0
    public void b(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof b2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof y) {
                return;
            }
            if (obj2 instanceof x) {
                x xVar = (x) obj2;
                if (!(!xVar.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.work.impl.utils.futures.b.a(f19301m, this, obj2, x.b(xVar, null, null, null, null, th, 15, null))) {
                    xVar.d(this, th);
                    return;
                }
            } else if (androidx.work.impl.utils.futures.b.a(f19301m, this, obj2, new x(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // m6.t0
    public final y5.d<T> c() {
        return this.f19302i;
    }

    @Override // m6.k
    public Object d(T t6, Object obj, f6.l<? super Throwable, v5.q> lVar) {
        return L(t6, obj, lVar);
    }

    @Override // m6.k
    public void e(T t6, f6.l<? super Throwable, v5.q> lVar) {
        H(t6, this.f19331h, lVar);
    }

    @Override // m6.t0
    public Throwable f(Object obj) {
        Throwable j7;
        Throwable f7 = super.f(obj);
        if (f7 == null) {
            return null;
        }
        y5.d<T> c7 = c();
        if (!p0.d() || !(c7 instanceof kotlin.coroutines.jvm.internal.e)) {
            return f7;
        }
        j7 = kotlinx.coroutines.internal.x.j(f7, (kotlin.coroutines.jvm.internal.e) c7);
        return j7;
    }

    @Override // m6.k
    public void g(f6.l<? super Throwable, v5.q> lVar) {
        i B = B(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof d) {
                if (androidx.work.impl.utils.futures.b.a(f19301m, this, obj, B)) {
                    return;
                }
            } else if (obj instanceof i) {
                C(lVar, obj);
            } else {
                boolean z6 = obj instanceof y;
                if (z6) {
                    y yVar = (y) obj;
                    if (!yVar.b()) {
                        C(lVar, obj);
                    }
                    if (obj instanceof o) {
                        if (!z6) {
                            yVar = null;
                        }
                        n(lVar, yVar != null ? yVar.f19365a : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof x) {
                    x xVar = (x) obj;
                    if (xVar.f19359b != null) {
                        C(lVar, obj);
                    }
                    if (B instanceof e) {
                        return;
                    }
                    if (xVar.c()) {
                        n(lVar, xVar.f19362e);
                        return;
                    } else {
                        if (androidx.work.impl.utils.futures.b.a(f19301m, this, obj, x.b(xVar, null, B, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (B instanceof e) {
                        return;
                    }
                    if (androidx.work.impl.utils.futures.b.a(f19301m, this, obj, new x(obj, B, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        y5.d<T> dVar = this.f19302i;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // y5.d
    public y5.g getContext() {
        return this.f19303j;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m6.t0
    public <T> T h(Object obj) {
        return obj instanceof x ? (T) ((x) obj).f19358a : obj;
    }

    @Override // m6.k
    public Object j(Throwable th) {
        return L(new y(th, false, 2, null), null, null);
    }

    @Override // m6.k
    public void k(Object obj) {
        if (p0.a()) {
            if (!(obj == m.f19306a)) {
                throw new AssertionError();
            }
        }
        u(this.f19331h);
    }

    @Override // m6.t0
    public Object l() {
        return x();
    }

    public final void o(i iVar, Throwable th) {
        try {
            iVar.a(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new b0(kotlin.jvm.internal.i.i("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void p(f6.l<? super Throwable, v5.q> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new b0(kotlin.jvm.internal.i.i("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    public boolean q(Throwable th) {
        Object obj;
        boolean z6;
        do {
            obj = this._state;
            if (!(obj instanceof b2)) {
                return false;
            }
            z6 = obj instanceof i;
        } while (!androidx.work.impl.utils.futures.b.a(f19301m, this, obj, new o(this, th, z6)));
        i iVar = z6 ? (i) obj : null;
        if (iVar != null) {
            o(iVar, th);
        }
        t();
        u(this.f19331h);
        return true;
    }

    @Override // y5.d
    public void resumeWith(Object obj) {
        I(this, c0.c(obj, this), this.f19331h, null, 4, null);
    }

    public final void s() {
        x0 x0Var = this.f19304k;
        if (x0Var == null) {
            return;
        }
        x0Var.d();
        this.f19304k = a2.f19273f;
    }

    public String toString() {
        return D() + '(' + q0.c(this.f19302i) + "){" + y() + "}@" + q0.b(this);
    }

    public Throwable v(o1 o1Var) {
        return o1Var.x();
    }

    public final Object w() {
        o1 o1Var;
        Throwable j7;
        Throwable j8;
        Object c7;
        boolean A = A();
        if (M()) {
            if (this.f19304k == null) {
                z();
            }
            if (A) {
                F();
            }
            c7 = z5.d.c();
            return c7;
        }
        if (A) {
            F();
        }
        Object x6 = x();
        if (x6 instanceof y) {
            Throwable th = ((y) x6).f19365a;
            if (!p0.d()) {
                throw th;
            }
            j8 = kotlinx.coroutines.internal.x.j(th, this);
            throw j8;
        }
        if (!u0.b(this.f19331h) || (o1Var = (o1) getContext().get(o1.f19317c)) == null || o1Var.b()) {
            return h(x6);
        }
        CancellationException x7 = o1Var.x();
        b(x6, x7);
        if (!p0.d()) {
            throw x7;
        }
        j7 = kotlinx.coroutines.internal.x.j(x7, this);
        throw j7;
    }

    public final Object x() {
        return this._state;
    }
}
