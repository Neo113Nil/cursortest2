package a1;

import a1.e;
import o2.a0;
import o2.w;
import r0.s1;
import w0.e0;

/* loaded from: classes.dex */
final class f extends e {

    /* renamed from: b, reason: collision with root package name */
    private final a0 f27b;

    /* renamed from: c, reason: collision with root package name */
    private final a0 f28c;

    /* renamed from: d, reason: collision with root package name */
    private int f29d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f31f;

    /* renamed from: g, reason: collision with root package name */
    private int f32g;

    public f(e0 e0Var) {
        super(e0Var);
        this.f27b = new a0(w.f19796a);
        this.f28c = new a0(4);
    }

    @Override // a1.e
    protected boolean b(a0 a0Var) {
        int C = a0Var.C();
        int i7 = (C >> 4) & 15;
        int i8 = C & 15;
        if (i8 == 7) {
            this.f32g = i7;
            return i7 != 5;
        }
        throw new e.a("Video format not supported: " + i8);
    }

    @Override // a1.e
    protected boolean c(a0 a0Var, long j7) {
        int C = a0Var.C();
        long n7 = j7 + (a0Var.n() * 1000);
        if (C == 0 && !this.f30e) {
            a0 a0Var2 = new a0(new byte[a0Var.a()]);
            a0Var.j(a0Var2.d(), 0, a0Var.a());
            p2.a b7 = p2.a.b(a0Var2);
            this.f29d = b7.f19973b;
            this.f26a.e(new s1.b().e0("video/avc").I(b7.f19977f).j0(b7.f19974c).Q(b7.f19975d).a0(b7.f19976e).T(b7.f19972a).E());
            this.f30e = true;
            return false;
        }
        if (C != 1 || !this.f30e) {
            return false;
        }
        int i7 = this.f32g == 1 ? 1 : 0;
        if (!this.f31f && i7 == 0) {
            return false;
        }
        byte[] d7 = this.f28c.d();
        d7[0] = 0;
        d7[1] = 0;
        d7[2] = 0;
        int i8 = 4 - this.f29d;
        int i9 = 0;
        while (a0Var.a() > 0) {
            a0Var.j(this.f28c.d(), i8, this.f29d);
            this.f28c.O(0);
            int G = this.f28c.G();
            this.f27b.O(0);
            this.f26a.d(this.f27b, 4);
            this.f26a.d(a0Var, G);
            i9 = i9 + 4 + G;
        }
        this.f26a.b(n7, i7, i9, 0, null);
        this.f31f = true;
        return true;
    }
}
