package C0;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final x f658a;

    /* renamed from: b, reason: collision with root package name */
    public final w f659b;

    public y(x xVar, w wVar) {
        this.f658a = xVar;
        this.f659b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return f2.j.a(this.f659b, yVar.f659b) && f2.j.a(this.f658a, yVar.f658a);
    }

    public final int hashCode() {
        x xVar = this.f658a;
        int hashCode = (xVar != null ? xVar.hashCode() : 0) * 31;
        w wVar = this.f659b;
        return hashCode + (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f658a + ", paragraphSyle=" + this.f659b + ')';
    }
}
