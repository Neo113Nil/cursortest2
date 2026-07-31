package b0;

import B.C0022x;
import e2.InterfaceC0424c;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import t0.InterfaceC1009w;

/* renamed from: b0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346o extends U.p implements InterfaceC1009w {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0424c f5428q;

    public C0346o(InterfaceC0424c interfaceC0424c) {
        this.f5428q = interfaceC0424c;
    }

    @Override // t0.InterfaceC1009w
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        AbstractC0893O b3 = interfaceC0884F.b(j3);
        return interfaceC0887I.i0(b3.f8126d, b3.f8127e, S1.v.f4321d, new C0022x(b3, 16, this));
    }

    @Override // U.p
    public final boolean n0() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f5428q + ')';
    }
}
