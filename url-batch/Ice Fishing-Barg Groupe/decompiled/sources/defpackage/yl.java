package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yl implements rh2 {
    public final long PxuCJdSBwIXG;

    public yl(long j) {
        this.PxuCJdSBwIXG = j;
        if (j != 16) {
            return;
        }
        fp0.PxuCJdSBwIXG("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.rh2
    public final float PxuCJdSBwIXG() {
        return hl.Y1f8riQaR6yg(this.PxuCJdSBwIXG);
    }

    @Override // defpackage.rh2
    public final uf TSizfFm2Yiuu() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl) && hl.TSizfFm2Yiuu(this.PxuCJdSBwIXG, ((yl) obj).PxuCJdSBwIXG);
    }

    public final int hashCode() {
        gl glVar = hl.Companion;
        return Long.hashCode(this.PxuCJdSBwIXG);
    }

    @Override // defpackage.rh2
    public final long lS5Rgt96tfkO() {
        return this.PxuCJdSBwIXG;
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) hl.OPXfSBeufaJ8(this.PxuCJdSBwIXG)) + ')';
    }
}
