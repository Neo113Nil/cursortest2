package m0;

import k0.d0;
import n.InterfaceC0079f;

/* loaded from: classes.dex */
public final class n extends c {

    /* renamed from: m, reason: collision with root package name */
    public final int f1027m;

    public n(int i2, int i3, d0.l lVar) {
        super(i2, lVar);
        this.f1027m = i3;
        if (i3 == 1) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + e0.l.a(c.class).b() + " instead").toString());
        }
        if (i2 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i2 + " was specified").toString());
    }

    @Override // m0.c, m0.t
    public final Object h(Object obj) {
        k kVar;
        U.g gVar = U.g.f378a;
        if (this.f1027m == 3) {
            Object h2 = super.h(obj);
            return (!(h2 instanceof i) || (h2 instanceof h)) ? h2 : gVar;
        }
        InterfaceC0079f interfaceC0079f = e.f1004d;
        k kVar2 = (k) c.f993h.get(this);
        while (true) {
            long andIncrement = c.f989d.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean o2 = o(andIncrement, false);
            int i2 = e.f1002b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (kVar2.f1171c != j4) {
                k b2 = c.b(this, j4, kVar2);
                if (b2 != null) {
                    kVar = b2;
                } else if (o2) {
                    return new h(l());
                }
            } else {
                kVar = kVar2;
            }
            int c2 = c.c(this, kVar, i3, obj, j2, interfaceC0079f, o2);
            if (c2 == 0) {
                kVar.a();
                return gVar;
            }
            if (c2 == 1) {
                return gVar;
            }
            if (c2 == 2) {
                if (o2) {
                    kVar.h();
                    return new h(l());
                }
                d0 d0Var = interfaceC0079f instanceof d0 ? (d0) interfaceC0079f : null;
                if (d0Var != null) {
                    d0Var.a(kVar, i3 + i2);
                }
                g((kVar.f1171c * j3) + i3);
                return gVar;
            }
            if (c2 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (c2 == 4) {
                if (j2 < c.f990e.get(this)) {
                    kVar.a();
                }
                return new h(l());
            }
            if (c2 == 5) {
                kVar.a();
            }
            kVar2 = kVar;
        }
    }

    @Override // m0.c
    public final boolean q() {
        return this.f1027m == 2;
    }
}
