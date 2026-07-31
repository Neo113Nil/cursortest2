package y;

import F.C0;
import S1.v;
import Z.s;
import e2.InterfaceC0422a;
import n0.C0702C;
import n0.C0711i;
import n0.EnumC0712j;
import n0.w;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import t0.AbstractC1000m;
import t0.InterfaceC1009w;
import t0.m0;

/* renamed from: y.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1229c extends AbstractC1000m implements InterfaceC1009w, m0, Z.c {

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0422a f10374s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10375t;

    /* renamed from: u, reason: collision with root package name */
    public final C0702C f10376u;

    public C1229c(InterfaceC0422a interfaceC0422a) {
        this.f10374s = interfaceC0422a;
        C1228b c1228b = new C1228b(this, null);
        C0711i c0711i = w.f7336a;
        C0702C c0702c = new C0702C(null, null, null, c1228b);
        y0(c0702c);
        this.f10376u = c0702c;
    }

    @Override // t0.m0
    public final void N() {
        this.f10376u.N();
    }

    @Override // t0.InterfaceC1009w
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        int l3 = interfaceC0887I.l(androidx.compose.foundation.text.handwriting.a.f4859a);
        int l4 = interfaceC0887I.l(androidx.compose.foundation.text.handwriting.a.f4860b);
        int i3 = l4 * 2;
        int i4 = l3 * 2;
        AbstractC0893O b3 = interfaceC0884F.b(O2.d.Y(i3, i4, j3));
        int i5 = b3.f8127e - i4;
        return interfaceC0887I.i0(b3.f8126d - i3, i5, v.f4321d, new C0(b3, l4, l3, 2));
    }

    @Override // t0.m0
    public final void g0(C0711i c0711i, EnumC0712j enumC0712j, long j3) {
        this.f10376u.g0(c0711i, enumC0712j, j3);
    }

    @Override // Z.c
    public final void u(s sVar) {
        this.f10375t = sVar.a();
    }
}
