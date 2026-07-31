package l;

import B.C0022x;
import I.InterfaceC0142c0;
import m.f0;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import r0.InterfaceC0921r;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585k implements InterfaceC0921r {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f6498a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0142c0 f6499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0586l f6500c;

    public C0585k(C0586l c0586l, f0 f0Var, InterfaceC0142c0 interfaceC0142c0) {
        this.f6500c = c0586l;
        this.f6498a = f0Var;
        this.f6499b = interfaceC0142c0;
    }

    @Override // r0.InterfaceC0921r
    public final int b(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return interfaceC0884F.U(i3);
    }

    @Override // r0.InterfaceC0921r
    public final int c(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return interfaceC0884F.V(i3);
    }

    @Override // r0.InterfaceC0921r
    public final int e(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return interfaceC0884F.O(i3);
    }

    @Override // r0.InterfaceC0921r
    public final int f(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return interfaceC0884F.c(i3);
    }

    @Override // r0.InterfaceC0921r
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        AbstractC0893O b3 = interfaceC0884F.b(j3);
        C0586l c0586l = this.f6500c;
        long d3 = interfaceC0887I.D() ? O2.d.d(b3.f8126d, b3.f8127e) : ((O0.j) this.f6498a.a(new C0022x(c0586l, 20, this), new A0.l(20, c0586l)).getValue()).f3740a;
        return interfaceC0887I.i0((int) (d3 >> 32), (int) (4294967295L & d3), S1.v.f4321d, new C0584j(c0586l, b3, d3));
    }
}
