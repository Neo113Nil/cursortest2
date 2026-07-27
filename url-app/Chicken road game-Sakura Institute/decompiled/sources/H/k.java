package H;

import A.C0020p;
import B1.C0097d;
import G.C0190c;
import G.C0223t;
import G.H0;

/* loaded from: classes.dex */
public final class k extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final k f3204c;

    static {
        int i2 = 1;
        f3204c = new k(0, i2, i2);
    }

    @Override // H.C
    public final void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t) {
        C0190c c0190c = (C0190c) c0020p.e(0);
        c0190c.getClass();
        h02.k(h02.c(c0190c));
    }

    @Override // H.C
    public final String c(int i2) {
        return M1.a.z(i2, 0) ? "anchor" : super.c(i2);
    }
}
