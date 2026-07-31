package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class p2 implements w2 {

    /* renamed from: a, reason: collision with root package name */
    private final cq2 f10000a;

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f10001b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10002c;

    /* renamed from: d, reason: collision with root package name */
    private String f10003d;

    /* renamed from: e, reason: collision with root package name */
    private td4 f10004e;

    /* renamed from: f, reason: collision with root package name */
    private int f10005f;

    /* renamed from: g, reason: collision with root package name */
    private int f10006g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10007h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10008i;

    /* renamed from: j, reason: collision with root package name */
    private long f10009j;

    /* renamed from: k, reason: collision with root package name */
    private c0 f10010k;

    /* renamed from: l, reason: collision with root package name */
    private int f10011l;

    /* renamed from: m, reason: collision with root package name */
    private long f10012m;

    public p2(String str) {
        cq2 cq2Var = new cq2(new byte[16], 16);
        this.f10000a = cq2Var;
        this.f10001b = new dr2(cq2Var.f3919a);
        this.f10005f = 0;
        this.f10006g = 0;
        this.f10007h = false;
        this.f10008i = false;
        this.f10012m = -9223372036854775807L;
        this.f10002c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0122  */
    @Override // com.google.android.gms.internal.ads.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(dr2 dr2Var) {
        boolean z6;
        wu1.b(this.f10004e);
        while (dr2Var.i() > 0) {
            int i7 = this.f10005f;
            if (i7 == 0) {
                while (dr2Var.i() > 0) {
                    if (this.f10007h) {
                        int s7 = dr2Var.s();
                        this.f10007h = s7 == 172;
                        if (s7 != 64) {
                            if (s7 == 65) {
                            }
                        } else if (s7 != 65) {
                            z6 = false;
                            this.f10008i = z6;
                            this.f10005f = 1;
                            this.f10001b.h()[0] = -84;
                            this.f10001b.h()[1] = true == this.f10008i ? (byte) 65 : (byte) 64;
                            this.f10006g = 2;
                        }
                        z6 = true;
                        this.f10008i = z6;
                        this.f10005f = 1;
                        this.f10001b.h()[0] = -84;
                        this.f10001b.h()[1] = true == this.f10008i ? (byte) 65 : (byte) 64;
                        this.f10006g = 2;
                    } else {
                        this.f10007h = dr2Var.s() == 172;
                    }
                }
            } else if (i7 != 1) {
                int min = Math.min(dr2Var.i(), this.f10011l - this.f10006g);
                rd4.b(this.f10004e, dr2Var, min);
                int i8 = this.f10006g + min;
                this.f10006g = i8;
                int i9 = this.f10011l;
                if (i8 == i9) {
                    long j7 = this.f10012m;
                    if (j7 != -9223372036854775807L) {
                        this.f10004e.a(j7, 1, i9, 0, null);
                        this.f10012m += this.f10009j;
                    }
                    this.f10005f = 0;
                }
            } else {
                byte[] h7 = this.f10001b.h();
                int min2 = Math.min(dr2Var.i(), 16 - this.f10006g);
                dr2Var.b(h7, this.f10006g, min2);
                int i10 = this.f10006g + min2;
                this.f10006g = i10;
                if (i10 == 16) {
                    this.f10000a.h(0);
                    vb4 a7 = wb4.a(this.f10000a);
                    c0 c0Var = this.f10010k;
                    if (c0Var == null || c0Var.f3673y != 2 || a7.f13290a != c0Var.f3674z || !"audio/ac4".equals(c0Var.f3660l)) {
                        bf4 bf4Var = new bf4();
                        bf4Var.h(this.f10003d);
                        bf4Var.s("audio/ac4");
                        bf4Var.e0(2);
                        bf4Var.t(a7.f13290a);
                        bf4Var.k(this.f10002c);
                        c0 y6 = bf4Var.y();
                        this.f10010k = y6;
                        this.f10004e.b(y6);
                    }
                    this.f10011l = a7.f13291b;
                    this.f10009j = (a7.f13292c * 1000000) / this.f10010k.f3674z;
                    this.f10001b.f(0);
                    rd4.b(this.f10004e, this.f10001b, 16);
                    this.f10005f = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void b() {
        this.f10005f = 0;
        this.f10006g = 0;
        this.f10007h = false;
        this.f10008i = false;
        this.f10012m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void d(rc4 rc4Var, k4 k4Var) {
        k4Var.c();
        this.f10003d = k4Var.b();
        this.f10004e = rc4Var.r(k4Var.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void e(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f10012m = j7;
        }
    }
}
