package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n3 implements w3 {

    /* renamed from: a, reason: collision with root package name */
    private c0 f8903a;

    /* renamed from: b, reason: collision with root package name */
    private ky2 f8904b;

    /* renamed from: c, reason: collision with root package name */
    private td4 f8905c;

    public n3(String str) {
        bf4 bf4Var = new bf4();
        bf4Var.s(str);
        this.f8903a = bf4Var.y();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void a(dr2 dr2Var) {
        wu1.b(this.f8904b);
        int i7 = n13.f8865a;
        long d7 = this.f8904b.d();
        long e7 = this.f8904b.e();
        if (d7 == -9223372036854775807L || e7 == -9223372036854775807L) {
            return;
        }
        c0 c0Var = this.f8903a;
        if (e7 != c0Var.f3664p) {
            bf4 b7 = c0Var.b();
            b7.w(e7);
            c0 y6 = b7.y();
            this.f8903a = y6;
            this.f8905c.b(y6);
        }
        int i8 = dr2Var.i();
        rd4.b(this.f8905c, dr2Var, i8);
        this.f8905c.a(d7, 1, i8, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void b(ky2 ky2Var, rc4 rc4Var, k4 k4Var) {
        this.f8904b = ky2Var;
        k4Var.c();
        td4 r7 = rc4Var.r(k4Var.a(), 5);
        this.f8905c = r7;
        r7.b(this.f8903a);
    }
}
