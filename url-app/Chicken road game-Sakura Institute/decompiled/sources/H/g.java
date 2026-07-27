package H;

import A.C0020p;
import B1.C0097d;
import G.C0223t;
import G.H0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final g f3200c = new g(0, 1, 1);

    @Override // H.C
    public final void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t) {
        Intrinsics.d(c0097d, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        for (Object obj : (Object[]) c0020p.e(0)) {
            c0097d.h(obj);
        }
    }

    @Override // H.C
    public final String c(int i2) {
        return M1.a.z(i2, 0) ? "nodes" : super.c(i2);
    }
}
