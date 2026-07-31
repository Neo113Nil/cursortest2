package g1;

import g1.i0;
import o2.m0;
import r0.s1;

/* loaded from: classes.dex */
public final class v implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private s1 f16567a;

    /* renamed from: b, reason: collision with root package name */
    private o2.i0 f16568b;

    /* renamed from: c, reason: collision with root package name */
    private w0.e0 f16569c;

    public v(String str) {
        this.f16567a = new s1.b().e0(str).E();
    }

    private void a() {
        o2.a.h(this.f16568b);
        m0.j(this.f16569c);
    }

    @Override // g1.b0
    public void b(o2.i0 i0Var, w0.n nVar, i0.d dVar) {
        this.f16568b = i0Var;
        dVar.a();
        w0.e0 d7 = nVar.d(dVar.c(), 5);
        this.f16569c = d7;
        d7.e(this.f16567a);
    }

    @Override // g1.b0
    public void c(o2.a0 a0Var) {
        a();
        long d7 = this.f16568b.d();
        long e7 = this.f16568b.e();
        if (d7 == -9223372036854775807L || e7 == -9223372036854775807L) {
            return;
        }
        s1 s1Var = this.f16567a;
        if (e7 != s1Var.f20960u) {
            s1 E = s1Var.b().i0(e7).E();
            this.f16567a = E;
            this.f16569c.e(E);
        }
        int a7 = a0Var.a();
        this.f16569c.d(a0Var, a7);
        this.f16569c.b(d7, 1, a7, 0, null);
    }
}
