package c7;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class h extends f0 implements f, j6.d, w1 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1698k = AtomicIntegerFieldUpdater.newUpdater(h.class, "_decisionAndIndex$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1699l = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_state$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1700m = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: i, reason: collision with root package name */
    public final h6.d f1701i;

    /* renamed from: j, reason: collision with root package name */
    public final h6.i f1702j;

    public h(int i7, h6.d dVar) {
        super(i7);
        this.f1701i = dVar;
        this.f1702j = dVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f1671a;
    }

    public static Object D(k1 k1Var, Object obj, int i7, q6.f fVar) {
        if (obj instanceof p) {
            return obj;
        }
        if (i7 != 1 && i7 != 2) {
            return obj;
        }
        if (fVar != null || (k1Var instanceof e)) {
            return new o(obj, k1Var instanceof e ? (e) k1Var : null, fVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void x(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A(Object obj, q6.f fVar) {
        B(obj, this.f1691h, fVar);
    }

    public final void B(Object obj, int i7, q6.f fVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1699l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof k1) {
                Object D = D((k1) obj2, obj, i7, fVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    m();
                }
                n(i7);
                return;
            }
            if (obj2 instanceof i) {
                i iVar = (i) obj2;
                if (i.f1704c.compareAndSet(iVar, 0, 1)) {
                    if (fVar != null) {
                        j(fVar, iVar.f1725a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void C(t tVar) {
        h6.d dVar = this.f1701i;
        h7.f fVar = dVar instanceof h7.f ? (h7.f) dVar : null;
        B(d6.z.f2639a, (fVar != null ? fVar.f4677i : null) == tVar ? 4 : this.f1691h, null);
    }

    @Override // c7.w1
    public final void a(h7.q qVar, int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        do {
            atomicIntegerFieldUpdater = f1698k;
            i8 = atomicIntegerFieldUpdater.get(this);
            if ((i8 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, ((i8 >> 29) << 29) + i7));
        u(qVar);
    }

    @Override // c7.f0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1699l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof k1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof p) {
                return;
            }
            if (!(obj instanceof o)) {
                cancellationException2 = cancellationException;
                o oVar = new o(obj, (e) null, (q6.f) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            o oVar2 = (o) obj;
            if (oVar2.f1722e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            o a3 = o.a(oVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            e eVar = oVar2.f1719b;
            if (eVar != null) {
                i(eVar, cancellationException);
            }
            q6.f fVar = oVar2.f1720c;
            if (fVar != null) {
                j(fVar, cancellationException, oVar2.f1718a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // c7.f0
    public final h6.d c() {
        return this.f1701i;
    }

    @Override // c7.f0
    public final Throwable d(Object obj) {
        Throwable d8 = super.d(obj);
        if (d8 != null) {
            return d8;
        }
        return null;
    }

    @Override // c7.f0
    public final Object e(Object obj) {
        return obj instanceof o ? ((o) obj).f1718a : obj;
    }

    @Override // c7.f
    public final boolean g(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1699l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof k1)) {
                return false;
            }
            i iVar = new i(this, th, (obj instanceof e) || (obj instanceof h7.q));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, iVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            k1 k1Var = (k1) obj;
            if (k1Var instanceof e) {
                i((e) obj, th);
            } else if (k1Var instanceof h7.q) {
                k((h7.q) obj, th);
            }
            if (!w()) {
                m();
            }
            n(this.f1691h);
            return true;
        }
    }

    @Override // j6.d
    public final j6.d getCallerFrame() {
        h6.d dVar = this.f1701i;
        if (dVar instanceof j6.d) {
            return (j6.d) dVar;
        }
        return null;
    }

    @Override // h6.d
    public final h6.i getContext() {
        return this.f1702j;
    }

    @Override // c7.f0
    public final Object h() {
        return f1699l.get(this);
    }

    public final void i(e eVar, Throwable th) {
        try {
            switch (eVar.f1684a) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    ((ScheduledFuture) eVar.f1685b).cancel(false);
                    break;
                case 1:
                    ((q6.c) eVar.f1685b).f(th);
                    break;
                default:
                    ((i0) eVar.f1685b).a();
                    break;
            }
        } catch (Throwable th2) {
            a0.l(this.f1702j, new b4.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void j(q6.f fVar, Throwable th, Object obj) {
        h6.i iVar = this.f1702j;
        try {
            fVar.c(th, obj, iVar);
        } catch (Throwable th2) {
            a0.l(iVar, new b4.c("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void k(h7.q qVar, Throwable th) {
        h6.i iVar = this.f1702j;
        int i7 = f1698k.get(this) & 536870911;
        if (i7 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            qVar.g(i7, iVar);
        } catch (Throwable th2) {
            a0.l(iVar, new b4.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // c7.f
    public final void l(Object obj) {
        n(this.f1691h);
    }

    public final void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1700m;
        i0 i0Var = (i0) atomicReferenceFieldUpdater.get(this);
        if (i0Var == null) {
            return;
        }
        i0Var.a();
        atomicReferenceFieldUpdater.set(this, j1.f1710f);
    }

    public final void n(int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        do {
            atomicIntegerFieldUpdater = f1698k;
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z8 = i7 == 4;
                h6.d dVar = this.f1701i;
                if (!z8 && (dVar instanceof h7.f)) {
                    boolean z9 = i7 == 1 || i7 == 2;
                    int i10 = this.f1691h;
                    if (z9 == (i10 == 1 || i10 == 2)) {
                        h7.f fVar = (h7.f) dVar;
                        t tVar = fVar.f4677i;
                        h6.i context = fVar.f4678j.getContext();
                        if (tVar.X(context)) {
                            tVar.V(context, this);
                            return;
                        }
                        q0 a3 = p1.a();
                        if (a3.f1732h >= 4294967296L) {
                            a3.a0(this);
                            return;
                        }
                        a3.c0(true);
                        try {
                            a0.r(this, dVar, true);
                            do {
                            } while (a3.e0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                a0.r(this, dVar, z8);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
    }

    @Override // c7.f
    public final h7.s o(Object obj, q6.f fVar) {
        h7.s sVar = a0.f1660a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1699l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof k1)) {
                return null;
            }
            Object D = D((k1) obj2, obj, this.f1691h, fVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!w()) {
                m();
            }
            return sVar;
        }
    }

    public Throwable p(f1 f1Var) {
        return f1Var.w();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        x0 x0Var;
        boolean w4 = w();
        do {
            atomicIntegerFieldUpdater = f1698k;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (w4) {
                    z();
                }
                Object obj = f1699l.get(this);
                if (obj instanceof p) {
                    throw ((p) obj).f1725a;
                }
                int i9 = this.f1691h;
                if ((i9 != 1 && i9 != 2) || (x0Var = (x0) this.f1702j.u(u.f1748g)) == null || x0Var.b()) {
                    return e(obj);
                }
                CancellationException w5 = x0Var.w();
                b(w5);
                throw w5;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        if (((i0) f1700m.get(this)) == null) {
            s();
        }
        if (w4) {
            z();
        }
        return i6.a.f4956f;
    }

    public final void r() {
        i0 s5 = s();
        if (s5 == null || (f1699l.get(this) instanceof k1)) {
            return;
        }
        s5.a();
        f1700m.set(this, j1.f1710f);
    }

    @Override // h6.d
    public final void resumeWith(Object obj) {
        Throwable a3 = d6.m.a(obj);
        if (a3 != null) {
            obj = new p(a3, false);
        }
        B(obj, this.f1691h, null);
    }

    public final i0 s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        x0 x0Var = (x0) this.f1702j.u(u.f1748g);
        if (x0Var == null) {
            return null;
        }
        i0 m8 = a0.m(x0Var, true, new j(this, 0));
        do {
            atomicReferenceFieldUpdater = f1700m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, m8)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return m8;
    }

    public final void t(q6.c cVar) {
        u(new e(1, cVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(a0.u(this.f1701i));
        sb.append("){");
        Object obj = f1699l.get(this);
        sb.append(obj instanceof k1 ? "Active" : obj instanceof i ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(a0.i(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ae, code lost:
    
        x(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(k1 k1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1699l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof e) || (obj instanceof h7.q)) {
                break;
            }
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (!p.f1724b.compareAndSet(pVar, 0, 1)) {
                    x(k1Var, obj);
                    throw null;
                }
                if (obj instanceof i) {
                    Throwable th = pVar.f1725a;
                    if (k1Var instanceof e) {
                        i((e) k1Var, th);
                        return;
                    } else {
                        r6.k.d(k1Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        k((h7.q) k1Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof o)) {
                if (k1Var instanceof h7.q) {
                    return;
                }
                r6.k.d(k1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                o oVar = new o(obj, (e) k1Var, (q6.f) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            o oVar2 = (o) obj;
            if (oVar2.f1719b != null) {
                x(k1Var, obj);
                throw null;
            }
            if (k1Var instanceof h7.q) {
                return;
            }
            r6.k.d(k1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            e eVar = (e) k1Var;
            Throwable th2 = oVar2.f1722e;
            if (th2 != null) {
                i(eVar, th2);
                return;
            }
            o a3 = o.a(oVar2, eVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean v() {
        return f1699l.get(this) instanceof k1;
    }

    public final boolean w() {
        if (this.f1691h != 2) {
            return false;
        }
        h6.d dVar = this.f1701i;
        r6.k.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return h7.f.f4676m.get((h7.f) dVar) != null;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        h6.d dVar = this.f1701i;
        Throwable th = null;
        h7.f fVar = dVar instanceof h7.f ? (h7.f) dVar : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h7.f.f4676m;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                h7.s sVar = h7.a.f4666c;
                if (obj == sVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, sVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != sVar) {
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
            g(th);
        }
    }
}
