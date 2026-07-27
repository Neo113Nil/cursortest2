package m;

import A.C0028y;
import W2.C0299v;
import W2.InterfaceC0280c0;
import p.C0928d;
import p.C0935k;
import p.InterfaceC0933i;

/* loaded from: classes.dex */
public final class H extends S.n {

    /* renamed from: t, reason: collision with root package name */
    public C0935k f8020t;

    /* renamed from: u, reason: collision with root package name */
    public C0928d f8021u;

    public final void B0(C0935k c0935k, InterfaceC0933i interfaceC0933i) {
        if (!this.f3990s) {
            c0935k.c(interfaceC0933i);
            return;
        }
        InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) ((b3.c) p0()).f5651d.k(C0299v.f4296e);
        W2.B.m(p0(), null, null, new G(c0935k, interfaceC0933i, interfaceC0280c0 != null ? interfaceC0280c0.r(new C0028y(c0935k, 25, interfaceC0933i)) : null, null), 3);
    }

    @Override // S.n
    public final boolean q0() {
        return false;
    }
}
