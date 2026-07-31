package C0;

import a.AbstractC0235a;
import java.util.List;
import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final C0031g f547a;

    /* renamed from: b, reason: collision with root package name */
    public final K f548b;

    /* renamed from: c, reason: collision with root package name */
    public final List f549c;

    /* renamed from: d, reason: collision with root package name */
    public final int f550d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f551e;

    /* renamed from: f, reason: collision with root package name */
    public final int f552f;

    /* renamed from: g, reason: collision with root package name */
    public final O0.b f553g;

    /* renamed from: h, reason: collision with root package name */
    public final O0.k f554h;

    /* renamed from: i, reason: collision with root package name */
    public final H0.d f555i;

    /* renamed from: j, reason: collision with root package name */
    public final long f556j;

    public G(C0031g c0031g, K k3, List list, int i3, boolean z3, int i4, O0.b bVar, O0.k kVar, H0.d dVar, long j3) {
        this.f547a = c0031g;
        this.f548b = k3;
        this.f549c = list;
        this.f550d = i3;
        this.f551e = z3;
        this.f552f = i4;
        this.f553g = bVar;
        this.f554h = kVar;
        this.f555i = dVar;
        this.f556j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g3 = (G) obj;
        return f2.j.a(this.f547a, g3.f547a) && f2.j.a(this.f548b, g3.f548b) && f2.j.a(this.f549c, g3.f549c) && this.f550d == g3.f550d && this.f551e == g3.f551e && AbstractC0235a.v(this.f552f, g3.f552f) && f2.j.a(this.f553g, g3.f553g) && this.f554h == g3.f554h && f2.j.a(this.f555i, g3.f555i) && O0.a.b(this.f556j, g3.f556j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f556j) + ((this.f555i.hashCode() + ((this.f554h.hashCode() + ((this.f553g.hashCode() + AbstractC0625j.a(this.f552f, A.k.e((((this.f549c.hashCode() + ((this.f548b.hashCode() + (this.f547a.hashCode() * 31)) * 31)) * 31) + this.f550d) * 31, 31, this.f551e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f547a);
        sb.append(", style=");
        sb.append(this.f548b);
        sb.append(", placeholders=");
        sb.append(this.f549c);
        sb.append(", maxLines=");
        sb.append(this.f550d);
        sb.append(", softWrap=");
        sb.append(this.f551e);
        sb.append(", overflow=");
        int i3 = this.f552f;
        sb.append((Object) (AbstractC0235a.v(i3, 1) ? "Clip" : AbstractC0235a.v(i3, 2) ? "Ellipsis" : AbstractC0235a.v(i3, 3) ? "Visible" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f553g);
        sb.append(", layoutDirection=");
        sb.append(this.f554h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f555i);
        sb.append(", constraints=");
        sb.append((Object) O0.a.k(this.f556j));
        sb.append(')');
        return sb.toString();
    }
}
