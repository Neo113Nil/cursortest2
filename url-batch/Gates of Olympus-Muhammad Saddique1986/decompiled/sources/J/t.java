package J;

import B.C0014o;
import I.C0174t;
import I.H0;
import t0.E;

/* loaded from: classes.dex */
public final class t extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final t f3147c = new t(2, 0, 2);

    @Override // J.C
    public final void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t) {
        ((E) mVar.f2118d).O(c0014o.d(0), c0014o.d(1));
    }

    @Override // J.C
    public final String b(int i3) {
        return O2.l.Z(i3, 0) ? "removeIndex" : O2.l.Z(i3, 1) ? "count" : super.b(i3);
    }
}
