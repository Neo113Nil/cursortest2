package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rx0 {
    public final int PxuCJdSBwIXG;
    public final int lS5Rgt96tfkO;

    public rx0(int i, int i2) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = i2;
        if (!(i >= 0)) {
            hp0.PxuCJdSBwIXG("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        hp0.PxuCJdSBwIXG("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx0)) {
            return false;
        }
        rx0 rx0Var = (rx0) obj;
        return this.PxuCJdSBwIXG == rx0Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == rx0Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return Integer.hashCode(this.lS5Rgt96tfkO) + (Integer.hashCode(this.PxuCJdSBwIXG) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", end=");
        return o0.r3s1LDPKFs1S(sb, this.lS5Rgt96tfkO, ')');
    }
}
