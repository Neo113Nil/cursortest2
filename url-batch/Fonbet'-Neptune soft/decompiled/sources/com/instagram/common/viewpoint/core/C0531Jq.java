package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Jq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0531Jq implements InterfaceC0849Wc {
    public final /* synthetic */ C01715d A00;

    public C0531Jq(C01715d c01715d) {
        this.A00 = c01715d;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0849Wc
    public final void ACp() {
        AbstractC0883Xm abstractC0883Xm;
        AbstractC0883Xm abstractC0883Xm2;
        this.A00.A0B = false;
        abstractC0883Xm = this.A00.A06;
        if (abstractC0883Xm != null) {
            abstractC0883Xm2 = this.A00.A06;
            abstractC0883Xm2.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0849Wc
    public final void AEn(float f) {
        AbstractC0883Xm abstractC0883Xm;
        AbstractC0883Xm abstractC0883Xm2;
        abstractC0883Xm = this.A00.A06;
        if (abstractC0883Xm != null) {
            abstractC0883Xm2 = this.A00.A06;
            abstractC0883Xm2.setProgressImmediate(100.0f * (1.0f - (f / this.A00.getAdInfo().A0K().A00())));
        }
    }
}
