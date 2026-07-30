package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.gA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1331gA implements InterfaceC0713Qn {
    public final /* synthetic */ C02066g A00;

    public C1331gA(C02066g c02066g) {
        this.A00 = c02066g;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0713Qn
    public final void AGP(AbstractC0706Qg abstractC0706Qg, QJ qj, QJ qj2) {
        this.A00.A1l(abstractC0706Qg, qj, qj2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0713Qn
    public final void AGR(AbstractC0706Qg abstractC0706Qg, QJ qj, QJ qj2) {
        this.A00.A0r.A0Y(abstractC0706Qg);
        this.A00.A1m(abstractC0706Qg, qj, qj2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0713Qn
    public final void AGT(AbstractC0706Qg abstractC0706Qg, QJ qj, QJ qj2) {
        abstractC0706Qg.A0d(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0R(abstractC0706Qg, abstractC0706Qg, qj, qj2)) {
                this.A00.A1O();
            }
        } else {
            if (!this.A00.A05.A0Q(abstractC0706Qg, qj, qj2)) {
                return;
            }
            this.A00.A1O();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0713Qn
    public final void AJo(AbstractC0706Qg abstractC0706Qg) {
        this.A00.A06.A1F(abstractC0706Qg.A0H, this.A00.A0r);
    }
}
