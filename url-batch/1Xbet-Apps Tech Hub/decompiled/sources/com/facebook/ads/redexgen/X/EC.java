package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class EC extends ZB {
    public final /* synthetic */ AbstractC0989Yw A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EC(AbstractC0989Yw abstractC0989Yw, Context context) {
        super(context);
        this.A00 = abstractC0989Yw;
    }

    @Override // com.facebook.ads.redexgen.X.ZB, com.facebook.ads.redexgen.X.AbstractC02454p
    public final void A0I(View view, C02474r c02474r, C02434n c02434n) {
        AbstractC0989Yw abstractC0989Yw = this.A00;
        int[] A0H = abstractC0989Yw.A0H(abstractC0989Yw.A00.getLayoutManager(), view);
        int time = A0H[0];
        int dy = A0H[1];
        int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
        if (dx > 0) {
            c02434n.A04(time, dy, dx, ((ZB) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.ZB
    public final float A0J(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
