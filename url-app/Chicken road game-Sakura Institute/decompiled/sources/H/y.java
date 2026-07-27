package H;

import A.C0020p;
import B1.C0097d;
import G.C0223t;
import G.H0;

/* loaded from: classes.dex */
public final class y extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final y f3222c;

    static {
        int i2 = 1;
        f3222c = new y(0, i2, i2);
    }

    @Override // H.C
    public final void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t) {
        h02.K(c0020p.e(0));
    }

    @Override // H.C
    public final String c(int i2) {
        return M1.a.z(i2, 0) ? "data" : super.c(i2);
    }
}
