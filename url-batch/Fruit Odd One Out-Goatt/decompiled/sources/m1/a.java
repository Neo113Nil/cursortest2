package m1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.t;
import k1.y0;
import p1.v;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a implements y0 {

    /* renamed from: b, reason: collision with root package name */
    public Object f840b = e.f868p;

    /* renamed from: c, reason: collision with root package name */
    public k1.d f841c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f842d;

    public a(c cVar) {
        this.f842d = cVar;
    }

    @Override // k1.y0
    public final void a(k kVar, int i2) {
        k1.d dVar = this.f841c;
        if (dVar != null) {
            dVar.a(kVar, i2);
        }
    }

    public final Object b(n1.e eVar) {
        k kVar;
        Boolean bool;
        k kVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f848h;
        c cVar = this.f842d;
        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar);
        while (!cVar.o(c.f843c.get(cVar), true)) {
            long andIncrement = c.f844d.getAndIncrement(cVar);
            long j2 = e.f855b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (kVar3.f1075c != j3) {
                kVar = cVar.j(j3, kVar3);
                if (kVar == null) {
                    continue;
                }
            } else {
                kVar = kVar3;
            }
            Object w2 = cVar.w(kVar, i2, andIncrement, null);
            o0.a aVar = e.m;
            if (w2 == aVar) {
                f0.l.b("unreachable");
                return null;
            }
            o0.a aVar2 = e.f867o;
            if (w2 != aVar2) {
                if (w2 != e.f866n) {
                    kVar.a();
                    this.f840b = w2;
                    return Boolean.TRUE;
                }
                k1.d b2 = t.b(a.a.m(eVar));
                try {
                    this.f841c = b2;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    Object w3 = cVar.w(kVar, i2, andIncrement, this);
                    if (w3 == aVar) {
                        a(kVar, i2);
                    } else {
                        if (w3 == aVar2) {
                            if (andIncrement < cVar.m()) {
                                kVar.a();
                            }
                            k kVar4 = (k) c.f848h.get(cVar);
                            while (true) {
                                if (cVar.o(c.f843c.get(cVar), true)) {
                                    k1.d dVar = this.f841c;
                                    dVar.getClass();
                                    this.f841c = null;
                                    this.f840b = e.f865l;
                                    Throwable k2 = cVar.k();
                                    if (k2 == null) {
                                        dVar.f(Boolean.FALSE);
                                    } else {
                                        dVar.f(new t0.c(k2));
                                    }
                                } else {
                                    long andIncrement2 = c.f844d.getAndIncrement(cVar);
                                    long j4 = e.f855b;
                                    long j5 = andIncrement2 / j4;
                                    int i3 = (int) (andIncrement2 % j4);
                                    if (kVar4.f1075c != j5) {
                                        kVar2 = cVar.j(j5, kVar4);
                                        if (kVar2 == null) {
                                        }
                                    } else {
                                        kVar2 = kVar4;
                                    }
                                    Object w4 = cVar.w(kVar2, i3, andIncrement2, this);
                                    if (w4 == e.m) {
                                        a(kVar2, i3);
                                        break;
                                    }
                                    if (w4 == e.f867o) {
                                        if (andIncrement2 < cVar.m()) {
                                            kVar2.a();
                                        }
                                        kVar4 = kVar2;
                                    } else {
                                        if (w4 == e.f866n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar2.a();
                                        this.f840b = w4;
                                        this.f841c = null;
                                        bool = Boolean.TRUE;
                                    }
                                }
                            }
                        } else {
                            kVar.a();
                            this.f840b = w3;
                            this.f841c = null;
                            bool = Boolean.TRUE;
                        }
                        b2.v(bool, b2.f731d, null);
                    }
                    return b2.p();
                } catch (Throwable th2) {
                    th = th2;
                    b2.u();
                    throw th;
                }
            }
            if (andIncrement < cVar.m()) {
                kVar.a();
            }
            kVar3 = kVar;
        }
        this.f840b = e.f865l;
        Throwable k3 = cVar.k();
        if (k3 == null) {
            return Boolean.FALSE;
        }
        int i4 = v.f1076a;
        throw k3;
    }
}
