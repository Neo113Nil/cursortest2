package l2;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class l extends h.a {
    @Override // h.a
    public final void v(x xVar, float f2, float f4) {
        float f5 = f4 * f2;
        xVar.d(f5, 180.0f, 90.0f);
        float f6 = f5 * 2.0f;
        t tVar = new t(0.0f, 0.0f, f6, f6);
        tVar.f2657f = 180.0f;
        tVar.f2658g = 90.0f;
        xVar.f2668f.add(tVar);
        r rVar = new r(tVar);
        xVar.a(180.0f);
        xVar.f2669g.add(rVar);
        xVar.d = 270.0f;
        float f7 = (0.0f + f6) * 0.5f;
        float f8 = (f6 - 0.0f) / 2.0f;
        double d = 270.0f;
        xVar.f2665b = (((float) Math.cos(Math.toRadians(d))) * f8) + f7;
        xVar.f2666c = (f8 * ((float) Math.sin(Math.toRadians(d)))) + f7;
    }
}
