package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fc1 {
    public static final ec1 Companion = new ec1();
    public final int PxuCJdSBwIXG;
    public final float TSizfFm2Yiuu;
    public final float Y1f8riQaR6yg;
    public final long e9gEMXR7LXtO;
    public final float lS5Rgt96tfkO;

    public fc1(int i, float f, float f2, float f3, long j) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = f;
        this.TSizfFm2Yiuu = f2;
        this.Y1f8riQaR6yg = f3;
        this.e9gEMXR7LXtO = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fc1.class == obj.getClass()) {
            fc1 fc1Var = (fc1) obj;
            return this.TSizfFm2Yiuu == fc1Var.TSizfFm2Yiuu && this.Y1f8riQaR6yg == fc1Var.Y1f8riQaR6yg && this.lS5Rgt96tfkO == fc1Var.lS5Rgt96tfkO && this.PxuCJdSBwIXG == fc1Var.PxuCJdSBwIXG && this.e9gEMXR7LXtO == fc1Var.e9gEMXR7LXtO;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e9gEMXR7LXtO) + o0.lS5Rgt96tfkO(this.PxuCJdSBwIXG, o0.PxuCJdSBwIXG(this.lS5Rgt96tfkO, o0.PxuCJdSBwIXG(this.Y1f8riQaR6yg, Float.hashCode(this.TSizfFm2Yiuu) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.TSizfFm2Yiuu + ", touchY=" + this.Y1f8riQaR6yg + ", progress=" + this.lS5Rgt96tfkO + ", swipeEdge=" + this.PxuCJdSBwIXG + ", frameTimeMillis=" + this.e9gEMXR7LXtO + ')';
    }
}
