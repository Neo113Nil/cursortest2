package a2;

import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f377a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f378b;

    /* renamed from: c, reason: collision with root package name */
    public final List f379c;

    /* renamed from: d, reason: collision with root package name */
    public final int f380d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f381e;

    /* renamed from: f, reason: collision with root package name */
    public final int f382f;

    /* renamed from: g, reason: collision with root package name */
    public final m2.b f383g;

    /* renamed from: h, reason: collision with root package name */
    public final m2.k f384h;

    /* renamed from: i, reason: collision with root package name */
    public final f2.d f385i;

    /* renamed from: j, reason: collision with root package name */
    public final long f386j;

    public g0(g gVar, k0 k0Var, List list, int i7, boolean z8, int i8, m2.b bVar, m2.k kVar, f2.d dVar, long j8) {
        this.f377a = gVar;
        this.f378b = k0Var;
        this.f379c = list;
        this.f380d = i7;
        this.f381e = z8;
        this.f382f = i8;
        this.f383g = bVar;
        this.f384h = kVar;
        this.f385i = dVar;
        this.f386j = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return r6.k.a(this.f377a, g0Var.f377a) && r6.k.a(this.f378b, g0Var.f378b) && r6.k.a(this.f379c, g0Var.f379c) && this.f380d == g0Var.f380d && this.f381e == g0Var.f381e && this.f382f == g0Var.f382f && r6.k.a(this.f383g, g0Var.f383g) && this.f384h == g0Var.f384h && r6.k.a(this.f385i, g0Var.f385i) && m2.a.b(this.f386j, g0Var.f386j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f386j) + ((this.f385i.hashCode() + ((this.f384h.hashCode() + ((this.f383g.hashCode() + l.h.c(this.f382f, a0.m.e((((this.f379c.hashCode() + ((this.f378b.hashCode() + (this.f377a.hashCode() * 31)) * 31)) * 31) + this.f380d) * 31, 31, this.f381e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f377a);
        sb.append(", style=");
        sb.append(this.f378b);
        sb.append(", placeholders=");
        sb.append(this.f379c);
        sb.append(", maxLines=");
        sb.append(this.f380d);
        sb.append(", softWrap=");
        sb.append(this.f381e);
        sb.append(", overflow=");
        int i7 = this.f382f;
        sb.append((Object) (i7 == 1 ? "Clip" : i7 == 2 ? "Ellipsis" : i7 == 3 ? "Visible" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f383g);
        sb.append(", layoutDirection=");
        sb.append(this.f384h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f385i);
        sb.append(", constraints=");
        sb.append((Object) m2.a.k(this.f386j));
        sb.append(')');
        return sb.toString();
    }
}
