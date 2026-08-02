package v2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C1148j;
import t2.AbstractC1212w;
import t2.C1196f;
import t2.p0;
import y2.t;
import y2.u;

/* loaded from: classes.dex */
public final class b implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f10575a = e.f10601p;

    /* renamed from: b, reason: collision with root package name */
    public C1196f f10576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f10577c;

    public b(c cVar) {
        this.f10577c = cVar;
    }

    @Override // t2.p0
    public final void a(t tVar, int i3) {
        C1196f c1196f = this.f10576b;
        if (c1196f != null) {
            c1196f.a(tVar, i3);
        }
    }

    public final Object b(w2.f fVar) {
        k kVar;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f10582g;
        c cVar = this.f10577c;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            cVar.getClass();
            if (cVar.r(c.f10578b.get(cVar), true)) {
                this.f10575a = e.f10598l;
                Throwable m3 = cVar.m();
                if (m3 == null) {
                    return Boolean.FALSE;
                }
                int i3 = u.f10867a;
                throw m3;
            }
            long andIncrement = c.f10579c.getAndIncrement(cVar);
            long j3 = e.f10589b;
            long j4 = andIncrement / j3;
            int i4 = (int) (andIncrement % j3);
            if (kVar2.f10866c != j4) {
                kVar = cVar.l(j4, kVar2);
                if (kVar == null) {
                    continue;
                }
            } else {
                kVar = kVar2;
            }
            Object A3 = cVar.A(kVar, i4, andIncrement, null);
            C1148j c1148j = e.f10599m;
            if (A3 == c1148j) {
                throw new IllegalStateException("unreachable");
            }
            C1148j c1148j2 = e.o;
            if (A3 != c1148j2) {
                if (A3 != e.f10600n) {
                    kVar.a();
                    this.f10575a = A3;
                    return Boolean.TRUE;
                }
                c cVar2 = this.f10577c;
                C1196f d3 = AbstractC1212w.d(C2.b.x(fVar));
                try {
                    this.f10576b = d3;
                    Object A4 = cVar2.A(kVar, i4, andIncrement, this);
                    if (A4 == c1148j) {
                        a(kVar, i4);
                    } else {
                        if (A4 == c1148j2) {
                            if (andIncrement < cVar2.p()) {
                                kVar.a();
                            }
                            k kVar3 = (k) c.f10582g.get(cVar2);
                            while (true) {
                                if (cVar2.r(c.f10578b.get(cVar2), true)) {
                                    C1196f c1196f = this.f10576b;
                                    kotlin.jvm.internal.j.b(c1196f);
                                    this.f10576b = null;
                                    this.f10575a = e.f10598l;
                                    Throwable m4 = cVar.m();
                                    if (m4 == null) {
                                        c1196f.f(Boolean.FALSE);
                                    } else {
                                        c1196f.f(android.support.v4.media.session.a.k(m4));
                                    }
                                } else {
                                    long andIncrement2 = c.f10579c.getAndIncrement(cVar2);
                                    long j5 = e.f10589b;
                                    long j6 = andIncrement2 / j5;
                                    int i5 = (int) (andIncrement2 % j5);
                                    if (kVar3.f10866c != j6) {
                                        k l3 = cVar2.l(j6, kVar3);
                                        if (l3 != null) {
                                            kVar3 = l3;
                                        }
                                    }
                                    Object A5 = cVar2.A(kVar3, i5, andIncrement2, this);
                                    if (A5 == e.f10599m) {
                                        a(kVar3, i5);
                                        break;
                                    }
                                    if (A5 == e.o) {
                                        if (andIncrement2 < cVar2.p()) {
                                            kVar3.a();
                                        }
                                    } else {
                                        if (A5 == e.f10600n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar3.a();
                                        this.f10575a = A5;
                                        this.f10576b = null;
                                        bool = Boolean.TRUE;
                                    }
                                }
                            }
                        } else {
                            kVar.a();
                            this.f10575a = A4;
                            this.f10576b = null;
                            bool = Boolean.TRUE;
                        }
                        d3.A(bool, null);
                    }
                    return d3.s();
                } catch (Throwable th) {
                    d3.z();
                    throw th;
                }
            }
            if (andIncrement < cVar.p()) {
                kVar.a();
            }
            kVar2 = kVar;
        }
    }
}
