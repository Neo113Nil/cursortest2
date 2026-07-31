package J;

import B.C0014o;
import I.C0174t;
import I.H0;
import a.AbstractC0235a;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class z extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final z f3153c = new z(0, 2, 1);

    @Override // J.C
    public final void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t) {
        ((InterfaceC0426e) c0014o.e(1)).h(mVar.i(), c0014o.e(0));
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0235a.u(i3, 0) ? "value" : AbstractC0235a.u(i3, 1) ? "block" : super.c(i3);
    }
}
