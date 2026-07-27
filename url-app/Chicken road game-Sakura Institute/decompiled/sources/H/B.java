package H;

import A.C0020p;
import B1.C0097d;
import G.C0223t;
import G.H0;
import G.InterfaceC0204j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class B extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final B f3171c;

    static {
        int i2 = 0;
        f3171c = new B(i2, i2, 3);
    }

    @Override // H.C
    public final void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t) {
        Object l4 = c0097d.l();
        Intrinsics.d(l4, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
        ((InterfaceC0204j) l4).b();
    }
}
