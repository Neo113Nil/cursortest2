package Z3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final R3.c f3775a;

    /* renamed from: b, reason: collision with root package name */
    public final R3.d f3776b;

    /* renamed from: c, reason: collision with root package name */
    public final g f3777c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3778d;

    public a(R3.c cVar, R3.d dVar, g gVar, int i2) {
        this.f3775a = cVar;
        this.f3776b = dVar;
        this.f3777c = gVar;
        this.f3778d = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3775a.equals(aVar.f3775a) && this.f3776b.equals(aVar.f3776b) && this.f3777c.equals(aVar.f3777c) && this.f3778d == aVar.f3778d) {
            Object obj2 = U3.b.f3171a;
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f3775a.hashCode() ^ 1000003) * 1000003) ^ this.f3776b.hashCode()) * 1000003) ^ this.f3777c.hashCode()) * 1000003) ^ this.f3778d) * 1000003) ^ U3.b.f3171a.hashCode();
    }

    public final String toString() {
        return "RegisteredView{instrumentSelector=" + this.f3775a + ", view=" + this.f3776b + "}";
    }
}
