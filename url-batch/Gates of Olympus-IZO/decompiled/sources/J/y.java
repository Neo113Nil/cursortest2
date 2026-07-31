package J;

import D1.C0014b;
import I.C0120t;
import I.I0;
import a.AbstractC0157a;

/* loaded from: classes.dex */
public final class y extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final y f2577c;

    static {
        int i3 = 1;
        f2577c = new y(0, i3, i3);
    }

    @Override // J.C
    public final void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t) {
        i02.K(d3.c(0));
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0157a.w(i3, 0) ? "data" : super.c(i3);
    }
}
