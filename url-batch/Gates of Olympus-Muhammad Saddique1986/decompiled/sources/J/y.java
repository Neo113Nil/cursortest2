package J;

import B.C0014o;
import I.C0174t;
import I.H0;
import a.AbstractC0235a;

/* loaded from: classes.dex */
public final class y extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final y f3152c;

    static {
        int i3 = 1;
        f3152c = new y(0, i3, i3);
    }

    @Override // J.C
    public final void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t) {
        h02.K(c0014o.e(0));
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0235a.u(i3, 0) ? "data" : super.c(i3);
    }
}
