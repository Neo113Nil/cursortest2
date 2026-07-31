package com.facebook.ads.redexgen.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2967cd extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC2416Kr A02;
    public static final int A05 = (int) (XX.A02 * 36.0f);
    public static final int A06 = (int) (XX.A02 * 36.0f);
    public static final int A03 = (int) (XX.A02 * 23.0f);
    public static final int A04 = (int) (XX.A02 * 3.0f);
    public static final int A07 = (int) (XX.A02 * 4.0f);

    public C2967cd(C3218gi c3218gi, ViewOnClickListenerC2416Kr viewOnClickListenerC2416Kr, AbstractC3383jd abstractC3383jd, VA va, InterfaceC2759Yh interfaceC2759Yh, C3163fp c3163fp, Y2 y2, C2476Na c2476Na, InterfaceC2896bU interfaceC2896bU) {
        super(c3218gi);
        this.A00 = c2476Na.A09(true);
        this.A01 = new RelativeLayout(c3218gi);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c3218gi, abstractC3383jd.A29().A0J().A04());
        if (viewOnClickListenerC2416Kr == null) {
            this.A02 = new ViewOnClickListenerC2416Kr(c3218gi, abstractC3383jd.A0w(), (C2476Na) null, va, interfaceC2759Yh, c3163fp, y2, abstractC3383jd.A2A());
        } else {
            this.A02 = viewOnClickListenerC2416Kr;
        }
        A03();
        this.A02.setCta(abstractC3383jd.A29().A0J(), abstractC3383jd.A2E(), new HashMap(), interfaceC2896bU);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C3218gi c3218gi, View view) {
        ImageView imageView = new ImageView(c3218gi);
        imageView.setImageBitmap(YN.A01(YM.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C3218gi c3218gi, String str) {
        Button button = new Button(c3218gi);
        YB.A0K(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        YB.A0Q(button, this.A00, A07);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c3218gi, button);
    }

    public final EnumC2467Mq A02(String str) {
        return this.A02.A0E(str);
    }

    public final void A03() {
        this.A02.setBackgroundColor(0);
        this.A02.setTextColor(0);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC3383jd abstractC3383jd, AbstractC2753Yb abstractC2753Yb) {
        this.A02.A0F(abstractC3383jd, abstractC2753Yb);
    }

    public void setCta(C2478Nc c2478Nc, String str, HashMap<String, String> extras, InterfaceC2896bU interfaceC2896bU) {
        this.A02.setCta(c2478Nc, str, extras, interfaceC2896bU);
    }
}
