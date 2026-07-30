package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class z71 implements f71 {
    public final /* synthetic */ d81 a;
    public final /* synthetic */ b81 b;

    public z71(d81 d81Var, b81 b81Var) {
        this.a = d81Var;
        this.b = b81Var;
    }

    @Override // defpackage.f71
    public final float a(float f) {
        float abs = Math.abs(f);
        d81 d81Var = this.a;
        if (abs != 0.0f && !((Boolean) d81Var.h.invoke()).booleanValue()) {
            throw new xz("The fling animation was cancelled", 0);
        }
        return d81Var.d(d81Var.g(this.b.a(2, d81Var.e(d81Var.h(f)))));
    }
}
