package H;

import A.C0020p;
import B1.C0097d;
import G.C0192d;
import G.C0223t;
import G.H0;

/* loaded from: classes.dex */
public final class u extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final u f3218c;

    static {
        int i2 = 0;
        f3218c = new u(i2, i2, 3);
    }

    @Override // H.C
    public final void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t) {
        if (h02.f2698n != 0) {
            C0192d.w("Cannot reset when inserting");
            throw null;
        }
        h02.z();
        h02.f2704t = 0;
        h02.f2705u = h02.m() - h02.f2692h;
        h02.f2693i = 0;
        h02.f2694j = 0;
        h02.f2699o = 0;
    }
}
