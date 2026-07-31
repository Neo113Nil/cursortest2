package B0;

import H2.AbstractC0080b;
import a.AbstractC0157a;
import java.util.List;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final C0007d f384a;

    /* renamed from: b, reason: collision with root package name */
    public final C f385b;

    /* renamed from: c, reason: collision with root package name */
    public final List f386c;

    /* renamed from: d, reason: collision with root package name */
    public final int f387d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f388e;

    /* renamed from: f, reason: collision with root package name */
    public final int f389f;

    /* renamed from: g, reason: collision with root package name */
    public final M0.b f390g;

    /* renamed from: h, reason: collision with root package name */
    public final M0.j f391h;

    /* renamed from: i, reason: collision with root package name */
    public final F0.e f392i;

    /* renamed from: j, reason: collision with root package name */
    public final long f393j;

    public y(C0007d c0007d, C c3, List list, int i3, boolean z3, int i4, M0.b bVar, M0.j jVar, F0.e eVar, long j3) {
        this.f384a = c0007d;
        this.f385b = c3;
        this.f386c = list;
        this.f387d = i3;
        this.f388e = z3;
        this.f389f = i4;
        this.f390g = bVar;
        this.f391h = jVar;
        this.f392i = eVar;
        this.f393j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Z1.i.a(this.f384a, yVar.f384a) && Z1.i.a(this.f385b, yVar.f385b) && this.f386c.equals(yVar.f386c) && this.f387d == yVar.f387d && this.f388e == yVar.f388e && AbstractC0157a.y(this.f389f, yVar.f389f) && Z1.i.a(this.f390g, yVar.f390g) && this.f391h == yVar.f391h && Z1.i.a(this.f392i, yVar.f392i) && M0.a.b(this.f393j, yVar.f393j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f393j) + ((this.f392i.hashCode() + ((this.f391h.hashCode() + ((this.f390g.hashCode() + AbstractC0080b.b(this.f389f, AbstractC0080b.f((((this.f386c.hashCode() + ((this.f385b.hashCode() + (this.f384a.hashCode() * 31)) * 31)) * 31) + this.f387d) * 31, 31, this.f388e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f384a);
        sb.append(", style=");
        sb.append(this.f385b);
        sb.append(", placeholders=");
        sb.append(this.f386c);
        sb.append(", maxLines=");
        sb.append(this.f387d);
        sb.append(", softWrap=");
        sb.append(this.f388e);
        sb.append(", overflow=");
        int i3 = this.f389f;
        sb.append((Object) (AbstractC0157a.y(i3, 1) ? "Clip" : AbstractC0157a.y(i3, 2) ? "Ellipsis" : AbstractC0157a.y(i3, 3) ? "Visible" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f390g);
        sb.append(", layoutDirection=");
        sb.append(this.f391h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f392i);
        sb.append(", constraints=");
        sb.append((Object) M0.a.k(this.f393j));
        sb.append(')');
        return sb.toString();
    }
}
