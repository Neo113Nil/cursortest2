package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Tk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0850Tk extends AbstractC02384h {
    public static String[] A01 = {"8Yn2PgyedH1iX", "R67HljoZMbsPm0e6EtybvG", "", "R8Pp2uuVTku92bGxcvFWCvwfHASfPd1y", "2y5E80sPhAjkTDK", "Itturke", "abRBLy2wdT4xlnoMDCf2vtSzdY3x1mV2", "QG421Xj1ReSIzqeVHucrcoJTP843GzsJ"};
    public final /* synthetic */ C2O A00;

    public C0850Tk(C2O c2o) {
        this.A00 = c2o;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02384h
    public final void A0L(ED ed, int i) {
        int scrollPosition;
        super.A0L(ed, i);
        ZC linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager == null || (scrollPosition = linearLayoutManager.A27()) < 0 || this.A00.getAdapter() == null || scrollPosition >= this.A00.getAdapter().A0D()) {
            return;
        }
        InterfaceC0655Lw interfaceC0655Lw = (InterfaceC0655Lw) ed.A1F(scrollPosition);
        if (A01[1].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "EBOsosi";
        strArr[2] = "";
        if (interfaceC0655Lw == null) {
            return;
        }
        interfaceC0655Lw.AF7();
    }
}
