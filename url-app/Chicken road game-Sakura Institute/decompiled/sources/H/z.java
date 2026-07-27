package H;

import A.C0020p;
import B1.C0097d;
import G.C0223t;
import G.H0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final z f3223c = new z(0, 2, 1);

    @Override // H.C
    public final void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t) {
        ((Function2) c0020p.e(1)).h(c0097d.l(), c0020p.e(0));
    }

    @Override // H.C
    public final String c(int i2) {
        return M1.a.z(i2, 0) ? "value" : M1.a.z(i2, 1) ? "block" : super.c(i2);
    }
}
