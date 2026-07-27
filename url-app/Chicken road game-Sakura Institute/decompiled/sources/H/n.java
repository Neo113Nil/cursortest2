package H;

import A.C0020p;
import B1.C0097d;
import G.C0190c;
import G.C0223t;
import G.F0;
import G.H0;

/* loaded from: classes.dex */
public final class n extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final n f3211c = new n(0, 2, 1);

    @Override // H.C
    public final void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t) {
        F0 f02 = (F0) c0020p.e(1);
        C0190c c0190c = (C0190c) c0020p.e(0);
        h02.d();
        c0190c.getClass();
        h02.t(f02, f02.e(c0190c));
        h02.j();
    }

    @Override // H.C
    public final String c(int i2) {
        return M1.a.z(i2, 0) ? "anchor" : M1.a.z(i2, 1) ? "from" : super.c(i2);
    }
}
