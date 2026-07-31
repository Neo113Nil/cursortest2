package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
public final class o3 implements l4 {

    /* renamed from: a, reason: collision with root package name */
    private final w2 f9479a;

    /* renamed from: b, reason: collision with root package name */
    private final cq2 f9480b = new cq2(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    private int f9481c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f9482d;

    /* renamed from: e, reason: collision with root package name */
    private ky2 f9483e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9484f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9485g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9486h;

    /* renamed from: i, reason: collision with root package name */
    private int f9487i;

    /* renamed from: j, reason: collision with root package name */
    private int f9488j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9489k;

    public o3(w2 w2Var) {
        this.f9479a = w2Var;
    }

    private final void d(int i7) {
        this.f9481c = i7;
        this.f9482d = 0;
    }

    private final boolean e(dr2 dr2Var, byte[] bArr, int i7) {
        int min = Math.min(dr2Var.i(), i7 - this.f9482d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            dr2Var.g(min);
        } else {
            dr2Var.b(bArr, this.f9482d, min);
        }
        int i8 = this.f9482d + min;
        this.f9482d = i8;
        return i8 == i7;
    }

    @Override // com.google.android.gms.internal.ads.l4
    public final void a(dr2 dr2Var, int i7) {
        long j7;
        wu1.b(this.f9483e);
        int i8 = -1;
        int i9 = 2;
        if ((i7 & 1) != 0) {
            int i10 = this.f9481c;
            if (i10 != 0 && i10 != 1) {
                if (i10 != 2) {
                    int i11 = this.f9488j;
                    if (i11 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i11);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.f9479a.c();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            d(1);
        }
        int i12 = i7;
        while (dr2Var.i() > 0) {
            int i13 = this.f9481c;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != i9) {
                        int i14 = dr2Var.i();
                        int i15 = this.f9488j;
                        int i16 = i15 != i8 ? i14 - i15 : 0;
                        if (i16 > 0) {
                            i14 -= i16;
                            dr2Var.e(dr2Var.k() + i14);
                        }
                        this.f9479a.a(dr2Var);
                        int i17 = this.f9488j;
                        if (i17 != i8) {
                            int i18 = i17 - i14;
                            this.f9488j = i18;
                            if (i18 == 0) {
                                this.f9479a.c();
                                d(1);
                            }
                        }
                    } else {
                        if (e(dr2Var, this.f9480b.f3919a, Math.min(10, this.f9487i)) && e(dr2Var, null, this.f9487i)) {
                            this.f9480b.h(0);
                            if (this.f9484f) {
                                this.f9480b.j(4);
                                int c7 = this.f9480b.c(3);
                                this.f9480b.j(1);
                                int c8 = this.f9480b.c(15);
                                this.f9480b.j(1);
                                long c9 = (c8 << 15) | (c7 << 30) | this.f9480b.c(15);
                                this.f9480b.j(1);
                                if (!this.f9486h && this.f9485g) {
                                    this.f9480b.j(4);
                                    int c10 = this.f9480b.c(3);
                                    this.f9480b.j(1);
                                    int c11 = this.f9480b.c(15);
                                    this.f9480b.j(1);
                                    int c12 = this.f9480b.c(15);
                                    this.f9480b.j(1);
                                    this.f9483e.b((c10 << 30) | (c11 << 15) | c12);
                                    this.f9486h = true;
                                }
                                j7 = this.f9483e.b(c9);
                            } else {
                                j7 = -9223372036854775807L;
                            }
                            i12 |= true != this.f9489k ? 0 : 4;
                            this.f9479a.e(j7, i12);
                            d(3);
                            i8 = -1;
                        }
                    }
                } else if (e(dr2Var, this.f9480b.f3919a, 9)) {
                    int i19 = 0;
                    this.f9480b.h(0);
                    int c13 = this.f9480b.c(24);
                    if (c13 != 1) {
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(c13);
                        Log.w("PesReader", sb2.toString());
                        i8 = -1;
                        this.f9488j = -1;
                    } else {
                        this.f9480b.j(8);
                        int c14 = this.f9480b.c(16);
                        this.f9480b.j(5);
                        this.f9489k = this.f9480b.l();
                        this.f9480b.j(2);
                        this.f9484f = this.f9480b.l();
                        this.f9485g = this.f9480b.l();
                        this.f9480b.j(6);
                        int c15 = this.f9480b.c(8);
                        this.f9487i = c15;
                        if (c14 == 0) {
                            this.f9488j = -1;
                        } else {
                            int i20 = (c14 - 3) - c15;
                            this.f9488j = i20;
                            if (i20 < 0) {
                                StringBuilder sb3 = new StringBuilder(47);
                                sb3.append("Found negative packet payload size: ");
                                sb3.append(i20);
                                Log.w("PesReader", sb3.toString());
                                i8 = -1;
                                this.f9488j = -1;
                                i19 = 2;
                            }
                        }
                        i8 = -1;
                        i19 = 2;
                    }
                    d(i19);
                } else {
                    i8 = -1;
                }
            } else {
                dr2Var.g(dr2Var.i());
            }
            i9 = 2;
        }
    }

    @Override // com.google.android.gms.internal.ads.l4
    public final void b(ky2 ky2Var, rc4 rc4Var, k4 k4Var) {
        this.f9483e = ky2Var;
        this.f9479a.d(rc4Var, k4Var);
    }

    @Override // com.google.android.gms.internal.ads.l4
    public final void c() {
        this.f9481c = 0;
        this.f9482d = 0;
        this.f9486h = false;
        this.f9479a.b();
    }
}
