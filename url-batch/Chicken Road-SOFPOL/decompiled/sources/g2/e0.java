package g2;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f2931a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f2932b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2933c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2934d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2935e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2936f;

    /* renamed from: g, reason: collision with root package name */
    public final r2.c f2937g;

    /* renamed from: h, reason: collision with root package name */
    public final r2.l f2938h;
    public final j2.d i;

    /* renamed from: j, reason: collision with root package name */
    public final long f2939j;

    public e0(e eVar, i0 i0Var, List list, int i, boolean z3, int i8, r2.c cVar, r2.l lVar, j2.d dVar, long j7) {
        this.f2931a = eVar;
        this.f2932b = i0Var;
        this.f2933c = list;
        this.f2934d = i;
        this.f2935e = z3;
        this.f2936f = i8;
        this.f2937g = cVar;
        this.f2938h = lVar;
        this.i = dVar;
        this.f2939j = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return q6.i.a(this.f2931a, e0Var.f2931a) && q6.i.a(this.f2932b, e0Var.f2932b) && this.f2933c.equals(e0Var.f2933c) && this.f2934d == e0Var.f2934d && this.f2935e == e0Var.f2935e && this.f2936f == e0Var.f2936f && q6.i.a(this.f2937g, e0Var.f2937g) && this.f2938h == e0Var.f2938h && q6.i.a(this.i, e0Var.i) && r2.a.b(this.f2939j, e0Var.f2939j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f2939j) + ((this.i.hashCode() + ((this.f2938h.hashCode() + ((this.f2937g.hashCode() + a0.q.b(this.f2936f, a0.q.d((((this.f2933c.hashCode() + a0.q.e(this.f2932b, this.f2931a.hashCode() * 31, 31)) * 31) + this.f2934d) * 31, 31, this.f2935e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f2931a);
        sb.append(", style=");
        sb.append(this.f2932b);
        sb.append(", placeholders=");
        sb.append(this.f2933c);
        sb.append(", maxLines=");
        sb.append(this.f2934d);
        sb.append(", softWrap=");
        sb.append(this.f2935e);
        sb.append(", overflow=");
        int i = this.f2936f;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f2937g);
        sb.append(", layoutDirection=");
        sb.append(this.f2938h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) r2.a.k(this.f2939j));
        sb.append(')');
        return sb.toString();
    }
}
