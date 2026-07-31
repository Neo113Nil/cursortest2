package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q extends o0 {
    @Override // w1.n0
    public final int b0(u1.a aVar) {
        s0 s0Var = this.f7737r.f7614r.G.f7701q;
        q6.i.b(s0Var);
        g0 g0Var = s0Var.f7772t;
        j0 j0Var = s0Var.i;
        if (j0Var.f7689d == b0.f7591e) {
            g0Var.f7668d = true;
            if (g0Var.f7666b) {
                j0Var.f7691f = true;
                j0Var.f7692g = true;
            }
        } else {
            g0Var.f7669e = true;
        }
        q qVar = s0Var.m().R;
        if (qVar != null) {
            qVar.f7730n = true;
        }
        s0Var.q();
        q qVar2 = s0Var.m().R;
        if (qVar2 != null) {
            qVar2.f7730n = false;
        }
        Integer num = (Integer) g0Var.f7671g.get(aVar);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f7742w.h(intValue, aVar);
        return intValue;
    }

    @Override // u1.d0
    public final u1.l0 e(long j7) {
        X(j7);
        d1 d1Var = this.f7737r;
        o0.e x7 = d1Var.f7614r.x();
        Object[] objArr = x7.f5578d;
        int i = x7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            s0 s0Var = ((f0) objArr[i8]).G.f7701q;
            q6.i.b(s0Var);
            s0Var.f7765m = d0.f7612f;
        }
        f0 f0Var = d1Var.f7614r;
        o0.t0(this, f0Var.f7658x.e(this, f0Var.l(), j7));
        return this;
    }

    @Override // w1.o0
    public final void u0() {
        s0 s0Var = this.f7737r.f7614r.G.f7701q;
        q6.i.b(s0Var);
        s0Var.g0();
    }
}
