package r0;

import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0954O;
import p0.C0976l;
import p0.InterfaceC0945F;

/* renamed from: r0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1077s extends P {
    @Override // r0.P
    public final void D0() {
        J j4 = this.f9707r.f9762r.f9584C.f9692s;
        Intrinsics.c(j4);
        j4.v0();
    }

    @Override // p0.InterfaceC0944E
    public final int S(int i2) {
        l2.g r2 = this.f9707r.f9762r.r();
        InterfaceC0945F j4 = r2.j();
        E e4 = (E) r2.f7976b;
        return j4.a((a0) e4.B.f2910d, e4.l(), i2);
    }

    @Override // p0.InterfaceC0944E
    public final int X(int i2) {
        l2.g r2 = this.f9707r.f9762r.r();
        InterfaceC0945F j4 = r2.j();
        E e4 = (E) r2.f7976b;
        return j4.h((a0) e4.B.f2910d, e4.l(), i2);
    }

    @Override // p0.InterfaceC0944E
    public final int Z(int i2) {
        l2.g r2 = this.f9707r.f9762r.r();
        InterfaceC0945F j4 = r2.j();
        E e4 = (E) r2.f7976b;
        return j4.e((a0) e4.B.f2910d, e4.l(), i2);
    }

    @Override // p0.InterfaceC0944E
    public final AbstractC0954O a(long j4) {
        q0(j4);
        a0 a0Var = this.f9707r;
        I.d v4 = a0Var.f9762r.v();
        int i2 = v4.f3332i;
        if (i2 > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                J j5 = ((E) objArr[i4]).f9584C.f9692s;
                Intrinsics.c(j5);
                j5.f9636o = 3;
                i4++;
            } while (i4 < i2);
        }
        E e4 = a0Var.f9762r;
        P.C0(this, e4.f9608u.f(this, e4.l(), j4));
        return this;
    }

    @Override // p0.InterfaceC0944E
    public final int b(int i2) {
        l2.g r2 = this.f9707r.f9762r.r();
        InterfaceC0945F j4 = r2.j();
        E e4 = (E) r2.f7976b;
        return j4.g((a0) e4.B.f2910d, e4.l(), i2);
    }

    @Override // r0.O
    public final int r0(C0976l c0976l) {
        J j4 = this.f9707r.f9762r.f9584C.f9692s;
        Intrinsics.c(j4);
        boolean z4 = j4.f9637p;
        F f4 = j4.f9644w;
        if (!z4) {
            L l4 = j4.f9632D;
            if (l4.f9676c == 2) {
                f4.f9619f = true;
                if (f4.f9615b) {
                    l4.f9681h = true;
                    l4.f9682i = true;
                }
            } else {
                f4.f9620g = true;
            }
        }
        C1077s c1077s = j4.T().f9842Q;
        if (c1077s != null) {
            c1077s.f9703n = true;
        }
        j4.f();
        C1077s c1077s2 = j4.T().f9842Q;
        if (c1077s2 != null) {
            c1077s2.f9703n = false;
        }
        Integer num = (Integer) f4.f9622i.get(c0976l);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f9712w.put(c0976l, Integer.valueOf(intValue));
        return intValue;
    }
}
