package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.kZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2061kZ implements InterfaceC1069Lx {
    public final InterfaceC1066Lu A00;

    public C2061kZ(InterfaceC1066Lu interfaceC1066Lu) {
        this.A00 = interfaceC1066Lu;
    }

    public final InterfaceC1066Lu A00() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1069Lx
    public final C8J ACL() {
        return new C8J(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1069Lx
    public final C2065kd ACM() {
        return new C2065kd(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1069Lx
    public final C2065kd ACN(String str) {
        return new C2065kd(this, str);
    }
}
