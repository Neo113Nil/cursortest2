package A0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f88a;

    /* renamed from: b, reason: collision with root package name */
    public final R1.e f89b;

    public a(String str, R1.e eVar) {
        this.f88a = str;
        this.f89b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f2.j.a(this.f88a, aVar.f88a) && f2.j.a(this.f89b, aVar.f89b);
    }

    public final int hashCode() {
        String str = this.f88a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        R1.e eVar = this.f89b;
        return hashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f88a + ", action=" + this.f89b + ')';
    }
}
