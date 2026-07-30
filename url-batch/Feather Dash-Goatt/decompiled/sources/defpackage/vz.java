package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vz {
    public final float a;
    public final float b;

    public vz(float f, nr nrVar) {
        this.a = f;
        float k = nrVar.k();
        float f2 = wz.a;
        this.b = k * 386.0878f * 160.0f * 0.84f;
    }

    public final uz a(float f) {
        double b = b(f);
        double d = wz.a;
        double d2 = d - 1.0d;
        return new uz(f, (float) (Math.exp((d / d2) * b) * this.a * this.b), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = n5.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }
}
