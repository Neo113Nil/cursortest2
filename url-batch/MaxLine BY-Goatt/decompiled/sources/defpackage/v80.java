package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v80 implements ff2 {
    public final /* synthetic */ w80 a;

    public v80(w80 w80Var) {
        this.a = w80Var;
    }

    @Override // defpackage.ff2
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        w80 w80Var = this.a;
        float floatValue = ((Number) w80Var.a.invoke(Float.valueOf(f))).floatValue();
        w80Var.e.setValue(Boolean.valueOf(floatValue > 0.0f));
        w80Var.f.setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
