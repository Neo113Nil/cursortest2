package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ab2 extends r61 {
    public final r10 PxuCJdSBwIXG;

    public ab2(r10 r10Var) {
        this.PxuCJdSBwIXG = r10Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        return new bb2(zv.QrzZRwfaDlRX, this.PxuCJdSBwIXG);
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        bb2 bb2Var = (bb2) m61Var;
        b5 b5Var = zv.QrzZRwfaDlRX;
        if (!cs0.wdg6QnbFHrFF(bb2Var.S2OOm9zPNm0h, b5Var)) {
            bb2Var.S2OOm9zPNm0h = b5Var;
            if (bb2Var.ZbWwgt3aGe7A) {
                bb2Var.fkblLSN2bAgv();
            }
        }
        bb2Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab2)) {
            return false;
        }
        ab2 ab2Var = (ab2) obj;
        b5 b5Var = zv.QrzZRwfaDlRX;
        return b5Var.equals(b5Var) && cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, ab2Var.PxuCJdSBwIXG);
    }

    public final int hashCode() {
        int Y1f8riQaR6yg = o0.Y1f8riQaR6yg(1022 * 31, 31, false);
        r10 r10Var = this.PxuCJdSBwIXG;
        return Y1f8riQaR6yg + (r10Var != null ? r10Var.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + zv.QrzZRwfaDlRX + ", overrideDescendants=false, touchBoundsExpansion=" + this.PxuCJdSBwIXG + ')';
    }
}
