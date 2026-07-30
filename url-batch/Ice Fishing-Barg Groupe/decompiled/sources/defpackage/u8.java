package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class u8 {
    public final Object PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final String Y1f8riQaR6yg;
    public final int lS5Rgt96tfkO;

    public u8(int i, int i2, Object obj, String str) {
        this.PxuCJdSBwIXG = obj;
        this.lS5Rgt96tfkO = i;
        this.TSizfFm2Yiuu = i2;
        this.Y1f8riQaR6yg = str;
        if (i <= i2) {
            return;
        }
        fp0.PxuCJdSBwIXG("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, u8Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == u8Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == u8Var.TSizfFm2Yiuu && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, u8Var.Y1f8riQaR6yg);
    }

    public final int hashCode() {
        Object obj = this.PxuCJdSBwIXG;
        return this.Y1f8riQaR6yg.hashCode() + o0.lS5Rgt96tfkO(this.TSizfFm2Yiuu, o0.lS5Rgt96tfkO(this.lS5Rgt96tfkO, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", start=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(", end=");
        sb.append(this.TSizfFm2Yiuu);
        sb.append(", tag=");
        return o0.QrzZRwfaDlRX(sb, this.Y1f8riQaR6yg, ')');
    }

    public u8(int i, int i2, Object obj) {
        this(i, i2, obj, "");
    }
}
