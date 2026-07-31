package J1;

import f2.j;
import java.util.List;
import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f3167a;

    /* renamed from: b, reason: collision with root package name */
    public final double f3168b;

    /* renamed from: c, reason: collision with root package name */
    public final double f3169c;

    /* renamed from: d, reason: collision with root package name */
    public final double f3170d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3171e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3172f;

    /* renamed from: g, reason: collision with root package name */
    public final double f3173g;

    /* renamed from: h, reason: collision with root package name */
    public final List f3174h;

    public c(double d3, double d4, double d5, double d6, int i3, int i4, double d7, List list) {
        this.f3167a = d3;
        this.f3168b = d4;
        this.f3169c = d5;
        this.f3170d = d6;
        this.f3171e = i3;
        this.f3172f = i4;
        this.f3173g = d7;
        this.f3174h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Double.compare(this.f3167a, cVar.f3167a) == 0 && Double.compare(this.f3168b, cVar.f3168b) == 0 && Double.compare(this.f3169c, cVar.f3169c) == 0 && Double.compare(this.f3170d, cVar.f3170d) == 0 && this.f3171e == cVar.f3171e && this.f3172f == cVar.f3172f && Double.compare(this.f3173g, cVar.f3173g) == 0 && j.a(this.f3174h, cVar.f3174h);
    }

    public final int hashCode() {
        return this.f3174h.hashCode() + ((Double.hashCode(this.f3173g) + AbstractC0625j.a(this.f3172f, AbstractC0625j.a(this.f3171e, (Double.hashCode(this.f3170d) + ((Double.hashCode(this.f3169c) + ((Double.hashCode(this.f3168b) + (Double.hashCode(this.f3167a) * 31)) * 31)) * 31)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "EarningsSummary(today=" + this.f3167a + ", week=" + this.f3168b + ", month=" + this.f3169c + ", allTime=" + this.f3170d + ", cutsToday=" + this.f3171e + ", cutsMonth=" + this.f3172f + ", averagePrice=" + this.f3173g + ", byService=" + this.f3174h + ")";
    }
}
