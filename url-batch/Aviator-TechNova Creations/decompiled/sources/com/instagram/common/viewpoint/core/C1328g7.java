package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.g7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1328g7 implements QI {
    public final /* synthetic */ C02066g A00;

    public C1328g7(C02066g c02066g) {
        this.A00 = c02066g;
    }

    @Override // com.instagram.common.viewpoint.core.QI
    public final void ACK(AbstractC0706Qg abstractC0706Qg) {
        boolean A0G;
        abstractC0706Qg.A0d(true);
        if (abstractC0706Qg.A06 != null && abstractC0706Qg.A07 == null) {
            abstractC0706Qg.A06 = null;
        }
        abstractC0706Qg.A07 = null;
        A0G = abstractC0706Qg.A0G();
        if (!A0G && !this.A00.A1x(abstractC0706Qg.A0H) && abstractC0706Qg.A0i()) {
            this.A00.removeDetachedView(abstractC0706Qg.A0H, false);
        }
    }
}
