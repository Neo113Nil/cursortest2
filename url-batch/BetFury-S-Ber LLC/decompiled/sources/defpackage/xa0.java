package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xa0 extends n9 {
    @Override // defpackage.n9
    public final void m(qd0 qd0Var, float f, float f2) {
        float f3 = f2 * f;
        qd0Var.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        md0 md0Var = new md0(0.0f, 0.0f, f4, f4);
        md0Var.f = 180.0f;
        md0Var.g = 90.0f;
        qd0Var.f.add(md0Var);
        kd0 kd0Var = new kd0(md0Var);
        qd0Var.a(180.0f);
        qd0Var.g.add(kd0Var);
        qd0Var.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        qd0Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        qd0Var.c = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
