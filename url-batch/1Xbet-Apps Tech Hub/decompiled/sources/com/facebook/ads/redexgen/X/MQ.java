package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class MQ extends RelativeLayout {
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public final int A00;
    public final int A01;
    public final C2G A02;
    public final YA A03;
    public final MT A04;
    public final boolean A05;

    static {
        int i = (int) (C0627Ku.A02 * 16.0f);
        A09 = i;
        A0A = (int) (C0627Ku.A02 * 8.0f);
        A0D = (int) (C0627Ku.A02 * 44.0f);
        int i2 = (int) (C0627Ku.A02 * 10.0f);
        A08 = i2;
        A07 = i - i2;
        A0E = (int) (C0627Ku.A02 * 75.0f);
        A0B = (int) (C0627Ku.A02 * 25.0f);
        A0F = (int) (C0627Ku.A02 * 45.0f);
        A0C = (int) (C0627Ku.A02 * 15.0f);
        A06 = (int) (C0627Ku.A02 * 16.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MQ(MP mp) {
        super(r0);
        YA ya;
        YA ya2;
        MT mt;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ya = mp.A0C;
        ya2 = mp.A0C;
        this.A03 = ya2;
        this.A02 = C2H.A00(ya2.A01());
        mt = mp.A02;
        this.A04 = mt;
        z = mp.A0B;
        this.A01 = z ? A0E : A0F;
        z2 = mp.A0B;
        this.A00 = z2 ? A0B : A0C;
        z3 = mp.A07;
        this.A05 = z3;
        setFocusable(true);
        View A01 = A01(mp);
        View A00 = A00(mp);
        View footerView = getFooterView();
        LV.A0K(A01);
        LV.A0K(A00);
        LV.A0K(footerView);
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(10);
        RelativeLayout.LayoutParams headerParams = new RelativeLayout.LayoutParams(-1, -1);
        headerParams.addRule(13);
        headerParams.addRule(3, A01.getId());
        headerParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        int i = A09;
        layoutParams.setMargins(i, 0, i, i);
        addView(A01, footerParams);
        addView(A00, headerParams);
        addView(footerView, layoutParams);
        z4 = mp.A08;
        footerView.setVisibility(z4 ? 0 : 8);
    }

    public /* synthetic */ MQ(MP mp, MN mn) {
        this(mp);
    }

    private View A00(MP mp) {
        EnumC0636Ld enumC0636Ld;
        int i;
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        ImageView imageView = new ImageView(getContext());
        int i2 = this.A00;
        imageView.setPadding(i2, i2, i2, i2);
        enumC0636Ld = mp.A01;
        imageView.setImageBitmap(C0637Le.A01(enumC0636Ld));
        imageView.setColorFilter(-1);
        int i3 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        i = mp.A00;
        gradientDrawable.setColor(i);
        LV.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i4 = A09;
        layoutParams.setMargins(i4, 0, i4, i4);
        TextView textView = new TextView(getContext());
        LV.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        str = mp.A06;
        textView.setText(str);
        textView.setGravity(17);
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(-1, -2);
        iconParams.setMargins(i4, 0, i4, i4);
        TextView textView2 = new TextView(getContext());
        LV.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        str2 = mp.A05;
        textView2.setText(str2);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(i4, 0, i4, i4);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, iconParams);
        linearLayout.addView(textView2, layoutParams2);
        z = mp.A09;
        if (z) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            str3 = mp.A04;
            if (!TextUtils.isEmpty(str3)) {
                C0693Ni c0693Ni = new C0693Ni(this.A03);
                int i5 = A0F;
                LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(i5, i5);
                subtitleParams.setMargins(0, 0, A0A, 0);
                c0693Ni.setFullCircleCorners(true);
                T8 A05 = new T8(c0693Ni, this.A03).A05(i5, i5);
                str5 = mp.A04;
                A05.A07(str5);
                linearLayout2.addView(c0693Ni, subtitleParams);
            }
            MV mv = new MV(this.A03);
            str4 = mp.A03;
            mv.setData(str4, EnumC0636Ld.CHECKMARK);
            mv.setSelected(true);
            linearLayout2.addView(mv, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(MP mp) {
        boolean z;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        z = mp.A0A;
        if (z) {
            ImageView imageView = new ImageView(getContext());
            int i = A08;
            imageView.setPadding(i, i, i, i);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(C0637Le.A01(EnumC0636Ld.CROSS));
            imageView.setOnClickListener(new MN(this));
            int i2 = A0D;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            int i3 = A07;
            layoutParams.setMargins(i3, i3, i3, i3);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(C0637Le.A01(EnumC0636Ld.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        TextView managePrefsText = new TextView(getContext());
        LV.A0X(managePrefsText, false, 16);
        managePrefsText.setTextColor(-13272859);
        int i2 = A0A;
        managePrefsText.setPadding(i2, i2, i2, i2);
        managePrefsText.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new MO(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(managePrefsText, settingsIconParams);
        return linearLayout;
    }
}
