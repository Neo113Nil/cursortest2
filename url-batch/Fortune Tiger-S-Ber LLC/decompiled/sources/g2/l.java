package g2;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l extends k3.d {
    @Override // k3.d
    public final void E(y yVar, float f4, float f5) {
        float f6 = f5 * f4;
        yVar.d(f6, 180.0f, 90.0f);
        float f7 = f6 * 2.0f;
        u uVar = new u(0.0f, 0.0f, f7, f7);
        uVar.f1911f = 180.0f;
        uVar.g = 90.0f;
        yVar.f1920f.add(uVar);
        s sVar = new s(uVar);
        yVar.a(180.0f);
        yVar.g.add(sVar);
        yVar.f1918d = 270.0f;
        float f8 = (0.0f + f7) * 0.5f;
        float f9 = (f7 - 0.0f) / 2.0f;
        double d4 = 270.0f;
        yVar.f1917b = (((float) Math.cos(Math.toRadians(d4))) * f9) + f8;
        yVar.c = (f9 * ((float) Math.sin(Math.toRadians(d4)))) + f8;
    }
}
