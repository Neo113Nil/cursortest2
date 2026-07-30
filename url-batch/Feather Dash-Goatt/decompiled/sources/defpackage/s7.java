package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class s7 extends v7 {
    public float a;
    public float b;

    public s7(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.v7
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.v7
    public final int b() {
        return 2;
    }

    @Override // defpackage.v7
    public final v7 c() {
        return new s7(0.0f, 0.0f);
    }

    @Override // defpackage.v7
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.v7
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s7)) {
            return false;
        }
        s7 s7Var = (s7) obj;
        return s7Var.a == this.a && s7Var.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
