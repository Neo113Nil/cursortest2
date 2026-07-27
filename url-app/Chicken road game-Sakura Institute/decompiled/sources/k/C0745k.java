package k;

import A.C0028y;
import G.InterfaceC0191c0;
import l.g0;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import p0.InterfaceC0982r;
import z2.C1412P;

/* renamed from: k.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0745k implements InterfaceC0982r {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f7297a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0191c0 f7298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0746l f7299c;

    public C0745k(C0746l c0746l, g0 g0Var, InterfaceC0191c0 interfaceC0191c0) {
        this.f7299c = c0746l;
        this.f7297a = g0Var;
        this.f7298b = interfaceC0191c0;
    }

    @Override // p0.InterfaceC0982r
    public final int b(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return interfaceC0944E.X(i2);
    }

    @Override // p0.InterfaceC0982r
    public final int c(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return interfaceC0944E.S(i2);
    }

    @Override // p0.InterfaceC0982r
    public final int d(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return interfaceC0944E.Z(i2);
    }

    @Override // p0.InterfaceC0982r
    public final int f(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return interfaceC0944E.b(i2);
    }

    @Override // p0.InterfaceC0982r
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        InterfaceC0946G t4;
        AbstractC0954O a4 = interfaceC0944E.a(j4);
        C0746l c0746l = this.f7299c;
        long c4 = interfaceC0947H.A() ? u3.d.c(a4.f9005d, a4.f9006e) : ((M0.j) this.f7297a.a(new C0028y(c0746l, 18, this), new A.g0(14, c0746l)).getValue()).f3554a;
        t4 = interfaceC0947H.t((int) (c4 >> 32), (int) (4294967295L & c4), C1412P.c(), new C0744j(c0746l, a4, c4));
        return t4;
    }
}
