package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class f64 implements r54, q54 {

    /* renamed from: f, reason: collision with root package name */
    private final r54 f5011f;

    /* renamed from: g, reason: collision with root package name */
    private final long f5012g;

    /* renamed from: h, reason: collision with root package name */
    private q54 f5013h;

    public f64(r54 r54Var, long j7) {
        this.f5011f = r54Var;
        this.f5012g = j7;
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final long a() {
        long a7 = this.f5011f.a();
        if (a7 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return a7 + this.f5012g;
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final boolean b(long j7) {
        return this.f5011f.b(j7 - this.f5012g);
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final long c() {
        long c7 = this.f5011f.c();
        if (c7 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return c7 + this.f5012g;
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final hm0 d() {
        return this.f5011f.d();
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long e(long j7) {
        return this.f5011f.e(j7 - this.f5012g) + this.f5012g;
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final void f(long j7) {
        this.f5011f.f(j7 - this.f5012g);
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long g() {
        long g7 = this.f5011f.g();
        if (g7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return g7 + this.f5012g;
    }

    @Override // com.google.android.gms.internal.ads.q54
    public final void h(r54 r54Var) {
        q54 q54Var = this.f5013h;
        Objects.requireNonNull(q54Var);
        q54Var.h(this);
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final void i() {
        this.f5011f.i();
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long j(w74[] w74VarArr, boolean[] zArr, i74[] i74VarArr, boolean[] zArr2, long j7) {
        i74[] i74VarArr2 = new i74[i74VarArr.length];
        int i7 = 0;
        while (true) {
            i74 i74Var = null;
            if (i7 >= i74VarArr.length) {
                break;
            }
            g64 g64Var = (g64) i74VarArr[i7];
            if (g64Var != null) {
                i74Var = g64Var.d();
            }
            i74VarArr2[i7] = i74Var;
            i7++;
        }
        long j8 = this.f5011f.j(w74VarArr, zArr, i74VarArr2, zArr2, j7 - this.f5012g);
        for (int i8 = 0; i8 < i74VarArr.length; i8++) {
            i74 i74Var2 = i74VarArr2[i8];
            if (i74Var2 == null) {
                i74VarArr[i8] = null;
            } else {
                i74 i74Var3 = i74VarArr[i8];
                if (i74Var3 == null || ((g64) i74Var3).d() != i74Var2) {
                    i74VarArr[i8] = new g64(i74Var2, this.f5012g);
                }
            }
        }
        return j8 + this.f5012g;
    }

    @Override // com.google.android.gms.internal.ads.j74
    public final /* bridge */ /* synthetic */ void k(r54 r54Var) {
        q54 q54Var = this.f5013h;
        Objects.requireNonNull(q54Var);
        q54Var.k(this);
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long l(long j7, ay3 ay3Var) {
        return this.f5011f.l(j7 - this.f5012g, ay3Var) + this.f5012g;
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final boolean n() {
        return this.f5011f.n();
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final void o(q54 q54Var, long j7) {
        this.f5013h = q54Var;
        this.f5011f.o(this, j7 - this.f5012g);
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final void s(long j7, boolean z6) {
        this.f5011f.s(j7 - this.f5012g, false);
    }
}
