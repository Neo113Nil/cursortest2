package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class oe4 extends ne4 {

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f9627b;

    /* renamed from: c, reason: collision with root package name */
    private final dr2 f9628c;

    /* renamed from: d, reason: collision with root package name */
    private int f9629d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9630e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9631f;

    /* renamed from: g, reason: collision with root package name */
    private int f9632g;

    public oe4(td4 td4Var) {
        super(td4Var);
        this.f9627b = new dr2(th2.f12217a);
        this.f9628c = new dr2(4);
    }

    @Override // com.google.android.gms.internal.ads.ne4
    protected final boolean a(dr2 dr2Var) {
        int s7 = dr2Var.s();
        int i7 = s7 >> 4;
        int i8 = s7 & 15;
        if (i8 == 7) {
            this.f9632g = i7;
            return i7 != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i8);
        throw new me4(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.ne4
    protected final boolean b(dr2 dr2Var, long j7) {
        int s7 = dr2Var.s();
        long n7 = j7 + (dr2Var.n() * 1000);
        if (s7 == 0) {
            if (!this.f9630e) {
                dr2 dr2Var2 = new dr2(new byte[dr2Var.i()]);
                dr2Var.b(dr2Var2.h(), 0, dr2Var.i());
                xb4 a7 = xb4.a(dr2Var2);
                this.f9629d = a7.f14115b;
                bf4 bf4Var = new bf4();
                bf4Var.s("video/avc");
                bf4Var.f0(a7.f14119f);
                bf4Var.x(a7.f14116c);
                bf4Var.f(a7.f14117d);
                bf4Var.p(a7.f14118e);
                bf4Var.i(a7.f14114a);
                this.f9063a.b(bf4Var.y());
                this.f9630e = true;
                return false;
            }
        } else if (s7 == 1 && this.f9630e) {
            int i7 = this.f9632g == 1 ? 1 : 0;
            if (!this.f9631f && i7 == 0) {
                return false;
            }
            byte[] h7 = this.f9628c.h();
            h7[0] = 0;
            h7[1] = 0;
            h7[2] = 0;
            int i8 = 4 - this.f9629d;
            int i9 = 0;
            while (dr2Var.i() > 0) {
                dr2Var.b(this.f9628c.h(), i8, this.f9629d);
                this.f9628c.f(0);
                int v6 = this.f9628c.v();
                this.f9627b.f(0);
                this.f9063a.e(this.f9627b, 4);
                this.f9063a.e(dr2Var, v6);
                i9 = i9 + 4 + v6;
            }
            this.f9063a.a(n7, i7, i9, 0, null);
            this.f9631f = true;
            return true;
        }
        return false;
    }
}
