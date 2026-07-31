package J;

import D1.C0014b;
import I.B0;
import I.C0120t;
import I.I0;
import a.AbstractC0157a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final r f2570c;

    static {
        int i3 = 1;
        f2570c = new r(0, i3, i3);
    }

    @Override // J.C
    public final void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t) {
        ((ArrayList) c0120t.f2353c).add((B0) d3.c(0));
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0157a.w(i3, 0) ? "value" : super.c(i3);
    }
}
