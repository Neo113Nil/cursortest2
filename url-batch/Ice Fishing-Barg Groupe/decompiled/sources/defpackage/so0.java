package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class so0 implements i8 {
    public final km2 PxuCJdSBwIXG;

    public so0(km2 km2Var) {
        this.PxuCJdSBwIXG = km2Var;
        if (km2Var.PxuCJdSBwIXG == 0 && km2Var.lS5Rgt96tfkO == 0) {
            u9.XL4ISE6Oc65B("Animation to be infinitely repeated cannot have a 0-duration");
            throw null;
        }
    }

    @Override // defpackage.i8
    public final sp2 PxuCJdSBwIXG(lm2 lm2Var) {
        km2 km2Var = this.PxuCJdSBwIXG;
        return new wp2(new lm0(km2Var.PxuCJdSBwIXG, km2Var.lS5Rgt96tfkO, km2Var.TSizfFm2Yiuu));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof so0) && ((so0) obj).PxuCJdSBwIXG.equals(this.PxuCJdSBwIXG);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((uu1.rtx2ld2ELZv4.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31);
    }
}
