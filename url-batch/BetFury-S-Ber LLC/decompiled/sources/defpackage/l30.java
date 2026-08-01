package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class l30 extends n9 {
    public final g30 s;

    public l30(g30 g30Var) {
        g30Var.getClass();
        this.s = g30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && l30.class == obj.getClass() && mv.c(this.s, ((l30) obj).s);
    }

    public final int hashCode() {
        return this.s.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.s + ", direction=-1)";
    }
}
