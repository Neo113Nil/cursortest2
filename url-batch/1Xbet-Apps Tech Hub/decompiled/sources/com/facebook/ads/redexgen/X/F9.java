package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class F9 extends AbstractC1046aT {
    public final YA A00;
    public final J6 A01;

    public F9(YA ya, C01520x c01520x, List<UJ> list, J6 j6) {
        super(c01520x, list, ya);
        this.A00 = ya;
        this.A01 = j6 == null ? new J6() : j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0849Tj A0C(ViewGroup viewGroup, int i) {
        return new C0849Tj(new C0654Lv(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1046aT, com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A0H */
    public final void A0E(C0849Tj c0849Tj, int i) {
        super.A0E(c0849Tj, i);
        C0654Lv c0654Lv = (C0654Lv) c0849Tj.A0l();
        A0F(c0654Lv.getImageCardView(), i);
        if (((AbstractC1046aT) this).A01.get(i) != null) {
            c0654Lv.setTitle(((AbstractC1046aT) this).A01.get(i).getAdHeadline());
            c0654Lv.setSubtitle(((AbstractC1046aT) this).A01.get(i).getAdLinkDescription());
            c0654Lv.setButtonText(((AbstractC1046aT) this).A01.get(i).getAdCallToAction());
        }
        UJ uj = ((AbstractC1046aT) this).A01.get(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0654Lv);
        uj.A1O(c0654Lv, c0654Lv, arrayList);
    }
}
