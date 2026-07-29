package com.facebook.ads.internal.view.component;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.internal.view.p;
import com.facebook.ads.internal.view.s;

/* loaded from: classes.dex */
public class c extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private ImageView f5592a;

    /* renamed from: b, reason: collision with root package name */
    private b f5593b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f5594c;

    /* renamed from: d, reason: collision with root package name */
    private LinearLayout f5595d;

    public c(Context context, com.facebook.ads.internal.n.e eVar, com.facebook.ads.internal.n.h hVar, boolean z, int i) {
        super(context);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        setVerticalGravity(16);
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(Math.round(displayMetrics.density * 15.0f), Math.round(displayMetrics.density * 15.0f), Math.round(displayMetrics.density * 15.0f), Math.round(displayMetrics.density * 15.0f));
        linearLayout.setLayoutParams(layoutParams);
        addView(linearLayout);
        this.f5595d = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        this.f5595d.setOrientation(0);
        this.f5595d.setGravity(16);
        layoutParams2.weight = 3.0f;
        this.f5595d.setLayoutParams(layoutParams2);
        linearLayout.addView(this.f5595d);
        this.f5592a = new g(getContext());
        float a2 = a(z, i);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(Math.round(displayMetrics.density * a2), Math.round(a2 * displayMetrics.density));
        layoutParams3.setMargins(0, 0, Math.round(displayMetrics.density * 15.0f), 0);
        this.f5592a.setLayoutParams(layoutParams3);
        com.facebook.ads.internal.n.e.a(eVar.i(), this.f5592a);
        this.f5595d.addView(this.f5592a);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        this.f5595d.addView(linearLayout2);
        this.f5593b = new b(getContext(), eVar, hVar);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams4.setMargins(0, 0, Math.round(displayMetrics.density * 15.0f), 0);
        layoutParams4.weight = 0.5f;
        this.f5593b.setLayoutParams(layoutParams4);
        linearLayout2.addView(this.f5593b);
        this.f5594c = new TextView(getContext());
        this.f5594c.setPadding(Math.round(displayMetrics.density * 6.0f), Math.round(displayMetrics.density * 6.0f), Math.round(displayMetrics.density * 6.0f), Math.round(displayMetrics.density * 6.0f));
        this.f5594c.setText(eVar.p());
        this.f5594c.setTextColor(hVar.f());
        this.f5594c.setTextSize(14.0f);
        this.f5594c.setTypeface(hVar.a(), 1);
        this.f5594c.setMaxLines(2);
        this.f5594c.setEllipsize(TextUtils.TruncateAt.END);
        this.f5594c.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(hVar.e());
        gradientDrawable.setCornerRadius(displayMetrics.density * 5.0f);
        gradientDrawable.setStroke(1, hVar.g());
        this.f5594c.setBackgroundDrawable(gradientDrawable);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.weight = 0.25f;
        this.f5594c.setLayoutParams(layoutParams5);
        if (!eVar.h()) {
            this.f5594c.setVisibility(4);
        }
        linearLayout2.addView(this.f5594c);
        if (z) {
            s sVar = new s(getContext());
            sVar.setText(eVar.n());
            p.b(sVar, hVar);
            sVar.setMinTextSize(hVar.i() - 1);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, 0);
            layoutParams6.weight = 1.0f;
            sVar.setLayoutParams(layoutParams6);
            sVar.setGravity(80);
            linearLayout.addView(sVar);
        }
    }

    private int a(boolean z, int i) {
        double d2 = (z ? 1 : 0) + 3;
        Double.isNaN(d2);
        double d3 = i - 30;
        Double.isNaN(d3);
        return (int) (d3 * (3.0d / d2));
    }

    public TextView getCallToActionView() {
        return this.f5594c;
    }

    public ImageView getIconView() {
        return this.f5592a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5593b.getTitleTextView().getLayout().getLineEnd(r0.getLineCount() - 1) < this.f5593b.getMinVisibleTitleCharacters()) {
            this.f5595d.removeView(this.f5592a);
            super.onMeasure(i, i2);
        }
    }
}
