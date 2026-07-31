package g1;

import g1.i0;
import o2.m0;

/* loaded from: classes.dex */
public final class c0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    private final b0 f16263a;

    /* renamed from: b, reason: collision with root package name */
    private final o2.a0 f16264b = new o2.a0(32);

    /* renamed from: c, reason: collision with root package name */
    private int f16265c;

    /* renamed from: d, reason: collision with root package name */
    private int f16266d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16267e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16268f;

    public c0(b0 b0Var) {
        this.f16263a = b0Var;
    }

    @Override // g1.i0
    public void a() {
        this.f16268f = true;
    }

    @Override // g1.i0
    public void b(o2.i0 i0Var, w0.n nVar, i0.d dVar) {
        this.f16263a.b(i0Var, nVar, dVar);
        this.f16268f = true;
    }

    @Override // g1.i0
    public void c(o2.a0 a0Var, int i7) {
        boolean z6 = (i7 & 1) != 0;
        int e7 = z6 ? a0Var.e() + a0Var.C() : -1;
        if (this.f16268f) {
            if (!z6) {
                return;
            }
            this.f16268f = false;
            a0Var.O(e7);
            this.f16266d = 0;
        }
        while (a0Var.a() > 0) {
            int i8 = this.f16266d;
            if (i8 < 3) {
                if (i8 == 0) {
                    int C = a0Var.C();
                    a0Var.O(a0Var.e() - 1);
                    if (C == 255) {
                        this.f16268f = true;
                        return;
                    }
                }
                int min = Math.min(a0Var.a(), 3 - this.f16266d);
                a0Var.j(this.f16264b.d(), this.f16266d, min);
                int i9 = this.f16266d + min;
                this.f16266d = i9;
                if (i9 == 3) {
                    this.f16264b.O(0);
                    this.f16264b.N(3);
                    this.f16264b.P(1);
                    int C2 = this.f16264b.C();
                    int C3 = this.f16264b.C();
                    this.f16267e = (C2 & 128) != 0;
                    this.f16265c = (((C2 & 15) << 8) | C3) + 3;
                    int b7 = this.f16264b.b();
                    int i10 = this.f16265c;
                    if (b7 < i10) {
                        this.f16264b.c(Math.min(4098, Math.max(i10, this.f16264b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(a0Var.a(), this.f16265c - this.f16266d);
                a0Var.j(this.f16264b.d(), this.f16266d, min2);
                int i11 = this.f16266d + min2;
                this.f16266d = i11;
                int i12 = this.f16265c;
                if (i11 != i12) {
                    continue;
                } else {
                    if (!this.f16267e) {
                        this.f16264b.N(i12);
                    } else {
                        if (m0.t(this.f16264b.d(), 0, this.f16265c, -1) != 0) {
                            this.f16268f = true;
                            return;
                        }
                        this.f16264b.N(this.f16265c - 4);
                    }
                    this.f16264b.O(0);
                    this.f16263a.c(this.f16264b);
                    this.f16266d = 0;
                }
            }
        }
    }
}
