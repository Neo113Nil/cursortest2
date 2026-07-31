package Q1;

import java.util.List;
import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final J1.c f3971a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3972b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3973c;

    public d(J1.c cVar, int i3, List list) {
        f2.j.f(cVar, "earnings");
        f2.j.f(list, "recent");
        this.f3971a = cVar;
        this.f3972b = i3;
        this.f3973c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f2.j.a(this.f3971a, dVar.f3971a) && this.f3972b == dVar.f3972b && f2.j.a(this.f3973c, dVar.f3973c);
    }

    public final int hashCode() {
        return this.f3973c.hashCode() + AbstractC0625j.a(this.f3972b, this.f3971a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DashboardState(earnings=" + this.f3971a + ", clientCount=" + this.f3972b + ", recent=" + this.f3973c + ")";
    }
}
