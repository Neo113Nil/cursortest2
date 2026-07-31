package J;

import D1.C0014b;
import I.C0087c;
import I.C0089d;
import I.C0120t;
import I.G0;
import I.I0;
import a.AbstractC0157a;

/* loaded from: classes.dex */
public final class o extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final o f2567c = new o(0, 3, 1);

    @Override // J.C
    public final void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t) {
        G0 g02 = (G0) d3.c(1);
        C0087c c0087c = (C0087c) d3.c(0);
        C0136c c0136c = (C0136c) d3.c(2);
        I0 i3 = g02.i();
        try {
            if (!c0136c.f2551g.W()) {
                C0089d.w("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                throw null;
            }
            c0136c.f2550f.V(c0014b, i3, c0120t);
            i3.e(true);
            i02.d();
            c0087c.getClass();
            i02.t(g02, g02.b(c0087c));
            i02.j();
        } catch (Throwable th) {
            i3.e(false);
            throw th;
        }
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0157a.w(i3, 0) ? "anchor" : AbstractC0157a.w(i3, 1) ? "from" : AbstractC0157a.w(i3, 2) ? "fixups" : super.c(i3);
    }
}
