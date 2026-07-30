package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.0K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0K extends C00530h {
    public C01925s A00;
    public List<C1126cn> A01;

    public C0K(C1159dL c1159dL) {
        super(c1159dL);
        this.A00 = new C01925s(this, 1, null, null, null);
    }

    public final void A20(C1232eX c1232eX) {
        if (this.A00 != null) {
            this.A00.A0c(c1232eX);
        }
    }

    public C01925s getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}
