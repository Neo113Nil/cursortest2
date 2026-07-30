package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class os {
    public final long PxuCJdSBwIXG;
    public final long TSizfFm2Yiuu;
    public final long Y1f8riQaR6yg;
    public final long e9gEMXR7LXtO;
    public final long lS5Rgt96tfkO;

    public os(long j, long j2, long j3, long j4, long j5) {
        this.PxuCJdSBwIXG = j;
        this.lS5Rgt96tfkO = j2;
        this.TSizfFm2Yiuu = j3;
        this.Y1f8riQaR6yg = j4;
        this.e9gEMXR7LXtO = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof os)) {
            return false;
        }
        os osVar = (os) obj;
        return hl.TSizfFm2Yiuu(this.PxuCJdSBwIXG, osVar.PxuCJdSBwIXG) && hl.TSizfFm2Yiuu(this.lS5Rgt96tfkO, osVar.lS5Rgt96tfkO) && hl.TSizfFm2Yiuu(this.TSizfFm2Yiuu, osVar.TSizfFm2Yiuu) && hl.TSizfFm2Yiuu(this.Y1f8riQaR6yg, osVar.Y1f8riQaR6yg) && hl.TSizfFm2Yiuu(this.e9gEMXR7LXtO, osVar.e9gEMXR7LXtO);
    }

    public final int hashCode() {
        gl glVar = hl.Companion;
        return Long.hashCode(this.e9gEMXR7LXtO) + o0.TSizfFm2Yiuu(o0.TSizfFm2Yiuu(o0.TSizfFm2Yiuu(Long.hashCode(this.PxuCJdSBwIXG) * 31, 31, this.lS5Rgt96tfkO), 31, this.TSizfFm2Yiuu), 31, this.Y1f8riQaR6yg);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        o0.S9EYkSpbGuxq(this.PxuCJdSBwIXG, sb, ", textColor=");
        o0.S9EYkSpbGuxq(this.lS5Rgt96tfkO, sb, ", iconColor=");
        o0.S9EYkSpbGuxq(this.TSizfFm2Yiuu, sb, ", disabledTextColor=");
        o0.S9EYkSpbGuxq(this.Y1f8riQaR6yg, sb, ", disabledIconColor=");
        sb.append((Object) hl.OPXfSBeufaJ8(this.e9gEMXR7LXtO));
        sb.append(')');
        return sb.toString();
    }
}
