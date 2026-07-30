package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tk {
    public final float PxuCJdSBwIXG;
    public final float lS5Rgt96tfkO;

    public tk(float f, float f2) {
        this.PxuCJdSBwIXG = f;
        this.lS5Rgt96tfkO = f2;
    }

    public static boolean PxuCJdSBwIXG(Float f, Float f2) {
        return f.floatValue() <= f2.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tk)) {
            return false;
        }
        float f = this.PxuCJdSBwIXG;
        float f2 = this.lS5Rgt96tfkO;
        if (f > f2) {
            tk tkVar = (tk) obj;
            if (tkVar.PxuCJdSBwIXG > tkVar.lS5Rgt96tfkO) {
                return true;
            }
        }
        tk tkVar2 = (tk) obj;
        return f == tkVar2.PxuCJdSBwIXG && f2 == tkVar2.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        float f = this.PxuCJdSBwIXG;
        float f2 = this.lS5Rgt96tfkO;
        if (f > f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(f) * 31);
    }

    public final String toString() {
        return this.PxuCJdSBwIXG + ".." + this.lS5Rgt96tfkO;
    }
}
