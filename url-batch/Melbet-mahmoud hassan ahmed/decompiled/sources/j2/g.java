package j2;

import android.text.Layout;

/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private String f18132a;

    /* renamed from: b, reason: collision with root package name */
    private int f18133b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18134c;

    /* renamed from: d, reason: collision with root package name */
    private int f18135d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18136e;

    /* renamed from: k, reason: collision with root package name */
    private float f18142k;

    /* renamed from: l, reason: collision with root package name */
    private String f18143l;

    /* renamed from: o, reason: collision with root package name */
    private Layout.Alignment f18146o;

    /* renamed from: p, reason: collision with root package name */
    private Layout.Alignment f18147p;

    /* renamed from: r, reason: collision with root package name */
    private b f18149r;

    /* renamed from: f, reason: collision with root package name */
    private int f18137f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f18138g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f18139h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f18140i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f18141j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f18144m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f18145n = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f18148q = -1;

    /* renamed from: s, reason: collision with root package name */
    private float f18150s = Float.MAX_VALUE;

    private g r(g gVar, boolean z6) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f18134c && gVar.f18134c) {
                w(gVar.f18133b);
            }
            if (this.f18139h == -1) {
                this.f18139h = gVar.f18139h;
            }
            if (this.f18140i == -1) {
                this.f18140i = gVar.f18140i;
            }
            if (this.f18132a == null && (str = gVar.f18132a) != null) {
                this.f18132a = str;
            }
            if (this.f18137f == -1) {
                this.f18137f = gVar.f18137f;
            }
            if (this.f18138g == -1) {
                this.f18138g = gVar.f18138g;
            }
            if (this.f18145n == -1) {
                this.f18145n = gVar.f18145n;
            }
            if (this.f18146o == null && (alignment2 = gVar.f18146o) != null) {
                this.f18146o = alignment2;
            }
            if (this.f18147p == null && (alignment = gVar.f18147p) != null) {
                this.f18147p = alignment;
            }
            if (this.f18148q == -1) {
                this.f18148q = gVar.f18148q;
            }
            if (this.f18141j == -1) {
                this.f18141j = gVar.f18141j;
                this.f18142k = gVar.f18142k;
            }
            if (this.f18149r == null) {
                this.f18149r = gVar.f18149r;
            }
            if (this.f18150s == Float.MAX_VALUE) {
                this.f18150s = gVar.f18150s;
            }
            if (z6 && !this.f18136e && gVar.f18136e) {
                u(gVar.f18135d);
            }
            if (z6 && this.f18144m == -1 && (i7 = gVar.f18144m) != -1) {
                this.f18144m = i7;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f18143l = str;
        return this;
    }

    public g B(boolean z6) {
        this.f18140i = z6 ? 1 : 0;
        return this;
    }

    public g C(boolean z6) {
        this.f18137f = z6 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f18147p = alignment;
        return this;
    }

    public g E(int i7) {
        this.f18145n = i7;
        return this;
    }

    public g F(int i7) {
        this.f18144m = i7;
        return this;
    }

    public g G(float f7) {
        this.f18150s = f7;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f18146o = alignment;
        return this;
    }

    public g I(boolean z6) {
        this.f18148q = z6 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f18149r = bVar;
        return this;
    }

    public g K(boolean z6) {
        this.f18138g = z6 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f18136e) {
            return this.f18135d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f18134c) {
            return this.f18133b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f18132a;
    }

    public float e() {
        return this.f18142k;
    }

    public int f() {
        return this.f18141j;
    }

    public String g() {
        return this.f18143l;
    }

    public Layout.Alignment h() {
        return this.f18147p;
    }

    public int i() {
        return this.f18145n;
    }

    public int j() {
        return this.f18144m;
    }

    public float k() {
        return this.f18150s;
    }

    public int l() {
        int i7 = this.f18139h;
        if (i7 == -1 && this.f18140i == -1) {
            return -1;
        }
        return (i7 == 1 ? 1 : 0) | (this.f18140i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.f18146o;
    }

    public boolean n() {
        return this.f18148q == 1;
    }

    public b o() {
        return this.f18149r;
    }

    public boolean p() {
        return this.f18136e;
    }

    public boolean q() {
        return this.f18134c;
    }

    public boolean s() {
        return this.f18137f == 1;
    }

    public boolean t() {
        return this.f18138g == 1;
    }

    public g u(int i7) {
        this.f18135d = i7;
        this.f18136e = true;
        return this;
    }

    public g v(boolean z6) {
        this.f18139h = z6 ? 1 : 0;
        return this;
    }

    public g w(int i7) {
        this.f18133b = i7;
        this.f18134c = true;
        return this;
    }

    public g x(String str) {
        this.f18132a = str;
        return this;
    }

    public g y(float f7) {
        this.f18142k = f7;
        return this;
    }

    public g z(int i7) {
        this.f18141j = i7;
        return this;
    }
}
