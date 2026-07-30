package defpackage;

import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dy1 implements wp {
    public final q80 b;
    public final wp c;
    public final md d;

    public dy1(q80 q80Var, wp wpVar) {
        this.b = q80Var;
        this.c = wpVar;
        this.d = wpVar.b();
    }

    @Override // defpackage.wp
    public final float a(float f, float f2, float f3) {
        float a = this.c.a(f, f2, f3);
        q80 q80Var = this.b;
        int i = q80Var.e;
        if (a == 0.0f) {
            if (i == 0) {
                return 0.0f;
            }
            float f4 = i * (-1.0f);
            if (((Boolean) q80Var.E.getValue()).booleanValue()) {
                f4 += q80Var.o();
            }
            return d.b(f4, -f3, f3);
        }
        float f5 = i * (-1.0f);
        while (a > 0.0f && f5 < a) {
            f5 += q80Var.o();
        }
        while (a < 0.0f && f5 > a) {
            f5 -= q80Var.o();
        }
        return f5;
    }

    @Override // defpackage.wp
    public final md b() {
        return this.d;
    }
}
