package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.lI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1620lI implements InterfaceC0466Gw {
    public final long A00;
    public final C0465Gv A01;

    public C1620lI(long j) {
        this(j, 0L);
    }

    public C1620lI(long j, long j2) {
        this.A00 = j;
        this.A01 = new C0465Gv(j2 == 0 ? C0467Gx.A04 : new C0467Gx(0L, j2));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0466Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0466Gw
    public final C0465Gv A8t(long j) {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0466Gw
    public final boolean AAa() {
        return false;
    }
}
