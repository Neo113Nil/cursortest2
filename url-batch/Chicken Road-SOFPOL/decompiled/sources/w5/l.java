package w5;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l extends r2.r {
    @Override // r2.r
    public final void x(x xVar, float f6, float f8) {
        float f9 = f8 * f6;
        xVar.d(f9, 180.0f, 90.0f);
        float f10 = f9 * 2.0f;
        t tVar = new t(0.0f, 0.0f, f10, f10);
        tVar.f8172f = 180.0f;
        tVar.f8173g = 90.0f;
        xVar.f8184f.add(tVar);
        r rVar = new r(tVar);
        xVar.a(180.0f);
        xVar.f8185g.add(rVar);
        xVar.f8182d = 270.0f;
        float f11 = (0.0f + f10) * 0.5f;
        float f12 = (f10 - 0.0f) / 2.0f;
        double d8 = 270.0f;
        xVar.f8180b = (((float) Math.cos(Math.toRadians(d8))) * f12) + f11;
        xVar.f8181c = (f12 * ((float) Math.sin(Math.toRadians(d8)))) + f11;
    }
}
