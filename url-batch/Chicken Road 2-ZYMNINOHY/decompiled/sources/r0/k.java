package r0;

import T.C0097o;
import T.F;
import W.u;
import Y.z;
import a.AbstractC0124a;
import d2.C0389g;
import i2.AbstractC0457a;
import q0.a0;

/* loaded from: classes.dex */
public final class k extends AbstractC1390a {
    public final int o;

    /* renamed from: p, reason: collision with root package name */
    public final long f15174p;

    /* renamed from: q, reason: collision with root package name */
    public final C1394e f15175q;

    /* renamed from: r, reason: collision with root package name */
    public long f15176r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f15177s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15178t;

    public k(Y.h hVar, Y.k kVar, C0097o c0097o, int i4, Object obj, long j4, long j5, long j6, long j7, long j8, int i5, long j9, C1394e c1394e) {
        super(hVar, kVar, c0097o, i4, obj, j4, j5, j6, j7, j8);
        this.o = i5;
        this.f15174p = j9;
        this.f15175q = c1394e;
    }

    @Override // r0.m
    public final long a() {
        return this.f15183j + this.o;
    }

    @Override // r0.m
    public final boolean b() {
        return this.f15178t;
    }

    @Override // u0.k
    public final void c() {
        C0389g c0389g = this.f15115m;
        c0389g.getClass();
        if (this.f15176r == 0) {
            long j4 = this.f15174p;
            for (a0 a0Var : (a0[]) c0389g.f8265c) {
                if (a0Var.f14957F != j4) {
                    a0Var.f14957F = j4;
                    a0Var.z = true;
                }
            }
            C1394e c1394e = this.f15175q;
            long j5 = this.f15113k;
            long j6 = j5 == -9223372036854775807L ? -9223372036854775807L : j5 - this.f15174p;
            long j7 = this.f15114l;
            c1394e.b(c0389g, j6, j7 != -9223372036854775807L ? j7 - this.f15174p : -9223372036854775807L);
        }
        try {
            Y.k a3 = this.f15139b.a(this.f15176r);
            z zVar = this.f15146i;
            y0.k kVar = new y0.k(zVar, a3.f3705e, zVar.b(a3));
            while (!this.f15177s) {
                try {
                    int c4 = this.f15175q.f15128a.c(kVar, C1394e.f15127k);
                    AbstractC0124a.t(c4 != 1);
                    if (!(c4 == 0)) {
                        break;
                    }
                } finally {
                    this.f15176r = kVar.f16169d - this.f15139b.f3705e;
                }
            }
            C0097o c0097o = this.f15141d;
            String str = c0097o.f2868m;
            int i4 = c0097o.f2852M;
            int i5 = c0097o.f2853N;
            if (F.k(str) && ((i4 > 1 || i5 > 1) && i4 != -1 && i5 != -1)) {
                y0.F K2 = c0389g.K(4);
                int i6 = i4 * i5;
                long j8 = (this.f15145h - this.f15144g) / i6;
                for (int i7 = 1; i7 < i6; i7++) {
                    K2.a(0, new u());
                    K2.e(i7 * j8, 0, 0, 0, null);
                }
            }
            AbstractC0457a.f(this.f15146i);
            this.f15178t = !this.f15177s;
        } catch (Throwable th) {
            AbstractC0457a.f(this.f15146i);
            throw th;
        }
    }

    @Override // u0.k
    public final void d() {
        this.f15177s = true;
    }
}
