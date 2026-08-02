package r0;

import T.C0097o;
import Y.z;
import d2.C0389g;
import i2.AbstractC0457a;
import q0.a0;
import y0.F;

/* loaded from: classes.dex */
public final class o extends AbstractC1390a {
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public final C0097o f15185p;

    /* renamed from: q, reason: collision with root package name */
    public long f15186q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15187r;

    public o(Y.h hVar, Y.k kVar, C0097o c0097o, int i4, Object obj, long j4, long j5, long j6, int i5, C0097o c0097o2) {
        super(hVar, kVar, c0097o, i4, obj, j4, j5, -9223372036854775807L, -9223372036854775807L, j6);
        this.o = i5;
        this.f15185p = c0097o2;
    }

    @Override // r0.m
    public final boolean b() {
        return this.f15187r;
    }

    @Override // u0.k
    public final void c() {
        z zVar = this.f15146i;
        C0389g c0389g = this.f15115m;
        c0389g.getClass();
        for (a0 a0Var : (a0[]) c0389g.f8265c) {
            if (a0Var.f14957F != 0) {
                a0Var.f14957F = 0L;
                a0Var.z = true;
            }
        }
        F K2 = c0389g.K(this.o);
        K2.d(this.f15185p);
        try {
            long b4 = zVar.b(this.f15139b.a(this.f15186q));
            if (b4 != -1) {
                b4 += this.f15186q;
            }
            y0.k kVar = new y0.k(this.f15146i, this.f15186q, b4);
            for (int i4 = 0; i4 != -1; i4 = K2.g(kVar, Integer.MAX_VALUE, true)) {
                this.f15186q += i4;
            }
            K2.e(this.f15144g, 1, (int) this.f15186q, 0, null);
            AbstractC0457a.f(zVar);
            this.f15187r = true;
        } catch (Throwable th) {
            AbstractC0457a.f(zVar);
            throw th;
        }
    }

    @Override // u0.k
    public final void d() {
    }
}
