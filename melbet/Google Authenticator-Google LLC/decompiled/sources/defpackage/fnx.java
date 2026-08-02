package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fnx extends fny {
    public final float a;

    public fnx() {
        super(null);
        this.a = -1.0f;
    }

    @Override // defpackage.fny
    public final void a(foq foqVar, float f, float f2) {
        float f3 = f2 * f;
        foqVar.e(f3, 180.0f, 90.0f);
        double d = f3;
        foqVar.d((float) (Math.sin(Math.toRadians(90.0d)) * d), (float) (Math.sin(Math.toRadians(0.0d)) * d));
    }
}
