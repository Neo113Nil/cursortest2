package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f2961a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f2962b;

    public i(String str, g0 g0Var) {
        this.f2961a = str;
        this.f2962b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return q6.i.a(this.f2961a, iVar.f2961a) && q6.i.a(this.f2962b, iVar.f2962b);
    }

    public final int hashCode() {
        int hashCode = this.f2961a.hashCode() * 31;
        g0 g0Var = this.f2962b;
        return (hashCode + (g0Var != null ? g0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Clickable(tag=" + this.f2961a + ')';
    }
}
