package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0540Jt implements InterfaceC0855Wc {
    public final /* synthetic */ C01795f A00;

    public C0540Jt(C01795f c01795f) {
        this.A00 = c01795f;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0855Wc
    public final void ACp() {
        AbstractC0889Xm abstractC0889Xm;
        AbstractC0889Xm abstractC0889Xm2;
        this.A00.A02 = false;
        abstractC0889Xm = this.A00.A07;
        if (abstractC0889Xm != null) {
            abstractC0889Xm2 = this.A00.A07;
            abstractC0889Xm2.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0855Wc
    public final void AEn(float f) {
        AbstractC0889Xm abstractC0889Xm;
        AbstractC0889Xm abstractC0889Xm2;
        abstractC0889Xm = this.A00.A07;
        if (abstractC0889Xm != null) {
            abstractC0889Xm2 = this.A00.A07;
            abstractC0889Xm2.setProgressImmediate(100.0f * (1.0f - (f / this.A00.getAdInfo().A0K().A00())));
        }
    }
}
