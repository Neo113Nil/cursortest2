package r;

import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import t0.InterfaceC1009w;

/* loaded from: classes.dex */
public final class c0 extends U.p implements InterfaceC1009w {

    /* renamed from: q, reason: collision with root package name */
    public int f8042q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8043r;

    /* renamed from: s, reason: collision with root package name */
    public f2.k f8044s;

    @Override // t0.InterfaceC1009w
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        AbstractC0893O b3 = interfaceC0884F.b(O2.d.a(this.f8042q != 1 ? 0 : O0.a.j(j3), (this.f8042q == 1 || !this.f8043r) ? O0.a.h(j3) : Integer.MAX_VALUE, this.f8042q == 2 ? O0.a.i(j3) : 0, (this.f8042q == 2 || !this.f8043r) ? O0.a.g(j3) : Integer.MAX_VALUE));
        int y3 = O2.d.y(b3.f8126d, O0.a.j(j3), O0.a.h(j3));
        int y4 = O2.d.y(b3.f8127e, O0.a.i(j3), O0.a.g(j3));
        return interfaceC0887I.i0(y3, y4, S1.v.f4321d, new b0(this, y3, b3, y4, interfaceC0887I));
    }
}
