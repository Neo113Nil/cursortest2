package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1491iz implements InterfaceC01674t {
    public InterfaceC0586Ln A02;
    public long A01 = 5242880;
    public int A00 = 20480;

    public final C1491iz A00(InterfaceC0586Ln interfaceC0586Ln) {
        this.A02 = interfaceC0586Ln;
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01674t
    public final C1490iy A59() {
        return new C1490iy((InterfaceC0586Ln) C3M.A01(this.A02), this.A01, this.A00);
    }
}
