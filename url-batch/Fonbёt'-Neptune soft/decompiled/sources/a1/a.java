package a1;

import Y0.AbstractC0127v;
import Y0.C0112f;
import Y0.l0;
import d1.v;
import d1.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a implements l0 {

    /* renamed from: e, reason: collision with root package name */
    public Object f1288e = d.f1318p;

    /* renamed from: f, reason: collision with root package name */
    public C0112f f1289f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f1290g;

    public a(b bVar) {
        this.f1290g = bVar;
    }

    @Override // Y0.l0
    public final void a(v vVar, int i2) {
        C0112f c0112f = this.f1289f;
        if (c0112f != null) {
            c0112f.a(vVar, i2);
        }
    }

    public final Object b(b1.f fVar) {
        C0112f c0112f;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f1296l;
        b bVar = this.f1290g;
        j jVar = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            if (bVar.r(b.f1291g.get(bVar), true)) {
                this.f1288e = d.f1314l;
                Throwable m2 = bVar.m();
                if (m2 == null) {
                    return Boolean.FALSE;
                }
                int i2 = w.f2108a;
                throw m2;
            }
            long andIncrement = b.f1292h.getAndIncrement(bVar);
            long j2 = d.f1304b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (jVar.f2107g != j3) {
                j k2 = bVar.k(j3, jVar);
                if (k2 == null) {
                    continue;
                } else {
                    jVar = k2;
                }
            }
            Object A2 = bVar.A(jVar, i3, andIncrement, null);
            B.m mVar = d.f1315m;
            if (A2 == mVar) {
                throw new IllegalStateException("unreachable");
            }
            B.m mVar2 = d.f1317o;
            if (A2 == mVar2) {
                if (andIncrement < bVar.p()) {
                    jVar.a();
                }
            } else {
                if (A2 != d.f1316n) {
                    jVar.a();
                    this.f1288e = A2;
                    return Boolean.TRUE;
                }
                b bVar2 = this.f1290g;
                C0112f c2 = AbstractC0127v.c(i1.a.t(fVar));
                try {
                    this.f1289f = c2;
                    c0112f = c2;
                    try {
                        Object A3 = bVar2.A(jVar, i3, andIncrement, this);
                        if (A3 == mVar) {
                            a(jVar, i3);
                        } else {
                            d1.q qVar = null;
                            H0.i iVar = c0112f.f1205i;
                            P0.l lVar = bVar2.f1301f;
                            if (A3 == mVar2) {
                                if (andIncrement < bVar2.p()) {
                                    jVar.a();
                                }
                                j jVar2 = (j) b.f1296l.get(bVar2);
                                while (true) {
                                    if (bVar2.r(b.f1291g.get(bVar2), true)) {
                                        C0112f c0112f2 = this.f1289f;
                                        Q0.h.b(c0112f2);
                                        this.f1289f = null;
                                        this.f1288e = d.f1314l;
                                        Throwable m3 = bVar.m();
                                        if (m3 == null) {
                                            c0112f2.j(Boolean.FALSE);
                                        } else {
                                            c0112f2.j(i1.a.b(m3));
                                        }
                                    } else {
                                        long andIncrement2 = b.f1292h.getAndIncrement(bVar2);
                                        long j4 = d.f1304b;
                                        long j5 = andIncrement2 / j4;
                                        int i4 = (int) (andIncrement2 % j4);
                                        if (jVar2.f2107g != j5) {
                                            j k3 = bVar2.k(j5, jVar2);
                                            if (k3 != null) {
                                                jVar2 = k3;
                                            }
                                        }
                                        P0.l lVar2 = lVar;
                                        Object A4 = bVar2.A(jVar2, i4, andIncrement2, this);
                                        if (A4 == d.f1315m) {
                                            a(jVar2, i4);
                                            break;
                                        }
                                        if (A4 == d.f1317o) {
                                            if (andIncrement2 < bVar2.p()) {
                                                jVar2.a();
                                            }
                                            lVar = lVar2;
                                        } else {
                                            if (A4 == d.f1316n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            jVar2.a();
                                            this.f1288e = A4;
                                            this.f1289f = null;
                                            bool = Boolean.TRUE;
                                            if (lVar2 != null) {
                                                qVar = new d1.q(lVar2, A4, iVar);
                                            }
                                        }
                                    }
                                }
                            } else {
                                jVar.a();
                                this.f1288e = A3;
                                this.f1289f = null;
                                bool = Boolean.TRUE;
                                if (lVar != null) {
                                    qVar = new d1.q(lVar, A3, iVar);
                                }
                            }
                            c0112f.o(bool, qVar);
                        }
                        return c0112f.u();
                    } catch (Throwable th) {
                        th = th;
                        c0112f.B();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0112f = c2;
                }
            }
        }
    }
}
