package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class l8 extends o8 {
    public float PxuCJdSBwIXG;
    public float lS5Rgt96tfkO;

    public l8(float f, float f2) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = f2;
    }

    @Override // defpackage.o8
    public final float PxuCJdSBwIXG(int i) {
        if (i == 0) {
            return this.PxuCJdSBwIXG;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.lS5Rgt96tfkO;
    }

    @Override // defpackage.o8
    public final o8 TSizfFm2Yiuu() {
        return new l8(0.0f, 0.0f);
    }

    @Override // defpackage.o8
    public final void Y1f8riQaR6yg() {
        this.PxuCJdSBwIXG = 0.0f;
        this.lS5Rgt96tfkO = 0.0f;
    }

    @Override // defpackage.o8
    public final void e9gEMXR7LXtO(float f, int i) {
        if (i == 0) {
            this.PxuCJdSBwIXG = f;
        } else {
            if (i != 1) {
                return;
            }
            this.lS5Rgt96tfkO = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l8)) {
            return false;
        }
        l8 l8Var = (l8) obj;
        return l8Var.PxuCJdSBwIXG == this.PxuCJdSBwIXG && l8Var.lS5Rgt96tfkO == this.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return Float.hashCode(this.lS5Rgt96tfkO) + (Float.hashCode(this.PxuCJdSBwIXG) * 31);
    }

    @Override // defpackage.o8
    public final int lS5Rgt96tfkO() {
        return 2;
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.PxuCJdSBwIXG + ", v2 = " + this.lS5Rgt96tfkO;
    }
}
