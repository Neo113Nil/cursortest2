package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10934a;

    /* renamed from: b, reason: collision with root package name */
    public int f10935b;

    /* renamed from: c, reason: collision with root package name */
    public int f10936c;

    /* renamed from: d, reason: collision with root package name */
    public long f10937d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10938e;

    /* renamed from: f, reason: collision with root package name */
    private final dr2 f10939f;

    /* renamed from: g, reason: collision with root package name */
    private final dr2 f10940g;

    /* renamed from: h, reason: collision with root package name */
    private int f10941h;

    /* renamed from: i, reason: collision with root package name */
    private int f10942i;

    public r0(dr2 dr2Var, dr2 dr2Var2, boolean z6) {
        this.f10940g = dr2Var;
        this.f10939f = dr2Var2;
        this.f10938e = z6;
        dr2Var2.f(12);
        this.f10934a = dr2Var2.v();
        dr2Var.f(12);
        this.f10942i = dr2Var.v();
        sc4.b(dr2Var.m() == 1, "first_chunk must be 1");
        this.f10935b = -1;
    }

    public final boolean a() {
        int i7 = this.f10935b + 1;
        this.f10935b = i7;
        if (i7 == this.f10934a) {
            return false;
        }
        this.f10937d = this.f10938e ? this.f10939f.B() : this.f10939f.A();
        if (this.f10935b == this.f10941h) {
            this.f10936c = this.f10940g.v();
            this.f10940g.g(4);
            int i8 = this.f10942i - 1;
            this.f10942i = i8;
            this.f10941h = i8 > 0 ? (-1) + this.f10940g.v() : -1;
        }
        return true;
    }
}
