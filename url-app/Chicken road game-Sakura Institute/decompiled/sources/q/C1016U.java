package q;

import a.AbstractC0345a;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import r0.InterfaceC1081w;
import z2.C1412P;

/* renamed from: q.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1016U extends S.n implements InterfaceC1081w {

    /* renamed from: t, reason: collision with root package name */
    public int f9217t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9218u;

    @Override // r0.InterfaceC1081w
    public final int b(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return this.f9217t == 1 ? interfaceC0944E.S(i2) : interfaceC0944E.X(i2);
    }

    @Override // r0.InterfaceC1081w
    public final int c(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return this.f9217t == 1 ? interfaceC0944E.S(i2) : interfaceC0944E.X(i2);
    }

    @Override // r0.InterfaceC1081w
    public final int d(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return interfaceC0944E.Z(i2);
    }

    @Override // r0.InterfaceC1081w
    public final int f(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        return interfaceC0944E.b(i2);
    }

    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        InterfaceC0946G t4;
        int S3 = this.f9217t == 1 ? interfaceC0944E.S(M0.a.h(j4)) : interfaceC0944E.X(M0.a.h(j4));
        if (S3 < 0) {
            S3 = 0;
        }
        if (S3 < 0) {
            AbstractC0345a.I("width(" + S3 + ") must be >= 0");
            throw null;
        }
        long t5 = u3.d.t(S3, S3, 0, Integer.MAX_VALUE);
        if (this.f9218u) {
            t5 = u3.d.q(j4, t5);
        }
        AbstractC0954O a4 = interfaceC0944E.a(t5);
        t4 = interfaceC0947H.t(a4.f9005d, a4.f9006e, C1412P.c(), new P0.n(a4, 6));
        return t4;
    }
}
