package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class od extends sd {
    public float a;

    public od(float f) {
        this.a = f;
    }

    @Override // defpackage.sd
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.sd
    public final int b() {
        return 1;
    }

    @Override // defpackage.sd
    public final sd c() {
        return new od(0.0f);
    }

    @Override // defpackage.sd
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.sd
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof od) && ((od) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
