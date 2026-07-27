package H;

import A.C0020p;
import B1.C0097d;
import G.C0223t;
import G.H0;
import r0.E;

/* loaded from: classes.dex */
public final class q extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final q f3214c = new q(3, 0, 2);

    @Override // H.C
    public final void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t) {
        ((E) c0097d.f989j).H(c0020p.d(0), c0020p.d(1), c0020p.d(2));
    }

    @Override // H.C
    public final String b(int i2) {
        return u3.l.a0(i2, 0) ? "from" : u3.l.a0(i2, 1) ? "to" : u3.l.a0(i2, 2) ? "count" : super.b(i2);
    }
}
