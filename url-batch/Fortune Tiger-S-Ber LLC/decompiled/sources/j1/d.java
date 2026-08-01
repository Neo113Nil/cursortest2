package j1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2276a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2277b;

    public d(String str, String str2) {
        u2.c.e(str, "expression");
        u2.c.e(str2, "result");
        this.f2276a = str;
        this.f2277b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return u2.c.a(this.f2276a, dVar.f2276a) && u2.c.a(this.f2277b, dVar.f2277b);
    }

    public final int hashCode() {
        return this.f2277b.hashCode() + (this.f2276a.hashCode() * 31);
    }

    public final String toString() {
        return "HistoryEntry(expression=" + this.f2276a + ", result=" + this.f2277b + ")";
    }
}
