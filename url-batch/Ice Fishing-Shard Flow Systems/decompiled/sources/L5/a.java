package L5;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final D5.c f1685a;

    /* renamed from: b, reason: collision with root package name */
    public final D5.d f1686b;

    /* renamed from: c, reason: collision with root package name */
    public final g f1687c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1688d;

    public a(D5.c cVar, D5.d dVar, g gVar, int i2) {
        this.f1685a = cVar;
        this.f1686b = dVar;
        this.f1687c = gVar;
        this.f1688d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f1685a.equals(aVar.f1685a) || !this.f1686b.equals(aVar.f1686b) || !this.f1687c.equals(aVar.f1687c) || this.f1688d != aVar.f1688d) {
            return false;
        }
        Object obj2 = G5.b.f844d;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((((((((this.f1685a.hashCode() ^ 1000003) * 1000003) ^ this.f1686b.hashCode()) * 1000003) ^ this.f1687c.hashCode()) * 1000003) ^ this.f1688d) * 1000003) ^ G5.b.f844d.hashCode();
    }

    public final String toString() {
        return "RegisteredView{instrumentSelector=" + this.f1685a + ", view=" + this.f1686b + "}";
    }
}
