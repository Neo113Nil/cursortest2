package w1;

import android.graphics.Paint;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x extends d1 {
    public static final f1.h S;
    public v Q;
    public w R;

    static {
        f1.h f6 = f1.p.f();
        f6.e(f1.s.f2702f);
        ((Paint) f6.f2660b).setStrokeWidth(1.0f);
        f6.j(1);
        S = f6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(f0 f0Var, v vVar) {
        super(f0Var);
        this.Q = vVar;
        this.R = f0Var.f7644j != null ? new w(this) : null;
        if ((((y0.l) vVar).f8706d.f8708f & 512) != 0) {
            throw new ClassCastException();
        }
    }

    @Override // w1.d1
    public final o0 C0() {
        return this.R;
    }

    @Override // w1.d1
    public final y0.l E0() {
        return ((y0.l) this.Q).f8706d;
    }

    @Override // u1.l0
    public final void U(long j7, float f6, p6.c cVar) {
        V0(j7, f6, cVar);
        if (this.f7729m) {
            return;
        }
        R0();
        m0().b();
        q6.i.b(this.f7615s);
    }

    @Override // w1.d1
    public final void U0(f1.q qVar, i1.b bVar) {
        d1 d1Var;
        d1 d1Var2 = this.f7615s;
        q6.i.b(d1Var2);
        d1Var2.x0(qVar, bVar);
        if (!((x1.t) i0.a(this.f7614r)).getShowLayoutBounds() || (d1Var = this.f7615s) == null) {
            return;
        }
        if (r2.k.a(this.f7232f, d1Var.f7232f) && r2.i.a(d1Var.C, 0L)) {
            return;
        }
        long j7 = this.f7232f;
        qVar.o(0.5f, 0.5f, ((int) (j7 >> 32)) - 0.5f, ((int) (j7 & 4294967295L)) - 0.5f, S);
    }

    @Override // w1.n0
    public final int b0(u1.a aVar) {
        w wVar = this.R;
        if (wVar == null) {
            return f.c(this, aVar);
        }
        o.d0 d0Var = wVar.f7742w;
        int d8 = d0Var.d(aVar);
        if (d8 >= 0) {
            return d0Var.f5436c[d8];
        }
        return Integer.MIN_VALUE;
    }

    @Override // u1.d0
    public final u1.l0 e(long j7) {
        X(j7);
        v vVar = this.Q;
        d1 d1Var = this.f7615s;
        q6.i.b(d1Var);
        Y0(vVar.e(this, d1Var, j7));
        Q0();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e1(v vVar) {
        if (!vVar.equals(this.Q) && (((y0.l) vVar).f8706d.f8708f & 512) != 0) {
            throw new ClassCastException();
        }
        this.Q = vVar;
    }

    @Override // w1.d1
    public final void z0() {
        if (this.R == null) {
            this.R = new w(this);
        }
    }
}
