package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xp implements wp {
    public final h03 b = bd3.P(125, 2, new l50(0.25f, 0.1f, 0.25f));

    @Override // defpackage.wp
    public final float a(float f, float f2, float f3) {
        float abs = Math.abs((f2 + f) - f);
        float f4 = (0.3f * f3) - (0.0f * abs);
        float f5 = f3 - f4;
        if ((abs <= f3) && f5 < abs) {
            f4 = f3 - abs;
        }
        return f - f4;
    }

    @Override // defpackage.wp
    public final md b() {
        return this.b;
    }
}
