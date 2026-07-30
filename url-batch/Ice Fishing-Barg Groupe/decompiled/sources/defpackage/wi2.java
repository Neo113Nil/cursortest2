package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wi2 {
    public final long PxuCJdSBwIXG;
    public final long lS5Rgt96tfkO;

    public wi2(long j, long j2) {
        this.PxuCJdSBwIXG = j;
        this.lS5Rgt96tfkO = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi2)) {
            return false;
        }
        wi2 wi2Var = (wi2) obj;
        return hl.TSizfFm2Yiuu(this.PxuCJdSBwIXG, wi2Var.PxuCJdSBwIXG) && hl.TSizfFm2Yiuu(this.lS5Rgt96tfkO, wi2Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        gl glVar = hl.Companion;
        return Long.hashCode(this.lS5Rgt96tfkO) + (Long.hashCode(this.PxuCJdSBwIXG) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        o0.S9EYkSpbGuxq(this.PxuCJdSBwIXG, sb, ", selectionBackgroundColor=");
        sb.append((Object) hl.OPXfSBeufaJ8(this.lS5Rgt96tfkO));
        sb.append(')');
        return sb.toString();
    }
}
