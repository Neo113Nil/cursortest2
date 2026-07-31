package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class u3 {

    /* renamed from: a, reason: collision with root package name */
    private final w2 f12610a;

    /* renamed from: b, reason: collision with root package name */
    private final ky2 f12611b;

    /* renamed from: c, reason: collision with root package name */
    private final cq2 f12612c = new cq2(new byte[64], 64);

    /* renamed from: d, reason: collision with root package name */
    private boolean f12613d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12614e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12615f;

    public u3(w2 w2Var, ky2 ky2Var) {
        this.f12610a = w2Var;
        this.f12611b = ky2Var;
    }

    public final void a(dr2 dr2Var) {
        long j7;
        dr2Var.b(this.f12612c.f3919a, 0, 3);
        this.f12612c.h(0);
        this.f12612c.j(8);
        this.f12613d = this.f12612c.l();
        this.f12614e = this.f12612c.l();
        this.f12612c.j(6);
        dr2Var.b(this.f12612c.f3919a, 0, this.f12612c.c(8));
        this.f12612c.h(0);
        if (this.f12613d) {
            this.f12612c.j(4);
            int c7 = this.f12612c.c(3);
            this.f12612c.j(1);
            int c8 = this.f12612c.c(15);
            this.f12612c.j(1);
            long c9 = (c7 << 30) | (c8 << 15) | this.f12612c.c(15);
            this.f12612c.j(1);
            if (!this.f12615f && this.f12614e) {
                this.f12612c.j(4);
                int c10 = this.f12612c.c(3);
                this.f12612c.j(1);
                int c11 = this.f12612c.c(15);
                this.f12612c.j(1);
                int c12 = this.f12612c.c(15);
                this.f12612c.j(1);
                this.f12611b.b((c11 << 15) | (c10 << 30) | c12);
                this.f12615f = true;
            }
            j7 = this.f12611b.b(c9);
        } else {
            j7 = 0;
        }
        this.f12610a.e(j7, 4);
        this.f12610a.a(dr2Var);
        this.f12610a.c();
    }

    public final void b() {
        this.f12615f = false;
        this.f12610a.b();
    }
}
