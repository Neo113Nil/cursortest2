package l2;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e extends h.a {
    @Override // h.a
    public final void v(x xVar, float f2, float f4) {
        float f5 = f4 * f2;
        xVar.d(f5, 180.0f, 90.0f);
        double d = f5;
        xVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d), (float) (Math.sin(Math.toRadians(0.0f)) * d));
    }
}
