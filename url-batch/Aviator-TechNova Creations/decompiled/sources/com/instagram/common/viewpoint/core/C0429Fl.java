package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Fl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0429Fl implements InterfaceC0888Xl {
    public static String[] A01 = {"ziFc1AxLwl06l9cm2ro8EEkTqcfxuLTc", "Ot3h47XlIqwqlb0VDKX34tYNREgAb88h", "XErmhi3UBKLFfekLEXmFG5T5AXnu", "x4ahbzSdp8w2tJq97wkZytqruvrbxvGd", "5eNtQA6JlDjBFR49aczWqHsgt2phfPFu", "5gzf4", "tgwS2khKEZgsCudiehRL6tpdm2kFQW", "Wy"};
    public final /* synthetic */ C01393r A00;

    public C0429Fl(C01393r c01393r) {
        this.A00 = c01393r;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0888Xl
    public final void ACC(AbstractC0889Xm abstractC0889Xm) {
        if (abstractC0889Xm.getToolbarActionMode() == 8) {
            this.A00.A0e();
            return;
        }
        ((G2) this.A00).A06.A04(UZ.A07, null);
        if (this.A00.A0i()) {
            return;
        }
        InterfaceC0890Xn interfaceC0890Xn = ((G2) this.A00).A09;
        YY yy = ((G2) this.A00).A0A;
        if (A01[7].length() != 2) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "aiGFPxx8CXfEdquuZVm2W5wuPm6cCNUb";
        strArr[3] = "iaZJUoQxe1noplKpEgf5PzuXPp1HxeHv";
        interfaceC0890Xn.A4b(yy.A7o());
    }
}
