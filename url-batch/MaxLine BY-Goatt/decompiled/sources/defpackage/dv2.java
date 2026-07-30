package defpackage;

import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dv2 {
    public static final tt1 f = iv1.L(fi2.F, cv2.n);
    public final hz1 a;
    public final hz1 b = new hz1(0.0f);
    public w72 c = w72.e;
    public long d = jw2.b;
    public final lz1 e;

    public dv2(ww1 ww1Var, float f2) {
        this.a = new hz1(f2);
        this.e = new lz1(ww1Var, by1.B);
    }

    public final void a(ww1 ww1Var, w72 w72Var, int i, int i2) {
        float f2 = i2 - i;
        this.b.i(f2);
        float f3 = w72Var.a;
        float f4 = w72Var.b;
        w72 w72Var2 = this.c;
        float f5 = w72Var2.a;
        hz1 hz1Var = this.a;
        if (f3 != f5 || f4 != w72Var2.b) {
            boolean z = ww1Var == ww1.m;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? w72Var.d : w72Var.c;
            float h = hz1Var.h();
            float f7 = i;
            float f8 = h + f7;
            hz1Var.i(hz1Var.h() + ((f6 <= f8 && (f3 >= h || f6 - f3 <= f7)) ? (f3 >= h || f6 - f3 > f7) ? 0.0f : f3 - h : f6 - f8));
            this.c = w72Var;
        }
        hz1Var.i(d.b(hz1Var.h(), 0.0f, f2));
    }
}
