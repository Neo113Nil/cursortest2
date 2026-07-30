package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hk1 extends xk1 {
    public final float TSizfFm2Yiuu;

    public hk1(float f) {
        super(3);
        this.TSizfFm2Yiuu = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hk1) && Float.compare(this.TSizfFm2Yiuu, ((hk1) obj).TSizfFm2Yiuu) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.TSizfFm2Yiuu);
    }

    public final String toString() {
        return o0.cpQdD2nAriOS(new StringBuilder("HorizontalTo(x="), this.TSizfFm2Yiuu, ')');
    }
}
