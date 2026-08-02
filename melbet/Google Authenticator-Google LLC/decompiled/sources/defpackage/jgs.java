package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgs implements jgr {
    public final jhh a;
    public final int b;

    public jgs(jhh jhhVar, int i) {
        this.a = jhhVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgs)) {
            return false;
        }
        jgs jgsVar = (jgs) obj;
        return ksp.b(this.a, jgsVar.a) && this.b == jgsVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExpandableState(afterExpandOrCollapseAccessibility=");
        sb.append(this.a);
        sb.append(", state=");
        int i = this.b;
        sb.append((Object) (i != 1 ? i != 2 ? "EXPAND_STATE_EXPANDED" : "EXPAND_STATE_COLLAPSED" : "EXPAND_STATE_UNSPECIFIED"));
        sb.append(")");
        return sb.toString();
    }
}
