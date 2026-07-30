package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x42 extends r61 {
    public final z42 PxuCJdSBwIXG;
    public final long TSizfFm2Yiuu;
    public final long Y1f8riQaR6yg;
    public final boolean lS5Rgt96tfkO;

    public x42(z42 z42Var, boolean z, long j, long j2) {
        this.PxuCJdSBwIXG = z42Var;
        this.lS5Rgt96tfkO = z;
        this.TSizfFm2Yiuu = j;
        this.Y1f8riQaR6yg = j2;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        return new vd(new y(20, this));
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        pd1 pd1Var;
        vd vdVar = (vd) m61Var;
        y yVar = new y(20, this);
        vdVar.VhhvGxCb8gfr = yVar;
        if (vdVar.rtx2ld2ELZv4.S9EYkSpbGuxq && (pd1Var = zv.POWyO8hTM6YC(vdVar, 2).S2OOm9zPNm0h) != null) {
            pd1Var.u(yVar, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x42)) {
            return false;
        }
        x42 x42Var = (x42) obj;
        return k10.lS5Rgt96tfkO(3.0f, 3.0f) && cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, x42Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == x42Var.lS5Rgt96tfkO && hl.TSizfFm2Yiuu(this.TSizfFm2Yiuu, x42Var.TSizfFm2Yiuu) && hl.TSizfFm2Yiuu(this.Y1f8riQaR6yg, x42Var.Y1f8riQaR6yg);
    }

    public final int hashCode() {
        int Y1f8riQaR6yg = o0.Y1f8riQaR6yg((this.PxuCJdSBwIXG.hashCode() + (Float.hashCode(3.0f) * 31)) * 31, 31, this.lS5Rgt96tfkO);
        gl glVar = hl.Companion;
        return Long.hashCode(this.Y1f8riQaR6yg) + o0.TSizfFm2Yiuu(Y1f8riQaR6yg, 31, this.TSizfFm2Yiuu);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) k10.TSizfFm2Yiuu(3.0f));
        sb.append(", shape=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", clip=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(", ambientColor=");
        o0.S9EYkSpbGuxq(this.TSizfFm2Yiuu, sb, ", spotColor=");
        sb.append((Object) hl.OPXfSBeufaJ8(this.Y1f8riQaR6yg));
        sb.append(')');
        return sb.toString();
    }
}
