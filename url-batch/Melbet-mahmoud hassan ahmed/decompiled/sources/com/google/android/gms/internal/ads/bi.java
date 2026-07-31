package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class bi {

    /* renamed from: a, reason: collision with root package name */
    public final int f3431a;

    /* renamed from: b, reason: collision with root package name */
    public int f3432b;

    /* renamed from: c, reason: collision with root package name */
    public int f3433c;

    /* renamed from: d, reason: collision with root package name */
    public long f3434d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f3435e;

    /* renamed from: f, reason: collision with root package name */
    private final rm f3436f;

    /* renamed from: g, reason: collision with root package name */
    private final rm f3437g;

    /* renamed from: h, reason: collision with root package name */
    private int f3438h;

    /* renamed from: i, reason: collision with root package name */
    private int f3439i;

    public bi(rm rmVar, rm rmVar2, boolean z6) {
        this.f3437g = rmVar;
        this.f3436f = rmVar2;
        this.f3435e = z6;
        rmVar2.v(12);
        this.f3431a = rmVar2.i();
        rmVar.v(12);
        this.f3439i = rmVar.i();
        jm.f(rmVar.e() == 1, "first_chunk must be 1");
        this.f3432b = -1;
    }

    public final boolean a() {
        int i7 = this.f3432b + 1;
        this.f3432b = i7;
        if (i7 == this.f3431a) {
            return false;
        }
        this.f3434d = this.f3435e ? this.f3436f.n() : this.f3436f.m();
        if (this.f3432b == this.f3438h) {
            this.f3433c = this.f3437g.i();
            this.f3437g.w(4);
            int i8 = this.f3439i - 1;
            this.f3439i = i8;
            this.f3438h = i8 > 0 ? (-1) + this.f3437g.i() : -1;
        }
        return true;
    }
}
