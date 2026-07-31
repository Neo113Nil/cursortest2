package J1;

import f2.j;
import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3182a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3183b;

    /* renamed from: c, reason: collision with root package name */
    public final double f3184c;

    public e(String str, int i3, double d3) {
        this.f3182a = str;
        this.f3183b = i3;
        this.f3184c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return j.a(this.f3182a, eVar.f3182a) && this.f3183b == eVar.f3183b && Double.compare(this.f3184c, eVar.f3184c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f3184c) + AbstractC0625j.a(this.f3183b, this.f3182a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ServiceTotal(service=" + this.f3182a + ", count=" + this.f3183b + ", total=" + this.f3184c + ")";
    }
}
