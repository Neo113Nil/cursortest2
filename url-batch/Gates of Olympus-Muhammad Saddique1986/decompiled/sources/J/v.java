package J;

import B.C0014o;
import I.C0174t;
import I.H0;
import a.AbstractC0235a;
import e2.InterfaceC0422a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final v f3149c;

    static {
        int i3 = 1;
        f3149c = new v(0, i3, i3);
    }

    @Override // J.C
    public final void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t) {
        ((ArrayList) c0174t.f2914e).add((InterfaceC0422a) c0014o.e(0));
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0235a.u(i3, 0) ? "effect" : super.c(i3);
    }
}
