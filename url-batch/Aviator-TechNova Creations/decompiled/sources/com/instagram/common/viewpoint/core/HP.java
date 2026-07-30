package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class HP implements InterfaceC0855Wc {
    public final /* synthetic */ C01614n A00;

    public HP(C01614n c01614n) {
        this.A00 = c01614n;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0855Wc
    public final void ACp() {
        InterfaceC1106cT interfaceC1106cT;
        int i;
        InterfaceC1106cT interfaceC1106cT2;
        interfaceC1106cT = this.A00.A0M;
        i = this.A00.A0C;
        interfaceC1106cT.ACy(i);
        interfaceC1106cT2 = this.A00.A0M;
        interfaceC1106cT2.ACZ();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0855Wc
    public final void AEn(float f) {
        int i;
        boolean z;
        E1 e1;
        int duration;
        boolean z2;
        int i2;
        InterfaceC1106cT interfaceC1106cT;
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
        interfaceC1106cT = this.A00.A0M;
        interfaceC1106cT.AJs(totalForce2);
    }
}
