package J;

import D1.C0014b;
import I.C0120t;
import I.I0;
import I.InterfaceC0115q;
import a.AbstractC0157a;

/* loaded from: classes.dex */
public final class h extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final h f2556c = new h(0, 2, 1);

    @Override // J.C
    public final void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t) {
        ((Y1.c) d3.c(0)).j((InterfaceC0115q) d3.c(1));
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0157a.w(i3, 0) ? "anchor" : AbstractC0157a.w(i3, 1) ? "composition" : super.c(i3);
    }
}
