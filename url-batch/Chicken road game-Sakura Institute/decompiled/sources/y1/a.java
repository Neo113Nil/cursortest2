package y1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9793a;

    /* renamed from: b, reason: collision with root package name */
    public final d6.e f9794b;

    public a(String str, d6.e eVar) {
        this.f9793a = str;
        this.f9794b = eVar;
    }

    public final String a() {
        return this.f9793a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return r6.k.a(this.f9793a, aVar.f9793a) && r6.k.a(this.f9794b, aVar.f9794b);
    }

    public final int hashCode() {
        String str = this.f9793a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        d6.e eVar = this.f9794b;
        return hashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f9793a + ", action=" + this.f9794b + ')';
    }
}
