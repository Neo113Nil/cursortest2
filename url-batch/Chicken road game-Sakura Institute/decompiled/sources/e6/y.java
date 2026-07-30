package e6;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f2829a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2830b;

    public y(int i7, Object obj) {
        this.f2829a = i7;
        this.f2830b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f2829a == yVar.f2829a && r6.k.a(this.f2830b, yVar.f2830b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f2829a) * 31;
        Object obj = this.f2830b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f2829a + ", value=" + this.f2830b + ')';
    }
}
