package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.i8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1434i8 implements InterfaceC0937Zo {
    public static String[] A03 = {"JSPFN54Hhto2krin5AXlvtsoUga8f3VN", "TJUa2zQB5Sn7m4BW7AASunbvdXy8BM9T", "6VrbDJWlH8cGoKCi2T6pLfOeL4USL1Zo", "WDYRHsse8CkpPKHQRRahwXj8yQt26EEK", "k2HMJqY12uG3JOOYcYA0rukTMokxTs2q", "JFWFpGWs655aVrqtTe7kn6NDgYp0Sw9v", "lGCVru2Pt3eCAyGNCmn4MueAiTs1TFsk", "y56t9BBTSrVMdPLNMlUp"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1432i6 A01;
    public final /* synthetic */ C0696Qc A02;

    public C1434i8(AbstractC1432i6 abstractC1432i6, int i, C0696Qc c0696Qc) {
        this.A01 = abstractC1432i6;
        this.A00 = i;
        this.A02 = c0696Qc;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0937Zo
    public final void ADT(C0936Zn c0936Zn) {
        AbstractC1225eW abstractC1225eW;
        if (this.A00 == 0) {
            C0696Qc c0696Qc = this.A02;
            abstractC1225eW = this.A01.A04;
            c0696Qc.A1c(abstractC1225eW);
        }
        this.A02.A1f(c0936Zn.A00() != null, true);
        if (A03[0].charAt(15) == 'S') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[1] = "iRqOIqAZ6TOb0gQaJ743l8NrEMVcYXI5";
        strArr[4] = "jzrwvLgYYMFr4hfD5uj52ory38hy0fYg";
    }
}
