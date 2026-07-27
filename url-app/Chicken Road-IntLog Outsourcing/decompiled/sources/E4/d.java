package E4;

import B0.i;
import D4.x0;
import F4.g;
import F4.h;
import F4.o;
import M.L;
import f4.v;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class d extends j implements InterfaceC1441l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f655f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f656g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, int i2, Object obj2) {
        super(1);
        this.f654e = i2;
        this.f655f = obj;
        this.f656g = obj2;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        Object gVar;
        F4.j jVar;
        v vVar;
        v vVar2;
        switch (this.f654e) {
            case 0:
                ((e) this.f655f).f657c.removeCallbacks((A0.a) this.f656g);
                return v.f5689a;
            default:
                Throwable th = (Throwable) obj;
                ((o) this.f655f).invoke(th);
                i iVar = (i) this.f656g;
                ((F4.b) iVar.f155d).g(th, false);
                do {
                    F4.b bVar = (F4.b) iVar.f155d;
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = F4.b.f695d;
                    long j2 = atomicLongFieldUpdater.get(bVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = F4.b.f694c;
                    long j6 = atomicLongFieldUpdater2.get(bVar);
                    if (bVar.s(j6, true)) {
                        gVar = new g(bVar.n());
                    } else {
                        long j7 = j6 & 1152921504606846975L;
                        Object obj2 = F4.i.f729a;
                        if (j2 < j7) {
                            Object obj3 = F4.d.f716k;
                            F4.j jVar2 = (F4.j) F4.b.f699h.get(bVar);
                            for (boolean z = true; !bVar.s(atomicLongFieldUpdater2.get(bVar), z); z = true) {
                                long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar);
                                long j8 = F4.d.f707b;
                                Object obj4 = obj2;
                                long j9 = andIncrement / j8;
                                int i2 = (int) (andIncrement % j8);
                                if (jVar2.f1323c != j9) {
                                    F4.j m6 = bVar.m(j9, jVar2);
                                    if (m6 == null) {
                                        continue;
                                        obj2 = obj4;
                                    } else {
                                        jVar = m6;
                                    }
                                } else {
                                    jVar = jVar2;
                                }
                                Object B5 = bVar.B(jVar, i2, andIncrement, obj3);
                                if (B5 == F4.d.f718m) {
                                    x0 x0Var = obj3 instanceof x0 ? (x0) obj3 : null;
                                    if (x0Var != null) {
                                        x0Var.a(jVar, i2);
                                    }
                                    bVar.D(andIncrement);
                                    jVar.h();
                                    obj2 = obj4;
                                } else if (B5 == F4.d.f720o) {
                                    if (andIncrement < bVar.q()) {
                                        jVar.a();
                                    }
                                    jVar2 = jVar;
                                    obj2 = obj4;
                                } else {
                                    if (B5 == F4.d.f719n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    jVar.a();
                                    obj2 = B5;
                                }
                            }
                            gVar = new g(bVar.n());
                        }
                        gVar = obj2;
                    }
                    vVar = null;
                    if (gVar instanceof h) {
                        gVar = null;
                    }
                    vVar2 = v.f5689a;
                    if (gVar != null) {
                        L.f1598e.invoke(gVar, th);
                        vVar = vVar2;
                    }
                } while (vVar != null);
                return vVar2;
        }
    }
}
