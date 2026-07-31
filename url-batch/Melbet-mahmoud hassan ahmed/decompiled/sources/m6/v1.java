package m6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.n;
import m6.o1;
import y5.g;

/* loaded from: classes.dex */
public class v1 implements o1, s, c2 {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f19338f = AtomicReferenceFieldUpdater.newUpdater(v1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    private static final class a extends u1 {

        /* renamed from: j, reason: collision with root package name */
        private final v1 f19339j;

        /* renamed from: k, reason: collision with root package name */
        private final b f19340k;

        /* renamed from: l, reason: collision with root package name */
        private final r f19341l;

        /* renamed from: m, reason: collision with root package name */
        private final Object f19342m;

        public a(v1 v1Var, b bVar, r rVar, Object obj) {
            this.f19339j = v1Var;
            this.f19340k = bVar;
            this.f19341l = rVar;
            this.f19342m = obj;
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ v5.q invoke(Throwable th) {
            y(th);
            return v5.q.f22838a;
        }

        @Override // m6.a0
        public void y(Throwable th) {
            this.f19339j.E(this.f19340k, this.f19341l, this.f19342m);
        }
    }

    private static final class b implements j1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: f, reason: collision with root package name */
        private final z1 f19343f;

        public b(z1 z1Var, boolean z6, Throwable th) {
            this.f19343f = z1Var;
            this._isCompleting = z6 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return this._exceptionsHolder;
        }

        private final void l(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void a(Throwable th) {
            Throwable e7 = e();
            if (e7 == null) {
                m(th);
                return;
            }
            if (th == e7) {
                return;
            }
            Object d7 = d();
            if (d7 == null) {
                l(th);
                return;
            }
            if (!(d7 instanceof Throwable)) {
                if (!(d7 instanceof ArrayList)) {
                    throw new IllegalStateException(kotlin.jvm.internal.i.i("State is ", d7).toString());
                }
                ((ArrayList) d7).add(th);
            } else {
                if (th == d7) {
                    return;
                }
                ArrayList<Throwable> c7 = c();
                c7.add(d7);
                c7.add(th);
                v5.q qVar = v5.q.f22838a;
                l(c7);
            }
        }

        @Override // m6.j1
        public boolean b() {
            return e() == null;
        }

        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        public final boolean f() {
            return e() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean g() {
            return this._isCompleting;
        }

        @Override // m6.j1
        public z1 h() {
            return this.f19343f;
        }

        public final boolean i() {
            kotlinx.coroutines.internal.y yVar;
            Object d7 = d();
            yVar = w1.f19355e;
            return d7 == yVar;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.internal.y yVar;
            Object d7 = d();
            if (d7 == null) {
                arrayList = c();
            } else if (d7 instanceof Throwable) {
                ArrayList<Throwable> c7 = c();
                c7.add(d7);
                arrayList = c7;
            } else {
                if (!(d7 instanceof ArrayList)) {
                    throw new IllegalStateException(kotlin.jvm.internal.i.i("State is ", d7).toString());
                }
                arrayList = (ArrayList) d7;
            }
            Throwable e7 = e();
            if (e7 != null) {
                arrayList.add(0, e7);
            }
            if (th != null && !kotlin.jvm.internal.i.a(th, e7)) {
                arrayList.add(th);
            }
            yVar = w1.f19355e;
            l(yVar);
            return arrayList;
        }

        public final void k(boolean z6) {
            this._isCompleting = z6 ? 1 : 0;
        }

        public final void m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + h() + ']';
        }
    }

    public static final class c extends n.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.internal.n f19344d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ v1 f19345e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f19346f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlinx.coroutines.internal.n nVar, v1 v1Var, Object obj) {
            super(nVar);
            this.f19344d = nVar;
            this.f19345e = v1Var;
            this.f19346f = obj;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object g(kotlinx.coroutines.internal.n nVar) {
            if (this.f19345e.P() == this.f19346f) {
                return null;
            }
            return kotlinx.coroutines.internal.m.a();
        }
    }

    public v1(boolean z6) {
        this._state = z6 ? w1.f19357g : w1.f19356f;
        this._parentHandle = null;
    }

    private final void B(j1 j1Var, Object obj) {
        q N = N();
        if (N != null) {
            N.d();
            i0(a2.f19273f);
        }
        y yVar = obj instanceof y ? (y) obj : null;
        Throwable th = yVar != null ? yVar.f19365a : null;
        if (!(j1Var instanceof u1)) {
            z1 h7 = j1Var.h();
            if (h7 == null) {
                return;
            }
            b0(h7, th);
            return;
        }
        try {
            ((u1) j1Var).y(th);
        } catch (Throwable th2) {
            R(new b0("Exception in completion handler " + j1Var + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(b bVar, r rVar, Object obj) {
        if (p0.a()) {
            if (!(P() == bVar)) {
                throw new AssertionError();
            }
        }
        r Z = Z(rVar);
        if (Z == null || !s0(bVar, Z, obj)) {
            p(G(bVar, obj));
        }
    }

    private final Throwable F(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new p1(z(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((c2) obj).v();
    }

    private final Object G(b bVar, Object obj) {
        boolean f7;
        Throwable J;
        boolean z6 = true;
        if (p0.a()) {
            if (!(P() == bVar)) {
                throw new AssertionError();
            }
        }
        if (p0.a() && !(!bVar.i())) {
            throw new AssertionError();
        }
        if (p0.a() && !bVar.g()) {
            throw new AssertionError();
        }
        y yVar = obj instanceof y ? (y) obj : null;
        Throwable th = yVar == null ? null : yVar.f19365a;
        synchronized (bVar) {
            f7 = bVar.f();
            List<Throwable> j7 = bVar.j(th);
            J = J(bVar, j7);
            if (J != null) {
                o(J, j7);
            }
        }
        if (J != null && J != th) {
            obj = new y(J, false, 2, null);
        }
        if (J != null) {
            if (!u(J) && !Q(J)) {
                z6 = false;
            }
            if (z6) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((y) obj).b();
            }
        }
        if (!f7) {
            c0(J);
        }
        d0(obj);
        boolean a7 = androidx.work.impl.utils.futures.b.a(f19338f, this, bVar, w1.g(obj));
        if (p0.a() && !a7) {
            throw new AssertionError();
        }
        B(bVar, obj);
        return obj;
    }

    private final r H(j1 j1Var) {
        r rVar = j1Var instanceof r ? (r) j1Var : null;
        if (rVar != null) {
            return rVar;
        }
        z1 h7 = j1Var.h();
        if (h7 == null) {
            return null;
        }
        return Z(h7);
    }

    private final Throwable I(Object obj) {
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar == null) {
            return null;
        }
        return yVar.f19365a;
    }

    private final Throwable J(b bVar, List<? extends Throwable> list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (bVar.f()) {
                return new p1(z(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : list.get(0);
    }

    private final z1 M(j1 j1Var) {
        z1 h7 = j1Var.h();
        if (h7 != null) {
            return h7;
        }
        if (j1Var instanceof y0) {
            return new z1();
        }
        if (!(j1Var instanceof u1)) {
            throw new IllegalStateException(kotlin.jvm.internal.i.i("State should have list: ", j1Var).toString());
        }
        g0((u1) j1Var);
        return null;
    }

    private final Object V(Object obj) {
        kotlinx.coroutines.internal.y yVar;
        kotlinx.coroutines.internal.y yVar2;
        kotlinx.coroutines.internal.y yVar3;
        kotlinx.coroutines.internal.y yVar4;
        kotlinx.coroutines.internal.y yVar5;
        kotlinx.coroutines.internal.y yVar6;
        Throwable th = null;
        while (true) {
            Object P = P();
            if (P instanceof b) {
                synchronized (P) {
                    if (((b) P).i()) {
                        yVar2 = w1.f19354d;
                        return yVar2;
                    }
                    boolean f7 = ((b) P).f();
                    if (obj != null || !f7) {
                        if (th == null) {
                            th = F(obj);
                        }
                        ((b) P).a(th);
                    }
                    Throwable e7 = f7 ^ true ? ((b) P).e() : null;
                    if (e7 != null) {
                        a0(((b) P).h(), e7);
                    }
                    yVar = w1.f19351a;
                    return yVar;
                }
            }
            if (!(P instanceof j1)) {
                yVar3 = w1.f19354d;
                return yVar3;
            }
            if (th == null) {
                th = F(obj);
            }
            j1 j1Var = (j1) P;
            if (!j1Var.b()) {
                Object q02 = q0(P, new y(th, false, 2, null));
                yVar5 = w1.f19351a;
                if (q02 == yVar5) {
                    throw new IllegalStateException(kotlin.jvm.internal.i.i("Cannot happen in ", P).toString());
                }
                yVar6 = w1.f19353c;
                if (q02 != yVar6) {
                    return q02;
                }
            } else if (p0(j1Var, th)) {
                yVar4 = w1.f19351a;
                return yVar4;
            }
        }
    }

    private final u1 X(f6.l<? super Throwable, v5.q> lVar, boolean z6) {
        if (z6) {
            r0 = lVar instanceof q1 ? (q1) lVar : null;
            if (r0 == null) {
                r0 = new m1(lVar);
            }
        } else {
            u1 u1Var = lVar instanceof u1 ? (u1) lVar : null;
            if (u1Var != null) {
                if (p0.a() && !(!(u1Var instanceof q1))) {
                    throw new AssertionError();
                }
                r0 = u1Var;
            }
            if (r0 == null) {
                r0 = new n1(lVar);
            }
        }
        r0.A(this);
        return r0;
    }

    private final r Z(kotlinx.coroutines.internal.n nVar) {
        while (nVar.t()) {
            nVar = nVar.q();
        }
        while (true) {
            nVar = nVar.p();
            if (!nVar.t()) {
                if (nVar instanceof r) {
                    return (r) nVar;
                }
                if (nVar instanceof z1) {
                    return null;
                }
            }
        }
    }

    private final void a0(z1 z1Var, Throwable th) {
        b0 b0Var;
        c0(th);
        b0 b0Var2 = null;
        for (kotlinx.coroutines.internal.n nVar = (kotlinx.coroutines.internal.n) z1Var.o(); !kotlin.jvm.internal.i.a(nVar, z1Var); nVar = nVar.p()) {
            if (nVar instanceof q1) {
                u1 u1Var = (u1) nVar;
                try {
                    u1Var.y(th);
                } catch (Throwable th2) {
                    if (b0Var2 == null) {
                        b0Var = null;
                    } else {
                        v5.b.a(b0Var2, th2);
                        b0Var = b0Var2;
                    }
                    if (b0Var == null) {
                        b0Var2 = new b0("Exception in completion handler " + u1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (b0Var2 != null) {
            R(b0Var2);
        }
        u(th);
    }

    private final void b0(z1 z1Var, Throwable th) {
        b0 b0Var;
        b0 b0Var2 = null;
        for (kotlinx.coroutines.internal.n nVar = (kotlinx.coroutines.internal.n) z1Var.o(); !kotlin.jvm.internal.i.a(nVar, z1Var); nVar = nVar.p()) {
            if (nVar instanceof u1) {
                u1 u1Var = (u1) nVar;
                try {
                    u1Var.y(th);
                } catch (Throwable th2) {
                    if (b0Var2 == null) {
                        b0Var = null;
                    } else {
                        v5.b.a(b0Var2, th2);
                        b0Var = b0Var2;
                    }
                    if (b0Var == null) {
                        b0Var2 = new b0("Exception in completion handler " + u1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (b0Var2 == null) {
            return;
        }
        R(b0Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [m6.i1] */
    private final void f0(y0 y0Var) {
        z1 z1Var = new z1();
        if (!y0Var.b()) {
            z1Var = new i1(z1Var);
        }
        androidx.work.impl.utils.futures.b.a(f19338f, this, y0Var, z1Var);
    }

    private final void g0(u1 u1Var) {
        u1Var.k(new z1());
        androidx.work.impl.utils.futures.b.a(f19338f, this, u1Var, u1Var.p());
    }

    private final int j0(Object obj) {
        y0 y0Var;
        if (!(obj instanceof y0)) {
            if (!(obj instanceof i1)) {
                return 0;
            }
            if (!androidx.work.impl.utils.futures.b.a(f19338f, this, obj, ((i1) obj).h())) {
                return -1;
            }
            e0();
            return 1;
        }
        if (((y0) obj).b()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19338f;
        y0Var = w1.f19357g;
        if (!androidx.work.impl.utils.futures.b.a(atomicReferenceFieldUpdater, this, obj, y0Var)) {
            return -1;
        }
        e0();
        return 1;
    }

    private final String k0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof j1 ? ((j1) obj).b() ? "Active" : "New" : obj instanceof y ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.f() ? "Cancelling" : bVar.g() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException m0(v1 v1Var, Throwable th, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i7 & 1) != 0) {
            str = null;
        }
        return v1Var.l0(th, str);
    }

    private final boolean n(Object obj, z1 z1Var, u1 u1Var) {
        int x6;
        c cVar = new c(u1Var, this, obj);
        do {
            x6 = z1Var.q().x(u1Var, z1Var, cVar);
            if (x6 == 1) {
                return true;
            }
        } while (x6 != 2);
        return false;
    }

    private final void o(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable n7 = !p0.d() ? th : kotlinx.coroutines.internal.x.n(th);
        for (Throwable th2 : list) {
            if (p0.d()) {
                th2 = kotlinx.coroutines.internal.x.n(th2);
            }
            if (th2 != th && th2 != n7 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                v5.b.a(th, th2);
            }
        }
    }

    private final boolean o0(j1 j1Var, Object obj) {
        if (p0.a()) {
            if (!((j1Var instanceof y0) || (j1Var instanceof u1))) {
                throw new AssertionError();
            }
        }
        if (p0.a() && !(!(obj instanceof y))) {
            throw new AssertionError();
        }
        if (!androidx.work.impl.utils.futures.b.a(f19338f, this, j1Var, w1.g(obj))) {
            return false;
        }
        c0(null);
        d0(obj);
        B(j1Var, obj);
        return true;
    }

    private final boolean p0(j1 j1Var, Throwable th) {
        if (p0.a() && !(!(j1Var instanceof b))) {
            throw new AssertionError();
        }
        if (p0.a() && !j1Var.b()) {
            throw new AssertionError();
        }
        z1 M = M(j1Var);
        if (M == null) {
            return false;
        }
        if (!androidx.work.impl.utils.futures.b.a(f19338f, this, j1Var, new b(M, false, th))) {
            return false;
        }
        a0(M, th);
        return true;
    }

    private final Object q0(Object obj, Object obj2) {
        kotlinx.coroutines.internal.y yVar;
        kotlinx.coroutines.internal.y yVar2;
        if (!(obj instanceof j1)) {
            yVar2 = w1.f19351a;
            return yVar2;
        }
        if ((!(obj instanceof y0) && !(obj instanceof u1)) || (obj instanceof r) || (obj2 instanceof y)) {
            return r0((j1) obj, obj2);
        }
        if (o0((j1) obj, obj2)) {
            return obj2;
        }
        yVar = w1.f19353c;
        return yVar;
    }

    private final Object r0(j1 j1Var, Object obj) {
        kotlinx.coroutines.internal.y yVar;
        kotlinx.coroutines.internal.y yVar2;
        kotlinx.coroutines.internal.y yVar3;
        z1 M = M(j1Var);
        if (M == null) {
            yVar3 = w1.f19353c;
            return yVar3;
        }
        b bVar = j1Var instanceof b ? (b) j1Var : null;
        if (bVar == null) {
            bVar = new b(M, false, null);
        }
        synchronized (bVar) {
            if (bVar.g()) {
                yVar2 = w1.f19351a;
                return yVar2;
            }
            bVar.k(true);
            if (bVar != j1Var && !androidx.work.impl.utils.futures.b.a(f19338f, this, j1Var, bVar)) {
                yVar = w1.f19353c;
                return yVar;
            }
            if (p0.a() && !(!bVar.i())) {
                throw new AssertionError();
            }
            boolean f7 = bVar.f();
            y yVar4 = obj instanceof y ? (y) obj : null;
            if (yVar4 != null) {
                bVar.a(yVar4.f19365a);
            }
            Throwable e7 = true ^ f7 ? bVar.e() : null;
            v5.q qVar = v5.q.f22838a;
            if (e7 != null) {
                a0(M, e7);
            }
            r H = H(j1Var);
            return (H == null || !s0(bVar, H, obj)) ? G(bVar, obj) : w1.f19352b;
        }
    }

    private final boolean s0(b bVar, r rVar, Object obj) {
        while (o1.a.d(rVar.f19325j, false, false, new a(this, bVar, rVar, obj), 1, null) == a2.f19273f) {
            rVar = Z(rVar);
            if (rVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Object t(Object obj) {
        kotlinx.coroutines.internal.y yVar;
        Object q02;
        kotlinx.coroutines.internal.y yVar2;
        do {
            Object P = P();
            if (!(P instanceof j1) || ((P instanceof b) && ((b) P).g())) {
                yVar = w1.f19351a;
                return yVar;
            }
            q02 = q0(P, new y(F(obj), false, 2, null));
            yVar2 = w1.f19353c;
        } while (q02 == yVar2);
        return q02;
    }

    private final boolean u(Throwable th) {
        if (U()) {
            return true;
        }
        boolean z6 = th instanceof CancellationException;
        q N = N();
        return (N == null || N == a2.f19273f) ? z6 : N.g(th) || z6;
    }

    public boolean A(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return r(th) && K();
    }

    @Override // m6.o1
    public void D(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new p1(z(), null, this);
        }
        s(cancellationException);
    }

    public boolean K() {
        return true;
    }

    public boolean L() {
        return false;
    }

    public final q N() {
        return (q) this._parentHandle;
    }

    @Override // m6.s
    public final void O(c2 c2Var) {
        r(c2Var);
    }

    public final Object P() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.u)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.u) obj).c(this);
        }
    }

    protected boolean Q(Throwable th) {
        return false;
    }

    public void R(Throwable th) {
        throw th;
    }

    protected final void S(o1 o1Var) {
        if (p0.a()) {
            if (!(N() == null)) {
                throw new AssertionError();
            }
        }
        if (o1Var == null) {
            i0(a2.f19273f);
            return;
        }
        o1Var.f();
        q i7 = o1Var.i(this);
        i0(i7);
        if (T()) {
            i7.d();
            i0(a2.f19273f);
        }
    }

    public final boolean T() {
        return !(P() instanceof j1);
    }

    protected boolean U() {
        return false;
    }

    public final Object W(Object obj) {
        Object q02;
        kotlinx.coroutines.internal.y yVar;
        kotlinx.coroutines.internal.y yVar2;
        do {
            q02 = q0(P(), obj);
            yVar = w1.f19351a;
            if (q02 == yVar) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, I(obj));
            }
            yVar2 = w1.f19353c;
        } while (q02 == yVar2);
        return q02;
    }

    public String Y() {
        return q0.a(this);
    }

    @Override // m6.o1
    public boolean b() {
        Object P = P();
        return (P instanceof j1) && ((j1) P).b();
    }

    protected void c0(Throwable th) {
    }

    protected void d0(Object obj) {
    }

    protected void e0() {
    }

    @Override // m6.o1
    public final boolean f() {
        int j02;
        do {
            j02 = j0(P());
            if (j02 == 0) {
                return false;
            }
        } while (j02 != 1);
        return true;
    }

    @Override // y5.g
    public <R> R fold(R r7, f6.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) o1.a.b(this, r7, pVar);
    }

    @Override // y5.g.b, y5.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) o1.a.c(this, cVar);
    }

    @Override // y5.g.b
    public final g.c<?> getKey() {
        return o1.f19317c;
    }

    public final void h0(u1 u1Var) {
        Object P;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        y0 y0Var;
        do {
            P = P();
            if (!(P instanceof u1)) {
                if (!(P instanceof j1) || ((j1) P).h() == null) {
                    return;
                }
                u1Var.u();
                return;
            }
            if (P != u1Var) {
                return;
            }
            atomicReferenceFieldUpdater = f19338f;
            y0Var = w1.f19357g;
        } while (!androidx.work.impl.utils.futures.b.a(atomicReferenceFieldUpdater, this, P, y0Var));
    }

    @Override // m6.o1
    public final q i(s sVar) {
        return (q) o1.a.d(this, true, false, new r(sVar), 2, null);
    }

    public final void i0(q qVar) {
        this._parentHandle = qVar;
    }

    protected final CancellationException l0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = z();
            }
            cancellationException = new p1(str, th, this);
        }
        return cancellationException;
    }

    @Override // y5.g
    public y5.g minusKey(g.c<?> cVar) {
        return o1.a.e(this, cVar);
    }

    public final String n0() {
        return Y() + '{' + k0(P()) + '}';
    }

    protected void p(Object obj) {
    }

    @Override // y5.g
    public y5.g plus(y5.g gVar) {
        return o1.a.f(this, gVar);
    }

    @Override // m6.o1
    public final x0 q(boolean z6, boolean z7, f6.l<? super Throwable, v5.q> lVar) {
        u1 X = X(lVar, z6);
        while (true) {
            Object P = P();
            if (P instanceof y0) {
                y0 y0Var = (y0) P;
                if (!y0Var.b()) {
                    f0(y0Var);
                } else if (androidx.work.impl.utils.futures.b.a(f19338f, this, P, X)) {
                    return X;
                }
            } else {
                if (!(P instanceof j1)) {
                    if (z7) {
                        y yVar = P instanceof y ? (y) P : null;
                        lVar.invoke(yVar != null ? yVar.f19365a : null);
                    }
                    return a2.f19273f;
                }
                z1 h7 = ((j1) P).h();
                if (h7 == null) {
                    Objects.requireNonNull(P, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    g0((u1) P);
                } else {
                    x0 x0Var = a2.f19273f;
                    if (z6 && (P instanceof b)) {
                        synchronized (P) {
                            r3 = ((b) P).e();
                            if (r3 == null || ((lVar instanceof r) && !((b) P).g())) {
                                if (n(P, h7, X)) {
                                    if (r3 == null) {
                                        return X;
                                    }
                                    x0Var = X;
                                }
                            }
                            v5.q qVar = v5.q.f22838a;
                        }
                    }
                    if (r3 != null) {
                        if (z7) {
                            lVar.invoke(r3);
                        }
                        return x0Var;
                    }
                    if (n(P, h7, X)) {
                        return X;
                    }
                }
            }
        }
    }

    public final boolean r(Object obj) {
        Object obj2;
        kotlinx.coroutines.internal.y yVar;
        kotlinx.coroutines.internal.y yVar2;
        kotlinx.coroutines.internal.y yVar3;
        obj2 = w1.f19351a;
        if (L() && (obj2 = t(obj)) == w1.f19352b) {
            return true;
        }
        yVar = w1.f19351a;
        if (obj2 == yVar) {
            obj2 = V(obj);
        }
        yVar2 = w1.f19351a;
        if (obj2 == yVar2 || obj2 == w1.f19352b) {
            return true;
        }
        yVar3 = w1.f19354d;
        if (obj2 == yVar3) {
            return false;
        }
        p(obj2);
        return true;
    }

    public void s(Throwable th) {
        r(th);
    }

    public String toString() {
        return n0() + '@' + q0.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    @Override // m6.c2
    public CancellationException v() {
        CancellationException cancellationException;
        Object P = P();
        if (P instanceof b) {
            cancellationException = ((b) P).e();
        } else if (P instanceof y) {
            cancellationException = ((y) P).f19365a;
        } else {
            if (P instanceof j1) {
                throw new IllegalStateException(kotlin.jvm.internal.i.i("Cannot be cancelling child in this state: ", P).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new p1(kotlin.jvm.internal.i.i("Parent job is ", k0(P)), cancellationException, this) : cancellationException2;
    }

    @Override // m6.o1
    public final CancellationException x() {
        Object P = P();
        if (!(P instanceof b)) {
            if (P instanceof j1) {
                throw new IllegalStateException(kotlin.jvm.internal.i.i("Job is still new or active: ", this).toString());
            }
            return P instanceof y ? m0(this, ((y) P).f19365a, null, 1, null) : new p1(kotlin.jvm.internal.i.i(q0.a(this), " has completed normally"), null, this);
        }
        Throwable e7 = ((b) P).e();
        if (e7 != null) {
            return l0(e7, kotlin.jvm.internal.i.i(q0.a(this), " is cancelling"));
        }
        throw new IllegalStateException(kotlin.jvm.internal.i.i("Job is still new or active: ", this).toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String z() {
        return "Job was cancelled";
    }
}
