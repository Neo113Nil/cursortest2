package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fl1 implements eu {
    public final float PxuCJdSBwIXG;

    public fl1(float f) {
        this.PxuCJdSBwIXG = f;
        if (f < 0.0f || f > 100.0f) {
            hp0.PxuCJdSBwIXG("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.eu
    public final float PxuCJdSBwIXG(long j, hy hyVar) {
        return (this.PxuCJdSBwIXG / 100.0f) * a62.lS5Rgt96tfkO(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fl1) && Float.compare(this.PxuCJdSBwIXG, ((fl1) obj).PxuCJdSBwIXG) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        return "CornerSize(size = " + this.PxuCJdSBwIXG + "%)";
    }
}
