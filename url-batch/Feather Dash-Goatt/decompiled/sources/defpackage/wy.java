package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wy extends zl0 implements ad0 {
    public fs s;
    public float t;

    @Override // defpackage.ad0
    public final wk0 P(ej0 ej0Var, qk0 qk0Var, long j) {
        int j2;
        int h;
        int i;
        int i2;
        if (!mm.d(j) || this.s == fs.d) {
            j2 = mm.j(j);
            h = mm.h(j);
        } else {
            int round = Math.round(mm.h(j) * this.t);
            int j3 = mm.j(j);
            j2 = mm.h(j);
            if (round < j3) {
                round = j3;
            }
            if (round <= j2) {
                j2 = round;
            }
            h = j2;
        }
        if (!mm.c(j) || this.s == fs.e) {
            int i3 = mm.i(j);
            int g = mm.g(j);
            i = i3;
            i2 = g;
        } else {
            int round2 = Math.round(mm.g(j) * this.t);
            int i4 = mm.i(j);
            i = mm.g(j);
            if (round2 < i4) {
                round2 = i4;
            }
            if (round2 <= i) {
                i = round2;
            }
            i2 = i;
        }
        zw0 c = qk0Var.c(nm.a(j2, h, i, i2));
        return xk0.q(ej0Var, c.d, c.e, new aa(c, 2));
    }
}
