package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class lk0 extends r61 {
    public final e81 PxuCJdSBwIXG;

    public lk0(e81 e81Var) {
        this.PxuCJdSBwIXG = e81Var;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        pk0 pk0Var = new pk0();
        pk0Var.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        return pk0Var;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        pk0 pk0Var = (pk0) m61Var;
        e81 e81Var = pk0Var.VhhvGxCb8gfr;
        e81 e81Var2 = this.PxuCJdSBwIXG;
        if (cs0.wdg6QnbFHrFF(e81Var, e81Var2)) {
            return;
        }
        pk0Var.fkblLSN2bAgv();
        pk0Var.VhhvGxCb8gfr = e81Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lk0) && cs0.wdg6QnbFHrFF(((lk0) obj).PxuCJdSBwIXG, this.PxuCJdSBwIXG);
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode() * 31;
    }
}
