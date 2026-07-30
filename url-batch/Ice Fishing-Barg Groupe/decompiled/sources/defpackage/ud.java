package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class ud extends r61 {
    public final le0 PxuCJdSBwIXG;

    public ud(le0 le0Var) {
        this.PxuCJdSBwIXG = le0Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        return new vd(this.PxuCJdSBwIXG);
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        pd1 pd1Var;
        vd vdVar = (vd) m61Var;
        le0 le0Var = this.PxuCJdSBwIXG;
        vdVar.VhhvGxCb8gfr = le0Var;
        if (vdVar.rtx2ld2ELZv4.S9EYkSpbGuxq && (pd1Var = zv.POWyO8hTM6YC(vdVar, 2).S2OOm9zPNm0h) != null) {
            pd1Var.u(le0Var, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ud) {
            return this.PxuCJdSBwIXG == ((ud) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode();
    }
}
