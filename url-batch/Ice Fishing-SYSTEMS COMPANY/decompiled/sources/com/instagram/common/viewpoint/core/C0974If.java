package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.If, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0974If implements XN {
    public static String[] A01 = {"72ztA7TlK5AWnMBFqm0ulEGrNikWU87c", "q9jSjTIXJJeud4mNFdEJpcs0aBWF", "6LBG7Z", "4a80CIrFExPHnWcdf8FRxARvXokzjsAY", "hmt020juZcOK2XVUFVfIwXvCI0upMeB5", "bPuxHbTn8HkB22ksZqTc8mW6RF8jNMxu", "KvPASdtvPFN6v", "W7wSubo8j20OAA03KxoOzu7JM99EpBz5"};
    public final /* synthetic */ C06585h A00;

    public C0974If(C06585h c06585h) {
        this.A00 = c06585h;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        AbstractC1552c3 abstractC1552c3;
        AbstractC1552c3 abstractC1552c32;
        InterfaceC1659dm interfaceC1659dm;
        AbstractC1552c3 abstractC1552c33;
        InterfaceC1659dm interfaceC1659dm2;
        AbstractC1374Yb abstractC1374Yb;
        InterfaceC1659dm interfaceC1659dm3;
        int i;
        AbstractC1552c3 abstractC1552c34;
        InterfaceC1659dm interfaceC1659dm4;
        AbstractC1374Yb abstractC1374Yb2;
        abstractC1552c3 = this.A00.A01;
        if (abstractC1552c3 instanceof C1022Kc) {
            abstractC1552c34 = this.A00.A01;
            if (abstractC1552c34.A1M()) {
                interfaceC1659dm4 = this.A00.A07;
                interfaceC1659dm4.AFw(true);
                abstractC1374Yb2 = this.A00.A06;
                abstractC1374Yb2.setToolbarActionMode(1);
                interfaceC1659dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC1659dm3.ADc(i);
            }
        }
        abstractC1552c32 = this.A00.A01;
        if (abstractC1552c32 instanceof C1002Ji) {
            abstractC1552c33 = this.A00.A01;
            if (abstractC1552c33.A1M()) {
                interfaceC1659dm2 = this.A00.A07;
                interfaceC1659dm2.AFw(true);
                abstractC1374Yb = this.A00.A06;
                abstractC1374Yb.setToolbarActionMode(1);
                interfaceC1659dm3 = this.A00.A07;
                i = this.A00.A03;
                interfaceC1659dm3.ADc(i);
            }
        }
        interfaceC1659dm = this.A00.A07;
        String[] strArr = A01;
        if (strArr[4].charAt(11) == strArr[3].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "jNYMJATRfaQqNW2YkrgQ7vcVmM2IUm0K";
        strArr2[0] = "cX4sd5TjwRWpCL8J3hPSalfD2n4ZIotM";
        interfaceC1659dm.AFw(false);
        interfaceC1659dm3 = this.A00.A07;
        i = this.A00.A03;
        interfaceC1659dm3.ADc(i);
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f6) {
        InterfaceC1659dm interfaceC1659dm;
        int i;
        DZ dz;
        DZ dz2;
        int i4;
        interfaceC1659dm = this.A00.A07;
        i = this.A00.A03;
        interfaceC1659dm.ADw(i - f6);
        dz = this.A00.A02;
        if (dz != null) {
            dz2 = this.A00.A02;
            i4 = this.A00.A03;
            dz2.A07((int) (i4 - f6));
        }
    }
}
