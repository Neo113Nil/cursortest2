package H;

import A.C0020p;
import B1.C0097d;
import G.B0;
import G.C0190c;
import G.C0192d;
import G.C0223t;
import G.H0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final e f3198c = new e(0, 2, 1);

    @Override // H.C
    public final void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t) {
        C0190c c0190c = (C0190c) c0020p.e(0);
        Object e4 = c0020p.e(1);
        if (e4 instanceof B0) {
            ((ArrayList) c0223t.f2909c).add(((B0) e4).f2637a);
        }
        if (h02.f2698n != 0) {
            C0192d.w("Can only append a slot if not current inserting");
            throw null;
        }
        int i2 = h02.f2693i;
        int i4 = h02.f2694j;
        int c4 = h02.c(c0190c);
        int f4 = h02.f(h02.f2686b, h02.p(c4 + 1));
        h02.f2693i = f4;
        h02.f2694j = f4;
        h02.s(1, c4);
        if (i2 >= f4) {
            i2++;
            i4++;
        }
        h02.f2687c[f4] = e4;
        h02.f2693i = i2;
        h02.f2694j = i4;
    }

    @Override // H.C
    public final String c(int i2) {
        return M1.a.z(i2, 0) ? "anchor" : M1.a.z(i2, 1) ? "value" : super.c(i2);
    }
}
