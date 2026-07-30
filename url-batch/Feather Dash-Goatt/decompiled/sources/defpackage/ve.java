package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ve implements yn1 {
    public Object d = ye.p;
    public tf e;
    public final /* synthetic */ we g;

    public ve(we weVar) {
        this.g = weVar;
    }

    @Override // defpackage.yn1
    public final void a(e81 e81Var, int i) {
        tf tfVar = this.e;
        if (tfVar != null) {
            tfVar.a(e81Var, i);
        }
    }

    public final Object b(fn fnVar) {
        pg pgVar;
        Object obj = this.d;
        boolean z = true;
        if (obj == ye.p || obj == ye.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = we.k;
            we weVar = this.g;
            pg pgVar2 = (pg) atomicReferenceFieldUpdater.get(weVar);
            while (true) {
                weVar.getClass();
                if (weVar.y(we.e.get(weVar), true)) {
                    this.d = ye.l;
                    Throwable p = weVar.p();
                    if (p != null) {
                        int i = qc1.a;
                        throw p;
                    }
                    z = false;
                } else {
                    long andIncrement = we.g.getAndIncrement(weVar);
                    long j = ye.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (pgVar2.e != j2) {
                        pgVar = weVar.n(j2, pgVar2);
                        if (pgVar == null) {
                            continue;
                        }
                    } else {
                        pgVar = pgVar2;
                    }
                    Object J = weVar.J(pgVar, i2, andIncrement, null);
                    fv fvVar = ye.m;
                    if (J == fvVar) {
                        dd0.j("unreachable");
                        return null;
                    }
                    fv fvVar2 = ye.o;
                    if (J == fvVar2) {
                        if (andIncrement < weVar.u()) {
                            pgVar.a();
                        }
                        pgVar2 = pgVar;
                    } else {
                        if (J == ye.n) {
                            we weVar2 = this.g;
                            tf z2 = op.z(qa0.b(fnVar));
                            try {
                                this.e = z2;
                                Object J2 = weVar2.J(pgVar, i2, andIncrement, this);
                                if (J2 == fvVar) {
                                    a(pgVar, i2);
                                } else {
                                    if (J2 == fvVar2) {
                                        if (andIncrement < weVar2.u()) {
                                            pgVar.a();
                                        }
                                        pg pgVar3 = (pg) we.k.get(weVar2);
                                        while (true) {
                                            if (weVar2.y(we.e.get(weVar2), true)) {
                                                tf tfVar = this.e;
                                                tfVar.getClass();
                                                this.e = null;
                                                this.d = ye.l;
                                                Throwable p2 = weVar.p();
                                                if (p2 == null) {
                                                    i31 i31Var = k31.d;
                                                    tfVar.l(Boolean.FALSE);
                                                } else {
                                                    i31 i31Var2 = k31.d;
                                                    tfVar.l(new j31(p2));
                                                }
                                            } else {
                                                long andIncrement2 = we.g.getAndIncrement(weVar2);
                                                long j3 = ye.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (pgVar3.e != j4) {
                                                    pg n = weVar2.n(j4, pgVar3);
                                                    if (n != null) {
                                                        pgVar3 = n;
                                                    }
                                                }
                                                Object J3 = weVar2.J(pgVar3, i3, andIncrement2, this);
                                                if (J3 == ye.m) {
                                                    a(pgVar3, i3);
                                                    break;
                                                }
                                                if (J3 == ye.o) {
                                                    if (andIncrement2 < weVar2.u()) {
                                                        pgVar3.a();
                                                    }
                                                } else {
                                                    if (J3 == ye.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    pgVar3.a();
                                                    this.d = J3;
                                                    this.e = null;
                                                }
                                            }
                                        }
                                    } else {
                                        pgVar.a();
                                        this.d = J2;
                                        this.e = null;
                                    }
                                    z2.n(Boolean.TRUE, null);
                                }
                                Object u = z2.u();
                                tn tnVar = tn.d;
                                return u;
                            } catch (Throwable th) {
                                z2.E();
                                throw th;
                            }
                        }
                        pgVar.a();
                        this.d = J;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.d;
        fv fvVar = ye.p;
        if (obj == fvVar) {
            dd0.j("`hasNext()` has not been invoked");
            return null;
        }
        this.d = fvVar;
        if (obj != ye.l) {
            return obj;
        }
        Throwable r = this.g.r();
        int i = qc1.a;
        throw r;
    }
}
