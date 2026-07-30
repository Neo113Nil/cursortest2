package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class r11 implements mc0 {
    public final float PxuCJdSBwIXG;

    public r11(float f) {
        this.PxuCJdSBwIXG = f;
    }

    @Override // defpackage.mc0
    public final float PxuCJdSBwIXG(float f) {
        return f / this.PxuCJdSBwIXG;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r11) && Float.compare(this.PxuCJdSBwIXG, ((r11) obj).PxuCJdSBwIXG) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.PxuCJdSBwIXG);
    }

    @Override // defpackage.mc0
    public final float lS5Rgt96tfkO(float f) {
        return f * this.PxuCJdSBwIXG;
    }

    public final String toString() {
        return o0.cpQdD2nAriOS(new StringBuilder("LinearFontScaleConverter(fontScale="), this.PxuCJdSBwIXG, ')');
    }
}
