package z0;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1076a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8942a;

    /* renamed from: b, reason: collision with root package name */
    public final L1.e f8943b;

    public C1076a(String str, L1.e eVar) {
        this.f8942a = str;
        this.f8943b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1076a)) {
            return false;
        }
        C1076a c1076a = (C1076a) obj;
        return Z1.i.a(this.f8942a, c1076a.f8942a) && Z1.i.a(this.f8943b, c1076a.f8943b);
    }

    public final int hashCode() {
        String str = this.f8942a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        L1.e eVar = this.f8943b;
        return hashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f8942a + ", action=" + this.f8943b + ')';
    }
}
