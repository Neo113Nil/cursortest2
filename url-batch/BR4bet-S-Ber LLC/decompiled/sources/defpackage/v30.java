package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class v30 extends la0 {
    @Override // defpackage.la0
    public final void y(p50 p50Var, float f, float f2) {
        float f3 = f2 * f;
        p50Var.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        l50 l50Var = new l50(0.0f, 0.0f, f4, f4);
        l50Var.f = 180.0f;
        l50Var.g = 90.0f;
        p50Var.f.add(l50Var);
        j50 j50Var = new j50(l50Var);
        p50Var.a(180.0f);
        p50Var.g.add(j50Var);
        p50Var.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        p50Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        p50Var.c = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
