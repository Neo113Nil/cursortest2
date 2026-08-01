package m0;

import a.AbstractC0016a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.AbstractC0058t;
import k0.C0044e;
import k0.d0;
import p0.w;

/* loaded from: classes.dex */
public final class a implements d0 {

    /* renamed from: b, reason: collision with root package name */
    public Object f1029b = e.f1059p;

    /* renamed from: c, reason: collision with root package name */
    public C0044e f1030c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f1031d;

    public a(c cVar) {
        this.f1031d = cVar;
    }

    @Override // k0.d0
    public final void a(k kVar, int i2) {
        C0044e c0044e = this.f1030c;
        if (c0044e != null) {
            c0044e.a(kVar, i2);
        }
    }

    public final Object b(n0.e eVar) {
        C0044e c0044e;
        p0.q qVar;
        Boolean bool;
        int i2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f1037i;
        c cVar = this.f1031d;
        k kVar = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            cVar.getClass();
            if (cVar.o(c.f1032d.get(cVar), true)) {
                this.f1029b = e.f1055l;
                Throwable k2 = cVar.k();
                if (k2 == null) {
                    return Boolean.FALSE;
                }
                int i3 = w.f1180a;
                throw k2;
            }
            long andIncrement = c.f1033e.getAndIncrement(cVar);
            long j2 = e.f1045b;
            long j3 = andIncrement / j2;
            int i4 = (int) (andIncrement % j2);
            if (kVar.f1179c != j3) {
                k j4 = cVar.j(j3, kVar);
                if (j4 == null) {
                    continue;
                } else {
                    kVar = j4;
                }
            }
            Object w2 = cVar.w(kVar, i4, andIncrement, null);
            io.flutter.plugin.editing.a aVar = e.f1056m;
            if (w2 == aVar) {
                throw new IllegalStateException("unreachable");
            }
            io.flutter.plugin.editing.a aVar2 = e.f1058o;
            if (w2 != aVar2) {
                if (w2 != e.f1057n) {
                    kVar.a();
                    this.f1029b = w2;
                    return Boolean.TRUE;
                }
                c cVar2 = this.f1031d;
                C0044e b2 = AbstractC0058t.b(AbstractC0016a.t(eVar));
                try {
                    this.f1030c = b2;
                    c0044e = b2;
                } catch (Throwable th) {
                    th = th;
                    c0044e = b2;
                }
                try {
                    Object w3 = cVar2.w(kVar, i4, andIncrement, this);
                    if (w3 == aVar) {
                        a(kVar, i4);
                    } else {
                        W.i iVar = c0044e.f916f;
                        d0.l lVar = cVar2.f1042c;
                        if (w3 == aVar2) {
                            if (andIncrement < cVar2.m()) {
                                kVar.a();
                            }
                            k kVar2 = (k) c.f1037i.get(cVar2);
                            while (true) {
                                if (cVar2.o(c.f1032d.get(cVar2), true)) {
                                    C0044e c0044e2 = this.f1030c;
                                    e0.h.b(c0044e2);
                                    this.f1030c = null;
                                    this.f1029b = e.f1055l;
                                    Throwable k3 = cVar.k();
                                    if (k3 == null) {
                                        c0044e2.d(Boolean.FALSE);
                                    } else {
                                        c0044e2.d(AbstractC0016a.h(k3));
                                    }
                                } else {
                                    long andIncrement2 = c.f1033e.getAndIncrement(cVar2);
                                    long j5 = e.f1045b;
                                    long j6 = andIncrement2 / j5;
                                    int i5 = (int) (andIncrement2 % j5);
                                    if (kVar2.f1179c != j6) {
                                        k j7 = cVar2.j(j6, kVar2);
                                        if (j7 != null) {
                                            kVar2 = j7;
                                        }
                                    }
                                    d0.l lVar2 = lVar;
                                    Object w4 = cVar2.w(kVar2, i5, andIncrement2, this);
                                    if (w4 == e.f1056m) {
                                        a(kVar2, i5);
                                        break;
                                    }
                                    if (w4 == e.f1058o) {
                                        if (andIncrement2 < cVar2.m()) {
                                            kVar2.a();
                                        }
                                        lVar = lVar2;
                                    } else {
                                        if (w4 == e.f1057n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar2.a();
                                        this.f1029b = w4;
                                        this.f1030c = null;
                                        qVar = lVar2 != null ? new p0.q(lVar2, w4, iVar) : null;
                                        bool = Boolean.TRUE;
                                        i2 = c0044e.f949d;
                                    }
                                }
                            }
                        } else {
                            kVar.a();
                            this.f1029b = w3;
                            this.f1030c = null;
                            qVar = lVar != null ? new p0.q(lVar, w3, iVar) : null;
                            bool = Boolean.TRUE;
                            i2 = c0044e.f949d;
                        }
                        c0044e.v(bool, i2, qVar);
                    }
                    return c0044e.p();
                } catch (Throwable th2) {
                    th = th2;
                    c0044e.u();
                    throw th;
                }
            }
            if (andIncrement < cVar.m()) {
                kVar.a();
            }
        }
    }
}
