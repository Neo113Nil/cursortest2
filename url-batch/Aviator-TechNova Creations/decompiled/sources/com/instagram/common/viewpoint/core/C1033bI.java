package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.bI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1033bI extends AbstractRunnableC0846Vt {
    public final /* synthetic */ C1133cu A00;

    public C1033bI(C1133cu c1133cu) {
        this.A00 = c1133cu;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        for (C0767Sq c0767Sq : C0766Sp.A02()) {
            C0766Sp.A0A(this.A00, c0767Sq.A02(), c0767Sq.A00(), c0767Sq.A01(), false);
        }
        C0766Sp.A02().clear();
    }
}
