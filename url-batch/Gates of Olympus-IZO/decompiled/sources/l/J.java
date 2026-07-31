package l;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final float f5441a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5442b;

    public J(float f3, M0.b bVar) {
        this.f5441a = f3;
        float a3 = bVar.a();
        float f4 = K.f5443a;
        this.f5442b = a3 * 386.0878f * 160.0f * 0.84f;
    }

    public final I a(float f3) {
        double b2 = b(f3);
        double d3 = K.f5443a;
        double d4 = d3 - 1.0d;
        return new I(f3, (float) (Math.exp((d3 / d4) * b2) * this.f5441a * this.f5442b), (long) (Math.exp(b2 / d4) * 1000.0d));
    }

    public final double b(float f3) {
        float[] fArr = AbstractC0557b.f5453a;
        return Math.log((Math.abs(f3) * 0.35f) / (this.f5441a * this.f5442b));
    }
}
