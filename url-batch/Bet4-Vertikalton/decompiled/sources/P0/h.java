package P0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f693a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f694b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f695c;

    public h(String str, boolean z2, boolean z3) {
        d1.d.e(str, "name");
        this.f693a = str;
        this.f694b = z2;
        this.f695c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return d1.d.a(this.f693a, hVar.f693a) && this.f694b == hVar.f694b && this.f695c == hVar.f695c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f695c) + ((Boolean.hashCode(this.f694b) + (this.f693a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ChecklistRow(name=" + this.f693a + ", packed=" + this.f694b + ", isCustom=" + this.f695c + ")";
    }
}
