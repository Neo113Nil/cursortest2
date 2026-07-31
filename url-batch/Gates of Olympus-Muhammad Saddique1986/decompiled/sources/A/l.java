package A;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f70a;

    /* renamed from: b, reason: collision with root package name */
    public String f71b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f72c = false;

    /* renamed from: d, reason: collision with root package name */
    public e f73d = null;

    public l(String str, String str2) {
        this.f70a = str;
        this.f71b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return f2.j.a(this.f70a, lVar.f70a) && f2.j.a(this.f71b, lVar.f71b) && this.f72c == lVar.f72c && f2.j.a(this.f73d, lVar.f73d);
    }

    public final int hashCode() {
        int e3 = k.e(k.d(this.f70a.hashCode() * 31, 31, this.f71b), 31, this.f72c);
        e eVar = this.f73d;
        return e3 + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f73d + ", isShowingSubstitution=" + this.f72c + ')';
    }
}
