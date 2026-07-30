package n6;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: n6.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0781n extends f0 implements InterfaceC0780m {
    public final Object W(V5.b frame) {
        Object s7;
        while (true) {
            Object obj = f0.f7054d.get(this);
            if (obj instanceof U) {
                if (S(obj) >= 0) {
                    c0 c0Var = new c0(W5.d.b(frame), this);
                    c0Var.s();
                    c0Var.v(new C0772e(2, AbstractC0792z.j(this, true, new I(2, c0Var))));
                    Object r7 = c0Var.r();
                    if (r7 == W5.a.f2787d) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    s7 = r7;
                }
            } else {
                if (obj instanceof C0784q) {
                    throw ((C0784q) obj).f7076a;
                }
                s7 = AbstractC0792z.s(obj);
            }
        }
        W5.a aVar = W5.a.f2787d;
        return s7;
    }
}
