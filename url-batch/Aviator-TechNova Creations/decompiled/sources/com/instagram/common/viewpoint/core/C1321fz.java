package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1321fz extends QT {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC1320fy A01;

    public C1321fz(AbstractC1320fy abstractC1320fy) {
        this.A01 = abstractC1320fy;
    }

    @Override // com.instagram.common.viewpoint.core.QT
    public final void A0L(C02066g c02066g, int i) {
        super.A0L(c02066g, i);
        if (i == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.instagram.common.viewpoint.core.QT
    public final void A0M(C02066g c02066g, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.A00 = true;
        }
    }
}
