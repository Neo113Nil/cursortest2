package l2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final o f5886c = new o(r4.a.I(0), r4.a.I(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f5887a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5888b;

    public o(long j8, long j9) {
        this.f5887a = j8;
        this.f5888b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return m2.m.a(this.f5887a, oVar.f5887a) && m2.m.a(this.f5888b, oVar.f5888b);
    }

    public final int hashCode() {
        m2.n[] nVarArr = m2.m.f6326b;
        return Long.hashCode(this.f5888b) + (Long.hashCode(this.f5887a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) m2.m.d(this.f5887a)) + ", restLine=" + ((Object) m2.m.d(this.f5888b)) + ')';
    }
}
