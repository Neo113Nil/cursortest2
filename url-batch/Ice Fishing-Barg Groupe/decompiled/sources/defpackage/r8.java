package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class r8 {
    public static final q8 Companion = new q8();
    public final Object PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final String Y1f8riQaR6yg;
    public final int lS5Rgt96tfkO;

    public r8(int i, int i2, Object obj, String str) {
        this.PxuCJdSBwIXG = obj;
        this.lS5Rgt96tfkO = i;
        this.TSizfFm2Yiuu = i2;
        this.Y1f8riQaR6yg = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8)) {
            return false;
        }
        r8 r8Var = (r8) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, r8Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == r8Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == r8Var.TSizfFm2Yiuu && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, r8Var.Y1f8riQaR6yg);
    }

    public final int hashCode() {
        Object obj = this.PxuCJdSBwIXG;
        return this.Y1f8riQaR6yg.hashCode() + o0.lS5Rgt96tfkO(this.TSizfFm2Yiuu, o0.lS5Rgt96tfkO(this.lS5Rgt96tfkO, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", start=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(", end=");
        sb.append(this.TSizfFm2Yiuu);
        sb.append(", tag=");
        return o0.QrzZRwfaDlRX(sb, this.Y1f8riQaR6yg, ')');
    }
}
