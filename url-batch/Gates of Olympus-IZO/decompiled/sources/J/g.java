package J;

import D1.C0014b;
import I.C0120t;
import I.I0;
import a.AbstractC0157a;

/* loaded from: classes.dex */
public final class g extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final g f2555c = new g(0, 1, 1);

    @Override // J.C
    public final void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t) {
        Z1.i.d(c0014b, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        for (Object obj : (Object[]) d3.c(0)) {
            c0014b.f(obj);
        }
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0157a.w(i3, 0) ? "nodes" : super.c(i3);
    }
}
