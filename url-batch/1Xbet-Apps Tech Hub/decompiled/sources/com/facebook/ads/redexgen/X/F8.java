package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class F8 extends AbstractC1046aT {
    public final YA A00;

    public F8(C01520x c01520x, List<UJ> list, YA ya) {
        super(c01520x, list, ya);
        this.A00 = ya;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0849Tj A0C(ViewGroup viewGroup, int i) {
        return new C0849Tj(new M0(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1046aT, com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A0H */
    public final void A0E(C0849Tj c0849Tj, int i) {
        super.A0E(c0849Tj, i);
        M0 m0 = (M0) c0849Tj.A0l();
        MC imageView = (MC) m0.getImageCardView();
        imageView.setImageDrawable(null);
        A0F(imageView, i);
        UJ childAd = ((AbstractC1046aT) this).A01.get(i);
        childAd.A11().A0G(this.A00);
        childAd.A1N(m0, m0);
    }
}
