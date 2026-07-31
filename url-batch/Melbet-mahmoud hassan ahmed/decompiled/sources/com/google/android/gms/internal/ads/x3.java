package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x3 implements l4 {

    /* renamed from: a, reason: collision with root package name */
    private final w3 f14018a;

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f14019b = new dr2(32);

    /* renamed from: c, reason: collision with root package name */
    private int f14020c;

    /* renamed from: d, reason: collision with root package name */
    private int f14021d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14022e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14023f;

    public x3(w3 w3Var) {
        this.f14018a = w3Var;
    }

    @Override // com.google.android.gms.internal.ads.l4
    public final void a(dr2 dr2Var, int i7) {
        int i8 = i7 & 1;
        int k7 = i8 != 0 ? dr2Var.k() + dr2Var.s() : -1;
        if (this.f14023f) {
            if (i8 == 0) {
                return;
            }
            this.f14023f = false;
            dr2Var.f(k7);
            this.f14021d = 0;
        }
        while (dr2Var.i() > 0) {
            int i9 = this.f14021d;
            if (i9 < 3) {
                if (i9 == 0) {
                    int s7 = dr2Var.s();
                    dr2Var.f(dr2Var.k() - 1);
                    if (s7 == 255) {
                        this.f14023f = true;
                        return;
                    }
                }
                int min = Math.min(dr2Var.i(), 3 - this.f14021d);
                dr2Var.b(this.f14019b.h(), this.f14021d, min);
                int i10 = this.f14021d + min;
                this.f14021d = i10;
                if (i10 == 3) {
                    this.f14019b.f(0);
                    this.f14019b.e(3);
                    this.f14019b.g(1);
                    int s8 = this.f14019b.s();
                    int s9 = this.f14019b.s();
                    this.f14022e = (s8 & 128) != 0;
                    this.f14020c = (((s8 & 15) << 8) | s9) + 3;
                    int j7 = this.f14019b.j();
                    int i11 = this.f14020c;
                    if (j7 < i11) {
                        int j8 = this.f14019b.j();
                        this.f14019b.H(Math.min(4098, Math.max(i11, j8 + j8)));
                    }
                }
            } else {
                int min2 = Math.min(dr2Var.i(), this.f14020c - this.f14021d);
                dr2Var.b(this.f14019b.h(), this.f14021d, min2);
                int i12 = this.f14021d + min2;
                this.f14021d = i12;
                int i13 = this.f14020c;
                if (i12 != i13) {
                    continue;
                } else {
                    if (!this.f14022e) {
                        this.f14019b.e(i13);
                    } else {
                        if (n13.M(this.f14019b.h(), 0, this.f14020c, -1) != 0) {
                            this.f14023f = true;
                            return;
                        }
                        this.f14019b.e(this.f14020c - 4);
                    }
                    this.f14019b.f(0);
                    this.f14018a.a(this.f14019b);
                    this.f14021d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.l4
    public final void b(ky2 ky2Var, rc4 rc4Var, k4 k4Var) {
        this.f14018a.b(ky2Var, rc4Var, k4Var);
        this.f14023f = true;
    }

    @Override // com.google.android.gms.internal.ads.l4
    public final void c() {
        this.f14023f = true;
    }
}
