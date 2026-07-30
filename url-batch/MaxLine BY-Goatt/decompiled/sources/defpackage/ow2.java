package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ow2 extends ul1 implements a91, xd0, xh2 {
    public String A;
    public pw2 B;
    public hp0 C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public Map H;
    public dz1 I;
    public nw2 J;
    public mw2 K;

    public final dz1 G0() {
        if (this.I == null) {
            this.I = new dz1(this.A, this.B, this.C, this.D, this.E, this.F, this.G);
        }
        dz1 dz1Var = this.I;
        dz1Var.getClass();
        return dz1Var;
    }

    public final dz1 H0(ca0 ca0Var) {
        dz1 dz1Var;
        mw2 mw2Var = this.K;
        if (mw2Var != null && mw2Var.c && (dz1Var = mw2Var.d) != null) {
            dz1Var.d(ca0Var);
            return dz1Var;
        }
        dz1 G0 = G0();
        G0.d(ca0Var);
        return G0;
    }

    @Override // defpackage.xh2
    public final void M(sh2 sh2Var) {
        nw2 nw2Var = this.J;
        if (nw2Var == null) {
            nw2Var = new nw2(this, 0);
            this.J = nw2Var;
        }
        yd ydVar = new yd(6, this.A, null);
        t71[] t71VarArr = ii2.a;
        sh2Var.d(gi2.A, pv.c(ydVar));
        mw2 mw2Var = this.K;
        if (mw2Var != null) {
            boolean z = mw2Var.c;
            ji2 ji2Var = gi2.C;
            t71[] t71VarArr2 = ii2.a;
            t71 t71Var = t71VarArr2[16];
            sh2Var.d(ji2Var, Boolean.valueOf(z));
            yd ydVar2 = new yd(6, mw2Var.b, null);
            ji2 ji2Var2 = gi2.B;
            t71 t71Var2 = t71VarArr2[15];
            sh2Var.d(ji2Var2, ydVar2);
        }
        sh2Var.d(rh2.k, new r1(null, new nw2(this, 1)));
        sh2Var.d(rh2.l, new r1(null, new nw2(this, 2)));
        sh2Var.d(rh2.m, new r1(null, new ng2(3, this)));
        ii2.a(sh2Var, nw2Var);
    }

    @Override // defpackage.a91
    public final int a(qg1 qg1Var, jj1 jj1Var, int i) {
        return ti2.c(H0(qg1Var).e(qg1Var.getLayoutDirection()).c());
    }

    @Override // defpackage.a91
    public final int c(qg1 qg1Var, jj1 jj1Var, int i) {
        return H0(qg1Var).a(i, qg1Var.getLayoutDirection());
    }

    @Override // defpackage.a91
    public final int e(qg1 qg1Var, jj1 jj1Var, int i) {
        return H0(qg1Var).a(i, qg1Var.getLayoutDirection());
    }

    @Override // defpackage.xd0
    public final void g(k91 k91Var) {
        if (!this.z) {
            return;
        }
        dz1 H0 = H0(k91Var);
        ja jaVar = H0.j;
        if (jaVar == null) {
            StringBuilder sb = new StringBuilder("no paragraph (layoutCache=");
            sb.append(this.I);
            mw2 mw2Var = this.K;
            sb.append(", textSubstitution=");
            sb.append(mw2Var);
            sb.append(')');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        ls o = k91Var.m.n.o();
        boolean z = H0.k;
        if (z) {
            long j = H0.l;
            o.m();
            o.g(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
        }
        try {
            un2 un2Var = this.B.a;
            xt2 xt2Var = un2Var.m;
            if (xt2Var == null) {
                xt2Var = xt2.b;
            }
            xt2 xt2Var2 = xt2Var;
            dk2 dk2Var = un2Var.n;
            if (dk2Var == null) {
                dk2Var = dk2.d;
            }
            dk2 dk2Var2 = dk2Var;
            ae0 ae0Var = un2Var.p;
            if (ae0Var == null) {
                ae0Var = vl0.a;
            }
            ae0 ae0Var2 = ae0Var;
            cq c = un2Var.a.c();
            if (c != null) {
                jaVar.g(o, c, this.B.a.a.a(), dk2Var2, xt2Var2, ae0Var2);
            } else {
                long j2 = aw.g;
                if (j2 == 16) {
                    j2 = this.B.b() != 16 ? this.B.b() : aw.b;
                }
                jaVar.f(o, j2, dk2Var2, xt2Var2, ae0Var2);
            }
            if (z) {
                o.j();
            }
        } finally {
        }
    }

    @Override // defpackage.a91
    public final int h(qg1 qg1Var, jj1 jj1Var, int i) {
        return ti2.c(H0(qg1Var).e(qg1Var.getLayoutDirection()).a());
    }

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        long j2;
        boolean z;
        cz1 cz1Var;
        int i;
        dz1 H0 = H0(qj1Var);
        u81 layoutDirection = qj1Var.getLayoutDirection();
        if (H0.g > 1) {
            ol1 ol1Var = H0.m;
            pw2 pw2Var = H0.b;
            ca0 ca0Var = H0.i;
            ca0Var.getClass();
            ol1 s = z71.s(ol1Var, layoutDirection, pw2Var, ca0Var, H0.c);
            H0.m = s;
            int i2 = H0.g;
            float f = s.g;
            float f2 = s.f;
            if (Float.isNaN(f) || Float.isNaN(f2)) {
                float b = l41.k(pl1.a, s.e, v10.b(0, 0, 15), s.c, s.d, null, 1, 96).b();
                float b2 = l41.k(pl1.b, s.e, v10.b(0, 0, 15), s.c, s.d, null, 2, 96).b() - b;
                s.g = b;
                s.f = b2;
                f2 = b2;
                f = b;
            }
            if (i2 != 1) {
                i = Math.round((f2 * (i2 - 1)) + f);
                if (i < 0) {
                    i = 0;
                }
                int g = u10.g(j);
                if (i > g) {
                    i = g;
                }
            } else {
                i = u10.i(j);
            }
            j2 = v10.a(u10.j(j), u10.h(j), i, u10.g(j));
        } else {
            j2 = j;
        }
        ja jaVar = H0.j;
        if (jaVar == null || (cz1Var = H0.n) == null || cz1Var.b() || layoutDirection != H0.o || (!u10.b(j2, H0.p) && (u10.h(j2) != u10.h(H0.p) || u10.g(j2) < jaVar.b() || jaVar.d.d))) {
            ja b3 = H0.b(j2, layoutDirection);
            H0.p = j2;
            long d = v10.d(j2, zm3.d(ti2.c(b3.d()), ti2.c(b3.b())));
            H0.l = d;
            H0.k = H0.d != 3 && (((float) ((int) (d >> 32))) < b3.d() || ((float) ((int) (d & 4294967295L))) < b3.b());
            H0.j = b3;
            z = true;
        } else {
            if (!u10.b(j2, H0.p)) {
                ja jaVar2 = H0.j;
                jaVar2.getClass();
                long d2 = v10.d(j2, zm3.d(ti2.c(Math.min(jaVar2.a.u.c(), jaVar2.d())), ti2.c(jaVar2.b())));
                H0.l = d2;
                H0.k = H0.d != 3 && (((float) ((int) (d2 >> 32))) < jaVar2.d() || ((float) ((int) (d2 & 4294967295L))) < jaVar2.b());
                H0.p = j2;
            }
            z = false;
        }
        cz1 cz1Var2 = H0.n;
        if (cz1Var2 != null) {
            cz1Var2.b();
        }
        Unit unit = Unit.a;
        ja jaVar3 = H0.j;
        jaVar3.getClass();
        zv2 zv2Var = jaVar3.d;
        long j3 = H0.l;
        if (z) {
            s03.H(this, 2).X0();
            Map map = this.H;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            map.put(i6.a, Integer.valueOf(Math.round(zv2Var.d(0))));
            map.put(i6.b, Integer.valueOf(Math.round(zv2Var.d(zv2Var.g - 1))));
            this.H = map;
        }
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        n12 c = jj1Var.c(zm3.w(i3, i3, i4, i4));
        Map map2 = this.H;
        map2.getClass();
        return qj1Var.G(i3, i4, map2, new bb(c, 11));
    }
}
