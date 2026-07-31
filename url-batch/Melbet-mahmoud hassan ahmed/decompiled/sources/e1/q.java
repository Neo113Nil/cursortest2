package e1;

import o2.a0;

/* loaded from: classes.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    public c f15986a;

    /* renamed from: b, reason: collision with root package name */
    public long f15987b;

    /* renamed from: c, reason: collision with root package name */
    public long f15988c;

    /* renamed from: d, reason: collision with root package name */
    public long f15989d;

    /* renamed from: e, reason: collision with root package name */
    public int f15990e;

    /* renamed from: f, reason: collision with root package name */
    public int f15991f;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15997l;

    /* renamed from: n, reason: collision with root package name */
    public p f15999n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16001p;

    /* renamed from: q, reason: collision with root package name */
    public long f16002q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16003r;

    /* renamed from: g, reason: collision with root package name */
    public long[] f15992g = new long[0];

    /* renamed from: h, reason: collision with root package name */
    public int[] f15993h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public int[] f15994i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public long[] f15995j = new long[0];

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f15996k = new boolean[0];

    /* renamed from: m, reason: collision with root package name */
    public boolean[] f15998m = new boolean[0];

    /* renamed from: o, reason: collision with root package name */
    public final a0 f16000o = new a0();

    public void a(a0 a0Var) {
        a0Var.j(this.f16000o.d(), 0, this.f16000o.f());
        this.f16000o.O(0);
        this.f16001p = false;
    }

    public void b(w0.m mVar) {
        mVar.readFully(this.f16000o.d(), 0, this.f16000o.f());
        this.f16000o.O(0);
        this.f16001p = false;
    }

    public long c(int i7) {
        return this.f15995j[i7];
    }

    public void d(int i7) {
        this.f16000o.K(i7);
        this.f15997l = true;
        this.f16001p = true;
    }

    public void e(int i7, int i8) {
        this.f15990e = i7;
        this.f15991f = i8;
        if (this.f15993h.length < i7) {
            this.f15992g = new long[i7];
            this.f15993h = new int[i7];
        }
        if (this.f15994i.length < i8) {
            int i9 = (i8 * 125) / 100;
            this.f15994i = new int[i9];
            this.f15995j = new long[i9];
            this.f15996k = new boolean[i9];
            this.f15998m = new boolean[i9];
        }
    }

    public void f() {
        this.f15990e = 0;
        this.f16002q = 0L;
        this.f16003r = false;
        this.f15997l = false;
        this.f16001p = false;
        this.f15999n = null;
    }

    public boolean g(int i7) {
        return this.f15997l && this.f15998m[i7];
    }
}
