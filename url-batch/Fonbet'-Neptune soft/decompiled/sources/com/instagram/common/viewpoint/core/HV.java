package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class HV implements InterfaceC0849Wc {
    public static String[] A01 = {"72ztA7TlK5AWnMBFqm0ulEGrNikWU87c", "q9jSjTIXJJeud4mNFdEJpcs0aBWF", "6LBG7Z", "4a80CIrFExPHnWcdf8FRxARvXokzjsAY", "hmt020juZcOK2XVUFVfIwXvCI0upMeB5", "bPuxHbTn8HkB22ksZqTc8mW6RF8jNMxu", "KvPASdtvPFN6v", "W7wSubo8j20OAA03KxoOzu7JM99EpBz5"};
    public final /* synthetic */ AnonymousClass50 A00;

    public HV(AnonymousClass50 anonymousClass50) {
        this.A00 = anonymousClass50;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0849Wc
    public final void ACp() {
        AbstractC0987ae abstractC0987ae;
        AbstractC0987ae abstractC0987ae2;
        InterfaceC1100cT interfaceC1100cT;
        AbstractC0987ae abstractC0987ae3;
        InterfaceC1100cT interfaceC1100cT2;
        AbstractC0883Xm abstractC0883Xm;
        InterfaceC1100cT interfaceC1100cT3;
        int i;
        AbstractC0987ae abstractC0987ae4;
        InterfaceC1100cT interfaceC1100cT4;
        AbstractC0883Xm abstractC0883Xm2;
        abstractC0987ae = this.A00.A01;
        if (abstractC0987ae instanceof C0538Jx) {
            abstractC0987ae4 = this.A00.A01;
            if (abstractC0987ae4.A1K()) {
                interfaceC1100cT4 = this.A00.A07;
                interfaceC1100cT4.AFE(true);
                abstractC0883Xm2 = this.A00.A06;
                abstractC0883Xm2.setToolbarActionMode(1);
                interfaceC1100cT3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC1100cT3.ACy(i);
            }
        }
        abstractC0987ae2 = this.A00.A01;
        if (abstractC0987ae2 instanceof C0507Is) {
            abstractC0987ae3 = this.A00.A01;
            if (abstractC0987ae3.A1K()) {
                interfaceC1100cT2 = this.A00.A07;
                interfaceC1100cT2.AFE(true);
                abstractC0883Xm = this.A00.A06;
                abstractC0883Xm.setToolbarActionMode(1);
                interfaceC1100cT3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC1100cT3.ACy(i);
            }
        }
        interfaceC1100cT = this.A00.A07;
        String[] strArr = A01;
        if (strArr[4].charAt(11) == strArr[3].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "jNYMJATRfaQqNW2YkrgQ7vcVmM2IUm0K";
        strArr2[0] = "cX4sd5TjwRWpCL8J3hPSalfD2n4ZIotM";
        interfaceC1100cT.AFE(false);
        interfaceC1100cT3 = this.A00.A07;
        i = this.A00.A03;
        interfaceC1100cT3.ACy(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0849Wc
    public final void AEn(float f) {
        InterfaceC1100cT interfaceC1100cT;
        int i;
        C0356Cw c0356Cw;
        C0356Cw c0356Cw2;
        int i2;
        interfaceC1100cT = this.A00.A07;
        i = this.A00.A03;
        interfaceC1100cT.ADI(i - f);
        c0356Cw = this.A00.A02;
        if (c0356Cw != null) {
            c0356Cw2 = this.A00.A02;
            i2 = this.A00.A03;
            c0356Cw2.A07((int) (i2 - f));
        }
    }
}
