package c2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p extends p0 {
    @Override // a2.f0
    public final a2.o0 c(long j) {
        b0(j);
        i1 i1Var = this.B;
        o0.e w6 = i1Var.B.w();
        Object[] objArr = w6.f7317d;
        int i3 = w6.f7319i;
        for (int i10 = 0; i10 < i3; i10++) {
            s0 s0Var = ((g0) objArr[i10]).T.f1607q;
            s0Var.getClass();
            s0Var.f1665x = e0.f1530i;
        }
        g0 g0Var = i1Var.B;
        p0.s0(this, g0Var.K.a(this, g0Var.k(), j));
        return this;
    }

    @Override // c2.o0
    public final int d0(a2.a aVar) {
        s0 s0Var = this.B.B.T.f1607q;
        s0Var.getClass();
        k0 k0Var = s0Var.f1661t;
        c0 c0Var = k0Var.f1596d;
        c0 c0Var2 = c0.f1506e;
        h0 h0Var = s0Var.E;
        if (c0Var == c0Var2) {
            h0Var.f1573d = true;
            if (h0Var.f1571b) {
                k0Var.f1598f = true;
                k0Var.g = true;
            }
        } else {
            h0Var.f1574e = true;
        }
        p pVar = s0Var.v().f1640e0;
        if (pVar != null) {
            pVar.f1635x = true;
        }
        s0Var.B();
        p pVar2 = s0Var.v().f1640e0;
        if (pVar2 != null) {
            pVar2.f1635x = false;
        }
        Integer num = (Integer) h0Var.g.get(aVar);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.G.f(intValue, aVar);
        return intValue;
    }

    @Override // c2.p0
    public final void t0() {
        s0 s0Var = this.B.B.T.f1607q;
        s0Var.getClass();
        s0Var.g0();
    }
}
