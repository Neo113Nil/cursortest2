package com.facebook.ads.redexgen.core;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.cU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2958cU extends RelativeLayout {
    public final View A00;
    public final C2913bl A01;

    public C2958cU(C3218gi c3218gi, View view) {
        super(c3218gi);
        this.A00 = view;
        this.A01 = new C2913bl(c3218gi);
        YB.A0K(this.A01);
    }

    public final void A00(int i) {
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, i));
    }

    public final void A01(C2918bq c2918bq, boolean z) {
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.A00.getId());
        if (c2918bq != null) {
            if (z) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                c2918bq.setAlignment(3);
                layoutParams2.setMargins(AbstractC2931c3.A08 / 2, AbstractC2931c3.A08 / 2, AbstractC2931c3.A08 / 2, AbstractC2931c3.A08 / 2);
                linearLayout.addView(c2918bq, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                YB.A0V(linearLayout, gradientDrawable);
            } else {
                RelativeLayout.LayoutParams insideLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                insideLayoutParams.addRule(3, this.A01.getId());
                insideLayoutParams.setMargins(0, AbstractC2931c3.A08, 0, 0);
                c2918bq.setAlignment(17);
                addView(c2918bq, insideLayoutParams);
            }
        }
        this.A01.addView(linearLayout, layoutParams);
        addView(this.A01, new RelativeLayout.LayoutParams(-1, -2));
    }
}
