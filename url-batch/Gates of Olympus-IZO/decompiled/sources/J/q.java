package J;

import D1.C0014b;
import I.C0120t;
import I.I0;

/* loaded from: classes.dex */
public final class q extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final q f2569c = new q(3, 0, 2);

    @Override // J.C
    public final void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t) {
        ((t0.D) c0014b.f538d).F(d3.b(0), d3.b(1), d3.b(2));
    }

    @Override // J.C
    public final String b(int i3) {
        return I2.l.v(i3, 0) ? "from" : I2.l.v(i3, 1) ? "to" : I2.l.v(i3, 2) ? "count" : super.b(i3);
    }
}
