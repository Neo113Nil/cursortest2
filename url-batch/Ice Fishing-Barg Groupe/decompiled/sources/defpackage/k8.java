package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class k8 extends o8 {
    public float PxuCJdSBwIXG;

    public k8(float f) {
        this.PxuCJdSBwIXG = f;
    }

    @Override // defpackage.o8
    public final float PxuCJdSBwIXG(int i) {
        if (i == 0) {
            return this.PxuCJdSBwIXG;
        }
        return 0.0f;
    }

    @Override // defpackage.o8
    public final o8 TSizfFm2Yiuu() {
        return new k8(0.0f);
    }

    @Override // defpackage.o8
    public final void Y1f8riQaR6yg() {
        this.PxuCJdSBwIXG = 0.0f;
    }

    @Override // defpackage.o8
    public final void e9gEMXR7LXtO(float f, int i) {
        if (i == 0) {
            this.PxuCJdSBwIXG = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k8) && ((k8) obj).PxuCJdSBwIXG == this.PxuCJdSBwIXG;
    }

    public final int hashCode() {
        return Float.hashCode(this.PxuCJdSBwIXG);
    }

    @Override // defpackage.o8
    public final int lS5Rgt96tfkO() {
        return 1;
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.PxuCJdSBwIXG;
    }
}
