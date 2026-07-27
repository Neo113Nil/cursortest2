package W2;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: W2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292n extends k0 implements InterfaceC0291m {
    public final Object h0(E2.c frame) {
        Object p4;
        int i2 = 2;
        while (true) {
            Object obj = k0.f4279d.get(this);
            if (obj instanceof Z) {
                if (d0(obj) >= 0) {
                    h0 h0Var = new h0(D2.f.b(frame), this);
                    h0Var.s();
                    h0Var.w(new C0283e(2, B.j(this, true, new M(i2, h0Var))));
                    Object r2 = h0Var.r();
                    if (r2 == D2.a.f2163d) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    p4 = r2;
                }
            } else {
                if (obj instanceof C0294p) {
                    throw ((C0294p) obj).f4291a;
                }
                p4 = B.p(obj);
            }
        }
        D2.a aVar = D2.a.f2163d;
        return p4;
    }
}
