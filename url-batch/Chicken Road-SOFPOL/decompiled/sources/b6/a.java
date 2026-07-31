package b6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1247a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1248b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1249c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1250d;

    /* renamed from: e, reason: collision with root package name */
    public final b f1251e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1252f;

    public a(String str, String str2, String str3, String str4, b bVar, boolean z3) {
        this.f1247a = str;
        this.f1248b = str2;
        this.f1249c = str3;
        this.f1250d = str4;
        this.f1251e = bVar;
        this.f1252f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return q6.i.a(this.f1247a, aVar.f1247a) && q6.i.a(this.f1248b, aVar.f1248b) && q6.i.a(this.f1249c, aVar.f1249c) && q6.i.a(this.f1250d, aVar.f1250d) && this.f1251e == aVar.f1251e && this.f1252f == aVar.f1252f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1252f) + ((this.f1251e.hashCode() + ((this.f1250d.hashCode() + ((this.f1249c.hashCode() + ((this.f1248b.hashCode() + (this.f1247a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Achievement(id=" + this.f1247a + ", title=" + this.f1248b + ", description=" + this.f1249c + ", emoji=" + this.f1250d + ", category=" + this.f1251e + ", isUnlocked=" + this.f1252f + ")";
    }
}
