package J;

import B.C0014o;
import I.C0174t;
import I.H0;

/* loaded from: classes.dex */
public final class A extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final A f3100c = new A(1, 0, 2);

    @Override // J.C
    public final void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t) {
        int d3 = c0014o.d(0);
        for (int i3 = 0; i3 < d3; i3++) {
            mVar.B();
        }
    }

    @Override // J.C
    public final String b(int i3) {
        return O2.l.Z(i3, 0) ? "count" : super.b(i3);
    }
}
