package l;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final float f6462a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6463b;

    public K(float f3, O0.b bVar) {
        this.f6462a = f3;
        float a3 = bVar.a();
        float f4 = L.f6464a;
        this.f6463b = a3 * 386.0878f * 160.0f * 0.84f;
    }

    public final J a(float f3) {
        double b3 = b(f3);
        double d3 = L.f6464a;
        double d4 = d3 - 1.0d;
        return new J(f3, (float) (Math.exp((d3 / d4) * b3) * this.f6462a * this.f6463b), (long) (Math.exp(b3 / d4) * 1000.0d));
    }

    public final double b(float f3) {
        float[] fArr = AbstractC0576b.f6474a;
        return Math.log((Math.abs(f3) * 0.35f) / (this.f6462a * this.f6463b));
    }
}
