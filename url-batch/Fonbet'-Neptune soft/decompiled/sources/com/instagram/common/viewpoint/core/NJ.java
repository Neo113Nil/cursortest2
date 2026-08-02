package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class NJ implements InterfaceC0849Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NI A01;

    public NJ(NI ni, int i) {
        this.A01 = ni;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0849Wc
    public final void ACp() {
        InterfaceC0884Xn interfaceC0884Xn;
        this.A01.A03 = false;
        this.A01.A0V();
        this.A01.A0E.setToolbarActionMode(this.A01.getCloseButtonStyle());
        if (this.A01.A07 && this.A01.A06 != null) {
            this.A01.A06.A05();
            interfaceC0884Xn = this.A01.A09;
            interfaceC0884Xn.A4b(new LX().A6d());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0849Wc
    public final void AEn(float f) {
        this.A01.A0E.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
