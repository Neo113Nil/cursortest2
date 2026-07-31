package J;

import D1.C0014b;
import I.C0089d;
import I.C0120t;
import I.I0;

/* loaded from: classes.dex */
public final class u extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final u f2573c;

    static {
        int i3 = 0;
        f2573c = new u(i3, i3, 3);
    }

    @Override // J.C
    public final void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t) {
        if (i02.f2146n != 0) {
            C0089d.w("Cannot reset when inserting");
            throw null;
        }
        i02.z();
        i02.f2151t = 0;
        i02.f2152u = i02.m() - i02.f2140h;
        i02.f2141i = 0;
        i02.f2142j = 0;
        i02.f2147o = 0;
    }
}
