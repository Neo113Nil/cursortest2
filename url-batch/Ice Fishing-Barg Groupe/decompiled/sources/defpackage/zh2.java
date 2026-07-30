package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zh2 {
    public static final yh2 Companion = new yh2();
    public static final zh2 TSizfFm2Yiuu = new zh2(ki0.tmVwIGCQF4zR(0), ki0.tmVwIGCQF4zR(0));
    public final long PxuCJdSBwIXG;
    public final long lS5Rgt96tfkO;

    public zh2(long j, long j2) {
        this.PxuCJdSBwIXG = j;
        this.lS5Rgt96tfkO = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh2)) {
            return false;
        }
        zh2 zh2Var = (zh2) obj;
        return hj2.PxuCJdSBwIXG(this.PxuCJdSBwIXG, zh2Var.PxuCJdSBwIXG) && hj2.PxuCJdSBwIXG(this.lS5Rgt96tfkO, zh2Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        gj2 gj2Var = hj2.Companion;
        return Long.hashCode(this.lS5Rgt96tfkO) + (Long.hashCode(this.PxuCJdSBwIXG) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) hj2.Y1f8riQaR6yg(this.PxuCJdSBwIXG)) + ", restLine=" + ((Object) hj2.Y1f8riQaR6yg(this.lS5Rgt96tfkO)) + ')';
    }
}
