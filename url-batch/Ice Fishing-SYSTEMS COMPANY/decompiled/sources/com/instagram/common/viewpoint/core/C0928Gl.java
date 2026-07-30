package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Gl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0928Gl implements InterfaceC1373Ya {
    public final /* synthetic */ AbstractC0926Gj A00;

    public C0928Gl(AbstractC0926Gj abstractC0926Gj) {
        this.A00 = abstractC0926Gj;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1373Ya
    public final void ACl(AbstractC1374Yb abstractC1374Yb) {
        if (abstractC1374Yb.getToolbarActionMode() == 8) {
            this.A00.A0g();
            return;
        }
        this.A00.A07.A04(VH.A07, null);
        if (this.A00.A0l()) {
            return;
        }
        this.A00.A05.A0F().AB0();
        this.A00.A0A.A4j(this.A00.A0B.A7w());
    }
}
