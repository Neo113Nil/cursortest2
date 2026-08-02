package g1;

import D0.P;
import I.C0079n;
import I.L;
import P0.l;
import Y0.l0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class b extends Q0.i implements l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2226h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        super(1);
        this.f2224f = i2;
        this.f2225g = obj;
        this.f2226h = obj2;
    }

    @Override // P0.l
    public final Object i(Object obj) {
        Object gVar;
        a1.j jVar;
        F0.h hVar;
        F0.h hVar2;
        switch (this.f2224f) {
            case 0:
                ((c) this.f2226h).getClass();
                ((d) this.f2225g).e(null);
                return F0.h.f469a;
            case 1:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f2229g;
                ((c) this.f2226h).getClass();
                d dVar = (d) this.f2225g;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return F0.h.f469a;
            default:
                Throwable th = (Throwable) obj;
                ((P) this.f2225g).i(th);
                C0079n c0079n = (C0079n) this.f2226h;
                ((a1.b) c0079n.f691g).f(th, false);
                do {
                    a1.b bVar = (a1.b) c0079n.f691g;
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = a1.b.f1292h;
                    long j2 = atomicLongFieldUpdater.get(bVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = a1.b.f1291g;
                    long j3 = atomicLongFieldUpdater2.get(bVar);
                    if (bVar.r(j3, true)) {
                        gVar = new a1.g(bVar.m());
                    } else {
                        long j4 = j3 & 1152921504606846975L;
                        Object obj2 = a1.i.f1326a;
                        if (j2 < j4) {
                            Object obj3 = a1.d.f1313k;
                            a1.j jVar2 = (a1.j) a1.b.f1296l.get(bVar);
                            for (boolean z2 = true; !bVar.r(atomicLongFieldUpdater2.get(bVar), z2); z2 = true) {
                                long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar);
                                long j5 = a1.d.f1304b;
                                Object obj4 = obj2;
                                long j6 = andIncrement / j5;
                                int i2 = (int) (andIncrement % j5);
                                if (jVar2.f2107g != j6) {
                                    a1.j k2 = bVar.k(j6, jVar2);
                                    if (k2 == null) {
                                        continue;
                                        obj2 = obj4;
                                    } else {
                                        jVar = k2;
                                    }
                                } else {
                                    jVar = jVar2;
                                }
                                Object A2 = bVar.A(jVar, i2, andIncrement, obj3);
                                if (A2 == a1.d.f1315m) {
                                    l0 l0Var = obj3 instanceof l0 ? (l0) obj3 : null;
                                    if (l0Var != null) {
                                        l0Var.a(jVar, i2);
                                    }
                                    bVar.C(andIncrement);
                                    jVar.h();
                                    obj2 = obj4;
                                } else if (A2 == a1.d.f1317o) {
                                    if (andIncrement < bVar.p()) {
                                        jVar.a();
                                    }
                                    jVar2 = jVar;
                                    obj2 = obj4;
                                } else {
                                    if (A2 == a1.d.f1316n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    jVar.a();
                                    obj2 = A2;
                                }
                            }
                            gVar = new a1.g(bVar.m());
                        }
                        gVar = obj2;
                    }
                    hVar = null;
                    if (gVar instanceof a1.h) {
                        gVar = null;
                    }
                    hVar2 = F0.h.f469a;
                    if (gVar != null) {
                        L.f554f.h(gVar, th);
                        hVar = hVar2;
                    }
                } while (hVar != null);
                return hVar2;
        }
    }
}
