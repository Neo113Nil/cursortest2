package J;

import B.C0014o;
import I.C0141c;
import I.C0143d;
import I.C0174t;
import I.F0;
import I.H0;
import a.AbstractC0235a;

/* loaded from: classes.dex */
public final class o extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final o f3142c = new o(0, 3, 1);

    @Override // J.C
    public final void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t) {
        F0 f02 = (F0) c0014o.e(1);
        C0141c c0141c = (C0141c) c0014o.e(0);
        C0198c c0198c = (C0198c) c0014o.e(2);
        H0 i3 = f02.i();
        try {
            if (!c0198c.f3126c.k0()) {
                C0143d.w("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                throw null;
            }
            c0198c.f3125b.j0(mVar, i3, c0174t);
            i3.e(true);
            h02.d();
            c0141c.getClass();
            h02.t(f02, f02.b(c0141c));
            h02.j();
        } catch (Throwable th) {
            i3.e(false);
            throw th;
        }
    }

    @Override // J.C
    public final String c(int i3) {
        return AbstractC0235a.u(i3, 0) ? "anchor" : AbstractC0235a.u(i3, 1) ? "from" : AbstractC0235a.u(i3, 2) ? "fixups" : super.c(i3);
    }
}
