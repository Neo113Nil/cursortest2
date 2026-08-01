package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class P3 extends LinearLayout {
    public LinearLayout A00;
    public final int A01;
    public final YA A02;
    public final C0693Ni A03;
    public final C0699No A04;
    public static final int A07 = (int) (C0627Ku.A02 * 16.0f);
    public static final int A08 = (int) (C0627Ku.A02 * 16.0f);
    public static final int A06 = (int) (C0627Ku.A02 * 8.0f);
    public static final int A05 = (int) (C0627Ku.A02 * 72.0f);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public P3(P1 p1) {
        super(r0);
        YA ya;
        YA ya2;
        C1M c1m;
        int i;
        ya = p1.A06;
        ya2 = p1.A06;
        this.A02 = ya2;
        this.A03 = new C0693Ni(ya2);
        c1m = p1.A01;
        this.A04 = new C0699No(ya2, c1m, true, false, true);
        i = p1.A00;
        this.A01 = i;
        A03(p1);
    }

    public /* synthetic */ P3(P1 p1, S8 s8) {
        this(p1);
    }

    private void A00() {
        A01(this.A03, Opcodes.FCMPG);
        A01(this.A04, Opcodes.TABLESWITCH);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            A01(linearLayout, Opcodes.ARRAYLENGTH);
        }
    }

    private void A01(View view, int i) {
        view.setTranslationY(i);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(P1 p1) {
        String str;
        String str2;
        String str3;
        str = p1.A03;
        if (!TextUtils.isEmpty(str)) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.A00 = linearLayout;
            linearLayout.setGravity(17);
            LinearLayout linearLayout2 = this.A00;
            int i = A08;
            linearLayout2.setPadding(i, i / 2, i, i / 2);
            LinearLayout.LayoutParams informativeTextViewParams = new LinearLayout.LayoutParams(-2, -2);
            informativeTextViewParams.setMargins(0, i / 2, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            LV.A0X(textView, false, 16);
            str2 = p1.A03;
            textView.setText(str2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            T8 A04 = new T8(imageView, this.A02).A04();
            str3 = p1.A02;
            A04.A07(str3);
            int i2 = A07;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, i2);
            layoutParams2.setMargins(0, 0, i / 2, 0);
            this.A00.addView(imageView, layoutParams2);
            this.A00.addView(textView, layoutParams);
            GradientDrawable bgDrawable = new GradientDrawable();
            bgDrawable.setCornerRadius(100.0f);
            bgDrawable.setColor(469762047);
            LV.A0S(this.A00, bgDrawable);
            addView(this.A00, informativeTextViewParams);
        }
    }

    private void A03(P1 p1) {
        C1K c1k;
        C1X c1x;
        C1K c1k2;
        C1X c1x2;
        LV.A0M(this.A03, 0);
        this.A03.setRadius(50);
        c1k = p1.A04;
        if (c1k.A00() == C1I.A05) {
            this.A03.setFullCircleCorners(true);
        } else {
            this.A03.setRadius(A06);
        }
        T8 A04 = new T8(this.A03, this.A02).A04();
        c1x = p1.A05;
        A04.A07(c1x.A01());
        C0699No c0699No = this.A04;
        c1k2 = p1.A04;
        String A062 = c1k2.A06();
        c1x2 = p1.A05;
        c0699No.A03(A062, c1x2.A03(), null, false, true);
        this.A04.getDescriptionTextView().setAlpha(0.8f);
        this.A04.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A08;
        layoutParams.setMargins(0, i, 0, i / 2);
        View view = this.A03;
        int i2 = A05;
        ViewGroup.LayoutParams titleAndDescriptionParams = new LinearLayout.LayoutParams(i2, i2);
        addView(view, titleAndDescriptionParams);
        addView(this.A04, layoutParams);
        A02(p1);
        LV.A0M(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(P2 p2) {
        A00();
        postDelayed(new S8(this, p2), this.A01);
    }
}
