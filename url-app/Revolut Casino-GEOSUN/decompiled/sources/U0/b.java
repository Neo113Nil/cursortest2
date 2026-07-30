package U0;

import D.C0013n;
import D.M;
import D.N;
import E0.l;
import M0.l0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u0.C0247g;

/* loaded from: classes.dex */
public final class b extends F0.j implements l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1027g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1028h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, Object obj, Object obj2) {
        super(1);
        this.f1026f = i2;
        this.f1027g = obj;
        this.f1028h = obj2;
    }

    @Override // E0.l
    public final Object i(Object obj) {
        Object gVar;
        O0.j jVar;
        C0247g c0247g;
        C0247g c0247g2;
        switch (this.f1026f) {
            case 0:
                ((c) this.f1028h).getClass();
                ((d) this.f1027g).e(null);
                return C0247g.f3005a;
            case 1:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1031g;
                ((c) this.f1028h).getClass();
                d dVar = (d) this.f1027g;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return C0247g.f3005a;
            default:
                Throwable th = (Throwable) obj;
                ((M) this.f1027g).i(th);
                C0013n c0013n = (C0013n) this.f1028h;
                ((O0.b) c0013n.f246c).g(th, false);
                do {
                    O0.b bVar = (O0.b) c0013n.f246c;
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = O0.b.f709h;
                    long j2 = atomicLongFieldUpdater.get(bVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = O0.b.f708g;
                    long j3 = atomicLongFieldUpdater2.get(bVar);
                    if (bVar.r(j3, true)) {
                        gVar = new O0.g(bVar.m());
                    } else {
                        long j4 = j3 & 1152921504606846975L;
                        Object obj2 = O0.i.f742a;
                        if (j2 < j4) {
                            Object obj3 = O0.d.f730k;
                            O0.j jVar2 = (O0.j) O0.b.f713l.get(bVar);
                            for (boolean z2 = true; !bVar.r(atomicLongFieldUpdater2.get(bVar), z2); z2 = true) {
                                long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar);
                                long j5 = O0.d.f721b;
                                Object obj4 = obj2;
                                long j6 = andIncrement / j5;
                                int i2 = (int) (andIncrement % j5);
                                if (jVar2.f938g != j6) {
                                    O0.j k2 = bVar.k(j6, jVar2);
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
                                if (A2 == O0.d.f732m) {
                                    l0 l0Var = obj3 instanceof l0 ? (l0) obj3 : null;
                                    if (l0Var != null) {
                                        l0Var.a(jVar, i2);
                                    }
                                    bVar.C(andIncrement);
                                    jVar.h();
                                    obj2 = obj4;
                                } else if (A2 == O0.d.f734o) {
                                    if (andIncrement < bVar.p()) {
                                        jVar.a();
                                    }
                                    jVar2 = jVar;
                                    obj2 = obj4;
                                } else {
                                    if (A2 == O0.d.f733n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    jVar.a();
                                    obj2 = A2;
                                }
                            }
                            gVar = new O0.g(bVar.m());
                        }
                        gVar = obj2;
                    }
                    c0247g = null;
                    if (gVar instanceof O0.h) {
                        gVar = null;
                    }
                    c0247g2 = C0247g.f3005a;
                    if (gVar != null) {
                        N.f111f.f(gVar, th);
                        c0247g = c0247g2;
                    }
                } while (c0247g != null);
                return c0247g2;
        }
    }
}
