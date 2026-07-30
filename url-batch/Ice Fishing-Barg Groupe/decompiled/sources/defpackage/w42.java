package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class w42 {
    public static final v42 Companion = new v42();
    public static final w42 Y1f8riQaR6yg;
    public final long PxuCJdSBwIXG;
    public final float TSizfFm2Yiuu;
    public final long lS5Rgt96tfkO;

    static {
        long Y1f8riQaR6yg2 = mm2.Y1f8riQaR6yg(4278190080L);
        bf1.Companion.getClass();
        Y1f8riQaR6yg = new w42(0.0f, Y1f8riQaR6yg2, 0L);
    }

    public w42(float f, long j, long j2) {
        this.PxuCJdSBwIXG = j;
        this.lS5Rgt96tfkO = j2;
        this.TSizfFm2Yiuu = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w42)) {
            return false;
        }
        w42 w42Var = (w42) obj;
        return hl.TSizfFm2Yiuu(this.PxuCJdSBwIXG, w42Var.PxuCJdSBwIXG) && bf1.lS5Rgt96tfkO(this.lS5Rgt96tfkO, w42Var.lS5Rgt96tfkO) && this.TSizfFm2Yiuu == w42Var.TSizfFm2Yiuu;
    }

    public final int hashCode() {
        gl glVar = hl.Companion;
        return Float.hashCode(this.TSizfFm2Yiuu) + o0.TSizfFm2Yiuu(Long.hashCode(this.PxuCJdSBwIXG) * 31, 31, this.lS5Rgt96tfkO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        o0.S9EYkSpbGuxq(this.PxuCJdSBwIXG, sb, ", offset=");
        sb.append((Object) bf1.RAsUl2FVSrh6(this.lS5Rgt96tfkO));
        sb.append(", blurRadius=");
        return o0.cpQdD2nAriOS(sb, this.TSizfFm2Yiuu, ')');
    }
}
