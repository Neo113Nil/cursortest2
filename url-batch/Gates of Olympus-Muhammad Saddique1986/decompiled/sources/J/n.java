package J;

import B.C0014o;
import I.C0141c;
import I.C0174t;
import I.F0;
import I.H0;
import a.AbstractC0235a;

/* loaded from: classes.dex */
public final class n extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final n f3141c = new n(0, 2, 1);

    @Override // J.C
    public final void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t) {
        F0 f02 = (F0) c0014o.e(1);
        C0141c c0141c = (C0141c) c0014o.e(0);
        h02.d();
        c0141c.getClass();
        h02.t(f02, f02.b(c0141c));
        h02.j();
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0235a.u(i3, 0) ? "anchor" : AbstractC0235a.u(i3, 1) ? "from" : super.c(i3);
    }
}
