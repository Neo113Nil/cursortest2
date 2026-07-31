package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class jj3 implements ex3 {

    /* renamed from: f, reason: collision with root package name */
    private final hy3 f7150f;

    /* renamed from: g, reason: collision with root package name */
    private final ii3 f7151g;

    /* renamed from: h, reason: collision with root package name */
    private xx3 f7152h;

    /* renamed from: i, reason: collision with root package name */
    private ex3 f7153i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f7154j = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f7155k;

    public jj3(ii3 ii3Var, xv1 xv1Var) {
        this.f7151g = ii3Var;
        this.f7150f = new hy3(xv1Var);
    }

    public final long a(boolean z6) {
        xx3 xx3Var = this.f7152h;
        if (xx3Var == null || xx3Var.K() || (!this.f7152h.f0() && (z6 || this.f7152h.A()))) {
            this.f7154j = true;
            if (this.f7155k) {
                this.f7150f.b();
            }
        } else {
            ex3 ex3Var = this.f7153i;
            Objects.requireNonNull(ex3Var);
            long zza = ex3Var.zza();
            if (this.f7154j) {
                if (zza < this.f7150f.zza()) {
                    this.f7150f.d();
                } else {
                    this.f7154j = false;
                    if (this.f7155k) {
                        this.f7150f.b();
                    }
                }
            }
            this.f7150f.a(zza);
            e30 c7 = ex3Var.c();
            if (!c7.equals(this.f7150f.c())) {
                this.f7150f.c0(c7);
                this.f7151g.a(c7);
            }
        }
        if (this.f7154j) {
            return this.f7150f.zza();
        }
        ex3 ex3Var2 = this.f7153i;
        Objects.requireNonNull(ex3Var2);
        return ex3Var2.zza();
    }

    public final void b(xx3 xx3Var) {
        if (xx3Var == this.f7152h) {
            this.f7153i = null;
            this.f7152h = null;
            this.f7154j = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ex3
    public final e30 c() {
        ex3 ex3Var = this.f7153i;
        return ex3Var != null ? ex3Var.c() : this.f7150f.c();
    }

    @Override // com.google.android.gms.internal.ads.ex3
    public final void c0(e30 e30Var) {
        ex3 ex3Var = this.f7153i;
        if (ex3Var != null) {
            ex3Var.c0(e30Var);
            e30Var = this.f7153i.c();
        }
        this.f7150f.c0(e30Var);
    }

    public final void d(xx3 xx3Var) {
        ex3 ex3Var;
        ex3 h7 = xx3Var.h();
        if (h7 == null || h7 == (ex3Var = this.f7153i)) {
            return;
        }
        if (ex3Var != null) {
            throw ll3.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f7153i = h7;
        this.f7152h = xx3Var;
        h7.c0(this.f7150f.c());
    }

    public final void e(long j7) {
        this.f7150f.a(j7);
    }

    public final void f() {
        this.f7155k = true;
        this.f7150f.b();
    }

    public final void g() {
        this.f7155k = false;
        this.f7150f.d();
    }

    @Override // com.google.android.gms.internal.ads.ex3
    public final long zza() {
        throw null;
    }
}
