package J;

import D1.C0014b;
import I.C0120t;
import I.I0;

/* loaded from: classes.dex */
public final class A extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final A f2521c = new A(1, 0, 2);

    @Override // J.C
    public final void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t) {
        int b2 = d3.b(0);
        for (int i3 = 0; i3 < b2; i3++) {
            c0014b.A();
        }
    }

    @Override // J.C
    public final String b(int i3) {
        return I2.l.v(i3, 0) ? "count" : super.b(i3);
    }
}
