package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i80 implements jj1 {
    public final /* synthetic */ int m;
    public final jj1 n;
    public final Enum o;
    public final Enum p;

    public /* synthetic */ i80(jj1 jj1Var, Enum r2, Enum r3, int i) {
        this.m = i;
        this.n = jj1Var;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.jj1
    public final int V(int i) {
        switch (this.m) {
        }
        return this.n.V(i);
    }

    @Override // defpackage.jj1
    public final int Y(int i) {
        switch (this.m) {
        }
        return this.n.Y(i);
    }

    @Override // defpackage.jj1
    public final int a0(int i) {
        switch (this.m) {
        }
        return this.n.a0(i);
    }

    @Override // defpackage.jj1
    public final n12 c(long j) {
        int i = this.m;
        Enum r1 = this.o;
        Enum r2 = this.p;
        jj1 jj1Var = this.n;
        switch (i) {
            case 0:
                i41 i41Var = (i41) r1;
                if (((j41) r2) == j41.m) {
                    return new mm0(i41Var == i41.n ? jj1Var.Y(u10.g(j)) : jj1Var.V(u10.g(j)), u10.c(j) ? u10.g(j) : 32767, 0);
                }
                return new mm0(u10.d(j) ? u10.h(j) : 32767, i41Var == i41.n ? jj1Var.e(u10.h(j)) : jj1Var.a0(u10.h(j)), 0);
            case 1:
                wj1 wj1Var = (wj1) r1;
                if (((xj1) r2) == xj1.m) {
                    return new mm0(wj1Var == wj1.n ? jj1Var.Y(u10.g(j)) : jj1Var.V(u10.g(j)), u10.c(j) ? u10.g(j) : 32767, 1);
                }
                return new mm0(u10.d(j) ? u10.h(j) : 32767, wj1Var == wj1.n ? jj1Var.e(u10.h(j)) : jj1Var.a0(u10.h(j)), 1);
            default:
                ns1 ns1Var = (ns1) r1;
                if (((os1) r2) == os1.m) {
                    return new mm0(ns1Var == ns1.n ? jj1Var.Y(u10.g(j)) : jj1Var.V(u10.g(j)), u10.c(j) ? u10.g(j) : 32767, 2);
                }
                return new mm0(u10.d(j) ? u10.h(j) : 32767, ns1Var == ns1.n ? jj1Var.e(u10.h(j)) : jj1Var.a0(u10.h(j)), 2);
        }
    }

    @Override // defpackage.jj1
    public final int e(int i) {
        switch (this.m) {
        }
        return this.n.e(i);
    }

    @Override // defpackage.jj1
    public final Object i() {
        switch (this.m) {
        }
        return this.n.i();
    }
}
