package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Color;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.TwoSemicirclesView;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* loaded from: classes2.dex */
public class PAGLoadingBaseLayout extends PAGRelativeLayout {
    PAGTextView Jd;
    PAGLogoView NB;
    PAGTextView icD;
    TTRoundRectImageView pvs;
    PAGLinearLayout sUS;
    TwoSemicirclesView so;
    PAGProgressBar vG;
    TwoSemicirclesView yiw;

    public PAGLoadingBaseLayout(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        setBackgroundColor(Color.parseColor("#161823"));
    }

    public void pvs(Context context) {
        this.NB = new PAGLogoView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, Pj.icD(context, 14.0f));
        layoutParams.setMarginStart(Pj.icD(context, 20.0f));
        layoutParams.leftMargin = Pj.icD(context, 20.0f);
        layoutParams.bottomMargin = Pj.icD(context, 20.0f);
        layoutParams.addRule(12);
        this.NB.setLayoutParams(layoutParams);
    }

    public TTRoundRectImageView getLoadingIcon() {
        return this.pvs;
    }

    public PAGTextView getLoadingAppName() {
        return this.icD;
    }

    public PAGProgressBar getLoadingProgressBar() {
        return this.vG;
    }

    public PAGTextView getLoadingProgressNumber() {
        return this.Jd;
    }

    public PAGLogoView getLoadingLogo() {
        return this.NB;
    }

    public PAGLinearLayout getWaveContainer() {
        return this.sUS;
    }

    public TwoSemicirclesView getInnerCircle() {
        return this.yiw;
    }

    public TwoSemicirclesView getOuterCircle() {
        return this.so;
    }
}
