package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* loaded from: classes2.dex */
public class PAGPAGLoadingTwoLayout extends PAGLoadingBaseLayout {
    public PAGPAGLoadingTwoLayout(Context context) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        int icD = Pj.icD(context, 80.0f);
        this.pvs = new TTRoundRectImageView(context);
        this.pvs.setId(520093745);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(icD, icD);
        layoutParams2.topMargin = Pj.icD(context, 15.0f);
        layoutParams2.bottomMargin = Pj.icD(context, 40.0f);
        this.pvs.setLayoutParams(layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(0);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        pAGTextView.setTextColor(Color.parseColor("#FFFFFF"));
        pAGTextView.setTextSize(1, 30.0f);
        pAGTextView.setText("Loading ");
        this.Jd = new PAGTextView(context);
        this.Jd.setId(520093749);
        this.Jd.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.Jd.setTextColor(Color.parseColor("#FFFFFF"));
        this.Jd.setTextSize(1, 30.0f);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        pAGTextView2.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        pAGTextView2.setTextColor(Color.parseColor("#FFFFFF"));
        pAGTextView2.setTextSize(1, 30.0f);
        pAGTextView2.setText("%");
        linearLayout2.addView(pAGTextView);
        linearLayout2.addView(this.Jd);
        linearLayout2.addView(pAGTextView2);
        linearLayout.addView(this.pvs);
        linearLayout.addView(linearLayout2);
        pvs(context);
        addView(this.NB);
        addView(linearLayout);
    }
}
