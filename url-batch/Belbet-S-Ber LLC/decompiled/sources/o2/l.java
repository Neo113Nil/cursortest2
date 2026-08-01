package o2;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l extends b4.d {
    @Override // b4.d
    public final void w(y yVar, float f5, float f6) {
        float f7 = f6 * f5;
        yVar.d(f7, 180.0f, 90.0f);
        float f8 = f7 * 2.0f;
        u uVar = new u(0.0f, 0.0f, f8, f8);
        uVar.f3010f = 180.0f;
        uVar.f3011g = 90.0f;
        yVar.f3021f.add(uVar);
        s sVar = new s(uVar);
        yVar.a(180.0f);
        yVar.f3022g.add(sVar);
        yVar.d = 270.0f;
        float f9 = (0.0f + f8) * 0.5f;
        float f10 = (f8 - 0.0f) / 2.0f;
        double d = 270.0f;
        yVar.f3018b = (((float) Math.cos(Math.toRadians(d))) * f10) + f9;
        yVar.f3019c = (f10 * ((float) Math.sin(Math.toRadians(d)))) + f9;
    }
}
