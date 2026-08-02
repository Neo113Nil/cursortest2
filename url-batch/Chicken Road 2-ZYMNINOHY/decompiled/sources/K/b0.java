package K;

import c3.C0297i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import o3.InterfaceC1339l;
import x3.C1552l;
import x3.C1554n;
import x3.p0;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.j implements InterfaceC1339l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F3.g f1331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ G1.c f1332f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(F3.g gVar, G1.c cVar) {
        super(1);
        this.f1331e = gVar;
        this.f1332f = cVar;
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        Object hVar;
        C0297i c0297i;
        C0297i c0297i2;
        Throwable th = (Throwable) obj;
        this.f1331e.invoke(th);
        z3.c cVar = (z3.c) this.f1332f.f837d;
        cVar.g(th, false);
        do {
            cVar.getClass();
            AtomicLongFieldUpdater atomicLongFieldUpdater = z3.c.f16298c;
            long j4 = atomicLongFieldUpdater.get(cVar);
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = z3.c.f16297b;
            long j5 = atomicLongFieldUpdater2.get(cVar);
            if (cVar.r(j5, true)) {
                hVar = new z3.h(cVar.m());
            } else {
                long j6 = j5 & 1152921504606846975L;
                z3.i iVar = z3.j.f16329a;
                if (j4 < j6) {
                    Object obj2 = z3.e.f16318k;
                    z3.k kVar = (z3.k) z3.c.f16302g.get(cVar);
                    while (true) {
                        if (cVar.r(atomicLongFieldUpdater2.get(cVar), true)) {
                            hVar = new z3.h(cVar.m());
                            break;
                        }
                        long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                        long j7 = z3.e.f16309b;
                        long j8 = andIncrement / j7;
                        int i4 = (int) (andIncrement % j7);
                        if (kVar.f318c != j8) {
                            z3.k l4 = cVar.l(j8, kVar);
                            if (l4 == null) {
                                continue;
                            } else {
                                kVar = l4;
                            }
                        }
                        Object A4 = cVar.A(kVar, i4, andIncrement, obj2);
                        if (A4 == z3.e.f16320m) {
                            p0 p0Var = obj2 instanceof p0 ? (p0) obj2 : null;
                            if (p0Var != null) {
                                p0Var.a(kVar, i4);
                            }
                            cVar.C(andIncrement);
                            kVar.h();
                        } else if (A4 == z3.e.o) {
                            if (andIncrement < cVar.p()) {
                                kVar.a();
                            }
                        } else {
                            if (A4 == z3.e.n) {
                                throw new IllegalStateException("unexpected");
                            }
                            kVar.a();
                            hVar = A4;
                        }
                    }
                }
                hVar = iVar;
            }
            c0297i = null;
            if (hVar instanceof z3.i) {
                hVar = null;
            }
            c0297i2 = C0297i.f5732a;
            if (hVar != null) {
                C1552l c1552l = ((Y) hVar).f1322b;
                Throwable cancellationException = th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th;
                c1552l.getClass();
                c1552l.G(new C1554n(cancellationException, false));
                c0297i = c0297i2;
            }
        } while (c0297i != null);
        return c0297i2;
    }
}
