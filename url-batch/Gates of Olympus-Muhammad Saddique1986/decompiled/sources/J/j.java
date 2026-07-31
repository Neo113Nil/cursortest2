package J;

import B.C0014o;
import I.C0143d;
import I.C0174t;
import I.H0;

/* loaded from: classes.dex */
public final class j extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final j f3133c;

    static {
        int i3 = 0;
        f3133c = new j(i3, i3, 3);
    }

    @Override // J.C
    public final void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t) {
        f2.j.d(mVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        while (true) {
            int i3 = h02.f2708v;
            if ((i3 >= 0 || h02.f2707u <= 0) && i3 != 0) {
                h02.D();
                if (C0143d.m(h02.f2688b, h02.p(h02.f2708v))) {
                    mVar.B();
                }
                h02.i();
            }
        }
        h02.i();
    }
}
