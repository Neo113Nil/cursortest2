package J1;

import f2.j;
import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f3164a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3165b;

    /* renamed from: c, reason: collision with root package name */
    public final double f3166c;

    public b(a aVar, int i3, double d3) {
        this.f3164a = aVar;
        this.f3165b = i3;
        this.f3166c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f3164a, bVar.f3164a) && this.f3165b == bVar.f3165b && Double.compare(this.f3166c, bVar.f3166c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f3166c) + AbstractC0625j.a(this.f3165b, this.f3164a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ClientStats(client=" + this.f3164a + ", visitCount=" + this.f3165b + ", totalSpent=" + this.f3166c + ")";
    }
}
