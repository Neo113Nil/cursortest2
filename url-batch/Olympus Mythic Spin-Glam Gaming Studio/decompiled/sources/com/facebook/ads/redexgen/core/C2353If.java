package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.If, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2353If implements XN {
    public static String[] A01 = {"72ztA7TlK5AWnMBFqm0ulEGrNikWU87c", "q9jSjTIXJJeud4mNFdEJpcs0aBWF", "6LBG7Z", "4a80CIrFExPHnWcdf8FRxARvXokzjsAY", "hmt020juZcOK2XVUFVfIwXvCI0upMeB5", "bPuxHbTn8HkB22ksZqTc8mW6RF8jNMxu", "KvPASdtvPFN6v", "W7wSubo8j20OAA03KxoOzu7JM99EpBz5"};
    public final /* synthetic */ C20375h A00;

    public C2353If(C20375h c20375h) {
        this.A00 = c20375h;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        AbstractC2931c3 abstractC2931c3;
        AbstractC2931c3 abstractC2931c32;
        InterfaceC3038dm interfaceC3038dm;
        AbstractC2931c3 abstractC2931c33;
        InterfaceC3038dm interfaceC3038dm2;
        AbstractC2753Yb abstractC2753Yb;
        InterfaceC3038dm interfaceC3038dm3;
        int i;
        AbstractC2931c3 abstractC2931c34;
        InterfaceC3038dm interfaceC3038dm4;
        AbstractC2753Yb abstractC2753Yb2;
        abstractC2931c3 = this.A00.A01;
        if (abstractC2931c3 instanceof C2401Kc) {
            abstractC2931c34 = this.A00.A01;
            if (abstractC2931c34.A1M()) {
                interfaceC3038dm4 = this.A00.A07;
                interfaceC3038dm4.AFw(true);
                abstractC2753Yb2 = this.A00.A06;
                abstractC2753Yb2.setToolbarActionMode(1);
                interfaceC3038dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC3038dm3.ADc(i);
            }
        }
        abstractC2931c32 = this.A00.A01;
        if (abstractC2931c32 instanceof C2381Ji) {
            abstractC2931c33 = this.A00.A01;
            if (abstractC2931c33.A1M()) {
                interfaceC3038dm2 = this.A00.A07;
                interfaceC3038dm2.AFw(true);
                abstractC2753Yb = this.A00.A06;
                abstractC2753Yb.setToolbarActionMode(1);
                interfaceC3038dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC3038dm3.ADc(i);
            }
        }
        interfaceC3038dm = this.A00.A07;
        String[] strArr = A01;
        if (strArr[4].charAt(11) == strArr[3].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "jNYMJATRfaQqNW2YkrgQ7vcVmM2IUm0K";
        strArr2[0] = "cX4sd5TjwRWpCL8J3hPSalfD2n4ZIotM";
        interfaceC3038dm.AFw(false);
        interfaceC3038dm3 = this.A00.A07;
        i = this.A00.A03;
        interfaceC3038dm3.ADc(i);
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        InterfaceC3038dm interfaceC3038dm;
        int i;
        DZ dz;
        DZ dz2;
        int i2;
        interfaceC3038dm = this.A00.A07;
        i = this.A00.A03;
        interfaceC3038dm.ADw(i - f);
        dz = this.A00.A02;
        if (dz != null) {
            dz2 = this.A00.A02;
            i2 = this.A00.A03;
            dz2.A07((int) (i2 - f));
        }
    }
}
