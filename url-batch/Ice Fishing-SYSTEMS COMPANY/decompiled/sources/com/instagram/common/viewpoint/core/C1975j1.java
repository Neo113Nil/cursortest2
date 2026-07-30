package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.j1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1975j1 extends AbstractRunnableC1326Wc {
    public final /* synthetic */ AbstractC1974j0 A00;
    public final /* synthetic */ C1311Vm A01;

    public C1975j1(AbstractC1974j0 abstractC1974j0, C1311Vm c1311Vm) {
        this.A00 = abstractC1974j0;
        this.A01 = c1311Vm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        this.A00.A0B.A0F().A5g(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
