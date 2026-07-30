package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qm0 {
    public final float a;
    public final float b;

    public qm0(float f, ca0 ca0Var) {
        this.a = f;
        float d = ca0Var.d();
        float f2 = rm0.a;
        this.b = d * 386.0878f * 160.0f * 0.84f;
    }

    public final pm0 a(float f) {
        double b = b(f);
        double d = rm0.a;
        double d2 = d - 1.0d;
        return new pm0(f, (float) (Math.exp((d / d2) * b) * this.a * this.b), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = t9.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }
}
