package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public final class EQ extends LinearLayout implements InterfaceC1160dM {
    public final NativeBannerAd A00;
    public final C1159dL A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (AbstractC0862Wl.A02 * 42.0f);
    public static final int A03 = (int) (AbstractC0862Wl.A02 * 48.0f);
    public static final int A05 = (int) (AbstractC0862Wl.A02 * 54.0f);
    public static final int A07 = (int) (AbstractC0862Wl.A02 * 4.0f);
    public static final int A06 = (int) (AbstractC0862Wl.A02 * 8.0f);

    public EQ(C1159dL c1159dL, NativeBannerAd nativeBannerAd, C0819Ur c0819Ur, EnumC0820Us enumC0820Us, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c1159dL);
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams ctaButtonParams;
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c1159dL;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int A00 = A00(enumC0820Us);
        C0974aL c0974aL = new C0974aL(this.A01);
        c0974aL.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A00, A00);
        layoutParams2.gravity = 16;
        c0974aL.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(c0974aL, layoutParams2);
        C1157dJ c1157dJ = new C1157dJ(c1159dL, this.A00, enumC0820Us, c0819Ur, adOptionsView);
        c1157dJ.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.gravity = 16;
        linearLayout.addView(c1157dJ, layoutParams3);
        if (enumC0820Us == EnumC0820Us.A0A) {
            setPadding(A07, A07, A07, A07);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            ctaButtonParams = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            setPadding(A06, A06, A06, A06);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            ctaButtonParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView ctaButton = new TextView(getContext());
        ctaButton.setPadding(A06, A07, A06, A07);
        c0819Ur.A05(ctaButton);
        ctaButton.setText(this.A00.getAdCallToAction());
        addView(ctaButton, ctaButtonParams);
        this.A02.add(mediaView);
        this.A02.add(ctaButton);
    }

    public static int A00(EnumC0820Us enumC0820Us) {
        switch (enumC0820Us) {
            case A0A:
                return A04;
            case A06:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1160dM
    public View getView() {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1160dM
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1160dM
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
