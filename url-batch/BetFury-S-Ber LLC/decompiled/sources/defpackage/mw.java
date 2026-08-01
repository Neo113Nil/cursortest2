package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class mw implements og {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(mw.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(mw.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public mw(boolean z) {
        this._state$volatile = z ? n9.m : n9.l;
    }

    public static lb I(zy zyVar) {
        while (zyVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zy.g;
            zy f2 = zyVar.f();
            if (f2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(zyVar);
                while (true) {
                    zyVar = (zy) obj;
                    if (!zyVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(zyVar);
                }
            } else {
                zyVar = f2;
            }
        }
        while (true) {
            zyVar = zyVar.h();
            if (!zyVar.i()) {
                if (zyVar instanceof lb) {
                    return (lb) zyVar;
                }
                if (zyVar instanceof u30) {
                    return null;
                }
            }
        }
    }

    public static String P(Object obj) {
        if (!(obj instanceof lw)) {
            return obj instanceof wu ? ((wu) obj).b() ? "Active" : "New" : obj instanceof ld ? "Cancelled" : "Completed";
        }
        lw lwVar = (lw) obj;
        return lwVar.e() ? "Cancelling" : lw.g.get(lwVar) != 0 ? "Completing" : "Active";
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r4 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [iw, java.lang.Object, lb, zy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, nk] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v8, types: [u30, zy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(mw mwVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        int O;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g;
        v30 v30Var = v30.f;
        if (mwVar == null) {
            atomicReferenceFieldUpdater2.set(this, v30Var);
            return;
        }
        do {
            atomicReferenceFieldUpdater = f;
            O = mwVar.O(atomicReferenceFieldUpdater.get(mwVar));
            if (O == 0) {
                break;
            }
        } while (O != 1);
        ?? lbVar = new lb(this);
        lbVar.i = mwVar;
        loop1: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(mwVar);
            if (obj instanceof sm) {
                sm smVar = (sm) obj;
                if (smVar.f) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(mwVar, obj, lbVar)) {
                        if (atomicReferenceFieldUpdater.get(mwVar) != obj) {
                            break;
                        }
                    }
                    break loop1;
                }
                mwVar.M(smVar);
            } else {
                if (obj instanceof wu) {
                    ?? d = ((wu) obj).d();
                    if (d == 0) {
                        mwVar.N((iw) obj);
                    } else if (!d.e(lbVar, 7)) {
                        boolean e = d.e(lbVar, 3);
                        Object obj2 = atomicReferenceFieldUpdater.get(mwVar);
                        if (obj2 instanceof lw) {
                            r6 = ((lw) obj2).c();
                        } else {
                            ld ldVar = obj2 instanceof ld ? (ld) obj2 : null;
                            if (ldVar != null) {
                                r6 = ldVar.a;
                            }
                        }
                        lbVar.l(r6);
                    }
                } else {
                    Object obj3 = atomicReferenceFieldUpdater.get(mwVar);
                    ld ldVar2 = obj3 instanceof ld ? (ld) obj3 : null;
                    lbVar.l(ldVar2 != null ? ldVar2.a : null);
                }
            }
        }
        atomicReferenceFieldUpdater2.set(this, lbVar);
        if (atomicReferenceFieldUpdater.get(this) instanceof wu) {
            return;
        }
        lbVar.a();
        atomicReferenceFieldUpdater2.set(this, v30Var);
    }

    public final nk B(boolean z, iw iwVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        v30 v30Var;
        boolean z2;
        boolean e;
        iwVar.i = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof sm;
            v30Var = v30.f;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof wu)) {
                    z2 = false;
                    break;
                }
                wu wuVar = (wu) obj;
                u30 d = wuVar.d();
                if (d == null) {
                    N((iw) obj);
                } else {
                    if (iwVar.k()) {
                        lw lwVar = wuVar instanceof lw ? (lw) wuVar : null;
                        Throwable c = lwVar != null ? lwVar.c() : null;
                        if (c == null) {
                            e = d.e(iwVar, 5);
                        } else if (z) {
                            iwVar.l(c);
                            return v30Var;
                        }
                    } else {
                        e = d.e(iwVar, 1);
                    }
                    if (e) {
                        break;
                    }
                }
            } else {
                sm smVar = (sm) obj;
                if (smVar.f) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, iwVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                M(smVar);
            }
        }
        if (z2) {
            return iwVar;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            ld ldVar = obj2 instanceof ld ? (ld) obj2 : null;
            iwVar.l(ldVar != null ? ldVar.a : null);
        }
        return v30Var;
    }

    public boolean C() {
        Object obj = f.get(this);
        return (obj instanceof wu) && ((wu) obj).b();
    }

    @Override // defpackage.qg
    public final qg D(pg pgVar) {
        return mv.D(this, pgVar);
    }

    public boolean E() {
        return this instanceof y8;
    }

    public final boolean F(Object obj) {
        Object Q;
        do {
            Q = Q(f.get(this), obj);
            if (Q == n9.g) {
                return false;
            }
            if (Q == n9.h) {
                return true;
            }
        } while (Q == n9.i);
        a(Q);
        return true;
    }

    public final Object G(Object obj) {
        Object Q;
        do {
            Q = Q(f.get(this), obj);
            if (Q == n9.g) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                ld ldVar = obj instanceof ld ? (ld) obj : null;
                throw new IllegalStateException(str, ldVar != null ? ldVar.a : null);
            }
        } while (Q == n9.i);
        return Q;
    }

    public String H() {
        return getClass().getSimpleName();
    }

    public final void J(u30 u30Var, Throwable th) {
        u30Var.e(new ey(4), 4);
        Object obj = zy.f.get(u30Var);
        obj.getClass();
        md mdVar = null;
        for (zy zyVar = (zy) obj; !zyVar.equals(u30Var); zyVar = zyVar.h()) {
            if ((zyVar instanceof iw) && ((iw) zyVar).k()) {
                try {
                    ((iw) zyVar).l(th);
                } catch (Throwable th2) {
                    if (mdVar != null) {
                        bi.f(mdVar, th2);
                    } else {
                        mdVar = new md("Exception in completion handler " + zyVar + " for " + this, th2);
                    }
                }
            }
        }
        if (mdVar != null) {
            z(mdVar);
        }
        h(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [vu] */
    public final void M(sm smVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u30 u30Var = new u30();
        if (!smVar.f) {
            u30Var = new vu(u30Var);
        }
        do {
            atomicReferenceFieldUpdater = f;
            if (atomicReferenceFieldUpdater.compareAndSet(this, smVar, u30Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == smVar);
    }

    public final void N(iw iwVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u30 u30Var = new u30();
        iwVar.getClass();
        zy.g.set(u30Var, iwVar);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = zy.f;
        atomicReferenceFieldUpdater2.set(u30Var, iwVar);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(iwVar) == iwVar) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(iwVar, iwVar, u30Var)) {
                    if (atomicReferenceFieldUpdater2.get(iwVar) != iwVar) {
                        break;
                    }
                }
                u30Var.g(iwVar);
                break loop0;
            }
            break;
        }
        zy h = iwVar.h();
        do {
            atomicReferenceFieldUpdater = f;
            if (atomicReferenceFieldUpdater.compareAndSet(this, iwVar, h)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == iwVar);
    }

    public final int O(Object obj) {
        boolean z = obj instanceof sm;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        if (z) {
            if (((sm) obj).f) {
                return 0;
            }
            sm smVar = n9.m;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, smVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            L();
            return 1;
        }
        if (!(obj instanceof vu)) {
            return 0;
        }
        u30 u30Var = ((vu) obj).f;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, u30Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        L();
        return 1;
    }

    public final Object Q(Object obj, Object obj2) {
        if (!(obj instanceof wu)) {
            return n9.g;
        }
        if (((obj instanceof sm) || (obj instanceof iw)) && !(obj instanceof lb) && !(obj2 instanceof ld)) {
            wu wuVar = (wu) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object xuVar = obj2 instanceof wu ? new xu((wu) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, wuVar, xuVar)) {
                if (atomicReferenceFieldUpdater.get(this) != wuVar) {
                    return n9.i;
                }
            }
            K(obj2);
            o(wuVar, obj2);
            return obj2;
        }
        wu wuVar2 = (wu) obj;
        u30 x = x(wuVar2);
        if (x == null) {
            return n9.i;
        }
        lw lwVar = wuVar2 instanceof lw ? (lw) wuVar2 : null;
        if (lwVar == null) {
            lwVar = new lw(x, null);
        }
        synchronized (lwVar) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = lw.g;
            if (atomicIntegerFieldUpdater.get(lwVar) != 0) {
                return n9.g;
            }
            atomicIntegerFieldUpdater.set(lwVar, 1);
            if (lwVar != wuVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, wuVar2, lwVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != wuVar2) {
                        return n9.i;
                    }
                }
            }
            boolean e = lwVar.e();
            ld ldVar = obj2 instanceof ld ? (ld) obj2 : null;
            if (ldVar != null) {
                lwVar.a(ldVar.a);
            }
            Throwable c = e ? null : lwVar.c();
            if (c != null) {
                J(x, c);
            }
            lb I = I(x);
            if (I != null && R(lwVar, I, obj2)) {
                return n9.h;
            }
            x.e(new ey(2), 2);
            lb I2 = I(x);
            return (I2 == null || !R(lwVar, I2, obj2)) ? q(lwVar, obj2) : n9.h;
        }
    }

    public final boolean R(lw lwVar, lb lbVar, Object obj) {
        while (bi.H(lbVar.j, false, new kw(this, lwVar, lbVar, obj)) == v30.f) {
            lbVar = I(lbVar);
            if (lbVar == null) {
                return false;
            }
        }
        return true;
    }

    public void b(Object obj) {
        a(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 == defpackage.n9.h) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(Object obj) {
        lm lmVar;
        Object obj2 = n9.g;
        if (v()) {
            do {
                Object obj3 = f.get(this);
                if (obj3 instanceof wu) {
                    if (obj3 instanceof lw) {
                        if (lw.g.get((lw) obj3) != 0) {
                        }
                    }
                    obj2 = Q(obj3, new ld(p(obj), false));
                }
                obj2 = n9.g;
                break;
            } while (obj2 == n9.i);
        }
        if (obj2 == n9.g) {
            Throwable th = null;
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                if (!(obj4 instanceof lw)) {
                    if (!(obj4 instanceof wu)) {
                        lmVar = n9.j;
                        break;
                    }
                    if (th == null) {
                        th = p(obj);
                    }
                    wu wuVar = (wu) obj4;
                    if (wuVar.b()) {
                        u30 x = x(wuVar);
                        if (x != null) {
                            lw lwVar = new lw(x, th);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, wuVar, lwVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != wuVar) {
                                    break;
                                }
                            }
                            J(x, th);
                            lmVar = n9.g;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object Q = Q(obj4, new ld(th, false));
                        if (Q == n9.g) {
                            s9.x(obj4, "Cannot happen in ");
                            return false;
                        }
                        if (Q != n9.i) {
                            obj2 = Q;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        if (lw.i.get((lw) obj4) == n9.k) {
                            lmVar = n9.j;
                        } else {
                            boolean e = ((lw) obj4).e();
                            if (th == null) {
                                th = p(obj);
                            }
                            ((lw) obj4).a(th);
                            Throwable c = e ? null : ((lw) obj4).c();
                            if (c != null) {
                                J(((lw) obj4).f, c);
                            }
                            lmVar = n9.g;
                        }
                    }
                }
            }
            obj2 = lmVar;
        }
        if (obj2 != n9.g && obj2 != n9.h) {
            if (obj2 == n9.j) {
                return false;
            }
            a(obj2);
            return true;
        }
        return true;
    }

    @Override // defpackage.og
    public final pg getKey() {
        return sl.k;
    }

    public final boolean h(Throwable th) {
        if (E()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        kb kbVar = (kb) g.get(this);
        return (kbVar == null || kbVar == v30.f) ? z : kbVar.c(th) || z;
    }

    public String l() {
        return "Job was cancelled";
    }

    public boolean m(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return g(th) && u();
    }

    @Override // defpackage.qg
    public final Object n(Object obj, xr xrVar) {
        return xrVar.g(obj, this);
    }

    public final void o(wu wuVar, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        kb kbVar = (kb) atomicReferenceFieldUpdater.get(this);
        if (kbVar != null) {
            kbVar.a();
            atomicReferenceFieldUpdater.set(this, v30.f);
        }
        md mdVar = null;
        ld ldVar = obj instanceof ld ? (ld) obj : null;
        Throwable th = ldVar != null ? ldVar.a : null;
        if (wuVar instanceof iw) {
            try {
                ((iw) wuVar).l(th);
                return;
            } catch (Throwable th2) {
                z(new md("Exception in completion handler " + wuVar + " for " + this, th2));
                return;
            }
        }
        u30 d = wuVar.d();
        if (d != null) {
            d.e(new ey(1), 1);
            Object obj2 = zy.f.get(d);
            obj2.getClass();
            for (zy zyVar = (zy) obj2; !zyVar.equals(d); zyVar = zyVar.h()) {
                if (zyVar instanceof iw) {
                    try {
                        ((iw) zyVar).l(th);
                    } catch (Throwable th3) {
                        if (mdVar != null) {
                            bi.f(mdVar, th3);
                        } else {
                            mdVar = new md("Exception in completion handler " + zyVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (mdVar != null) {
                z(mdVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable p(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        mw mwVar = (mw) obj;
        Object obj2 = f.get(mwVar);
        if (obj2 instanceof lw) {
            cancellationException = ((lw) obj2).c();
        } else if (obj2 instanceof ld) {
            cancellationException = ((ld) obj2).a;
        } else {
            if (obj2 instanceof wu) {
                s9.x(obj2, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new gw("Parent job is ".concat(P(obj2)), cancellationException, mwVar) : cancellationException2;
    }

    public final Object q(lw lwVar, Object obj) {
        Throwable t;
        ld ldVar = obj instanceof ld ? (ld) obj : null;
        Throwable th = ldVar != null ? ldVar.a : null;
        synchronized (lwVar) {
            lwVar.e();
            ArrayList f2 = lwVar.f(th);
            t = t(lwVar, f2);
            if (t != null && f2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f2.size()));
                int size = f2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = f2.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != t && th2 != t && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        bi.f(t, th2);
                    }
                }
            }
        }
        if (t != null && t != th) {
            obj = new ld(t, false);
        }
        if (t != null && (h(t) || y(t))) {
            obj.getClass();
            ld.b.compareAndSet((ld) obj, 0, 1);
        }
        K(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        Object xuVar = obj instanceof wu ? new xu((wu) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, lwVar, xuVar) && atomicReferenceFieldUpdater.get(this) == lwVar) {
        }
        o(lwVar, obj);
        return obj;
    }

    @Override // defpackage.qg
    public final qg r(qg qgVar) {
        return mv.I(this, qgVar);
    }

    public final CancellationException s() {
        CancellationException cancellationException;
        Object obj = f.get(this);
        if (obj instanceof lw) {
            Throwable c = ((lw) obj).c();
            if (c == null) {
                s9.x(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = c instanceof CancellationException ? (CancellationException) c : null;
            return cancellationException == null ? new gw(concat, c, this) : cancellationException;
        }
        if (obj instanceof wu) {
            s9.x(this, "Job is still new or active: ");
            return null;
        }
        if (!(obj instanceof ld)) {
            return new gw(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((ld) obj).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new gw(l(), th, this) : cancellationException;
    }

    public final Throwable t(lw lwVar, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (lwVar.e()) {
                return new gw(l(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof hi0) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof hi0)) {
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

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(H() + '{' + P(f.get(this)) + '}');
        sb.append('@');
        sb.append(bi.D(this));
        return sb.toString();
    }

    public boolean u() {
        return true;
    }

    public boolean v() {
        return this instanceof id;
    }

    @Override // defpackage.qg
    public final og w(pg pgVar) {
        return mv.p(this, pgVar);
    }

    public final u30 x(wu wuVar) {
        u30 d = wuVar.d();
        if (d != null) {
            return d;
        }
        if (wuVar instanceof sm) {
            return new u30();
        }
        if (wuVar instanceof iw) {
            N((iw) wuVar);
            return null;
        }
        s9.x(wuVar, "State should have list: ");
        return null;
    }

    public boolean y(Throwable th) {
        return false;
    }

    public void K(Object obj) {
    }

    public void a(Object obj) {
    }

    public void z(md mdVar) {
        throw mdVar;
    }

    public void L() {
    }
}
