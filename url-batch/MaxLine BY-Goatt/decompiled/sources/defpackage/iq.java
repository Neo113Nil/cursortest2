package defpackage;

import defpackage.aa2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class iq implements g63 {
    public Object m = nq.p;
    public fs n;
    public final /* synthetic */ lq o;

    public iq(lq lqVar) {
        this.o = lqVar;
    }

    @Override // defpackage.g63
    public final void a(vg2 vg2Var, int i) {
        fs fsVar = this.n;
        if (fsVar != null) {
            fsVar.a(vg2Var, i);
        }
    }

    public final Object b(r30 r30Var) {
        tt ttVar;
        Object obj = this.m;
        boolean z = true;
        if (obj == nq.p || obj == nq.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = lq.s;
            lq lqVar = this.o;
            tt ttVar2 = (tt) atomicReferenceFieldUpdater.get(lqVar);
            while (true) {
                if (lqVar.A()) {
                    this.m = nq.l;
                    Throwable s = lqVar.s();
                    if (s != null) {
                        int i = ho2.a;
                        throw s;
                    }
                    z = false;
                } else {
                    long andIncrement = lq.o.getAndIncrement(lqVar);
                    long j = nq.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (ttVar2.e != j2) {
                        ttVar = lqVar.q(j2, ttVar2);
                        if (ttVar == null) {
                            continue;
                        }
                    } else {
                        ttVar = ttVar2;
                    }
                    Object N = lqVar.N(ttVar, i2, andIncrement, null);
                    ng0 ng0Var = nq.m;
                    if (N == ng0Var) {
                        lh.g("unreachable");
                        return null;
                    }
                    ng0 ng0Var2 = nq.o;
                    if (N == ng0Var2) {
                        if (andIncrement < lqVar.v()) {
                            ttVar.a();
                        }
                        ttVar2 = ttVar;
                    } else {
                        if (N == nq.n) {
                            lq lqVar2 = this.o;
                            fs I = ll3.I(q41.b(r30Var));
                            try {
                                this.n = I;
                                Object N2 = lqVar2.N(ttVar, i2, andIncrement, this);
                                if (N2 == ng0Var) {
                                    a(ttVar, i2);
                                } else {
                                    if (N2 == ng0Var2) {
                                        if (andIncrement < lqVar2.v()) {
                                            ttVar.a();
                                        }
                                        tt ttVar3 = (tt) lq.s.get(lqVar2);
                                        while (true) {
                                            if (lqVar2.A()) {
                                                fs fsVar = this.n;
                                                fsVar.getClass();
                                                this.n = null;
                                                this.m = nq.l;
                                                Throwable s2 = lqVar.s();
                                                if (s2 == null) {
                                                    aa2.a aVar = aa2.m;
                                                    fsVar.resumeWith(Boolean.FALSE);
                                                } else {
                                                    aa2.a aVar2 = aa2.m;
                                                    fsVar.resumeWith(new ba2(s2));
                                                }
                                            } else {
                                                long andIncrement2 = lq.o.getAndIncrement(lqVar2);
                                                long j3 = nq.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (ttVar3.e != j4) {
                                                    tt q = lqVar2.q(j4, ttVar3);
                                                    if (q != null) {
                                                        ttVar3 = q;
                                                    }
                                                }
                                                Object N3 = lqVar2.N(ttVar3, i3, andIncrement2, this);
                                                if (N3 == nq.m) {
                                                    a(ttVar3, i3);
                                                    break;
                                                }
                                                if (N3 == nq.o) {
                                                    if (andIncrement2 < lqVar2.v()) {
                                                        ttVar3.a();
                                                    }
                                                } else {
                                                    if (N3 == nq.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    ttVar3.a();
                                                    this.m = N3;
                                                    this.n = null;
                                                }
                                            }
                                        }
                                    } else {
                                        ttVar.a();
                                        this.m = N2;
                                        this.n = null;
                                    }
                                    I.c(Boolean.TRUE, null);
                                }
                                Object s3 = I.s();
                                b50 b50Var = b50.m;
                                return s3;
                            } catch (Throwable th) {
                                I.B();
                                throw th;
                            }
                        }
                        ttVar.a();
                        this.m = N;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.m;
        ng0 ng0Var = nq.p;
        if (obj == ng0Var) {
            lh.g("`hasNext()` has not been invoked");
            return null;
        }
        this.m = ng0Var;
        if (obj != nq.l) {
            return obj;
        }
        Throwable t = this.o.t();
        int i = ho2.a;
        throw t;
    }
}
