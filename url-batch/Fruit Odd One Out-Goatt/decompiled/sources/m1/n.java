package m1;

import k1.y0;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class n extends c {

    /* renamed from: l, reason: collision with root package name */
    public final int f879l;

    public n(int i2, int i3) {
        super(i2);
        this.f879l = i3;
        if (i3 != 1) {
            if (i2 >= 1) {
                return;
            }
            f0.l.d("Buffered channel capacity must be at least 1, but ", i2, " was specified");
            throw null;
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + d1.l.a(c.class).b() + " instead").toString());
    }

    @Override // m1.c, m1.r
    public final Object c(Object obj) {
        t0.g gVar = t0.g.f1178a;
        if (this.f879l == 3) {
            Object c2 = super.c(obj);
            return (!(c2 instanceof i) || (c2 instanceof h)) ? c2 : gVar;
        }
        Object obj2 = e.f857d;
        k kVar = (k) c.f847g.get(this);
        while (true) {
            long andIncrement = c.f843c.getAndIncrement(this);
            long j2 = 1152921504606846975L & andIncrement;
            boolean o2 = o(andIncrement, false);
            int i2 = e.f855b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (kVar.f1075c != j4) {
                k a2 = c.a(this, j4, kVar);
                if (a2 != null) {
                    kVar = a2;
                } else if (o2) {
                    return new h(l());
                }
            }
            int b2 = c.b(this, kVar, i3, obj, j2, obj2, o2);
            if (b2 == 0) {
                kVar.a();
                return gVar;
            }
            if (b2 == 1) {
                return gVar;
            }
            if (b2 == 2) {
                if (o2) {
                    kVar.h();
                    return new h(l());
                }
                y0 y0Var = obj2 instanceof y0 ? (y0) obj2 : null;
                if (y0Var != null) {
                    y0Var.a(kVar, i3 + i2);
                }
                h((kVar.f1075c * j3) + i3);
                return gVar;
            }
            if (b2 == 3) {
                f0.l.b("unexpected");
                return null;
            }
            if (b2 == 4) {
                if (j2 < c.f844d.get(this)) {
                    kVar.a();
                }
                return new h(l());
            }
            if (b2 == 5) {
                kVar.a();
            }
        }
    }

    @Override // m1.c
    public final boolean q() {
        return this.f879l == 2;
    }
}
