package d2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2108a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.c f2109b;

    public a(String str, c6.c cVar) {
        this.f2108a = str;
        this.f2109b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return q6.i.a(this.f2108a, aVar.f2108a) && q6.i.a(this.f2109b, aVar.f2109b);
    }

    public final int hashCode() {
        String str = this.f2108a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        c6.c cVar = this.f2109b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f2108a + ", action=" + this.f2109b + ')';
    }
}
