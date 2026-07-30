package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ur {
    public final int PxuCJdSBwIXG;
    public final vr TSizfFm2Yiuu;
    public final b42 Y1f8riQaR6yg;
    public final long lS5Rgt96tfkO;

    public ur(int i, long j, vr vrVar, b42 b42Var) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = j;
        this.TSizfFm2Yiuu = vrVar;
        this.Y1f8riQaR6yg = b42Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur)) {
            return false;
        }
        ur urVar = (ur) obj;
        return this.PxuCJdSBwIXG == urVar.PxuCJdSBwIXG && this.lS5Rgt96tfkO == urVar.lS5Rgt96tfkO && this.TSizfFm2Yiuu == urVar.TSizfFm2Yiuu && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, urVar.Y1f8riQaR6yg);
    }

    public final int hashCode() {
        int hashCode = (this.TSizfFm2Yiuu.hashCode() + o0.TSizfFm2Yiuu(Integer.hashCode(this.PxuCJdSBwIXG) * 31, 31, this.lS5Rgt96tfkO)) * 31;
        b42 b42Var = this.Y1f8riQaR6yg;
        return hashCode + (b42Var == null ? 0 : b42Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.PxuCJdSBwIXG + ", timestamp=" + this.lS5Rgt96tfkO + ", type=" + this.TSizfFm2Yiuu + ", structureCompat=" + this.Y1f8riQaR6yg + ')';
    }
}
