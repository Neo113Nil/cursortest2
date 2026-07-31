package J;

import D1.C0014b;
import I.C0089d;
import I.C0120t;
import I.I0;

/* loaded from: classes.dex */
public final class j extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final j f2558c;

    static {
        int i3 = 0;
        f2558c = new j(i3, i3, 3);
    }

    @Override // J.C
    public final void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t) {
        Z1.i.d(c0014b, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        while (true) {
            int i3 = i02.f2153v;
            if ((i3 >= 0 || i02.f2152u <= 0) && i3 != 0) {
                i02.D();
                if (C0089d.m(i02.f2134b, i02.p(i02.f2153v))) {
                    c0014b.A();
                }
                i02.i();
            }
        }
        i02.i();
    }
}
