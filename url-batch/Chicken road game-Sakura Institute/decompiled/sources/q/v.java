package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final s0.e f7368a;

    public v(s0.e eVar) {
        this.f7368a = eVar;
    }

    public final int a(int i7, m2.k kVar) {
        return this.f7368a.a(0, i7, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && r6.k.a(this.f7368a, ((v) obj).f7368a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f7368a.f8094a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f7368a + ')';
    }
}
