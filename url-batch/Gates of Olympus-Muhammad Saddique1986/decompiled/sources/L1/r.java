package L1;

/* loaded from: classes.dex */
public final class r implements t {

    /* renamed from: a, reason: collision with root package name */
    public final String f3387a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3388b;

    public r(String str, boolean z3) {
        f2.j.f(str, "url");
        this.f3387a = str;
        this.f3388b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return f2.j.a(this.f3387a, rVar.f3387a) && this.f3388b == rVar.f3388b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3388b) + (this.f3387a.hashCode() * 31);
    }

    public final String toString() {
        return "Page(url=" + this.f3387a + ", consent=" + this.f3388b + ")";
    }
}
