package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class li {
    public final long PxuCJdSBwIXG;
    public final long TSizfFm2Yiuu;
    public final long Y1f8riQaR6yg;
    public final long lS5Rgt96tfkO;

    public li(long j, long j2, long j3, long j4) {
        this.PxuCJdSBwIXG = j;
        this.lS5Rgt96tfkO = j2;
        this.TSizfFm2Yiuu = j3;
        this.Y1f8riQaR6yg = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof li)) {
            return false;
        }
        li liVar = (li) obj;
        return hl.TSizfFm2Yiuu(this.PxuCJdSBwIXG, liVar.PxuCJdSBwIXG) && hl.TSizfFm2Yiuu(this.lS5Rgt96tfkO, liVar.lS5Rgt96tfkO) && hl.TSizfFm2Yiuu(this.TSizfFm2Yiuu, liVar.TSizfFm2Yiuu) && hl.TSizfFm2Yiuu(this.Y1f8riQaR6yg, liVar.Y1f8riQaR6yg);
    }

    public final int hashCode() {
        gl glVar = hl.Companion;
        return Long.hashCode(this.Y1f8riQaR6yg) + o0.TSizfFm2Yiuu(o0.TSizfFm2Yiuu(Long.hashCode(this.PxuCJdSBwIXG) * 31, 31, this.lS5Rgt96tfkO), 31, this.TSizfFm2Yiuu);
    }
}
