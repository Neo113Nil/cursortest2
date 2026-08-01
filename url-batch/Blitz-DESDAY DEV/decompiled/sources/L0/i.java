package L0;

/* loaded from: classes.dex */
public final class i extends z1.d {
    @Override // z1.d
    public final void w(u uVar, float f2, float f3) {
        uVar.d(f3 * f2, 180.0f, 90.0f);
        float f4 = f3 * 2.0f * f2;
        q qVar = new q(0.0f, 0.0f, f4, f4);
        qVar.f488f = 180.0f;
        qVar.f489g = 90.0f;
        uVar.f499f.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f500g.add(oVar);
        uVar.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        double d = 270.0f;
        uVar.f496b = (((float) Math.cos(Math.toRadians(d))) * f6) + f5;
        uVar.f497c = (f6 * ((float) Math.sin(Math.toRadians(d)))) + f5;
    }
}
