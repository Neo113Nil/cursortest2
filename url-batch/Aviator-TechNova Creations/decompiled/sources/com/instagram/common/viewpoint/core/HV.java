package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class HV implements InterfaceC0855Wc {
    public static String[] A01 = {"72ztA7TlK5AWnMBFqm0ulEGrNikWU87c", "q9jSjTIXJJeud4mNFdEJpcs0aBWF", "6LBG7Z", "4a80CIrFExPHnWcdf8FRxARvXokzjsAY", "hmt020juZcOK2XVUFVfIwXvCI0upMeB5", "bPuxHbTn8HkB22ksZqTc8mW6RF8jNMxu", "KvPASdtvPFN6v", "W7wSubo8j20OAA03KxoOzu7JM99EpBz5"};
    public final /* synthetic */ AnonymousClass50 A00;

    public HV(AnonymousClass50 anonymousClass50) {
        this.A00 = anonymousClass50;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0855Wc
    public final void ACp() {
        AbstractC0993ae abstractC0993ae;
        AbstractC0993ae abstractC0993ae2;
        InterfaceC1106cT interfaceC1106cT;
        AbstractC0993ae abstractC0993ae3;
        InterfaceC1106cT interfaceC1106cT2;
        AbstractC0889Xm abstractC0889Xm;
        InterfaceC1106cT interfaceC1106cT3;
        int i;
        AbstractC0993ae abstractC0993ae4;
        InterfaceC1106cT interfaceC1106cT4;
        AbstractC0889Xm abstractC0889Xm2;
        abstractC0993ae = this.A00.A01;
        if (abstractC0993ae instanceof C0544Jx) {
            abstractC0993ae4 = this.A00.A01;
            if (abstractC0993ae4.A1K()) {
                interfaceC1106cT4 = this.A00.A07;
                interfaceC1106cT4.AFE(true);
                abstractC0889Xm2 = this.A00.A06;
                abstractC0889Xm2.setToolbarActionMode(1);
                interfaceC1106cT3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC1106cT3.ACy(i);
            }
        }
        abstractC0993ae2 = this.A00.A01;
        if (abstractC0993ae2 instanceof C0513Is) {
            abstractC0993ae3 = this.A00.A01;
            if (abstractC0993ae3.A1K()) {
                interfaceC1106cT2 = this.A00.A07;
                interfaceC1106cT2.AFE(true);
                abstractC0889Xm = this.A00.A06;
                abstractC0889Xm.setToolbarActionMode(1);
                interfaceC1106cT3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC1106cT3.ACy(i);
            }
        }
        interfaceC1106cT = this.A00.A07;
        String[] strArr = A01;
        if (strArr[4].charAt(11) == strArr[3].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "jNYMJATRfaQqNW2YkrgQ7vcVmM2IUm0K";
        strArr2[0] = "cX4sd5TjwRWpCL8J3hPSalfD2n4ZIotM";
        interfaceC1106cT.AFE(false);
        interfaceC1106cT3 = this.A00.A07;
        i = this.A00.A03;
        interfaceC1106cT3.ACy(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0855Wc
    public final void AEn(float f) {
        InterfaceC1106cT interfaceC1106cT;
        int i;
        C0362Cw c0362Cw;
        C0362Cw c0362Cw2;
        int i2;
        interfaceC1106cT = this.A00.A07;
        i = this.A00.A03;
        interfaceC1106cT.ADI(i - f);
        c0362Cw = this.A00.A02;
        if (c0362Cw != null) {
            c0362Cw2 = this.A00.A02;
            i2 = this.A00.A03;
            c0362Cw2.A07((int) (i2 - f));
        }
    }
}
