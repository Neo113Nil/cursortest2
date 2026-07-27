package k;

/* renamed from: k.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0734J {

    /* renamed from: a, reason: collision with root package name */
    public final float f7262a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7263b;

    public C0734J(float f4, M0.b bVar) {
        this.f7262a = f4;
        float e4 = bVar.e();
        float f5 = K.f7264a;
        this.f7263b = e4 * 386.0878f * 160.0f * 0.84f;
    }

    public final C0733I a(float f4) {
        double b4 = b(f4);
        double d4 = K.f7264a;
        double d5 = d4 - 1.0d;
        return new C0733I(f4, (float) (Math.exp((d4 / d5) * b4) * this.f7262a * this.f7263b), (long) (Math.exp(b4 / d5) * 1000.0d));
    }

    public final double b(float f4) {
        float[] fArr = AbstractC0736b.f7274a;
        return Math.log((Math.abs(f4) * 0.35f) / (this.f7262a * this.f7263b));
    }
}
