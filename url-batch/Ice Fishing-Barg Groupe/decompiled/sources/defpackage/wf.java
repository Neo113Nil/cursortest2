package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wf implements rh2 {
    public final vf PxuCJdSBwIXG;
    public final float lS5Rgt96tfkO;

    public wf(vf vfVar, float f) {
        this.PxuCJdSBwIXG = vfVar;
        this.lS5Rgt96tfkO = f;
    }

    @Override // defpackage.rh2
    public final float PxuCJdSBwIXG() {
        return this.lS5Rgt96tfkO;
    }

    @Override // defpackage.rh2
    public final uf TSizfFm2Yiuu() {
        return this.PxuCJdSBwIXG;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf)) {
            return false;
        }
        wf wfVar = (wf) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, wfVar.PxuCJdSBwIXG) && Float.compare(this.lS5Rgt96tfkO, wfVar.lS5Rgt96tfkO) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.lS5Rgt96tfkO) + (this.PxuCJdSBwIXG.hashCode() * 31);
    }

    @Override // defpackage.rh2
    public final long lS5Rgt96tfkO() {
        hl.Companion.getClass();
        return hl.RAsUl2FVSrh6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", alpha=");
        return o0.cpQdD2nAriOS(sb, this.lS5Rgt96tfkO, ')');
    }
}
