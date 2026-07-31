package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class ge implements cf, df {

    /* renamed from: a, reason: collision with root package name */
    private final int f5566a;

    /* renamed from: b, reason: collision with root package name */
    private ef f5567b;

    /* renamed from: c, reason: collision with root package name */
    private int f5568c;

    /* renamed from: d, reason: collision with root package name */
    private int f5569d;

    /* renamed from: e, reason: collision with root package name */
    private uk f5570e;

    /* renamed from: f, reason: collision with root package name */
    private long f5571f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5572g = true;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5573h;

    public ge(int i7) {
        this.f5566a = i7;
    }

    @Override // com.google.android.gms.internal.ads.cf
    public final void C() {
        jm.e(this.f5569d == 1);
        this.f5569d = 2;
        s();
    }

    @Override // com.google.android.gms.internal.ads.cf
    public final boolean G() {
        return this.f5572g;
    }

    @Override // com.google.android.gms.internal.ads.cf
    public final boolean H() {
        return this.f5573h;
    }

    @Override // com.google.android.gms.internal.ads.cf
    public final void V() {
        jm.e(this.f5569d == 2);
        this.f5569d = 1;
        t();
    }

    @Override // com.google.android.gms.internal.ads.cf
    public final void W(ef efVar, xe[] xeVarArr, uk ukVar, long j7, boolean z6, long j8) {
        jm.e(this.f5569d == 0);
        this.f5567b = efVar;
        this.f5569d = 1;
        q(z6);
        Y(xeVarArr, ukVar, j8);
        r(j7, z6);
    }

    @Override // com.google.android.gms.internal.ads.cf
    public final void Y(xe[] xeVarArr, uk ukVar, long j7) {
        jm.e(!this.f5573h);
        this.f5570e = ukVar;
        this.f5572g = false;
        this.f5571f = j7;
        u(xeVarArr, j7);
    }

    @Override // com.google.android.gms.internal.ads.cf
    public final void Z(int i7) {
        this.f5568c = i7;
    }

    @Override // com.google.android.gms.internal.ads.cf
    public final int a() {
        return this.f5569d;
    }

    @Override // com.google.android.gms.internal.ads.cf
    public final void a0(long j7) {
        this.f5573h = false;
        this.f5572g = false;
        r(j7, false);
    }

    @Override // com.google.android.gms.internal.ads.cf, com.google.android.gms.internal.ads.df
    public final int c() {
        return this.f5566a;
    }

    @Override // com.google.android.gms.internal.ads.cf
    public final df d() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cf
    public final uk f() {
        return this.f5570e;
    }

    @Override // com.google.android.gms.internal.ads.cf
    public nm h() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.cf
    public final void i() {
        jm.e(this.f5569d == 1);
        this.f5569d = 0;
        this.f5570e = null;
        this.f5573h = false;
        p();
    }

    protected final boolean k() {
        return this.f5572g ? this.f5573h : this.f5570e.b();
    }

    protected final int l() {
        return this.f5568c;
    }

    protected final int m(ye yeVar, ug ugVar, boolean z6) {
        int d7 = this.f5570e.d(yeVar, ugVar, z6);
        if (d7 == -4) {
            if (ugVar.f()) {
                this.f5572g = true;
                return this.f5573h ? -4 : -3;
            }
            ugVar.f12781d += this.f5571f;
        } else if (d7 == -5) {
            xe xeVar = yeVar.f14633a;
            long j7 = xeVar.B;
            if (j7 != Long.MAX_VALUE) {
                yeVar.f14633a = new xe(xeVar.f14160f, xeVar.f14164j, xeVar.f14165k, xeVar.f14162h, xeVar.f14161g, xeVar.f14166l, xeVar.f14169o, xeVar.f14170p, xeVar.f14171q, xeVar.f14172r, xeVar.f14173s, xeVar.f14175u, xeVar.f14174t, xeVar.f14176v, xeVar.f14177w, xeVar.f14178x, xeVar.f14179y, xeVar.f14180z, xeVar.A, xeVar.C, xeVar.D, xeVar.E, j7 + this.f5571f, xeVar.f14167m, xeVar.f14168n, xeVar.f14163i);
                return -5;
            }
        }
        return d7;
    }

    protected final ef n() {
        return this.f5567b;
    }

    @Override // com.google.android.gms.internal.ads.cf
    public final void o() {
        this.f5570e.c();
    }

    protected abstract void p();

    protected abstract void q(boolean z6);

    protected abstract void r(long j7, boolean z6);

    protected abstract void s();

    protected abstract void t();

    protected void u(xe[] xeVarArr, long j7) {
    }

    protected final void w(long j7) {
        this.f5570e.a(j7 - this.f5571f);
    }

    @Override // com.google.android.gms.internal.ads.cf
    public final void x() {
        this.f5573h = true;
    }
}
