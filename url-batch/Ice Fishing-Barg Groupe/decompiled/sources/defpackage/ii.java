package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ii {
    public hy PxuCJdSBwIXG;
    public gi TSizfFm2Yiuu;
    public long Y1f8riQaR6yg;
    public cw0 lS5Rgt96tfkO;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii)) {
            return false;
        }
        ii iiVar = (ii) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, iiVar.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == iiVar.lS5Rgt96tfkO && cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, iiVar.TSizfFm2Yiuu) && a62.PxuCJdSBwIXG(this.Y1f8riQaR6yg, iiVar.Y1f8riQaR6yg);
    }

    public final int hashCode() {
        return Long.hashCode(this.Y1f8riQaR6yg) + ((this.TSizfFm2Yiuu.hashCode() + ((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.PxuCJdSBwIXG + ", layoutDirection=" + this.lS5Rgt96tfkO + ", canvas=" + this.TSizfFm2Yiuu + ", size=" + ((Object) a62.Y1f8riQaR6yg(this.Y1f8riQaR6yg)) + ')';
    }
}
