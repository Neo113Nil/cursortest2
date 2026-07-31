package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class r4 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private final rc4 f11021a;

    /* renamed from: b, reason: collision with root package name */
    private final td4 f11022b;

    /* renamed from: c, reason: collision with root package name */
    private final t4 f11023c;

    /* renamed from: d, reason: collision with root package name */
    private final c0 f11024d;

    /* renamed from: e, reason: collision with root package name */
    private final int f11025e;

    /* renamed from: f, reason: collision with root package name */
    private long f11026f;

    /* renamed from: g, reason: collision with root package name */
    private int f11027g;

    /* renamed from: h, reason: collision with root package name */
    private long f11028h;

    public r4(rc4 rc4Var, td4 td4Var, t4 t4Var, String str, int i7) {
        this.f11021a = rc4Var;
        this.f11022b = td4Var;
        this.f11023c = t4Var;
        int i8 = (t4Var.f12072b * t4Var.f12075e) / 8;
        int i9 = t4Var.f12074d;
        if (i9 != i8) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Expected block size: ");
            sb.append(i8);
            sb.append("; got: ");
            sb.append(i9);
            throw dz.a(sb.toString(), null);
        }
        int i10 = t4Var.f12073c * i8;
        int i11 = i10 * 8;
        int max = Math.max(i8, i10 / 10);
        this.f11025e = max;
        bf4 bf4Var = new bf4();
        bf4Var.s(str);
        bf4Var.d0(i11);
        bf4Var.o(i11);
        bf4Var.l(max);
        bf4Var.e0(t4Var.f12072b);
        bf4Var.t(t4Var.f12073c);
        bf4Var.n(i7);
        this.f11024d = bf4Var.y();
    }

    @Override // com.google.android.gms.internal.ads.q4
    public final void a(long j7) {
        this.f11026f = j7;
        this.f11027g = 0;
        this.f11028h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.q4
    public final void b(int i7, long j7) {
        this.f11021a.p(new w4(this.f11023c, 1, i7, j7));
        this.f11022b.b(this.f11024d);
    }

    @Override // com.google.android.gms.internal.ads.q4
    public final boolean c(pc4 pc4Var, long j7) {
        long j8;
        int i7;
        int i8;
        long j9 = j7;
        while (j9 > 0 && (i7 = this.f11027g) < (i8 = this.f11025e)) {
            int a7 = rd4.a(this.f11022b, pc4Var, (int) Math.min(i8 - i7, j9), true);
            if (a7 == -1) {
                j9 = 0;
            } else {
                this.f11027g += a7;
                j9 -= a7;
            }
        }
        int i9 = this.f11023c.f12074d;
        int i10 = this.f11027g / i9;
        if (i10 > 0) {
            long j10 = this.f11026f;
            long Z = n13.Z(this.f11028h, 1000000L, r6.f12073c);
            int i11 = i10 * i9;
            int i12 = this.f11027g - i11;
            this.f11022b.a(j10 + Z, 1, i11, i12, null);
            this.f11028h += i10;
            this.f11027g = i12;
            j8 = 0;
        } else {
            j8 = 0;
        }
        return j9 <= j8;
    }
}
