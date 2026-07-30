package defpackage;

import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class v6 extends so1 {
    public final /* synthetic */ pn1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(pn1 pn1Var) {
        super(1);
        this.e = pn1Var;
    }

    @Override // defpackage.so1
    public final ip1 d(ip1 ip1Var, List list) {
        return this.e.g(ip1Var);
    }

    @Override // defpackage.so1
    public final c51 e(uo1 uo1Var, c51 c51Var) {
        v80 v80Var = (v80) this.e.D.J.d;
        if (v80Var.U.r) {
            long C = t90.C(v80Var.M(0L));
            int i = (int) (C >> 32);
            if (i < 0) {
                i = 0;
            }
            int i2 = (int) (C & 4294967295L);
            if (i2 < 0) {
                i2 = 0;
            }
            long K = t80.n(v80Var).K();
            int i3 = (int) (K >> 32);
            int i4 = (int) (K & 4294967295L);
            long j = v80Var.g;
            long C2 = t90.C(v80Var.M((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
            int i5 = i3 - ((int) (C2 >> 32));
            if (i5 < 0) {
                i5 = 0;
            }
            int i6 = i4 - ((int) (C2 & 4294967295L));
            int i7 = i6 >= 0 ? i6 : 0;
            if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                return new c51(c7.f((c90) c51Var.e, i, i2, i5, i7), 10, c7.f((c90) c51Var.g, i, i2, i5, i7));
            }
        }
        return c51Var;
    }
}
