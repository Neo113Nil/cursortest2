package D1;

/* loaded from: classes.dex */
public final class t implements v {

    /* renamed from: a, reason: collision with root package name */
    public final String f571a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f572b;

    public t(String str, boolean z3) {
        Z1.i.f(str, "url");
        this.f571a = str;
        this.f572b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Z1.i.a(this.f571a, tVar.f571a) && this.f572b == tVar.f572b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f572b) + (this.f571a.hashCode() * 31);
    }

    public final String toString() {
        return "Page(url=" + this.f571a + ", consent=" + this.f572b + ")";
    }
}
