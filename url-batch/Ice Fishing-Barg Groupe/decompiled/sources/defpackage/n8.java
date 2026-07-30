package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class n8 extends o8 {
    public float PxuCJdSBwIXG;
    public float TSizfFm2Yiuu;
    public float Y1f8riQaR6yg;
    public float lS5Rgt96tfkO;

    public n8(float f, float f2, float f3, float f4) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = f2;
        this.TSizfFm2Yiuu = f3;
        this.Y1f8riQaR6yg = f4;
    }

    @Override // defpackage.o8
    public final float PxuCJdSBwIXG(int i) {
        if (i == 0) {
            return this.PxuCJdSBwIXG;
        }
        if (i == 1) {
            return this.lS5Rgt96tfkO;
        }
        if (i == 2) {
            return this.TSizfFm2Yiuu;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.Y1f8riQaR6yg;
    }

    @Override // defpackage.o8
    public final o8 TSizfFm2Yiuu() {
        return new n8(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.o8
    public final void Y1f8riQaR6yg() {
        this.PxuCJdSBwIXG = 0.0f;
        this.lS5Rgt96tfkO = 0.0f;
        this.TSizfFm2Yiuu = 0.0f;
        this.Y1f8riQaR6yg = 0.0f;
    }

    @Override // defpackage.o8
    public final void e9gEMXR7LXtO(float f, int i) {
        if (i == 0) {
            this.PxuCJdSBwIXG = f;
            return;
        }
        if (i == 1) {
            this.lS5Rgt96tfkO = f;
        } else if (i == 2) {
            this.TSizfFm2Yiuu = f;
        } else {
            if (i != 3) {
                return;
            }
            this.Y1f8riQaR6yg = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n8)) {
            return false;
        }
        n8 n8Var = (n8) obj;
        return n8Var.PxuCJdSBwIXG == this.PxuCJdSBwIXG && n8Var.lS5Rgt96tfkO == this.lS5Rgt96tfkO && n8Var.TSizfFm2Yiuu == this.TSizfFm2Yiuu && n8Var.Y1f8riQaR6yg == this.Y1f8riQaR6yg;
    }

    public final int hashCode() {
        return Float.hashCode(this.Y1f8riQaR6yg) + o0.PxuCJdSBwIXG(this.TSizfFm2Yiuu, o0.PxuCJdSBwIXG(this.lS5Rgt96tfkO, Float.hashCode(this.PxuCJdSBwIXG) * 31, 31), 31);
    }

    @Override // defpackage.o8
    public final int lS5Rgt96tfkO() {
        return 4;
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.PxuCJdSBwIXG + ", v2 = " + this.lS5Rgt96tfkO + ", v3 = " + this.TSizfFm2Yiuu + ", v4 = " + this.Y1f8riQaR6yg;
    }
}
