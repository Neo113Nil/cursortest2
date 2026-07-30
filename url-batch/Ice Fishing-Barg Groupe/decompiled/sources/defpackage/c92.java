package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class c92 implements i8 {
    public final i8 PxuCJdSBwIXG;
    public final long lS5Rgt96tfkO;

    public c92(e80 e80Var, long j) {
        this.PxuCJdSBwIXG = e80Var;
        this.lS5Rgt96tfkO = j;
    }

    @Override // defpackage.i8
    public final sp2 PxuCJdSBwIXG(lm2 lm2Var) {
        return new d92(this.PxuCJdSBwIXG.PxuCJdSBwIXG(lm2Var), this.lS5Rgt96tfkO);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c92)) {
            return false;
        }
        c92 c92Var = (c92) obj;
        return c92Var.lS5Rgt96tfkO == this.lS5Rgt96tfkO && cs0.wdg6QnbFHrFF(c92Var.PxuCJdSBwIXG, this.PxuCJdSBwIXG);
    }

    public final int hashCode() {
        return Long.hashCode(this.lS5Rgt96tfkO) + (this.PxuCJdSBwIXG.hashCode() * 31);
    }
}
