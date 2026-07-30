package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gu1 extends th0 {
    public final th0 TSizfFm2Yiuu;
    public final int Y1f8riQaR6yg;

    public gu1(th0 th0Var, int i) {
        this.TSizfFm2Yiuu = th0Var;
        this.Y1f8riQaR6yg = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gu1)) {
            return false;
        }
        gu1 gu1Var = (gu1) obj;
        return gu1Var.TSizfFm2Yiuu.equals(this.TSizfFm2Yiuu) && gu1Var.Y1f8riQaR6yg == this.Y1f8riQaR6yg;
    }

    public final int hashCode() {
        return this.TSizfFm2Yiuu.hashCode() + (this.Y1f8riQaR6yg * 31);
    }
}
