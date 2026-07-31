package b6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f1329a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1330b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1331c;

    public h(String str, String str2, String str3) {
        this.f1329a = str;
        this.f1330b = str2;
        this.f1331c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return q6.i.a(this.f1329a, hVar.f1329a) && q6.i.a(this.f1330b, hVar.f1330b) && q6.i.a(this.f1331c, hVar.f1331c);
    }

    public final int hashCode() {
        return this.f1331c.hashCode() + ((this.f1330b.hashCode() + (this.f1329a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Article(title=" + this.f1329a + ", emoji=" + this.f1330b + ", content=" + this.f1331c + ")";
    }
}
