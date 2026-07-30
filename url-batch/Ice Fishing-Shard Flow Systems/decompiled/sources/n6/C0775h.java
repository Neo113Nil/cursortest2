package n6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l0.C0654a;
import s6.AbstractC0898a;

/* renamed from: n6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0775h extends AbstractC0767E implements InterfaceC0773f, X5.d, w0 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7059n = AtomicIntegerFieldUpdater.newUpdater(C0775h.class, "_decisionAndIndex$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7060o = AtomicReferenceFieldUpdater.newUpdater(C0775h.class, Object.class, "_state$volatile");

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7061p = AtomicReferenceFieldUpdater.newUpdater(C0775h.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: l, reason: collision with root package name */
    public final V5.b f7062l;

    /* renamed from: m, reason: collision with root package name */
    public final CoroutineContext f7063m;

    public C0775h(int i2, V5.b bVar) {
        super(i2);
        this.f7062l = bVar;
        this.f7063m = bVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0769b.f7038a;
    }

    public static Object C(j0 j0Var, Object obj, int i2, e6.n nVar) {
        if (obj instanceof C0784q) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (nVar != null || (j0Var instanceof C0772e)) {
            return new C0783p(obj, j0Var instanceof C0772e ? (C0772e) j0Var : null, nVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(j0 j0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + j0Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i2, e6.n nVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7060o;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof j0) {
                Object C7 = C((j0) obj2, obj, i2, nVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C7)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    o();
                }
                p(i2);
                return;
            }
            if (obj2 instanceof C0776i) {
                C0776i c0776i = (C0776i) obj2;
                c0776i.getClass();
                if (C0776i.f7064c.compareAndSet(c0776i, 0, 1)) {
                    if (nVar != null) {
                        l(nVar, c0776i.f7076a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(AbstractC0786t abstractC0786t, Unit unit) {
        V5.b bVar = this.f7062l;
        s6.f fVar = bVar instanceof s6.f ? (s6.f) bVar : null;
        A(unit, (fVar != null ? fVar.f7827l : null) == abstractC0786t ? 4 : this.f7010i, null);
    }

    @Override // n6.w0
    public final void a(s6.r rVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f7059n;
            i5 = atomicIntegerFieldUpdater.get(this);
            if ((i5 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, ((i5 >> 29) << 29) + i2));
        v(rVar);
    }

    @Override // n6.AbstractC0767E
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7060o;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof j0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0784q) {
                return;
            }
            if (!(obj instanceof C0783p)) {
                cancellationException2 = cancellationException;
                C0783p c0783p = new C0783p(obj, (C0772e) null, (e6.n) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0783p)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0783p c0783p2 = (C0783p) obj;
            if (c0783p2.f7074e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0783p a7 = C0783p.a(c0783p2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a7)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            C0772e c0772e = c0783p2.f7071b;
            if (c0772e != null) {
                j(c0772e, cancellationException);
            }
            e6.n nVar = c0783p2.f7072c;
            if (nVar != null) {
                l(nVar, cancellationException, c0783p2.f7070a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // n6.InterfaceC0773f
    public final C0654a c(Object obj, e6.n nVar) {
        C0654a c0654a = AbstractC0792z.f7095a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7060o;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof j0)) {
                return null;
            }
            Object C7 = C((j0) obj2, obj, this.f7010i, nVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C7)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!w()) {
                o();
            }
            return c0654a;
        }
    }

    @Override // n6.AbstractC0767E
    public final V5.b d() {
        return this.f7062l;
    }

    @Override // n6.InterfaceC0773f
    public final void e(Object obj, e6.n nVar) {
        A(obj, this.f7010i, nVar);
    }

    @Override // n6.AbstractC0767E
    public final Throwable f(Object obj) {
        Throwable f7 = super.f(obj);
        if (f7 != null) {
            return f7;
        }
        return null;
    }

    @Override // n6.AbstractC0767E
    public final Object g(Object obj) {
        return obj instanceof C0783p ? ((C0783p) obj).f7070a : obj;
    }

    @Override // X5.d
    public final X5.d getCallerFrame() {
        V5.b bVar = this.f7062l;
        if (bVar instanceof X5.d) {
            return (X5.d) bVar;
        }
        return null;
    }

    @Override // V5.b
    public final CoroutineContext getContext() {
        return this.f7063m;
    }

    @Override // n6.AbstractC0767E
    public final Object i() {
        return f7060o.get(this);
    }

    public final void j(C0772e c0772e, Throwable th) {
        try {
            switch (c0772e.f7048a) {
                case 0:
                    ((ScheduledFuture) c0772e.f7049b).cancel(false);
                    break;
                case 1:
                    ((Function1) c0772e.f7049b).invoke(th);
                    break;
                default:
                    ((H) c0772e.f7049b).dispose();
                    break;
            }
        } catch (Throwable th2) {
            AbstractC0792z.i(new E1.i("Exception in invokeOnCancellation handler for " + this, th2), this.f7063m);
        }
    }

    @Override // n6.InterfaceC0773f
    public final void k(Object obj) {
        p(this.f7010i);
    }

    public final void l(e6.n nVar, Throwable th, Object obj) {
        CoroutineContext coroutineContext = this.f7063m;
        try {
            nVar.invoke(th, obj, coroutineContext);
        } catch (Throwable th2) {
            AbstractC0792z.i(new E1.i("Exception in resume onCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final void m(s6.r rVar, Throwable th) {
        CoroutineContext coroutineContext = this.f7063m;
        int i2 = f7059n.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.g(i2, coroutineContext);
        } catch (Throwable th2) {
            AbstractC0792z.i(new E1.i("Exception in invokeOnCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final boolean n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7060o;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof j0)) {
                return false;
            }
            C0776i c0776i = new C0776i(this, th, (obj instanceof C0772e) || (obj instanceof s6.r));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0776i)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            j0 j0Var = (j0) obj;
            if (j0Var instanceof C0772e) {
                j((C0772e) obj, th);
            } else if (j0Var instanceof s6.r) {
                m((s6.r) obj, th);
            }
            if (!w()) {
                o();
            }
            p(this.f7010i);
            return true;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7061p;
        H h7 = (H) atomicReferenceFieldUpdater.get(this);
        if (h7 == null) {
            return;
        }
        h7.dispose();
        atomicReferenceFieldUpdater.set(this, i0.f7065d);
    }

    public final void p(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f7059n;
            i5 = atomicIntegerFieldUpdater.get(this);
            int i7 = i5 >> 29;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z7 = i2 == 4;
                V5.b bVar = this.f7062l;
                if (!z7 && (bVar instanceof s6.f)) {
                    boolean z8 = i2 == 1 || i2 == 2;
                    int i8 = this.f7010i;
                    if (z8 == (i8 == 1 || i8 == 2)) {
                        s6.f fVar = (s6.f) bVar;
                        AbstractC0786t abstractC0786t = fVar.f7827l;
                        CoroutineContext context = fVar.f7828m.getContext();
                        if (abstractC0786t.G(context)) {
                            abstractC0786t.E(context, this);
                            return;
                        }
                        P a7 = o0.a();
                        if (a7.f7027i >= 4294967296L) {
                            a7.J(this);
                            return;
                        }
                        a7.L(true);
                        try {
                            AbstractC0792z.n(this, bVar, true);
                            do {
                            } while (a7.N());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC0792z.n(this, bVar, z7);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 1073741824 + (536870911 & i5)));
    }

    public Throwable q(f0 f0Var) {
        return f0Var.w();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        X x7;
        boolean w4 = w();
        do {
            atomicIntegerFieldUpdater = f7059n;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i5 = i2 >> 29;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (w4) {
                    z();
                }
                Object obj = f7060o.get(this);
                if (obj instanceof C0784q) {
                    throw ((C0784q) obj).f7076a;
                }
                int i7 = this.f7010i;
                if ((i7 != 1 && i7 != 2) || (x7 = (X) this.f7063m.g(C0787u.f7085e)) == null || x7.a()) {
                    return g(obj);
                }
                CancellationException w7 = ((f0) x7).w();
                b(w7);
                throw w7;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((H) f7061p.get(this)) == null) {
            t();
        }
        if (w4) {
            z();
        }
        return W5.a.f2787d;
    }

    @Override // V5.b
    public final void resumeWith(Object obj) {
        Throwable a7 = R5.n.a(obj);
        if (a7 != null) {
            obj = new C0784q(a7, false);
        }
        A(obj, this.f7010i, null);
    }

    public final void s() {
        H t6 = t();
        if (t6 == null || (f7060o.get(this) instanceof j0)) {
            return;
        }
        t6.dispose();
        f7061p.set(this, i0.f7065d);
    }

    public final H t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        X x7 = (X) this.f7063m.g(C0787u.f7085e);
        if (x7 == null) {
            return null;
        }
        H j = AbstractC0792z.j(x7, true, new C0777j(this, 0));
        do {
            atomicReferenceFieldUpdater = f7061p;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, j)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(AbstractC0792z.r(this.f7062l));
        sb.append("){");
        Object obj = f7060o.get(this);
        sb.append(obj instanceof j0 ? "Active" : obj instanceof C0776i ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0792z.g(this));
        return sb.toString();
    }

    public final void u(Function1 function1) {
        v(new C0772e(1, function1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00aa, code lost:
    
        x(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ad, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(j0 j0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7060o;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0769b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, j0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof C0772e) || (obj instanceof s6.r)) {
                break;
            }
            if (obj instanceof C0784q) {
                C0784q c0784q = (C0784q) obj;
                c0784q.getClass();
                if (!C0784q.f7075b.compareAndSet(c0784q, 0, 1)) {
                    x(j0Var, obj);
                    throw null;
                }
                if (obj instanceof C0776i) {
                    if (obj == null) {
                        c0784q = null;
                    }
                    Throwable th = c0784q != null ? c0784q.f7076a : null;
                    if (j0Var instanceof C0772e) {
                        j((C0772e) j0Var, th);
                        return;
                    } else {
                        m((s6.r) j0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0783p)) {
                if (j0Var instanceof s6.r) {
                    return;
                }
                C0783p c0783p = new C0783p(obj, (C0772e) j0Var, (e6.n) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0783p)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0783p c0783p2 = (C0783p) obj;
            if (c0783p2.f7071b != null) {
                x(j0Var, obj);
                throw null;
            }
            if (j0Var instanceof s6.r) {
                return;
            }
            C0772e c0772e = (C0772e) j0Var;
            Throwable th2 = c0783p2.f7074e;
            if (th2 != null) {
                j(c0772e, th2);
                return;
            }
            C0783p a7 = C0783p.a(c0783p2, c0772e, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a7)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean w() {
        if (this.f7010i != 2) {
            return false;
        }
        V5.b bVar = this.f7062l;
        Intrinsics.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return s6.f.f7826p.get((s6.f) bVar) != null;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        V5.b bVar = this.f7062l;
        Throwable th = null;
        s6.f fVar = bVar instanceof s6.f ? (s6.f) bVar : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s6.f.f7826p;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                C0654a c0654a = AbstractC0898a.f7820c;
                if (obj == c0654a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, c0654a, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != c0654a) {
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
            o();
            n(th);
        }
    }
}
