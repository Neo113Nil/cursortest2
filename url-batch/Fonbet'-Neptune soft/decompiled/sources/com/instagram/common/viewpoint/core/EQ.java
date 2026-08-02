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
public final class EQ extends LinearLayout implements InterfaceC1154dM {
    public final NativeBannerAd A00;
    public final C1153dL A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (AbstractC0856Wl.A02 * 42.0f);
    public static final int A03 = (int) (AbstractC0856Wl.A02 * 48.0f);
    public static final int A05 = (int) (AbstractC0856Wl.A02 * 54.0f);
    public static final int A07 = (int) (AbstractC0856Wl.A02 * 4.0f);
    public static final int A06 = (int) (AbstractC0856Wl.A02 * 8.0f);

    public EQ(C1153dL c1153dL, NativeBannerAd nativeBannerAd, C0813Ur c0813Ur, EnumC0814Us enumC0814Us, MediaView mediaView, AdOptionsView adOptionsView) {
        super(c1153dL);
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams ctaButtonParams;
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c1153dL;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int A00 = A00(enumC0814Us);
        C0968aL c0968aL = new C0968aL(this.A01);
        c0968aL.setFullCircleCorners(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A00, A00);
        layoutParams2.gravity = 16;
        c0968aL.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(c0968aL, layoutParams2);
        C1151dJ c1151dJ = new C1151dJ(c1153dL, this.A00, enumC0814Us, c0813Ur, adOptionsView);
        c1151dJ.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.gravity = 16;
        linearLayout.addView(c1151dJ, layoutParams3);
        if (enumC0814Us == EnumC0814Us.A0A) {
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
        c0813Ur.A05(ctaButton);
        ctaButton.setText(this.A00.getAdCallToAction());
        addView(ctaButton, ctaButtonParams);
        this.A02.add(mediaView);
        this.A02.add(ctaButton);
    }

    public static int A00(EnumC0814Us enumC0814Us) {
        switch (enumC0814Us) {
            case A0A:
                return A04;
            case A06:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1154dM
    public View getView() {
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1154dM
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1154dM
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
