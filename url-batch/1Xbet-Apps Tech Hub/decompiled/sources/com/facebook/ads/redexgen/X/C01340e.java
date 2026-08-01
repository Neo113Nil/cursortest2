package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.0e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01340e extends C2O implements J2 {
    public C03579j A00;
    public List<PC> A01;

    public C01340e(YA ya) {
        super(ya);
        this.A00 = new C03579j(this, 1, null, null, null);
    }

    public final void A23(C0764Qb c0764Qb) {
        C03579j c03579j = this.A00;
        if (c03579j != null) {
            c03579j.A0d(c0764Qb);
        }
    }

    public C03579j getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0e(arrayList);
    }
}
