package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lm implements n61 {
    public final n61 PxuCJdSBwIXG;
    public final n61 lS5Rgt96tfkO;

    public lm(n61 n61Var, n61 n61Var2) {
        this.PxuCJdSBwIXG = n61Var;
        this.lS5Rgt96tfkO = n61Var2;
    }

    @Override // defpackage.n61
    public final Object PxuCJdSBwIXG(pe0 pe0Var, Object obj) {
        return this.lS5Rgt96tfkO.PxuCJdSBwIXG(pe0Var, this.PxuCJdSBwIXG.PxuCJdSBwIXG(pe0Var, obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lm)) {
            return false;
        }
        lm lmVar = (lm) obj;
        return this.PxuCJdSBwIXG.equals(lmVar.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, lmVar.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return (this.lS5Rgt96tfkO.hashCode() * 31) + this.PxuCJdSBwIXG.hashCode();
    }

    @Override // defpackage.n61
    public final boolean lS5Rgt96tfkO(le0 le0Var) {
        return this.PxuCJdSBwIXG.lS5Rgt96tfkO(le0Var) && this.lS5Rgt96tfkO.lS5Rgt96tfkO(le0Var);
    }

    public final String toString() {
        return o0.QrzZRwfaDlRX(new StringBuilder("["), (String) PxuCJdSBwIXG(p7.dgRBjINgWbAK, ""), ']');
    }
}
