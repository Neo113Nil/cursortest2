package H;

import A.C0020p;
import B1.C0097d;
import G.C0192d;
import G.C0223t;
import G.H0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final j f3203c;

    static {
        int i2 = 0;
        f3203c = new j(i2, i2, 3);
    }

    @Override // H.C
    public final void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t) {
        Intrinsics.d(c0097d, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        while (true) {
            int i2 = h02.f2706v;
            if ((i2 >= 0 || h02.f2705u <= 0) && i2 != 0) {
                h02.D();
                if (C0192d.m(h02.f2686b, h02.p(h02.f2706v))) {
                    c0097d.J();
                }
                h02.i();
            }
        }
        h02.i();
    }
}
