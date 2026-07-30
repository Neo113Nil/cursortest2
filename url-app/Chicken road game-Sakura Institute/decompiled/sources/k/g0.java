package k;

import l.j1;
import l.k1;
import l.p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g0 extends s0.n implements r1.w {
    public s0.c A;
    public final f0 B;

    /* renamed from: s, reason: collision with root package name */
    public p1 f5212s;

    /* renamed from: t, reason: collision with root package name */
    public k1 f5213t;

    /* renamed from: u, reason: collision with root package name */
    public k1 f5214u;

    /* renamed from: v, reason: collision with root package name */
    public h0 f5215v;

    /* renamed from: w, reason: collision with root package name */
    public i0 f5216w;

    /* renamed from: x, reason: collision with root package name */
    public q6.a f5217x;

    /* renamed from: y, reason: collision with root package name */
    public x f5218y;

    /* renamed from: z, reason: collision with root package name */
    public long f5219z = s.f5262a;

    public g0(p1 p1Var, k1 k1Var, k1 k1Var2, h0 h0Var, i0 i0Var, q6.a aVar, x xVar) {
        this.f5212s = p1Var;
        this.f5213t = k1Var;
        this.f5214u = k1Var2;
        this.f5215v = h0Var;
        this.f5216w = i0Var;
        this.f5217x = aVar;
        this.f5218y = xVar;
        r4.a.c(0, 0, 15);
        this.B = new f0(this, 0);
        new f0(this, 1);
    }

    public final s0.c A0() {
        if (this.f5212s.f().a(w.f5278f, w.f5279g)) {
            t tVar = this.f5215v.f5222a.f5258b;
            if (tVar != null) {
                return tVar.f5263a;
            }
            t tVar2 = this.f5216w.f5225a.f5258b;
            if (tVar2 != null) {
                return tVar2.f5263a;
            }
            return null;
        }
        t tVar3 = this.f5216w.f5225a.f5258b;
        if (tVar3 != null) {
            return tVar3.f5263a;
        }
        t tVar4 = this.f5215v.f5222a.f5258b;
        if (tVar4 != null) {
            return tVar4.f5263a;
        }
        return null;
    }

    @Override // r1.w
    public final int b(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        return e0Var.d0(i7);
    }

    @Override // r1.w
    public final int e(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        return e0Var.c(i7);
    }

    @Override // r1.w
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        if (this.f5212s.f5610a.a() == this.f5212s.f5613d.getValue()) {
            this.A = null;
        } else if (this.A == null) {
            s0.c A0 = A0();
            if (A0 == null) {
                A0 = s0.b.f8078f;
            }
            this.A = A0;
        }
        boolean v5 = h0Var.v();
        e6.v vVar = e6.v.f2827f;
        if (v5) {
            p1.n0 b9 = e0Var.b(j8);
            long G = j1.c.G(b9.f7063f, b9.f7064g);
            this.f5219z = G;
            return h0Var.C((int) (G >> 32), (int) (4294967295L & G), vVar, new c0(b9, 0));
        }
        if (!((Boolean) this.f5217x.a()).booleanValue()) {
            p1.n0 b10 = e0Var.b(j8);
            return h0Var.C(b10.f7063f, b10.f7064g, vVar, new c0(b10, 1));
        }
        x xVar = this.f5218y;
        k1 k1Var = xVar.f5282a;
        k1 k1Var2 = xVar.f5283b;
        p1 p1Var = xVar.f5284c;
        h0 h0Var2 = xVar.f5285d;
        i0 i0Var = xVar.f5286e;
        k1 k1Var3 = xVar.f5287f;
        j1 a3 = k1Var != null ? k1Var.a(new y(h0Var2, i0Var, 0), new y(h0Var2, i0Var, 1)) : null;
        j1 a9 = k1Var2 != null ? k1Var2.a(new y(h0Var2, i0Var, 2), new y(h0Var2, i0Var, 3)) : null;
        if (p1Var.f5610a.a() == w.f5278f) {
            q0 q0Var = i0Var.f5225a;
        } else {
            q0 q0Var2 = i0Var.f5225a;
        }
        c.h hVar = new c.h(a3, a9, k1Var3 != null ? k1Var3.a(u.f5269k, new c.h(r4, h0Var2, i0Var, 3)) : null, 2);
        p1.n0 b11 = e0Var.b(j8);
        long G2 = j1.c.G(b11.f7063f, b11.f7064g);
        long j9 = !m2.j.a(this.f5219z, s.f5262a) ? this.f5219z : G2;
        k1 k1Var4 = this.f5213t;
        r4 = k1Var4 != null ? k1Var4.a(this.B, new e0(this, j9, 0)) : null;
        if (r4 != null) {
            G2 = ((m2.j) r4.getValue()).f6321a;
        }
        long t2 = r4.a.t(j8, G2);
        k1 k1Var5 = this.f5214u;
        long j10 = k1Var5 != null ? ((m2.h) k1Var5.a(u.f5272n, new e0(this, j9, 1)).getValue()).f6315a : 0L;
        s0.c cVar = this.A;
        return h0Var.C((int) (t2 >> 32), (int) (t2 & 4294967295L), vVar, new d0(b11, m2.h.c(cVar != null ? cVar.a(j9, t2, m2.k.f6322f) : 0L, 0L), j10, hVar, 0));
    }

    @Override // r1.w
    public final int h(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        return e0Var.a0(i7);
    }

    @Override // r1.w
    public final int i(r1.o0 o0Var, p1.e0 e0Var, int i7) {
        return e0Var.e0(i7);
    }

    @Override // s0.n
    public final void s0() {
        this.f5219z = s.f5262a;
    }
}
