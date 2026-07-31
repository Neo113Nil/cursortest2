package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class bc3 implements xx3, yx3 {

    /* renamed from: f, reason: collision with root package name */
    private final int f3338f;

    /* renamed from: h, reason: collision with root package name */
    private zx3 f3340h;

    /* renamed from: i, reason: collision with root package name */
    private int f3341i;

    /* renamed from: j, reason: collision with root package name */
    private int f3342j;

    /* renamed from: k, reason: collision with root package name */
    private i74 f3343k;

    /* renamed from: l, reason: collision with root package name */
    private c0[] f3344l;

    /* renamed from: m, reason: collision with root package name */
    private long f3345m;

    /* renamed from: o, reason: collision with root package name */
    private boolean f3347o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f3348p;

    /* renamed from: g, reason: collision with root package name */
    private final cx3 f3339g = new cx3();

    /* renamed from: n, reason: collision with root package name */
    private long f3346n = Long.MIN_VALUE;

    public bc3(int i7) {
        this.f3338f = i7;
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public final boolean A() {
        return this.f3346n == Long.MIN_VALUE;
    }

    protected abstract void B();

    @Override // com.google.android.gms.internal.ads.xx3
    public final void C() {
        wu1.f(this.f3342j == 0);
        cx3 cx3Var = this.f3339g;
        cx3Var.f3981b = null;
        cx3Var.f3980a = null;
        F();
    }

    protected void D(boolean z6, boolean z7) {
    }

    protected abstract void E(long j7, boolean z6);

    protected void F() {
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public final void G() {
        this.f3347o = true;
    }

    protected void H() {
    }

    protected void I() {
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public final boolean J() {
        return this.f3347o;
    }

    protected abstract void L(c0[] c0VarArr, long j7, long j8);

    @Override // com.google.android.gms.internal.ads.xx3
    public final void M() {
        wu1.f(this.f3342j == 2);
        this.f3342j = 1;
        I();
    }

    @Override // com.google.android.gms.internal.ads.xx3, com.google.android.gms.internal.ads.yx3
    public final int a() {
        return this.f3338f;
    }

    public int b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public final long d() {
        return this.f3346n;
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public final void e0() {
        wu1.f(this.f3342j == 1);
        this.f3342j = 2;
        H();
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public final void f(int i7) {
        this.f3341i = i7;
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public final void g(long j7) {
        this.f3347o = false;
        this.f3346n = j7;
        E(j7, false);
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public ex3 h() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public final yx3 i() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public final i74 k() {
        return this.f3343k;
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public final void l() {
        i74 i74Var = this.f3343k;
        Objects.requireNonNull(i74Var);
        i74Var.g();
    }

    @Override // com.google.android.gms.internal.ads.tx3
    public void m(int i7, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public /* synthetic */ void n(float f7, float f8) {
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public final void o() {
        wu1.f(this.f3342j == 1);
        cx3 cx3Var = this.f3339g;
        cx3Var.f3981b = null;
        cx3Var.f3980a = null;
        this.f3342j = 0;
        this.f3343k = null;
        this.f3344l = null;
        this.f3347o = false;
        B();
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public final void p(zx3 zx3Var, c0[] c0VarArr, i74 i74Var, long j7, boolean z6, boolean z7, long j8, long j9) {
        wu1.f(this.f3342j == 0);
        this.f3340h = zx3Var;
        this.f3342j = 1;
        D(z6, z7);
        r(c0VarArr, i74Var, j8, j9);
        E(j7, z6);
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public final int q() {
        return this.f3342j;
    }

    @Override // com.google.android.gms.internal.ads.xx3
    public final void r(c0[] c0VarArr, i74 i74Var, long j7, long j8) {
        wu1.f(!this.f3347o);
        this.f3343k = i74Var;
        if (this.f3346n == Long.MIN_VALUE) {
            this.f3346n = j7;
        }
        this.f3344l = c0VarArr;
        this.f3345m = j8;
        L(c0VarArr, j7, j8);
    }

    protected final boolean s() {
        if (A()) {
            return this.f3347o;
        }
        i74 i74Var = this.f3343k;
        Objects.requireNonNull(i74Var);
        return i74Var.b();
    }

    protected final c0[] t() {
        c0[] c0VarArr = this.f3344l;
        Objects.requireNonNull(c0VarArr);
        return c0VarArr;
    }

    protected final int u(cx3 cx3Var, z51 z51Var, int i7) {
        i74 i74Var = this.f3343k;
        Objects.requireNonNull(i74Var);
        int c7 = i74Var.c(cx3Var, z51Var, i7);
        if (c7 == -4) {
            if (z51Var.g()) {
                this.f3346n = Long.MIN_VALUE;
                return this.f3347o ? -4 : -3;
            }
            long j7 = z51Var.f14954e + this.f3345m;
            z51Var.f14954e = j7;
            this.f3346n = Math.max(this.f3346n, j7);
        } else if (c7 == -5) {
            c0 c0Var = cx3Var.f3980a;
            Objects.requireNonNull(c0Var);
            if (c0Var.f3664p != Long.MAX_VALUE) {
                bf4 b7 = c0Var.b();
                b7.w(c0Var.f3664p + this.f3345m);
                cx3Var.f3980a = b7.y();
                return -5;
            }
        }
        return c7;
    }

    protected final ll3 w(Throwable th, c0 c0Var, boolean z6, int i7) {
        int i8;
        if (c0Var != null && !this.f3348p) {
            this.f3348p = true;
            try {
                int j7 = j(c0Var) & 7;
                this.f3348p = false;
                i8 = j7;
            } catch (ll3 unused) {
                this.f3348p = false;
            } catch (Throwable th2) {
                this.f3348p = false;
                throw th2;
            }
            return ll3.b(th, v(), this.f3341i, c0Var, i8, z6, i7);
        }
        i8 = 4;
        return ll3.b(th, v(), this.f3341i, c0Var, i8, z6, i7);
    }

    protected final int x(long j7) {
        i74 i74Var = this.f3343k;
        Objects.requireNonNull(i74Var);
        return i74Var.a(j7 - this.f3345m);
    }

    protected final cx3 y() {
        cx3 cx3Var = this.f3339g;
        cx3Var.f3981b = null;
        cx3Var.f3980a = null;
        return cx3Var;
    }

    protected final zx3 z() {
        zx3 zx3Var = this.f3340h;
        Objects.requireNonNull(zx3Var);
        return zx3Var;
    }
}
