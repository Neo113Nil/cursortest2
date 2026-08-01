package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class ka extends gk implements ia, ch, qn0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(ka.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(ka.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(ka.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final dg i;
    public final qg j;

    public ka(dg dgVar, int i) {
        super(i);
        this.i = dgVar;
        this.j = dgVar.d();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = q1.a;
    }

    public static Object C(w30 w30Var, Object obj, int i, ja jaVar) {
        if (obj instanceof ld) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (jaVar != null || (w30Var instanceof ok)) {
            return new jd(obj, w30Var instanceof ok ? (ok) w30Var : null, jaVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void y(w30 w30Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + w30Var + ", already has " + obj).toString());
    }

    public final void A() {
        dg dgVar = this.i;
        Throwable th = null;
        ek ekVar = dgVar instanceof ek ? (ek) dgVar : null;
        if (ekVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ek.m;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(ekVar);
                lm lmVar = mv.i;
                if (obj == lmVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(ekVar, lmVar, this)) {
                        if (atomicReferenceFieldUpdater.get(ekVar) != lmVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        s9.x(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(ekVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(ekVar) != obj) {
                            s9.k("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            r();
            q(th);
        }
    }

    public final void B(Object obj, int i, ja jaVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof w30) {
                Object C = C((w30) obj2, obj, i, jaVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    r();
                }
                s(i);
                return;
            }
            if (obj2 instanceof na) {
                na naVar = (na) obj2;
                if (na.c.compareAndSet(naVar, 0, 1)) {
                    if (jaVar != null) {
                        o(jaVar, naVar.a, obj);
                        return;
                    }
                    return;
                }
            }
            s9.x(obj, "Already resumed, but proposed with update ");
            return;
        }
    }

    @Override // defpackage.qn0
    public final void a(uc0 uc0Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = k;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                s9.u("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        w(uc0Var);
    }

    @Override // defpackage.gk
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof w30) {
                s9.u("Not completed");
                return;
            }
            if (obj instanceof ld) {
                return;
            }
            if (!(obj instanceof jd)) {
                cancellationException2 = cancellationException;
                jd jdVar = new jd(obj, (ok) null, (ja) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, jdVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            jd jdVar2 = (jd) obj;
            if (jdVar2.e != null) {
                s9.u("Must be called at most once");
                return;
            }
            jd a = jd.a(jdVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            ok okVar = jdVar2.b;
            if (okVar != null) {
                n(okVar, cancellationException);
            }
            ja jaVar = jdVar2.c;
            if (jaVar != null) {
                o(jaVar, cancellationException, jdVar2.a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // defpackage.ch
    public final ch c() {
        dg dgVar = this.i;
        if (dgVar instanceof ch) {
            return (ch) dgVar;
        }
        return null;
    }

    @Override // defpackage.dg
    public final qg d() {
        return this.j;
    }

    @Override // defpackage.dg
    public final void e(Object obj) {
        Throwable a = aa0.a(obj);
        if (a != null) {
            obj = new ld(a, false);
        }
        B(obj, this.h, null);
    }

    @Override // defpackage.ia
    public final lm f(ja jaVar) {
        lm lmVar = bi.g;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof w30)) {
                return null;
            }
            Object C = C((w30) obj, sk0.a, this.h, jaVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, C)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!x()) {
                r();
            }
            return lmVar;
        }
    }

    @Override // defpackage.gk
    public final dg g() {
        return this.i;
    }

    @Override // defpackage.gk
    public final Throwable h(Object obj) {
        Throwable h = super.h(obj);
        if (h != null) {
            return h;
        }
        return null;
    }

    @Override // defpackage.gk
    public final Object i(Object obj) {
        return obj instanceof jd ? ((jd) obj).a : obj;
    }

    @Override // defpackage.ia
    public final void j(ja jaVar) {
        B(sk0.a, this.h, jaVar);
    }

    @Override // defpackage.ia
    public final void k(Object obj) {
        s(this.h);
    }

    @Override // defpackage.gk
    public final Object m() {
        return l.get(this);
    }

    public final void n(ok okVar, Throwable th) {
        try {
            okVar.a.a();
        } catch (Throwable th2) {
            n9.x(this.j, new md("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o(ja jaVar, Throwable th, Object obj) {
        qg qgVar = this.j;
        try {
            jaVar.c(th, obj, qgVar);
        } catch (Throwable th2) {
            n9.x(qgVar, new md("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void p(lc0 lc0Var, Throwable th) {
        int i = k.get(this) & 536870911;
        if (i == 536870911) {
            s9.u("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            lc0Var.e(i);
        } catch (Throwable th2) {
            n9.x(this.j, new md("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void q(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof w30) {
                na naVar = new na(this, th, (obj instanceof ok) || (obj instanceof lc0));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, naVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                w30 w30Var = (w30) obj;
                if (w30Var instanceof ok) {
                    n((ok) obj, th);
                } else if (w30Var instanceof lc0) {
                    p((lc0) obj, th);
                }
                if (!x()) {
                    r();
                }
                s(this.h);
                return;
            }
            return;
        }
    }

    public final void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        nk nkVar = (nk) atomicReferenceFieldUpdater.get(this);
        if (nkVar == null) {
            return;
        }
        nkVar.a();
        atomicReferenceFieldUpdater.set(this, v30.f);
    }

    public final void s(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = k;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    s9.u("Already resumed");
                    return;
                }
                boolean z = i == 4;
                dg dgVar = this.i;
                if (!z && (dgVar instanceof ek)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.h;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        ek ekVar = (ek) dgVar;
                        tg tgVar = ekVar.i;
                        qg qgVar = ekVar.j.g;
                        qgVar.getClass();
                        if (tgVar.P(qgVar)) {
                            tgVar.O(qgVar, this);
                            return;
                        }
                        ln a = ai0.a();
                        if (a.h >= 4294967296L) {
                            z6 z6Var = a.j;
                            if (z6Var == null) {
                                z6Var = new z6();
                                a.j = z6Var;
                            }
                            z6Var.addLast(this);
                            return;
                        }
                        a.S(true);
                        try {
                            gk0.K(this, dgVar, true);
                            do {
                            } while (a.U());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                gk0.K(this, dgVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable t(mw mwVar) {
        return mwVar.s();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(bi.d0(this.i));
        sb.append("){");
        Object obj = l.get(this);
        sb.append(obj instanceof w30 ? "Active" : obj instanceof na ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(bi.D(this));
        return sb.toString();
    }

    public final Object u() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        mw mwVar;
        boolean x = x();
        do {
            atomicIntegerFieldUpdater = k;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    s9.u("Already suspended");
                    return null;
                }
                if (x) {
                    A();
                }
                Object obj = l.get(this);
                if (obj instanceof ld) {
                    throw ((ld) obj).a;
                }
                int i3 = this.h;
                if ((i3 != 1 && i3 != 2) || (mwVar = (mw) this.j.w(sl.k)) == null || mwVar.C()) {
                    return i(obj);
                }
                CancellationException s = mwVar.s();
                b(s);
                throw s;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((nk) m.get(this)) == null) {
            v();
        }
        if (x) {
            A();
        }
        return bh.COROUTINE_SUSPENDED;
    }

    public final nk v() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        mw mwVar = (mw) this.j.w(sl.k);
        if (mwVar == null) {
            return null;
        }
        nk H = bi.H(mwVar, true, new jb(0, this));
        do {
            atomicReferenceFieldUpdater = m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, H)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return H;
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
    public final void w(w30 w30Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof q1) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w30Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof ok) || (obj instanceof lc0)) {
                break;
            }
            if (obj instanceof ld) {
                ld ldVar = (ld) obj;
                if (!ld.b.compareAndSet(ldVar, 0, 1)) {
                    y(w30Var, obj);
                    throw null;
                }
                if (obj instanceof na) {
                    Throwable th = ldVar.a;
                    if (w30Var instanceof ok) {
                        n((ok) w30Var, th);
                        return;
                    } else {
                        p((lc0) w30Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof jd)) {
                if (w30Var instanceof lc0) {
                    return;
                }
                jd jdVar = new jd(obj, (ok) w30Var, (ja) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, jdVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            jd jdVar2 = (jd) obj;
            if (jdVar2.b != null) {
                y(w30Var, obj);
                throw null;
            }
            if (w30Var instanceof lc0) {
                return;
            }
            ok okVar = (ok) w30Var;
            Throwable th2 = jdVar2.e;
            if (th2 != null) {
                n(okVar, th2);
                return;
            }
            jd a = jd.a(jdVar2, okVar, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean x() {
        if (this.h == 2) {
            return ek.m.get((ek) this.i) != null;
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
