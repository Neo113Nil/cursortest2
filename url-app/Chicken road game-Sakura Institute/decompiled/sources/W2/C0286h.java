package W2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;

/* renamed from: W2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0286h extends H implements InterfaceC0284f, E2.d, C0 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4262l = AtomicIntegerFieldUpdater.newUpdater(C0286h.class, "_decisionAndIndex$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4263m = AtomicReferenceFieldUpdater.newUpdater(C0286h.class, Object.class, "_state$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4264n = AtomicReferenceFieldUpdater.newUpdater(C0286h.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: j, reason: collision with root package name */
    public final C2.a f4265j;

    /* renamed from: k, reason: collision with root package name */
    public final CoroutineContext f4266k;

    public C0286h(int i2, C2.a aVar) {
        super(i2);
        this.f4265j = aVar;
        this.f4266k = aVar.p();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0277b.f4248a;
    }

    public static void A(p0 p0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + p0Var + ", already has " + obj).toString());
    }

    public static Object F(p0 p0Var, Object obj, int i2, L2.c cVar) {
        if ((obj instanceof C0294p) || !I.a(i2)) {
            return obj;
        }
        if (cVar != null || (p0Var instanceof C0283e)) {
            return new C0293o(obj, p0Var instanceof C0283e ? (C0283e) p0Var : null, cVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public String B() {
        return "CancellableContinuation";
    }

    public final void C() {
        C2.a aVar = this.f4265j;
        Throwable th = null;
        b3.f fVar = aVar instanceof b3.f ? (b3.f) aVar : null;
        if (fVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b3.f.f5654n;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                b3.t tVar = b3.a.f5648c;
                if (obj == tVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, tVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != tVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            m();
            H(th);
        }
    }

    public final void D(Object obj, int i2, L2.c cVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4263m;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof p0) {
                Object F3 = F((p0) obj2, obj, i2, cVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, F3)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!y()) {
                    m();
                }
                o(i2);
                return;
            }
            if (obj2 instanceof C0287i) {
                C0287i c0287i = (C0287i) obj2;
                c0287i.getClass();
                if (C0287i.f4268c.compareAndSet(c0287i, 0, 1)) {
                    if (cVar != null) {
                        k(cVar, c0287i.f4291a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void E(AbstractC0298u abstractC0298u, Unit unit) {
        C2.a aVar = this.f4265j;
        b3.f fVar = aVar instanceof b3.f ? (b3.f) aVar : null;
        D(unit, (fVar != null ? fVar.f5655j : null) == abstractC0298u ? 4 : this.f4224i, null);
    }

    @Override // W2.InterfaceC0284f
    public final boolean H(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4263m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof p0)) {
                return false;
            }
            C0287i c0287i = new C0287i(this, th, (obj instanceof C0283e) || (obj instanceof b3.r));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0287i)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            p0 p0Var = (p0) obj;
            if (p0Var instanceof C0283e) {
                j((C0283e) obj, th);
            } else if (p0Var instanceof b3.r) {
                l((b3.r) obj, th);
            }
            if (!y()) {
                m();
            }
            o(this.f4224i);
            return true;
        }
    }

    @Override // W2.C0
    public final void a(b3.r rVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f4262l;
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i2));
        w(rVar);
    }

    @Override // W2.H
    public final void b(CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4263m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof p0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0294p) {
                return;
            }
            if (!(obj instanceof C0293o)) {
                C0293o c0293o = new C0293o(obj, (C0283e) null, (L2.c) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0293o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0293o c0293o2 = (C0293o) obj;
            if (c0293o2.f4288e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0293o a4 = C0293o.a(c0293o2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a4)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            C0283e c0283e = c0293o2.f4285b;
            if (c0283e != null) {
                j(c0283e, cancellationException);
            }
            L2.c cVar = c0293o2.f4286c;
            if (cVar != null) {
                k(cVar, cancellationException, c0293o2.f4284a);
                return;
            }
            return;
        }
    }

    @Override // W2.InterfaceC0284f
    public final b3.t c(Object obj, L2.c cVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4263m;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z4 = obj2 instanceof p0;
            b3.t tVar = B.f4208a;
            if (!z4) {
                boolean z5 = obj2 instanceof C0293o;
                return null;
            }
            Object F3 = F((p0) obj2, obj, this.f4224i, cVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, F3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (y()) {
                return tVar;
            }
            m();
            return tVar;
        }
    }

    @Override // W2.H
    public final C2.a d() {
        return this.f4265j;
    }

    @Override // E2.d
    public final E2.d e() {
        C2.a aVar = this.f4265j;
        if (aVar instanceof E2.d) {
            return (E2.d) aVar;
        }
        return null;
    }

    @Override // W2.H
    public final Throwable f(Object obj) {
        Throwable f4 = super.f(obj);
        if (f4 != null) {
            return f4;
        }
        return null;
    }

    @Override // W2.H
    public final Object g(Object obj) {
        return obj instanceof C0293o ? ((C0293o) obj).f4284a : obj;
    }

    @Override // W2.H
    public final Object i() {
        return f4263m.get(this);
    }

    public final void j(C0283e c0283e, Throwable th) {
        try {
            switch (c0283e.f4255a) {
                case 0:
                    ((ScheduledFuture) c0283e.f4256b).cancel(false);
                    break;
                case 1:
                    ((Function1) c0283e.f4256b).invoke(th);
                    break;
                default:
                    ((L) c0283e.f4256b).a();
                    break;
            }
        } catch (Throwable th2) {
            B.i(new I1.b("Exception in invokeOnCancellation handler for " + this, th2), this.f4266k);
        }
    }

    public final void k(L2.c cVar, Throwable th, Object obj) {
        CoroutineContext coroutineContext = this.f4266k;
        try {
            cVar.g(th, obj, coroutineContext);
        } catch (Throwable th2) {
            B.i(new I1.b("Exception in resume onCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final void l(b3.r rVar, Throwable th) {
        CoroutineContext coroutineContext = this.f4266k;
        int i2 = f4262l.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.g(i2, coroutineContext);
        } catch (Throwable th2) {
            B.i(new I1.b("Exception in invokeOnCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4264n;
        L l4 = (L) atomicReferenceFieldUpdater.get(this);
        if (l4 == null) {
            return;
        }
        l4.a();
        atomicReferenceFieldUpdater.set(this, o0.f4289d);
    }

    @Override // W2.InterfaceC0284f
    public final void n(Object obj, L2.c cVar) {
        D(obj, this.f4224i, cVar);
    }

    public final void o(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f4262l;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z4 = i2 == 4;
                C2.a aVar = this.f4265j;
                if (z4 || !(aVar instanceof b3.f) || I.a(i2) != I.a(this.f4224i)) {
                    I.b(this, aVar, z4);
                    return;
                }
                b3.f fVar = (b3.f) aVar;
                AbstractC0298u abstractC0298u = fVar.f5655j;
                CoroutineContext p4 = fVar.f5656k.p();
                if (abstractC0298u.u(p4)) {
                    abstractC0298u.t(p4, this);
                    return;
                }
                U a4 = u0.a();
                if (a4.E()) {
                    a4.B(this);
                    return;
                }
                a4.D(true);
                try {
                    I.b(this, aVar, true);
                    do {
                    } while (a4.G());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
    }

    @Override // C2.a
    public final CoroutineContext p() {
        return this.f4266k;
    }

    public Throwable q(k0 k0Var) {
        return k0Var.g();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean y4 = y();
        do {
            atomicIntegerFieldUpdater = f4262l;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i4 = i2 >> 29;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (y4) {
                    C();
                }
                Object obj = f4263m.get(this);
                if (obj instanceof C0294p) {
                    throw ((C0294p) obj).f4291a;
                }
                if (I.a(this.f4224i)) {
                    InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) this.f4266k.k(C0299v.f4296e);
                    if (interfaceC0280c0 != null && !interfaceC0280c0.b()) {
                        CancellationException g4 = interfaceC0280c0.g();
                        b(g4);
                        throw g4;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((L) f4264n.get(this)) == null) {
            t();
        }
        if (y4) {
            C();
        }
        return D2.a.f2163d;
    }

    public final void s() {
        L t4 = t();
        if (t4 == null || (f4263m.get(this) instanceof p0)) {
            return;
        }
        t4.a();
        f4264n.set(this, o0.f4289d);
    }

    public final L t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) this.f4266k.k(C0299v.f4296e);
        if (interfaceC0280c0 == null) {
            return null;
        }
        L j4 = B.j(interfaceC0280c0, true, new C0288j(this, 0));
        do {
            atomicReferenceFieldUpdater = f4264n;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, j4)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return j4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(B());
        sb.append('(');
        sb.append(B.o(this.f4265j));
        sb.append("){");
        Object obj = f4263m.get(this);
        sb.append(obj instanceof p0 ? "Active" : obj instanceof C0287i ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(B.f(this));
        return sb.toString();
    }

    @Override // C2.a
    public final void u(Object obj) {
        Throwable a4 = AbstractC1341p.a(obj);
        if (a4 != null) {
            obj = new C0294p(a4, false);
        }
        D(obj, this.f4224i, null);
    }

    public final void v(Function1 function1) {
        w(new C0283e(1, function1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ad, code lost:
    
        A(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b0, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(p0 p0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4263m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0277b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, p0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof C0283e) || (obj instanceof b3.r)) {
                break;
            }
            if (obj instanceof C0294p) {
                C0294p c0294p = (C0294p) obj;
                c0294p.getClass();
                if (!C0294p.f4290b.compareAndSet(c0294p, 0, 1)) {
                    A(p0Var, obj);
                    throw null;
                }
                if (obj instanceof C0287i) {
                    if (!(obj instanceof C0294p)) {
                        c0294p = null;
                    }
                    Throwable th = c0294p != null ? c0294p.f4291a : null;
                    if (p0Var instanceof C0283e) {
                        j((C0283e) p0Var, th);
                        return;
                    } else {
                        l((b3.r) p0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0293o)) {
                if (p0Var instanceof b3.r) {
                    return;
                }
                C0293o c0293o = new C0293o(obj, (C0283e) p0Var, (L2.c) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0293o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0293o c0293o2 = (C0293o) obj;
            if (c0293o2.f4285b != null) {
                A(p0Var, obj);
                throw null;
            }
            if (p0Var instanceof b3.r) {
                return;
            }
            C0283e c0283e = (C0283e) p0Var;
            Throwable th2 = c0293o2.f4288e;
            if (th2 != null) {
                j(c0283e, th2);
                return;
            }
            C0293o a4 = C0293o.a(c0293o2, c0283e, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a4)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean x() {
        return f4263m.get(this) instanceof p0;
    }

    public final boolean y() {
        if (this.f4224i == 2) {
            C2.a aVar = this.f4265j;
            Intrinsics.d(aVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (b3.f.f5654n.get((b3.f) aVar) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // W2.InterfaceC0284f
    public final void z(Object obj) {
        o(this.f4224i);
    }
}
