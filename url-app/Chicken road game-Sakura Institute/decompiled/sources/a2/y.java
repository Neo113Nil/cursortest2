package a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final x f464a;

    /* renamed from: b, reason: collision with root package name */
    public final w f465b;

    public y(x xVar, w wVar) {
        this.f464a = xVar;
        this.f465b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return r6.k.a(this.f465b, yVar.f465b) && r6.k.a(this.f464a, yVar.f464a);
    }

    public final int hashCode() {
        x xVar = this.f464a;
        int hashCode = (xVar != null ? xVar.hashCode() : 0) * 31;
        w wVar = this.f465b;
        return hashCode + (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f464a + ", paragraphSyle=" + this.f465b + ')';
    }
}
