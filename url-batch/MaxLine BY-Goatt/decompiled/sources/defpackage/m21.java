package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m21 extends sg1 {
    @Override // defpackage.sg1
    public final void G0() {
        xg1 xg1Var = this.A.A.Q.q;
        xg1Var.getClass();
        xg1Var.t0();
    }

    @Override // defpackage.jj1
    public final int V(int i) {
        t21 t = this.A.A.t();
        oj1 A = t.A();
        i91 i91Var = (i91) t.n;
        return A.i(i91Var.P.d, i91Var.l(), i);
    }

    @Override // defpackage.jj1
    public final int Y(int i) {
        t21 t = this.A.A.t();
        oj1 A = t.A();
        i91 i91Var = (i91) t.n;
        return A.b(i91Var.P.d, i91Var.l(), i);
    }

    @Override // defpackage.jj1
    public final int a0(int i) {
        t21 t = this.A.A.t();
        oj1 A = t.A();
        i91 i91Var = (i91) t.n;
        return A.g(i91Var.P.d, i91Var.l(), i);
    }

    @Override // defpackage.jj1
    public final n12 c(long j) {
        k0(j);
        ks1 ks1Var = this.A;
        eo1 y = ks1Var.A.y();
        Object[] objArr = y.m;
        int i = y.o;
        for (int i2 = 0; i2 < i; i2++) {
            xg1 xg1Var = ((i91) objArr[i2]).Q.q;
            xg1Var.getClass();
            xg1Var.v = g91.o;
        }
        i91 i91Var = ks1Var.A;
        sg1.F0(this, i91Var.G.f(this, i91Var.l(), j));
        return this;
    }

    @Override // defpackage.jj1
    public final int e(int i) {
        t21 t = this.A.A.t();
        oj1 A = t.A();
        i91 i91Var = (i91) t.n;
        return A.a(i91Var.P.d, i91Var.l(), i);
    }

    @Override // defpackage.qg1
    public final int n0(xx0 xx0Var) {
        xg1 xg1Var = this.A.A.Q.q;
        xg1Var.getClass();
        m91 m91Var = xg1Var.r;
        e91 e91Var = m91Var.d;
        e91 e91Var2 = e91.n;
        j91 j91Var = xg1Var.C;
        if (e91Var == e91Var2) {
            j91Var.d = true;
            if (j91Var.b) {
                m91Var.f = true;
                m91Var.g = true;
            }
        } else {
            j91Var.e = true;
        }
        m21 m21Var = xg1Var.n().b0;
        if (m21Var != null) {
            m21Var.w = true;
        }
        xg1Var.q();
        m21 m21Var2 = xg1Var.n().b0;
        if (m21Var2 != null) {
            m21Var2.w = false;
        }
        Integer num = (Integer) j91Var.g.get(xx0Var);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.F.h(intValue, xx0Var);
        return intValue;
    }
}
