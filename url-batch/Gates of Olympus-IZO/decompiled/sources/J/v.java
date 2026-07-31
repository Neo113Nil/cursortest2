package J;

import D1.C0014b;
import I.C0120t;
import I.I0;
import a.AbstractC0157a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final v f2574c;

    static {
        int i3 = 1;
        f2574c = new v(0, i3, i3);
    }

    @Override // J.C
    public final void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t) {
        ((ArrayList) c0120t.f2355e).add((Y1.a) d3.c(0));
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0157a.w(i3, 0) ? "effect" : super.c(i3);
    }
}
