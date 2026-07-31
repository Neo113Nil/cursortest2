package J;

import D1.C0014b;
import I.C0087c;
import I.C0120t;
import I.G0;
import I.I0;
import a.AbstractC0157a;

/* loaded from: classes.dex */
public final class n extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final n f2566c = new n(0, 2, 1);

    @Override // J.C
    public final void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t) {
        G0 g02 = (G0) d3.c(1);
        C0087c c0087c = (C0087c) d3.c(0);
        i02.d();
        c0087c.getClass();
        i02.t(g02, g02.b(c0087c));
        i02.j();
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0157a.w(i3, 0) ? "anchor" : AbstractC0157a.w(i3, 1) ? "from" : super.c(i3);
    }
}
