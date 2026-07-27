package H;

import A.C0020p;
import B1.C0097d;
import G.C0190c;
import G.C0192d;
import G.C0223t;
import G.F0;
import G.H0;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class o extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final o f3212c = new o(0, 3, 1);

    @Override // H.C
    public final void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t) {
        F0 f02 = (F0) c0020p.e(1);
        C0190c c0190c = (C0190c) c0020p.e(0);
        C0246c c0246c = (C0246c) c0020p.e(2);
        H0 w4 = f02.w();
        try {
            if (!c0246c.f3196i.Z()) {
                C0192d.w("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                throw null;
            }
            c0246c.f3195h.Y(c0097d, w4, c0223t);
            Unit unit = Unit.f7487a;
            w4.e(true);
            h02.d();
            c0190c.getClass();
            h02.t(f02, f02.e(c0190c));
            h02.j();
        } catch (Throwable th) {
            w4.e(false);
            throw th;
        }
    }

    @Override // H.C
    public final String c(int i2) {
        return M1.a.z(i2, 0) ? "anchor" : M1.a.z(i2, 1) ? "from" : M1.a.z(i2, 2) ? "fixups" : super.c(i2);
    }
}
