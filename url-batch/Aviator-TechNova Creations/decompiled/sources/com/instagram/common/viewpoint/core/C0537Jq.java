package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Jq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0537Jq implements InterfaceC0855Wc {
    public final /* synthetic */ C01775d A00;

    public C0537Jq(C01775d c01775d) {
        this.A00 = c01775d;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0855Wc
    public final void ACp() {
        AbstractC0889Xm abstractC0889Xm;
        AbstractC0889Xm abstractC0889Xm2;
        this.A00.A0B = false;
        abstractC0889Xm = this.A00.A06;
        if (abstractC0889Xm != null) {
            abstractC0889Xm2 = this.A00.A06;
            abstractC0889Xm2.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0855Wc
    public final void AEn(float f) {
        AbstractC0889Xm abstractC0889Xm;
        AbstractC0889Xm abstractC0889Xm2;
        abstractC0889Xm = this.A00.A06;
        if (abstractC0889Xm != null) {
            abstractC0889Xm2 = this.A00.A06;
            abstractC0889Xm2.setProgressImmediate(100.0f * (1.0f - (f / this.A00.getAdInfo().A0K().A00())));
        }
    }
}
