package z3;

import C3.t;
import C3.u;
import C3.v;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import g3.EnumC0441a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x3.AbstractC1562w;
import x3.C1546f;
import x3.p0;

/* loaded from: classes.dex */
public final class b implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f16294a = e.f16321p;

    /* renamed from: b, reason: collision with root package name */
    public C1546f f16295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f16296c;

    public b(c cVar) {
        this.f16296c = cVar;
    }

    @Override // x3.p0
    public final void a(t tVar, int i4) {
        C1546f c1546f = this.f16295b;
        if (c1546f != null) {
            c1546f.a(tVar, i4);
        }
    }

    public final Object b(A3.f fVar) {
        k kVar;
        Boolean bool;
        k kVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f16302g;
        c cVar = this.f16296c;
        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar);
        while (!cVar.r(c.f16297b.get(cVar), true)) {
            long andIncrement = c.f16298c.getAndIncrement(cVar);
            long j4 = e.f16309b;
            long j5 = andIncrement / j4;
            int i4 = (int) (andIncrement % j4);
            if (kVar3.f318c != j5) {
                kVar = cVar.l(j5, kVar3);
                if (kVar == null) {
                    continue;
                }
            } else {
                kVar = kVar3;
            }
            Object A4 = cVar.A(kVar, i4, andIncrement, null);
            v vVar = e.f16320m;
            if (A4 == vVar) {
                throw new IllegalStateException("unreachable");
            }
            v vVar2 = e.o;
            if (A4 == vVar2) {
                if (andIncrement < cVar.p()) {
                    kVar.a();
                }
                kVar3 = kVar;
            } else {
                if (A4 != e.n) {
                    kVar.a();
                    this.f16294a = A4;
                    return Boolean.TRUE;
                }
                C1546f d4 = AbstractC1562w.d(AbstractC0347t0.m(fVar));
                try {
                    this.f16295b = d4;
                    try {
                        Object A5 = cVar.A(kVar, i4, andIncrement, this);
                        if (A5 == vVar) {
                            a(kVar, i4);
                        } else {
                            if (A5 == vVar2) {
                                if (andIncrement < cVar.p()) {
                                    kVar.a();
                                }
                                k kVar4 = (k) c.f16302g.get(cVar);
                                while (true) {
                                    if (cVar.r(c.f16297b.get(cVar), true)) {
                                        C1546f c1546f = this.f16295b;
                                        kotlin.jvm.internal.i.b(c1546f);
                                        this.f16295b = null;
                                        this.f16294a = e.f16319l;
                                        Throwable m4 = cVar.m();
                                        if (m4 == null) {
                                            c1546f.resumeWith(Boolean.FALSE);
                                        } else {
                                            c1546f.resumeWith(O3.l.h(m4));
                                        }
                                    } else {
                                        long andIncrement2 = c.f16298c.getAndIncrement(cVar);
                                        long j6 = e.f16309b;
                                        long j7 = andIncrement2 / j6;
                                        int i5 = (int) (andIncrement2 % j6);
                                        if (kVar4.f318c != j7) {
                                            kVar2 = cVar.l(j7, kVar4);
                                            if (kVar2 == null) {
                                            }
                                        } else {
                                            kVar2 = kVar4;
                                        }
                                        Object A6 = cVar.A(kVar2, i5, andIncrement2, this);
                                        if (A6 == e.f16320m) {
                                            a(kVar2, i5);
                                            break;
                                        }
                                        if (A6 == e.o) {
                                            if (andIncrement2 < cVar.p()) {
                                                kVar2.a();
                                            }
                                            kVar4 = kVar2;
                                        } else {
                                            if (A6 == e.n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            kVar2.a();
                                            this.f16294a = A6;
                                            this.f16295b = null;
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                }
                            } else {
                                kVar.a();
                                this.f16294a = A5;
                                this.f16295b = null;
                                bool = Boolean.TRUE;
                            }
                            d4.y(bool, null);
                        }
                        Object q4 = d4.q();
                        EnumC0441a enumC0441a = EnumC0441a.f9038a;
                        return q4;
                    } catch (Throwable th) {
                        th = th;
                        d4.x();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        this.f16294a = e.f16319l;
        Throwable m5 = cVar.m();
        if (m5 == null) {
            return Boolean.FALSE;
        }
        int i6 = u.f319a;
        throw m5;
    }
}
