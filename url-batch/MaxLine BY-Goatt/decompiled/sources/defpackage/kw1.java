package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kw1 extends pw1 {
    public static final kw1 c = new kw1(1, 0, 2);

    @Override // defpackage.pw1
    public final void a(gn gnVar, rh rhVar, zl2 zl2Var, q82 q82Var, qw1 qw1Var) {
        int f = gnVar.f(0);
        int i = zl2Var.v;
        int M = zl2Var.M(zl2Var.b, zl2Var.r(i));
        int g = zl2Var.g(zl2Var.b, zl2Var.r(i + 1));
        for (int max = Math.max(M, g - f); max < g; max++) {
            Object obj = zl2Var.c[zl2Var.h(max)];
            if (obj instanceof s82) {
                q82Var.d((s82) obj);
            } else if (obj instanceof n72) {
                ((n72) obj).c();
            }
        }
        if (f <= 0) {
            b00.c("Check failed");
        }
        int i2 = zl2Var.v;
        int M2 = zl2Var.M(zl2Var.b, zl2Var.r(i2));
        int g2 = zl2Var.g(zl2Var.b, zl2Var.r(i2 + 1)) - f;
        if (g2 < M2) {
            b00.c("Check failed");
        }
        zl2Var.I(g2, f, i2);
        int i3 = zl2Var.i;
        if (i3 >= M2) {
            zl2Var.i = i3 - f;
        }
    }
}
