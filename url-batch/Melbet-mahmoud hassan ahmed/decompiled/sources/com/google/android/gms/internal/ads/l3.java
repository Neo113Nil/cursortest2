package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class l3 implements w2 {

    /* renamed from: a, reason: collision with root package name */
    private final dr2 f7791a;

    /* renamed from: b, reason: collision with root package name */
    private final jd4 f7792b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7793c;

    /* renamed from: d, reason: collision with root package name */
    private td4 f7794d;

    /* renamed from: e, reason: collision with root package name */
    private String f7795e;

    /* renamed from: f, reason: collision with root package name */
    private int f7796f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f7797g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7798h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7799i;

    /* renamed from: j, reason: collision with root package name */
    private long f7800j;

    /* renamed from: k, reason: collision with root package name */
    private int f7801k;

    /* renamed from: l, reason: collision with root package name */
    private long f7802l;

    public l3(String str) {
        dr2 dr2Var = new dr2(4);
        this.f7791a = dr2Var;
        dr2Var.h()[0] = -1;
        this.f7792b = new jd4();
        this.f7802l = -9223372036854775807L;
        this.f7793c = str;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void a(dr2 dr2Var) {
        wu1.b(this.f7794d);
        while (dr2Var.i() > 0) {
            int i7 = this.f7796f;
            if (i7 == 0) {
                byte[] h7 = dr2Var.h();
                int l7 = dr2Var.l();
                for (int k7 = dr2Var.k(); k7 < l7; k7++) {
                    byte b7 = h7[k7];
                    boolean z6 = (b7 & 255) == 255;
                    boolean z7 = this.f7799i && (b7 & 224) == 224;
                    this.f7799i = z6;
                    if (z7) {
                        dr2Var.f(k7 + 1);
                        this.f7799i = false;
                        this.f7791a.h()[1] = h7[k7];
                        this.f7797g = 2;
                        this.f7796f = 1;
                        break;
                        break;
                    }
                }
                dr2Var.f(l7);
            } else if (i7 != 1) {
                int min = Math.min(dr2Var.i(), this.f7801k - this.f7797g);
                rd4.b(this.f7794d, dr2Var, min);
                int i8 = this.f7797g + min;
                this.f7797g = i8;
                int i9 = this.f7801k;
                if (i8 >= i9) {
                    long j7 = this.f7802l;
                    if (j7 != -9223372036854775807L) {
                        this.f7794d.a(j7, 1, i9, 0, null);
                        this.f7802l += this.f7800j;
                    }
                    this.f7797g = 0;
                    this.f7796f = 0;
                }
            } else {
                int min2 = Math.min(dr2Var.i(), 4 - this.f7797g);
                dr2Var.b(this.f7791a.h(), this.f7797g, min2);
                int i10 = this.f7797g + min2;
                this.f7797g = i10;
                if (i10 >= 4) {
                    this.f7791a.f(0);
                    if (!this.f7792b.a(this.f7791a.m())) {
                        this.f7797g = 0;
                        this.f7796f = 1;
                        break;
                    }
                    this.f7801k = this.f7792b.f7097c;
                    if (!this.f7798h) {
                        this.f7800j = (r0.f7101g * 1000000) / r0.f7098d;
                        bf4 bf4Var = new bf4();
                        bf4Var.h(this.f7795e);
                        bf4Var.s(this.f7792b.f7096b);
                        bf4Var.l(4096);
                        bf4Var.e0(this.f7792b.f7099e);
                        bf4Var.t(this.f7792b.f7098d);
                        bf4Var.k(this.f7793c);
                        this.f7794d.b(bf4Var.y());
                        this.f7798h = true;
                    }
                    this.f7791a.f(0);
                    rd4.b(this.f7794d, this.f7791a, 4);
                    this.f7796f = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void b() {
        this.f7796f = 0;
        this.f7797g = 0;
        this.f7799i = false;
        this.f7802l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void d(rc4 rc4Var, k4 k4Var) {
        k4Var.c();
        this.f7795e = k4Var.b();
        this.f7794d = rc4Var.r(k4Var.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void e(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f7802l = j7;
        }
    }
}
