package J;

import B.C0014o;
import I.C0141c;
import I.C0174t;
import I.H0;
import a.AbstractC0235a;

/* loaded from: classes.dex */
public final class k extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final k f3134c;

    static {
        int i3 = 1;
        f3134c = new k(0, i3, i3);
    }

    @Override // J.C
    public final void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t) {
        C0141c c0141c = (C0141c) c0014o.e(0);
        c0141c.getClass();
        h02.k(h02.c(c0141c));
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0235a.u(i3, 0) ? "anchor" : super.c(i3);
    }
}
