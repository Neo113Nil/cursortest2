package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.bI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1027bI extends AbstractRunnableC0840Vt {
    public final /* synthetic */ C1127cu A00;

    public C1027bI(C1127cu c1127cu) {
        this.A00 = c1127cu;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        for (C0761Sq c0761Sq : C0760Sp.A02()) {
            C0760Sp.A0A(this.A00, c0761Sq.A02(), c0761Sq.A00(), c0761Sq.A01(), false);
        }
        C0760Sp.A02().clear();
    }
}
