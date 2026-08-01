package c2;

import android.graphics.Paint;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q extends i1 {

    /* renamed from: f0, reason: collision with root package name */
    public static final y6.l f1638f0;

    /* renamed from: d0, reason: collision with root package name */
    public final z1 f1639d0;

    /* renamed from: e0, reason: collision with root package name */
    public p f1640e0;

    static {
        y6.l e2 = k1.v.e();
        e2.h(k1.p.f5338d);
        ((Paint) e2.f10660e).setStrokeWidth(1.0f);
        e2.j(1);
        f1638f0 = e2;
    }

    public q(g0 g0Var) {
        super(g0Var);
        z1 z1Var = new z1();
        z1Var.f3308r = 0;
        this.f1639d0 = z1Var;
        z1Var.f3312v = this;
        this.f1640e0 = g0Var.f1556v != null ? new p(this) : null;
    }

    @Override // c2.i1
    public final p0 B0() {
        return this.f1640e0;
    }

    @Override // c2.i1
    public final d1.k D0() {
        return this.f1639d0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // c2.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(e1 e1Var, long j, o oVar, int i3, boolean z10) {
        int i10;
        boolean z11;
        g0 g0Var = this.B;
        boolean z12 = false;
        if (e1Var.e(g0Var)) {
            if (b1(j)) {
                i10 = i3;
                z11 = z10;
            } else {
                i10 = i3;
                if (i10 == 1 && (Float.floatToRawIntBits(v0(j, C0())) & Integer.MAX_VALUE) < 2139095040) {
                    z11 = false;
                }
            }
            z12 = true;
            if (z12) {
                return;
            }
            int i11 = oVar.f1630i;
            o0.e v10 = g0Var.v();
            Object[] objArr = v10.f7317d;
            int i12 = v10.f7319i - 1;
            while (i12 >= 0) {
                g0 g0Var2 = (g0) objArr[i12];
                if (g0Var2.F()) {
                    e1Var.a(g0Var2, j, oVar, i10, z11);
                    long b10 = oVar.b();
                    if (k.k(b10) < 0.0f && k.p(b10) && !k.o(b10) && !e1Var.c(oVar, g0Var2)) {
                        break;
                    }
                }
                i12--;
                i10 = i3;
            }
            oVar.f1630i = i11;
            return;
        }
        i10 = i3;
        z11 = z10;
        if (z12) {
        }
    }

    @Override // c2.i1
    public final void S0(k1.n nVar, n1.b bVar) {
        g0 g0Var = this.B;
        d2.v a9 = j0.a(g0Var);
        o0.e v10 = g0Var.v();
        Object[] objArr = v10.f7317d;
        int i3 = v10.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            g0 g0Var2 = (g0) objArr[i10];
            if (g0Var2.F()) {
                g0Var2.i(nVar, bVar);
            }
        }
        if (a9.getShowLayoutBounds()) {
            long j = this.f133i;
            nVar.a(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f1638f0);
        }
    }

    @Override // a2.o0
    public final void Z(long j, float f3, Function1 function1) {
        T0(j, f3, function1);
        if (this.f1634w) {
            return;
        }
        this.B.T.f1606p.f0();
    }

    @Override // a2.f0
    public final a2.o0 c(long j) {
        b0(j);
        g0 g0Var = this.B;
        o0.e w6 = g0Var.w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            ((g0) objArr[i10]).T.f1606p.f1693z = e0.f1530i;
        }
        W0(g0Var.K.a(this, g0Var.T.f1606p.c0(), j));
        N0();
        return this;
    }

    @Override // c2.o0
    public final int d0(a2.a aVar) {
        p pVar = this.f1640e0;
        if (pVar != null) {
            return pVar.d0(aVar);
        }
        w0 w0Var = this.B.T.f1606p;
        c0 c0Var = w0Var.f1687t.f1596d;
        c0 c0Var2 = c0.f1505d;
        h0 h0Var = w0Var.K;
        if (c0Var == c0Var2) {
            h0Var.f1573d = true;
            if (h0Var.f1571b) {
                w0Var.I = true;
                w0Var.J = true;
            }
        } else {
            h0Var.f1574e = true;
        }
        q v10 = w0Var.v();
        boolean z10 = v10.f1635x;
        v10.f1635x = true;
        w0Var.B();
        v10.f1635x = z10;
        Integer num = (Integer) h0Var.g.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // c2.i1
    public final void y0() {
        if (this.f1640e0 == null) {
            this.f1640e0 = new p(this);
        }
    }
}
