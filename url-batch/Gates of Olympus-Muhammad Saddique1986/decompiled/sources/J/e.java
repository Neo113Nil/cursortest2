package J;

import B.C0014o;
import I.B0;
import I.C0141c;
import I.C0143d;
import I.C0174t;
import I.H0;
import a.AbstractC0235a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final e f3128c = new e(0, 2, 1);

    @Override // J.C
    public final void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t) {
        C0141c c0141c = (C0141c) c0014o.e(0);
        Object e3 = c0014o.e(1);
        if (e3 instanceof B0) {
            ((ArrayList) c0174t.f2912c).add(((B0) e3).f2639a);
        }
        if (h02.f2700n != 0) {
            C0143d.w("Can only append a slot if not current inserting");
            throw null;
        }
        int i3 = h02.f2695i;
        int i4 = h02.f2696j;
        int c2 = h02.c(c0141c);
        int f3 = h02.f(h02.f2688b, h02.p(c2 + 1));
        h02.f2695i = f3;
        h02.f2696j = f3;
        h02.s(1, c2);
        if (i3 >= f3) {
            i3++;
            i4++;
        }
        h02.f2689c[f3] = e3;
        h02.f2695i = i3;
        h02.f2696j = i4;
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0235a.u(i3, 0) ? "anchor" : AbstractC0235a.u(i3, 1) ? "value" : super.c(i3);
    }
}
