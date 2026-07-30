package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class G0 implements InterfaceC1106cT {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0442Fy A01;

    public G0(C0442Fy c0442Fy, int i) {
        this.A01 = c0442Fy;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1106cT
    public final void ABr() {
        this.A01.A0E();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1106cT
    public final void ACZ() {
        this.A01.A0V(false, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1106cT
    public final void ACy(int i) {
        C0442Fy.A02(this.A01, i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1106cT
    public final void ADI(float f) {
        boolean z;
        z = this.A01.A08;
        if (!z) {
            this.A01.A0J(f);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1106cT
    public final void AFE(boolean z) {
        this.A01.A0U(z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1106cT
    public final void AFg(String str) {
        C1159dL c1159dL;
        InterfaceC0890Xn interfaceC0890Xn;
        YY yy;
        c1159dL = this.A01.A0D;
        c1159dL.A0F().A3S(str);
        interfaceC0890Xn = this.A01.A0I;
        yy = this.A01.A0J;
        interfaceC0890Xn.A4b(yy.A7t());
        this.A01.A0K(3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1106cT
    public final void AJr() {
        AbstractC0889Xm abstractC0889Xm;
        AbstractC0889Xm abstractC0889Xm2;
        this.A01.setUnskippableSecondsComplete(false);
        abstractC0889Xm = this.A01.A0H;
        abstractC0889Xm.setProgressImmediate(0.0f);
        abstractC0889Xm2 = this.A01.A0H;
        abstractC0889Xm2.setToolbarActionMode(2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1106cT
    public final void AJs(float f) {
        AbstractC0889Xm abstractC0889Xm;
        abstractC0889Xm = this.A01.A0H;
        abstractC0889Xm.setProgress(100.0f * f);
    }
}
