package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f2967a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f2968b;

    public j(String str, g0 g0Var) {
        this.f2967a = str;
        this.f2968b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return q6.i.a(this.f2967a, jVar.f2967a) && q6.i.a(this.f2968b, jVar.f2968b);
    }

    public final int hashCode() {
        int hashCode = this.f2967a.hashCode() * 31;
        g0 g0Var = this.f2968b;
        return (hashCode + (g0Var != null ? g0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Url(url=" + this.f2967a + ')';
    }
}
