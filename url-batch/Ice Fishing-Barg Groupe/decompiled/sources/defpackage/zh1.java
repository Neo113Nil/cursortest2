package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zh1 {
    public final long PxuCJdSBwIXG;
    public final oi1 lS5Rgt96tfkO;

    public zh1() {
        long Y1f8riQaR6yg = mm2.Y1f8riQaR6yg(4284900966L);
        oi1 oi1Var = new oi1(0.0f, 0.0f, 0.0f, 0.0f);
        this.PxuCJdSBwIXG = Y1f8riQaR6yg;
        this.lS5Rgt96tfkO = oi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zh1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        zh1 zh1Var = (zh1) obj;
        return hl.TSizfFm2Yiuu(this.PxuCJdSBwIXG, zh1Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, zh1Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        gl glVar = hl.Companion;
        return this.lS5Rgt96tfkO.hashCode() + (Long.hashCode(this.PxuCJdSBwIXG) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        o0.S9EYkSpbGuxq(this.PxuCJdSBwIXG, sb, ", drawPadding=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(')');
        return sb.toString();
    }
}
