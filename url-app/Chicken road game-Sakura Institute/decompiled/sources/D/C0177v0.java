package D;

import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import r0.AbstractC1065f;
import r0.InterfaceC1071l;
import r0.InterfaceC1081w;
import z2.C1412P;

/* renamed from: D.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177v0 extends S.n implements InterfaceC1071l, InterfaceC1081w {
    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        InterfaceC0946G t4;
        float f4 = 0;
        float a4 = kotlin.ranges.b.a(((M0.e) AbstractC1065f.i(this, AbstractC0168s0.f2009a)).f3545d, f4);
        AbstractC0954O a5 = interfaceC0944E.a(j4);
        boolean z4 = this.f3990s && !Float.isNaN(a4) && Float.compare(a4, f4) > 0;
        int l4 = Float.isNaN(a4) ? 0 : interfaceC0947H.l(a4);
        int max = z4 ? Math.max(a5.f9005d, l4) : a5.f9005d;
        int max2 = z4 ? Math.max(a5.f9006e, l4) : a5.f9006e;
        t4 = interfaceC0947H.t(max, max2, C1412P.c(), new C0174u0(max, a5, max2));
        return t4;
    }
}
