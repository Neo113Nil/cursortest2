package t0;

import r0.C0837j;

/* renamed from: t0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0910s extends P {
    @Override // t0.O
    public final int W(C0837j c0837j) {
        I i3 = this.f7829o.f7877o.f7736y.f7814s;
        Z1.i.c(i3);
        boolean z3 = i3.f7759m;
        E e3 = i3.f7765t;
        if (!z3) {
            L l3 = i3.f7754A;
            if (l3.f7799c == 2) {
                e3.f7743f = true;
                if (e3.f7739b) {
                    l3.f7804h = true;
                    l3.f7805i = true;
                }
            } else {
                e3.f7744g = true;
            }
        }
        C0910s c0910s = i3.A().f7956M;
        if (c0910s != null) {
            c0910s.f7825k = true;
        }
        i3.e();
        C0910s c0910s2 = i3.A().f7956M;
        if (c0910s2 != null) {
            c0910s2.f7825k = false;
        }
        Integer num = (Integer) e3.f7746i.get(c0837j);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f7833t.put(c0837j, Integer.valueOf(intValue));
        return intValue;
    }

    @Override // r0.z
    public final r0.H b(long j3) {
        U(j3);
        a0 a0Var = this.f7829o;
        K.d t3 = a0Var.f7877o.t();
        int i3 = t3.f2642f;
        if (i3 > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                I i5 = ((D) objArr[i4]).f7736y.f7814s;
                Z1.i.c(i5);
                i5.f7758l = 3;
                i4++;
            } while (i4 < i3);
        }
        D d3 = a0Var.f7877o;
        P.p0(this, d3.f7729r.f(this, d3.l(), j3));
        return this;
    }

    @Override // t0.P
    public final void q0() {
        I i3 = this.f7829o.f7877o.f7736y.f7814s;
        Z1.i.c(i3);
        i3.e0();
    }
}
