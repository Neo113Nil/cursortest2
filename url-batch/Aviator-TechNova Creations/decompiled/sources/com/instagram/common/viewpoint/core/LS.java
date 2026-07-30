package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class LS extends AbstractC0906Yd {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final O2 A03;
    public final C1159dL A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-52, -21, -19, -11, 120, -95, -92, -88, -102, 85, 118, -103, 85, -121, -102, -91, -92, -89, -87, -98, -93, -100};
    }

    static {
        A01();
        A08 = (int) (AbstractC0862Wl.A02 * 8.0f);
        A07 = (int) (AbstractC0862Wl.A02 * 10.0f);
        A06 = (int) (AbstractC0862Wl.A02 * 44.0f);
    }

    public LS(C1159dL c1159dL, US us, String str) {
        super(c1159dL, us, str);
        this.A04 = c1159dL;
        this.A03 = O3.A00(this.A04.A02());
        this.A00 = new ImageView(getContext());
        this.A00.setPadding(A07, A07, A07, A07);
        this.A00.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        XP.A0K(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        this.A01.setPadding(A08, A08, A08, A08);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0906Yd
    public final void A0N() {
        this.A00.setImageBitmap(XY.A01(XX.CROSS));
        this.A00.setOnClickListener(new ViewOnClickListenerC0925Yw(this));
        this.A00.setContentDescription(A00(4, 18, 29));
        C0910Yh c0910Yh = new C0910Yh(this.A04);
        c0910Yh.setData(this.A03.A0H(), XX.HIDE_AD);
        c0910Yh.setOnClickListener(new ViewOnClickListenerC0926Yx(this, c0910Yh));
        C0910Yh c0910Yh2 = new C0910Yh(this.A04);
        c0910Yh2.setData(this.A03.A0L(), XX.REPORT_AD);
        c0910Yh2.setOnClickListener(new ViewOnClickListenerC0927Yy(this, c0910Yh2));
        C0910Yh c0910Yh3 = new C0910Yh(this.A04);
        c0910Yh3.setData(this.A03.A0M(), XX.AD_CHOICES_ICON);
        c0910Yh3.setOnClickListener(new ViewOnClickListenerC0928Yz(this, c0910Yh3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        menuParams.setMargins(A08, A08, A08, A08);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        XP.A0R(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(c0910Yh, menuParams);
        linearLayout.addView(c0910Yh2, menuParams);
        linearLayout.addView(c0910Yh3, menuParams);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0906Yd
    public final void A0O() {
        XP.A0G(this);
        XP.A0H(this);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0906Yd
    public final void A0P(O6 o6, O4 o4) {
        String A0H;
        XX xx;
        int i;
        this.A00.setOnClickListener(null);
        if (o4 == O4.A06) {
            A0H = this.A03.A0F();
            xx = XX.REPORT_AD;
            i = -552389;
        } else {
            A0H = this.A03.A0H();
            xx = XX.HIDE_AD;
            i = -13272859;
        }
        C0904Yb A0I = new C0904Yb(this.A04, this.A0B).A0I(A0H);
        String title = this.A03.A0D();
        C0904Yb A0H2 = A0I.A0H(title);
        String title2 = o6.A04();
        C0905Yc adHiddenView = A0H2.A0F(title2).A0K(false).A0E(xx).A0D(i).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        XP.A0R(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0906Yd
    public final void A0Q(O6 o6, O4 o4) {
        boolean isReportFlow = o4 == O4.A06;
        C0924Yv c0924Yv = new C0924Yv(this.A04, o6, this.A0B, isReportFlow ? XX.REPORT_AD : XX.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(XY.A01(XX.BACK_ARROW));
        this.A00.setOnClickListener(new Z0(this));
        this.A00.setContentDescription(A00(0, 4, Opcodes.FREM));
        XP.A0R(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(c0924Yv, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0906Yd
    public final boolean A0R() {
        return true;
    }
}
