package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class q00 extends jw {
    @Override // defpackage.jw
    public final void u(n20 n20Var, float f, float f2) {
        float f3 = f2 * f;
        n20Var.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        j20 j20Var = new j20(0.0f, 0.0f, f4, f4);
        j20Var.f = 180.0f;
        j20Var.g = 90.0f;
        n20Var.f.add(j20Var);
        h20 h20Var = new h20(j20Var);
        n20Var.a(180.0f);
        n20Var.g.add(h20Var);
        n20Var.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        n20Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        n20Var.c = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
