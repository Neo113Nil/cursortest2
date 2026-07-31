package J;

import D1.C0014b;
import I.C0;
import I.C0087c;
import I.C0089d;
import I.C0120t;
import I.I0;
import a.AbstractC0157a;
import java.util.ArrayList;

/* renamed from: J.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138e extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final C0138e f2553c = new C0138e(0, 2, 1);

    @Override // J.C
    public final void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t) {
        C0087c c0087c = (C0087c) d3.c(0);
        Object c3 = d3.c(1);
        if (c3 instanceof C0) {
            ((ArrayList) c0120t.f2353c).add(((C0) c3).f2083a);
        }
        if (i02.f2146n != 0) {
            C0089d.w("Can only append a slot if not current inserting");
            throw null;
        }
        int i3 = i02.f2141i;
        int i4 = i02.f2142j;
        int c4 = i02.c(c0087c);
        int f3 = i02.f(i02.f2134b, i02.p(c4 + 1));
        i02.f2141i = f3;
        i02.f2142j = f3;
        i02.s(1, c4);
        if (i3 >= f3) {
            i3++;
            i4++;
        }
        i02.f2135c[f3] = c3;
        i02.f2141i = i3;
        i02.f2142j = i4;
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0157a.w(i3, 0) ? "anchor" : AbstractC0157a.w(i3, 1) ? "value" : super.c(i3);
    }
}
