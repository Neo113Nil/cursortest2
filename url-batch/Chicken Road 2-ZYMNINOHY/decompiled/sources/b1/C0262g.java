package b1;

import android.text.Layout;

/* renamed from: b1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262g {

    /* renamed from: a, reason: collision with root package name */
    public String f5364a;

    /* renamed from: b, reason: collision with root package name */
    public int f5365b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5366c;

    /* renamed from: d, reason: collision with root package name */
    public int f5367d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5368e;

    /* renamed from: k, reason: collision with root package name */
    public float f5374k;

    /* renamed from: l, reason: collision with root package name */
    public String f5375l;
    public Layout.Alignment o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f5377p;

    /* renamed from: r, reason: collision with root package name */
    public C0257b f5379r;

    /* renamed from: t, reason: collision with root package name */
    public String f5381t;

    /* renamed from: u, reason: collision with root package name */
    public String f5382u;

    /* renamed from: f, reason: collision with root package name */
    public int f5369f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f5370g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f5371h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f5372i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f5373j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f5376m = -1;
    public int n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f5378q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f5380s = Float.MAX_VALUE;

    public final void a(C0262g c0262g) {
        int i4;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c0262g != null) {
            if (!this.f5366c && c0262g.f5366c) {
                this.f5365b = c0262g.f5365b;
                this.f5366c = true;
            }
            if (this.f5371h == -1) {
                this.f5371h = c0262g.f5371h;
            }
            if (this.f5372i == -1) {
                this.f5372i = c0262g.f5372i;
            }
            if (this.f5364a == null && (str = c0262g.f5364a) != null) {
                this.f5364a = str;
            }
            if (this.f5369f == -1) {
                this.f5369f = c0262g.f5369f;
            }
            if (this.f5370g == -1) {
                this.f5370g = c0262g.f5370g;
            }
            if (this.n == -1) {
                this.n = c0262g.n;
            }
            if (this.o == null && (alignment2 = c0262g.o) != null) {
                this.o = alignment2;
            }
            if (this.f5377p == null && (alignment = c0262g.f5377p) != null) {
                this.f5377p = alignment;
            }
            if (this.f5378q == -1) {
                this.f5378q = c0262g.f5378q;
            }
            if (this.f5373j == -1) {
                this.f5373j = c0262g.f5373j;
                this.f5374k = c0262g.f5374k;
            }
            if (this.f5379r == null) {
                this.f5379r = c0262g.f5379r;
            }
            if (this.f5380s == Float.MAX_VALUE) {
                this.f5380s = c0262g.f5380s;
            }
            if (this.f5381t == null) {
                this.f5381t = c0262g.f5381t;
            }
            if (this.f5382u == null) {
                this.f5382u = c0262g.f5382u;
            }
            if (!this.f5368e && c0262g.f5368e) {
                this.f5367d = c0262g.f5367d;
                this.f5368e = true;
            }
            if (this.f5376m != -1 || (i4 = c0262g.f5376m) == -1) {
                return;
            }
            this.f5376m = i4;
        }
    }
}
