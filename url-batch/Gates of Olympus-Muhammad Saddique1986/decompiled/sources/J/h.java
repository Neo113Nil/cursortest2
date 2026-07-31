package J;

import B.C0014o;
import I.C0174t;
import I.H0;
import I.InterfaceC0169q;
import a.AbstractC0235a;
import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class h extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final h f3131c = new h(0, 2, 1);

    @Override // J.C
    public final void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t) {
        ((InterfaceC0424c) c0014o.e(0)).n((InterfaceC0169q) c0014o.e(1));
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0235a.u(i3, 0) ? "anchor" : AbstractC0235a.u(i3, 1) ? "composition" : super.c(i3);
    }
}
