package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pd extends sd {
    public float a;
    public float b;

    public pd(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.sd
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // defpackage.sd
    public final int b() {
        return 2;
    }

    @Override // defpackage.sd
    public final sd c() {
        return new pd(0.0f, 0.0f);
    }

    @Override // defpackage.sd
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.sd
    public final void e(int i, float f) {
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
        if (!(obj instanceof pd)) {
            return false;
        }
        pd pdVar = (pd) obj;
        return pdVar.a == this.a && pdVar.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
