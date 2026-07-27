package H;

import A.C0020p;
import B1.C0097d;
import G.C0223t;
import G.H0;

/* loaded from: classes.dex */
public final class A extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final A f3170c = new A(1, 0, 2);

    @Override // H.C
    public final void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t) {
        int d4 = c0020p.d(0);
        for (int i2 = 0; i2 < d4; i2++) {
            c0097d.J();
        }
    }

    @Override // H.C
    public final String b(int i2) {
        return u3.l.a0(i2, 0) ? "count" : super.b(i2);
    }
}
