package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class bj0 implements nr {
    public boolean d;
    public long e = 9223372034707292159L;
    public long g = 0;
    public final /* synthetic */ ej0 h;

    public bj0(ej0 ej0Var) {
        this.h = ej0Var;
    }

    public final void a(o60 o60Var, float f) {
        ej0 ej0Var = this.h;
        u41 u41Var = ej0Var.q;
        if (u41Var == null) {
            u41Var = new u41();
            ej0Var.q = u41Var;
        }
        int k = y9.k(u41Var.b, o60Var);
        if (k >= 0) {
            float[] fArr = u41Var.c;
            if (fArr[k] != f) {
                fArr[k] = f;
                u41Var.d[k] = 1;
                return;
            } else {
                byte[] bArr = u41Var.d;
                if (bArr[k] == 2) {
                    bArr[k] = 0;
                    return;
                }
                return;
            }
        }
        int i = u41Var.a;
        o60[] o60VarArr = u41Var.b;
        if (i == o60VarArr.length) {
            int i2 = i * 2;
            u41Var.b = (o60[]) Arrays.copyOf(o60VarArr, i2);
            u41Var.c = Arrays.copyOf(u41Var.c, i2);
            u41Var.d = Arrays.copyOf(u41Var.d, i2);
        }
        u41Var.b[i] = o60Var;
        u41Var.d[i] = 3;
        u41Var.c[i] = f;
        u41Var.a++;
    }

    @Override // defpackage.nr
    public final float f() {
        return this.h.f();
    }

    @Override // defpackage.nr
    public final float k() {
        return this.h.k();
    }
}
