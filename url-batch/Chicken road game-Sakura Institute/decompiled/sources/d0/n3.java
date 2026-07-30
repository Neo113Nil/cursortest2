package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public final v.d f2227a;

    /* renamed from: b, reason: collision with root package name */
    public final v.d f2228b;

    /* renamed from: c, reason: collision with root package name */
    public final v.d f2229c;

    /* renamed from: d, reason: collision with root package name */
    public final v.d f2230d;

    /* renamed from: e, reason: collision with root package name */
    public final v.d f2231e;

    public n3() {
        v.d dVar = m3.f2181a;
        v.d dVar2 = m3.f2182b;
        v.d dVar3 = m3.f2183c;
        v.d dVar4 = m3.f2184d;
        v.d dVar5 = m3.f2185e;
        this.f2227a = dVar;
        this.f2228b = dVar2;
        this.f2229c = dVar3;
        this.f2230d = dVar4;
        this.f2231e = dVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return r6.k.a(this.f2227a, n3Var.f2227a) && r6.k.a(this.f2228b, n3Var.f2228b) && r6.k.a(this.f2229c, n3Var.f2229c) && r6.k.a(this.f2230d, n3Var.f2230d) && r6.k.a(this.f2231e, n3Var.f2231e);
    }

    public final int hashCode() {
        return this.f2231e.hashCode() + ((this.f2230d.hashCode() + ((this.f2229c.hashCode() + ((this.f2228b.hashCode() + (this.f2227a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f2227a + ", small=" + this.f2228b + ", medium=" + this.f2229c + ", large=" + this.f2230d + ", extraLarge=" + this.f2231e + ')';
    }
}
