package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.5s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01925s extends FH {
    public static String[] A00 = {"f1NrkMLFHAOxAk1WYXb4ZQBI9BQGMxNf", "ieQbYkP9qXWhodiL", "FasCpRA2RHhykdlBGUblwYUAQMGKU0mS", "sjzKgK2sh59qhJK5Sm5NCXrbKyy", "73hXtYSYooo4yypUFlMlXcqu25ITYI9G", "jFG3gQjXUuH0GALbmhZbm14pHMTfeDNL", "AB4YZhA3BNaHUCHwFjy4bae76Yz8EFa9", "dMMrkYyDXzmdfTW8HhUzXkOm8W"};

    public C01925s(C00530h c00530h, int i, List<C1126cn> list, C1232eX c1232eX, Bundle bundle) {
        super(c00530h, i, list, c1232eX, bundle);
        c00530h.A1h(this);
        this.A03 = new LG(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int A25 = this.A0C.A25();
        if (this.A05 == null || A25 == -1) {
            return;
        }
        int curPos = this.A05.size();
        if (A25 < curPos - 1) {
            int i = A25 + 1;
            if (A00[2].charAt(8) != 'R') {
                throw new RuntimeException();
            }
            A00[2] = "QoZYEwWSRtnMYn7R6MgH1oBp1kGEXSrp";
            A0U(i);
        }
    }

    private void A01(int i) {
        int visibleItem = this.A0C.A26();
        int lastVisibleItem = this.A0C.A27();
        int firstVisibleItem = this.A0C.A25();
        if (firstVisibleItem != visibleItem) {
            A0S(visibleItem);
        }
        if (firstVisibleItem != lastVisibleItem) {
            A0S(lastVisibleItem);
        }
        A0T(firstVisibleItem);
        A0V(visibleItem, lastVisibleItem, i);
    }

    @Override // com.instagram.common.viewpoint.core.FH, com.instagram.common.viewpoint.core.QT
    public final void A0L(C02066g c02066g, int i) {
    }

    @Override // com.instagram.common.viewpoint.core.FH, com.instagram.common.viewpoint.core.QT
    public final void A0M(C02066g c02066g, int i, int i2) {
        if (this.A0C.A25() != -1) {
            AbstractC0512Ir curCard = (AbstractC0512Ir) this.A0C.A1o(this.A0C.A25());
            if (curCard != null && curCard.A1T() && !curCard.A1S()) {
                curCard.A1Q();
            }
            A01(i);
        }
    }

    @Override // com.instagram.common.viewpoint.core.FH
    public final void A0X(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.8f);
    }

    @Override // com.instagram.common.viewpoint.core.FH
    public final void A0Z(AbstractC0512Ir abstractC0512Ir, boolean z) {
        A0X(abstractC0512Ir, z);
        if (!z && abstractC0512Ir.A1S()) {
            abstractC0512Ir.A1P();
        }
    }

    @Override // com.instagram.common.viewpoint.core.FH
    public final boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final C1232eX A0b() {
        return this.A04;
    }

    public final void A0c(C1232eX c1232eX) {
        this.A04 = c1232eX;
    }

    public final void A0d(List<C1126cn> list) {
        this.A05 = list;
    }
}
