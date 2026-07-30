package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qy1 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ ry1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy1(ry1 ry1Var, int i) {
        super(0);
        this.m = i;
        this.n = ry1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int j;
        int i = this.m;
        ry1 ry1Var = this.n;
        switch (i) {
            case 0:
                return Integer.valueOf(ry1Var.j.b() ? ry1Var.s.h() : ry1Var.j());
            default:
                boolean b = ry1Var.j.b();
                iz1 iz1Var = ry1Var.r;
                if (!b) {
                    j = ry1Var.j();
                } else if (iz1Var.h() != -1) {
                    j = iz1Var.h();
                } else {
                    float abs = Math.abs(ry1Var.k());
                    ca0 ca0Var = ry1Var.p;
                    ky1 ky1Var = uy1.a;
                    if (abs >= Math.abs(Math.min(ca0Var.D(56.0f), ry1Var.n() / 2.0f) / ry1Var.n())) {
                        boolean booleanValue = ((Boolean) ry1Var.E.getValue()).booleanValue();
                        int i2 = ry1Var.d;
                        j = booleanValue ? i2 + 1 : i2;
                    } else {
                        j = ry1Var.j();
                    }
                }
                return Integer.valueOf(ry1Var.i(j));
        }
    }
}
