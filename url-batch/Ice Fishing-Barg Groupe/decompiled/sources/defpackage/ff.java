package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
final class ff extends r61 {
    public final hf PxuCJdSBwIXG;

    public ff(hf hfVar) {
        this.PxuCJdSBwIXG = hfVar;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        jf jfVar = new jf();
        jfVar.VhhvGxCb8gfr = this.PxuCJdSBwIXG;
        return jfVar;
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        jf jfVar = (jf) m61Var;
        hf hfVar = jfVar.VhhvGxCb8gfr;
        if (hfVar != null) {
            hfVar.PxuCJdSBwIXG.wdg6QnbFHrFF(jfVar);
        }
        hf hfVar2 = this.PxuCJdSBwIXG;
        if (hfVar2 != null) {
            hfVar2.PxuCJdSBwIXG.lS5Rgt96tfkO(jfVar);
        }
        jfVar.VhhvGxCb8gfr = hfVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ff) {
            return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, ((ff) obj).PxuCJdSBwIXG);
        }
        return false;
    }

    public final int hashCode() {
        return this.PxuCJdSBwIXG.hashCode();
    }
}
