package r;

import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import t0.InterfaceC1009w;

/* renamed from: r.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848J extends U.p implements InterfaceC1009w {

    /* renamed from: q, reason: collision with root package name */
    public float f7974q;

    /* renamed from: r, reason: collision with root package name */
    public float f7975r;

    /* renamed from: s, reason: collision with root package name */
    public float f7976s;

    /* renamed from: t, reason: collision with root package name */
    public float f7977t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7978u;

    @Override // t0.InterfaceC1009w
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        int l3 = interfaceC0887I.l(this.f7976s) + interfaceC0887I.l(this.f7974q);
        int l4 = interfaceC0887I.l(this.f7977t) + interfaceC0887I.l(this.f7975r);
        AbstractC0893O b3 = interfaceC0884F.b(O2.d.Y(-l3, -l4, j3));
        return interfaceC0887I.i0(O2.d.D(j3, b3.f8126d + l3), O2.d.C(j3, b3.f8127e + l4), S1.v.f4321d, new R.h(this, b3, interfaceC0887I, 8));
    }
}
