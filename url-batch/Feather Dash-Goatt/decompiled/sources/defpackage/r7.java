package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class r7 extends v7 {
    public float a;

    public r7(float f) {
        this.a = f;
    }

    @Override // defpackage.v7
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.v7
    public final int b() {
        return 1;
    }

    @Override // defpackage.v7
    public final v7 c() {
        return new r7(0.0f);
    }

    @Override // defpackage.v7
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.v7
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r7) && ((r7) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
