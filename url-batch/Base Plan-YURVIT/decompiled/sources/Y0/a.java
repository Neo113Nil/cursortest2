package Y0;

import B0.E;
import W0.AbstractC0081v;
import W0.C0066f;
import W0.l0;
import a.AbstractC0086a;
import b1.v;
import b1.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a implements l0 {

    /* renamed from: e, reason: collision with root package name */
    public Object f1005e = d.f1034p;

    /* renamed from: f, reason: collision with root package name */
    public C0066f f1006f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f1007g;

    public a(b bVar) {
        this.f1007g = bVar;
    }

    @Override // W0.l0
    public final void a(v vVar, int i2) {
        C0066f c0066f = this.f1006f;
        if (c0066f != null) {
            c0066f.a(vVar, i2);
        }
    }

    public final Object b(Z0.f fVar) {
        j jVar;
        Boolean bool;
        j jVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f1013k;
        b bVar = this.f1007g;
        j jVar3 = (j) atomicReferenceFieldUpdater.get(bVar);
        while (!bVar.r(b.f1008f.get(bVar), true)) {
            long andIncrement = b.f1009g.getAndIncrement(bVar);
            long j2 = d.f1020b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (jVar3.f1777g != j3) {
                jVar = bVar.j(j3, jVar3);
                if (jVar == null) {
                    continue;
                }
            } else {
                jVar = jVar3;
            }
            Object A2 = bVar.A(jVar, i2, andIncrement, null);
            E e2 = d.f1031m;
            if (A2 == e2) {
                throw new IllegalStateException("unreachable");
            }
            E e3 = d.f1033o;
            if (A2 == e3) {
                if (andIncrement < bVar.p()) {
                    jVar.a();
                }
                jVar3 = jVar;
            } else {
                if (A2 != d.f1032n) {
                    jVar.a();
                    this.f1005e = A2;
                    return Boolean.TRUE;
                }
                C0066f c2 = AbstractC0081v.c(AbstractC0086a.v(fVar));
                try {
                    this.f1006f = c2;
                    try {
                        Object A3 = bVar.A(jVar, i2, andIncrement, this);
                        if (A3 == e2) {
                            a(jVar, i2);
                        } else {
                            if (A3 == e3) {
                                if (andIncrement < bVar.p()) {
                                    jVar.a();
                                }
                                j jVar4 = (j) b.f1013k.get(bVar);
                                while (true) {
                                    if (bVar.r(b.f1008f.get(bVar), true)) {
                                        C0066f c0066f = this.f1006f;
                                        P0.h.b(c0066f);
                                        this.f1006f = null;
                                        this.f1005e = d.f1030l;
                                        Throwable m2 = bVar.m();
                                        if (m2 == null) {
                                            c0066f.g(Boolean.FALSE);
                                        } else {
                                            c0066f.g(AbstractC0086a.l(m2));
                                        }
                                    } else {
                                        long andIncrement2 = b.f1009g.getAndIncrement(bVar);
                                        long j4 = d.f1020b;
                                        long j5 = andIncrement2 / j4;
                                        int i3 = (int) (andIncrement2 % j4);
                                        if (jVar4.f1777g != j5) {
                                            jVar2 = bVar.j(j5, jVar4);
                                            if (jVar2 == null) {
                                            }
                                        } else {
                                            jVar2 = jVar4;
                                        }
                                        Object A4 = bVar.A(jVar2, i3, andIncrement2, this);
                                        if (A4 == d.f1031m) {
                                            a(jVar2, i3);
                                            break;
                                        }
                                        if (A4 == d.f1033o) {
                                            if (andIncrement2 < bVar.p()) {
                                                jVar2.a();
                                            }
                                            jVar4 = jVar2;
                                        } else {
                                            if (A4 == d.f1032n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            jVar2.a();
                                            this.f1005e = A4;
                                            this.f1006f = null;
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                }
                            } else {
                                jVar.a();
                                this.f1005e = A3;
                                this.f1006f = null;
                                bool = Boolean.TRUE;
                            }
                            c2.B(bool, null);
                        }
                        return c2.t();
                    } catch (Throwable th) {
                        th = th;
                        c2.A();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        this.f1005e = d.f1030l;
        Throwable m3 = bVar.m();
        if (m3 == null) {
            return Boolean.FALSE;
        }
        int i4 = w.f1778a;
        throw m3;
    }
}
