package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class od {
    public final float PxuCJdSBwIXG;

    public od(float f) {
        this.PxuCJdSBwIXG = f;
    }

    public final int PxuCJdSBwIXG(int i, int i2) {
        return Math.round((1.0f + this.PxuCJdSBwIXG) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof od) && Float.compare(this.PxuCJdSBwIXG, ((od) obj).PxuCJdSBwIXG) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        return o0.cpQdD2nAriOS(new StringBuilder("Vertical(bias="), this.PxuCJdSBwIXG, ')');
    }
}
