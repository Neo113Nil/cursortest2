package J;

import D1.C0014b;
import I.C0087c;
import I.C0120t;
import I.I0;
import a.AbstractC0157a;

/* loaded from: classes.dex */
public final class k extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final k f2559c;

    static {
        int i3 = 1;
        f2559c = new k(0, i3, i3);
    }

    @Override // J.C
    public final void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t) {
        C0087c c0087c = (C0087c) d3.c(0);
        c0087c.getClass();
        i02.k(i02.c(c0087c));
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0157a.w(i3, 0) ? "anchor" : super.c(i3);
    }
}
