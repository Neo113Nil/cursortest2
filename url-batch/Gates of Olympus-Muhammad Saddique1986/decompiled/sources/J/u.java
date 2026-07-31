package J;

import B.C0014o;
import I.C0143d;
import I.C0174t;
import I.H0;

/* loaded from: classes.dex */
public final class u extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final u f3148c;

    static {
        int i3 = 0;
        f3148c = new u(i3, i3, 3);
    }

    @Override // J.C
    public final void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t) {
        if (h02.f2700n != 0) {
            C0143d.w("Cannot reset when inserting");
            throw null;
        }
        h02.z();
        h02.f2706t = 0;
        h02.f2707u = h02.m() - h02.f2694h;
        h02.f2695i = 0;
        h02.f2696j = 0;
        h02.f2701o = 0;
    }
}
