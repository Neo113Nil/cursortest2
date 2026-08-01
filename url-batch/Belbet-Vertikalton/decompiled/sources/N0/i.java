package N0;

/* loaded from: classes.dex */
public final class i extends H1.d {
    @Override // H1.d
    public final void D(u uVar, float f2, float f3) {
        uVar.d(f3 * f2, 180.0f, 90.0f);
        float f4 = f3 * 2.0f * f2;
        q qVar = new q(0.0f, 0.0f, f4, f4);
        qVar.f957f = 180.0f;
        qVar.f958g = 90.0f;
        uVar.f968f.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f969g.add(oVar);
        uVar.f967d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        double d2 = 270.0f;
        uVar.f965b = (((float) Math.cos(Math.toRadians(d2))) * f6) + f5;
        uVar.f966c = (f6 * ((float) Math.sin(Math.toRadians(d2)))) + f5;
    }
}
