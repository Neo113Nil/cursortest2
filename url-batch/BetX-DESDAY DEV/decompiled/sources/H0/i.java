package H0;

/* loaded from: classes.dex */
public final class i extends q1.l {
    @Override // q1.l
    public final void v(u uVar, float f2, float f3) {
        uVar.d(f3 * f2, 180.0f, 90.0f);
        float f4 = f3 * 2.0f * f2;
        q qVar = new q(0.0f, 0.0f, f4, f4);
        qVar.f334f = 180.0f;
        qVar.f335g = 90.0f;
        uVar.f346f.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f347g.add(oVar);
        uVar.f344d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        double d2 = 270.0f;
        uVar.f342b = (((float) Math.cos(Math.toRadians(d2))) * f6) + f5;
        uVar.f343c = (f6 * ((float) Math.sin(Math.toRadians(d2)))) + f5;
    }
}
