package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class es1 implements j80 {

    /* renamed from: f, reason: collision with root package name */
    private final dc1 f4733f;

    /* renamed from: g, reason: collision with root package name */
    private final yj0 f4734g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4735h;

    /* renamed from: i, reason: collision with root package name */
    private final String f4736i;

    public es1(dc1 dc1Var, rr2 rr2Var) {
        this.f4733f = dc1Var;
        this.f4734g = rr2Var.f11390m;
        this.f4735h = rr2Var.f11387k;
        this.f4736i = rr2Var.f11389l;
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void a() {
        this.f4733f.b();
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void c() {
        this.f4733f.U0();
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void q0(yj0 yj0Var) {
        int i7;
        String str;
        yj0 yj0Var2 = this.f4734g;
        if (yj0Var2 != null) {
            yj0Var = yj0Var2;
        }
        if (yj0Var != null) {
            str = yj0Var.f14705f;
            i7 = yj0Var.f14706g;
        } else {
            i7 = 1;
            str = "";
        }
        this.f4733f.S0(new jj0(str, i7), this.f4735h, this.f4736i);
    }
}
