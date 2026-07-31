package a7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class h extends c0 implements f, i6.d, s1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(h.class, "_decisionAndIndex$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f258j = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_state$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f259k = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final g6.c f260g;

    /* renamed from: h, reason: collision with root package name */
    public final g6.h f261h;

    public h(int i8, g6.c cVar) {
        super(i8);
        this.f260g = cVar;
        this.f261h = cVar.f();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f242a;
    }

    public static Object F(f1 f1Var, Object obj, int i8, p6.f fVar) {
        if (obj instanceof o) {
            return obj;
        }
        if (i8 != 1 && i8 != 2) {
            return obj;
        }
        if (fVar != null || (f1Var instanceof e)) {
            return new n(obj, f1Var instanceof e ? (e) f1Var : null, fVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void y(f1 f1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + f1Var + ", already has " + obj).toString());
    }

    @Override // a7.f
    public final void A(Object obj) {
        q(this.f247f);
    }

    public final void B() {
        g6.c cVar = this.f260g;
        Throwable th = null;
        f7.f fVar = cVar instanceof f7.f ? (f7.f) cVar : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7.f.f2772k;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                d4.t tVar = f7.a.f2762c;
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
            p();
            m(th);
        }
    }

    public final void C(Object obj, p6.f fVar) {
        D(obj, this.f247f, fVar);
    }

    public final void D(Object obj, int i8, p6.f fVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f258j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof f1) {
                Object F = F((f1) obj2, obj, i8, fVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, F)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    p();
                }
                q(i8);
                return;
            }
            if (obj2 instanceof i) {
                i iVar = (i) obj2;
                if (i.f264c.compareAndSet(iVar, 0, 1)) {
                    if (fVar != null) {
                        l(fVar, iVar.f286a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void E(q qVar) {
        g6.c cVar = this.f260g;
        f7.f fVar = cVar instanceof f7.f ? (f7.f) cVar : null;
        D(c6.m.f1757a, (fVar != null ? fVar.f2773g : null) == qVar ? 4 : this.f247f, null);
    }

    @Override // a7.s1
    public final void a(f7.r rVar, int i8) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        do {
            atomicIntegerFieldUpdater = i;
            i9 = atomicIntegerFieldUpdater.get(this);
            if ((i9 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, ((i9 >> 29) << 29) + i8));
        w(rVar);
    }

    @Override // a7.c0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f258j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof f1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof o) {
                return;
            }
            if (!(obj instanceof n)) {
                cancellationException2 = cancellationException;
                n nVar = new n(obj, (e) null, (p6.f) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            n nVar2 = (n) obj;
            if (nVar2.f283e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            n a8 = n.a(nVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a8)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            e eVar = nVar2.f280b;
            if (eVar != null) {
                j(eVar, cancellationException);
            }
            p6.f fVar = nVar2.f281c;
            if (fVar != null) {
                l(fVar, cancellationException, nVar2.f279a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // a7.c0
    public final g6.c c() {
        return this.f260g;
    }

    @Override // a7.c0
    public final Throwable d(Object obj) {
        Throwable d8 = super.d(obj);
        if (d8 != null) {
            return d8;
        }
        return null;
    }

    @Override // i6.d
    public final i6.d e() {
        g6.c cVar = this.f260g;
        if (cVar instanceof i6.d) {
            return (i6.d) cVar;
        }
        return null;
    }

    @Override // g6.c
    public final g6.h f() {
        return this.f261h;
    }

    @Override // a7.c0
    public final Object g(Object obj) {
        return obj instanceof n ? ((n) obj).f279a : obj;
    }

    @Override // a7.c0
    public final Object i() {
        return f258j.get(this);
    }

    public final void j(e eVar, Throwable th) {
        try {
            switch (eVar.f251a) {
                case 0:
                    ((p6.c) eVar.f252b).i(th);
                    break;
                default:
                    ((e0) eVar.f252b).a();
                    break;
            }
        } catch (Throwable th2) {
            x.j(this.f261h, new a5.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // g6.c
    public final void k(Object obj) {
        Throwable a8 = c6.i.a(obj);
        if (a8 != null) {
            obj = new o(a8, false);
        }
        D(obj, this.f247f, null);
    }

    public final void l(p6.f fVar, Throwable th, Object obj) {
        g6.h hVar = this.f261h;
        try {
            fVar.d(th, obj, hVar);
        } catch (Throwable th2) {
            x.j(hVar, new a5.c("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // a7.f
    public final boolean m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f258j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof f1)) {
                return false;
            }
            i iVar = new i(this, th, (obj instanceof e) || (obj instanceof f7.r));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, iVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            f1 f1Var = (f1) obj;
            if (f1Var instanceof e) {
                j((e) obj, th);
            } else if (f1Var instanceof f7.r) {
                n((f7.r) obj, th);
            }
            if (!x()) {
                p();
            }
            q(this.f247f);
            return true;
        }
    }

    public final void n(f7.r rVar, Throwable th) {
        g6.h hVar = this.f261h;
        int i8 = i.get(this) & 536870911;
        if (i8 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.g(i8, hVar);
        } catch (Throwable th2) {
            x.j(hVar, new a5.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // a7.f
    public final d4.t o(Object obj, p6.f fVar) {
        d4.t tVar = x.f310a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f258j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof f1)) {
                return null;
            }
            Object F = F((f1) obj2, obj, this.f247f, fVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, F)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!x()) {
                p();
            }
            return tVar;
        }
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f259k;
        e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
        if (e0Var == null) {
            return;
        }
        e0Var.a();
        atomicReferenceFieldUpdater.set(this, e1.f253d);
    }

    public final void q(int i8) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        do {
            atomicIntegerFieldUpdater = i;
            i9 = atomicIntegerFieldUpdater.get(this);
            int i10 = i9 >> 29;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z3 = i8 == 4;
                g6.c cVar = this.f260g;
                if (!z3 && (cVar instanceof f7.f)) {
                    boolean z7 = i8 == 1 || i8 == 2;
                    int i11 = this.f247f;
                    if (z7 == (i11 == 1 || i11 == 2)) {
                        f7.f fVar = (f7.f) cVar;
                        q qVar = fVar.f2773g;
                        g6.h f6 = fVar.f2774h.f();
                        if (qVar.i(f6)) {
                            qVar.h(f6, this);
                            return;
                        }
                        m0 a8 = l1.a();
                        if (a8.f275f >= 4294967296L) {
                            a8.o(this);
                            return;
                        }
                        a8.t(true);
                        try {
                            x.p(this, cVar, true);
                            do {
                            } while (a8.y());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                x.p(this, cVar, z3);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 1073741824 + (536870911 & i9)));
    }

    public Throwable r(a1 a1Var) {
        return a1Var.p();
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        s0 s0Var;
        boolean x7 = x();
        do {
            atomicIntegerFieldUpdater = i;
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (x7) {
                    B();
                }
                Object obj = f258j.get(this);
                if (obj instanceof o) {
                    throw ((o) obj).f286a;
                }
                int i10 = this.f247f;
                if ((i10 != 1 && i10 != 2) || (s0Var = (s0) this.f261h.l(r.f297e)) == null || s0Var.b()) {
                    return g(obj);
                }
                CancellationException p7 = s0Var.p();
                b(p7);
                throw p7;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 536870912 + (536870911 & i8)));
        if (((e0) f259k.get(this)) == null) {
            u();
        }
        if (x7) {
            B();
        }
        return h6.a.f3204d;
    }

    public final void t() {
        e0 u7 = u();
        if (u7 == null || (f258j.get(this) instanceof f1)) {
            return;
        }
        u7.a();
        f259k.set(this, e1.f253d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(x.r(this.f260g));
        sb.append("){");
        Object obj = f258j.get(this);
        sb.append(obj instanceof f1 ? "Active" : obj instanceof i ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(x.g(this));
        return sb.toString();
    }

    public final e0 u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        s0 s0Var = (s0) this.f261h.l(r.f297e);
        if (s0Var == null) {
            return null;
        }
        e0 k3 = x.k(s0Var, true, new j(this, 0));
        do {
            atomicReferenceFieldUpdater = f259k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, k3)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return k3;
    }

    public final void v(p6.c cVar) {
        w(new e(0, cVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a0, code lost:
    
        y(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(f1 f1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f258j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof e) || (obj instanceof f7.r)) {
                break;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (!o.f285b.compareAndSet(oVar, 0, 1)) {
                    y(f1Var, obj);
                    throw null;
                }
                if (obj instanceof i) {
                    Throwable th = oVar.f286a;
                    if (f1Var instanceof e) {
                        j((e) f1Var, th);
                        return;
                    } else {
                        n((f7.r) f1Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof n)) {
                if (f1Var instanceof f7.r) {
                    return;
                }
                n nVar = new n(obj, (e) f1Var, (p6.f) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            n nVar2 = (n) obj;
            if (nVar2.f280b != null) {
                y(f1Var, obj);
                throw null;
            }
            if (f1Var instanceof f7.r) {
                return;
            }
            e eVar = (e) f1Var;
            Throwable th2 = nVar2.f283e;
            if (th2 != null) {
                j(eVar, th2);
                return;
            }
            n a8 = n.a(nVar2, eVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a8)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean x() {
        if (this.f247f != 2) {
            return false;
        }
        g6.c cVar = this.f260g;
        q6.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return f7.f.f2772k.get((f7.f) cVar) != null;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
