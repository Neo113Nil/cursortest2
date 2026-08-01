package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ek extends gk implements ch, dg {
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(ek.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final tg i;
    public final eg j;
    public Object k;
    public final Object l;

    public ek(tg tgVar, eg egVar) {
        super(-1);
        this.i = tgVar;
        this.j = egVar;
        this.k = mv.h;
        qg qgVar = egVar.g;
        qgVar.getClass();
        Object n = qgVar.n(0, gk0.p);
        n.getClass();
        this.l = n;
    }

    @Override // defpackage.ch
    public final ch c() {
        return this.j;
    }

    @Override // defpackage.dg
    public final qg d() {
        qg qgVar = this.j.g;
        qgVar.getClass();
        return qgVar;
    }

    @Override // defpackage.dg
    public final void e(Object obj) {
        Throwable a = aa0.a(obj);
        Object ldVar = a == null ? obj : new ld(a, false);
        eg egVar = this.j;
        qg qgVar = egVar.g;
        qgVar.getClass();
        tg tgVar = this.i;
        if (tgVar.P(qgVar)) {
            this.k = ldVar;
            this.h = 0;
            qgVar.getClass();
            tgVar.O(qgVar, this);
            return;
        }
        ln a2 = ai0.a();
        if (a2.h >= 4294967296L) {
            this.k = ldVar;
            this.h = 0;
            z6 z6Var = a2.j;
            if (z6Var == null) {
                z6Var = new z6();
                a2.j = z6Var;
            }
            z6Var.addLast(this);
            return;
        }
        a2.S(true);
        try {
            qgVar.getClass();
            Object U = gk0.U(qgVar, this.l);
            try {
                egVar.e(obj);
                while (a2.U()) {
                }
            } finally {
                gk0.J(qgVar, U);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // defpackage.gk
    public final Object m() {
        Object obj = this.k;
        this.k = mv.h;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.i + ", " + bi.d0(this.j) + ']';
    }

    @Override // defpackage.gk
    public final dg g() {
        return this;
    }
}
