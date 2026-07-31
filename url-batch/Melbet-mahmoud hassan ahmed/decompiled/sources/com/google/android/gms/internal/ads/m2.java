package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class m2 implements w2 {

    /* renamed from: a, reason: collision with root package name */
    private final cq2 f8354a;

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f8355b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8356c;

    /* renamed from: d, reason: collision with root package name */
    private String f8357d;

    /* renamed from: e, reason: collision with root package name */
    private td4 f8358e;

    /* renamed from: f, reason: collision with root package name */
    private int f8359f;

    /* renamed from: g, reason: collision with root package name */
    private int f8360g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8361h;

    /* renamed from: i, reason: collision with root package name */
    private long f8362i;

    /* renamed from: j, reason: collision with root package name */
    private c0 f8363j;

    /* renamed from: k, reason: collision with root package name */
    private int f8364k;

    /* renamed from: l, reason: collision with root package name */
    private long f8365l;

    public m2(String str) {
        cq2 cq2Var = new cq2(new byte[128], 128);
        this.f8354a = cq2Var;
        this.f8355b = new dr2(cq2Var.f3919a);
        this.f8359f = 0;
        this.f8365l = -9223372036854775807L;
        this.f8356c = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ee, code lost:
    
        if (r12.s() == 11) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f0, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f2, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0116, code lost:
    
        if (r0 == 11) goto L32;
     */
    @Override // com.google.android.gms.internal.ads.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(dr2 dr2Var) {
        boolean z6;
        wu1.b(this.f8358e);
        while (dr2Var.i() > 0) {
            int i7 = this.f8359f;
            if (i7 == 0) {
                while (true) {
                    if (dr2Var.i() <= 0) {
                        break;
                    }
                    if (this.f8361h) {
                        int s7 = dr2Var.s();
                        if (s7 == 119) {
                            this.f8361h = false;
                            this.f8359f = 1;
                            this.f8355b.h()[0] = 11;
                            this.f8355b.h()[1] = 119;
                            this.f8360g = 2;
                            break;
                        }
                    }
                    this.f8361h = z6;
                }
            } else if (i7 != 1) {
                int min = Math.min(dr2Var.i(), this.f8364k - this.f8360g);
                rd4.b(this.f8358e, dr2Var, min);
                int i8 = this.f8360g + min;
                this.f8360g = i8;
                int i9 = this.f8364k;
                if (i8 == i9) {
                    long j7 = this.f8365l;
                    if (j7 != -9223372036854775807L) {
                        this.f8358e.a(j7, 1, i9, 0, null);
                        this.f8365l += this.f8362i;
                    }
                    this.f8359f = 0;
                }
            } else {
                byte[] h7 = this.f8355b.h();
                int min2 = Math.min(dr2Var.i(), 128 - this.f8360g);
                dr2Var.b(h7, this.f8360g, min2);
                int i10 = this.f8360g + min2;
                this.f8360g = i10;
                if (i10 == 128) {
                    this.f8354a.h(0);
                    sb4 d7 = tb4.d(this.f8354a);
                    c0 c0Var = this.f8363j;
                    if (c0Var == null || d7.f11780c != c0Var.f3673y || d7.f11779b != c0Var.f3674z || !n13.p(d7.f11778a, c0Var.f3660l)) {
                        bf4 bf4Var = new bf4();
                        bf4Var.h(this.f8357d);
                        bf4Var.s(d7.f11778a);
                        bf4Var.e0(d7.f11780c);
                        bf4Var.t(d7.f11779b);
                        bf4Var.k(this.f8356c);
                        c0 y6 = bf4Var.y();
                        this.f8363j = y6;
                        this.f8358e.b(y6);
                    }
                    this.f8364k = d7.f11781d;
                    this.f8362i = (d7.f11782e * 1000000) / this.f8363j.f3674z;
                    this.f8355b.f(0);
                    rd4.b(this.f8358e, this.f8355b, 128);
                    this.f8359f = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void b() {
        this.f8359f = 0;
        this.f8360g = 0;
        this.f8361h = false;
        this.f8365l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void d(rc4 rc4Var, k4 k4Var) {
        k4Var.c();
        this.f8357d = k4Var.b();
        this.f8358e = rc4Var.r(k4Var.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void e(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f8365l = j7;
        }
    }
}
