package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nd {
    public final float PxuCJdSBwIXG;

    public nd(float f) {
        this.PxuCJdSBwIXG = f;
    }

    public final int PxuCJdSBwIXG(int i, int i2, cw0 cw0Var) {
        float f = (i2 - i) / 2.0f;
        cw0 cw0Var2 = cw0.rtx2ld2ELZv4;
        float f2 = this.PxuCJdSBwIXG;
        if (cw0Var != cw0Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nd) && Float.compare(this.PxuCJdSBwIXG, ((nd) obj).PxuCJdSBwIXG) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        return o0.cpQdD2nAriOS(new StringBuilder("Horizontal(bias="), this.PxuCJdSBwIXG, ')');
    }
}
