package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class HP implements InterfaceC0849Wc {
    public final /* synthetic */ C01554n A00;

    public HP(C01554n c01554n) {
        this.A00 = c01554n;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0849Wc
    public final void ACp() {
        InterfaceC1100cT interfaceC1100cT;
        int i;
        InterfaceC1100cT interfaceC1100cT2;
        interfaceC1100cT = this.A00.A0M;
        i = this.A00.A0C;
        interfaceC1100cT.ACy(i);
        interfaceC1100cT2 = this.A00.A0M;
        interfaceC1100cT2.ACZ();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0849Wc
    public final void AEn(float f) {
        int i;
        boolean z;
        E1 e1;
        int duration;
        boolean z2;
        int i2;
        InterfaceC1100cT interfaceC1100cT;
        i = this.A00.A0C;
        float f2 = i - f;
        z = this.A00.A0a;
        if (z) {
            duration = 0;
        } else {
            e1 = this.A00.A0P;
            duration = e1.getDuration();
        }
        float totalForce = f2 + duration;
        z2 = this.A00.A0a;
        if (z2) {
            i2 = this.A00.A0C;
        } else {
            i2 = this.A00.A0B;
        }
        float seenTime = i2;
        float totalForce2 = totalForce / seenTime;
        interfaceC1100cT = this.A00.A0M;
        interfaceC1100cT.AJs(totalForce2);
    }
}
