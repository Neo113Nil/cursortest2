package F;

import W0.C0074n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public final class f0 extends P0.i implements O0.l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L f357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0032n f358g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(L l2, C0032n c0032n) {
        super(1);
        this.f357f = l2;
        this.f358g = c0032n;
    }

    @Override // O0.l
    public final Object j(Object obj) {
        Object gVar;
        D0.h hVar;
        D0.h hVar2;
        Throwable th = (Throwable) obj;
        this.f357f.j(th);
        Y0.b bVar = (Y0.b) this.f358g.f411c;
        bVar.f(th, false);
        do {
            bVar.getClass();
            AtomicLongFieldUpdater atomicLongFieldUpdater = Y0.b.f1009g;
            long j2 = atomicLongFieldUpdater.get(bVar);
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = Y0.b.f1008f;
            long j3 = atomicLongFieldUpdater2.get(bVar);
            boolean z2 = true;
            if (bVar.r(j3, true)) {
                gVar = new Y0.g(bVar.m());
            } else {
                long j4 = j3 & 1152921504606846975L;
                Y0.h hVar3 = Y0.i.f1042a;
                if (j2 >= j4) {
                    gVar = hVar3;
                } else {
                    Object obj2 = Y0.d.f1029k;
                    Y0.j jVar = (Y0.j) Y0.b.f1013k.get(bVar);
                    while (true) {
                        if (bVar.r(atomicLongFieldUpdater2.get(bVar), z2)) {
                            gVar = new Y0.g(bVar.m());
                            break;
                        }
                        long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar);
                        long j5 = Y0.d.f1020b;
                        Y0.h hVar4 = hVar3;
                        long j6 = andIncrement / j5;
                        int i2 = (int) (andIncrement % j5);
                        if (jVar.f1777g != j6) {
                            Y0.j j7 = bVar.j(j6, jVar);
                            if (j7 == null) {
                                continue;
                                hVar3 = hVar4;
                                z2 = true;
                            } else {
                                jVar = j7;
                            }
                        }
                        Object A2 = bVar.A(jVar, i2, andIncrement, obj2);
                        if (A2 == Y0.d.f1031m) {
                            W0.l0 l0Var = obj2 instanceof W0.l0 ? (W0.l0) obj2 : null;
                            if (l0Var != null) {
                                l0Var.a(jVar, i2);
                            }
                            bVar.C(andIncrement);
                            jVar.h();
                            gVar = hVar4;
                        } else if (A2 == Y0.d.f1033o) {
                            if (andIncrement < bVar.p()) {
                                jVar.a();
                            }
                            hVar3 = hVar4;
                            z2 = true;
                        } else {
                            if (A2 == Y0.d.f1032n) {
                                throw new IllegalStateException("unexpected");
                            }
                            jVar.a();
                            gVar = A2;
                        }
                    }
                }
            }
            hVar = null;
            if (gVar instanceof Y0.h) {
                gVar = null;
            }
            hVar2 = D0.h.f206a;
            if (gVar != null) {
                ((c0) gVar).f339b.J(new C0074n(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th, false));
                hVar = hVar2;
            }
        } while (hVar != null);
        return hVar2;
    }
}
