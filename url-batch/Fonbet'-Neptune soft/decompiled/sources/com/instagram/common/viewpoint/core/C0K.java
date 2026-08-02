package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.0K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0K extends C00470h {
    public C01865s A00;
    public List<C1120cn> A01;

    public C0K(C1153dL c1153dL) {
        super(c1153dL);
        this.A00 = new C01865s(this, 1, null, null, null);
    }

    public final void A20(C1226eX c1226eX) {
        if (this.A00 != null) {
            this.A00.A0c(c1226eX);
        }
    }

    public C01865s getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}
