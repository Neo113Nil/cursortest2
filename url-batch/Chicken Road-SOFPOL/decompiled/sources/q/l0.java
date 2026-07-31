package q;

import r.e1;
import r.f1;
import r.l1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l0 extends r0 {
    public final k0 A;

    /* renamed from: r, reason: collision with root package name */
    public l1 f5861r;

    /* renamed from: s, reason: collision with root package name */
    public f1 f5862s;

    /* renamed from: t, reason: collision with root package name */
    public f1 f5863t;

    /* renamed from: u, reason: collision with root package name */
    public m0 f5864u;

    /* renamed from: v, reason: collision with root package name */
    public n0 f5865v;

    /* renamed from: w, reason: collision with root package name */
    public p6.a f5866w;

    /* renamed from: x, reason: collision with root package name */
    public d0 f5867x;

    /* renamed from: y, reason: collision with root package name */
    public long f5868y = z.f5930a;

    /* renamed from: z, reason: collision with root package name */
    public y0.e f5869z;

    public l0(l1 l1Var, f1 f1Var, f1 f1Var2, m0 m0Var, n0 n0Var, p6.a aVar, d0 d0Var) {
        this.f5861r = l1Var;
        this.f5862s = f1Var;
        this.f5863t = f1Var2;
        this.f5864u = m0Var;
        this.f5865v = n0Var;
        this.f5866w = aVar;
        this.f5867x = d0Var;
        r2.b.b(0, 0, 15);
        this.A = new k0(this, 0);
        new k0(this, 1);
    }

    @Override // w1.v
    public final u1.f0 e(w1.n0 n0Var, u1.d0 d0Var, long j7) {
        if (this.f5861r.f6346a.b() == this.f5861r.f6349d.getValue()) {
            this.f5869z = null;
        } else if (this.f5869z == null) {
            y0.e r02 = r0();
            if (r02 == null) {
                r02 = y0.b.f8681d;
            }
            this.f5869z = r02;
        }
        boolean p7 = n0Var.p();
        d6.v vVar = d6.v.f2327d;
        if (p7) {
            u1.l0 e8 = d0Var.e(j7);
            long j8 = (e8.f7230d << 32) | (e8.f7231e & 4294967295L);
            this.f5868y = j8;
            return n0Var.e0((int) (j8 >> 32), (int) (4294967295L & j8), vVar, new c1.g(e8, 2));
        }
        if (!((Boolean) this.f5866w.b()).booleanValue()) {
            u1.l0 e9 = d0Var.e(j7);
            return n0Var.e0(e9.f7230d, e9.f7231e, vVar, new c1.g(e9, 3));
        }
        d0 d0Var2 = this.f5867x;
        f1 f1Var = d0Var2.f5812a;
        f1 f1Var2 = d0Var2.f5813b;
        l1 l1Var = d0Var2.f5814c;
        m0 m0Var = d0Var2.f5815d;
        n0 n0Var2 = d0Var2.f5816e;
        f1 f1Var3 = d0Var2.f5817f;
        e1 a8 = f1Var != null ? f1Var.a(new e0(m0Var, n0Var2, 0), new e0(m0Var, n0Var2, 1)) : null;
        e1 a9 = f1Var2 != null ? f1Var2.a(new e0(m0Var, n0Var2, 2), new e0(m0Var, n0Var2, 3)) : null;
        if (l1Var.f6346a.b() == c0.f5806d) {
            v0 v0Var = n0Var2.f5880a;
        } else {
            v0 v0Var2 = n0Var2.f5880a;
        }
        b1.f fVar = new b1.f(a8, a9, f1Var3 != null ? f1Var3.a(t.f5908j, new b1.f(null, m0Var, n0Var2, 4)) : null, 3);
        u1.l0 e10 = d0Var.e(j7);
        long j9 = (e10.f7231e & 4294967295L) | (e10.f7230d << 32);
        long j10 = !r2.k.a(this.f5868y, z.f5930a) ? this.f5868y : j9;
        f1 f1Var4 = this.f5862s;
        e1 a10 = f1Var4 != null ? f1Var4.a(this.A, new j0(this, j10, 0)) : null;
        if (a10 != null) {
            j9 = ((r2.k) a10.getValue()).f6528a;
        }
        long d8 = r2.b.d(j7, j9);
        f1 f1Var5 = this.f5863t;
        long j11 = f1Var5 != null ? ((r2.i) f1Var5.a(t.f5909k, new j0(this, j10, 1)).getValue()).f6522a : 0L;
        y0.e eVar = this.f5869z;
        return n0Var.e0((int) (d8 >> 32), (int) (d8 & 4294967295L), vVar, new i0(e10, r2.i.c(eVar != null ? eVar.a(j10, d8, r2.l.f6529d) : 0L, 0L), j11, fVar));
    }

    @Override // y0.l
    public final void j0() {
        this.f5868y = z.f5930a;
    }

    public final y0.e r0() {
        if (this.f5861r.f().a(c0.f5806d, c0.f5807e)) {
            a0 a0Var = this.f5864u.f5874a.f5921b;
            if (a0Var != null) {
                return a0Var.f5797a;
            }
            a0 a0Var2 = this.f5865v.f5880a.f5921b;
            if (a0Var2 != null) {
                return a0Var2.f5797a;
            }
            return null;
        }
        a0 a0Var3 = this.f5865v.f5880a.f5921b;
        if (a0Var3 != null) {
            return a0Var3.f5797a;
        }
        a0 a0Var4 = this.f5864u.f5874a.f5921b;
        if (a0Var4 != null) {
            return a0Var4.f5797a;
        }
        return null;
    }
}
