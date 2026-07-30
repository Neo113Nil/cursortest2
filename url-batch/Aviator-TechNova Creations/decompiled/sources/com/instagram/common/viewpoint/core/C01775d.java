package com.instagram.common.viewpoint.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.common.base.Ascii;
import java.text.NumberFormat;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.5d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01775d extends AbstractC0543Jw {
    public static byte[] A0L;
    public static String[] A0M = {"zra6hnpaifP7bxfZB5bQOHnqie2tQjg", "wy9og3M9LeWlDzkU0RS7zgtaq3xQKlMR", "jyAiwm88v9hsYzrfl9gFIABQTfRULZfl", "Wwy1p0nUO1H5ggrsb6VvEsAvpBZyxSvp", "wjN7zQjrZyyYli8cgu97rk5B2y3BycTh", "DSxnyYt0igg0K0GbJ5jSMl2rvJzineXI", "irrLwQMNjn2DglpbBC8hfvG7oGwbzPRC", "9jAewdJckPVrzkqluL1z0QkIRDh51Ovv"};
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public static final int A0W;
    public static final int A0X;
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public View A00;
    public View A01;
    public ImageView A02;
    public C1159dL A03;
    public C0856Wd A04;
    public AbstractC0889Xm A05;
    public AbstractC0889Xm A06;
    public AbstractC0993ae A07;
    public C1143d4 A08;
    public C1149dA A09;
    public CU A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final Handler A0E;
    public final InterfaceC0890Xn A0F;
    public final InterfaceC0970aH A0G;
    public final C0971aI A0H;
    public final C0997ai A0I;
    public final E1 A0J;
    public final C0362Cw A0K;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 85);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0L = new byte[]{-23, -117, 1, -6, Ascii.SI, -2, Ascii.CAN, Ascii.FF, Ascii.CR, -6, Ascii.VT, Ascii.CR, 2, 7, 0, Ascii.CAN, -6, 7, 2, 6, -6, Ascii.CR, 2, 8, 7, Ascii.FF, Ascii.CAN, 9, 5, -6, Ascii.DC2, -2, -3, Ascii.SUB, Ascii.GS, 33, 19, 45, 32, 19, 37, Ascii.SI, 32, Ascii.DC2, 45, 33, 17, 32, 19, 19, Ascii.FS, 45, 33, Ascii.SYN, Ascii.GS, 37, Ascii.FS, -7, -29, -11, 1, -25, -16, -26, 1, -27, -29, -12, -26, 1, -11, -22, -15, -7, -16, -17, -19, -33, -20, -35, -26, -29, -35, -27};
    }

    static {
        A0C();
        A0Q = (int) (AbstractC0862Wl.A02 * 16.0f);
        A0b = (int) (AbstractC0862Wl.A02 * 12.0f);
        A0N = (int) (AbstractC0862Wl.A02 * 8.0f);
        A0O = (int) (AbstractC0862Wl.A02 * 10.0f);
        A0W = (int) (AbstractC0862Wl.A02 * 20.0f);
        A0X = (int) (AbstractC0862Wl.A02 * 13.0f);
        A0R = (int) (AbstractC0862Wl.A02 * 48.0f);
        A0a = (int) (AbstractC0862Wl.A02 * 14.0f);
        A0Y = (int) (AbstractC0862Wl.A02 * 12.0f);
        A0P = (int) (AbstractC0862Wl.A02 * 8.0f);
        A0Z = OP.A02(-1, 77);
        A0V = (int) (AbstractC0862Wl.A02 * 16.0f);
        A0c = (int) (AbstractC0862Wl.A02 * 12.0f);
        A0S = (int) (AbstractC0862Wl.A02 * 12.0f);
        A0T = (int) (AbstractC0862Wl.A02 * 16.0f);
        A0U = (int) (AbstractC0862Wl.A02 * 48.0f);
    }

    public C01775d(C0997ai c0997ai) {
        super(c0997ai, false);
        this.A0D = new Handler(Looper.getMainLooper());
        this.A0E = new Handler(Looper.getMainLooper());
        this.A0C = false;
        this.A0B = false;
        this.A03 = c0997ai.A06();
        this.A06 = c0997ai.A0C();
        this.A05 = c0997ai.A0B();
        this.A0I = c0997ai;
        this.A01 = new View(this.A03);
        XP.A0I(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A09();
        this.A0F = c0997ai.A0D();
        AbstractC0980aR.A00(c0997ai.A06(), this, getAdInfo().A0H().A08());
        this.A0J = A01(c0997ai);
        XP.A0I(this.A0J);
        getAdDetailsView().bringToFront();
        if (!A03()) {
            this.A0K = A02(c0997ai);
        } else {
            this.A0K = null;
        }
        if (getAdDataBundle().A1l()) {
            if (this.A0K != null) {
                this.A0K.setVisibility(8);
            }
            getAdDetailsView().setVisibility(8);
            A08();
        }
        A1R();
        this.A08 = new C1143d4(this.A03, c0997ai.A07(), getAdDataBundle());
        this.A0G = new C0539Js(this);
        this.A0H = new C0971aI(c0997ai, getAdDataBundle(), this.A0J, this.A0K, getAdDetailsView(), this.A0F, this.A0G);
        C0857Wg A02 = super.A09.A02(getAdDataBundle());
        this.A03.A0H().A00(A02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(super.A09);
        if (A02.A00) {
            this.A0J.getVideoImplView().setOnClickListener(new ViewOnClickListenerC1000al(this));
        } else if (U7.A1K(getAdContextWrapper())) {
            AbstractC0947Zs.A00(this.A0J.getVideoImplView(), U7.A1L(getAdContextWrapper()), new ViewOnClickListenerC1001am(this));
        }
        if (c0997ai.A05().A1f()) {
            if (this.A0I.A05().A1i()) {
                this.A07 = new JR(c0997ai);
            } else {
                this.A07 = new JS(c0997ai);
            }
            View view = this.A07;
            ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            addView(view, layoutParams2);
            getAdDetailsView().setVisibility(8);
        }
    }

    private E1 A01(C0997ai c0997ai) {
        RelativeLayout.LayoutParams layoutParams;
        E1 e1 = (E1) c0997ai.A02();
        int A1O = A1O(c0997ai.A0C());
        this.A02 = (ImageView) c0997ai.A03();
        if (!A03()) {
            ImageView imageView = this.A02;
            int i = AbstractC0543Jw.A0M;
            int i2 = AbstractC0543Jw.A0M;
            int toolbarHeight = AbstractC0543Jw.A0M;
            imageView.setPadding(i, i2, toolbarHeight, AbstractC0543Jw.A0M);
            int toolbarHeight2 = AbstractC0543Jw.A0N;
            layoutParams = new RelativeLayout.LayoutParams(toolbarHeight2, AbstractC0543Jw.A0N);
            int toolbarHeight3 = AbstractC0543Jw.A0L;
            layoutParams.setMargins(0, A1O, toolbarHeight3, 0);
            layoutParams.addRule(11);
        } else {
            int toolbarHeight4 = AbstractC0993ae.A0J;
            layoutParams = new RelativeLayout.LayoutParams(toolbarHeight4, AbstractC0993ae.A0J);
            int i3 = A0T;
            int i4 = A0U;
            int toolbarHeight5 = A0T;
            layoutParams.setMargins(i3, i4, toolbarHeight5, A0S);
            layoutParams.addRule(9);
        }
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if (getAdDataBundle().A1l() && e1 != null) {
            View videoView = e1.getVideoView();
            int paddingLeft = e1.getVideoView().getPaddingLeft();
            int paddingTop = e1.getVideoView().getPaddingTop();
            int paddingRight = e1.getVideoView().getPaddingRight();
            int toolbarHeight6 = e1.getVideoView().getPaddingBottom();
            videoView.setPadding(paddingLeft, paddingTop, paddingRight, toolbarHeight6 + A0c);
        }
        layoutParams2.addRule(13);
        addView(e1, layoutParams2);
        e1.addView(this.A02, layoutParams);
        return e1;
    }

    private C0362Cw A02(C0997ai c0997ai) {
        C0362Cw A0F = c0997ai.A0F();
        A0F.A08(-1, AbstractC0543Jw.A0E, false);
        A0F.setPadding(AbstractC0543Jw.A0Q, AbstractC0543Jw.A0Q, AbstractC0543Jw.A0Q, AbstractC0543Jw.A0Q);
        RelativeLayout.LayoutParams progressBarLayoutParams = new RelativeLayout.LayoutParams(-1, AbstractC0543Jw.A0P);
        progressBarLayoutParams.addRule(12);
        addView(A0F, progressBarLayoutParams);
        return A0F;
    }

    private void A04() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (this.A09 != null) {
            addView(this.A09.A0T(), layoutParams);
        }
    }

    private void A05() {
        addView(new C1009au(this.A0I.A06(), getAdDataBundle(), this.A0I.A08(), this.A0E, this.A0I.A0D()).A09(getCtaButton()));
    }

    private void A06() {
        XP.A0Z(this.A02, getCtaButton(), getAdDetailsView(), this.A01, this.A0H, this.A0I.A0C());
        for (InterfaceC1176dc interfaceC1176dc : this.A0J.getPlugins()) {
            if (interfaceC1176dc instanceof C2R) {
                this.A0J.A0j(interfaceC1176dc);
                return;
            }
        }
    }

    private void A07() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0H();
            this.A0J.A0j(getAnimationPlugin());
        }
    }

    private void A08() {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        A0D(relativeLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A0Q, 0);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams appMetadataLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        appMetadataLayoutParams.setMargins(A0Q, A0b, A0Q, A0b);
        appMetadataLayoutParams.addRule(12);
        relativeLayout2.addView(relativeLayout, layoutParams2);
        KE ctaButton = getCtaButton();
        ctaButton.setTextSize(14.0f);
        ctaButton.setIncludeFontPadding(false);
        ctaButton.setTextColor(-1);
        layoutParams2.addRule(0, ctaButton.getId());
        if (!getAdDataBundle().A1j()) {
            ctaButton.setPadding(A0O, A0O, A0O, A0O);
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(6, relativeLayout.getId());
            layoutParams.addRule(8, relativeLayout.getId());
            ctaButton.setBackgroundColor(-12549889);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            XP.A0Q(ctaButton, XP.A06(-16738826, A0N));
            ctaButton.setPadding(A0W, A0X, A0W, A0X);
            ctaButton.setStateListAnimator(null);
            XP.A0V(ctaButton);
        }
        layoutParams.addRule(11);
        if (ctaButton.getParent() != null) {
            XP.A0Z(ctaButton);
        }
        relativeLayout2.addView(ctaButton, layoutParams);
        addView(relativeLayout2, appMetadataLayoutParams);
        relativeLayout2.bringToFront();
    }

    private void A09() {
        if (this.A06 == null) {
            return;
        }
        this.A0A = new CU(this.A06, 400, -this.A06.getToolbarHeight(), 0);
    }

    private void A0A() {
        new C0802Ua(getAdDataBundle().A25(), getAdEventManager()).A04(UZ.A0z, null);
        if (!getAdInfo().A0V()) {
            return;
        }
        super.A0A.set(true);
        XP.A0R(this);
        XP.A0Z(this.A0K, this.A0H, this.A00);
        XP.A0J(this.A06);
        Pair<EnumC1142d3, View> A03 = this.A08.A03(getCtaButton());
        this.A00 = (View) A03.second;
        A0E((EnumC1142d3) A03.first);
        if (getAdInfo().A0K().A00() >= 0) {
            this.A0B = true;
            if (this.A06 != null) {
                this.A06.setToolbarActionMode(getAdDataBundle().A2G() ? 8 : 2);
                this.A06.setProgressImmediate(0.0f);
            }
            this.A04 = new C0856Wd((int) getAdInfo().A0K().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new C0537Jq(this));
            this.A04.A07();
        }
    }

    private void A0B() {
        if (this.A0A != null) {
            this.A0A.A42(true, false);
        }
        if (!A03() && !getAdDataBundle().A1l() && getAdDetailsAnimation() != null) {
            CU adDetailsAnimation = getAdDetailsAnimation();
            String[] strArr = A0M;
            if (strArr[3].charAt(21) == strArr[6].charAt(21)) {
                throw new RuntimeException();
            }
            A0M[1] = "NNplzEPPEJhw482VYN3vhqCWu3reteuX";
            adDetailsAnimation.A42(true, false);
        }
    }

    private void A0D(RelativeLayout relativeLayout) {
        int i;
        String formattingRatingCount;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0R, A0R);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        C0973aK c0973aK = new C0973aK(this.A03);
        XP.A0K(c0973aK, 0);
        XP.A0I(c0973aK);
        new KZ(c0973aK, this.A03).A05(A0R, A0R).A07(getAdDataBundle().A23().A01());
        TextView textView = new TextView(this.A03);
        XP.A0I(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(getAdDataBundle().A1z().A01().A07(true));
        textView.setText(getAdDataBundle().A20().A0I().A0F());
        textView.setTextSize(!getAdDataBundle().A1j() ? 16.0f : 17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        C1159dL c1159dL = this.A03;
        if (!getAdDataBundle().A1j()) {
            i = A0a;
        } else {
            i = A0Y;
        }
        C0975aM c0975aM = new C0975aM(c1159dL, i, 5, A0Z, -1);
        c0975aM.setGravity(16);
        LinearLayout.LayoutParams ratingCountParams = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A03);
        textView2.setTextColor(getAdDataBundle().A1z().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        if (!getAdDataBundle().A1j()) {
            textView2.setTextSize(13.0f);
        }
        LinearLayout.LayoutParams starRatingContainerParams = new LinearLayout.LayoutParams(-2, -1);
        starRatingContainerParams.leftMargin = A0P;
        LinearLayout linearLayout = new LinearLayout(this.A03);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams ratingInfoContainerParams = new RelativeLayout.LayoutParams(-2, A0V);
        ratingInfoContainerParams.topMargin = A0P / 2;
        ratingInfoContainerParams.addRule(3, textView.getId());
        linearLayout.addView(c0975aM, ratingCountParams);
        linearLayout.addView(textView2, starRatingContainerParams);
        RelativeLayout.LayoutParams iconParams = new RelativeLayout.LayoutParams(-2, -2);
        iconParams.leftMargin = A0P;
        iconParams.addRule(1, c0973aK.getId());
        iconParams.addRule(15);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        relativeLayout2.addView(linearLayout, ratingInfoContainerParams);
        relativeLayout2.addView(textView);
        relativeLayout.addView(relativeLayout2, iconParams);
        relativeLayout.addView(c0973aK, layoutParams);
        if (TextUtils.isEmpty(getAdDataBundle().A20().A0I().A0B())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        c0975aM.setRating(Float.parseFloat(getAdDataBundle().A20().A0I().A0B()));
        if (getAdDataBundle().A20().A0I().A08() == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A03(0, 1, 108));
        if (!getAdDataBundle().A1j()) {
            formattingRatingCount = NumberFormat.getNumberInstance().format(Integer.parseInt(getAdDataBundle().A20().A0I().A08()));
        } else {
            formattingRatingCount = AbstractC0871Wu.A01(Integer.parseInt(getAdDataBundle().A20().A0I().A08()));
        }
        sb.append(formattingRatingCount);
        String formattingRatingCount2 = A03(1, 1, 13);
        sb.append(formattingRatingCount2);
        String formattingRatingCount3 = sb.toString();
        textView2.setText(formattingRatingCount3);
    }

    private void A0E(EnumC1142d3 enumC1142d3) {
        if (!getAdDataBundle().A20().A0K().A02().isEmpty()) {
            if (getAdDataBundle().A20().A0K().A03()) {
                this.A09 = new C1149dA(this.A03, getAdDataBundle(), this.A0F, getCtaButton(), this.A0E, this.A0I.A08());
                XP.A0Z(this.A06, getAdDetailsView(), this.A02);
                A04();
                return;
            }
        } else if (getAdDataBundle().A20().A0K().A03() || getAdDataBundle().A20().A0K().A04()) {
            A06();
            A05();
            return;
        }
        A0F(enumC1142d3);
    }

    private void A0F(EnumC1142d3 enumC1142d3) {
        this.A0J.A0k(false);
        this.A0J.setVisibility(8);
        if (this.A06 instanceof C0641Nr) {
            AbstractC0889Xm abstractC0889Xm = this.A05;
            if (A0M[2].charAt(18) == 'X') {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[3] = "VBTxPCVQSRRVVKfJEBHdIagRaEa9moGI";
            strArr[6] = "iS4EeCSjafPAdymtQeFXdNKcyC2MGxGr";
            if (abstractC0889Xm != null) {
                XP.A0F(this.A06);
                this.A06 = this.A05;
                XP.A0J(this.A06);
            }
        }
        switch (enumC1142d3) {
            case A03:
                AbstractC0950Zv oldEndCardAdDetailsView = getOldEndCardAdDetailsView();
                if (A0M[4].charAt(31) != 'A') {
                    A0M[2] = "XFfDcp5VJF8GQaNSTNs87nOmJmOzmbPV";
                    if (oldEndCardAdDetailsView == null) {
                        AbstractC0950Zv oldEndCard = getAdDetailsView();
                        oldEndCard.setVisibility(0);
                    } else {
                        addView(oldEndCardAdDetailsView);
                    }
                    RelativeLayout.LayoutParams screenshotParams = new RelativeLayout.LayoutParams(-1, -1);
                    screenshotParams.setMargins(0, A1O(this.A06), 0, 0);
                    if (oldEndCardAdDetailsView != null) {
                        screenshotParams.addRule(2, oldEndCardAdDetailsView.getId());
                    } else {
                        AbstractC0950Zv oldEndCard2 = getAdDetailsView();
                        screenshotParams.addRule(2, oldEndCard2.getId());
                    }
                    addView(this.A00, screenshotParams);
                    return;
                }
                throw new RuntimeException();
            case A02:
                XP.A0Z(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(AbstractC0543Jw.A0O, AbstractC0543Jw.A0O, AbstractC0543Jw.A0O, AbstractC0543Jw.A0O);
                addView(this.A00, layoutParams);
                return;
            default:
                return;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0543Jw, com.instagram.common.viewpoint.core.AbstractC0993ae
    public final void A1B() {
        super.A1B();
        A07();
        getAdDetailsView().A0f();
        this.A0E.removeCallbacksAndMessages(null);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0543Jw, com.instagram.common.viewpoint.core.AbstractC0993ae
    public final void A1G(C0613Mp c0613Mp, String str, double d, Bundle bundle) {
        super.A1G(c0613Mp, str, d, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A03(2, 31, 100), false)) {
            A0B();
        }
        if (bundle.getBoolean(A03(57, 18, 77), false)) {
            A0A();
        }
        if (bundle.getBoolean(A03(33, 24, Opcodes.LSHL), false)) {
            this.A0H.A07(this);
        }
        if (A03()) {
            boolean z = getAdDetailsView() instanceof KL;
            if (A0M[2].charAt(18) == 'X') {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[3] = "TYF9Gze5okVE8nAMFw0kZuTKWJAG4GPN";
            strArr[6] = "e5C8lQxoH1vEX5uTYGqpe7vBIorNDTyW";
            if (z) {
                ((KL) getAdDetailsView()).A0l();
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public final void A1H(C01253d c01253d) {
        super.A1H(c01253d);
        if (A03()) {
            AbstractC0950Zv adDetailsView = getAdDetailsView();
            if (A0M[0].length() == 5) {
                throw new RuntimeException();
            }
            A0M[4] = "m5gTgOd0mlzOyrsuIVxaBMecvKjJBXrq";
            removeView(adDetailsView);
        }
        A0A();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public final void A1I(DO r10) {
        super.A1I(r10);
        if (this.A07 != null && this.A07.getVisibility() == 0) {
            return;
        }
        if (A03()) {
            this.A03.A0F().AJw(AbstractC0853Wa.A00((float) this.A0I.A05().A0h()), getResources().getConfiguration().orientation, true, false, MH.A0C(this.A0I.A04()));
        }
        A1Z(getResources().getConfiguration().orientation);
        if (getAdDataBundle().A1W()) {
            this.A0J.setOnClickListener(getCtaButton());
        }
        if (A03()) {
            getAdDetailsView().setVisibility(0);
            if (getAdDetailsView() instanceof KL) {
                ((KL) getAdDetailsView()).A0q(getResources().getConfiguration().orientation);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public final void A1J(C3Q c3q, int i) {
        super.A1J(c3q, i);
        int videoLengthMs = c3q.A00();
        int remainingVideoTimeInMillis = this.A0J.getDuration();
        int videoLengthMs2 = remainingVideoTimeInMillis - videoLengthMs;
        if (getAnimationPlugin() != null && videoLengthMs2 < 3000 && getAnimationPlugin().A0M()) {
            getAnimationPlugin().A0I();
        }
        if ((getAdDetailsView() instanceof KL) && !this.A0I.A05().A1i()) {
            int currentPosMs = c3q.A00();
            ((KL) getAdDetailsView()).A0o(((remainingVideoTimeInMillis * i) + currentPosMs) / 1000);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public final boolean A1K() {
        return getAdInfo().A0V();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public final boolean A1M() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public final boolean A1N(boolean z) {
        if (z && !this.A0C && !super.A0A.get()) {
            this.A0H.A07(this);
            return true;
        }
        if (!getAdInfo().A0V()) {
            return false;
        }
        boolean z2 = super.A0A.get();
        if (A0M[4].charAt(31) == 'A') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[3] = "EPxoCM5ZHywZjaL2iUUSFMk3WFd5m6XL";
        strArr[6] = "lTBjgNJWw5Z4CB7iubQhWZLtOmC1X7yD";
        if (!z2) {
            this.A0J.A0g(EnumC1167dT.A08);
            return true;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0543Jw
    public final AbstractC0950Zv A1P(C0997ai c0997ai, C0613Mp c0613Mp, String str) {
        double A0h = c0997ai.A05().A0h();
        if (A03()) {
            if (E1.A0T((float) A0h)) {
                return new C01905q(c0997ai.A06(), getCtaButton(), AbstractC0543Jw.A0I, false, getColors(), str, c0997ai.A07(), c0997ai.A0D(), c0997ai.A0G(), c0997ai.A0A(), c0997ai.A05(), c0997ai.A0F(), c0997ai.A08(), false);
            }
            if (E1.A0V((float) A0h)) {
                return new C01895p(c0997ai.A06(), getCtaButton(), AbstractC0543Jw.A0I, false, getColors(), str, c0997ai.A07(), c0997ai.A0D(), c0997ai.A0G(), c0997ai.A0A(), c0997ai.A05(), c0997ai.A0F(), c0997ai.A08(), false);
            }
            return new C01915r(c0997ai.A06(), getCtaButton(), AbstractC0543Jw.A0I, false, getColors(), str, c0997ai.A07(), c0997ai.A0D(), c0997ai.A0G(), c0997ai.A0A(), c0997ai.A05(), c0997ai.A0F(), c0997ai.A08(), false);
        }
        return new C0545Jy(c0997ai.A06(), getCtaButton(), AbstractC0543Jw.A0J, c0613Mp.A0I().A00() == EnumC0618Mu.A05, getColors(), c0613Mp.A0J().A06(), str, c0997ai.A07(), c0997ai.A0D(), c0997ai.A0G(), c0997ai.A0A(), c0997ai.A05());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0543Jw
    public final C0545Jy A1Q(C0997ai c0997ai, C0613Mp c0613Mp, String str) {
        return new C0545Jy(c0997ai.A06(), getCtaButton(), AbstractC0543Jw.A0J, c0613Mp.A0I().A00() == EnumC0618Mu.A05, getColors(), c0613Mp.A0J().A06(), str, c0997ai.A07(), c0997ai.A0D(), c0997ai.A0G(), c0997ai.A0A(), c0997ai.A05());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0543Jw
    public final void A1R() {
        super.A1R();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().AAm(this.A0J);
        }
    }

    public final void A1W() {
        getCtaButton().A0E(A03(75, 9, 37));
    }

    public final void A1X() {
        if (getAdDetailsView() instanceof KL) {
            ((KL) getAdDetailsView()).setPlaceHolderTextForRewardsConversion(getAdDataBundle().A14());
        }
    }

    public final void A1Y() {
        new C0802Ua(this.A0I.A05().A25(), getAdEventManager()).A04(UZ.A0h, null);
        if (this.A0I.A0C() != null) {
            AbstractC0889Xm A0C = this.A0I.A0C();
            if (A0M[4].charAt(31) == 'A') {
                throw new RuntimeException();
            }
            A0M[2] = "qVUXWES3bTCAG5k5pbCpCu4g17099rEp";
            A0C.setVisibility(8);
            removeView(this.A0I.A0C());
        }
        removeView(this.A07);
        removeView(this.A0J);
        A07();
        removeView(getAdDetailsView());
        removeView(this.A0K);
        removeView(this.A00);
        if (this.A09 != null) {
            removeView(this.A09.A0U());
        }
        if (this.A0I.A05().A1i()) {
            A1T();
        } else {
            A1S();
        }
    }

    public final void A1Z(int i) {
        if (!A03()) {
            return;
        }
        this.A03.A0F().AJy(i);
        this.A0J.A0c(i);
        A1U(i, this.A0J, (RelativeLayout) this.A0J.getVideoView());
    }

    public final void A1a(C01303i c01303i) {
        if (this.A07 != null) {
            if (this.A07 instanceof JR) {
                ((JR) this.A07).A1O(c01303i);
            }
            if (this.A07 instanceof JS) {
                ((JS) this.A07).A1O(c01303i);
            }
            this.A07.A1B();
            AbstractC0993ae abstractC0993ae = this.A07;
            String[] strArr = A0M;
            if (strArr[3].charAt(21) == strArr[6].charAt(21)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[3] = "wl3lZ2t8QgZzPvgxh0a22wDB24cvqHL6";
            strArr2[6] = "goKzKnMqtJl7yehw7GAGrdNRW8UKCTH6";
            removeView(abstractC0993ae);
            this.A07 = null;
        }
        getAdDetailsView().setVisibility(0);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0993ae
    public int getCloseButtonStyle() {
        if (this.A0B) {
            if (getAdDataBundle().A2G()) {
                return 8;
            }
            return 2;
        }
        if (A1K() && !super.A0A.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0543Jw, com.instagram.common.viewpoint.core.AbstractC0993ae, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A07 != null) {
            AbstractC0993ae abstractC0993ae = this.A07;
            if (A0M[0].length() == 5) {
                throw new RuntimeException();
            }
            A0M[4] = "EpyE2nRNkziEqwhglEeRfTluajKoT9IB";
            if (abstractC0993ae.getVisibility() == 0) {
                getAdDetailsView().setVisibility(8);
                return;
            }
        }
        if (getAdDataBundle().A20().A0K().A03() && this.A09 != null && super.A0A.get()) {
            this.A09.A0W(configuration.orientation);
        }
        if (this.A09 != null || super.A0A.get()) {
            AbstractC0950Zv oldEndCardAdDetailsView = getOldEndCardAdDetailsView();
            if (oldEndCardAdDetailsView != null) {
                oldEndCardAdDetailsView.A0h(configuration.orientation);
                return;
            }
            return;
        }
        A1Z(configuration.orientation);
    }

    public void setVideoAdViewListener(InterfaceC1117ce interfaceC1117ce) {
        if (this.A07 instanceof JR) {
            ((JR) this.A07).setVideoAdViewListener(interfaceC1117ce);
        }
        if (this.A07 instanceof JS) {
            ((JS) this.A07).setVideoAdViewListener(interfaceC1117ce);
        }
    }
}
