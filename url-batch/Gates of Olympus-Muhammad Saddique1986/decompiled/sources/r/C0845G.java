package r;

import h2.AbstractC0508a;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import t0.InterfaceC1009w;

/* renamed from: r.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0845G extends U.p implements InterfaceC1009w {

    /* renamed from: q, reason: collision with root package name */
    public int f7968q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7969r;

    @Override // t0.InterfaceC1009w
    public final int b(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return this.f7968q == 1 ? interfaceC0884F.O(i3) : interfaceC0884F.U(i3);
    }

    @Override // t0.InterfaceC1009w
    public final int c(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return interfaceC0884F.V(i3);
    }

    @Override // t0.InterfaceC1009w
    public final int e(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return this.f7968q == 1 ? interfaceC0884F.O(i3) : interfaceC0884F.U(i3);
    }

    @Override // t0.InterfaceC1009w
    public final int f(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return interfaceC0884F.c(i3);
    }

    @Override // t0.InterfaceC1009w
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        int O3 = this.f7968q == 1 ? interfaceC0884F.O(O0.a.g(j3)) : interfaceC0884F.U(O0.a.g(j3));
        if (O3 < 0) {
            O3 = 0;
        }
        if (O3 >= 0) {
            long H3 = O2.d.H(O3, O3, 0, Integer.MAX_VALUE);
            if (this.f7969r) {
                H3 = O2.d.B(j3, H3);
            }
            AbstractC0893O b3 = interfaceC0884F.b(H3);
            return interfaceC0887I.i0(b3.f8126d, b3.f8127e, S1.v.f4321d, new A.i(b3, 8));
        }
        AbstractC0508a.X("width(" + O3 + ") must be >= 0");
        throw null;
    }
}
