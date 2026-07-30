package defpackage;

import android.graphics.Paint;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c91 extends ks1 {
    public static final vs3 c0;
    public a91 a0;
    public b91 b0;

    static {
        vs3 e = yj1.e();
        e.e(aw.e);
        ((Paint) e.b).setStrokeWidth(1.0f);
        e.i(1);
        c0 = e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c91(i91 i91Var, a91 a91Var) {
        super(i91Var);
        this.a0 = a91Var;
        this.b0 = i91Var.s != null ? new b91(this) : null;
        if ((((ul1) a91Var).m.o & 512) == 0) {
            return;
        }
        b71.o();
        throw null;
    }

    @Override // defpackage.ks1
    public final void L0() {
        if (this.b0 == null) {
            this.b0 = new b91(this);
        }
    }

    @Override // defpackage.ks1
    public final sg1 O0() {
        return this.b0;
    }

    @Override // defpackage.ks1
    public final ul1 Q0() {
        return ((ul1) this.a0).m;
    }

    @Override // defpackage.jj1
    public final int V(int i) {
        a91 a91Var = this.a0;
        ks1 ks1Var = this.B;
        ks1Var.getClass();
        return a91Var.h(this, ks1Var, i);
    }

    @Override // defpackage.jj1
    public final int Y(int i) {
        a91 a91Var = this.a0;
        ks1 ks1Var = this.B;
        ks1Var.getClass();
        return a91Var.a(this, ks1Var, i);
    }

    @Override // defpackage.jj1
    public final int a0(int i) {
        a91 a91Var = this.a0;
        ks1 ks1Var = this.B;
        ks1Var.getClass();
        return a91Var.e(this, ks1Var, i);
    }

    @Override // defpackage.jj1
    public final n12 c(long j) {
        k0(j);
        a91 a91Var = this.a0;
        ks1 ks1Var = this.B;
        ks1Var.getClass();
        j1(a91Var.j(this, ks1Var, j));
        b1();
        return this;
    }

    @Override // defpackage.jj1
    public final int e(int i) {
        a91 a91Var = this.a0;
        ks1 ks1Var = this.B;
        ks1Var.getClass();
        return a91Var.c(this, ks1Var, i);
    }

    @Override // defpackage.ks1
    public final void f1(ls lsVar, dw0 dw0Var) {
        ks1 ks1Var;
        ks1 ks1Var2 = this.B;
        ks1Var2.getClass();
        ks1Var2.J0(lsVar, dw0Var);
        if (!((t7) l91.a(this.A)).getShowLayoutBounds() || (ks1Var = this.B) == null) {
            return;
        }
        if (x31.a(this.o, ks1Var.o) && s31.a(ks1Var.L, 0L)) {
            return;
        }
        long j = this.o;
        lsVar.a(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, c0);
    }

    @Override // defpackage.n12
    public final void i0(long j, float f, Function1 function1) {
        g1(j, f, function1);
        if (this.v) {
            return;
        }
        c1();
        y0().b();
        this.B.getClass();
    }

    @Override // defpackage.qg1
    public final int n0(xx0 xx0Var) {
        b91 b91Var = this.b0;
        if (b91Var == null) {
            return ll3.e(this, xx0Var);
        }
        hn1 hn1Var = b91Var.F;
        int d = hn1Var.d(xx0Var);
        if (d >= 0) {
            return hn1Var.c[d];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s1(a91 a91Var) {
        if (a91Var.equals(this.a0) || (((ul1) a91Var).m.o & 512) == 0) {
            this.a0 = a91Var;
        } else {
            b71.o();
        }
    }
}
