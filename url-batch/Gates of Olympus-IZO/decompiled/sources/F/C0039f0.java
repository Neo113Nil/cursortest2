package F;

import e2.AbstractC0381e;
import t0.AbstractC0898f;
import t0.InterfaceC0903k;
import t0.InterfaceC0914w;

/* renamed from: F.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039f0 extends U.k implements InterfaceC0903k, InterfaceC0914w {
    @Override // t0.InterfaceC0914w
    public final r0.B b(t0.O o3, r0.z zVar, long j3) {
        float f3 = 0;
        float n3 = AbstractC0381e.n(((M0.e) AbstractC0898f.i(this, AbstractC0031b0.f1199a)).f2766d, f3);
        r0.H b2 = zVar.b(j3);
        boolean z3 = this.p && !Float.isNaN(n3) && Float.compare(n3, f3) > 0;
        int k3 = Float.isNaN(n3) ? 0 : o3.k(n3);
        int max = z3 ? Math.max(b2.f7114d, k3) : b2.f7114d;
        int max2 = z3 ? Math.max(b2.f7115e, k3) : b2.f7115e;
        return o3.Y(max, max2, M1.v.f2804d, new C0037e0(max, b2, max2));
    }
}
