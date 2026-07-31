package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.ak, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1811ak implements so1, to1 {

    /* renamed from: b, reason: collision with root package name */
    private final int f23327b;

    /* renamed from: d, reason: collision with root package name */
    private uo1 f23329d;

    /* renamed from: e, reason: collision with root package name */
    private int f23330e;

    /* renamed from: f, reason: collision with root package name */
    private ei1 f23331f;

    /* renamed from: g, reason: collision with root package name */
    private int f23332g;

    /* renamed from: h, reason: collision with root package name */
    private ft1 f23333h;

    /* renamed from: i, reason: collision with root package name */
    private yb0[] f23334i;

    /* renamed from: j, reason: collision with root package name */
    private long f23335j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23337l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f23338m;

    /* renamed from: c, reason: collision with root package name */
    private final zb0 f23328c = new zb0();

    /* renamed from: k, reason: collision with root package name */
    private long f23336k = Long.MIN_VALUE;

    public AbstractC1811ak(int i4) {
        this.f23327b = i4;
    }

    @Override // com.yandex.mobile.ads.impl.fi1.b
    public void a(int i4, Object obj) {
    }

    protected abstract void a(long j4, boolean z4);

    protected abstract void a(yb0[] yb0VarArr, long j4, long j5);

    @Override // com.yandex.mobile.ads.impl.so1
    public final void b() {
        if (this.f23332g != 0) {
            throw new IllegalStateException();
        }
        zb0 zb0Var = this.f23328c;
        zb0Var.f35540a = null;
        zb0Var.f35541b = null;
        v();
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void c() {
        if (this.f23332g != 1) {
            throw new IllegalStateException();
        }
        zb0 zb0Var = this.f23328c;
        zb0Var.f35540a = null;
        zb0Var.f35541b = null;
        this.f23332g = 0;
        this.f23333h = null;
        this.f23334i = null;
        this.f23337l = false;
        u();
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final boolean e() {
        return this.f23336k == Long.MIN_VALUE;
    }

    @Override // com.yandex.mobile.ads.impl.to1
    public int f() {
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final ft1 g() {
        return this.f23333h;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final int getState() {
        return this.f23332g;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void h() {
        this.f23337l = true;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void i() {
        ft1 ft1Var = this.f23333h;
        ft1Var.getClass();
        ft1Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final long j() {
        return this.f23336k;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final boolean k() {
        return this.f23337l;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public nu0 l() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final int m() {
        return this.f23327b;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final AbstractC1811ak n() {
        return this;
    }

    protected final uo1 p() {
        uo1 uo1Var = this.f23329d;
        uo1Var.getClass();
        return uo1Var;
    }

    protected final zb0 q() {
        zb0 zb0Var = this.f23328c;
        zb0Var.f35540a = null;
        zb0Var.f35541b = null;
        return zb0Var;
    }

    protected final ei1 r() {
        ei1 ei1Var = this.f23331f;
        ei1Var.getClass();
        return ei1Var;
    }

    protected final yb0[] s() {
        yb0[] yb0VarArr = this.f23334i;
        yb0VarArr.getClass();
        return yb0VarArr;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void start() {
        if (this.f23332g != 1) {
            throw new IllegalStateException();
        }
        this.f23332g = 2;
        w();
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void stop() {
        if (this.f23332g != 2) {
            throw new IllegalStateException();
        }
        this.f23332g = 1;
        x();
    }

    protected final boolean t() {
        if (e()) {
            return this.f23337l;
        }
        ft1 ft1Var = this.f23333h;
        ft1Var.getClass();
        return ft1Var.d();
    }

    protected abstract void u();

    protected void v() {
    }

    protected void w() {
    }

    protected void x() {
    }

    protected void a(boolean z4, boolean z5) {
    }

    protected final c60 a(int i4, yb0 yb0Var, Exception exc, boolean z4) {
        int i5;
        if (yb0Var != null && !this.f23338m) {
            this.f23338m = true;
            try {
                i5 = a(yb0Var) & 7;
            } catch (c60 unused) {
            } finally {
                this.f23338m = false;
            }
            return c60.a(exc, getName(), this.f23330e, yb0Var, i5, z4, i4);
        }
        i5 = 4;
        return c60.a(exc, getName(), this.f23330e, yb0Var, i5, z4, i4);
    }

    protected final int b(long j4) {
        ft1 ft1Var = this.f23333h;
        ft1Var.getClass();
        return ft1Var.a(j4 - this.f23335j);
    }

    protected final c60 a(Exception exc, yb0 yb0Var, int i4) {
        return a(i4, yb0Var, exc, false);
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void a(uo1 uo1Var, yb0[] yb0VarArr, ft1 ft1Var, long j4, boolean z4, boolean z5, long j5, long j6) {
        if (this.f23332g == 0) {
            this.f23329d = uo1Var;
            this.f23332g = 1;
            a(z4, z5);
            a(yb0VarArr, ft1Var, j5, j6);
            this.f23337l = false;
            this.f23336k = j4;
            a(j4, z4);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void a(int i4, ei1 ei1Var) {
        this.f23330e = i4;
        this.f23331f = ei1Var;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public boolean a() {
        return e();
    }

    protected final int a(zb0 zb0Var, gy gyVar, int i4) {
        ft1 ft1Var = this.f23333h;
        ft1Var.getClass();
        int a4 = ft1Var.a(zb0Var, gyVar, i4);
        if (a4 != -4) {
            if (a4 == -5) {
                yb0 yb0Var = zb0Var.f35541b;
                yb0Var.getClass();
                if (yb0Var.f34995q != Long.MAX_VALUE) {
                    zb0Var.f35541b = yb0Var.a().a(yb0Var.f34995q + this.f23335j).a();
                }
            }
            return a4;
        }
        if (gyVar.f()) {
            this.f23336k = Long.MIN_VALUE;
            return this.f23337l ? -4 : -3;
        }
        long j4 = gyVar.f26358f + this.f23335j;
        gyVar.f26358f = j4;
        this.f23336k = Math.max(this.f23336k, j4);
        return a4;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void a(yb0[] yb0VarArr, ft1 ft1Var, long j4, long j5) {
        if (!this.f23337l) {
            this.f23333h = ft1Var;
            if (this.f23336k == Long.MIN_VALUE) {
                this.f23336k = j4;
            }
            this.f23334i = yb0VarArr;
            this.f23335j = j5;
            a(yb0VarArr, j4, j5);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void a(long j4) {
        this.f23337l = false;
        this.f23336k = j4;
        a(j4, false);
    }
}
