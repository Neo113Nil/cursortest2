package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* loaded from: classes2.dex */
public class PAGLogoView extends LinearLayout {
    public PAGLogoView(Context context) {
        this(context, null);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pvs(context);
    }

    private void pvs(Context context) {
        PAGImageView pAGImageView = new PAGImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Pj.icD(context, 14.0f), Pj.icD(context, 5.0f));
        int icD = Pj.icD(context, 4.0f);
        int icD2 = Pj.icD(context, 2.0f);
        layoutParams.topMargin = icD;
        layoutParams.bottomMargin = icD;
        layoutParams.leftMargin = icD2;
        pAGImageView.setLayoutParams(layoutParams);
        pAGImageView.setImageDrawable(uc.vG(context, "tt_ad_logo"));
        PAGTextView pAGTextView = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.leftMargin = icD2;
        layoutParams2.rightMargin = icD2;
        pAGTextView.setLayoutParams(layoutParams2);
        pAGTextView.setText(uc.pvs(context, "tt_logo_en"));
        pAGTextView.setTextSize(1, 8.0f);
        pAGTextView.setGravity(17);
        pAGTextView.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(pAGImageView);
        addView(pAGTextView);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#1F161823"));
        gradientDrawable.setCornerRadius(Pj.icD(context, 2.0f));
        setBackground(gradientDrawable);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = Pj.icD(getContext(), 13.0f);
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.customview.pvs.pvs(this, layoutParams));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
