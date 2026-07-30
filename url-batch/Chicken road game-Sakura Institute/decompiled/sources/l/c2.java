package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final q f5423a;

    /* renamed from: b, reason: collision with root package name */
    public final y f5424b;

    public c2(q qVar, y yVar) {
        this.f5423a = qVar;
        this.f5424b = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return r6.k.a(this.f5423a, c2Var.f5423a) && r6.k.a(this.f5424b, c2Var.f5424b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f5424b.hashCode() + (this.f5423a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f5423a + ", easing=" + this.f5424b + ", arcMode=ArcMode(value=0))";
    }
}
