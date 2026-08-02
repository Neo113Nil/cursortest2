package T;

import E.AbstractC0005f;
import v2.f0;

/* loaded from: classes.dex */
public class Y {

    /* renamed from: a, reason: collision with root package name */
    public final int f2732a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2733b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2734c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2735d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2736e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2737f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2738g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2739h;

    /* renamed from: i, reason: collision with root package name */
    public final v2.I f2740i;

    /* renamed from: j, reason: collision with root package name */
    public final v2.I f2741j;

    /* renamed from: k, reason: collision with root package name */
    public final v2.I f2742k;

    /* renamed from: l, reason: collision with root package name */
    public final v2.I f2743l;

    /* renamed from: m, reason: collision with root package name */
    public final v2.I f2744m;
    public final int n;
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public final v2.I f2745p;

    /* renamed from: q, reason: collision with root package name */
    public final W f2746q;

    /* renamed from: r, reason: collision with root package name */
    public final v2.I f2747r;

    /* renamed from: s, reason: collision with root package name */
    public final v2.I f2748s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2749t;

    /* renamed from: u, reason: collision with root package name */
    public final f0 f2750u;
    public final v2.M v;

    static {
        new Y(new X());
        W.J.G(1);
        W.J.G(2);
        W.J.G(3);
        W.J.G(4);
        AbstractC0005f.s(5, 6, 7, 8, 9);
        AbstractC0005f.s(10, 11, 12, 13, 14);
        AbstractC0005f.s(15, 16, 17, 18, 19);
        AbstractC0005f.s(20, 21, 22, 23, 24);
        AbstractC0005f.s(25, 26, 27, 28, 29);
        AbstractC0005f.s(30, 31, 32, 33, 34);
        W.J.G(35);
        W.J.G(36);
        W.J.G(37);
        W.J.G(38);
    }

    public Y(X x4) {
        this.f2732a = x4.f2713a;
        this.f2733b = x4.f2714b;
        this.f2734c = x4.f2715c;
        this.f2735d = x4.f2716d;
        this.f2736e = x4.f2717e;
        this.f2737f = x4.f2718f;
        this.f2738g = x4.f2719g;
        this.f2739h = x4.f2720h;
        this.f2740i = x4.f2721i;
        this.f2741j = x4.f2722j;
        this.f2742k = x4.f2723k;
        this.f2743l = x4.f2724l;
        this.n = x4.n;
        this.f2744m = x4.f2725m;
        this.o = x4.o;
        this.f2745p = x4.f2726p;
        this.f2746q = x4.f2727q;
        this.f2747r = x4.f2728r;
        this.f2749t = x4.f2729s;
        this.f2748s = x4.f2730t;
        this.f2750u = f0.a(x4.f2731u);
        this.v = v2.M.k(x4.v);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Y y4 = (Y) obj;
        if (this.f2732a != y4.f2732a || this.f2733b != y4.f2733b || this.f2734c != y4.f2734c || this.f2735d != y4.f2735d || this.f2739h != y4.f2739h || this.f2736e != y4.f2736e || this.f2737f != y4.f2737f || this.f2738g != y4.f2738g || !this.f2740i.equals(y4.f2740i) || !this.f2741j.equals(y4.f2741j) || !this.f2742k.equals(y4.f2742k) || !this.f2743l.equals(y4.f2743l) || this.n != y4.n || !this.f2744m.equals(y4.f2744m) || this.o != y4.o || !this.f2745p.equals(y4.f2745p) || !this.f2746q.equals(y4.f2746q) || !this.f2748s.equals(y4.f2748s) || !this.f2747r.equals(y4.f2747r) || this.f2749t != y4.f2749t) {
            return false;
        }
        f0 f0Var = y4.f2750u;
        f0 f0Var2 = this.f2750u;
        f0Var2.getClass();
        return v2.r.f(f0Var2, f0Var) && this.v.equals(y4.v);
    }

    public int hashCode() {
        int hashCode = (this.f2745p.hashCode() + ((((this.f2744m.hashCode() + ((((this.f2743l.hashCode() + ((this.f2742k.hashCode() + ((this.f2741j.hashCode() + ((this.f2740i.hashCode() + ((((((((((((((((this.f2732a + 31) * 31) + this.f2733b) * 31) + this.f2734c) * 31) + this.f2735d) * 28629151) + (this.f2739h ? 1 : 0)) * 31) + this.f2736e) * 31) + this.f2737f) * 31) + (this.f2738g ? 1 : 0)) * 31)) * 31)) * 31)) * 961)) * 961) + this.n) * 31)) * 31) + this.o) * 31)) * 31;
        this.f2746q.getClass();
        return this.v.hashCode() + ((this.f2750u.hashCode() + ((this.f2748s.hashCode() + ((((this.f2747r.hashCode() + ((hashCode + 29791) * 961)) * 961) + (this.f2749t ? 1 : 0)) * 31)) * 887503681)) * 31);
    }
}
