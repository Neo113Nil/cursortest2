package H;

import A.C0020p;
import B1.C0097d;
import G.C0223t;
import G.H0;
import G.InterfaceC0218q;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final h f3201c = new h(0, 2, 1);

    @Override // H.C
    public final void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t) {
        ((Function1) c0020p.e(0)).invoke((InterfaceC0218q) c0020p.e(1));
    }

    @Override // H.C
    public final String c(int i2) {
        return M1.a.z(i2, 0) ? "anchor" : M1.a.z(i2, 1) ? "composition" : super.c(i2);
    }
}
