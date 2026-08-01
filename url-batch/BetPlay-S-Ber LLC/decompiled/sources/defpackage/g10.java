package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class g10 extends op {
    @Override // defpackage.op
    public final void y(x20 x20Var, float f, float f2) {
        float f3 = f2 * f;
        x20Var.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        t20 t20Var = new t20(0.0f, 0.0f, f4, f4);
        t20Var.f = 180.0f;
        t20Var.g = 90.0f;
        x20Var.f.add(t20Var);
        r20 r20Var = new r20(t20Var);
        x20Var.a(180.0f);
        x20Var.g.add(r20Var);
        x20Var.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        x20Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        x20Var.c = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
