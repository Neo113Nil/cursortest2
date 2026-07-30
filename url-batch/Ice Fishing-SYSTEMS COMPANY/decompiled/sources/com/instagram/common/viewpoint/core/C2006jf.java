package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.jf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2006jf implements InterfaceC1495b8 {
    public static String[] A03 = {"JSPFN54Hhto2krin5AXlvtsoUga8f3VN", "TJUa2zQB5Sn7m4BW7AASunbvdXy8BM9T", "6VrbDJWlH8cGoKCi2T6pLfOeL4USL1Zo", "WDYRHsse8CkpPKHQRRahwXj8yQt26EEK", "k2HMJqY12uG3JOOYcYA0rukTMokxTs2q", "JFWFpGWs655aVrqtTe7kn6NDgYp0Sw9v", "lGCVru2Pt3eCAyGNCmn4MueAiTs1TFsk", "y56t9BBTSrVMdPLNMlUp"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC2005je A01;
    public final /* synthetic */ UK A02;

    public C2006jf(AbstractC2005je abstractC2005je, int i, UK uk) {
        this.A01 = abstractC2005je;
        this.A00 = i;
        this.A02 = uk;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1495b8
    public final void AE7(C1494b7 c1494b7) {
        AbstractC1783fo abstractC1783fo;
        if (this.A00 == 0) {
            UK uk = this.A02;
            abstractC1783fo = this.A01.A04;
            uk.A1k(abstractC1783fo);
        }
        this.A02.A1o(c1494b7.A00() != null, true);
        if (A03[0].charAt(15) == 'S') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[1] = "iRqOIqAZ6TOb0gQaJ743l8NrEMVcYXI5";
        strArr[4] = "jzrwvLgYYMFr4hfD5uj52ory38hy0fYg";
    }
}
