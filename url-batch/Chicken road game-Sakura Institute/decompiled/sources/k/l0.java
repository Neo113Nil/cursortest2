package k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f5237a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5238b;

    public l0(float f9, m2.b bVar) {
        this.f5237a = f9;
        float a3 = bVar.a();
        float f10 = m0.f5243a;
        this.f5238b = a3 * 386.0878f * 160.0f * 0.84f;
    }

    public final k0 a(float f9) {
        double b9 = b(f9);
        double d8 = m0.f5243a;
        double d9 = d8 - 1.0d;
        return new k0(f9, (float) (Math.exp((d8 / d9) * b9) * this.f5237a * this.f5238b), (long) (Math.exp(b9 / d9) * 1000.0d));
    }

    public final double b(float f9) {
        float[] fArr = b.f5175a;
        return Math.log((Math.abs(f9) * 0.35f) / (this.f5237a * this.f5238b));
    }
}
