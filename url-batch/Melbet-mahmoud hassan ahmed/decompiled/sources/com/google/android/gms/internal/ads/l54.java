package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l54 implements r54, q54 {

    /* renamed from: f, reason: collision with root package name */
    public final s54 f7830f;

    /* renamed from: g, reason: collision with root package name */
    private final long f7831g;

    /* renamed from: h, reason: collision with root package name */
    private v54 f7832h;

    /* renamed from: i, reason: collision with root package name */
    private r54 f7833i;

    /* renamed from: j, reason: collision with root package name */
    private q54 f7834j;

    /* renamed from: k, reason: collision with root package name */
    private long f7835k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    private final g94 f7836l;

    public l54(s54 s54Var, g94 g94Var, long j7, byte[] bArr) {
        this.f7830f = s54Var;
        this.f7836l = g94Var;
        this.f7831g = j7;
    }

    private final long v(long j7) {
        long j8 = this.f7835k;
        return j8 != -9223372036854775807L ? j8 : j7;
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final long a() {
        r54 r54Var = this.f7833i;
        int i7 = n13.f8865a;
        return r54Var.a();
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final boolean b(long j7) {
        r54 r54Var = this.f7833i;
        return r54Var != null && r54Var.b(j7);
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final long c() {
        r54 r54Var = this.f7833i;
        int i7 = n13.f8865a;
        return r54Var.c();
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final hm0 d() {
        r54 r54Var = this.f7833i;
        int i7 = n13.f8865a;
        return r54Var.d();
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long e(long j7) {
        r54 r54Var = this.f7833i;
        int i7 = n13.f8865a;
        return r54Var.e(j7);
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final void f(long j7) {
        r54 r54Var = this.f7833i;
        int i7 = n13.f8865a;
        r54Var.f(j7);
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long g() {
        r54 r54Var = this.f7833i;
        int i7 = n13.f8865a;
        return r54Var.g();
    }

    @Override // com.google.android.gms.internal.ads.q54
    public final void h(r54 r54Var) {
        q54 q54Var = this.f7834j;
        int i7 = n13.f8865a;
        q54Var.h(this);
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final void i() {
        try {
            r54 r54Var = this.f7833i;
            if (r54Var != null) {
                r54Var.i();
                return;
            }
            v54 v54Var = this.f7832h;
            if (v54Var != null) {
                v54Var.x();
            }
        } catch (IOException e7) {
            throw e7;
        }
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long j(w74[] w74VarArr, boolean[] zArr, i74[] i74VarArr, boolean[] zArr2, long j7) {
        long j8;
        long j9 = this.f7835k;
        if (j9 == -9223372036854775807L || j7 != this.f7831g) {
            j8 = j7;
        } else {
            this.f7835k = -9223372036854775807L;
            j8 = j9;
        }
        r54 r54Var = this.f7833i;
        int i7 = n13.f8865a;
        return r54Var.j(w74VarArr, zArr, i74VarArr, zArr2, j8);
    }

    @Override // com.google.android.gms.internal.ads.j74
    public final /* bridge */ /* synthetic */ void k(r54 r54Var) {
        q54 q54Var = this.f7834j;
        int i7 = n13.f8865a;
        q54Var.k(this);
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long l(long j7, ay3 ay3Var) {
        r54 r54Var = this.f7833i;
        int i7 = n13.f8865a;
        return r54Var.l(j7, ay3Var);
    }

    public final long m() {
        return this.f7835k;
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final boolean n() {
        r54 r54Var = this.f7833i;
        return r54Var != null && r54Var.n();
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final void o(q54 q54Var, long j7) {
        this.f7834j = q54Var;
        r54 r54Var = this.f7833i;
        if (r54Var != null) {
            r54Var.o(this, v(this.f7831g));
        }
    }

    public final long p() {
        return this.f7831g;
    }

    public final void q(s54 s54Var) {
        long v6 = v(this.f7831g);
        v54 v54Var = this.f7832h;
        Objects.requireNonNull(v54Var);
        r54 h7 = v54Var.h(s54Var, this.f7836l, v6);
        this.f7833i = h7;
        if (this.f7834j != null) {
            h7.o(this, v6);
        }
    }

    public final void r(long j7) {
        this.f7835k = j7;
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final void s(long j7, boolean z6) {
        r54 r54Var = this.f7833i;
        int i7 = n13.f8865a;
        r54Var.s(j7, false);
    }

    public final void t() {
        r54 r54Var = this.f7833i;
        if (r54Var != null) {
            v54 v54Var = this.f7832h;
            Objects.requireNonNull(v54Var);
            v54Var.j(r54Var);
        }
    }

    public final void u(v54 v54Var) {
        wu1.f(this.f7832h == null);
        this.f7832h = v54Var;
    }
}
