package t0;

import r0.AbstractC0893O;
import r0.C0915l;
import r0.InterfaceC0885G;
import z.C1256t;

/* renamed from: t0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1005s extends Q {
    @Override // r0.InterfaceC0884F
    public final int O(int i3) {
        C1256t r3 = this.f8658o.f8711o.r();
        InterfaceC0885G n3 = r3.n();
        E e3 = (E) r3.f10466e;
        return n3.e((b0) e3.f8561y.f2913d, e3.l(), i3);
    }

    @Override // r0.InterfaceC0884F
    public final int U(int i3) {
        C1256t r3 = this.f8658o.f8711o.r();
        InterfaceC0885G n3 = r3.n();
        E e3 = (E) r3.f10466e;
        return n3.h((b0) e3.f8561y.f2913d, e3.l(), i3);
    }

    @Override // r0.InterfaceC0884F
    public final int V(int i3) {
        C1256t r3 = this.f8658o.f8711o.r();
        InterfaceC0885G n3 = r3.n();
        E e3 = (E) r3.f10466e;
        return n3.b((b0) e3.f8561y.f2913d, e3.l(), i3);
    }

    @Override // r0.InterfaceC0884F
    public final AbstractC0893O b(long j3) {
        m0(j3);
        b0 b0Var = this.f8658o;
        K.d v3 = b0Var.f8711o.v();
        int i3 = v3.f3216f;
        if (i3 > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                J j4 = ((E) objArr[i4]).f8562z.f8643s;
                f2.j.c(j4);
                j4.f8583l = 3;
                i4++;
            } while (i4 < i3);
        }
        E e3 = b0Var.f8711o;
        Q.y0(this, e3.f8554r.f(this, e3.l(), j3));
        return this;
    }

    @Override // r0.InterfaceC0884F
    public final int c(int i3) {
        C1256t r3 = this.f8658o.f8711o.r();
        InterfaceC0885G n3 = r3.n();
        E e3 = (E) r3.f10466e;
        return n3.a((b0) e3.f8561y.f2913d, e3.l(), i3);
    }

    @Override // t0.P
    public final int n0(C0915l c0915l) {
        J j3 = this.f8658o.f8711o.f8562z.f8643s;
        f2.j.c(j3);
        boolean z3 = j3.f8584m;
        F f3 = j3.f8591t;
        if (!z3) {
            M m3 = j3.f8579A;
            if (m3.f8627c == 2) {
                f3.f8568f = true;
                if (f3.f8564b) {
                    m3.f8632h = true;
                    m3.f8633i = true;
                }
            } else {
                f3.f8569g = true;
            }
        }
        C1005s c1005s = j3.Q().f8790N;
        if (c1005s != null) {
            c1005s.f8654k = true;
        }
        j3.h();
        C1005s c1005s2 = j3.Q().f8790N;
        if (c1005s2 != null) {
            c1005s2.f8654k = false;
        }
        Integer num = (Integer) f3.f8571i.get(c0915l);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f8663t.put(c0915l, Integer.valueOf(intValue));
        return intValue;
    }

    @Override // t0.Q
    public final void z0() {
        J j3 = this.f8658o.f8711o.f8562z.f8643s;
        f2.j.c(j3);
        j3.r0();
    }
}
