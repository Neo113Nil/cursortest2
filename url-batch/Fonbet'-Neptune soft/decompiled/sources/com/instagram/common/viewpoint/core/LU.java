package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class LU extends AbstractC0900Yd {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final O2 A04;
    public final C1153dL A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 20);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{3, 32, 34, 42, 3, 44, 47, 51, 37, 96, 1, 36, 96, Ascii.DC2, 37, 48, 47, 50, 52, 41, 46, 39};
    }

    static {
        A01();
        A09 = (int) (AbstractC0856Wl.A02 * 4.0f);
        A08 = (int) (AbstractC0856Wl.A02 * 10.0f);
        A07 = (int) (AbstractC0856Wl.A02 * 44.0f);
    }

    public LU(C1153dL c1153dL, US us, String str) {
        super(c1153dL, us, str);
        this.A05 = c1153dL;
        this.A04 = O3.A00(c1153dL.A02());
        this.A01 = new ImageView(getContext());
        this.A01.setPadding(A08, A08, A08, A08);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A07, A07);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        XP.A0K(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0900Yd
    public final void A0N() {
        this.A01.setImageBitmap(XY.A01(XX.CROSS));
        this.A01.setOnClickListener(new ViewOnClickListenerC0909Ym(this));
        this.A01.setContentDescription(A00(4, 18, 84));
        C0904Yh c0904Yh = new C0904Yh(this.A05);
        c0904Yh.setData(this.A04.A0H(), XX.HIDE_AD);
        c0904Yh.setOnClickListener(new ViewOnClickListenerC0910Yn(this, c0904Yh));
        C0904Yh c0904Yh2 = new C0904Yh(this.A05);
        c0904Yh2.setData(this.A04.A0L(), XX.REPORT_AD);
        c0904Yh2.setOnClickListener(new ViewOnClickListenerC0911Yo(this, c0904Yh2));
        C0904Yh c0904Yh3 = new C0904Yh(this.A05);
        c0904Yh3.setData(this.A04.A0M(), XX.AD_CHOICES_ICON);
        c0904Yh3.setOnClickListener(new ViewOnClickListenerC0912Yp(this, c0904Yh3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        XP.A0R(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(c0904Yh, layoutParams);
        this.A02.addView(c0904Yh2, layoutParams);
        this.A02.addView(c0904Yh3, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0900Yd
    public final void A0O() {
        XP.A0G(this);
        XP.A0H(this);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0900Yd
    public final void A0P(O6 o6, O4 o4) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        XP.A0W(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        XP.A0R(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0900Yd
    public final void A0Q(O6 o6, O4 o4) {
        XP.A0R(this.A03);
        this.A01.setImageBitmap(XY.A01(XX.BACK_ARROW));
        this.A01.setOnClickListener(new ViewOnClickListenerC0913Yq(this));
        this.A01.setContentDescription(A00(0, 4, 85));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A09, A09, A09);
        for (O6 o62 : o6.A05()) {
            C0904Yh c0904Yh = new C0904Yh(this.A05);
            c0904Yh.setData(o62.A04(), null);
            c0904Yh.setOnClickListener(new ViewOnClickListenerC0914Yr(this, c0904Yh, o62));
            this.A02.addView(c0904Yh, layoutParams);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0900Yd
    public final boolean A0R() {
        return true;
    }
}
