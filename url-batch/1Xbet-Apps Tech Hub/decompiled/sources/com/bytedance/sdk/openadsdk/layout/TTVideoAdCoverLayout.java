package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.CornerIV;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.so;

/* loaded from: classes2.dex */
public class TTVideoAdCoverLayout extends PAGRelativeLayout {
    public TTVideoAdCoverLayout(Context context) {
        this(context, null);
    }

    public TTVideoAdCoverLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTVideoAdCoverLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pvs(context);
    }

    private void pvs(Context context) {
        setId(kj.Oa);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        PAGImageView pAGImageView = new PAGImageView(getContext());
        pAGImageView.setId(kj.GcG);
        pAGImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        pAGImageView.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        pAGImageView.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        pAGImageView.setBackgroundColor(Color.parseColor("#7f000000"));
        pAGImageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(pAGImageView);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setId(kj.RGX);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        pAGRelativeLayout.setLayoutParams(layoutParams);
        addView(pAGRelativeLayout);
        int icD = Pj.icD(context, 44.0f);
        CornerIV cornerIV = new CornerIV(context);
        cornerIV.setId(kj.OhP);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(icD, icD);
        layoutParams2.addRule(14);
        cornerIV.setLayoutParams(layoutParams2);
        cornerIV.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        pAGRelativeLayout.addView(cornerIV);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setId(kj.jhZ);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(icD, icD);
        layoutParams3.addRule(8, kj.OhP);
        layoutParams3.addRule(19, kj.OhP);
        layoutParams3.addRule(5, kj.OhP);
        layoutParams3.addRule(7, kj.OhP);
        layoutParams3.addRule(18, kj.OhP);
        layoutParams3.addRule(6, kj.OhP);
        layoutParams3.addRule(14);
        pAGTextView.setLayoutParams(layoutParams3);
        pAGTextView.setBackground(so.pvs(context, "tt_circle_solid_mian"));
        pAGTextView.setGravity(17);
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 19.0f);
        pAGTextView.setTypeface(Typeface.defaultFromStyle(1));
        pAGTextView.setVisibility(8);
        pAGRelativeLayout.addView(pAGTextView);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        pAGTextView2.setId(kj.SE);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, kj.OhP);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = Pj.icD(context, 6.0f);
        pAGTextView2.setLayoutParams(layoutParams4);
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView2.setMaxLines(1);
        pAGTextView2.setTextColor(-1);
        pAGTextView2.setTextSize(2, 12.0f);
        pAGRelativeLayout.addView(pAGTextView2);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        pAGTextView3.setId(kj.yWX);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(Pj.icD(context, 100.0f), Pj.icD(context, 28.0f));
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, kj.SE);
        layoutParams5.topMargin = Pj.icD(context, 20.0f);
        pAGTextView3.setLayoutParams(layoutParams5);
        pAGTextView3.setMinWidth(Pj.icD(context, 72.0f));
        pAGTextView3.setMaxLines(1);
        pAGTextView3.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView3.setTextColor(-1);
        pAGTextView3.setTextSize(2, 14.0f);
        pAGTextView3.setBackground(so.pvs(context, "tt_ad_cover_btn_begin_bg"));
        pAGTextView3.setGravity(17);
        int icD2 = Pj.icD(context, 10.0f);
        int icD3 = Pj.icD(context, 2.0f);
        pAGTextView3.setPadding(icD2, icD3, icD2, icD3);
        pAGTextView3.setVisibility(8);
        pAGRelativeLayout.addView(pAGTextView3);
    }
}
