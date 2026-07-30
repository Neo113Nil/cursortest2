package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fe {
    public w3 PxuCJdSBwIXG = null;
    public t0 lS5Rgt96tfkO = null;
    public ji TSizfFm2Yiuu = null;
    public r4 Y1f8riQaR6yg = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe)) {
            return false;
        }
        fe feVar = (fe) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, feVar.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, feVar.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, feVar.TSizfFm2Yiuu) && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, feVar.Y1f8riQaR6yg);
    }

    public final int hashCode() {
        w3 w3Var = this.PxuCJdSBwIXG;
        int hashCode = (w3Var == null ? 0 : w3Var.hashCode()) * 31;
        t0 t0Var = this.lS5Rgt96tfkO;
        int hashCode2 = (hashCode + (t0Var == null ? 0 : t0Var.hashCode())) * 31;
        ji jiVar = this.TSizfFm2Yiuu;
        int hashCode3 = (hashCode2 + (jiVar == null ? 0 : jiVar.hashCode())) * 31;
        r4 r4Var = this.Y1f8riQaR6yg;
        return hashCode3 + (r4Var != null ? r4Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.PxuCJdSBwIXG + ", canvas=" + this.lS5Rgt96tfkO + ", canvasDrawScope=" + this.TSizfFm2Yiuu + ", borderPath=" + this.Y1f8riQaR6yg + ')';
    }
}
